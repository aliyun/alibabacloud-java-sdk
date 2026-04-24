// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.companyreg20260423;

import com.aliyun.tea.*;
import com.aliyun.companyreg20260423.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "companyreg.aliyuncs.com"),
            new TeaPair("ap-south-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "companyreg.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-chengdu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-edge-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-fujian", "companyreg.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong", "companyreg.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "companyreg.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao", "companyreg.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wuhan", "companyreg.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "companyreg.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "companyreg.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-central-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1", "companyreg.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "companyreg.aliyuncs.com"),
            new TeaPair("me-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "companyreg.aliyuncs.com"),
            new TeaPair("us-east-1", "companyreg.aliyuncs.com"),
            new TeaPair("us-west-1", "companyreg.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("companyreg", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>查询已备案信息</p>
     * 
     * @param request QuerySuccessIcpDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySuccessIcpDataResponse
     */
    public QuerySuccessIcpDataResponse querySuccessIcpDataWithOptions(QuerySuccessIcpDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.caller)) {
            query.put("Caller", request.caller);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySuccessIcpData"),
            new TeaPair("version", "2026-04-23"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySuccessIcpDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询已备案信息</p>
     * 
     * @param request QuerySuccessIcpDataRequest
     * @return QuerySuccessIcpDataResponse
     */
    public QuerySuccessIcpDataResponse querySuccessIcpData(QuerySuccessIcpDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySuccessIcpDataWithOptions(request, runtime);
    }
}
