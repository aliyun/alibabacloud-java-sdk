// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0;

import com.aliyun.tea.*;
import com.aliyun.aligenieoauth2_1_0.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aligenie", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>创建播放列表</p>
     * 
     * @param tmpReq CreatePlayingListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePlayingListResponse
     */
    public CreatePlayingListResponse createPlayingListWithOptions(CreatePlayingListRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePlayingListShrinkRequest request = new CreatePlayingListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openCreatePlayingListRequest)) {
            request.openCreatePlayingListRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openCreatePlayingListRequest, "OpenCreatePlayingListRequest", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openCreatePlayingListRequestShrink)) {
            body.put("OpenCreatePlayingListRequest", request.openCreatePlayingListRequestShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlayingList"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/content/playing/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePlayingListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建播放列表</p>
     * 
     * @param request CreatePlayingListRequest
     * @return CreatePlayingListResponse
     */
    public CreatePlayingListResponse createPlayingList(CreatePlayingListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPlayingListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行场景</p>
     * 
     * @param request ExecuteSceneRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSceneResponse
     */
    public ExecuteSceneResponse executeSceneWithOptions(ExecuteSceneRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("SceneId", request.sceneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteScene"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/iot/scene/execute"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSceneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>执行场景</p>
     * 
     * @param request ExecuteSceneRequest
     * @return ExecuteSceneResponse
     */
    public ExecuteSceneResponse executeScene(ExecuteSceneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeSceneWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSceneListResponse
     */
    public GetSceneListResponse getSceneListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSceneList"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/iot/scene/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSceneListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取场景列表</p>
     * @return GetSceneListResponse
     */
    public GetSceneListResponse getSceneList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSceneListWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserBasicInfoResponse
     */
    public GetUserBasicInfoResponse getUserBasicInfoWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserBasicInfo"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/users/basic"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取</p>
     * @return GetUserBasicInfoResponse
     */
    public GetUserBasicInfoResponse getUserBasicInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserBasicInfoWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取天猫精灵用户绑定的手机号</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserPhoneResponse
     */
    public GetUserPhoneResponse getUserPhoneWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPhone"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/user/profile/phone"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPhoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取天猫精灵用户绑定的手机号</p>
     * @return GetUserPhoneResponse
     */
    public GetUserPhoneResponse getUserPhone() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getUserPhoneWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OAuth2令牌撤销端点</p>
     * 
     * @param request OAuth2RevocationEndpointRequest
     * @param headers OAuth2RevocationEndpointHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OAuth2RevocationEndpointResponse
     */
    public OAuth2RevocationEndpointResponse oAuth2RevocationEndpointWithOptions(OAuth2RevocationEndpointRequest request, OAuth2RevocationEndpointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenTypeHint)) {
            body.put("TokenTypeHint", request.tokenTypeHint);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OAuth2RevocationEndpoint"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OAuth2RevocationEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OAuth2令牌撤销端点</p>
     * 
     * @param request OAuth2RevocationEndpointRequest
     * @return OAuth2RevocationEndpointResponse
     */
    public OAuth2RevocationEndpointResponse oAuth2RevocationEndpoint(OAuth2RevocationEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OAuth2RevocationEndpointHeaders headers = new OAuth2RevocationEndpointHeaders();
        return this.oAuth2RevocationEndpointWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>OAuth2令牌端点</p>
     * 
     * @param request OAuth2TokenEndpointRequest
     * @param headers OAuth2TokenEndpointHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OAuth2TokenEndpointResponse
     */
    public OAuth2TokenEndpointResponse oAuth2TokenEndpointWithOptions(OAuth2TokenEndpointRequest request, OAuth2TokenEndpointHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            body.put("GrantType", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUri)) {
            body.put("RedirectUri", request.redirectUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            body.put("RefreshToken", request.refreshToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAligenieAccessToken)) {
            realHeaders.put("x-acs-aligenie-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAligenieAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OAuth2TokenEndpoint"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OAuth2TokenEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>OAuth2令牌端点</p>
     * 
     * @param request OAuth2TokenEndpointRequest
     * @return OAuth2TokenEndpointResponse
     */
    public OAuth2TokenEndpointResponse oAuth2TokenEndpoint(OAuth2TokenEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OAuth2TokenEndpointHeaders headers = new OAuth2TokenEndpointHeaders();
        return this.oAuth2TokenEndpointWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>推送设备通知</p>
     * 
     * @param tmpReq PushDeviceNotificationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDeviceNotificationResponse
     */
    public PushDeviceNotificationResponse pushDeviceNotificationWithOptions(PushDeviceNotificationRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushDeviceNotificationShrinkRequest request = new PushDeviceNotificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tenantInfo)) {
            request.tenantInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tenantInfo, "TenantInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tenantInfoShrink)) {
            body.put("TenantInfo", request.tenantInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bodyShrink)) {
            body.put("body", request.bodyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDeviceNotification"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/device/notification/push"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDeviceNotificationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>推送设备通知</p>
     * 
     * @param request PushDeviceNotificationRequest
     * @return PushDeviceNotificationResponse
     */
    public PushDeviceNotificationResponse pushDeviceNotification(PushDeviceNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDeviceNotificationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备列表</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDeviceListResponse
     */
    public QueryDeviceListResponse queryDeviceListWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDeviceList"),
            new TeaPair("version", "oauth2_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/oauth2/device/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备列表</p>
     * @return QueryDeviceListResponse
     */
    public QueryDeviceListResponse queryDeviceList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDeviceListWithOptions(headers, runtime);
    }
}
