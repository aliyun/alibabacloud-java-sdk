// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210218.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appstream-center", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>登录token主动失效</p>
     * 
     * @param request ExpireLoginTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExpireLoginTokenResponse
     */
    public ExpireLoginTokenResponse expireLoginTokenWithOptions(ExpireLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            body.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            body.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExpireLoginToken"),
            new TeaPair("version", "2021-02-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExpireLoginTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>登录token主动失效</p>
     * 
     * @param request ExpireLoginTokenRequest
     * @return ExpireLoginTokenResponse
     */
    public ExpireLoginTokenResponse expireLoginToken(ExpireLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.expireLoginTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权码</p>
     * 
     * @param request GetAuthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCodeWithOptions(GetAuthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateUser)) {
            body.put("AutoCreateUser", request.autoCreateUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalUserId)) {
            body.put("ExternalUserId", request.externalUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthCode"),
            new TeaPair("version", "2021-02-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取授权码</p>
     * 
     * @param request GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCode(GetAuthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取stsToken</p>
     * 
     * @param request GetStsTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStsTokenResponse
     */
    public GetStsTokenResponse getStsTokenWithOptions(GetStsTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            body.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalId)) {
            body.put("ExternalId", request.externalId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStsToken"),
            new TeaPair("version", "2021-02-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStsTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取stsToken</p>
     * 
     * @param request GetStsTokenRequest
     * @return GetStsTokenResponse
     */
    public GetStsTokenResponse getStsToken(GetStsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStsTokenWithOptions(request, runtime);
    }
}
