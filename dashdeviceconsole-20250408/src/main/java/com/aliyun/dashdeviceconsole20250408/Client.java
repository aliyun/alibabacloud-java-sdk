// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dashdeviceconsole20250408;

import com.aliyun.tea.*;
import com.aliyun.dashdeviceconsole20250408.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dashdeviceconsole", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>get prompt</p>
     * 
     * @param request GetPromptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPromptResponse
     */
    public GetPromptResponse getPromptWithOptions(GetPromptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPrompt"),
            new TeaPair("version", "2025-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prompt/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetPromptResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetPromptResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>get prompt</p>
     * 
     * @param request GetPromptRequest
     * @return GetPromptResponse
     */
    public GetPromptResponse getPrompt(GetPromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPromptWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>push prompt</p>
     * 
     * @param request PushPromptRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushPromptResponse
     */
    public PushPromptResponse pushPromptWithOptions(PushPromptRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("groupId", request.groupId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.promptContent)) {
            body.put("promptContent", request.promptContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushPrompt"),
            new TeaPair("version", "2025-04-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/prompt/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new PushPromptResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new PushPromptResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>push prompt</p>
     * 
     * @param request PushPromptRequest
     * @return PushPromptResponse
     */
    public PushPromptResponse pushPrompt(PushPromptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushPromptWithOptions(request, headers, runtime);
    }
}
