package com.example.volleytest;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;

import com.example.volleytest.adapter.MListAdapter;
import com.example.volleytest.bean.Info;

public class MainActivity extends Activity {
	private ListView mListView;
	private ArrayList<Info> infos;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mListView  = (ListView) findViewById(R.id.listView);
        initData();
        MListAdapter adapter = new MListAdapter(this,infos);
        mListView.setAdapter(adapter);
    }


    private void initData() {
    	infos = new ArrayList<Info>();
		Info info1 = new Info("http://183.61.244.2:10001/201309/041159338pn9.png");
		Info info2 = new Info("http://b.hiphotos.baidu.com/pic/w%3D310%3Bq%3D75/sign=3487116b21a446237ecaa363a8190333/960a304e251f95ca886df9a7c8177f3e67095202.jpg");
		Info info3 = new Info("http://h.hiphotos.baidu.com/pic/w%3D310%3Bq%3D75/sign=270625cd55e736d158138a09ab6b3eff/b219ebc4b74543a91d2e91dd1f178a82b90114ed.jpg");
		Info info4 = new Info("http://d.hiphotos.baidu.com/pic/w%3D310%3Bq%3D75/sign=c4e657acb999a9013b355d372dae7b46/2cf5e0fe9925bc3187b68a205fdf8db1ca13709b.jpg");
		Info info5 = new Info("http://f.hiphotos.baidu.com/pic/w%3D310%3Bq%3D75/sign=3b84b03b0e2442a7ae0efba4e178dc76/5243fbf2b211931315ab750864380cd790238d9a.jpg");
		Info info6 = new Info("http://a.hiphotos.baidu.com/pic/w%3D310%3Bq%3D75/sign=a7ef8ba306082838680dda1588a2d83c/8d5494eef01f3a29ad65f5729825bc315d607cd8.jpg");
		Info info7 = new Info("http://t12.baidu.com/it/u=2838421217,1863899993&fm=59");
		Info info8 = new Info("http://t11.baidu.com/it/u=2797897195,1736258644&fm=59");
		Info info9 = new Info("http://t10.baidu.com/it/u=1018809033,832345904&fm=59");
		Info info10 = new Info("http://t10.baidu.com/it/u=174016677,1352439750&fm=21&gp=0.jpg");
		Info info11 = new Info("http://t12.baidu.com/it/u=4091564049,1489376184&fm=21&gp=0.jpg");
		Info info12 = new Info("http://t10.baidu.com/it/u=1100623869,4204395004&fm=21&gp=0.jpg");
		Info info13 = new Info("http://t1.baidu.com/it/u=1056371831,1157258281&fm=21&gp=0.jpg");
		Info info14 = new Info("http://t3.baidu.com/it/u=2314615246,3339900002&fm=21&gp=0.jpg");
		Info info15 = new Info("http://t11.baidu.com/it/u=2797897195,1736258644&fm=59");
		Info info16 = new Info("http://t11.baidu.com/it/u=1244342545,3206692468&fm=59");
		infos.add(info1);
		infos.add(info2);
		infos.add(info3);
		infos.add(info4);
		infos.add(info5);
		infos.add(info6);
		infos.add(info7);
		infos.add(info8);
		infos.add(info9);
		infos.add(info10);
		infos.add(info11);
		infos.add(info12);
		infos.add(info13);
		infos.add(info14);
		infos.add(info15);
		infos.add(info16);
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
	
    
}
