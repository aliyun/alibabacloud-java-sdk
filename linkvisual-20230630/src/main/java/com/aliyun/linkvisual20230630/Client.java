// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20230630;

import com.aliyun.tea.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkvisual.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkvisual.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkvisual.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkvisual.aliyuncs.com"),
            new TeaPair("me-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkvisual.aliyuncs.com"),
            new TeaPair("us-east-1", "linkvisual.aliyuncs.com"),
            new TeaPair("us-west-1", "linkvisual.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkvisual", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
