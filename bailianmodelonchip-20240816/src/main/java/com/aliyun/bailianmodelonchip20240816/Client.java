// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816;

import com.aliyun.tea.*;
import com.aliyun.bailianmodelonchip20240816.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bailianmodelonchip", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>主动交互消息传递</p>
     * 
     * @param request ActiveInteractionCreateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveInteractionCreateResponse
     */
    public ActiveInteractionCreateResponse activeInteractionCreateWithOptions(ActiveInteractionCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("image", request.image);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveInteractionCreate"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/active/interaction/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveInteractionCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主动交互消息传递</p>
     * 
     * @param request ActiveInteractionCreateRequest
     * @return ActiveInteractionCreateResponse
     */
    public ActiveInteractionCreateResponse activeInteractionCreate(ActiveInteractionCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activeInteractionCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>主动交互消息生成eu</p>
     * 
     * @param request ActiveInteractionEuCreateRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveInteractionEuCreateResponse
     */
    public ActiveInteractionEuCreateResponse activeInteractionEuCreateWithOptions(ActiveInteractionEuCreateRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.image)) {
            body.put("image", request.image);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveInteractionEuCreate"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/eu/active/interaction/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveInteractionEuCreateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>主动交互消息生成eu</p>
     * 
     * @param request ActiveInteractionEuCreateRequest
     * @return ActiveInteractionEuCreateResponse
     */
    public ActiveInteractionEuCreateResponse activeInteractionEuCreate(ActiveInteractionEuCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.activeInteractionEuCreateWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备注册</p>
     * 
     * @param request DeviceRegisterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeviceRegisterResponse
     */
    public DeviceRegisterResponse deviceRegisterWithOptions(DeviceRegisterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            body.put("nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTime)) {
            body.put("requestTime", request.requestTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            body.put("signature", request.signature);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeviceRegister"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/register"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeviceRegisterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备注册</p>
     * 
     * @param request DeviceRegisterRequest
     * @return DeviceRegisterResponse
     */
    public DeviceRegisterResponse deviceRegister(DeviceRegisterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deviceRegisterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>云端获取透传鉴权信息</p>
     * 
     * @param request GetPassThroughAuthInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPassThroughAuthInfoResponse
     */
    public GetPassThroughAuthInfoResponse getPassThroughAuthInfoWithOptions(GetPassThroughAuthInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPassThroughAuthInfo"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/auth/v1/token/getPassThroughAuthInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPassThroughAuthInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>云端获取透传鉴权信息</p>
     * 
     * @param request GetPassThroughAuthInfoRequest
     * @return GetPassThroughAuthInfoResponse
     */
    public GetPassThroughAuthInfoResponse getPassThroughAuthInfo(GetPassThroughAuthInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPassThroughAuthInfoWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网关校验Token</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            body.put("nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTime)) {
            body.put("requestTime", request.requestTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            body.put("signature", request.signature);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenKey)) {
            body.put("tokenKey", request.tokenKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenType)) {
            body.put("tokenType", request.tokenType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/auth/v1/token/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网关校验Token</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>模型类型识别</p>
     * 
     * @param tmpReq ModelTypeDetermineRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModelTypeDetermineResponse
     */
    public ModelTypeDetermineResponse modelTypeDetermineWithOptions(ModelTypeDetermineRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModelTypeDetermineShrinkRequest request = new ModelTypeDetermineShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.history)) {
            request.historyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.history, "history", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.historyShrink)) {
            body.put("history", request.historyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputText)) {
            body.put("inputText", request.inputText);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModelTypeDetermine"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/model/type/determine"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModelTypeDetermineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>模型类型识别</p>
     * 
     * @param request ModelTypeDetermineRequest
     * @return ModelTypeDetermineResponse
     */
    public ModelTypeDetermineResponse modelTypeDetermine(ModelTypeDetermineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modelTypeDetermineWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>音频-供机械臂调用</p>
     * 
     * @param request OmniRealtimeConversationEURequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return OmniRealtimeConversationEUResponse
     */
    public OmniRealtimeConversationEUResponse omniRealtimeConversationEUWithOptions(OmniRealtimeConversationEURequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inputAudio)) {
            body.put("inputAudio", request.inputAudio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrompt)) {
            body.put("userPrompt", request.userPrompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("voice", request.voice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OmniRealtimeConversationEU"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/eu/active/interaction/audio"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OmniRealtimeConversationEUResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>音频-供机械臂调用</p>
     * 
     * @param request OmniRealtimeConversationEURequest
     * @return OmniRealtimeConversationEUResponse
     */
    public OmniRealtimeConversationEUResponse omniRealtimeConversationEU(OmniRealtimeConversationEURequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.omniRealtimeConversationEUWithOptions(request, headers, runtime);
    }
}
