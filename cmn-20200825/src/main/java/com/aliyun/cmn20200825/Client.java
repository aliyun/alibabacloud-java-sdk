// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825;

import com.aliyun.tea.*;
import com.aliyun.cmn20200825.models.*;
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
        this._endpoint = this.getEndpoint("cmn", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CreateConfigurationSpecificationResponse createConfigurationSpecificationWithOptions(CreateConfigurationSpecificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConfigurationSpecificationShrinkRequest request = new CreateConfigurationSpecificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedVariate)) {
            request.relatedVariateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedVariate, "RelatedVariate", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConfigurationSpecification", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConfigurationSpecificationResponse());
    }

    public CreateConfigurationSpecificationResponse createConfigurationSpecification(CreateConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigurationSpecificationWithOptions(request, runtime);
    }

    public CreateIpBlockResponse createIpBlockWithOptions(CreateIpBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpBlock", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpBlockResponse());
    }

    public CreateIpBlockResponse createIpBlock(CreateIpBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpBlockWithOptions(request, runtime);
    }

    public UpdateConfigurationVariateResponse updateConfigurationVariateWithOptions(UpdateConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConfigurationVariate", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConfigurationVariateResponse());
    }

    public UpdateConfigurationVariateResponse updateConfigurationVariate(UpdateConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigurationVariateWithOptions(request, runtime);
    }

    public GetScheduleTypeResponse getScheduleTypeWithOptions(GetScheduleTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScheduleType", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetScheduleTypeResponse());
    }

    public GetScheduleTypeResponse getScheduleType(GetScheduleTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScheduleTypeWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevice", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public ListDeviceValuesResponse listDeviceValuesWithOptions(ListDeviceValuesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceValues", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceValuesResponse());
    }

    public ListDeviceValuesResponse listDeviceValues(ListDeviceValuesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceValuesWithOptions(request, runtime);
    }

    public GetIpBlockRecordResponse getIpBlockRecordWithOptions(GetIpBlockRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpBlockRecord", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetIpBlockRecordResponse());
    }

    public GetIpBlockRecordResponse getIpBlockRecord(GetIpBlockRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpBlockRecordWithOptions(request, runtime);
    }

    public ListSpaceModelsResponse listSpaceModelsWithOptions(ListSpaceModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSpaceModels", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListSpaceModelsResponse());
    }

    public ListSpaceModelsResponse listSpaceModels(ListSpaceModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSpaceModelsWithOptions(request, runtime);
    }

    public ListDevicePropertiesResponse listDevicePropertiesWithOptions(ListDevicePropertiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceProperties", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListDevicePropertiesResponse());
    }

    public ListDevicePropertiesResponse listDeviceProperties(ListDevicePropertiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicePropertiesWithOptions(request, runtime);
    }

    public ListInspectionDevicesResponse listInspectionDevicesWithOptions(ListInspectionDevicesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInspectionDevicesShrinkRequest request = new ListInspectionDevicesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.model)) {
            request.modelShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.model, "Model", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInspectionDevices", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListInspectionDevicesResponse());
    }

    public ListInspectionDevicesResponse listInspectionDevices(ListInspectionDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionDevicesWithOptions(request, runtime);
    }

    public ListInspectionTasksResponse listInspectionTasksWithOptions(ListInspectionTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInspectionTasks", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListInspectionTasksResponse());
    }

    public ListInspectionTasksResponse listInspectionTasks(ListInspectionTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionTasksWithOptions(request, runtime);
    }

    public ListScheduleWorkersResponse listScheduleWorkersWithOptions(ListScheduleWorkersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScheduleWorkers", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListScheduleWorkersResponse());
    }

    public ListScheduleWorkersResponse listScheduleWorkers(ListScheduleWorkersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScheduleWorkersWithOptions(request, runtime);
    }

    public UpdateProjectProgressResponse updateProjectProgressWithOptions(UpdateProjectProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProjectProgress", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectProgressResponse());
    }

    public UpdateProjectProgressResponse updateProjectProgress(UpdateProjectProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectProgressWithOptions(request, runtime);
    }

    public UpdateDeviceResourceResponse updateDeviceResourceWithOptions(UpdateDeviceResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDeviceResourceShrinkRequest request = new UpdateDeviceResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceResource", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceResourceResponse());
    }

    public UpdateDeviceResourceResponse updateDeviceResource(UpdateDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceResourceWithOptions(request, runtime);
    }

    public GetDevicePropertyResponse getDevicePropertyWithOptions(GetDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceProperty", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDevicePropertyResponse());
    }

    public GetDevicePropertyResponse getDeviceProperty(GetDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDevicePropertyWithOptions(request, runtime);
    }

    public ListResourceTypesResponse listResourceTypesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListResourceTypes", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListResourceTypesResponse());
    }

    public ListResourceTypesResponse listResourceTypes() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceTypesWithOptions(runtime);
    }

    public GetSetupProjectResponse getSetupProjectWithOptions(GetSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSetupProject", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetSetupProjectResponse());
    }

    public GetSetupProjectResponse getSetupProject(GetSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSetupProjectWithOptions(request, runtime);
    }

    public ListConfigurationVariateResponse listConfigurationVariateWithOptions(ListConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConfigurationVariate", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListConfigurationVariateResponse());
    }

    public ListConfigurationVariateResponse listConfigurationVariate(ListConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigurationVariateWithOptions(request, runtime);
    }

    public CreateSpaceModelResponse createSpaceModelWithOptions(CreateSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSpaceModel", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSpaceModelResponse());
    }

    public CreateSpaceModelResponse createSpaceModel(CreateSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSpaceModelWithOptions(request, runtime);
    }

    public DeleteScheduleWorkerResponse deleteScheduleWorkerWithOptions(DeleteScheduleWorkerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScheduleWorker", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScheduleWorkerResponse());
    }

    public DeleteScheduleWorkerResponse deleteScheduleWorker(DeleteScheduleWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScheduleWorkerWithOptions(request, runtime);
    }

    public ListDedicatedLinesResponse listDedicatedLinesWithOptions(ListDedicatedLinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDedicatedLines", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListDedicatedLinesResponse());
    }

    public ListDedicatedLinesResponse listDedicatedLines(ListDedicatedLinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDedicatedLinesWithOptions(request, runtime);
    }

    public UpdateInformationKeyActionResponse updateInformationKeyActionWithOptions(UpdateInformationKeyActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInformationKeyAction", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInformationKeyActionResponse());
    }

    public UpdateInformationKeyActionResponse updateInformationKeyAction(UpdateInformationKeyActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInformationKeyActionWithOptions(request, runtime);
    }

    public GetRealtimeTaskResponse getRealtimeTaskWithOptions(GetRealtimeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRealtimeTask", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetRealtimeTaskResponse());
    }

    public GetRealtimeTaskResponse getRealtimeTask(GetRealtimeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRealtimeTaskWithOptions(request, runtime);
    }

    public ListScheduleTypesResponse listScheduleTypesWithOptions(ListScheduleTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScheduleTypes", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListScheduleTypesResponse());
    }

    public ListScheduleTypesResponse listScheduleTypes(ListScheduleTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScheduleTypesWithOptions(request, runtime);
    }

    public CreateScheduleTypeResponse createScheduleTypeWithOptions(CreateScheduleTypeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduleTypeShrinkRequest request = new CreateScheduleTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedWorker)) {
            request.relatedWorkerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedWorker, "RelatedWorker", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScheduleType", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScheduleTypeResponse());
    }

    public CreateScheduleTypeResponse createScheduleType(CreateScheduleTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScheduleTypeWithOptions(request, runtime);
    }

    public GetScheduleWorkerResponse getScheduleWorkerWithOptions(GetScheduleWorkerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScheduleWorker", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetScheduleWorkerResponse());
    }

    public GetScheduleWorkerResponse getScheduleWorker(GetScheduleWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScheduleWorkerWithOptions(request, runtime);
    }

    public CreateScheduleWorkerResponse createScheduleWorkerWithOptions(CreateScheduleWorkerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScheduleWorker", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScheduleWorkerResponse());
    }

    public CreateScheduleWorkerResponse createScheduleWorker(CreateScheduleWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScheduleWorkerWithOptions(request, runtime);
    }

    public CreateConfigurationVariateResponse createConfigurationVariateWithOptions(CreateConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConfigurationVariate", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConfigurationVariateResponse());
    }

    public CreateConfigurationVariateResponse createConfigurationVariate(CreateConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigurationVariateWithOptions(request, runtime);
    }

    public GetSpaceModelSortResponse getSpaceModelSortWithOptions(GetSpaceModelSortRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSpaceModelSort", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetSpaceModelSortResponse());
    }

    public GetSpaceModelSortResponse getSpaceModelSort(GetSpaceModelSortRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelSortWithOptions(request, runtime);
    }

    public CreateRealtimeTaskResponse createRealtimeTaskWithOptions(CreateRealtimeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRealtimeTask", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRealtimeTaskResponse());
    }

    public CreateRealtimeTaskResponse createRealtimeTask(CreateRealtimeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRealtimeTaskWithOptions(request, runtime);
    }

    public GetDeviceFormResponse getDeviceFormWithOptions(GetDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceForm", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceFormResponse());
    }

    public GetDeviceFormResponse getDeviceForm(GetDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceFormWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevice", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public CreateSetupProjectResponse createSetupProjectWithOptions(CreateSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSetupProject", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSetupProjectResponse());
    }

    public CreateSetupProjectResponse createSetupProject(CreateSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSetupProjectWithOptions(request, runtime);
    }

    public UpdateDedicatedLineResponse updateDedicatedLineWithOptions(UpdateDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDedicatedLine", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDedicatedLineResponse());
    }

    public UpdateDedicatedLineResponse updateDedicatedLine(UpdateDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDedicatedLineWithOptions(request, runtime);
    }

    public GetOsVersionResponse getOsVersionWithOptions(GetOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOsVersion", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetOsVersionResponse());
    }

    public GetOsVersionResponse getOsVersion(GetOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOsVersionWithOptions(request, runtime);
    }

    public UpdateScheduleDutyResponse updateScheduleDutyWithOptions(UpdateScheduleDutyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScheduleDutyShrinkRequest request = new UpdateScheduleDutyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.typeWorkerList)) {
            request.typeWorkerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.typeWorkerList, "TypeWorkerList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScheduleDuty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScheduleDutyResponse());
    }

    public UpdateScheduleDutyResponse updateScheduleDuty(UpdateScheduleDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScheduleDutyWithOptions(request, runtime);
    }

    public CreateIpRecordResponse createIpRecordWithOptions(CreateIpRecordRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIpRecordShrinkRequest request = new CreateIpRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.device)) {
            request.deviceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.device, "Device", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ipCode)) {
            request.ipCodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ipCode, "IpCode", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpRecord", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpRecordResponse());
    }

    public CreateIpRecordResponse createIpRecord(CreateIpRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpRecordWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(runtime);
    }

    public ListZoneTypesResponse listZoneTypesWithOptions(ListZoneTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListZoneTypes", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListZoneTypesResponse());
    }

    public ListZoneTypesResponse listZoneTypes(ListZoneTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listZoneTypesWithOptions(request, runtime);
    }

    public UpdatePhysicalSpaceResponse updatePhysicalSpaceWithOptions(UpdatePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePhysicalSpace", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePhysicalSpaceResponse());
    }

    public UpdatePhysicalSpaceResponse updatePhysicalSpace(UpdatePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePhysicalSpaceWithOptions(request, runtime);
    }

    public UpdateResourceInstanceResponse updateResourceInstanceWithOptions(UpdateResourceInstanceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceInstanceShrinkRequest request = new UpdateResourceInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceInformation)) {
            request.resourceInformationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceInformation, "ResourceInformation", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResourceInstance", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceInstanceResponse());
    }

    public UpdateResourceInstanceResponse updateResourceInstance(UpdateResourceInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceInstanceWithOptions(request, runtime);
    }

    public GetScheduleDutyResponse getScheduleDutyWithOptions(GetScheduleDutyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetScheduleDuty", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetScheduleDutyResponse());
    }

    public GetScheduleDutyResponse getScheduleDuty(GetScheduleDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getScheduleDutyWithOptions(request, runtime);
    }

    public GetConfigurationVariateResponse getConfigurationVariateWithOptions(GetConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConfigurationVariate", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetConfigurationVariateResponse());
    }

    public GetConfigurationVariateResponse getConfigurationVariate(GetConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigurationVariateWithOptions(request, runtime);
    }

    public GetAlarmStatusResponse getAlarmStatusWithOptions(GetAlarmStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlarmStatus", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetAlarmStatusResponse());
    }

    public GetAlarmStatusResponse getAlarmStatus(GetAlarmStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlarmStatusWithOptions(request, runtime);
    }

    public GetIpRecordResponse getIpRecordWithOptions(GetIpRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpRecord", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetIpRecordResponse());
    }

    public GetIpRecordResponse getIpRecord(GetIpRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpRecordWithOptions(request, runtime);
    }

    public ListScheduleDutiesResponse listScheduleDutiesWithOptions(ListScheduleDutiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScheduleDuties", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListScheduleDutiesResponse());
    }

    public ListScheduleDutiesResponse listScheduleDuties(ListScheduleDutiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScheduleDutiesWithOptions(request, runtime);
    }

    public LockSpaceModelResponse lockSpaceModelWithOptions(LockSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("LockSpaceModel", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new LockSpaceModelResponse());
    }

    public LockSpaceModelResponse lockSpaceModel(LockSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.lockSpaceModelWithOptions(request, runtime);
    }

    public UpdateResourceInformationResponse updateResourceInformationWithOptions(UpdateResourceInformationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateResourceInformationShrinkRequest request = new UpdateResourceInformationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.information)) {
            request.informationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.information, "Information", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResourceInformation", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceInformationResponse());
    }

    public UpdateResourceInformationResponse updateResourceInformation(UpdateResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceInformationWithOptions(request, runtime);
    }

    public CreateTimePeriodResponse createTimePeriodWithOptions(CreateTimePeriodRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTimePeriod", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTimePeriodResponse());
    }

    public CreateTimePeriodResponse createTimePeriod(CreateTimePeriodRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTimePeriodWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevices", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public ListInspectionTaskReportsResponse listInspectionTaskReportsWithOptions(ListInspectionTaskReportsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInspectionTaskReports", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListInspectionTaskReportsResponse());
    }

    public ListInspectionTaskReportsResponse listInspectionTaskReports(ListInspectionTaskReportsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInspectionTaskReportsWithOptions(request, runtime);
    }

    public CreateMonitorItemResponse createMonitorItemWithOptions(CreateMonitorItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMonitorItem", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMonitorItemResponse());
    }

    public CreateMonitorItemResponse createMonitorItem(CreateMonitorItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMonitorItemWithOptions(request, runtime);
    }

    public CreatePhysicalSpaceResponse createPhysicalSpaceWithOptions(CreatePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePhysicalSpace", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePhysicalSpaceResponse());
    }

    public CreatePhysicalSpaceResponse createPhysicalSpace(CreatePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPhysicalSpaceWithOptions(request, runtime);
    }

    public UpdateDevicesResponse updateDevicesWithOptions(UpdateDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevices", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDevicesResponse());
    }

    public UpdateDevicesResponse updateDevices(UpdateDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevicesWithOptions(request, runtime);
    }

    public UpdateScheduleTypeResponse updateScheduleTypeWithOptions(UpdateScheduleTypeRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateScheduleTypeShrinkRequest request = new UpdateScheduleTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedWorker)) {
            request.relatedWorkerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedWorker, "RelatedWorker", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScheduleType", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScheduleTypeResponse());
    }

    public UpdateScheduleTypeResponse updateScheduleType(UpdateScheduleTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScheduleTypeWithOptions(request, runtime);
    }

    public DownloadDeviceResourceResponse downloadDeviceResourceWithOptions(DownloadDeviceResourceRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DownloadDeviceResourceShrinkRequest request = new DownloadDeviceResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadDeviceResource", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new DownloadDeviceResourceResponse());
    }

    public DownloadDeviceResourceResponse downloadDeviceResource(DownloadDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadDeviceResourceWithOptions(request, runtime);
    }

    public GetOsDownloadPathResponse getOsDownloadPathWithOptions(GetOsDownloadPathRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOsDownloadPath", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetOsDownloadPathResponse());
    }

    public GetOsDownloadPathResponse getOsDownloadPath(GetOsDownloadPathRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOsDownloadPathWithOptions(request, runtime);
    }

    public ListConnectionPoliciesResponse listConnectionPoliciesWithOptions(ListConnectionPoliciesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConnectionPolicies", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new ListConnectionPoliciesResponse());
    }

    public ListConnectionPoliciesResponse listConnectionPolicies(ListConnectionPoliciesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectionPoliciesWithOptions(request, runtime);
    }

    public UpdateScheduleWorkerResponse updateScheduleWorkerWithOptions(UpdateScheduleWorkerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateScheduleWorker", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateScheduleWorkerResponse());
    }

    public UpdateScheduleWorkerResponse updateScheduleWorker(UpdateScheduleWorkerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateScheduleWorkerWithOptions(request, runtime);
    }

    public DeleteConfigurationVariateResponse deleteConfigurationVariateWithOptions(DeleteConfigurationVariateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConfigurationVariate", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConfigurationVariateResponse());
    }

    public DeleteConfigurationVariateResponse deleteConfigurationVariate(DeleteConfigurationVariateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConfigurationVariateWithOptions(request, runtime);
    }

    public CreateScheduleDutyResponse createScheduleDutyWithOptions(CreateScheduleDutyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateScheduleDutyShrinkRequest request = new CreateScheduleDutyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleTypeIds)) {
            request.scheduleTypeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleTypeIds, "ScheduleTypeIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateScheduleDuty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateScheduleDutyResponse());
    }

    public CreateScheduleDutyResponse createScheduleDuty(CreateScheduleDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createScheduleDutyWithOptions(request, runtime);
    }

    public GetPhysicalSpaceResponse getPhysicalSpaceWithOptions(GetPhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhysicalSpace", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetPhysicalSpaceResponse());
    }

    public GetPhysicalSpaceResponse getPhysicalSpace(GetPhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhysicalSpaceWithOptions(request, runtime);
    }

    public DeleteResourceInformationResponse deleteResourceInformationWithOptions(DeleteResourceInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteResourceInformation", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteResourceInformationResponse());
    }

    public DeleteResourceInformationResponse deleteResourceInformation(DeleteResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceInformationWithOptions(request, runtime);
    }

    public DeleteSetupProjectResponse deleteSetupProjectWithOptions(DeleteSetupProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSetupProject", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSetupProjectResponse());
    }

    public DeleteSetupProjectResponse deleteSetupProject(DeleteSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSetupProjectWithOptions(request, runtime);
    }

    public CreateDedicatedLineResponse createDedicatedLineWithOptions(CreateDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDedicatedLine", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDedicatedLineResponse());
    }

    public CreateDedicatedLineResponse createDedicatedLine(CreateDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDedicatedLineWithOptions(request, runtime);
    }

    public ApplyIPResponse applyIPWithOptions(ApplyIPRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyIPShrinkRequest request = new ApplyIPShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyIP", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyIPResponse());
    }

    public ApplyIPResponse applyIP(ApplyIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyIPWithOptions(request, runtime);
    }

    public UpdateOsVersionResponse updateOsVersionWithOptions(UpdateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsVersion", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsVersionResponse());
    }

    public UpdateOsVersionResponse updateOsVersion(UpdateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionWithOptions(request, runtime);
    }

    public GetSpaceModelInstanceResponse getSpaceModelInstanceWithOptions(GetSpaceModelInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSpaceModelInstance", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetSpaceModelInstanceResponse());
    }

    public GetSpaceModelInstanceResponse getSpaceModelInstance(GetSpaceModelInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelInstanceWithOptions(request, runtime);
    }

    public ListOsVersionsResponse listOsVersionsWithOptions(ListOsVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOsVersions", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListOsVersionsResponse());
    }

    public ListOsVersionsResponse listOsVersions(ListOsVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOsVersionsWithOptions(request, runtime);
    }

    public GetDeviceConfigResponse getDeviceConfigWithOptions(GetDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceConfig", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceConfigResponse());
    }

    public GetDeviceConfigResponse getDeviceConfig(GetDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigWithOptions(request, runtime);
    }

    public GetDedicatedLineResponse getDedicatedLineWithOptions(GetDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDedicatedLine", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDedicatedLineResponse());
    }

    public GetDedicatedLineResponse getDedicatedLine(GetDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDedicatedLineWithOptions(request, runtime);
    }

    public GetDeviceResourceResponse getDeviceResourceWithOptions(GetDeviceResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceResource", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceResourceResponse());
    }

    public GetDeviceResourceResponse getDeviceResource(GetDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceResourceWithOptions(request, runtime);
    }

    public DeleteDedicatedLineResponse deleteDedicatedLineWithOptions(DeleteDedicatedLineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDedicatedLine", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDedicatedLineResponse());
    }

    public DeleteDedicatedLineResponse deleteDedicatedLine(DeleteDedicatedLineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDedicatedLineWithOptions(request, runtime);
    }

    public ListIpResponse listIpWithOptions(ListIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIp", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListIpResponse());
    }

    public ListIpResponse listIp(ListIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpWithOptions(request, runtime);
    }

    public ListConfigurationSpecificationsResponse listConfigurationSpecificationsWithOptions(ListConfigurationSpecificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConfigurationSpecifications", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListConfigurationSpecificationsResponse());
    }

    public ListConfigurationSpecificationsResponse listConfigurationSpecifications(ListConfigurationSpecificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigurationSpecificationsWithOptions(request, runtime);
    }

    public EnableNotificationResponse enableNotificationWithOptions(EnableNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableNotification", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new EnableNotificationResponse());
    }

    public EnableNotificationResponse enableNotification(EnableNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableNotificationWithOptions(request, runtime);
    }

    public UpdateDevicePropertyResponse updateDevicePropertyWithOptions(UpdateDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceProperty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDevicePropertyResponse());
    }

    public UpdateDevicePropertyResponse updateDeviceProperty(UpdateDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDevicePropertyWithOptions(request, runtime);
    }

    public ListNotificationHistoriesResponse listNotificationHistoriesWithOptions(ListNotificationHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNotificationHistories", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListNotificationHistoriesResponse());
    }

    public ListNotificationHistoriesResponse listNotificationHistories(ListNotificationHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNotificationHistoriesWithOptions(request, runtime);
    }

    public DeleteDevicePropertyResponse deleteDevicePropertyWithOptions(DeleteDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceProperty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDevicePropertyResponse());
    }

    public DeleteDevicePropertyResponse deleteDeviceProperty(DeleteDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicePropertyWithOptions(request, runtime);
    }

    public ListResourceInstancesResponse listResourceInstancesWithOptions(ListResourceInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceInstances", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListResourceInstancesResponse());
    }

    public ListResourceInstancesResponse listResourceInstances(ListResourceInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceInstancesWithOptions(request, runtime);
    }

    public ListIpBlocksResponse listIpBlocksWithOptions(ListIpBlocksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIpBlocks", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListIpBlocksResponse());
    }

    public ListIpBlocksResponse listIpBlocks(ListIpBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIpBlocksWithOptions(request, runtime);
    }

    public ListDeviceResourcesResponse listDeviceResourcesWithOptions(ListDeviceResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceResources", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceResourcesResponse());
    }

    public ListDeviceResourcesResponse listDeviceResources(ListDeviceResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceResourcesWithOptions(request, runtime);
    }

    public ListResourceInformationsResponse listResourceInformationsWithOptions(ListResourceInformationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceInformations", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListResourceInformationsResponse());
    }

    public ListResourceInformationsResponse listResourceInformations(ListResourceInformationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceInformationsWithOptions(request, runtime);
    }

    public ListDeviceFormsResponse listDeviceFormsWithOptions(ListDeviceFormsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceForms", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceFormsResponse());
    }

    public ListDeviceFormsResponse listDeviceForms(ListDeviceFormsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceFormsWithOptions(request, runtime);
    }

    public GetConfigurationSpecificationResponse getConfigurationSpecificationWithOptions(GetConfigurationSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConfigurationSpecification", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetConfigurationSpecificationResponse());
    }

    public GetConfigurationSpecificationResponse getConfigurationSpecification(GetConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigurationSpecificationWithOptions(request, runtime);
    }

    public DeleteScheduleDutyResponse deleteScheduleDutyWithOptions(DeleteScheduleDutyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteScheduleDutyShrinkRequest request = new DeleteScheduleDutyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.typeWorkerList)) {
            request.typeWorkerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.typeWorkerList, "TypeWorkerList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScheduleDuty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScheduleDutyResponse());
    }

    public DeleteScheduleDutyResponse deleteScheduleDuty(DeleteScheduleDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScheduleDutyWithOptions(request, runtime);
    }

    public UploadScheduleDutyResponse uploadScheduleDutyWithOptions(UploadScheduleDutyRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadScheduleDutyShrinkRequest request = new UploadScheduleDutyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduleDuty)) {
            request.scheduleDutyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduleDuty, "ScheduleDuty", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadScheduleDuty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UploadScheduleDutyResponse());
    }

    public UploadScheduleDutyResponse uploadScheduleDuty(UploadScheduleDutyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadScheduleDutyWithOptions(request, runtime);
    }

    public ListAlarmStatusHistoriesResponse listAlarmStatusHistoriesWithOptions(ListAlarmStatusHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmStatusHistories", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmStatusHistoriesResponse());
    }

    public ListAlarmStatusHistoriesResponse listAlarmStatusHistories(ListAlarmStatusHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmStatusHistoriesWithOptions(request, runtime);
    }

    public GetSpaceModelResponse getSpaceModelWithOptions(GetSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSpaceModel", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetSpaceModelResponse());
    }

    public GetSpaceModelResponse getSpaceModel(GetSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpaceModelWithOptions(request, runtime);
    }

    public CreateDeviceFormResponse createDeviceFormWithOptions(CreateDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceForm", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceFormResponse());
    }

    public CreateDeviceFormResponse createDeviceForm(CreateDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceFormWithOptions(request, runtime);
    }

    public ListPhysicalSpacesResponse listPhysicalSpacesWithOptions(ListPhysicalSpacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPhysicalSpaces", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListPhysicalSpacesResponse());
    }

    public ListPhysicalSpacesResponse listPhysicalSpaces(ListPhysicalSpacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPhysicalSpacesWithOptions(request, runtime);
    }

    public ListMonitorDataResponse listMonitorDataWithOptions(ListMonitorDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMonitorData", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListMonitorDataResponse());
    }

    public ListMonitorDataResponse listMonitorData(ListMonitorDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMonitorDataWithOptions(request, runtime);
    }

    public CreateResourceInformationResponse createResourceInformationWithOptions(CreateResourceInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourceInformation", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceInformationResponse());
    }

    public CreateResourceInformationResponse createResourceInformation(CreateResourceInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceInformationWithOptions(request, runtime);
    }

    public UpdateSpaceModelInstanceResponse updateSpaceModelInstanceWithOptions(UpdateSpaceModelInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpaceModelInstance", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpaceModelInstanceResponse());
    }

    public UpdateSpaceModelInstanceResponse updateSpaceModelInstance(UpdateSpaceModelInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceModelInstanceWithOptions(request, runtime);
    }

    public UpdateIpRecordResponse updateIpRecordWithOptions(UpdateIpRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpRecord", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpRecordResponse());
    }

    public UpdateIpRecordResponse updateIpRecord(UpdateIpRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpRecordWithOptions(request, runtime);
    }

    public ReleaseIPResponse releaseIPWithOptions(ReleaseIPRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReleaseIPShrinkRequest request = new ReleaseIPShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.deviceResourceIds)) {
            request.deviceResourceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.deviceResourceIds, "DeviceResourceIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseIP", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseIPResponse());
    }

    public ReleaseIPResponse releaseIP(ReleaseIPRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseIPWithOptions(request, runtime);
    }

    public DeleteDeviceResourceResponse deleteDeviceResourceWithOptions(DeleteDeviceResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceResource", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResourceResponse());
    }

    public DeleteDeviceResourceResponse deleteDeviceResource(DeleteDeviceResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceResourceWithOptions(request, runtime);
    }

    public GetIpBlockResponse getIpBlockWithOptions(GetIpBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIpBlock", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetIpBlockResponse());
    }

    public GetIpBlockResponse getIpBlock(GetIpBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIpBlockWithOptions(request, runtime);
    }

    public DeleteIpBlockResponse deleteIpBlockWithOptions(DeleteIpBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteIpBlock", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteIpBlockResponse());
    }

    public DeleteIpBlockResponse deleteIpBlock(DeleteIpBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteIpBlockWithOptions(request, runtime);
    }

    public DeleteInspectionTaskResponse deleteInspectionTaskWithOptions(DeleteInspectionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInspectionTask", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteInspectionTaskResponse());
    }

    public DeleteInspectionTaskResponse deleteInspectionTask(DeleteInspectionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInspectionTaskWithOptions(request, runtime);
    }

    public DeleteConfigurationSpecificationResponse deleteConfigurationSpecificationWithOptions(DeleteConfigurationSpecificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteConfigurationSpecification", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteConfigurationSpecificationResponse());
    }

    public DeleteConfigurationSpecificationResponse deleteConfigurationSpecification(DeleteConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConfigurationSpecificationWithOptions(request, runtime);
    }

    public ListBusinessTypesResponse listBusinessTypesWithOptions(ListBusinessTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBusinessTypes", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListBusinessTypesResponse());
    }

    public ListBusinessTypesResponse listBusinessTypes(ListBusinessTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBusinessTypesWithOptions(request, runtime);
    }

    public ListSetupProjectsResponse listSetupProjectsWithOptions(ListSetupProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSetupProjects", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListSetupProjectsResponse());
    }

    public ListSetupProjectsResponse listSetupProjects(ListSetupProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSetupProjectsWithOptions(request, runtime);
    }

    public ListTasksHistoriesResponse listTasksHistoriesWithOptions(ListTasksHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTasksHistories", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListTasksHistoriesResponse());
    }

    public ListTasksHistoriesResponse listTasksHistories(ListTasksHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksHistoriesWithOptions(request, runtime);
    }

    public UpdateConfigurationSpecificationResponse updateConfigurationSpecificationWithOptions(UpdateConfigurationSpecificationRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConfigurationSpecificationShrinkRequest request = new UpdateConfigurationSpecificationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedVariate)) {
            request.relatedVariateShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedVariate, "RelatedVariate", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConfigurationSpecification", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConfigurationSpecificationResponse());
    }

    public UpdateConfigurationSpecificationResponse updateConfigurationSpecification(UpdateConfigurationSpecificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigurationSpecificationWithOptions(request, runtime);
    }

    public CreateOsVersionResponse createOsVersionWithOptions(CreateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOsVersion", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOsVersionResponse());
    }

    public CreateOsVersionResponse createOsVersion(CreateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOsVersionWithOptions(request, runtime);
    }

    public CreateIpBlockRecordResponse createIpBlockRecordWithOptions(CreateIpBlockRecordRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIpBlockRecordShrinkRequest request = new CreateIpBlockRecordShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.zoneLayer)) {
            request.zoneLayerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.zoneLayer, "ZoneLayer", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.businessType)) {
            request.businessTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.businessType, "BusinessType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ipBlockCode)) {
            request.ipBlockCodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ipBlockCode, "IpBlockCode", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateIpBlockRecord", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateIpBlockRecordResponse());
    }

    public CreateIpBlockRecordResponse createIpBlockRecord(CreateIpBlockRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createIpBlockRecordWithOptions(request, runtime);
    }

    public UpdateIpBlockResponse updateIpBlockWithOptions(UpdateIpBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpBlock", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpBlockResponse());
    }

    public UpdateIpBlockResponse updateIpBlock(UpdateIpBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpBlockWithOptions(request, runtime);
    }

    public CreateDevicePropertyResponse createDevicePropertyWithOptions(CreateDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceProperty", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDevicePropertyResponse());
    }

    public CreateDevicePropertyResponse createDeviceProperty(CreateDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDevicePropertyWithOptions(request, runtime);
    }

    public UpdateIpBlockRecordResponse updateIpBlockRecordWithOptions(UpdateIpBlockRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateIpBlockRecord", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateIpBlockRecordResponse());
    }

    public UpdateIpBlockRecordResponse updateIpBlockRecord(UpdateIpBlockRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateIpBlockRecordWithOptions(request, runtime);
    }

    public RetryTasksResponse retryTasksWithOptions(RetryTasksRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RetryTasksShrinkRequest request = new RetryTasksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retryTasks)) {
            request.retryTasksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retryTasks, "RetryTasks", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("RetryTasks", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new RetryTasksResponse());
    }

    public RetryTasksResponse retryTasks(RetryTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryTasksWithOptions(request, runtime);
    }

    public GetPhysicalSpaceTopoResponse getPhysicalSpaceTopoWithOptions(GetPhysicalSpaceTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPhysicalSpaceTopo", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new GetPhysicalSpaceTopoResponse());
    }

    public GetPhysicalSpaceTopoResponse getPhysicalSpaceTopo(GetPhysicalSpaceTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhysicalSpaceTopoWithOptions(request, runtime);
    }

    public GetOssPolicyResponse getOssPolicyWithOptions(GetOssPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOssPolicy", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetOssPolicyResponse());
    }

    public GetOssPolicyResponse getOssPolicy(GetOssPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssPolicyWithOptions(request, runtime);
    }

    public DeleteDeviceFormResponse deleteDeviceFormWithOptions(DeleteDeviceFormRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDeviceForm", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceFormResponse());
    }

    public DeleteDeviceFormResponse deleteDeviceForm(DeleteDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceFormWithOptions(request, runtime);
    }

    public UpdateDeviceFormResponse updateDeviceFormWithOptions(UpdateDeviceFormRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateDeviceFormShrinkRequest request = new UpdateDeviceFormShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributeList)) {
            request.attributeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributeList, "AttributeList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceForm", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceFormResponse());
    }

    public UpdateDeviceFormResponse updateDeviceForm(UpdateDeviceFormRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceFormWithOptions(request, runtime);
    }

    public UpdateDeviceResponse updateDeviceWithOptions(UpdateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDevice", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceResponse());
    }

    public UpdateDeviceResponse updateDevice(UpdateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceWithOptions(request, runtime);
    }

    public GetDeviceResponse getDeviceWithOptions(GetDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDevice", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceResponse());
    }

    public GetDeviceResponse getDevice(GetDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceWithOptions(request, runtime);
    }

    public UpdateSetupProjectResponse updateSetupProjectWithOptions(UpdateSetupProjectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSetupProjectShrinkRequest request = new UpdateSetupProjectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.packages)) {
            request.packagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.packages, "Packages", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSetupProject", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSetupProjectResponse());
    }

    public UpdateSetupProjectResponse updateSetupProject(UpdateSetupProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSetupProjectWithOptions(request, runtime);
    }

    public UpdateSpaceModelResponse updateSpaceModelWithOptions(UpdateSpaceModelRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSpaceModelShrinkRequest request = new UpdateSpaceModelShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sort)) {
            request.sortShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sort, "Sort", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpaceModel", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpaceModelResponse());
    }

    public UpdateSpaceModelResponse updateSpaceModel(UpdateSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpaceModelWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRegions", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    public DeleteSpaceModelResponse deleteSpaceModelWithOptions(DeleteSpaceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSpaceModel", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSpaceModelResponse());
    }

    public DeleteSpaceModelResponse deleteSpaceModel(DeleteSpaceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSpaceModelWithOptions(request, runtime);
    }

    public DisableNotificationResponse disableNotificationWithOptions(DisableNotificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableNotification", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DisableNotificationResponse());
    }

    public DisableNotificationResponse disableNotification(DisableNotificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableNotificationWithOptions(request, runtime);
    }

    public GetDeviceConfigDiffResponse getDeviceConfigDiffWithOptions(GetDeviceConfigDiffRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceConfigDiff", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetDeviceConfigDiffResponse());
    }

    public GetDeviceConfigDiffResponse getDeviceConfigDiff(GetDeviceConfigDiffRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceConfigDiffWithOptions(request, runtime);
    }

    public GetInspectionTaskResponse getInspectionTaskWithOptions(GetInspectionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInspectionTask", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new GetInspectionTaskResponse());
    }

    public GetInspectionTaskResponse getInspectionTask(GetInspectionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInspectionTaskWithOptions(request, runtime);
    }

    public ListAlarmStatusResponse listAlarmStatusWithOptions(ListAlarmStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAlarmStatus", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListAlarmStatusResponse());
    }

    public ListAlarmStatusResponse listAlarmStatus(ListAlarmStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAlarmStatusWithOptions(request, runtime);
    }

    public ListArchitectureAttributeResponse listArchitectureAttributeWithOptions(ListArchitectureAttributeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListArchitectureAttribute", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListArchitectureAttributeResponse());
    }

    public ListArchitectureAttributeResponse listArchitectureAttribute(ListArchitectureAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listArchitectureAttributeWithOptions(request, runtime);
    }

    public DeleteOsVersionResponse deleteOsVersionWithOptions(DeleteOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOsVersion", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteOsVersionResponse());
    }

    public DeleteOsVersionResponse deleteOsVersion(DeleteOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOsVersionWithOptions(request, runtime);
    }

    public DeleteScheduleTypeResponse deleteScheduleTypeWithOptions(DeleteScheduleTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScheduleType", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScheduleTypeResponse());
    }

    public DeleteScheduleTypeResponse deleteScheduleType(DeleteScheduleTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScheduleTypeWithOptions(request, runtime);
    }

    public DeletePhysicalSpaceResponse deletePhysicalSpaceWithOptions(DeletePhysicalSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePhysicalSpace", "2020-08-25", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePhysicalSpaceResponse());
    }

    public DeletePhysicalSpaceResponse deletePhysicalSpace(DeletePhysicalSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePhysicalSpaceWithOptions(request, runtime);
    }
}
