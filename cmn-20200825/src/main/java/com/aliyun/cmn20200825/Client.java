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

    public ListInstancesResponse listInstancesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(runtime);
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

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRegions", "2020-08-25", "HTTPS", "GET", "AK", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
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
}
