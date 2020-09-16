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
     */
    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimized(DetectIPCPedestrianOptimizedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.detectIPCPedestrianOptimizedWithOptions(request, headers, runtime);
    }

    public DetectIPCPedestrianOptimizedResponse detectIPCPedestrianOptimizedWithOptions(DetectIPCPedestrianOptimizedRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        body.put("imageData", request.imageData);
        body.put("width", request.width);
        body.put("height", request.height);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", body)
        ));
        return TeaModel.toModel(this.doROARequestWithForm("DetectIPCPedestrianOptimized", "2020-09-10", "HTTPS", "POST", "AK", "/viapi/k8s/facebody/detect-ipc-pedestrian-optimized", "json", req, runtime), new DetectIPCPedestrianOptimizedResponse());
    }
}
