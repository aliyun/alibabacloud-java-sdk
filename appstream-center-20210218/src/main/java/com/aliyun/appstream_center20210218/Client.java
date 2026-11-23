// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210218;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210218.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "appstream-center";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
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
     * <b>description</b> :
     * <p>When you call this operation, you must provide Resource and specify both ResourceType and ResourceId. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * Before creation, the user must belong to the current calling account and have access permissions for the target cloud desktop. This operation only creates an access token. It does not create a user or add an authorization relationship between the user and the cloud desktop. Each successful call creates a new time-limited token. To obtain an existing token, call GetLatestThirdAppAccessToken and pass the same AuthorizerId and Resource.
     * The unit of Expiration is seconds. Valid values: 1 to 15552000. If omitted, the default value is 15552000, which equals 180 days. Permanent validity is not supported. Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a time-limited static access token for a specified user in the current account to access a single cloud desktop.</p>
     * 
     * @param tmpReq CreateThirdAppAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateThirdAppAccessTokenResponse
     */
    public CreateThirdAppAccessTokenResponse createThirdAppAccessTokenWithOptions(CreateThirdAppAccessTokenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateThirdAppAccessTokenShrinkRequest request = new CreateThirdAppAccessTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resource)) {
            request.resourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resource, "Resource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            body.put("AuthorizerId", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            body.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShrink)) {
            body.put("Resource", request.resourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateThirdAppAccessToken"),
            new TeaPair("version", "2021-02-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateThirdAppAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, you must provide Resource and specify both ResourceType and ResourceId. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * Before creation, the user must belong to the current calling account and have access permissions for the target cloud desktop. This operation only creates an access token. It does not create a user or add an authorization relationship between the user and the cloud desktop. Each successful call creates a new time-limited token. To obtain an existing token, call GetLatestThirdAppAccessToken and pass the same AuthorizerId and Resource.
     * The unit of Expiration is seconds. Valid values: 1 to 15552000. If omitted, the default value is 15552000, which equals 180 days. Permanent validity is not supported. Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a time-limited static access token for a specified user in the current account to access a single cloud desktop.</p>
     * 
     * @param request CreateThirdAppAccessTokenRequest
     * @return CreateThirdAppAccessTokenResponse
     */
    public CreateThirdAppAccessTokenResponse createThirdAppAccessToken(CreateThirdAppAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createThirdAppAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invalidates a Wuying Workspace logon session before it naturally expires.</p>
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
     * <p>Invalidates a Wuying Workspace logon session before it naturally expires.</p>
     * 
     * @param request ExpireLoginTokenRequest
     * @return ExpireLoginTokenResponse
     */
    public ExpireLoginTokenResponse expireLoginToken(ExpireLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.expireLoginTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * @param request GetAuthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCodeWithOptions(GetAuthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            query.put("TokenType", request.tokenType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            body.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            body.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adPassword)) {
            body.put("AdPassword", request.adPassword);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves an authorization code that contains user identity and permission information, which can be used to invoke cloud applications in integration scenarios.</p>
     * 
     * @param request GetAuthCodeRequest
     * @return GetAuthCodeResponse
     */
    public GetAuthCodeResponse getAuthCode(GetAuthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthCodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must provide Resource and specify both ResourceType and ResourceId when calling this operation. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * The AuthorizerId and Resource in the query conditions must be consistent with those used when the token was created. This operation only returns the current valid token for the current account, user, and cloud desktop. It does not create a new token, renew the token, or restore or roll back to a historical token. If no valid token is found, the token has expired, or the corresponding cache has been cleared, AccessToken.NotFound is returned. To obtain a new token, call CreateThirdAppAccessToken.
     * Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the current valid static access token for a specified user and a single cloud desktop under the current account, keeping the original expiration time.</p>
     * 
     * @param tmpReq GetLatestThirdAppAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLatestThirdAppAccessTokenResponse
     */
    public GetLatestThirdAppAccessTokenResponse getLatestThirdAppAccessTokenWithOptions(GetLatestThirdAppAccessTokenRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetLatestThirdAppAccessTokenShrinkRequest request = new GetLatestThirdAppAccessTokenShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resource)) {
            request.resourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resource, "Resource", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizerId)) {
            body.put("AuthorizerId", request.authorizerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceShrink)) {
            body.put("Resource", request.resourceShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestThirdAppAccessToken"),
            new TeaPair("version", "2021-02-18"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestThirdAppAccessTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must provide Resource and specify both ResourceType and ResourceId when calling this operation. Only a single cloud desktop is supported. You cannot omit Resource to authorize or query all cloud desktops.
     * AuthorizerId is the WyId of the user and cannot be replaced by a username. BusinessChannel supports Enterprise and Business. If omitted, the default value is Enterprise.
     * The AuthorizerId and Resource in the query conditions must be consistent with those used when the token was created. This operation only returns the current valid token for the current account, user, and cloud desktop. It does not create a new token, renew the token, or restore or roll back to a historical token. If no valid token is found, the token has expired, or the corresponding cache has been cleared, AccessToken.NotFound is returned. To obtain a new token, call CreateThirdAppAccessToken.
     * Keep the returned AccessToken secure and avoid displaying the full token in logs or public content.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the current valid static access token for a specified user and a single cloud desktop under the current account, keeping the original expiration time.</p>
     * 
     * @param request GetLatestThirdAppAccessTokenRequest
     * @return GetLatestThirdAppAccessTokenResponse
     */
    public GetLatestThirdAppAccessTokenResponse getLatestThirdAppAccessToken(GetLatestThirdAppAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLatestThirdAppAccessTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a Wuying STS token (temporary identity credential).</p>
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
     * <p>Retrieves a Wuying STS token (temporary identity credential).</p>
     * 
     * @param request GetStsTokenRequest
     * @return GetStsTokenResponse
     */
    public GetStsTokenResponse getStsToken(GetStsTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStsTokenWithOptions(request, runtime);
    }
}
