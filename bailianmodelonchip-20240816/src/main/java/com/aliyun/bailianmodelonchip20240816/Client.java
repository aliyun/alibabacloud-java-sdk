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
     * <p>创建渠道签约申请</p>
     * 
     * @param request CreateChannelSignRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChannelSignResponse
     */
    public CreateChannelSignResponse createChannelSignWithOptions(CreateChannelSignRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            body.put("channelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contact)) {
            body.put("contact", request.contact);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateChannelSign"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/channel/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChannelSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建渠道签约申请</p>
     * 
     * @param request CreateChannelSignRequest
     * @return CreateChannelSignResponse
     */
    public CreateChannelSignResponse createChannelSign(CreateChannelSignRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createChannelSignWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProductResponse
     */
    public CreateProductResponse createProductWithOptions(CreateProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.euid)) {
            body.put("euid", request.euid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProduct"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/product/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建产品</p>
     * 
     * @param request CreateProductRequest
     * @return CreateProductResponse
     */
    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProduct"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/product/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除产品</p>
     * 
     * @param request DeleteProductRequest
     * @return DeleteProductResponse
     */
    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteProductWithOptions(request, headers, runtime);
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            query.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTime)) {
            query.put("requestTime", request.requestTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signature)) {
            query.put("signature", request.signature);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            body.put("nonce", request.nonce);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <p>查询渠道签约申请</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetChannelSignResponse
     */
    public GetChannelSignResponse getChannelSignWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetChannelSign"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/channel/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetChannelSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询渠道签约申请</p>
     * @return GetChannelSignResponse
     */
    public GetChannelSignResponse getChannelSign() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getChannelSignWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取额度信息</p>
     * 
     * @param request GetQuotaInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQuotaInfoResponse
     */
    public GetQuotaInfoResponse getQuotaInfoWithOptions(GetQuotaInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("recordId", request.recordId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQuotaInfo"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/quota/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQuotaInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取额度信息</p>
     * 
     * @param request GetQuotaInfoRequest
     * @return GetQuotaInfoResponse
     */
    public GetQuotaInfoResponse getQuotaInfo(GetQuotaInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQuotaInfoWithOptions(request, headers, runtime);
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
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonce)) {
            body.put("nonce", request.nonce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
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
     * <p>半托管大模型应用请求</p>
     * 
     * @param tmpReq HalfLLMAppCallRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HalfLLMAppCallResponse
     */
    public HalfLLMAppCallResponse halfLLMAppCallWithOptions(HalfLLMAppCallRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HalfLLMAppCallShrinkRequest request = new HalfLLMAppCallShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizParam)) {
            request.bizParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizParam, "bizParam", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelTypeList)) {
            request.modelTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelTypeList, "modelTypeList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("appId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizParamShrink)) {
            body.put("bizParam", request.bizParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTypeListShrink)) {
            body.put("modelTypeList", request.modelTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HalfLLMAppCall"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/half/llm/app/call"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HalfLLMAppCallResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型应用请求</p>
     * 
     * @param request HalfLLMAppCallRequest
     * @return HalfLLMAppCallResponse
     */
    public HalfLLMAppCallResponse halfLLMAppCall(HalfLLMAppCallRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.halfLLMAppCallWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型流式文本对话</p>
     * 
     * @param request HalfLLMChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HalfLLMChatResponse
     */
    public HalfLLMChatResponse halfLLMChatWithOptions(HalfLLMChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSearch)) {
            body.put("enableSearch", request.enableSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputText)) {
            body.put("inputText", request.inputText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HalfLLMChat"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/half/llm/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HalfLLMChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型流式文本对话</p>
     * 
     * @param request HalfLLMChatRequest
     * @return HalfLLMChatResponse
     */
    public HalfLLMChatResponse halfLLMChat(HalfLLMChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.halfLLMChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型文本合成语音</p>
     * 
     * @param request HalfLLMImageChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HalfLLMImageChatResponse
     */
    public HalfLLMImageChatResponse halfLLMImageChatWithOptions(HalfLLMImageChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSearch)) {
            body.put("enableSearch", request.enableSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputText)) {
            body.put("inputText", request.inputText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HalfLLMImageChat"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/half/llm/image/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HalfLLMImageChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型文本合成语音</p>
     * 
     * @param request HalfLLMImageChatRequest
     * @return HalfLLMImageChatResponse
     */
    public HalfLLMImageChatResponse halfLLMImageChat(HalfLLMImageChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.halfLLMImageChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型图片识别</p>
     * 
     * @param request HalfLLMImageOcrRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HalfLLMImageOcrResponse
     */
    public HalfLLMImageOcrResponse halfLLMImageOcrWithOptions(HalfLLMImageOcrRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            body.put("imageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HalfLLMImageOcr"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/half/llm/image/ocr"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HalfLLMImageOcrResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型图片识别</p>
     * 
     * @param request HalfLLMImageOcrRequest
     * @return HalfLLMImageOcrResponse
     */
    public HalfLLMImageOcrResponse halfLLMImageOcr(HalfLLMImageOcrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.halfLLMImageOcrWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型文本合成语音</p>
     * 
     * @param request HalfLLMTTSChatRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return HalfLLMTTSChatResponse
     */
    public HalfLLMTTSChatResponse halfLLMTTSChatWithOptions(HalfLLMTTSChatRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSearch)) {
            body.put("enableSearch", request.enableSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.format)) {
            body.put("format", request.format);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.model)) {
            body.put("model", request.model);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pitchRate)) {
            body.put("pitchRate", request.pitchRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prompt)) {
            body.put("prompt", request.prompt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sampleRate)) {
            body.put("sampleRate", request.sampleRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("sessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.speechRate)) {
            body.put("speechRate", request.speechRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stream)) {
            body.put("stream", request.stream);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.text)) {
            body.put("text", request.text);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.url)) {
            body.put("url", request.url);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.voice)) {
            body.put("voice", request.voice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.volume)) {
            body.put("volume", request.volume);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HalfLLMTTSChat"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/half/llm/tts/chat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HalfLLMTTSChatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>半托管大模型文本合成语音</p>
     * 
     * @param request HalfLLMTTSChatRequest
     * @return HalfLLMTTSChatResponse
     */
    public HalfLLMTTSChatResponse halfLLMTTSChat(HalfLLMTTSChatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.halfLLMTTSChatWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设备列表分页查询</p>
     * 
     * @param request QueryDevicePageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDevicePageResponse
     */
    public QueryDevicePageResponse queryDevicePageWithOptions(QueryDevicePageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disableStatus)) {
            body.put("disableStatus", request.disableStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDevicePage"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/page"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDevicePageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设备列表分页查询</p>
     * 
     * @param request QueryDevicePageRequest
     * @return QueryDevicePageResponse
     */
    public QueryDevicePageResponse queryDevicePage(QueryDevicePageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDevicePageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询产品</p>
     * 
     * @param request QueryProductPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProductPageResponse
     */
    public QueryProductPageResponse queryProductPageWithOptions(QueryProductPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelType)) {
            body.put("modelType", request.modelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductPage"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/product/page"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询产品</p>
     * 
     * @param request QueryProductPageRequest
     * @return QueryProductPageResponse
     */
    public QueryProductPageResponse queryProductPage(QueryProductPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProductPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询产品额度</p>
     * 
     * @param request QueryProductQuotaPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProductQuotaPageResponse
     */
    public QueryProductQuotaPageResponse queryProductQuotaPageWithOptions(QueryProductQuotaPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            body.put("pageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseTimeEnd)) {
            body.put("purchaseTimeEnd", request.purchaseTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseTimeStart)) {
            body.put("purchaseTimeStart", request.purchaseTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseType)) {
            body.put("purchaseType", request.purchaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductQuotaPage"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/product/quotaPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductQuotaPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询产品额度</p>
     * 
     * @param request QueryProductQuotaPageRequest
     * @return QueryProductQuotaPageResponse
     */
    public QueryProductQuotaPageResponse queryProductQuotaPage(QueryProductQuotaPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryProductQuotaPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询token使用量</p>
     * 
     * @param request QueryTokenUsageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTokenUsageResponse
     */
    public QueryTokenUsageResponse queryTokenUsageWithOptions(QueryTokenUsageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            body.put("endDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            body.put("startDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTokenUsage"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/token/usage/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTokenUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询token使用量</p>
     * 
     * @param request QueryTokenUsageRequest
     * @return QueryTokenUsageResponse
     */
    public QueryTokenUsageResponse queryTokenUsage(QueryTokenUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryTokenUsageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤销渠道签约申请</p>
     * 
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeChannelSignResponse
     */
    public RevokeChannelSignResponse revokeChannelSignWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeChannelSign"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/channel/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeChannelSignResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销渠道签约申请</p>
     * @return RevokeChannelSignResponse
     */
    public RevokeChannelSignResponse revokeChannelSign() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeChannelSignWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备状态</p>
     * 
     * @param request UpdateDeviceStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDeviceStatusResponse
     */
    public UpdateDeviceStatusResponse updateDeviceStatusWithOptions(UpdateDeviceStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("deviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeviceStatus"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/device/v1/update/status"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeviceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改设备状态</p>
     * 
     * @param request UpdateDeviceStatusRequest
     * @return UpdateDeviceStatusResponse
     */
    public UpdateDeviceStatusResponse updateDeviceStatus(UpdateDeviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDeviceStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改图片模型额度</p>
     * 
     * @param request UpdateImageQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateImageQuotaResponse
     */
    public UpdateImageQuotaResponse updateImageQuotaWithOptions(UpdateImageQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationType)) {
            body.put("durationType", request.durationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageCount)) {
            body.put("imageCount", request.imageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseCount)) {
            body.put("licenseCount", request.licenseCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseType)) {
            body.put("purchaseType", request.purchaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("recordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settlementAmount)) {
            body.put("settlementAmount", request.settlementAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitPrice)) {
            body.put("unitPrice", request.unitPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateImageQuota"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/quota/update/image"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateImageQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改图片模型额度</p>
     * 
     * @param request UpdateImageQuotaRequest
     * @return UpdateImageQuotaResponse
     */
    public UpdateImageQuotaResponse updateImageQuota(UpdateImageQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateImageQuotaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改额度</p>
     * 
     * @param request UpdateQuotaRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuotaWithOptions(UpdateQuotaRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.durationType)) {
            body.put("durationType", request.durationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseCount)) {
            body.put("licenseCount", request.licenseCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxQps)) {
            body.put("maxQps", request.maxQps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("packageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productKey)) {
            body.put("productKey", request.productKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseType)) {
            body.put("purchaseType", request.purchaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordId)) {
            body.put("recordId", request.recordId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.settlementAmount)) {
            body.put("settlementAmount", request.settlementAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tenantId)) {
            body.put("tenantId", request.tenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenNumber)) {
            body.put("tokenNumber", request.tokenNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitPrice)) {
            body.put("unitPrice", request.unitPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("userId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQuota"),
            new TeaPair("version", "2024-08-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/api/v1/quota/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改额度</p>
     * 
     * @param request UpdateQuotaRequest
     * @return UpdateQuotaResponse
     */
    public UpdateQuotaResponse updateQuota(UpdateQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateQuotaWithOptions(request, headers, runtime);
    }
}
