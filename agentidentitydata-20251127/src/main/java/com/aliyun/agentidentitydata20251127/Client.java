// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127;

import com.aliyun.tea.*;
import com.aliyun.agentidentitydata20251127.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentidentitydata", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request AssumeRoleForWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssumeRoleForWorkloadIdentityResponse
     */
    public AssumeRoleForWorkloadIdentityResponse assumeRoleForWorkloadIdentityWithOptions(AssumeRoleForWorkloadIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.durationSeconds)) {
            body.put("DurationSeconds", request.durationSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            body.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleSessionName)) {
            body.put("RoleSessionName", request.roleSessionName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadAccessToken)) {
            body.put("WorkloadAccessToken", request.workloadAccessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssumeRoleForWorkloadIdentity"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doRPCRequest(params.action, params.version, params.protocol, params.method, params.authType, params.bodyType, req, runtime), new AssumeRoleForWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request AssumeRoleForWorkloadIdentityRequest
     * @return AssumeRoleForWorkloadIdentityResponse
     */
    public AssumeRoleForWorkloadIdentityResponse assumeRoleForWorkloadIdentity(AssumeRoleForWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assumeRoleForWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>确认用户授权会话已完成</p>
     * 
     * @param tmpReq CompleteResourceTokenAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CompleteResourceTokenAuthResponse
     */
    public CompleteResourceTokenAuthResponse completeResourceTokenAuthWithOptions(CompleteResourceTokenAuthRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CompleteResourceTokenAuthShrinkRequest request = new CompleteResourceTokenAuthShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userIdentifier)) {
            request.userIdentifierShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userIdentifier, "UserIdentifier", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionURI)) {
            body.put("SessionURI", request.sessionURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentifierShrink)) {
            body.put("UserIdentifier", request.userIdentifierShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CompleteResourceTokenAuth"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CompleteResourceTokenAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>确认用户授权会话已完成</p>
     * 
     * @param request CompleteResourceTokenAuthRequest
     * @return CompleteResourceTokenAuthResponse
     */
    public CompleteResourceTokenAuthResponse completeResourceTokenAuth(CompleteResourceTokenAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.completeResourceTokenAuthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取下游资源的 API 密钥</p>
     * 
     * @param request GetResourceAPIKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceAPIKeyResponse
     */
    public GetResourceAPIKeyResponse getResourceAPIKeyWithOptions(GetResourceAPIKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceCredentialProviderName)) {
            body.put("ResourceCredentialProviderName", request.resourceCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadAccessToken)) {
            body.put("WorkloadAccessToken", request.workloadAccessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceAPIKey"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceAPIKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取下游资源的 API 密钥</p>
     * 
     * @param request GetResourceAPIKeyRequest
     * @return GetResourceAPIKeyResponse
     */
    public GetResourceAPIKeyResponse getResourceAPIKey(GetResourceAPIKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceAPIKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取下游资源的 OAuth 2.0 访问令牌</p>
     * 
     * @param tmpReq GetResourceOAuth2TokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceOAuth2TokenResponse
     */
    public GetResourceOAuth2TokenResponse getResourceOAuth2TokenWithOptions(GetResourceOAuth2TokenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetResourceOAuth2TokenShrinkRequest request = new GetResourceOAuth2TokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.customParameters)) {
            request.customParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.customParameters, "CustomParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scopes)) {
            request.scopesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scopes, "Scopes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customParametersShrink)) {
            body.put("CustomParameters", request.customParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customState)) {
            body.put("CustomState", request.customState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceAuthentication)) {
            body.put("ForceAuthentication", request.forceAuthentication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2Flow)) {
            body.put("OAuth2Flow", request.OAuth2Flow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceCredentialProviderName)) {
            body.put("ResourceCredentialProviderName", request.resourceCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOAuth2ReturnURL)) {
            body.put("ResourceOAuth2ReturnURL", request.resourceOAuth2ReturnURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopesShrink)) {
            body.put("Scopes", request.scopesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionURI)) {
            body.put("SessionURI", request.sessionURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadAccessToken)) {
            body.put("WorkloadAccessToken", request.workloadAccessToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceOAuth2Token"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceOAuth2TokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取下游资源的 OAuth 2.0 访问令牌</p>
     * 
     * @param request GetResourceOAuth2TokenRequest
     * @return GetResourceOAuth2TokenResponse
     */
    public GetResourceOAuth2TokenResponse getResourceOAuth2Token(GetResourceOAuth2TokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceOAuth2TokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadAccessTokenResponse
     */
    public GetWorkloadAccessTokenResponse getWorkloadAccessTokenWithOptions(GetWorkloadAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkloadAccessToken"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadAccessTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenRequest
     * @return GetWorkloadAccessTokenResponse
     */
    public GetWorkloadAccessTokenResponse getWorkloadAccessToken(GetWorkloadAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenForJWTRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadAccessTokenForJWTResponse
     */
    public GetWorkloadAccessTokenForJWTResponse getWorkloadAccessTokenForJWTWithOptions(GetWorkloadAccessTokenForJWTRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userToken)) {
            body.put("UserToken", request.userToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkloadAccessTokenForJWT"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadAccessTokenForJWTResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenForJWTRequest
     * @return GetWorkloadAccessTokenForJWTResponse
     */
    public GetWorkloadAccessTokenForJWTResponse getWorkloadAccessTokenForJWT(GetWorkloadAccessTokenForJWTRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadAccessTokenForJWTWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenForUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadAccessTokenForUserIdResponse
     */
    public GetWorkloadAccessTokenForUserIdResponse getWorkloadAccessTokenForUserIdWithOptions(GetWorkloadAccessTokenForUserIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkloadAccessTokenForUserId"),
            new TeaPair("version", "2025-11-27"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadAccessTokenForUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取工作负载访问令牌</p>
     * 
     * @param request GetWorkloadAccessTokenForUserIdRequest
     * @return GetWorkloadAccessTokenForUserIdResponse
     */
    public GetWorkloadAccessTokenForUserIdResponse getWorkloadAccessTokenForUserId(GetWorkloadAccessTokenForUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadAccessTokenForUserIdWithOptions(request, runtime);
    }
}
