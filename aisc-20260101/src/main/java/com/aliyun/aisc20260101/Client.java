// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisc20260101;

import com.aliyun.tea.*;
import com.aliyun.aisc20260101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aisc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>批量发起用户自定义Skill检测</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheckWithOptions(CreateSkillFileCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.files)) {
            query.put("Files", request.files);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSkillFileCheck"),
            new TeaPair("version", "2026-01-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSkillFileCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量发起用户自定义Skill检测</p>
     * 
     * @param request CreateSkillFileCheckRequest
     * @return CreateSkillFileCheckResponse
     */
    public CreateSkillFileCheckResponse createSkillFileCheck(CreateSkillFileCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSkillFileCheckWithOptions(request, runtime);
    }
}
