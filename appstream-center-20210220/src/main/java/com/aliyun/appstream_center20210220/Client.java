// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210220;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210220.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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
     * <p>身份认证查询接口</p>
     * 
     * @param request FindIdpListByLoginIdentifierRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindIdpListByLoginIdentifierResponse
     */
    public FindIdpListByLoginIdentifierResponse findIdpListByLoginIdentifierWithOptions(FindIdpListByLoginIdentifierRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientChannel)) {
            body.put("ClientChannel", request.clientChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            body.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            body.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            body.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginIdentifier)) {
            body.put("LoginIdentifier", request.loginIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportTypes)) {
            body.put("SupportTypes", request.supportTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            body.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindIdpListByLoginIdentifier"),
            new TeaPair("version", "2021-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindIdpListByLoginIdentifierResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>身份认证查询接口</p>
     * 
     * @param request FindIdpListByLoginIdentifierRequest
     * @return FindIdpListByLoginIdentifierResponse
     */
    public FindIdpListByLoginIdentifierResponse findIdpListByLoginIdentifier(FindIdpListByLoginIdentifierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.findIdpListByLoginIdentifierWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetLoginToken</p>
     * 
     * @param request GetLoginTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginTokenResponse
     */
    public GetLoginTokenResponse getLoginTokenWithOptions(GetLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationCode)) {
            query.put("AuthenticationCode", request.authenticationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientOS)) {
            query.put("ClientOS", request.clientOS);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentStage)) {
            query.put("CurrentStage", request.currentStage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedFingerPrintData)) {
            query.put("EncryptedFingerPrintData", request.encryptedFingerPrintData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedKey)) {
            query.put("EncryptedKey", request.encryptedKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptedPassword)) {
            query.put("EncryptedPassword", request.encryptedPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fingerPrintData)) {
            query.put("FingerPrintData", request.fingerPrintData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpId)) {
            query.put("IdpId", request.idpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAlive)) {
            query.put("KeepAlive", request.keepAlive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAliveToken)) {
            query.put("KeepAliveToken", request.keepAliveToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginIdentifier)) {
            query.put("LoginIdentifier", request.loginIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginName)) {
            query.put("LoginName", request.loginName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            query.put("NewPassword", request.newPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldPassword)) {
            query.put("OldPassword", request.oldPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneVerifyCode)) {
            query.put("PhoneVerifyCode", request.phoneVerifyCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoExtendsCookies)) {
            query.put("SsoExtendsCookies", request.ssoExtendsCookies);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoSessionToken)) {
            query.put("SsoSessionToken", request.ssoSessionToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenCode)) {
            query.put("TokenCode", request.tokenCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.umidToken)) {
            query.put("UmidToken", request.umidToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginToken"),
            new TeaPair("version", "2021-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetLoginToken</p>
     * 
     * @param request GetLoginTokenRequest
     * @return GetLoginTokenResponse
     */
    public GetLoginTokenResponse getLoginToken(GetLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginTokenWithOptions(request, runtime);
    }

    /**
     * @param request RefreshLoginTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshLoginTokenResponse
     */
    public RefreshLoginTokenResponse refreshLoginTokenWithOptions(RefreshLoginTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientType)) {
            query.put("ClientType", request.clientType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginIdentifier)) {
            query.put("LoginIdentifier", request.loginIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginToken)) {
            query.put("LoginToken", request.loginToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.profileRegion)) {
            query.put("ProfileRegion", request.profileRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshLoginToken"),
            new TeaPair("version", "2021-02-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshLoginTokenResponse());
    }

    /**
     * @param request RefreshLoginTokenRequest
     * @return RefreshLoginTokenResponse
     */
    public RefreshLoginTokenResponse refreshLoginToken(RefreshLoginTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshLoginTokenWithOptions(request, runtime);
    }
}
