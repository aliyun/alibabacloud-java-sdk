package com.aliyun.imagerecog20190930;

import com.aliyun.imagerecog20190930.models.TaggingImageRequest;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

public class DemoTest {
    public static void main(String[] args) throws Exception{
        Config config = new Config();
        config.accessKeyId = "a";
        config.accessKeySecret = "b";
        config.endpoint = "e";
        Client client = new Client(config);
        TaggingImageRequest request = new TaggingImageRequest();
        request.imageURL = "e";
        client.taggingImage(request, new RuntimeOptions());
    }
}
