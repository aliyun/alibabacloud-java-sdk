// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ailab_vision_public20210709;

import com.aliyun.tea.*;
import com.aliyun.ailab_vision_public20210709.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ailab-vision-public", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CalibResponse calib(CalibRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.calibWithOptions(request, headers, runtime);
    }

    public CalibResponse calibWithOptions(CalibRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floorId)) {
            body.put("floorId", request.floorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraId)) {
            body.put("cameraId", request.cameraId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.featureMatch))) {
            body.put("featureMatch", request.featureMatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraType)) {
            body.put("cameraType", request.cameraType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoomLevel)) {
            body.put("zoomLevel", request.zoomLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kptsNum)) {
            body.put("kptsNum", request.kptsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reprojectThresh)) {
            body.put("reprojectThresh", request.reprojectThresh);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("Calib", "2021-07-09", "HTTPS", "POST", "AK", "/api/predict/calib", "json", req, runtime), new CalibResponse());
    }

    public ReidBodyResponse reidBody(ReidBodyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reidBodyWithOptions(request, headers, runtime);
    }

    public ReidBodyResponse reidBodyWithOptions(ReidBodyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ReidBody", "2021-07-09", "HTTPS", "POST", "AK", "/api/predict/reid_pub", "json", req, runtime), new ReidBodyResponse());
    }

    public AttrBodyResponse attrBody(AttrBodyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attrBodyWithOptions(request, headers, runtime);
    }

    public AttrBodyResponse attrBodyWithOptions(AttrBodyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AttrBody", "2021-07-09", "HTTPS", "POST", "AK", "/api/attr_body", "json", req, runtime), new AttrBodyResponse());
    }

    public ReidFaceResponse reidFace(ReidFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.reidFaceWithOptions(request, headers, runtime);
    }

    public ReidFaceResponse reidFaceWithOptions(ReidFaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("ReidFace", "2021-07-09", "HTTPS", "POST", "AK", "/api/reid_face", "json", req, runtime), new ReidFaceResponse());
    }

    public AttrFaceResponse attrFace(AttrFaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attrFaceWithOptions(request, headers, runtime);
    }

    public AttrFaceResponse attrFaceWithOptions(AttrFaceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("AttrFace", "2021-07-09", "HTTPS", "POST", "AK", "/api/attr_face", "json", req, runtime), new AttrFaceResponse());
    }

    public MatchResponse match(MatchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.matchWithOptions(request, headers, runtime);
    }

    public MatchResponse matchWithOptions(MatchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pictureUrl)) {
            body.put("pictureUrl", request.pictureUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            body.put("sceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floorId)) {
            body.put("floorId", request.floorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraId)) {
            body.put("cameraId", request.cameraId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cameraCoord)) {
            body.put("cameraCoord", request.cameraCoord);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("Match", "2021-07-09", "HTTPS", "POST", "AK", "/api/predict/match", "json", req, runtime), new MatchResponse());
    }
}
