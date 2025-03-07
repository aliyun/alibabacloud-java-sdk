// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianchatbot20241105;

import com.aliyun.tea.*;
import com.aliyun.bailianchatbot20241105.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bailianchatbot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>SSE问答接口</p>
     * 
     * @param request SseChatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SseChatResponse
     */
    public SseChatResponse sseChatWithOptions(SseChatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.command)) {
            query.put("Command", request.command);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderId)) {
            query.put("SenderId", request.senderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.senderNick)) {
            query.put("SenderNick", request.senderNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utterance)) {
            query.put("Utterance", request.utterance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vendorParam)) {
            query.put("VendorParam", request.vendorParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SseChat"),
            new TeaPair("version", "2024-11-05"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SseChatResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SseChatResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>SSE问答接口</p>
     * 
     * @param request SseChatRequest
     * @return SseChatResponse
     */
    public SseChatResponse sseChat(SseChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sseChatWithOptions(request, runtime);
    }
}
