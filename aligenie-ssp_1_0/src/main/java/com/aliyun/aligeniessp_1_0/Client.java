// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0;

import com.aliyun.tea.*;
import com.aliyun.aligeniessp_1_0.models.*;

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
     * <p>收藏/取消收藏</p>
     * 
     * @param tmpReq AddAndRemoveFavoriteContentRequest
     * @param headers AddAndRemoveFavoriteContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAndRemoveFavoriteContentResponse
     */
    public AddAndRemoveFavoriteContentResponse addAndRemoveFavoriteContentWithOptions(AddAndRemoveFavoriteContentRequest tmpReq, AddAndRemoveFavoriteContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddAndRemoveFavoriteContentShrinkRequest request = new AddAndRemoveFavoriteContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openAddAndRemoveFavoriteContentRequest)) {
            request.openAddAndRemoveFavoriteContentRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openAddAndRemoveFavoriteContentRequest, "OpenAddAndRemoveFavoriteContentRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openAddAndRemoveFavoriteContentRequestShrink)) {
            body.put("OpenAddAndRemoveFavoriteContentRequest", request.openAddAndRemoveFavoriteContentRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAndRemoveFavoriteContent"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/AddAndRemoveFavoriteContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAndRemoveFavoriteContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>收藏/取消收藏</p>
     * 
     * @param request AddAndRemoveFavoriteContentRequest
     * @return AddAndRemoveFavoriteContentResponse
     */
    public AddAndRemoveFavoriteContentResponse addAndRemoveFavoriteContent(AddAndRemoveFavoriteContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddAndRemoveFavoriteContentHeaders headers = new AddAndRemoveFavoriteContentHeaders();
        return this.addAndRemoveFavoriteContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新增订阅</p>
     * 
     * @param tmpReq AddSubRequest
     * @param headers AddSubHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSubResponse
     */
    public AddSubResponse addSubWithOptions(AddSubRequest tmpReq, AddSubHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSubShrinkRequest request = new AddSubShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addSubscriptionInfoRequest)) {
            request.addSubscriptionInfoRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addSubscriptionInfoRequest, "AddSubscriptionInfoRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addSubscriptionInfoRequestShrink)) {
            query.put("AddSubscriptionInfoRequest", request.addSubscriptionInfoRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSub"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/addSub"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSubResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新增订阅</p>
     * 
     * @param request AddSubRequest
     * @return AddSubResponse
     */
    public AddSubResponse addSub(AddSubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddSubHeaders headers = new AddSubHeaders();
        return this.addSubWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过指定精灵账号进行授权登录</p>
     * 
     * @param request AuthLoginWithAligenieUserInfoRequest
     * @param headers AuthLoginWithAligenieUserInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthLoginWithAligenieUserInfoResponse
     */
    public AuthLoginWithAligenieUserInfoResponse authLoginWithAligenieUserInfoWithOptions(AuthLoginWithAligenieUserInfoRequest request, AuthLoginWithAligenieUserInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptedAligenieUserIdentifier)) {
            body.put("EncryptedAligenieUserIdentifier", request.encryptedAligenieUserIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
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
            new TeaPair("action", "AuthLoginWithAligenieUserInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/authLoginWithAligenieUserInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthLoginWithAligenieUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过指定精灵账号进行授权登录</p>
     * 
     * @param request AuthLoginWithAligenieUserInfoRequest
     * @return AuthLoginWithAligenieUserInfoResponse
     */
    public AuthLoginWithAligenieUserInfoResponse authLoginWithAligenieUserInfo(AuthLoginWithAligenieUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuthLoginWithAligenieUserInfoHeaders headers = new AuthLoginWithAligenieUserInfoHeaders();
        return this.authLoginWithAligenieUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过手机号生成精灵账号进行授权登录</p>
     * 
     * @param request AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest
     * @param headers AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse
     */
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse authLoginWithAligenieUserInfoGeneratedByPhoneNumberWithOptions(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest request, AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
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
            new TeaPair("action", "AuthLoginWithAligenieUserInfoGeneratedByPhoneNumber"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/authLoginWithAligenieUserInfoGeneratedByPhoneNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过手机号生成精灵账号进行授权登录</p>
     * 
     * @param request AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest
     * @return AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse
     */
    public AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberResponse authLoginWithAligenieUserInfoGeneratedByPhoneNumber(AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberHeaders headers = new AuthLoginWithAligenieUserInfoGeneratedByPhoneNumberHeaders();
        return this.authLoginWithAligenieUserInfoGeneratedByPhoneNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过指定淘宝账号进行授权登录</p>
     * 
     * @param request AuthLoginWithTaobaoUserInfoRequest
     * @param headers AuthLoginWithTaobaoUserInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthLoginWithTaobaoUserInfoResponse
     */
    public AuthLoginWithTaobaoUserInfoResponse authLoginWithTaobaoUserInfoWithOptions(AuthLoginWithTaobaoUserInfoRequest request, AuthLoginWithTaobaoUserInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encryptedTaobaoUserIdentifier)) {
            body.put("EncryptedTaobaoUserIdentifier", request.encryptedTaobaoUserIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
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
            new TeaPair("action", "AuthLoginWithTaobaoUserInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/authLoginWithTaobaoUserInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthLoginWithTaobaoUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过指定淘宝账号进行授权登录</p>
     * 
     * @param request AuthLoginWithTaobaoUserInfoRequest
     * @return AuthLoginWithTaobaoUserInfoResponse
     */
    public AuthLoginWithTaobaoUserInfoResponse authLoginWithTaobaoUserInfo(AuthLoginWithTaobaoUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuthLoginWithTaobaoUserInfoHeaders headers = new AuthLoginWithTaobaoUserInfoHeaders();
        return this.authLoginWithTaobaoUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过三方用户信息进行授权登录</p>
     * 
     * @param tmpReq AuthLoginWithThirdUserInfoRequest
     * @param headers AuthLoginWithThirdUserInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthLoginWithThirdUserInfoResponse
     */
    public AuthLoginWithThirdUserInfoResponse authLoginWithThirdUserInfoWithOptions(AuthLoginWithThirdUserInfoRequest tmpReq, AuthLoginWithThirdUserInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuthLoginWithThirdUserInfoShrinkRequest request = new AuthLoginWithThirdUserInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            body.put("ExtInfo", request.extInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            body.put("SceneCode", request.sceneCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdUserIdentifier)) {
            body.put("ThirdUserIdentifier", request.thirdUserIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdUserType)) {
            body.put("ThirdUserType", request.thirdUserType);
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
            new TeaPair("action", "AuthLoginWithThirdUserInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/authLoginWithThirdUserInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthLoginWithThirdUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过三方用户信息进行授权登录</p>
     * 
     * @param request AuthLoginWithThirdUserInfoRequest
     * @return AuthLoginWithThirdUserInfoResponse
     */
    public AuthLoginWithThirdUserInfoResponse authLoginWithThirdUserInfo(AuthLoginWithThirdUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AuthLoginWithThirdUserInfoHeaders headers = new AuthLoginWithThirdUserInfoHeaders();
        return this.authLoginWithThirdUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查并拨打voip电话【酒店业务】</p>
     * 
     * @param tmpReq CheckAndDoVoipCallForHotelRequest
     * @param headers CheckAndDoVoipCallForHotelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAndDoVoipCallForHotelResponse
     */
    public CheckAndDoVoipCallForHotelResponse checkAndDoVoipCallForHotelWithOptions(CheckAndDoVoipCallForHotelRequest tmpReq, CheckAndDoVoipCallForHotelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckAndDoVoipCallForHotelShrinkRequest request = new CheckAndDoVoipCallForHotelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizData)) {
            body.put("BizData", request.bizData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calleeNick)) {
            body.put("CalleeNick", request.calleeNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.calleePhoneNum)) {
            body.put("CalleePhoneNum", request.calleePhoneNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "CheckAndDoVoipCallForHotel"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/checkAndDoVoipCallForHotel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAndDoVoipCallForHotelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查并拨打voip电话【酒店业务】</p>
     * 
     * @param request CheckAndDoVoipCallForHotelRequest
     * @return CheckAndDoVoipCallForHotelResponse
     */
    public CheckAndDoVoipCallForHotelResponse checkAndDoVoipCallForHotel(CheckAndDoVoipCallForHotelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckAndDoVoipCallForHotelHeaders headers = new CheckAndDoVoipCallForHotelHeaders();
        return this.checkAndDoVoipCallForHotelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>轮询激活绑定结果</p>
     * 
     * @param tmpReq CheckAuthCodeBindForExtRequest
     * @param headers CheckAuthCodeBindForExtHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAuthCodeBindForExtResponse
     */
    public CheckAuthCodeBindForExtResponse checkAuthCodeBindForExtWithOptions(CheckAuthCodeBindForExtRequest tmpReq, CheckAuthCodeBindForExtHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CheckAuthCodeBindForExtShrinkRequest request = new CheckAuthCodeBindForExtShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeKey)) {
            query.put("EncodeKey", request.encodeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            query.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAuthCodeBindForExt"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/checkAuthCodeBindForExt"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAuthCodeBindForExtResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>轮询激活绑定结果</p>
     * 
     * @param request CheckAuthCodeBindForExtRequest
     * @return CheckAuthCodeBindForExtResponse
     */
    public CheckAuthCodeBindForExtResponse checkAuthCodeBindForExt(CheckAuthCodeBindForExtRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CheckAuthCodeBindForExtHeaders headers = new CheckAuthCodeBindForExtHeaders();
        return this.checkAuthCodeBindForExtWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云播放器：对外</p>
     * 
     * @param tmpReq CloudPlayerRequest
     * @param headers CloudPlayerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloudPlayerResponse
     */
    public CloudPlayerResponse cloudPlayerWithOptions(CloudPlayerRequest tmpReq, CloudPlayerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloudPlayerShrinkRequest request = new CloudPlayerShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.songIdList)) {
            request.songIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.songIdList, "SongIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.curPlayIndex)) {
            query.put("CurPlayIndex", request.curPlayIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.playMode)) {
            query.put("PlayMode", request.playMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.songId)) {
            query.put("SongId", request.songId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.songIdListShrink)) {
            query.put("SongIdList", request.songIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloudPlayer"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/cloud/player"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloudPlayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云播放器：对外</p>
     * 
     * @param request CloudPlayerRequest
     * @return CloudPlayerResponse
     */
    public CloudPlayerResponse cloudPlayer(CloudPlayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CloudPlayerHeaders headers = new CloudPlayerHeaders();
        return this.cloudPlayerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建闹钟</p>
     * 
     * @param tmpReq CreateAlarmRequest
     * @param headers CreateAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarmWithOptions(CreateAlarmRequest tmpReq, CreateAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAlarmShrinkRequest request = new CreateAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "CreateAlarm"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/createAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建闹钟</p>
     * 
     * @param request CreateAlarmRequest
     * @return CreateAlarmResponse
     */
    public CreateAlarmResponse createAlarm(CreateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateAlarmHeaders headers = new CreateAlarmHeaders();
        return this.createAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>播放列表创建</p>
     * 
     * @param tmpReq CreatePlayingListRequest
     * @param headers CreatePlayingListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePlayingListResponse
     */
    public CreatePlayingListResponse createPlayingListWithOptions(CreatePlayingListRequest tmpReq, CreatePlayingListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePlayingListShrinkRequest request = new CreatePlayingListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openCreatePlayingListRequest)) {
            request.openCreatePlayingListRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openCreatePlayingListRequest, "OpenCreatePlayingListRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openCreatePlayingListRequestShrink)) {
            body.put("OpenCreatePlayingListRequest", request.openCreatePlayingListRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePlayingList"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/CreatePlayingList"),
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
     * <p>播放列表创建</p>
     * 
     * @param request CreatePlayingListRequest
     * @return CreatePlayingListResponse
     */
    public CreatePlayingListResponse createPlayingList(CreatePlayingListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreatePlayingListHeaders headers = new CreatePlayingListHeaders();
        return this.createPlayingListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建定时任务</p>
     * 
     * @param tmpReq CreateScheduleTaskRequest
     * @param headers CreateScheduleTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScheduleTaskResponse
     */
    public CreateScheduleTaskResponse createScheduleTaskWithOptions(CreateScheduleTaskRequest tmpReq, CreateScheduleTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduleTaskShrinkRequest request = new CreateScheduleTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "CreateScheduleTask"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/CreateScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建定时任务</p>
     * 
     * @param request CreateScheduleTaskRequest
     * @return CreateScheduleTaskResponse
     */
    public CreateScheduleTaskResponse createScheduleTask(CreateScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateScheduleTaskHeaders headers = new CreateScheduleTaskHeaders();
        return this.createScheduleTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>闹钟批量删除</p>
     * 
     * @param tmpReq DeleteAlarmsRequest
     * @param headers DeleteAlarmsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAlarmsResponse
     */
    public DeleteAlarmsResponse deleteAlarmsWithOptions(DeleteAlarmsRequest tmpReq, DeleteAlarmsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteAlarmsShrinkRequest request = new DeleteAlarmsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "DeleteAlarms"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/deleteAlarms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAlarmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>闹钟批量删除</p>
     * 
     * @param request DeleteAlarmsRequest
     * @return DeleteAlarmsResponse
     */
    public DeleteAlarmsResponse deleteAlarms(DeleteAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteAlarmsHeaders headers = new DeleteAlarmsHeaders();
        return this.deleteAlarmsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除定时任务</p>
     * 
     * @param tmpReq DeleteScheduleTaskRequest
     * @param headers DeleteScheduleTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScheduleTaskResponse
     */
    public DeleteScheduleTaskResponse deleteScheduleTaskWithOptions(DeleteScheduleTaskRequest tmpReq, DeleteScheduleTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteScheduleTaskShrinkRequest request = new DeleteScheduleTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "DeleteScheduleTask"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/DeleteScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除定时任务</p>
     * 
     * @param request DeleteScheduleTaskRequest
     * @return DeleteScheduleTaskResponse
     */
    public DeleteScheduleTaskResponse deleteScheduleTask(DeleteScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteScheduleTaskHeaders headers = new DeleteScheduleTaskHeaders();
        return this.deleteScheduleTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除订阅</p>
     * 
     * @param request DeleteSubRequest
     * @param headers DeleteSubHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubResponse
     */
    public DeleteSubResponse deleteSubWithOptions(DeleteSubRequest request, DeleteSubHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subId)) {
            query.put("SubId", request.subId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSub"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/deleteSub"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除订阅</p>
     * 
     * @param request DeleteSubRequest
     * @return DeleteSubResponse
     */
    public DeleteSubResponse deleteSub(DeleteSubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteSubHeaders headers = new DeleteSubHeaders();
        return this.deleteSubWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备控制</p>
     * 
     * @param tmpReq DeviceControlRequest
     * @param headers DeviceControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeviceControlResponse
     */
    public DeviceControlResponse deviceControlWithOptions(DeviceControlRequest tmpReq, DeviceControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeviceControlShrinkRequest request = new DeviceControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.controlRequest)) {
            request.controlRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.controlRequest, "ControlRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlRequestShrink)) {
            body.put("ControlRequest", request.controlRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeviceControl"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/control"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeviceControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备控制</p>
     * 
     * @param request DeviceControlRequest
     * @return DeviceControlResponse
     */
    public DeviceControlResponse deviceControl(DeviceControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeviceControlHeaders headers = new DeviceControlHeaders();
        return this.deviceControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生态开放鉴权</p>
     * 
     * @param request EcologyOpennessAuthenticateRequest
     * @param headers EcologyOpennessAuthenticateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EcologyOpennessAuthenticateResponse
     */
    public EcologyOpennessAuthenticateResponse ecologyOpennessAuthenticateWithOptions(EcologyOpennessAuthenticateRequest request, EcologyOpennessAuthenticateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeKey)) {
            body.put("EncodeKey", request.encodeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            body.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginStateAccessToken)) {
            body.put("LoginStateAccessToken", request.loginStateAccessToken);
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
            new TeaPair("action", "EcologyOpennessAuthenticate"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ecologyOpennessAuthenticate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EcologyOpennessAuthenticateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生态开放鉴权</p>
     * 
     * @param request EcologyOpennessAuthenticateRequest
     * @return EcologyOpennessAuthenticateResponse
     */
    public EcologyOpennessAuthenticateResponse ecologyOpennessAuthenticate(EcologyOpennessAuthenticateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EcologyOpennessAuthenticateHeaders headers = new EcologyOpennessAuthenticateHeaders();
        return this.ecologyOpennessAuthenticateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生态开放发送短信验证码</p>
     * 
     * @param request EcologyOpennessSendVerificationCodeRequest
     * @param headers EcologyOpennessSendVerificationCodeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EcologyOpennessSendVerificationCodeResponse
     */
    public EcologyOpennessSendVerificationCodeResponse ecologyOpennessSendVerificationCodeWithOptions(EcologyOpennessSendVerificationCodeRequest request, EcologyOpennessSendVerificationCodeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
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
            new TeaPair("action", "EcologyOpennessSendVerificationCode"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ecologyOpennessSendVerificationCode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EcologyOpennessSendVerificationCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>生态开放发送短信验证码</p>
     * 
     * @param request EcologyOpennessSendVerificationCodeRequest
     * @return EcologyOpennessSendVerificationCodeResponse
     */
    public EcologyOpennessSendVerificationCodeResponse ecologyOpennessSendVerificationCode(EcologyOpennessSendVerificationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EcologyOpennessSendVerificationCodeHeaders headers = new EcologyOpennessSendVerificationCodeHeaders();
        return this.ecologyOpennessSendVerificationCodeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过手机号寻找可授权登录的账号列表</p>
     * 
     * @param request FindUserlistToAuthLoginWithPhoneNumberRequest
     * @param headers FindUserlistToAuthLoginWithPhoneNumberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FindUserlistToAuthLoginWithPhoneNumberResponse
     */
    public FindUserlistToAuthLoginWithPhoneNumberResponse findUserlistToAuthLoginWithPhoneNumberWithOptions(FindUserlistToAuthLoginWithPhoneNumberRequest request, FindUserlistToAuthLoginWithPhoneNumberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("SessionId", request.sessionId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FindUserlistToAuthLoginWithPhoneNumber"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/findUserlistToAuthLoginWithPhoneNumber"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FindUserlistToAuthLoginWithPhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过手机号寻找可授权登录的账号列表</p>
     * 
     * @param request FindUserlistToAuthLoginWithPhoneNumberRequest
     * @return FindUserlistToAuthLoginWithPhoneNumberResponse
     */
    public FindUserlistToAuthLoginWithPhoneNumberResponse findUserlistToAuthLoginWithPhoneNumber(FindUserlistToAuthLoginWithPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FindUserlistToAuthLoginWithPhoneNumberHeaders headers = new FindUserlistToAuthLoginWithPhoneNumberHeaders();
        return this.findUserlistToAuthLoginWithPhoneNumberWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个闹钟</p>
     * 
     * @param tmpReq GetAlarmRequest
     * @param headers GetAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlarmResponse
     */
    public GetAlarmResponse getAlarmWithOptions(GetAlarmRequest tmpReq, GetAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAlarmShrinkRequest request = new GetAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "GetAlarm"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取单个闹钟</p>
     * 
     * @param request GetAlarmRequest
     * @return GetAlarmResponse
     */
    public GetAlarmResponse getAlarm(GetAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAlarmHeaders headers = new GetAlarmHeaders();
        return this.getAlarmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取专辑信息</p>
     * 
     * @param request GetAlbumRequest
     * @param headers GetAlbumHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlbumResponse
     */
    public GetAlbumResponse getAlbumWithOptions(GetAlbumRequest request, GetAlbumHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlbum"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetAlbum"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlbumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据id获取专辑信息</p>
     * 
     * @param request GetAlbumRequest
     * @return GetAlbumResponse
     */
    public GetAlbumResponse getAlbum(GetAlbumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAlbumHeaders headers = new GetAlbumHeaders();
        return this.getAlbumWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取专辑数据</p>
     * 
     * @param request GetAlbumDetailByIdRequest
     * @param headers GetAlbumDetailByIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAlbumDetailByIdResponse
     */
    public GetAlbumDetailByIdResponse getAlbumDetailByIdWithOptions(GetAlbumDetailByIdRequest request, GetAlbumDetailByIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albumId)) {
            query.put("AlbumId", request.albumId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAlbumDetailById"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getAlbumDetailById"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAlbumDetailByIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取专辑数据</p>
     * 
     * @param request GetAlbumDetailByIdRequest
     * @return GetAlbumDetailByIdResponse
     */
    public GetAlbumDetailByIdResponse getAlbumDetailById(GetAlbumDetailByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAlbumDetailByIdHeaders headers = new GetAlbumDetailByIdHeaders();
        return this.getAlbumDetailByIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取三方绑定的精灵账号信息</p>
     * 
     * @param request GetAligenieUserInfoRequest
     * @param headers GetAligenieUserInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAligenieUserInfoResponse
     */
    public GetAligenieUserInfoResponse getAligenieUserInfoWithOptions(GetAligenieUserInfoRequest request, GetAligenieUserInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginStateAccessToken)) {
            query.put("LoginStateAccessToken", request.loginStateAccessToken);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAligenieUserInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getAligenieUserInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAligenieUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取三方绑定的精灵账号信息</p>
     * 
     * @param request GetAligenieUserInfoRequest
     * @return GetAligenieUserInfoResponse
     */
    public GetAligenieUserInfoResponse getAligenieUserInfo(GetAligenieUserInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetAligenieUserInfoHeaders headers = new GetAligenieUserInfoHeaders();
        return this.getAligenieUserInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取authCode</p>
     * 
     * @param tmpReq GetCodeEnhanceRequest
     * @param headers GetCodeEnhanceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCodeEnhanceResponse
     */
    public GetCodeEnhanceResponse getCodeEnhanceWithOptions(GetCodeEnhanceRequest tmpReq, GetCodeEnhanceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCodeEnhanceShrinkRequest request = new GetCodeEnhanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelInfo)) {
            request.channelInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelInfo, "ChannelInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelInfoShrink)) {
            query.put("ChannelInfo", request.channelInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCodeEnhance"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getCodeEnhance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCodeEnhanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取authCode</p>
     * 
     * @param request GetCodeEnhanceRequest
     * @return GetCodeEnhanceResponse
     */
    public GetCodeEnhanceResponse getCodeEnhance(GetCodeEnhanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCodeEnhanceHeaders headers = new GetCodeEnhanceHeaders();
        return this.getCodeEnhanceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>按照特定的id获取内容信息</p>
     * 
     * @param request GetContentRequest
     * @param headers GetContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetContentResponse
     */
    public GetContentResponse getContentWithOptions(GetContentRequest request, GetContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContent"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>按照特定的id获取内容信息</p>
     * 
     * @param request GetContentRequest
     * @return GetContentResponse
     */
    public GetContentResponse getContent(GetContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetContentHeaders headers = new GetContentHeaders();
        return this.getContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前播放项</p>
     * 
     * @param tmpReq GetCurrentPlayingItemRequest
     * @param headers GetCurrentPlayingItemHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCurrentPlayingItemResponse
     */
    public GetCurrentPlayingItemResponse getCurrentPlayingItemWithOptions(GetCurrentPlayingItemRequest tmpReq, GetCurrentPlayingItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCurrentPlayingItemShrinkRequest request = new GetCurrentPlayingItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCurrentPlayingItem"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetCurrentPlayingItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCurrentPlayingItemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前播放项</p>
     * 
     * @param request GetCurrentPlayingItemRequest
     * @return GetCurrentPlayingItemResponse
     */
    public GetCurrentPlayingItemResponse getCurrentPlayingItem(GetCurrentPlayingItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCurrentPlayingItemHeaders headers = new GetCurrentPlayingItemHeaders();
        return this.getCurrentPlayingItemWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前播放列表</p>
     * 
     * @param tmpReq GetCurrentPlayingListRequest
     * @param headers GetCurrentPlayingListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCurrentPlayingListResponse
     */
    public GetCurrentPlayingListResponse getCurrentPlayingListWithOptions(GetCurrentPlayingListRequest tmpReq, GetCurrentPlayingListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCurrentPlayingListShrinkRequest request = new GetCurrentPlayingListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openQueryPlayListRequest)) {
            request.openQueryPlayListRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openQueryPlayListRequest, "OpenQueryPlayListRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openQueryPlayListRequestShrink)) {
            body.put("OpenQueryPlayListRequest", request.openQueryPlayListRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCurrentPlayingList"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetCurrentPlayingList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCurrentPlayingListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取当前播放列表</p>
     * 
     * @param request GetCurrentPlayingListRequest
     * @return GetCurrentPlayingListResponse
     */
    public GetCurrentPlayingListResponse getCurrentPlayingList(GetCurrentPlayingListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetCurrentPlayingListHeaders headers = new GetCurrentPlayingListHeaders();
        return this.getCurrentPlayingListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备认证信息</p>
     * 
     * @param tmpReq GetDeviceBasicInfoRequest
     * @param headers GetDeviceBasicInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceBasicInfoResponse
     */
    public GetDeviceBasicInfoResponse getDeviceBasicInfoWithOptions(GetDeviceBasicInfoRequest tmpReq, GetDeviceBasicInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeviceBasicInfoShrinkRequest request = new GetDeviceBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceBasicInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceBasicInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备认证信息</p>
     * 
     * @param request GetDeviceBasicInfoRequest
     * @return GetDeviceBasicInfoResponse
     */
    public GetDeviceBasicInfoResponse getDeviceBasicInfo(GetDeviceBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceBasicInfoHeaders headers = new GetDeviceBasicInfoHeaders();
        return this.getDeviceBasicInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备信息</p>
     * 
     * @param request GetDeviceIdByIdentityRequest
     * @param headers GetDeviceIdByIdentityHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceIdByIdentityResponse
     */
    public GetDeviceIdByIdentityResponse getDeviceIdByIdentityWithOptions(GetDeviceIdByIdentityRequest request, GetDeviceIdByIdentityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeKey)) {
            query.put("EncodeKey", request.encodeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            query.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityId)) {
            query.put("IdentityId", request.identityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceIdByIdentity"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceIdByIdentity"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceIdByIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备信息</p>
     * 
     * @param request GetDeviceIdByIdentityRequest
     * @return GetDeviceIdByIdentityResponse
     */
    public GetDeviceIdByIdentityResponse getDeviceIdByIdentity(GetDeviceIdByIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceIdByIdentityHeaders headers = new GetDeviceIdByIdentityHeaders();
        return this.getDeviceIdByIdentityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备的用户设置</p>
     * 
     * @param tmpReq GetDeviceSettingRequest
     * @param headers GetDeviceSettingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceSettingResponse
     */
    public GetDeviceSettingResponse getDeviceSettingWithOptions(GetDeviceSettingRequest tmpReq, GetDeviceSettingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeviceSettingShrinkRequest request = new GetDeviceSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceSetting"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceSetting"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备的用户设置</p>
     * 
     * @param request GetDeviceSettingRequest
     * @return GetDeviceSettingResponse
     */
    public GetDeviceSettingResponse getDeviceSetting(GetDeviceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceSettingHeaders headers = new GetDeviceSettingHeaders();
        return this.getDeviceSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备状态详情</p>
     * 
     * @param tmpReq GetDeviceStatusDetailRequest
     * @param headers GetDeviceStatusDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceStatusDetailResponse
     */
    public GetDeviceStatusDetailResponse getDeviceStatusDetailWithOptions(GetDeviceStatusDetailRequest tmpReq, GetDeviceStatusDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeviceStatusDetailShrinkRequest request = new GetDeviceStatusDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.keys)) {
            request.keysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.keys, "Keys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keysShrink)) {
            query.put("Keys", request.keysShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceStatusDetail"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceStatusDetail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceStatusDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备状态详情</p>
     * 
     * @param request GetDeviceStatusDetailRequest
     * @return GetDeviceStatusDetailResponse
     */
    public GetDeviceStatusDetailResponse getDeviceStatusDetail(GetDeviceStatusDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceStatusDetailHeaders headers = new GetDeviceStatusDetailHeaders();
        return this.getDeviceStatusDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备状态信息</p>
     * 
     * @param tmpReq GetDeviceStatusInfoRequest
     * @param headers GetDeviceStatusInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceStatusInfoResponse
     */
    public GetDeviceStatusInfoResponse getDeviceStatusInfoWithOptions(GetDeviceStatusInfoRequest tmpReq, GetDeviceStatusInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeviceStatusInfoShrinkRequest request = new GetDeviceStatusInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceStatusInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceStatusInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceStatusInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备状态信息</p>
     * 
     * @param request GetDeviceStatusInfoRequest
     * @return GetDeviceStatusInfoResponse
     */
    public GetDeviceStatusInfoResponse getDeviceStatusInfo(GetDeviceStatusInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceStatusInfoHeaders headers = new GetDeviceStatusInfoHeaders();
        return this.getDeviceStatusInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备标签</p>
     * 
     * @param tmpReq GetDeviceTagRequest
     * @param headers GetDeviceTagHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceTagResponse
     */
    public GetDeviceTagResponse getDeviceTagWithOptions(GetDeviceTagRequest tmpReq, GetDeviceTagHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDeviceTagShrinkRequest request = new GetDeviceTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceTag"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getDeviceTag"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取设备标签</p>
     * 
     * @param request GetDeviceTagRequest
     * @return GetDeviceTagResponse
     */
    public GetDeviceTagResponse getDeviceTag(GetDeviceTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetDeviceTagHeaders headers = new GetDeviceTagHeaders();
        return this.getDeviceTagWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>江苏电信号百</p>
     * 
     * @param request GetJiangSuTelecomDataRequest
     * @param headers GetJiangSuTelecomDataHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJiangSuTelecomDataResponse
     */
    public GetJiangSuTelecomDataResponse getJiangSuTelecomDataWithOptions(GetJiangSuTelecomDataRequest request, GetJiangSuTelecomDataHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJiangSuTelecomData"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetJiangSuTelecomData"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJiangSuTelecomDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>江苏电信号百</p>
     * 
     * @param request GetJiangSuTelecomDataRequest
     * @return GetJiangSuTelecomDataResponse
     */
    public GetJiangSuTelecomDataResponse getJiangSuTelecomData(GetJiangSuTelecomDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetJiangSuTelecomDataHeaders headers = new GetJiangSuTelecomDataHeaders();
        return this.getJiangSuTelecomDataWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询定时任务</p>
     * 
     * @param tmpReq GetScheduleTaskRequest
     * @param headers GetScheduleTaskHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetScheduleTaskResponse
     */
    public GetScheduleTaskResponse getScheduleTaskWithOptions(GetScheduleTaskRequest tmpReq, GetScheduleTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetScheduleTaskShrinkRequest request = new GetScheduleTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "GetScheduleTask"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetScheduleTask"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetScheduleTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询定时任务</p>
     * 
     * @param request GetScheduleTaskRequest
     * @return GetScheduleTaskResponse
     */
    public GetScheduleTaskResponse getScheduleTask(GetScheduleTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetScheduleTaskHeaders headers = new GetScheduleTaskHeaders();
        return this.getScheduleTaskWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询未读留言数量</p>
     * 
     * @param tmpReq GetUnreadMessageCountRequest
     * @param headers GetUnreadMessageCountHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUnreadMessageCountResponse
     */
    public GetUnreadMessageCountResponse getUnreadMessageCountWithOptions(GetUnreadMessageCountRequest tmpReq, GetUnreadMessageCountHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUnreadMessageCountShrinkRequest request = new GetUnreadMessageCountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUnreadMessageCount"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getUnreadMessageCount"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUnreadMessageCountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询未读留言数量</p>
     * 
     * @param request GetUnreadMessageCountRequest
     * @return GetUnreadMessageCountResponse
     */
    public GetUnreadMessageCountResponse getUnreadMessageCount(GetUnreadMessageCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUnreadMessageCountHeaders headers = new GetUnreadMessageCountHeaders();
        return this.getUnreadMessageCountWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备绑定的用户</p>
     * 
     * @param tmpReq GetUserByDeviceIdRequest
     * @param headers GetUserByDeviceIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserByDeviceIdResponse
     */
    public GetUserByDeviceIdResponse getUserByDeviceIdWithOptions(GetUserByDeviceIdRequest tmpReq, GetUserByDeviceIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserByDeviceIdShrinkRequest request = new GetUserByDeviceIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserByDeviceId"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/getUserByDeviceId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserByDeviceIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询设备绑定的用户</p>
     * 
     * @param request GetUserByDeviceIdRequest
     * @return GetUserByDeviceIdResponse
     */
    public GetUserByDeviceIdResponse getUserByDeviceId(GetUserByDeviceIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserByDeviceIdHeaders headers = new GetUserByDeviceIdHeaders();
        return this.getUserByDeviceIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询天气</p>
     * 
     * @param tmpReq GetWeatherRequest
     * @param headers GetWeatherHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWeatherResponse
     */
    public GetWeatherResponse getWeatherWithOptions(GetWeatherRequest tmpReq, GetWeatherHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetWeatherShrinkRequest request = new GetWeatherShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "GetWeather"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/GetWeather"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWeatherResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询天气</p>
     * 
     * @param request GetWeatherRequest
     * @return GetWeatherResponse
     */
    public GetWeatherResponse getWeather(GetWeatherRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetWeatherHeaders headers = new GetWeatherHeaders();
        return this.getWeatherWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>播放列表点击播放</p>
     * 
     * @param tmpReq IndexControlPlayingListRequest
     * @param headers IndexControlPlayingListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return IndexControlPlayingListResponse
     */
    public IndexControlPlayingListResponse indexControlPlayingListWithOptions(IndexControlPlayingListRequest tmpReq, IndexControlPlayingListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IndexControlPlayingListShrinkRequest request = new IndexControlPlayingListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openIndexControlRequest)) {
            request.openIndexControlRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openIndexControlRequest, "OpenIndexControlRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openIndexControlRequestShrink)) {
            body.put("OpenIndexControlRequest", request.openIndexControlRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IndexControlPlayingList"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/IndexControlPlayingList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IndexControlPlayingListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>播放列表点击播放</p>
     * 
     * @param request IndexControlPlayingListRequest
     * @return IndexControlPlayingListResponse
     */
    public IndexControlPlayingListResponse indexControlPlayingList(IndexControlPlayingListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IndexControlPlayingListHeaders headers = new IndexControlPlayingListHeaders();
        return this.indexControlPlayingListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>失效三方应用登录态</p>
     * 
     * @param tmpReq InvalidateThirdPartyAppLoginStateRequest
     * @param headers InvalidateThirdPartyAppLoginStateHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvalidateThirdPartyAppLoginStateResponse
     */
    public InvalidateThirdPartyAppLoginStateResponse invalidateThirdPartyAppLoginStateWithOptions(InvalidateThirdPartyAppLoginStateRequest tmpReq, InvalidateThirdPartyAppLoginStateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvalidateThirdPartyAppLoginStateShrinkRequest request = new InvalidateThirdPartyAppLoginStateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartyAppId)) {
            body.put("ThirdPartyAppId", request.thirdPartyAppId);
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
            new TeaPair("action", "InvalidateThirdPartyAppLoginState"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/invalidateThirdPartyAppLoginState"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvalidateThirdPartyAppLoginStateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>失效三方应用登录态</p>
     * 
     * @param request InvalidateThirdPartyAppLoginStateRequest
     * @return InvalidateThirdPartyAppLoginStateResponse
     */
    public InvalidateThirdPartyAppLoginStateResponse invalidateThirdPartyAppLoginState(InvalidateThirdPartyAppLoginStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvalidateThirdPartyAppLoginStateHeaders headers = new InvalidateThirdPartyAppLoginStateHeaders();
        return this.invalidateThirdPartyAppLoginStateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询闹钟列表</p>
     * 
     * @param tmpReq ListAlarmsRequest
     * @param headers ListAlarmsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarmsWithOptions(ListAlarmsRequest tmpReq, ListAlarmsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlarmsShrinkRequest request = new ListAlarmsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "ListAlarms"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlarmsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询闹钟列表</p>
     * 
     * @param request ListAlarmsRequest
     * @return ListAlarmsResponse
     */
    public ListAlarmsResponse listAlarms(ListAlarmsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAlarmsHeaders headers = new ListAlarmsHeaders();
        return this.listAlarmsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐音频专辑里面的内容列表</p>
     * 
     * @param request ListAlbumDetailRequest
     * @param headers ListAlbumDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlbumDetailResponse
     */
    public ListAlbumDetailResponse listAlbumDetailWithOptions(ListAlbumDetailRequest request, ListAlbumDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlbumDetail"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListAlbumDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlbumDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐音频专辑里面的内容列表</p>
     * 
     * @param request ListAlbumDetailRequest
     * @return ListAlbumDetailResponse
     */
    public ListAlbumDetailResponse listAlbumDetail(ListAlbumDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAlbumDetailHeaders headers = new ListAlbumDetailHeaders();
        return this.listAlbumDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>专辑是否被订阅</p>
     * 
     * @param tmpReq ListAlbumIsAddedRequest
     * @param headers ListAlbumIsAddedHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAlbumIsAddedResponse
     */
    public ListAlbumIsAddedResponse listAlbumIsAddedWithOptions(ListAlbumIsAddedRequest tmpReq, ListAlbumIsAddedHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAlbumIsAddedShrinkRequest request = new ListAlbumIsAddedShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.albumIdList)) {
            request.albumIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.albumIdList, "AlbumIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.albumIdListShrink)) {
            query.put("AlbumIdList", request.albumIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAlbumIsAdded"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listAlbumIsAdded"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAlbumIsAddedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>专辑是否被订阅</p>
     * 
     * @param request ListAlbumIsAddedRequest
     * @return ListAlbumIsAddedResponse
     */
    public ListAlbumIsAddedResponse listAlbumIsAdded(ListAlbumIsAddedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListAlbumIsAddedHeaders headers = new ListAlbumIsAddedHeaders();
        return this.listAlbumIsAddedWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据特定的类目,按照指定的排序顺序获取该类目下的内容.</p>
     * 
     * @param tmpReq ListCateContentRequest
     * @param headers ListCateContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCateContentResponse
     */
    public ListCateContentResponse listCateContentWithOptions(ListCateContentRequest tmpReq, ListCateContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCateContentShrinkRequest request = new ListCateContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCateContent"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListCateContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCateContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据特定的类目,按照指定的排序顺序获取该类目下的内容.</p>
     * 
     * @param request ListCateContentRequest
     * @return ListCateContentResponse
     */
    public ListCateContentResponse listCateContent(ListCateContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCateContentHeaders headers = new ListCateContentHeaders();
        return this.listCateContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐音频类目列表</p>
     * 
     * @param request ListCateInfoRequest
     * @param headers ListCateInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCateInfoResponse
     */
    public ListCateInfoResponse listCateInfoWithOptions(ListCateInfoRequest request, ListCateInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCateInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListCateInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCateInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐音频类目列表</p>
     * 
     * @param request ListCateInfoRequest
     * @return ListCateInfoResponse
     */
    public ListCateInfoResponse listCateInfo(ListCateInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCateInfoHeaders headers = new ListCateInfoHeaders();
        return this.listCateInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐/音频的一级类目列表</p>
     * 
     * @param request ListCommonCateFirstFloorRequest
     * @param headers ListCommonCateFirstFloorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommonCateFirstFloorResponse
     */
    public ListCommonCateFirstFloorResponse listCommonCateFirstFloorWithOptions(ListCommonCateFirstFloorRequest request, ListCommonCateFirstFloorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommonCateFirstFloor"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListCommonCateFirstFloor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommonCateFirstFloorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取音乐/音频的一级类目列表</p>
     * 
     * @param request ListCommonCateFirstFloorRequest
     * @return ListCommonCateFirstFloorResponse
     */
    public ListCommonCateFirstFloorResponse listCommonCateFirstFloor(ListCommonCateFirstFloorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCommonCateFirstFloorHeaders headers = new ListCommonCateFirstFloorHeaders();
        return this.listCommonCateFirstFloorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定一级类目下面的二级类目列表</p>
     * 
     * @param request ListCommonCateSecondFloorRequest
     * @param headers ListCommonCateSecondFloorHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommonCateSecondFloorResponse
     */
    public ListCommonCateSecondFloorResponse listCommonCateSecondFloorWithOptions(ListCommonCateSecondFloorRequest request, ListCommonCateSecondFloorHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.parentCateId)) {
            query.put("ParentCateId", request.parentCateId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommonCateSecondFloor"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListCommonCateSecondFloor"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommonCateSecondFloorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定一级类目下面的二级类目列表</p>
     * 
     * @param request ListCommonCateSecondFloorRequest
     * @return ListCommonCateSecondFloorResponse
     */
    public ListCommonCateSecondFloorResponse listCommonCateSecondFloor(ListCommonCateSecondFloorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListCommonCateSecondFloorHeaders headers = new ListCommonCateSecondFloorHeaders();
        return this.listCommonCateSecondFloorWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取设备基本信息</p>
     * 
     * @param tmpReq ListDeviceBasicInfoRequest
     * @param headers ListDeviceBasicInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceBasicInfoResponse
     */
    public ListDeviceBasicInfoResponse listDeviceBasicInfoWithOptions(ListDeviceBasicInfoRequest tmpReq, ListDeviceBasicInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeviceBasicInfoShrinkRequest request = new ListDeviceBasicInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfos)) {
            request.deviceInfosShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfos, "DeviceInfos", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfosShrink)) {
            query.put("DeviceInfos", request.deviceInfosShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceBasicInfo"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listDeviceBasicInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceBasicInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取设备基本信息</p>
     * 
     * @param request ListDeviceBasicInfoRequest
     * @return ListDeviceBasicInfoResponse
     */
    public ListDeviceBasicInfoResponse listDeviceBasicInfo(ListDeviceBasicInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeviceBasicInfoHeaders headers = new ListDeviceBasicInfoHeaders();
        return this.listDeviceBasicInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户名下的设备</p>
     * 
     * @param tmpReq ListDeviceByUserIdRequest
     * @param headers ListDeviceByUserIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceByUserIdResponse
     */
    public ListDeviceByUserIdResponse listDeviceByUserIdWithOptions(ListDeviceByUserIdRequest tmpReq, ListDeviceByUserIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeviceByUserIdShrinkRequest request = new ListDeviceByUserIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceByUserId"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listDeviceByUserId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceByUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户名下的设备</p>
     * 
     * @param request ListDeviceByUserIdRequest
     * @return ListDeviceByUserIdResponse
     */
    public ListDeviceByUserIdResponse listDeviceByUserId(ListDeviceByUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeviceByUserIdHeaders headers = new ListDeviceByUserIdHeaders();
        return this.listDeviceByUserIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定渠道的设备列表</p>
     * 
     * @param tmpReq ListDeviceByUserIdAndChanelRequest
     * @param headers ListDeviceByUserIdAndChanelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceByUserIdAndChanelResponse
     */
    public ListDeviceByUserIdAndChanelResponse listDeviceByUserIdAndChanelWithOptions(ListDeviceByUserIdAndChanelRequest tmpReq, ListDeviceByUserIdAndChanelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeviceByUserIdAndChanelShrinkRequest request = new ListDeviceByUserIdAndChanelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.channelInfo)) {
            request.channelInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.channelInfo, "ChannelInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelInfoShrink)) {
            query.put("ChannelInfo", request.channelInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceByUserIdAndChanel"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listDeviceByUserIdAndChanel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceByUserIdAndChanelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定渠道的设备列表</p>
     * 
     * @param request ListDeviceByUserIdAndChanelRequest
     * @return ListDeviceByUserIdAndChanelResponse
     */
    public ListDeviceByUserIdAndChanelResponse listDeviceByUserIdAndChanel(ListDeviceByUserIdAndChanelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeviceByUserIdAndChanelHeaders headers = new ListDeviceByUserIdAndChanelHeaders();
        return this.listDeviceByUserIdAndChanelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取设备openId</p>
     * 
     * @param tmpReq ListDeviceIdByIdentitiesRequest
     * @param headers ListDeviceIdByIdentitiesHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDeviceIdByIdentitiesResponse
     */
    public ListDeviceIdByIdentitiesResponse listDeviceIdByIdentitiesWithOptions(ListDeviceIdByIdentitiesRequest tmpReq, ListDeviceIdByIdentitiesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListDeviceIdByIdentitiesShrinkRequest request = new ListDeviceIdByIdentitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.identityIds)) {
            request.identityIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.identityIds, "IdentityIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.encodeKey)) {
            query.put("EncodeKey", request.encodeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodeType)) {
            query.put("EncodeType", request.encodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityIdsShrink)) {
            query.put("IdentityIds", request.identityIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityType)) {
            query.put("IdentityType", request.identityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("ProductKey", request.productKey);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeviceIdByIdentities"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listDeviceIdByIdentities"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeviceIdByIdentitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取设备openId</p>
     * 
     * @param request ListDeviceIdByIdentitiesRequest
     * @return ListDeviceIdByIdentitiesResponse
     */
    public ListDeviceIdByIdentitiesResponse listDeviceIdByIdentities(ListDeviceIdByIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListDeviceIdByIdentitiesHeaders headers = new ListDeviceIdByIdentitiesHeaders();
        return this.listDeviceIdByIdentitiesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基于音乐类型查询铃声列表（分页）</p>
     * 
     * @param tmpReq ListMusicRequest
     * @param headers ListMusicHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMusicResponse
     */
    public ListMusicResponse listMusicWithOptions(ListMusicRequest tmpReq, ListMusicHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListMusicShrinkRequest request = new ListMusicShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "ListMusic"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listMusic"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMusicResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基于音乐类型查询铃声列表（分页）</p>
     * 
     * @param request ListMusicRequest
     * @return ListMusicResponse
     */
    public ListMusicResponse listMusic(ListMusicRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListMusicHeaders headers = new ListMusicHeaders();
        return this.listMusicWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的播放历史</p>
     * 
     * @param tmpReq ListPlayHistoryRequest
     * @param headers ListPlayHistoryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPlayHistoryResponse
     */
    public ListPlayHistoryResponse listPlayHistoryWithOptions(ListPlayHistoryRequest tmpReq, ListPlayHistoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPlayHistoryShrinkRequest request = new ListPlayHistoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPlayHistory"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListPlayHistory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPlayHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户的播放历史</p>
     * 
     * @param request ListPlayHistoryRequest
     * @return ListPlayHistoryResponse
     */
    public ListPlayHistoryResponse listPlayHistory(ListPlayHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListPlayHistoryHeaders headers = new ListPlayHistoryHeaders();
        return this.listPlayHistoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取每日推荐的音乐或者音频</p>
     * 
     * @param tmpReq ListRecommendContentRequest
     * @param headers ListRecommendContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecommendContentResponse
     */
    public ListRecommendContentResponse listRecommendContentWithOptions(ListRecommendContentRequest tmpReq, ListRecommendContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListRecommendContentShrinkRequest request = new ListRecommendContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecommendContent"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ListRecommendContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecommendContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取每日推荐的音乐或者音频</p>
     * 
     * @param request ListRecommendContentRequest
     * @return ListRecommendContentResponse
     */
    public ListRecommendContentResponse listRecommendContent(ListRecommendContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListRecommendContentHeaders headers = new ListRecommendContentHeaders();
        return this.listRecommendContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>订阅列表</p>
     * 
     * @param tmpReq ListSubRequest
     * @param headers ListSubHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubResponse
     */
    public ListSubResponse listSubWithOptions(ListSubRequest tmpReq, ListSubHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSubShrinkRequest request = new ListSubShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.page)) {
            request.pageShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.page, "Page", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageShrink)) {
            query.put("Page", request.pageShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSub"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listSub"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>订阅列表</p>
     * 
     * @param request ListSubRequest
     * @return ListSubResponse
     */
    public ListSubResponse listSub(ListSubRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSubHeaders headers = new ListSubHeaders();
        return this.listSubWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>订阅专辑元数据列表</p>
     * 
     * @param tmpReq ListSubAlbumRequest
     * @param headers ListSubAlbumHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubAlbumResponse
     */
    public ListSubAlbumResponse listSubAlbumWithOptions(ListSubAlbumRequest tmpReq, ListSubAlbumHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSubAlbumShrinkRequest request = new ListSubAlbumShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.querySubscriptionAlbumRequest)) {
            request.querySubscriptionAlbumRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.querySubscriptionAlbumRequest, "QuerySubscriptionAlbumRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.querySubscriptionAlbumRequestShrink)) {
            query.put("QuerySubscriptionAlbumRequest", request.querySubscriptionAlbumRequestShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubAlbum"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listSubAlbum"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubAlbumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>订阅专辑元数据列表</p>
     * 
     * @param request ListSubAlbumRequest
     * @return ListSubAlbumResponse
     */
    public ListSubAlbumResponse listSubAlbum(ListSubAlbumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSubAlbumHeaders headers = new ListSubAlbumHeaders();
        return this.listSubAlbumWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>内容订阅元数据分类</p>
     * 
     * @param request ListSubscriptionAlbumCategoryRequest
     * @param headers ListSubscriptionAlbumCategoryHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubscriptionAlbumCategoryResponse
     */
    public ListSubscriptionAlbumCategoryResponse listSubscriptionAlbumCategoryWithOptions(ListSubscriptionAlbumCategoryRequest request, ListSubscriptionAlbumCategoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.categoryName)) {
            query.put("CategoryName", request.categoryName);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubscriptionAlbumCategory"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listSubscriptionAlbumCategory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubscriptionAlbumCategoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>内容订阅元数据分类</p>
     * 
     * @param request ListSubscriptionAlbumCategoryRequest
     * @return ListSubscriptionAlbumCategoryResponse
     */
    public ListSubscriptionAlbumCategoryResponse listSubscriptionAlbumCategory(ListSubscriptionAlbumCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListSubscriptionAlbumCategoryHeaders headers = new ListSubscriptionAlbumCategoryHeaders();
        return this.listSubscriptionAlbumCategoryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取留言列表</p>
     * 
     * @param tmpReq ListUserMessageRequest
     * @param headers ListUserMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserMessageResponse
     */
    public ListUserMessageResponse listUserMessageWithOptions(ListUserMessageRequest tmpReq, ListUserMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListUserMessageShrinkRequest request = new ListUserMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beforeTime)) {
            query.put("BeforeTime", request.beforeTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("limit", request.limit);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserMessage"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/listUserMessage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取留言列表</p>
     * 
     * @param request ListUserMessageRequest
     * @return ListUserMessageResponse
     */
    public ListUserMessageResponse listUserMessage(ListUserMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListUserMessageHeaders headers = new ListUserMessageHeaders();
        return this.listUserMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移动轻纳管</p>
     * 
     * @param tmpReq MobileRecommendRequest
     * @param headers MobileRecommendHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return MobileRecommendResponse
     */
    public MobileRecommendResponse mobileRecommendWithOptions(MobileRecommendRequest tmpReq, MobileRecommendHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MobileRecommendShrinkRequest request = new MobileRecommendShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.botId)) {
            query.put("BotId", request.botId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.style)) {
            query.put("Style", request.style);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MobileRecommend"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/mobile/recommend/music"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MobileRecommendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移动轻纳管</p>
     * 
     * @param request MobileRecommendRequest
     * @return MobileRecommendResponse
     */
    public MobileRecommendResponse mobileRecommend(MobileRecommendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MobileRecommendHeaders headers = new MobileRecommendHeaders();
        return this.mobileRecommendWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>播放暂停控制</p>
     * 
     * @param tmpReq PlayAndPauseControlRequest
     * @param headers PlayAndPauseControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PlayAndPauseControlResponse
     */
    public PlayAndPauseControlResponse playAndPauseControlWithOptions(PlayAndPauseControlRequest tmpReq, PlayAndPauseControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PlayAndPauseControlShrinkRequest request = new PlayAndPauseControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openPlayAndPauseControlParam)) {
            request.openPlayAndPauseControlParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openPlayAndPauseControlParam, "OpenPlayAndPauseControlParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openPlayAndPauseControlParamShrink)) {
            body.put("OpenPlayAndPauseControlParam", request.openPlayAndPauseControlParamShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlayAndPauseControl"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/PlayAndPauseControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PlayAndPauseControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>播放暂停控制</p>
     * 
     * @param request PlayAndPauseControlRequest
     * @return PlayAndPauseControlResponse
     */
    public PlayAndPauseControlResponse playAndPauseControl(PlayAndPauseControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PlayAndPauseControlHeaders headers = new PlayAndPauseControlHeaders();
        return this.playAndPauseControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>播放模式切换</p>
     * 
     * @param tmpReq PlayModeControlRequest
     * @param headers PlayModeControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PlayModeControlResponse
     */
    public PlayModeControlResponse playModeControlWithOptions(PlayModeControlRequest tmpReq, PlayModeControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PlayModeControlShrinkRequest request = new PlayModeControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openPlayModeControlRequest)) {
            request.openPlayModeControlRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openPlayModeControlRequest, "OpenPlayModeControlRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openPlayModeControlRequestShrink)) {
            body.put("OpenPlayModeControlRequest", request.openPlayModeControlRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PlayModeControl"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/PlayModeControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PlayModeControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>播放模式切换</p>
     * 
     * @param request PlayModeControlRequest
     * @return PlayModeControlResponse
     */
    public PlayModeControlResponse playModeControl(PlayModeControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PlayModeControlHeaders headers = new PlayModeControlHeaders();
        return this.playModeControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>上下首控制</p>
     * 
     * @param tmpReq PreviousAndNextControlRequest
     * @param headers PreviousAndNextControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviousAndNextControlResponse
     */
    public PreviousAndNextControlResponse previousAndNextControlWithOptions(PreviousAndNextControlRequest tmpReq, PreviousAndNextControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PreviousAndNextControlShrinkRequest request = new PreviousAndNextControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openControlPlayingListRequest)) {
            request.openControlPlayingListRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openControlPlayingListRequest, "OpenControlPlayingListRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openControlPlayingListRequestShrink)) {
            body.put("OpenControlPlayingListRequest", request.openControlPlayingListRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviousAndNextControl"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/PreviousAndNextControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviousAndNextControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>上下首控制</p>
     * 
     * @param request PreviousAndNextControlRequest
     * @return PreviousAndNextControlResponse
     */
    public PreviousAndNextControlResponse previousAndNextControl(PreviousAndNextControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PreviousAndNextControlHeaders headers = new PreviousAndNextControlHeaders();
        return this.previousAndNextControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>进度控制</p>
     * 
     * @param tmpReq ProgressControlRequest
     * @param headers ProgressControlHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProgressControlResponse
     */
    public ProgressControlResponse progressControlWithOptions(ProgressControlRequest tmpReq, ProgressControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ProgressControlShrinkRequest request = new ProgressControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.openProgressControlRequest)) {
            request.openProgressControlRequestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.openProgressControlRequest, "OpenProgressControlRequest", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.openProgressControlRequestShrink)) {
            body.put("OpenProgressControlRequest", request.openProgressControlRequestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProgressControl"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/ProgressControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProgressControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>进度控制</p>
     * 
     * @param request ProgressControlRequest
     * @return ProgressControlResponse
     */
    public ProgressControlResponse progressControl(ProgressControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProgressControlHeaders headers = new ProgressControlHeaders();
        return this.progressControlWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取闹钟音乐类型列表</p>
     * 
     * @param tmpReq QueryMusicTypeRequest
     * @param headers QueryMusicTypeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMusicTypeResponse
     */
    public QueryMusicTypeResponse queryMusicTypeWithOptions(QueryMusicTypeRequest tmpReq, QueryMusicTypeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryMusicTypeShrinkRequest request = new QueryMusicTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "QueryMusicType"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/queryMusicType"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMusicTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取闹钟音乐类型列表</p>
     * 
     * @param request QueryMusicTypeRequest
     * @return QueryMusicTypeResponse
     */
    public QueryMusicTypeResponse queryMusicType(QueryMusicTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryMusicTypeHeaders headers = new QueryMusicTypeHeaders();
        return this.queryMusicTypeWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>通过tme用户id获取授权的天猫精灵用户+设备列表</p>
     * 
     * @param request QueryUserDeviceListByTmeUserIdRequest
     * @param headers QueryUserDeviceListByTmeUserIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserDeviceListByTmeUserIdResponse
     */
    public QueryUserDeviceListByTmeUserIdResponse queryUserDeviceListByTmeUserIdWithOptions(QueryUserDeviceListByTmeUserIdRequest request, QueryUserDeviceListByTmeUserIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sp)) {
            query.put("Sp", request.sp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tmeUserId)) {
            query.put("TmeUserId", request.tmeUserId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserDeviceListByTmeUserId"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/queryUserDeviceListByTmeUserId"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserDeviceListByTmeUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>通过tme用户id获取授权的天猫精灵用户+设备列表</p>
     * 
     * @param request QueryUserDeviceListByTmeUserIdRequest
     * @return QueryUserDeviceListByTmeUserIdResponse
     */
    public QueryUserDeviceListByTmeUserIdResponse queryUserDeviceListByTmeUserId(QueryUserDeviceListByTmeUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryUserDeviceListByTmeUserIdHeaders headers = new QueryUserDeviceListByTmeUserIdHeaders();
        return this.queryUserDeviceListByTmeUserIdWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>读取留言</p>
     * 
     * @param tmpReq ReadMessageRequest
     * @param headers ReadMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReadMessageResponse
     */
    public ReadMessageResponse readMessageWithOptions(ReadMessageRequest tmpReq, ReadMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReadMessageShrinkRequest request = new ReadMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.messageId)) {
            query.put("MessageId", request.messageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReadMessage"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/readMessage"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReadMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>读取留言</p>
     * 
     * @param request ReadMessageRequest
     * @return ReadMessageResponse
     */
    public ReadMessageResponse readMessage(ReadMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ReadMessageHeaders headers = new ReadMessageHeaders();
        return this.readMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>扫描二维码激活绑定设备</p>
     * 
     * @param tmpReq ScanCodeBindRequest
     * @param headers ScanCodeBindHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScanCodeBindResponse
     */
    public ScanCodeBindResponse scanCodeBindWithOptions(ScanCodeBindRequest tmpReq, ScanCodeBindHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScanCodeBindShrinkRequest request = new ScanCodeBindShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bindReq)) {
            request.bindReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bindReq, "BindReq", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindReqShrink)) {
            body.put("BindReq", request.bindReqShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "ScanCodeBind"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/scanCode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScanCodeBindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>扫描二维码激活绑定设备</p>
     * 
     * @param request ScanCodeBindRequest
     * @return ScanCodeBindResponse
     */
    public ScanCodeBindResponse scanCodeBind(ScanCodeBindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ScanCodeBindHeaders headers = new ScanCodeBindHeaders();
        return this.scanCodeBindWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选品池投放能力</p>
     * 
     * @param tmpReq ScgSearchRequest
     * @param headers ScgSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ScgSearchResponse
     */
    public ScgSearchResponse scgSearchWithOptions(ScgSearchRequest tmpReq, ScgSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ScgSearchShrinkRequest request = new ScgSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scgFilter)) {
            request.scgFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scgFilter, "ScgFilter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scgFilterShrink)) {
            query.put("ScgFilter", request.scgFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topicId)) {
            query.put("TopicId", request.topicId);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ScgSearch"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/scgSearch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ScgSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选品池投放能力</p>
     * 
     * @param request ScgSearchRequest
     * @return ScgSearchResponse
     */
    public ScgSearchResponse scgSearch(ScgSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ScgSearchHeaders headers = new ScgSearchHeaders();
        return this.scgSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>按照特定的搜索条件搜索</p>
     * 
     * @param tmpReq SearchContentRequest
     * @param headers SearchContentHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchContentResponse
     */
    public SearchContentResponse searchContentWithOptions(SearchContentRequest tmpReq, SearchContentHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchContentShrinkRequest request = new SearchContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.request)) {
            request.requestShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.request, "Request", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.requestShrink)) {
            body.put("Request", request.requestShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchContent"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/SearchContent"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>按照特定的搜索条件搜索</p>
     * 
     * @param request SearchContentRequest
     * @return SearchContentResponse
     */
    public SearchContentResponse searchContent(SearchContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchContentHeaders headers = new SearchContentHeaders();
        return this.searchContentWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发送留言</p>
     * 
     * @param tmpReq SendMessageRequest
     * @param headers SendMessageHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessageWithOptions(SendMessageRequest tmpReq, SendMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SendMessageShrinkRequest request = new SendMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            query.put("Url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            query.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SendMessage"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/sendMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SendMessageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发送留言</p>
     * 
     * @param request SendMessageRequest
     * @return SendMessageResponse
     */
    public SendMessageResponse sendMessage(SendMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SendMessageHeaders headers = new SendMessageHeaders();
        return this.sendMessageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备设置</p>
     * 
     * @param tmpReq SetDeviceSettingRequest
     * @param headers SetDeviceSettingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDeviceSettingResponse
     */
    public SetDeviceSettingResponse setDeviceSettingWithOptions(SetDeviceSettingRequest tmpReq, SetDeviceSettingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetDeviceSettingShrinkRequest request = new SetDeviceSettingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            query.put("DeviceInfo", request.deviceInfoShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            body.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            body.put("Value", request.value);
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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDeviceSetting"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/setDeviceSetting"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDeviceSettingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备设置</p>
     * 
     * @param request SetDeviceSettingRequest
     * @return SetDeviceSettingResponse
     */
    public SetDeviceSettingResponse setDeviceSetting(SetDeviceSettingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetDeviceSettingHeaders headers = new SetDeviceSettingHeaders();
        return this.setDeviceSettingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除三方和精灵账号的关系</p>
     * 
     * @param request UnbindAligenieUserRequest
     * @param headers UnbindAligenieUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAligenieUserResponse
     */
    public UnbindAligenieUserResponse unbindAligenieUserWithOptions(UnbindAligenieUserRequest request, UnbindAligenieUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loginStateAccessToken)) {
            body.put("LoginStateAccessToken", request.loginStateAccessToken);
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
            new TeaPair("action", "UnbindAligenieUser"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/unbindAligenieUser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAligenieUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除三方和精灵账号的关系</p>
     * 
     * @param request UnbindAligenieUserRequest
     * @return UnbindAligenieUserResponse
     */
    public UnbindAligenieUserResponse unbindAligenieUser(UnbindAligenieUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnbindAligenieUserHeaders headers = new UnbindAligenieUserHeaders();
        return this.unbindAligenieUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑设备</p>
     * 
     * @param tmpReq UnbindDeviceRequest
     * @param headers UnbindDeviceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDeviceResponse
     */
    public UnbindDeviceResponse unbindDeviceWithOptions(UnbindDeviceRequest tmpReq, UnbindDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnbindDeviceShrinkRequest request = new UnbindDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "UnbindDevice"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/unbindDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑设备</p>
     * 
     * @param request UnbindDeviceRequest
     * @return UnbindDeviceResponse
     */
    public UnbindDeviceResponse unbindDevice(UnbindDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UnbindDeviceHeaders headers = new UnbindDeviceHeaders();
        return this.unbindDeviceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新闹钟</p>
     * 
     * @param tmpReq UpdateAlarmRequest
     * @param headers UpdateAlarmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAlarmResponse
     */
    public UpdateAlarmResponse updateAlarmWithOptions(UpdateAlarmRequest tmpReq, UpdateAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAlarmShrinkRequest request = new UpdateAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceInfo)) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceInfo, "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.payload)) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.payload, "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceInfoShrink)) {
            body.put("DeviceInfo", request.deviceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            body.put("Payload", request.payloadShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
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
            new TeaPair("action", "UpdateAlarm"),
            new TeaPair("version", "ssp_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ssp/updateAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新闹钟</p>
     * 
     * @param request UpdateAlarmRequest
     * @return UpdateAlarmResponse
     */
    public UpdateAlarmResponse updateAlarm(UpdateAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateAlarmHeaders headers = new UpdateAlarmHeaders();
        return this.updateAlarmWithOptions(request, headers, runtime);
    }
}
