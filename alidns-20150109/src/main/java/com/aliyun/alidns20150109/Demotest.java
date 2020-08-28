package com.aliyun.alidns20150109;

import com.aliyun.alidns20150109.models.DescribeDomainNsRequest;
import com.aliyun.tearpc.models.Config;
import com.aliyun.teautil.models.RuntimeOptions;

public class Demotest {
    public static void main(String[] args) throws Exception{
        Config config = new Config();
        config.accessKeyId = "a";
        config.accessKeySecret = "b";
        config.endpoint = "ecs.aliyuncs.com";
        Client client = new Client(config);
        DescribeDomainNsRequest request = new DescribeDomainNsRequest();
        request.domainName = " ";
        client.describeDomainNs(request);
    }
}
