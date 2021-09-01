// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fcc20210331;

import com.aliyun.tea.*;
import com.aliyun.fcc20210331.models.*;
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
        this._endpoint = this.getEndpoint("fcc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAbilityByDeviceIdResponse addAbilityByDeviceIdWithOptions(AddAbilityByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAbilityByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddAbilityByDeviceIdResponse());
    }

    public AddAbilityByDeviceIdResponse addAbilityByDeviceId(AddAbilityByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAbilityByDeviceIdWithOptions(request, runtime);
    }

    public AddCameraResponse addCameraWithOptions(AddCameraRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddCamera", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddCameraResponse());
    }

    public AddCameraResponse addCamera(AddCameraRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addCameraWithOptions(request, runtime);
    }

    public AddChannelResponse addChannelWithOptions(AddChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddChannel", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddChannelResponse());
    }

    public AddChannelResponse addChannel(AddChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addChannelWithOptions(request, runtime);
    }

    public AddDeviceAbilityResponse addDeviceAbilityWithOptions(AddDeviceAbilityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddDeviceAbilityShrinkRequest request = new AddDeviceAbilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTimes)) {
            request.scheduleTimesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTimes, "ScheduleTimes", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddDeviceAbility", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddDeviceAbilityResponse());
    }

    public AddDeviceAbilityResponse addDeviceAbility(AddDeviceAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addDeviceAbilityWithOptions(request, runtime);
    }

    public AddEdgeDevicesResponse addEdgeDevicesWithOptions(AddEdgeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddEdgeDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddEdgeDevicesResponse());
    }

    public AddEdgeDevicesResponse addEdgeDevices(AddEdgeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addEdgeDevicesWithOptions(request, runtime);
    }

    public AddUserLibraryResponse addUserLibraryWithOptions(AddUserLibraryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserLibrary", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserLibraryResponse());
    }

    public AddUserLibraryResponse addUserLibrary(AddUserLibraryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserLibraryWithOptions(request, runtime);
    }

    public AddUserLibraryByZipResponse addUserLibraryByZipWithOptions(AddUserLibraryByZipRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddUserLibraryByZipShrinkRequest request = new AddUserLibraryByZipShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.photo)) {
            request.photoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.photo, "Photo", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUserLibraryByZip", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new AddUserLibraryByZipResponse());
    }

    public AddUserLibraryByZipResponse addUserLibraryByZip(AddUserLibraryByZipRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserLibraryByZipWithOptions(request, runtime);
    }

    public BindEdgeDeviceResponse bindEdgeDeviceWithOptions(BindEdgeDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BindEdgeDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new BindEdgeDeviceResponse());
    }

    public BindEdgeDeviceResponse bindEdgeDevice(BindEdgeDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindEdgeDeviceWithOptions(request, runtime);
    }

    public CreateCorpResponse createCorpWithOptions(CreateCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCorp", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCorpResponse());
    }

    public CreateCorpResponse createCorp(CreateCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCorpWithOptions(request, runtime);
    }

    public CreateCorpInfoResponse createCorpInfoWithOptions(CreateCorpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCorpInfo", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCorpInfoResponse());
    }

    public CreateCorpInfoResponse createCorpInfo(CreateCorpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCorpInfoWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public DeleteAbilityConfigByDeviceIdResponse deleteAbilityConfigByDeviceIdWithOptions(DeleteAbilityConfigByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAbilityConfigByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAbilityConfigByDeviceIdResponse());
    }

    public DeleteAbilityConfigByDeviceIdResponse deleteAbilityConfigByDeviceId(DeleteAbilityConfigByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAbilityConfigByDeviceIdWithOptions(request, runtime);
    }

    public DeleteCorpResponse deleteCorpWithOptions(DeleteCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCorp", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCorpResponse());
    }

    public DeleteCorpResponse deleteCorp(DeleteCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCorpWithOptions(request, runtime);
    }

    public DeleteIpcDeviceResponse deleteIpcDeviceWithOptions(DeleteIpcDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpcDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpcDeviceResponse());
    }

    public DeleteIpcDeviceResponse deleteIpcDevice(DeleteIpcDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpcDeviceWithOptions(request, runtime);
    }

    public DeleteNvrChannelResponse deleteNvrChannelWithOptions(DeleteNvrChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNvrChannel", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNvrChannelResponse());
    }

    public DeleteNvrChannelResponse deleteNvrChannel(DeleteNvrChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNvrChannelWithOptions(request, runtime);
    }

    public DeleteNvrDeviceResponse deleteNvrDeviceWithOptions(DeleteNvrDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNvrDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNvrDeviceResponse());
    }

    public DeleteNvrDeviceResponse deleteNvrDevice(DeleteNvrDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNvrDeviceWithOptions(request, runtime);
    }

    public DeleteUserLibraryByIdResponse deleteUserLibraryByIdWithOptions(DeleteUserLibraryByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserLibraryById", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserLibraryByIdResponse());
    }

    public DeleteUserLibraryByIdResponse deleteUserLibraryById(DeleteUserLibraryByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserLibraryByIdWithOptions(request, runtime);
    }

    public DescribeDevicesResponse describeDevicesWithOptions(DescribeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDevicesResponse());
    }

    public DescribeDevicesResponse describeDevices(DescribeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDevicesWithOptions(request, runtime);
    }

    public FullUploadFileResponseResponse fullUploadFileResponseWithOptions(FullUploadFileResponseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FullUploadFileResponse", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new FullUploadFileResponseResponse());
    }

    public FullUploadFileResponseResponse fullUploadFileResponse(FullUploadFileResponseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.fullUploadFileResponseWithOptions(request, runtime);
    }

    public GetAbilityConfigListByDeviceIdResponse getAbilityConfigListByDeviceIdWithOptions(GetAbilityConfigListByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAbilityConfigListByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetAbilityConfigListByDeviceIdResponse());
    }

    public GetAbilityConfigListByDeviceIdResponse getAbilityConfigListByDeviceId(GetAbilityConfigListByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAbilityConfigListByDeviceIdWithOptions(request, runtime);
    }

    public GetAbilityDetailByDeviceIdResponse getAbilityDetailByDeviceIdWithOptions(GetAbilityDetailByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAbilityDetailByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetAbilityDetailByDeviceIdResponse());
    }

    public GetAbilityDetailByDeviceIdResponse getAbilityDetailByDeviceId(GetAbilityDetailByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAbilityDetailByDeviceIdWithOptions(request, runtime);
    }

    public GetAllEdgeDevicesResponse getAllEdgeDevicesWithOptions(GetAllEdgeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllEdgeDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllEdgeDevicesResponse());
    }

    public GetAllEdgeDevicesResponse getAllEdgeDevices(GetAllEdgeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllEdgeDevicesWithOptions(request, runtime);
    }

    public GetAllVideoDevicesResponse getAllVideoDevicesWithOptions(GetAllVideoDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllVideoDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetAllVideoDevicesResponse());
    }

    public GetAllVideoDevicesResponse getAllVideoDevices(GetAllVideoDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllVideoDevicesWithOptions(request, runtime);
    }

    public GetDeviceInfoResponse getDeviceInfoWithOptions(GetDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceInfo", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceInfoResponse());
    }

    public GetDeviceInfoResponse getDeviceInfo(GetDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceInfoWithOptions(request, runtime);
    }

    public GetDeviceInfoByIdResponse getDeviceInfoByIdWithOptions(GetDeviceInfoByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceInfoById", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceInfoByIdResponse());
    }

    public GetDeviceInfoByIdResponse getDeviceInfoById(GetDeviceInfoByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceInfoByIdWithOptions(request, runtime);
    }

    public GetEdgeAbilitiesResponse getEdgeAbilitiesWithOptions(GetEdgeAbilitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEdgeAbilities", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetEdgeAbilitiesResponse());
    }

    public GetEdgeAbilitiesResponse getEdgeAbilities(GetEdgeAbilitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeAbilitiesWithOptions(request, runtime);
    }

    public GetEventDatasResponse getEventDatasWithOptions(GetEventDatasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventDatas", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventDatasResponse());
    }

    public GetEventDatasResponse getEventDatas(GetEventDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventDatasWithOptions(request, runtime);
    }

    public GetEventInfosResponse getEventInfosWithOptions(GetEventInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventInfos", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventInfosResponse());
    }

    public GetEventInfosResponse getEventInfos(GetEventInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventInfosWithOptions(request, runtime);
    }

    public GetEventMistakeDatasResponse getEventMistakeDatasWithOptions(GetEventMistakeDatasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventMistakeDatas", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventMistakeDatasResponse());
    }

    public GetEventMistakeDatasResponse getEventMistakeDatas(GetEventMistakeDatasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventMistakeDatasWithOptions(request, runtime);
    }

    public GetIpcDetailResponse getIpcDetailWithOptions(GetIpcDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpcDetail", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetIpcDetailResponse());
    }

    public GetIpcDetailResponse getIpcDetail(GetIpcDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpcDetailWithOptions(request, runtime);
    }

    public GetPhotoUrlResponse getPhotoUrlWithOptions(GetPhotoUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhotoUrl", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetPhotoUrlResponse());
    }

    public GetPhotoUrlResponse getPhotoUrl(GetPhotoUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhotoUrlWithOptions(request, runtime);
    }

    public GetUnbindedEdgeDevicesResponse getUnbindedEdgeDevicesWithOptions(GetUnbindedEdgeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUnbindedEdgeDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetUnbindedEdgeDevicesResponse());
    }

    public GetUnbindedEdgeDevicesResponse getUnbindedEdgeDevices(GetUnbindedEdgeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUnbindedEdgeDevicesWithOptions(request, runtime);
    }

    public GetUserLibraryByIdResponse getUserLibraryByIdWithOptions(GetUserLibraryByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserLibraryById", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserLibraryByIdResponse());
    }

    public GetUserLibraryByIdResponse getUserLibraryById(GetUserLibraryByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserLibraryByIdWithOptions(request, runtime);
    }

    public GetVideoDeviceByIdResponse getVideoDeviceByIdWithOptions(GetVideoDeviceByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoDeviceById", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoDeviceByIdResponse());
    }

    public GetVideoDeviceByIdResponse getVideoDeviceById(GetVideoDeviceByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoDeviceByIdWithOptions(request, runtime);
    }

    public GetVideoPlayUrlResponse getVideoPlayUrlWithOptions(GetVideoPlayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoPlayUrl", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoPlayUrlResponse());
    }

    public GetVideoPlayUrlResponse getVideoPlayUrl(GetVideoPlayUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoPlayUrlWithOptions(request, runtime);
    }

    public GetVideoScreenShotResponse getVideoScreenShotWithOptions(GetVideoScreenShotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetVideoScreenShot", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new GetVideoScreenShotResponse());
    }

    public GetVideoScreenShotResponse getVideoScreenShot(GetVideoScreenShotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getVideoScreenShotWithOptions(request, runtime);
    }

    public ListAllProfessionResponse listAllProfessionWithOptions(ListAllProfessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAllProfession", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListAllProfessionResponse());
    }

    public ListAllProfessionResponse listAllProfession(ListAllProfessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAllProfessionWithOptions(request, runtime);
    }

    public ListCorpResponse listCorpWithOptions(ListCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorp", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpResponse());
    }

    public ListCorpResponse listCorp(ListCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpWithOptions(request, runtime);
    }

    public ListCorpsResponse listCorpsWithOptions(ListCorpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCorps", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListCorpsResponse());
    }

    public ListCorpsResponse listCorps(ListCorpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCorpsWithOptions(request, runtime);
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetailsWithOptions(ListEventAlgorithmDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEventAlgorithmDetails", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListEventAlgorithmDetailsResponse());
    }

    public ListEventAlgorithmDetailsResponse listEventAlgorithmDetails(ListEventAlgorithmDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEventAlgorithmDetailsWithOptions(request, runtime);
    }

    public ListFccProductOrdersResponse listFccProductOrdersWithOptions(ListFccProductOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFccProductOrders", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListFccProductOrdersResponse());
    }

    public ListFccProductOrdersResponse listFccProductOrders(ListFccProductOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFccProductOrdersWithOptions(request, runtime);
    }

    public ListIpcDevicesResponse listIpcDevicesWithOptions(ListIpcDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpcDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListIpcDevicesResponse());
    }

    public ListIpcDevicesResponse listIpcDevices(ListIpcDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpcDevicesWithOptions(request, runtime);
    }

    public ListNvrChannelDevicesResponse listNvrChannelDevicesWithOptions(ListNvrChannelDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNvrChannelDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListNvrChannelDevicesResponse());
    }

    public ListNvrChannelDevicesResponse listNvrChannelDevices(ListNvrChannelDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNvrChannelDevicesWithOptions(request, runtime);
    }

    public ListNvrDevicesResponse listNvrDevicesWithOptions(ListNvrDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNvrDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListNvrDevicesResponse());
    }

    public ListNvrDevicesResponse listNvrDevices(ListNvrDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNvrDevicesWithOptions(request, runtime);
    }

    public ListUserLibraryByPageResponse listUserLibraryByPageWithOptions(ListUserLibraryByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserLibraryByPage", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserLibraryByPageResponse());
    }

    public ListUserLibraryByPageResponse listUserLibraryByPage(ListUserLibraryByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserLibraryByPageWithOptions(request, runtime);
    }

    public MarkEventDataMistakeResponse markEventDataMistakeWithOptions(MarkEventDataMistakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("MarkEventDataMistake", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new MarkEventDataMistakeResponse());
    }

    public MarkEventDataMistakeResponse markEventDataMistake(MarkEventDataMistakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.markEventDataMistakeWithOptions(request, runtime);
    }

    public RegisterCredentialResponse registerCredentialWithOptions(RegisterCredentialRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterCredential", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterCredentialResponse());
    }

    public RegisterCredentialResponse registerCredential(RegisterCredentialRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerCredentialWithOptions(request, runtime);
    }

    public RegisterEdgeDeviceResponse registerEdgeDeviceWithOptions(RegisterEdgeDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterEdgeDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterEdgeDeviceResponse());
    }

    public RegisterEdgeDeviceResponse registerEdgeDevice(RegisterEdgeDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerEdgeDeviceWithOptions(request, runtime);
    }

    public RemoveEdgeDeviceInfoResponse removeEdgeDeviceInfoWithOptions(RemoveEdgeDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEdgeDeviceInfo", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEdgeDeviceInfoResponse());
    }

    public RemoveEdgeDeviceInfoResponse removeEdgeDeviceInfo(RemoveEdgeDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEdgeDeviceInfoWithOptions(request, runtime);
    }

    public RemoveEventDataMistakeResponse removeEventDataMistakeWithOptions(RemoveEventDataMistakeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveEventDataMistake", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveEventDataMistakeResponse());
    }

    public RemoveEventDataMistakeResponse removeEventDataMistake(RemoveEventDataMistakeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeEventDataMistakeWithOptions(request, runtime);
    }

    public RemoveVideoDeviceInfoResponse removeVideoDeviceInfoWithOptions(RemoveVideoDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveVideoDeviceInfo", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveVideoDeviceInfoResponse());
    }

    public RemoveVideoDeviceInfoResponse removeVideoDeviceInfo(RemoveVideoDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeVideoDeviceInfoWithOptions(request, runtime);
    }

    public StopDeviceAbilityResponse stopDeviceAbilityWithOptions(StopDeviceAbilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopDeviceAbility", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new StopDeviceAbilityResponse());
    }

    public StopDeviceAbilityResponse stopDeviceAbility(StopDeviceAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopDeviceAbilityWithOptions(request, runtime);
    }

    public StopOrStartAbilityByDeviceIdResponse stopOrStartAbilityByDeviceIdWithOptions(StopOrStartAbilityByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopOrStartAbilityByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new StopOrStartAbilityByDeviceIdResponse());
    }

    public StopOrStartAbilityByDeviceIdResponse stopOrStartAbilityByDeviceId(StopOrStartAbilityByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopOrStartAbilityByDeviceIdWithOptions(request, runtime);
    }

    public TestTestResponse testTestWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("TestTest", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new TestTestResponse());
    }

    public TestTestResponse testTest() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.testTestWithOptions(runtime);
    }

    public UpdateAbilityConfigByDeviceIdResponse updateAbilityConfigByDeviceIdWithOptions(UpdateAbilityConfigByDeviceIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAbilityConfigByDeviceId", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAbilityConfigByDeviceIdResponse());
    }

    public UpdateAbilityConfigByDeviceIdResponse updateAbilityConfigByDeviceId(UpdateAbilityConfigByDeviceIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAbilityConfigByDeviceIdWithOptions(request, runtime);
    }

    public UpdateCorpResponse updateCorpWithOptions(UpdateCorpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCorp", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCorpResponse());
    }

    public UpdateCorpResponse updateCorp(UpdateCorpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCorpWithOptions(request, runtime);
    }

    public UpdateCorpInfoResponse updateCorpInfoWithOptions(UpdateCorpInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCorpInfo", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCorpInfoResponse());
    }

    public UpdateCorpInfoResponse updateCorpInfo(UpdateCorpInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCorpInfoWithOptions(request, runtime);
    }

    public UpdateDeviceAbilityResponse updateDeviceAbilityWithOptions(UpdateDeviceAbilityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceAbility", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceAbilityResponse());
    }

    public UpdateDeviceAbilityResponse updateDeviceAbility(UpdateDeviceAbilityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceAbilityWithOptions(request, runtime);
    }

    public UpdateEdgeDevicesResponse updateEdgeDevicesWithOptions(UpdateEdgeDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEdgeDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEdgeDevicesResponse());
    }

    public UpdateEdgeDevicesResponse updateEdgeDevices(UpdateEdgeDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeDevicesWithOptions(request, runtime);
    }

    public UpdateIpcDeviceResponse updateIpcDeviceWithOptions(UpdateIpcDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpcDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpcDeviceResponse());
    }

    public UpdateIpcDeviceResponse updateIpcDevice(UpdateIpcDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpcDeviceWithOptions(request, runtime);
    }

    public UpdateUserLibraryByIdResponse updateUserLibraryByIdWithOptions(UpdateUserLibraryByIdRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserLibraryByIdShrinkRequest request = new UpdateUserLibraryByIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.photo)) {
            request.photoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.photo, "Photo", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUserLibraryById", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserLibraryByIdResponse());
    }

    public UpdateUserLibraryByIdResponse updateUserLibraryById(UpdateUserLibraryByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserLibraryByIdWithOptions(request, runtime);
    }

    public UpdateVideoDevicesResponse updateVideoDevicesWithOptions(UpdateVideoDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVideoDevices", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVideoDevicesResponse());
    }

    public UpdateVideoDevicesResponse updateVideoDevices(UpdateVideoDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVideoDevicesWithOptions(request, runtime);
    }

    public VerifyDeviceResponse verifyDeviceWithOptions(VerifyDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("VerifyDevice", "2021-03-31", "HTTPS", "POST", "AK", "json", req, runtime), new VerifyDeviceResponse());
    }

    public VerifyDeviceResponse verifyDevice(VerifyDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.verifyDeviceWithOptions(request, runtime);
    }
}
