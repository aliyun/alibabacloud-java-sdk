// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20200910;

import com.aliyun.tea.*;
import com.aliyun.facebody20200910.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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
     */
    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimized(DetectIPCPedestrianOptimizedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectIPCPedestrianOptimizedWithOptions(request, headers, runtime);
    }

    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimizedWithOptions(DetectIPCPedestrianOptimizedRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageData)) {
            body.put("imageData", request.imageData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.width)) {
            body.put("width", request.width);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("height", request.height);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("DetectIPCPedestrianOptimized", "2020-09-10", "HTTPS", "POST", "AK", "/viapi/k8s/facebody/detect-ipc-pedestrian-optimized", "json", req, runtime), new DetectIPCPedestrianOptimizedResponse());
    }

    public ExecuteServerSideVerificationResponse executeServerSideVerification(ExecuteServerSideVerificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.executeServerSideVerificationWithOptions(request, headers, runtime);
    }

    public ExecuteServerSideVerificationResponse executeServerSideVerificationWithOptions(ExecuteServerSideVerificationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequestWithForm("ExecuteServerSideVerification", "2020-09-10", "HTTPS", "POST", "AK", "/viapi/thirdparty/realperson/execServerSideVerification", "json", req, runtime), new ExecuteServerSideVerificationResponse());
    }
}
