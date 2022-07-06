// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imarketing20220704;

import com.aliyun.tea.*;
import com.aliyun.imarketing20220704.models.*;
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
        this._endpoint = this.getEndpoint("imarketing", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDeviceShrinkRequest request = new CreateDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extraMap)) {
            request.extraMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extraMap, "ExtraMap", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("City", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceModelNumber)) {
            body.put("DeviceModelNumber", request.deviceModelNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceName)) {
            body.put("DeviceName", request.deviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceType)) {
            body.put("DeviceType", request.deviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.district)) {
            body.put("District", request.district);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraMapShrink)) {
            body.put("ExtraMap", request.extraMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstScene)) {
            body.put("FirstScene", request.firstScene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.floor)) {
            body.put("Floor", request.floor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationName)) {
            body.put("LocationName", request.locationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mediaId)) {
            body.put("MediaId", request.mediaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerCode)) {
            body.put("OuterCode", request.outerCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            body.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondScene)) {
            body.put("SecondScene", request.secondScene);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDevice"),
            new TeaPair("version", "2022-07-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public GetUserFinishedAdResponse getUserFinishedAdWithOptions(GetUserFinishedAdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserFinishedAd"),
            new TeaPair("version", "2022-07-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserFinishedAdResponse());
    }

    public GetUserFinishedAdResponse getUserFinishedAd(GetUserFinishedAdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserFinishedAdWithOptions(request, runtime);
    }

    public ListAdvertisingResponse listAdvertisingWithOptions(ListAdvertisingRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAdvertisingShrinkRequest request = new ListAdvertisingShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.app))) {
            request.appShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.app), "App", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ext)) {
            request.extShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ext, "Ext", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.imp)) {
            request.impShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.imp, "Imp", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.user))) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.user), "User", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAdvertising"),
            new TeaPair("version", "2022-07-04"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAdvertisingResponse());
    }

    public ListAdvertisingResponse listAdvertising(ListAdvertisingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAdvertisingWithOptions(request, runtime);
    }
}
