// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.indvi20190701;

import com.aliyun.tea.*;
import com.aliyun.indvi20190701.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "indvi.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "indvi.aliyuncs.com"),
            new TeaPair("ap-south-1", "indvi.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "indvi.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "indvi.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "indvi.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "indvi.aliyuncs.com"),
            new TeaPair("cn-beijing", "indvi.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "indvi.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-chengdu", "indvi.aliyuncs.com"),
            new TeaPair("cn-edge-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-fujian", "indvi.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "indvi.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "indvi.aliyuncs.com"),
            new TeaPair("cn-hongkong", "indvi.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "indvi.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "indvi.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-qingdao", "indvi.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "indvi.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "indvi.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "indvi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "indvi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "indvi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "indvi.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-wuhan", "indvi.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "indvi.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "indvi.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "indvi.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "indvi.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "indvi.aliyuncs.com"),
            new TeaPair("eu-central-1", "indvi.aliyuncs.com"),
            new TeaPair("eu-west-1", "indvi.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "indvi.aliyuncs.com"),
            new TeaPair("me-east-1", "indvi.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "indvi.aliyuncs.com"),
            new TeaPair("us-east-1", "indvi.aliyuncs.com"),
            new TeaPair("us-west-1", "indvi.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("indvi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetDetectionResultResponse getDetectionResultWithOptions(GetDetectionResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.detectPath)) {
            query.put("DetectPath", request.detectPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformType)) {
            query.put("PlatformType", request.platformType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDetectionResult"),
            new TeaPair("version", "2019-07-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDetectionResultResponse());
    }

    public GetDetectionResultResponse getDetectionResult(GetDetectionResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectionResultWithOptions(request, runtime);
    }
}
