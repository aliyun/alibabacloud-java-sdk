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
}
