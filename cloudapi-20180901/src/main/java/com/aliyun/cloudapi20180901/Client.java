// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180901;

import com.aliyun.tea.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "apigateway.cn-qingdao.aliyuncs.com"),
            new TeaPair("cn-beijing", "apigateway.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "apigateway.cn-zhangjiakou.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "apigateway.cn-huhehaote.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "apigateway.cn-wulanchabu.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "apigateway.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-shanghai", "apigateway.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "apigateway.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-heyuan", "apigateway.cn-heyuan.aliyuncs.com"),
            new TeaPair("cn-guangzhou", "apigateway.cn-guangzhou.aliyuncs.com"),
            new TeaPair("cn-chengdu", "apigateway.cn-chengdu.aliyuncs.com"),
            new TeaPair("cn-hongkong", "apigateway.cn-hongkong.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "apigateway.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "apigateway.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "apigateway.ap-southeast-2.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "apigateway.ap-southeast-3.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "apigateway.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-6", "apigateway.ap-southeast-6.aliyuncs.com"),
            new TeaPair("ap-southeast-7", "apigateway.ap-southeast-7.aliyuncs.com"),
            new TeaPair("us-east-1", "apigateway.us-east-1.aliyuncs.com"),
            new TeaPair("us-west-1", "apigateway.us-west-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "apigateway.eu-west-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "apigateway.eu-central-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "apigateway.ap-south-1.aliyuncs.com"),
            new TeaPair("me-east-1", "apigateway.me-east-1.aliyuncs.com"),
            new TeaPair("me-central-1", "apigateway.me-central-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "apigateway.cn-hangzhou-finance.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "apigateway.cn-shanghai-finance-1.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "apigateway.cn-shenzhen-finance-1.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "apigateway.cn-north-2-gov-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "apigateway.cn-beijing-finance-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-edge-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-fujian", "apigateway.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "apigateway.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "apigateway.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "apigateway.cn-shanghai-inner.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-wuhan", "apigateway.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "apigateway.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "apigateway.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "apigateway.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "apigateway.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
