package com.aliyun.cs20151215;

import com.aliyun.cs20151215.models.DeleteClusterRequest;
import com.aliyun.tearoa.models.Config;

public class DemoTest {
    public static void main(String[] args) throws Exception {
        Config config = new Config();
        config.accessKeyId = "STS.NTJRMMQWcG61TKLuip5rurAbe";
        config.accessKeySecret = "3YUBX4CrUbgv3aJ6Pay4jRXscSYRasjzzFRd91cvmzLH";
        config.securityToken = "CAIS9QF1q6Ft5B2yfSjIr5f/Gff5vIhC8PTaVm39kWklOf1ZnYTJhzz2IH5EeXZsCeodv/wxnWpT7PcelqN6T55OSHvYYNBstgbbDOd1Jdivgde8yJBZor/HcDHhJnyW9cvWZPqDP7G5U/yxalfCuzZuyL/hD1uLVECkNpv74vwOLK5gPG+CYCFBGc1dKyZ7tcYeLgGxD/u2NQPwiWeiZygB+CgE0DgltPTjnZDGsUaB0QyrmtV4/dqhfsKWCOB3J4p6XtuP2+h7S7HMyiY46WIRqvcr0/AUo2yW5o/EWQILskmcV/bZ6cEqIwg8fK8+Fr6yQDdhYy690BqAAVh63obMpjPsU3Jnm7CWHIhKh7inubyaLDCvjqNoHqmMobWrYOHF+XJul2ll9fwpmrNCKVmbgWD8nyR3kSB+vrcGemlwgJAToGBT3mOX/TWM1r5csNC8SG9XxLuxbpHgp9fJvVnyqHyxuz1HMpM32yt2DxYMm0d/Wnd7q/zxn3hi";
        config.regionId = "cn-hangzhou";
        config.endpoint = "cs.aliyuncs.com";
        Client client = new Client(config);
        DeleteClusterRequest request = new DeleteClusterRequest();
        client.deleteCluster("test", request);
    }
}
