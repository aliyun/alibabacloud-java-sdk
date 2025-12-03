// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709;

import com.aliyun.tea.*;
import com.aliyun.ciomarketpop20250709.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ciomarketpop", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>全员营销</p>
     * 
     * @param request GetEveryOneSellsFormListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEveryOneSellsFormListResponse
     */
    public GetEveryOneSellsFormListResponse getEveryOneSellsFormListWithOptions(GetEveryOneSellsFormListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEveryOneSellsFormList"),
            new TeaPair("version", "2025-07-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "array")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new GetEveryOneSellsFormListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>全员营销</p>
     * 
     * @param request GetEveryOneSellsFormListRequest
     * @return GetEveryOneSellsFormListResponse
     */
    public GetEveryOneSellsFormListResponse getEveryOneSellsFormList(GetEveryOneSellsFormListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEveryOneSellsFormListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送钉钉消息</p>
     * 
     * @param tmpReq PushEveryOneSellMsgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushEveryOneSellMsgResponse
     */
    public PushEveryOneSellMsgResponse pushEveryOneSellMsgWithOptions(PushEveryOneSellMsgRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushEveryOneSellMsgShrinkRequest request = new PushEveryOneSellMsgShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dingIdList)) {
            request.dingIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dingIdList, "DingIdList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dingIdListShrink)) {
            body.put("DingIdList", request.dingIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushMsg)) {
            body.put("PushMsg", request.pushMsg);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushType)) {
            body.put("PushType", request.pushType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushEveryOneSellMsg"),
            new TeaPair("version", "2025-07-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "string")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new PushEveryOneSellMsgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送钉钉消息</p>
     * 
     * @param request PushEveryOneSellMsgRequest
     * @return PushEveryOneSellMsgResponse
     */
    public PushEveryOneSellMsgResponse pushEveryOneSellMsg(PushEveryOneSellMsgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushEveryOneSellMsgWithOptions(request, runtime);
    }
}
