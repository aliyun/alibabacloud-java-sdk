// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0;

import com.aliyun.tea.*;
import com.aliyun.aligenieip_1_0.models.*;

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

    public AddMessageTemplateResponse addMessageTemplate(AddMessageTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddMessageTemplateHeaders headers = new AddMessageTemplateHeaders();
        return this.addMessageTemplateWithOptions(request, headers, runtime);
    }

    public AddMessageTemplateResponse addMessageTemplateWithOptions(AddMessageTemplateRequest request, AddMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateDetail)) {
            body.put("TemplateDetail", request.templateDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            body.put("TemplateName", request.templateName);
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
            new TeaPair("action", "AddMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/addMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMessageTemplateResponse());
    }

    public BatchAddHotelRoomResponse batchAddHotelRoom(BatchAddHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchAddHotelRoomHeaders headers = new BatchAddHotelRoomHeaders();
        return this.batchAddHotelRoomWithOptions(request, headers, runtime);
    }

    public BatchAddHotelRoomResponse batchAddHotelRoomWithOptions(BatchAddHotelRoomRequest tmpReq, BatchAddHotelRoomHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchAddHotelRoomShrinkRequest request = new BatchAddHotelRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomNoList)) {
            request.roomNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomNoList, "RoomNoList", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNoListShrink)) {
            body.put("RoomNoList", request.roomNoListShrink);
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
            new TeaPair("action", "BatchAddHotelRoom"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/batchAddHotelRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddHotelRoomResponse());
    }

    public BatchDeleteHotelRoomResponse batchDeleteHotelRoom(BatchDeleteHotelRoomRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BatchDeleteHotelRoomHeaders headers = new BatchDeleteHotelRoomHeaders();
        return this.batchDeleteHotelRoomWithOptions(request, headers, runtime);
    }

    public BatchDeleteHotelRoomResponse batchDeleteHotelRoomWithOptions(BatchDeleteHotelRoomRequest tmpReq, BatchDeleteHotelRoomHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchDeleteHotelRoomShrinkRequest request = new BatchDeleteHotelRoomShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomNoList)) {
            request.roomNoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomNoList, "RoomNoList", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNoListShrink)) {
            body.put("RoomNoList", request.roomNoListShrink);
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
            new TeaPair("action", "BatchDeleteHotelRoom"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/batchDeleteHotelRoom"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteHotelRoomResponse());
    }

    public CreateHotelAlarmResponse createHotelAlarm(CreateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateHotelAlarmHeaders headers = new CreateHotelAlarmHeaders();
        return this.createHotelAlarmWithOptions(request, headers, runtime);
    }

    public CreateHotelAlarmResponse createHotelAlarmWithOptions(CreateHotelAlarmRequest tmpReq, CreateHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateHotelAlarmShrinkRequest request = new CreateHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rooms)) {
            request.roomsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rooms, "Rooms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.scheduleInfo))) {
            request.scheduleInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.scheduleInfo), "ScheduleInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.musicType)) {
            body.put("MusicType", request.musicType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomsShrink)) {
            body.put("Rooms", request.roomsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleInfoShrink)) {
            body.put("ScheduleInfo", request.scheduleInfoShrink);
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
            new TeaPair("action", "CreateHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/createHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHotelAlarmResponse());
    }

    public DeleteHotelAlarmResponse deleteHotelAlarm(DeleteHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteHotelAlarmHeaders headers = new DeleteHotelAlarmHeaders();
        return this.deleteHotelAlarmWithOptions(request, headers, runtime);
    }

    public DeleteHotelAlarmResponse deleteHotelAlarmWithOptions(DeleteHotelAlarmRequest tmpReq, DeleteHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteHotelAlarmShrinkRequest request = new DeleteHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarms)) {
            request.alarmsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarms, "Alarms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmsShrink)) {
            body.put("Alarms", request.alarmsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
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
            new TeaPair("action", "DeleteHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deleteHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHotelAlarmResponse());
    }

    public DeviceControlResponse deviceControl(DeviceControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeviceControlHeaders headers = new DeviceControlHeaders();
        return this.deviceControlWithOptions(request, headers, runtime);
    }

    public DeviceControlResponse deviceControlWithOptions(DeviceControlRequest tmpReq, DeviceControlHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeviceControlShrinkRequest request = new DeviceControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "DeviceControl"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/deviceControl"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeviceControlResponse());
    }

    public GetHotelHomeBackImageAndModesResponse getHotelHomeBackImageAndModes(GetHotelHomeBackImageAndModesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelHomeBackImageAndModesHeaders headers = new GetHotelHomeBackImageAndModesHeaders();
        return this.getHotelHomeBackImageAndModesWithOptions(request, headers, runtime);
    }

    public GetHotelHomeBackImageAndModesResponse getHotelHomeBackImageAndModesWithOptions(GetHotelHomeBackImageAndModesRequest tmpReq, GetHotelHomeBackImageAndModesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelHomeBackImageAndModesShrinkRequest request = new GetHotelHomeBackImageAndModesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "GetHotelHomeBackImageAndModes"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelHomeBackImageAndModes"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelHomeBackImageAndModesResponse());
    }

    public GetHotelNoticeResponse getHotelNotice(GetHotelNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelNoticeHeaders headers = new GetHotelNoticeHeaders();
        return this.getHotelNoticeWithOptions(request, headers, runtime);
    }

    public GetHotelNoticeResponse getHotelNoticeWithOptions(GetHotelNoticeRequest tmpReq, GetHotelNoticeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelNoticeShrinkRequest request = new GetHotelNoticeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "GetHotelNotice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelNotice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelNoticeResponse());
    }

    public GetHotelOrderDetailResponse getHotelOrderDetail(GetHotelOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelOrderDetailHeaders headers = new GetHotelOrderDetailHeaders();
        return this.getHotelOrderDetailWithOptions(request, headers, runtime);
    }

    public GetHotelOrderDetailResponse getHotelOrderDetailWithOptions(GetHotelOrderDetailRequest tmpReq, GetHotelOrderDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelOrderDetailShrinkRequest request = new GetHotelOrderDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "GetHotelOrderDetail"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelOrderDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelOrderDetailResponse());
    }

    public GetHotelRoomDeviceResponse getHotelRoomDevice(GetHotelRoomDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelRoomDeviceHeaders headers = new GetHotelRoomDeviceHeaders();
        return this.getHotelRoomDeviceWithOptions(request, headers, runtime);
    }

    public GetHotelRoomDeviceResponse getHotelRoomDeviceWithOptions(GetHotelRoomDeviceRequest request, GetHotelRoomDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            query.put("RoomNo", request.roomNo);
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
            new TeaPair("action", "GetHotelRoomDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelRoomDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelRoomDeviceResponse());
    }

    public GetHotelSampleUtterancesResponse getHotelSampleUtterances(GetHotelSampleUtterancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelSampleUtterancesHeaders headers = new GetHotelSampleUtterancesHeaders();
        return this.getHotelSampleUtterancesWithOptions(request, headers, runtime);
    }

    public GetHotelSampleUtterancesResponse getHotelSampleUtterancesWithOptions(GetHotelSampleUtterancesRequest tmpReq, GetHotelSampleUtterancesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelSampleUtterancesShrinkRequest request = new GetHotelSampleUtterancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "GetHotelSampleUtterances"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelSampleUtterances"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelSampleUtterancesResponse());
    }

    public GetHotelScreenSaverResponse getHotelScreenSaver(GetHotelScreenSaverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetHotelScreenSaverHeaders headers = new GetHotelScreenSaverHeaders();
        return this.getHotelScreenSaverWithOptions(request, headers, runtime);
    }

    public GetHotelScreenSaverResponse getHotelScreenSaverWithOptions(GetHotelScreenSaverRequest tmpReq, GetHotelScreenSaverHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetHotelScreenSaverShrinkRequest request = new GetHotelScreenSaverShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "GetHotelScreenSaver"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelScreenSaver"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotelScreenSaverResponse());
    }

    public ImportRoomControlDevicesResponse importRoomControlDevices(ImportRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ImportRoomControlDevicesHeaders headers = new ImportRoomControlDevicesHeaders();
        return this.importRoomControlDevicesWithOptions(request, headers, runtime);
    }

    public ImportRoomControlDevicesResponse importRoomControlDevicesWithOptions(ImportRoomControlDevicesRequest tmpReq, ImportRoomControlDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ImportRoomControlDevicesShrinkRequest request = new ImportRoomControlDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.locationDevices)) {
            request.locationDevicesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.locationDevices, "LocationDevices", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationDevicesShrink)) {
            body.put("LocationDevices", request.locationDevicesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            body.put("RoomNo", request.roomNo);
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
            new TeaPair("action", "ImportRoomControlDevices"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/importRoomControlDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportRoomControlDevicesResponse());
    }

    public ListHotelAlarmResponse listHotelAlarm(ListHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelAlarmHeaders headers = new ListHotelAlarmHeaders();
        return this.listHotelAlarmWithOptions(request, headers, runtime);
    }

    public ListHotelAlarmResponse listHotelAlarmWithOptions(ListHotelAlarmRequest tmpReq, ListHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelAlarmShrinkRequest request = new ListHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rooms)) {
            request.roomsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rooms, "Rooms", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomsShrink)) {
            body.put("Rooms", request.roomsShrink);
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
            new TeaPair("action", "ListHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/getHotelAlarmList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelAlarmResponse());
    }

    public ListHotelControlDeviceResponse listHotelControlDevice(ListHotelControlDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelControlDeviceHeaders headers = new ListHotelControlDeviceHeaders();
        return this.listHotelControlDeviceWithOptions(request, headers, runtime);
    }

    public ListHotelControlDeviceResponse listHotelControlDeviceWithOptions(ListHotelControlDeviceRequest tmpReq, ListHotelControlDeviceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelControlDeviceShrinkRequest request = new ListHotelControlDeviceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "ListHotelControlDevice"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelControlDevice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelControlDeviceResponse());
    }

    public ListHotelInfoResponse listHotelInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelInfoHeaders headers = new ListHotelInfoHeaders();
        return this.listHotelInfoWithOptions(headers, runtime);
    }

    public ListHotelInfoResponse listHotelInfoWithOptions(ListHotelInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelInfo"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelInfoResponse());
    }

    public ListHotelMessageTemplateResponse listHotelMessageTemplate() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelMessageTemplateHeaders headers = new ListHotelMessageTemplateHeaders();
        return this.listHotelMessageTemplateWithOptions(headers, runtime);
    }

    public ListHotelMessageTemplateResponse listHotelMessageTemplateWithOptions(ListHotelMessageTemplateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListHotelMessageTemplate"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelMessageTemplate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelMessageTemplateResponse());
    }

    public ListHotelOrderResponse listHotelOrder(ListHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelOrderHeaders headers = new ListHotelOrderHeaders();
        return this.listHotelOrderWithOptions(request, headers, runtime);
    }

    public ListHotelOrderResponse listHotelOrderWithOptions(ListHotelOrderRequest tmpReq, ListHotelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelOrderShrinkRequest request = new ListHotelOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "ListHotelOrder"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelOrderResponse());
    }

    public ListHotelRoomsResponse listHotelRooms(ListHotelRoomsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelRoomsHeaders headers = new ListHotelRoomsHeaders();
        return this.listHotelRoomsWithOptions(request, headers, runtime);
    }

    public ListHotelRoomsResponse listHotelRoomsWithOptions(ListHotelRoomsRequest request, ListHotelRoomsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
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
            new TeaPair("action", "ListHotelRooms"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelRooms"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelRoomsResponse());
    }

    public ListHotelSceneItemResponse listHotelSceneItem(ListHotelSceneItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelSceneItemHeaders headers = new ListHotelSceneItemHeaders();
        return this.listHotelSceneItemWithOptions(request, headers, runtime);
    }

    public ListHotelSceneItemResponse listHotelSceneItemWithOptions(ListHotelSceneItemRequest tmpReq, ListHotelSceneItemHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelSceneItemShrinkRequest request = new ListHotelSceneItemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "ListHotelSceneItem"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelSceneItem"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelSceneItemResponse());
    }

    public ListHotelServiceCategoryResponse listHotelServiceCategory(ListHotelServiceCategoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListHotelServiceCategoryHeaders headers = new ListHotelServiceCategoryHeaders();
        return this.listHotelServiceCategoryWithOptions(request, headers, runtime);
    }

    public ListHotelServiceCategoryResponse listHotelServiceCategoryWithOptions(ListHotelServiceCategoryRequest tmpReq, ListHotelServiceCategoryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListHotelServiceCategoryShrinkRequest request = new ListHotelServiceCategoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "ListHotelServiceCategory"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/listHotelServiceCategory"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListHotelServiceCategoryResponse());
    }

    public PushHotelMessageResponse pushHotelMessage(PushHotelMessageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PushHotelMessageHeaders headers = new PushHotelMessageHeaders();
        return this.pushHotelMessageWithOptions(request, headers, runtime);
    }

    public PushHotelMessageResponse pushHotelMessageWithOptions(PushHotelMessageRequest tmpReq, PushHotelMessageHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushHotelMessageShrinkRequest request = new PushHotelMessageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.pushHotelMessageReq))) {
            request.pushHotelMessageReqShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.pushHotelMessageReq), "PushHotelMessageReq", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pushHotelMessageReqShrink)) {
            query.put("PushHotelMessageReq", request.pushHotelMessageReqShrink);
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
            new TeaPair("action", "PushHotelMessage"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/pushHotelMessage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushHotelMessageResponse());
    }

    public QueryDeviceStatusResponse queryDeviceStatus(QueryDeviceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryDeviceStatusHeaders headers = new QueryDeviceStatusHeaders();
        return this.queryDeviceStatusWithOptions(request, headers, runtime);
    }

    public QueryDeviceStatusResponse queryDeviceStatusWithOptions(QueryDeviceStatusRequest tmpReq, QueryDeviceStatusHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryDeviceStatusShrinkRequest request = new QueryDeviceStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "QueryDeviceStatus"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryDeviceStatus"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDeviceStatusResponse());
    }

    public QueryHotelProductResponse queryHotelProduct(QueryHotelProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryHotelProductHeaders headers = new QueryHotelProductHeaders();
        return this.queryHotelProductWithOptions(request, headers, runtime);
    }

    public QueryHotelProductResponse queryHotelProductWithOptions(QueryHotelProductRequest tmpReq, QueryHotelProductHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryHotelProductShrinkRequest request = new QueryHotelProductShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "QueryHotelProduct"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryHotelProduct"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotelProductResponse());
    }

    public QueryRoomControlDevicesResponse queryRoomControlDevices(QueryRoomControlDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryRoomControlDevicesHeaders headers = new QueryRoomControlDevicesHeaders();
        return this.queryRoomControlDevicesWithOptions(request, headers, runtime);
    }

    public QueryRoomControlDevicesResponse queryRoomControlDevicesWithOptions(QueryRoomControlDevicesRequest request, QueryRoomControlDevicesHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNo)) {
            query.put("RoomNo", request.roomNo);
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
            new TeaPair("action", "QueryRoomControlDevices"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/queryRoomControlDevices"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRoomControlDevicesResponse());
    }

    public RoomCheckOutResponse roomCheckOut(RoomCheckOutRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RoomCheckOutHeaders headers = new RoomCheckOutHeaders();
        return this.roomCheckOutWithOptions(request, headers, runtime);
    }

    public RoomCheckOutResponse roomCheckOutWithOptions(RoomCheckOutRequest tmpReq, RoomCheckOutHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RoomCheckOutShrinkRequest request = new RoomCheckOutShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.deviceInfo))) {
            request.deviceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.deviceInfo), "DeviceInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
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
            new TeaPair("action", "RoomCheckOut"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/roomCheckOut"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RoomCheckOutResponse());
    }

    public SubmitHotelOrderResponse submitHotelOrder(SubmitHotelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SubmitHotelOrderHeaders headers = new SubmitHotelOrderHeaders();
        return this.submitHotelOrderWithOptions(request, headers, runtime);
    }

    public SubmitHotelOrderResponse submitHotelOrderWithOptions(SubmitHotelOrderRequest tmpReq, SubmitHotelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitHotelOrderShrinkRequest request = new SubmitHotelOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.payload))) {
            request.payloadShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.payload), "Payload", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.userInfo))) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.userInfo), "UserInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.payloadShrink)) {
            query.put("Payload", request.payloadShrink);
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
            new TeaPair("action", "SubmitHotelOrder"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/submitHotelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitHotelOrderResponse());
    }

    public UpdateHotelAlarmResponse updateHotelAlarm(UpdateHotelAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateHotelAlarmHeaders headers = new UpdateHotelAlarmHeaders();
        return this.updateHotelAlarmWithOptions(request, headers, runtime);
    }

    public UpdateHotelAlarmResponse updateHotelAlarmWithOptions(UpdateHotelAlarmRequest tmpReq, UpdateHotelAlarmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateHotelAlarmShrinkRequest request = new UpdateHotelAlarmShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alarms)) {
            request.alarmsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alarms, "Alarms", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.scheduleInfo))) {
            request.scheduleInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.scheduleInfo), "ScheduleInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmsShrink)) {
            body.put("Alarms", request.alarmsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            body.put("HotelId", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleInfoShrink)) {
            body.put("ScheduleInfo", request.scheduleInfoShrink);
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
            new TeaPair("action", "UpdateHotelAlarm"),
            new TeaPair("version", "ip_1.0"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v1.0/ip/updateHotelAlarm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateHotelAlarmResponse());
    }
}
