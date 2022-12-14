// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910;

import com.aliyun.tea.*;
import com.aliyun.facebody20200910.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("facebody", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * 行人检测快速版
      *
      * @param request DetectIPCPedestrianOptimizedRequest
      * @param headers map
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetectIPCPedestrianOptimizedResponse
     */
    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimizedWithOptions(DetectIPCPedestrianOptimizedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("height", request.height);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageData)) {
            body.put("imageData", request.imageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("width", request.width);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetectIPCPedestrianOptimized"),
            new TeaPair("version", "2020-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/viapi/k8s/facebody/detect-ipc-pedestrian-optimized"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetectIPCPedestrianOptimizedResponse());
    }

    /**
      * 行人检测快速版
      *
      * @param request DetectIPCPedestrianOptimizedRequest
      * @return DetectIPCPedestrianOptimizedResponse
     */
    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimized(DetectIPCPedestrianOptimizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectIPCPedestrianOptimizedWithOptions(request, headers, runtime);
    }

    public ExecuteServerSideVerificationResponse executeServerSideVerificationWithOptions(ExecuteServerSideVerificationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateName)) {
            body.put("certificateName", request.certificateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certificateNumber)) {
            body.put("certificateNumber", request.certificateNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facialPictureData)) {
            body.put("facialPictureData", request.facialPictureData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.facialPictureUrl)) {
            body.put("facialPictureUrl", request.facialPictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneType)) {
            body.put("sceneType", request.sceneType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteServerSideVerification"),
            new TeaPair("version", "2020-09-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/viapi/thirdparty/realperson/execServerSideVerification"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteServerSideVerificationResponse());
    }

    public ExecuteServerSideVerificationResponse executeServerSideVerification(ExecuteServerSideVerificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeServerSideVerificationWithOptions(request, headers, runtime);
    }
}
