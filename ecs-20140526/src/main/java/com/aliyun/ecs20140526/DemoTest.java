package com.aliyun.ecs20140526;

import com.aliyun.ecs20140526.models.DescribeRegionsRequest;
import com.aliyun.ecs20140526.models.DescribeRegionsResponse;
import com.aliyun.tearpc.models.Config;

public class DemoTest {
    public static void main(String[] args) throws Exception{
        Config config = new Config();
        config.accessKeyId = System.getenv("RAMAccessKeyId");
        config.accessKeySecret = System.getenv("RAMAccessKeySecret");
        config.endpoint = "ecs.aliyuncs.com";
        Client client = new Client(config);
        DescribeRegionsRequest regionsRequest = new DescribeRegionsRequest();
        DescribeRegionsResponse regionsResponse = client.describeRegions(regionsRequest);
    }
}
