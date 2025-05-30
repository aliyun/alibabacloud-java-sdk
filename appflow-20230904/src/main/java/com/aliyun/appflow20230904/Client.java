// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appflow20230904;

import com.aliyun.tea.*;
import com.aliyun.appflow20230904.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appflow", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Generate Login Session Token</p>
     * 
     * @param request GenerateUserSessionTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUserSessionTokenResponse
     */
    public GenerateUserSessionTokenResponse generateUserSessionTokenWithOptions(GenerateUserSessionTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chatbotId)) {
            query.put("ChatbotId", request.chatbotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireSecond)) {
            query.put("ExpireSecond", request.expireSecond);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integrateId)) {
            query.put("IntegrateId", request.integrateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAvatar)) {
            query.put("UserAvatar", request.userAvatar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUserSessionToken"),
            new TeaPair("version", "2023-09-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUserSessionTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generate Login Session Token</p>
     * 
     * @param request GenerateUserSessionTokenRequest
     * @return GenerateUserSessionTokenResponse
     */
    public GenerateUserSessionTokenResponse generateUserSessionToken(GenerateUserSessionTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUserSessionTokenWithOptions(request, runtime);
    }
}
