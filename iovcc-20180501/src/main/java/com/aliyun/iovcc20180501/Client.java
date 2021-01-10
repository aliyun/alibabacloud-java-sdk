// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501;

import com.aliyun.tea.*;
import com.aliyun.iovcc20180501.models.*;
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
        this._endpoint = this.getEndpoint("iovcc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddUploadedFunctionFileInfoResponse addUploadedFunctionFileInfoWithOptions(AddUploadedFunctionFileInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddUploadedFunctionFileInfo", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddUploadedFunctionFileInfoResponse());
    }

    public AddUploadedFunctionFileInfoResponse addUploadedFunctionFileInfo(AddUploadedFunctionFileInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUploadedFunctionFileInfoWithOptions(request, runtime);
    }

    public AddVersionBlackDevicesResponse addVersionBlackDevicesWithOptions(AddVersionBlackDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVersionBlackDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddVersionBlackDevicesResponse());
    }

    public AddVersionBlackDevicesResponse addVersionBlackDevices(AddVersionBlackDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVersionBlackDevicesWithOptions(request, runtime);
    }

    public AddVersionGroupDevicesResponse addVersionGroupDevicesWithOptions(AddVersionGroupDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVersionGroupDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddVersionGroupDevicesResponse());
    }

    public AddVersionGroupDevicesResponse addVersionGroupDevices(AddVersionGroupDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVersionGroupDevicesWithOptions(request, runtime);
    }

    public AddVersionWhiteDevicesResponse addVersionWhiteDevicesWithOptions(AddVersionWhiteDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVersionWhiteDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddVersionWhiteDevicesResponse());
    }

    public AddVersionWhiteDevicesResponse addVersionWhiteDevices(AddVersionWhiteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVersionWhiteDevicesWithOptions(request, runtime);
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponse addVersionWhiteDevicesByDeviceGroupsWithOptions(AddVersionWhiteDevicesByDeviceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddVersionWhiteDevicesByDeviceGroups", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new AddVersionWhiteDevicesByDeviceGroupsResponse());
    }

    public AddVersionWhiteDevicesByDeviceGroupsResponse addVersionWhiteDevicesByDeviceGroups(AddVersionWhiteDevicesByDeviceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addVersionWhiteDevicesByDeviceGroupsWithOptions(request, runtime);
    }

    public ConnectAssistDeviceResponse connectAssistDeviceWithOptions(ConnectAssistDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConnectAssistDevice", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ConnectAssistDeviceResponse());
    }

    public ConnectAssistDeviceResponse connectAssistDevice(ConnectAssistDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.connectAssistDeviceWithOptions(request, runtime);
    }

    public CountDeviceBrandsResponse countDeviceBrandsWithOptions(CountDeviceBrandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CountDeviceBrands", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new CountDeviceBrandsResponse());
    }

    public CountDeviceBrandsResponse countDeviceBrands(CountDeviceBrandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countDeviceBrandsWithOptions(request, runtime);
    }

    public CountDeviceModelsResponse countDeviceModelsWithOptions(CountDeviceModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CountDeviceModels", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new CountDeviceModelsResponse());
    }

    public CountDeviceModelsResponse countDeviceModels(CountDeviceModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countDeviceModelsWithOptions(request, runtime);
    }

    public CountDevicesResponse countDevicesWithOptions(CountDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CountDevices", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new CountDevicesResponse());
    }

    public CountDevicesResponse countDevices(CountDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countDevicesWithOptions(request, runtime);
    }

    public CountProjectsResponse countProjectsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CountProjects", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CountProjectsResponse());
    }

    public CountProjectsResponse countProjects() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countProjectsWithOptions(runtime);
    }

    public CountYunIdInfoResponse countYunIdInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("CountYunIdInfo", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CountYunIdInfoResponse());
    }

    public CountYunIdInfoResponse countYunIdInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countYunIdInfoWithOptions(runtime);
    }

    public CreateAppVersionResponse createAppVersionWithOptions(CreateAppVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAppVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppVersionResponse());
    }

    public CreateAppVersionResponse createAppVersion(CreateAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppVersionWithOptions(request, runtime);
    }

    public CreateCustomizedFilterResponse createCustomizedFilterWithOptions(CreateCustomizedFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCustomizedFilter", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCustomizedFilterResponse());
    }

    public CreateCustomizedFilterResponse createCustomizedFilter(CreateCustomizedFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomizedFilterWithOptions(request, runtime);
    }

    public CreateCustomizedPropertyResponse createCustomizedPropertyWithOptions(CreateCustomizedPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCustomizedProperty", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCustomizedPropertyResponse());
    }

    public CreateCustomizedPropertyResponse createCustomizedProperty(CreateCustomizedPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCustomizedPropertyWithOptions(request, runtime);
    }

    public CreateDeviceResponse createDeviceWithOptions(CreateDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDevice", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceResponse());
    }

    public CreateDeviceResponse createDevice(CreateDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceWithOptions(request, runtime);
    }

    public CreateDeviceBrandResponse createDeviceBrandWithOptions(CreateDeviceBrandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceBrand", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceBrandResponse());
    }

    public CreateDeviceBrandResponse createDeviceBrand(CreateDeviceBrandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceBrandWithOptions(request, runtime);
    }

    public CreateDeviceModelResponse createDeviceModelWithOptions(CreateDeviceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDeviceModel", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDeviceModelResponse());
    }

    public CreateDeviceModelResponse createDeviceModel(CreateDeviceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceModelWithOptions(request, runtime);
    }

    public CreateMqttRootTopicResponse createMqttRootTopicWithOptions(CreateMqttRootTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMqttRootTopic", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateMqttRootTopicResponse());
    }

    public CreateMqttRootTopicResponse createMqttRootTopic(CreateMqttRootTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMqttRootTopicWithOptions(request, runtime);
    }

    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateNamespace", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateNamespaceResponse());
    }

    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    public CreateOsVersionResponse createOsVersionWithOptions(CreateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOsVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOsVersionResponse());
    }

    public CreateOsVersionResponse createOsVersion(CreateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOsVersionWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public CreateProjectAppResponse createProjectAppWithOptions(CreateProjectAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProjectApp", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectAppResponse());
    }

    public CreateProjectAppResponse createProjectApp(CreateProjectAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectAppWithOptions(request, runtime);
    }

    public CreateRpcServiceResponse createRpcServiceWithOptions(CreateRpcServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRpcService", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRpcServiceResponse());
    }

    public CreateRpcServiceResponse createRpcService(CreateRpcServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRpcServiceWithOptions(request, runtime);
    }

    public CreateSchemaSubscribeResponse createSchemaSubscribeWithOptions(CreateSchemaSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSchemaSubscribe", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSchemaSubscribeResponse());
    }

    public CreateSchemaSubscribeResponse createSchemaSubscribe(CreateSchemaSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSchemaSubscribeWithOptions(request, runtime);
    }

    public CreateShadowSchemaResponse createShadowSchemaWithOptions(CreateShadowSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateShadowSchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateShadowSchemaResponse());
    }

    public CreateShadowSchemaResponse createShadowSchema(CreateShadowSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createShadowSchemaWithOptions(request, runtime);
    }

    public CreateTriggerResponse createTriggerWithOptions(CreateTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTrigger", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTriggerResponse());
    }

    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTriggerWithOptions(request, runtime);
    }

    public CreateUpstreamAppKeyRelationResponse createUpstreamAppKeyRelationWithOptions(CreateUpstreamAppKeyRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUpstreamAppKeyRelation", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUpstreamAppKeyRelationResponse());
    }

    public CreateUpstreamAppKeyRelationResponse createUpstreamAppKeyRelation(CreateUpstreamAppKeyRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUpstreamAppKeyRelationWithOptions(request, runtime);
    }

    public CreateUpstreamAppKeyRelationsResponse createUpstreamAppKeyRelationsWithOptions(CreateUpstreamAppKeyRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUpstreamAppKeyRelations", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUpstreamAppKeyRelationsResponse());
    }

    public CreateUpstreamAppKeyRelationsResponse createUpstreamAppKeyRelations(CreateUpstreamAppKeyRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUpstreamAppKeyRelationsWithOptions(request, runtime);
    }

    public CreateUpstreamAppServerResponse createUpstreamAppServerWithOptions(CreateUpstreamAppServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUpstreamAppServer", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUpstreamAppServerResponse());
    }

    public CreateUpstreamAppServerResponse createUpstreamAppServer(CreateUpstreamAppServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUpstreamAppServerWithOptions(request, runtime);
    }

    public CreateVersionDeviceGroupResponse createVersionDeviceGroupWithOptions(CreateVersionDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVersionDeviceGroup", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVersionDeviceGroupResponse());
    }

    public CreateVersionDeviceGroupResponse createVersionDeviceGroup(CreateVersionDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVersionDeviceGroupWithOptions(request, runtime);
    }

    public CreateVersionPrepublishResponse createVersionPrepublishWithOptions(CreateVersionPrepublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVersionPrepublish", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVersionPrepublishResponse());
    }

    public CreateVersionPrepublishResponse createVersionPrepublish(CreateVersionPrepublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVersionPrepublishWithOptions(request, runtime);
    }

    public CreateVersionTestResponse createVersionTestWithOptions(CreateVersionTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVersionTest", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVersionTestResponse());
    }

    public CreateVersionTestResponse createVersionTest(CreateVersionTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVersionTestWithOptions(request, runtime);
    }

    public DelayPublishOsVersionResponse delayPublishOsVersionWithOptions(DelayPublishOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DelayPublishOsVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DelayPublishOsVersionResponse());
    }

    public DelayPublishOsVersionResponse delayPublishOsVersion(DelayPublishOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delayPublishOsVersionWithOptions(request, runtime);
    }

    public DeleteAllCustomizedFiltersResponse deleteAllCustomizedFiltersWithOptions(DeleteAllCustomizedFiltersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAllCustomizedFilters", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAllCustomizedFiltersResponse());
    }

    public DeleteAllCustomizedFiltersResponse deleteAllCustomizedFilters(DeleteAllCustomizedFiltersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAllCustomizedFiltersWithOptions(request, runtime);
    }

    public DeleteAllVersionGroupDevicesResponse deleteAllVersionGroupDevicesWithOptions(DeleteAllVersionGroupDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAllVersionGroupDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAllVersionGroupDevicesResponse());
    }

    public DeleteAllVersionGroupDevicesResponse deleteAllVersionGroupDevices(DeleteAllVersionGroupDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAllVersionGroupDevicesWithOptions(request, runtime);
    }

    public DeleteCustomizedFilterResponse deleteCustomizedFilterWithOptions(DeleteCustomizedFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomizedFilter", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomizedFilterResponse());
    }

    public DeleteCustomizedFilterResponse deleteCustomizedFilter(DeleteCustomizedFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomizedFilterWithOptions(request, runtime);
    }

    public DeleteCustomizedPropertyResponse deleteCustomizedPropertyWithOptions(DeleteCustomizedPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCustomizedProperty", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCustomizedPropertyResponse());
    }

    public DeleteCustomizedPropertyResponse deleteCustomizedProperty(DeleteCustomizedPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCustomizedPropertyWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDevice", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public DeleteFunctionFileResponse deleteFunctionFileWithOptions(DeleteFunctionFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFunctionFile", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFunctionFileResponse());
    }

    public DeleteFunctionFileResponse deleteFunctionFile(DeleteFunctionFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFunctionFileWithOptions(request, runtime);
    }

    public DeleteMqttRootTopicResponse deleteMqttRootTopicWithOptions(DeleteMqttRootTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteMqttRootTopic", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteMqttRootTopicResponse());
    }

    public DeleteMqttRootTopicResponse deleteMqttRootTopic(DeleteMqttRootTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteMqttRootTopicWithOptions(request, runtime);
    }

    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteNamespace", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteNamespaceResponse());
    }

    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    public DeleteOpenAccountResponse deleteOpenAccountWithOptions(DeleteOpenAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteOpenAccount", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DeleteOpenAccountResponse());
    }

    public DeleteOpenAccountResponse deleteOpenAccount(DeleteOpenAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOpenAccountWithOptions(request, runtime);
    }

    public DeleteProjectAppResponse deleteProjectAppWithOptions(DeleteProjectAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProjectApp", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectAppResponse());
    }

    public DeleteProjectAppResponse deleteProjectApp(DeleteProjectAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectAppWithOptions(request, runtime);
    }

    public DeleteRpcServiceResponse deleteRpcServiceWithOptions(DeleteRpcServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRpcService", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRpcServiceResponse());
    }

    public DeleteRpcServiceResponse deleteRpcService(DeleteRpcServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRpcServiceWithOptions(request, runtime);
    }

    public DeleteSchemaSubscribeResponse deleteSchemaSubscribeWithOptions(DeleteSchemaSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSchemaSubscribe", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSchemaSubscribeResponse());
    }

    public DeleteSchemaSubscribeResponse deleteSchemaSubscribe(DeleteSchemaSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSchemaSubscribeWithOptions(request, runtime);
    }

    public DeleteShadowSchemaResponse deleteShadowSchemaWithOptions(DeleteShadowSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteShadowSchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteShadowSchemaResponse());
    }

    public DeleteShadowSchemaResponse deleteShadowSchema(DeleteShadowSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteShadowSchemaWithOptions(request, runtime);
    }

    public DeleteTriggerResponse deleteTriggerWithOptions(DeleteTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTrigger", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTriggerResponse());
    }

    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTriggerWithOptions(request, runtime);
    }

    public DeleteUpstreamAppKeyRelationResponse deleteUpstreamAppKeyRelationWithOptions(DeleteUpstreamAppKeyRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUpstreamAppKeyRelation", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUpstreamAppKeyRelationResponse());
    }

    public DeleteUpstreamAppKeyRelationResponse deleteUpstreamAppKeyRelation(DeleteUpstreamAppKeyRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUpstreamAppKeyRelationWithOptions(request, runtime);
    }

    public DeleteUpstreamAppServerResponse deleteUpstreamAppServerWithOptions(DeleteUpstreamAppServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUpstreamAppServer", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUpstreamAppServerResponse());
    }

    public DeleteUpstreamAppServerResponse deleteUpstreamAppServer(DeleteUpstreamAppServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUpstreamAppServerWithOptions(request, runtime);
    }

    public DeleteVersionAllBlackDevicesResponse deleteVersionAllBlackDevicesWithOptions(DeleteVersionAllBlackDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionAllBlackDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionAllBlackDevicesResponse());
    }

    public DeleteVersionAllBlackDevicesResponse deleteVersionAllBlackDevices(DeleteVersionAllBlackDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionAllBlackDevicesWithOptions(request, runtime);
    }

    public DeleteVersionAllWhiteDevicesResponse deleteVersionAllWhiteDevicesWithOptions(DeleteVersionAllWhiteDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionAllWhiteDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionAllWhiteDevicesResponse());
    }

    public DeleteVersionAllWhiteDevicesResponse deleteVersionAllWhiteDevices(DeleteVersionAllWhiteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionAllWhiteDevicesWithOptions(request, runtime);
    }

    public DeleteVersionBlackDevicesResponse deleteVersionBlackDevicesWithOptions(DeleteVersionBlackDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionBlackDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionBlackDevicesResponse());
    }

    public DeleteVersionBlackDevicesResponse deleteVersionBlackDevices(DeleteVersionBlackDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionBlackDevicesWithOptions(request, runtime);
    }

    public DeleteVersionBlackDevicesByIdResponse deleteVersionBlackDevicesByIdWithOptions(DeleteVersionBlackDevicesByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionBlackDevicesById", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionBlackDevicesByIdResponse());
    }

    public DeleteVersionBlackDevicesByIdResponse deleteVersionBlackDevicesById(DeleteVersionBlackDevicesByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionBlackDevicesByIdWithOptions(request, runtime);
    }

    public DeleteVersionDeviceGroupResponse deleteVersionDeviceGroupWithOptions(DeleteVersionDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionDeviceGroup", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionDeviceGroupResponse());
    }

    public DeleteVersionDeviceGroupResponse deleteVersionDeviceGroup(DeleteVersionDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionDeviceGroupWithOptions(request, runtime);
    }

    public DeleteVersionGroupDeviceResponse deleteVersionGroupDeviceWithOptions(DeleteVersionGroupDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionGroupDevice", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionGroupDeviceResponse());
    }

    public DeleteVersionGroupDeviceResponse deleteVersionGroupDevice(DeleteVersionGroupDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionGroupDeviceWithOptions(request, runtime);
    }

    public DeleteVersionGroupDeviceByIdResponse deleteVersionGroupDeviceByIdWithOptions(DeleteVersionGroupDeviceByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionGroupDeviceById", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionGroupDeviceByIdResponse());
    }

    public DeleteVersionGroupDeviceByIdResponse deleteVersionGroupDeviceById(DeleteVersionGroupDeviceByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionGroupDeviceByIdWithOptions(request, runtime);
    }

    public DeleteVersionTestResponse deleteVersionTestWithOptions(DeleteVersionTestRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionTest", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionTestResponse());
    }

    public DeleteVersionTestResponse deleteVersionTest(DeleteVersionTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionTestWithOptions(request, runtime);
    }

    public DeleteVersionWhiteDevicesResponse deleteVersionWhiteDevicesWithOptions(DeleteVersionWhiteDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionWhiteDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionWhiteDevicesResponse());
    }

    public DeleteVersionWhiteDevicesResponse deleteVersionWhiteDevices(DeleteVersionWhiteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionWhiteDevicesWithOptions(request, runtime);
    }

    public DeleteVersionWhiteDevicesByIdResponse deleteVersionWhiteDevicesByIdWithOptions(DeleteVersionWhiteDevicesByIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteVersionWhiteDevicesById", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteVersionWhiteDevicesByIdResponse());
    }

    public DeleteVersionWhiteDevicesByIdResponse deleteVersionWhiteDevicesById(DeleteVersionWhiteDevicesByIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVersionWhiteDevicesByIdWithOptions(request, runtime);
    }

    public DeployFunctionFileResponse deployFunctionFileWithOptions(DeployFunctionFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeployFunctionFile", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeployFunctionFileResponse());
    }

    public DeployFunctionFileResponse deployFunctionFile(DeployFunctionFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deployFunctionFileWithOptions(request, runtime);
    }

    public DescribeApiGatewayAppSecurityResponse describeApiGatewayAppSecurityWithOptions(DescribeApiGatewayAppSecurityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeApiGatewayAppSecurity", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeApiGatewayAppSecurityResponse());
    }

    public DescribeApiGatewayAppSecurityResponse describeApiGatewayAppSecurity(DescribeApiGatewayAppSecurityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeApiGatewayAppSecurityWithOptions(request, runtime);
    }

    public DescribeAppVersionResponse describeAppVersionWithOptions(DescribeAppVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppVersionResponse());
    }

    public DescribeAppVersionResponse describeAppVersion(DescribeAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppVersionWithOptions(request, runtime);
    }

    public DescribeAssistReportResponse describeAssistReportWithOptions(DescribeAssistReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssistReport", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeAssistReportResponse());
    }

    public DescribeAssistReportResponse describeAssistReport(DescribeAssistReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssistReportWithOptions(request, runtime);
    }

    public DescribeAssistRTMPServerAddressResponse describeAssistRTMPServerAddressWithOptions(DescribeAssistRTMPServerAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssistRTMPServerAddress", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeAssistRTMPServerAddressResponse());
    }

    public DescribeAssistRTMPServerAddressResponse describeAssistRTMPServerAddress(DescribeAssistRTMPServerAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssistRTMPServerAddressWithOptions(request, runtime);
    }

    public DescribeAssistWSServerAddressResponse describeAssistWSServerAddressWithOptions(DescribeAssistWSServerAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAssistWSServerAddress", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeAssistWSServerAddressResponse());
    }

    public DescribeAssistWSServerAddressResponse describeAssistWSServerAddress(DescribeAssistWSServerAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAssistWSServerAddressWithOptions(request, runtime);
    }

    public DescribeCustomizedFilterResponse describeCustomizedFilterWithOptions(DescribeCustomizedFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCustomizedFilter", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCustomizedFilterResponse());
    }

    public DescribeCustomizedFilterResponse describeCustomizedFilter(DescribeCustomizedFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCustomizedFilterWithOptions(request, runtime);
    }

    public DescribeDefaultSchemaResponse describeDefaultSchemaWithOptions(DescribeDefaultSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDefaultSchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDefaultSchemaResponse());
    }

    public DescribeDefaultSchemaResponse describeDefaultSchema(DescribeDefaultSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDefaultSchemaWithOptions(request, runtime);
    }

    public DescribeDeviceResponse describeDeviceWithOptions(DescribeDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDevice", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceResponse());
    }

    public DescribeDeviceResponse describeDevice(DescribeDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceWithOptions(request, runtime);
    }

    public DescribeDeviceBrandResponse describeDeviceBrandWithOptions(DescribeDeviceBrandRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceBrand", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDeviceBrandResponse());
    }

    public DescribeDeviceBrandResponse describeDeviceBrand(DescribeDeviceBrandRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceBrandWithOptions(request, runtime);
    }

    public DescribeDeviceIdByOuterInfoResponse describeDeviceIdByOuterInfoWithOptions(DescribeDeviceIdByOuterInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceIdByOuterInfo", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDeviceIdByOuterInfoResponse());
    }

    public DescribeDeviceIdByOuterInfoResponse describeDeviceIdByOuterInfo(DescribeDeviceIdByOuterInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceIdByOuterInfoWithOptions(request, runtime);
    }

    public DescribeDeviceInfoResponse describeDeviceInfoWithOptions(DescribeDeviceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceInfo", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDeviceInfoResponse());
    }

    public DescribeDeviceInfoResponse describeDeviceInfo(DescribeDeviceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceInfoWithOptions(request, runtime);
    }

    public DescribeDeviceModelResponse describeDeviceModelWithOptions(DescribeDeviceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceModel", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeDeviceModelResponse());
    }

    public DescribeDeviceModelResponse describeDeviceModel(DescribeDeviceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceModelWithOptions(request, runtime);
    }

    public DescribeDeviceOnlineInfoResponse describeDeviceOnlineInfoWithOptions(DescribeDeviceOnlineInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceOnlineInfo", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceOnlineInfoResponse());
    }

    public DescribeDeviceOnlineInfoResponse describeDeviceOnlineInfo(DescribeDeviceOnlineInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceOnlineInfoWithOptions(request, runtime);
    }

    public DescribeDeviceShadowResponse describeDeviceShadowWithOptions(DescribeDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceShadow", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceShadowResponse());
    }

    public DescribeDeviceShadowResponse describeDeviceShadow(DescribeDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceShadowWithOptions(request, runtime);
    }

    public DescribeDeviceValiditySchemaResponse describeDeviceValiditySchemaWithOptions(DescribeDeviceValiditySchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDeviceValiditySchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDeviceValiditySchemaResponse());
    }

    public DescribeDeviceValiditySchemaResponse describeDeviceValiditySchema(DescribeDeviceValiditySchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDeviceValiditySchemaWithOptions(request, runtime);
    }

    public DescribeMessageResponse describeMessageWithOptions(DescribeMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMessageResponse());
    }

    public DescribeMessageResponse describeMessage(DescribeMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMessageWithOptions(request, runtime);
    }

    public DescribeMqttClientStatusResponse describeMqttClientStatusWithOptions(DescribeMqttClientStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMqttClientStatus", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMqttClientStatusResponse());
    }

    public DescribeMqttClientStatusResponse describeMqttClientStatus(DescribeMqttClientStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMqttClientStatusWithOptions(request, runtime);
    }

    public DescribeMqttMessageResponse describeMqttMessageWithOptions(DescribeMqttMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMqttMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMqttMessageResponse());
    }

    public DescribeMqttMessageResponse describeMqttMessage(DescribeMqttMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMqttMessageWithOptions(request, runtime);
    }

    public DescribeMqttTopicSubscriptionResponse describeMqttTopicSubscriptionWithOptions(DescribeMqttTopicSubscriptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMqttTopicSubscription", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMqttTopicSubscriptionResponse());
    }

    public DescribeMqttTopicSubscriptionResponse describeMqttTopicSubscription(DescribeMqttTopicSubscriptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMqttTopicSubscriptionWithOptions(request, runtime);
    }

    public DescribeOpenAccountResponse describeOpenAccountWithOptions(DescribeOpenAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOpenAccount", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new DescribeOpenAccountResponse());
    }

    public DescribeOpenAccountResponse describeOpenAccount(DescribeOpenAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOpenAccountWithOptions(request, runtime);
    }

    public DescribeOsVersionResponse describeOsVersionWithOptions(DescribeOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeOsVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeOsVersionResponse());
    }

    public DescribeOsVersionResponse describeOsVersion(DescribeOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeOsVersionWithOptions(request, runtime);
    }

    public DescribeProjectResponse describeProjectWithOptions(DescribeProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProject", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProjectResponse());
    }

    public DescribeProjectResponse describeProject(DescribeProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProjectWithOptions(request, runtime);
    }

    public DescribeProjectAppSecurityResponse describeProjectAppSecurityWithOptions(DescribeProjectAppSecurityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeProjectAppSecurity", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeProjectAppSecurityResponse());
    }

    public DescribeProjectAppSecurityResponse describeProjectAppSecurity(DescribeProjectAppSecurityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeProjectAppSecurityWithOptions(request, runtime);
    }

    public DescribeShadowSchemaResponse describeShadowSchemaWithOptions(DescribeShadowSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeShadowSchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeShadowSchemaResponse());
    }

    public DescribeShadowSchemaResponse describeShadowSchema(DescribeShadowSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeShadowSchemaWithOptions(request, runtime);
    }

    public DescribeVersionDeviceGroupResponse describeVersionDeviceGroupWithOptions(DescribeVersionDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeVersionDeviceGroup", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeVersionDeviceGroupResponse());
    }

    public DescribeVersionDeviceGroupResponse describeVersionDeviceGroup(DescribeVersionDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeVersionDeviceGroupWithOptions(request, runtime);
    }

    public DiagnosisVersionResponse diagnosisVersionWithOptions(DiagnosisVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DiagnosisVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new DiagnosisVersionResponse());
    }

    public DiagnosisVersionResponse diagnosisVersion(DiagnosisVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.diagnosisVersionWithOptions(request, runtime);
    }

    public FindAppVersionsResponse findAppVersionsWithOptions(FindAppVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindAppVersions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindAppVersionsResponse());
    }

    public FindAppVersionsResponse findAppVersions(FindAppVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findAppVersionsWithOptions(request, runtime);
    }

    public FindCustomizedFiltersResponse findCustomizedFiltersWithOptions(FindCustomizedFiltersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindCustomizedFilters", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindCustomizedFiltersResponse());
    }

    public FindCustomizedFiltersResponse findCustomizedFilters(FindCustomizedFiltersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findCustomizedFiltersWithOptions(request, runtime);
    }

    public FindCustomizedPropertiesResponse findCustomizedPropertiesWithOptions(FindCustomizedPropertiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindCustomizedProperties", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindCustomizedPropertiesResponse());
    }

    public FindCustomizedPropertiesResponse findCustomizedProperties(FindCustomizedPropertiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findCustomizedPropertiesWithOptions(request, runtime);
    }

    public FindOsVersionsResponse findOsVersionsWithOptions(FindOsVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindOsVersions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindOsVersionsResponse());
    }

    public FindOsVersionsResponse findOsVersions(FindOsVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findOsVersionsWithOptions(request, runtime);
    }

    public FindPrepublishesByParentIdResponse findPrepublishesByParentIdWithOptions(FindPrepublishesByParentIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindPrepublishesByParentId", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindPrepublishesByParentIdResponse());
    }

    public FindPrepublishesByParentIdResponse findPrepublishesByParentId(FindPrepublishesByParentIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findPrepublishesByParentIdWithOptions(request, runtime);
    }

    public FindPrepublishesByVersionIdResponse findPrepublishesByVersionIdWithOptions(FindPrepublishesByVersionIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindPrepublishesByVersionId", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindPrepublishesByVersionIdResponse());
    }

    public FindPrepublishesByVersionIdResponse findPrepublishesByVersionId(FindPrepublishesByVersionIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findPrepublishesByVersionIdWithOptions(request, runtime);
    }

    public FindPrepublishPassedDevicesResponse findPrepublishPassedDevicesWithOptions(FindPrepublishPassedDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindPrepublishPassedDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindPrepublishPassedDevicesResponse());
    }

    public FindPrepublishPassedDevicesResponse findPrepublishPassedDevices(FindPrepublishPassedDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findPrepublishPassedDevicesWithOptions(request, runtime);
    }

    public FindVersionBlackDevicesResponse findVersionBlackDevicesWithOptions(FindVersionBlackDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionBlackDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionBlackDevicesResponse());
    }

    public FindVersionBlackDevicesResponse findVersionBlackDevices(FindVersionBlackDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionBlackDevicesWithOptions(request, runtime);
    }

    public FindVersionDeviceGroupsResponse findVersionDeviceGroupsWithOptions(FindVersionDeviceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionDeviceGroups", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionDeviceGroupsResponse());
    }

    public FindVersionDeviceGroupsResponse findVersionDeviceGroups(FindVersionDeviceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionDeviceGroupsWithOptions(request, runtime);
    }

    public FindVersionGroupDevicesResponse findVersionGroupDevicesWithOptions(FindVersionGroupDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionGroupDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionGroupDevicesResponse());
    }

    public FindVersionGroupDevicesResponse findVersionGroupDevices(FindVersionGroupDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionGroupDevicesWithOptions(request, runtime);
    }

    public FindVersionMessagesResponse findVersionMessagesWithOptions(FindVersionMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionMessages", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionMessagesResponse());
    }

    public FindVersionMessagesResponse findVersionMessages(FindVersionMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionMessagesWithOptions(request, runtime);
    }

    public FindVersionMessageSendRecordsResponse findVersionMessageSendRecordsWithOptions(FindVersionMessageSendRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionMessageSendRecords", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionMessageSendRecordsResponse());
    }

    public FindVersionMessageSendRecordsResponse findVersionMessageSendRecords(FindVersionMessageSendRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionMessageSendRecordsWithOptions(request, runtime);
    }

    public FindVersionTestsResponse findVersionTestsWithOptions(FindVersionTestsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionTests", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionTestsResponse());
    }

    public FindVersionTestsResponse findVersionTests(FindVersionTestsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionTestsWithOptions(request, runtime);
    }

    public FindVersionWhiteDevicesResponse findVersionWhiteDevicesWithOptions(FindVersionWhiteDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FindVersionWhiteDevices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new FindVersionWhiteDevicesResponse());
    }

    public FindVersionWhiteDevicesResponse findVersionWhiteDevices(FindVersionWhiteDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.findVersionWhiteDevicesWithOptions(request, runtime);
    }

    public GenerateAssistFileUploadUrlResponse generateAssistFileUploadUrlWithOptions(GenerateAssistFileUploadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAssistFileUploadUrl", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAssistFileUploadUrlResponse());
    }

    public GenerateAssistFileUploadUrlResponse generateAssistFileUploadUrl(GenerateAssistFileUploadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAssistFileUploadUrlWithOptions(request, runtime);
    }

    public GenerateFunctionFileUploadMetaResponse generateFunctionFileUploadMetaWithOptions(GenerateFunctionFileUploadMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateFunctionFileUploadMeta", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateFunctionFileUploadMetaResponse());
    }

    public GenerateFunctionFileUploadMetaResponse generateFunctionFileUploadMeta(GenerateFunctionFileUploadMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateFunctionFileUploadMetaWithOptions(request, runtime);
    }

    public GenerateOssPostPolicyResponse generateOssPostPolicyWithOptions(GenerateOssPostPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateOssPostPolicy", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateOssPostPolicyResponse());
    }

    public GenerateOssPostPolicyResponse generateOssPostPolicy(GenerateOssPostPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateOssPostPolicyWithOptions(request, runtime);
    }

    public GenerateOssUploadMetaResponse generateOssUploadMetaWithOptions(GenerateOssUploadMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateOssUploadMeta", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateOssUploadMetaResponse());
    }

    public GenerateOssUploadMetaResponse generateOssUploadMeta(GenerateOssUploadMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateOssUploadMetaWithOptions(request, runtime);
    }

    public GenerateSdkDownloadInfoResponse generateSdkDownloadInfoWithOptions(GenerateSdkDownloadInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateSdkDownloadInfo", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateSdkDownloadInfoResponse());
    }

    public GenerateSdkDownloadInfoResponse generateSdkDownloadInfo(GenerateSdkDownloadInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateSdkDownloadInfoWithOptions(request, runtime);
    }

    public GenerateSysAppDownloadInfoResponse generateSysAppDownloadInfoWithOptions(GenerateSysAppDownloadInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateSysAppDownloadInfo", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateSysAppDownloadInfoResponse());
    }

    public GenerateSysAppDownloadInfoResponse generateSysAppDownloadInfo(GenerateSysAppDownloadInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateSysAppDownloadInfoWithOptions(request, runtime);
    }

    public GetDeviceAppUpdateFunnelEventsResponse getDeviceAppUpdateFunnelEventsWithOptions(GetDeviceAppUpdateFunnelEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceAppUpdateFunnelEvents", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceAppUpdateFunnelEventsResponse());
    }

    public GetDeviceAppUpdateFunnelEventsResponse getDeviceAppUpdateFunnelEvents(GetDeviceAppUpdateFunnelEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceAppUpdateFunnelEventsWithOptions(request, runtime);
    }

    public GetDeviceSystemUpdateFunnelEventsResponse getDeviceSystemUpdateFunnelEventsWithOptions(GetDeviceSystemUpdateFunnelEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDeviceSystemUpdateFunnelEvents", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDeviceSystemUpdateFunnelEventsResponse());
    }

    public GetDeviceSystemUpdateFunnelEventsResponse getDeviceSystemUpdateFunnelEvents(GetDeviceSystemUpdateFunnelEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceSystemUpdateFunnelEventsWithOptions(request, runtime);
    }

    public GetNamespaceDataResponse getNamespaceDataWithOptions(GetNamespaceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNamespaceData", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetNamespaceDataResponse());
    }

    public GetNamespaceDataResponse getNamespaceData(GetNamespaceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNamespaceDataWithOptions(request, runtime);
    }

    public GetOssUploadMetaResponse getOssUploadMetaWithOptions(GetOssUploadMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOssUploadMeta", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOssUploadMetaResponse());
    }

    public GetOssUploadMetaResponse getOssUploadMeta(GetOssUploadMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOssUploadMetaWithOptions(request, runtime);
    }

    public InvokeFunctionResponse invokeFunctionWithOptions(InvokeFunctionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InvokeFunction", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new InvokeFunctionResponse());
    }

    public InvokeFunctionResponse invokeFunction(InvokeFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeFunctionWithOptions(request, runtime);
    }

    public ListApiGatewayAppsResponse listApiGatewayAppsWithOptions(ListApiGatewayAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApiGatewayApps", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListApiGatewayAppsResponse());
    }

    public ListApiGatewayAppsResponse listApiGatewayApps(ListApiGatewayAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApiGatewayAppsWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApps", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public ListAssistActionDetailsResponse listAssistActionDetailsWithOptions(ListAssistActionDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAssistActionDetails", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListAssistActionDetailsResponse());
    }

    public ListAssistActionDetailsResponse listAssistActionDetails(ListAssistActionDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAssistActionDetailsWithOptions(request, runtime);
    }

    public ListAssistDevicesResponse listAssistDevicesWithOptions(ListAssistDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAssistDevices", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListAssistDevicesResponse());
    }

    public ListAssistDevicesResponse listAssistDevices(ListAssistDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAssistDevicesWithOptions(request, runtime);
    }

    public ListAssistHistoriesResponse listAssistHistoriesWithOptions(ListAssistHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAssistHistories", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListAssistHistoriesResponse());
    }

    public ListAssistHistoriesResponse listAssistHistories(ListAssistHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAssistHistoriesWithOptions(request, runtime);
    }

    public ListAssistHistoryDetailsResponse listAssistHistoryDetailsWithOptions(ListAssistHistoryDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAssistHistoryDetails", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListAssistHistoryDetailsResponse());
    }

    public ListAssistHistoryDetailsResponse listAssistHistoryDetails(ListAssistHistoryDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAssistHistoryDetailsWithOptions(request, runtime);
    }

    public ListClientPluginsResponse listClientPluginsWithOptions(ListClientPluginsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClientPlugins", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListClientPluginsResponse());
    }

    public ListClientPluginsResponse listClientPlugins(ListClientPluginsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClientPluginsWithOptions(request, runtime);
    }

    public ListClientPluginVersionsResponse listClientPluginVersionsWithOptions(ListClientPluginVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClientPluginVersions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListClientPluginVersionsResponse());
    }

    public ListClientPluginVersionsResponse listClientPluginVersions(ListClientPluginVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClientPluginVersionsWithOptions(request, runtime);
    }

    public ListClientSdksResponse listClientSdksWithOptions(ListClientSdksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClientSdks", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListClientSdksResponse());
    }

    public ListClientSdksResponse listClientSdks(ListClientSdksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClientSdksWithOptions(request, runtime);
    }

    public ListConnectLogsResponse listConnectLogsWithOptions(ListConnectLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConnectLogs", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListConnectLogsResponse());
    }

    public ListConnectLogsResponse listConnectLogs(ListConnectLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConnectLogsWithOptions(request, runtime);
    }

    public ListDeployedFunctionsResponse listDeployedFunctionsWithOptions(ListDeployedFunctionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeployedFunctions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDeployedFunctionsResponse());
    }

    public ListDeployedFunctionsResponse listDeployedFunctions(ListDeployedFunctionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployedFunctionsWithOptions(request, runtime);
    }

    public ListDeviceBrandsResponse listDeviceBrandsWithOptions(ListDeviceBrandsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceBrands", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceBrandsResponse());
    }

    public ListDeviceBrandsResponse listDeviceBrands(ListDeviceBrandsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceBrandsWithOptions(request, runtime);
    }

    public ListDeviceModelResponse listDeviceModelWithOptions(ListDeviceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceModel", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceModelResponse());
    }

    public ListDeviceModelResponse listDeviceModel(ListDeviceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceModelWithOptions(request, runtime);
    }

    public ListDeviceModelsResponse listDeviceModelsWithOptions(ListDeviceModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceModels", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceModelsResponse());
    }

    public ListDeviceModelsResponse listDeviceModels(ListDeviceModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceModelsWithOptions(request, runtime);
    }

    public ListDevicesResponse listDevicesWithOptions(ListDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDevices", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListDevicesResponse());
    }

    public ListDevicesResponse listDevices(ListDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDevicesWithOptions(request, runtime);
    }

    public ListDeviceTypesResponse listDeviceTypesWithOptions(ListDeviceTypesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeviceTypes", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeviceTypesResponse());
    }

    public ListDeviceTypesResponse listDeviceTypes(ListDeviceTypesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceTypesWithOptions(request, runtime);
    }

    public ListFunctionExecuteLogResponse listFunctionExecuteLogWithOptions(ListFunctionExecuteLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunctionExecuteLog", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionExecuteLogResponse());
    }

    public ListFunctionExecuteLogResponse listFunctionExecuteLog(ListFunctionExecuteLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionExecuteLogWithOptions(request, runtime);
    }

    public ListFunctionFilesResponse listFunctionFilesWithOptions(ListFunctionFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunctionFiles", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionFilesResponse());
    }

    public ListFunctionFilesResponse listFunctionFiles(ListFunctionFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionFilesWithOptions(request, runtime);
    }

    public ListFunctionFilesByProjectIdResponse listFunctionFilesByProjectIdWithOptions(ListFunctionFilesByProjectIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFunctionFilesByProjectId", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListFunctionFilesByProjectIdResponse());
    }

    public ListFunctionFilesByProjectIdResponse listFunctionFilesByProjectId(ListFunctionFilesByProjectIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFunctionFilesByProjectIdWithOptions(request, runtime);
    }

    public ListMessageAcksResponse listMessageAcksWithOptions(ListMessageAcksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMessageAcks", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListMessageAcksResponse());
    }

    public ListMessageAcksResponse listMessageAcks(ListMessageAcksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMessageAcksWithOptions(request, runtime);
    }

    public ListMessageReceiversResponse listMessageReceiversWithOptions(ListMessageReceiversRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMessageReceivers", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListMessageReceiversResponse());
    }

    public ListMessageReceiversResponse listMessageReceivers(ListMessageReceiversRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMessageReceiversWithOptions(request, runtime);
    }

    public ListMqttClientSubscriptionsResponse listMqttClientSubscriptionsWithOptions(ListMqttClientSubscriptionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMqttClientSubscriptions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListMqttClientSubscriptionsResponse());
    }

    public ListMqttClientSubscriptionsResponse listMqttClientSubscriptions(ListMqttClientSubscriptionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMqttClientSubscriptionsWithOptions(request, runtime);
    }

    public ListMqttMessageLogsResponse listMqttMessageLogsWithOptions(ListMqttMessageLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMqttMessageLogs", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListMqttMessageLogsResponse());
    }

    public ListMqttMessageLogsResponse listMqttMessageLogs(ListMqttMessageLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMqttMessageLogsWithOptions(request, runtime);
    }

    public ListMqttRootTopicsResponse listMqttRootTopicsWithOptions(ListMqttRootTopicsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListMqttRootTopics", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListMqttRootTopicsResponse());
    }

    public ListMqttRootTopicsResponse listMqttRootTopics(ListMqttRootTopicsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listMqttRootTopicsWithOptions(request, runtime);
    }

    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListNamespaces", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListNamespacesResponse());
    }

    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    public ListOfflineMessagesResponse listOfflineMessagesWithOptions(ListOfflineMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOfflineMessages", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListOfflineMessagesResponse());
    }

    public ListOfflineMessagesResponse listOfflineMessages(ListOfflineMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOfflineMessagesWithOptions(request, runtime);
    }

    public ListOpenAccountLinksResponse listOpenAccountLinksWithOptions(ListOpenAccountLinksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOpenAccountLinks", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListOpenAccountLinksResponse());
    }

    public ListOpenAccountLinksResponse listOpenAccountLinks(ListOpenAccountLinksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenAccountLinksWithOptions(request, runtime);
    }

    public ListOpenAccountsResponse listOpenAccountsWithOptions(ListOpenAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOpenAccounts", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListOpenAccountsResponse());
    }

    public ListOpenAccountsResponse listOpenAccounts(ListOpenAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOpenAccountsWithOptions(request, runtime);
    }

    public ListPreChecksResponse listPreChecksWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListPreChecks", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListPreChecksResponse());
    }

    public ListPreChecksResponse listPreChecks() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPreChecksWithOptions(runtime);
    }

    public ListProjectAppsResponse listProjectAppsWithOptions(ListProjectAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjectApps", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectAppsResponse());
    }

    public ListProjectAppsResponse listProjectApps(ListProjectAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectAppsWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListProjects", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(runtime);
    }

    public ListRpcServicesResponse listRpcServicesWithOptions(ListRpcServicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRpcServices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListRpcServicesResponse());
    }

    public ListRpcServicesResponse listRpcServices(ListRpcServicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRpcServicesWithOptions(request, runtime);
    }

    public ListSchemaSubscribesResponse listSchemaSubscribesWithOptions(ListSchemaSubscribesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSchemaSubscribes", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListSchemaSubscribesResponse());
    }

    public ListSchemaSubscribesResponse listSchemaSubscribes(ListSchemaSubscribesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSchemaSubscribesWithOptions(request, runtime);
    }

    public ListServicesResponse listServicesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListServices", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListServicesResponse());
    }

    public ListServicesResponse listServices() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listServicesWithOptions(runtime);
    }

    public ListShadowSchemaDeviceModelsResponse listShadowSchemaDeviceModelsWithOptions(ListShadowSchemaDeviceModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListShadowSchemaDeviceModels", "2018-05-01", "HTTPS", "GET", "AK", "json", req, runtime), new ListShadowSchemaDeviceModelsResponse());
    }

    public ListShadowSchemaDeviceModelsResponse listShadowSchemaDeviceModels(ListShadowSchemaDeviceModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listShadowSchemaDeviceModelsWithOptions(request, runtime);
    }

    public ListShadowSchemasResponse listShadowSchemasWithOptions(ListShadowSchemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListShadowSchemas", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListShadowSchemasResponse());
    }

    public ListShadowSchemasResponse listShadowSchemas(ListShadowSchemasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listShadowSchemasWithOptions(request, runtime);
    }

    public ListSupportFeaturesResponse listSupportFeaturesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListSupportFeatures", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSupportFeaturesResponse());
    }

    public ListSupportFeaturesResponse listSupportFeatures() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSupportFeaturesWithOptions(runtime);
    }

    public ListTriggersResponse listTriggersWithOptions(ListTriggersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTriggers", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTriggersResponse());
    }

    public ListTriggersResponse listTriggers(ListTriggersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTriggersWithOptions(request, runtime);
    }

    public ListUpstreamAppKeyRelationsResponse listUpstreamAppKeyRelationsWithOptions(ListUpstreamAppKeyRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUpstreamAppKeyRelations", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUpstreamAppKeyRelationsResponse());
    }

    public ListUpstreamAppKeyRelationsResponse listUpstreamAppKeyRelations(ListUpstreamAppKeyRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUpstreamAppKeyRelationsWithOptions(request, runtime);
    }

    public ListUpstreamAppServersResponse listUpstreamAppServersWithOptions(ListUpstreamAppServersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUpstreamAppServers", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUpstreamAppServersResponse());
    }

    public ListUpstreamAppServersResponse listUpstreamAppServers(ListUpstreamAppServersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUpstreamAppServersWithOptions(request, runtime);
    }

    public ListVersionDeviceGroupsResponse listVersionDeviceGroupsWithOptions(ListVersionDeviceGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListVersionDeviceGroups", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListVersionDeviceGroupsResponse());
    }

    public ListVersionDeviceGroupsResponse listVersionDeviceGroups(ListVersionDeviceGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVersionDeviceGroupsWithOptions(request, runtime);
    }

    public PublishAppVersionResponse publishAppVersionWithOptions(PublishAppVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishAppVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishAppVersionResponse());
    }

    public PublishAppVersionResponse publishAppVersion(PublishAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishAppVersionWithOptions(request, runtime);
    }

    public PublishMqttMessageResponse publishMqttMessageWithOptions(PublishMqttMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishMqttMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishMqttMessageResponse());
    }

    public PublishMqttMessageResponse publishMqttMessage(PublishMqttMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishMqttMessageWithOptions(request, runtime);
    }

    public PublishOsVersionResponse publishOsVersionWithOptions(PublishOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PublishOsVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new PublishOsVersionResponse());
    }

    public PublishOsVersionResponse publishOsVersion(PublishOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishOsVersionWithOptions(request, runtime);
    }

    public PushMessageResponse pushMessageWithOptions(PushMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushMessageResponse());
    }

    public PushMessageResponse pushMessage(PushMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushMessageWithOptions(request, runtime);
    }

    public PushVersionMessageResponse pushVersionMessageWithOptions(PushVersionMessageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushVersionMessage", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new PushVersionMessageResponse());
    }

    public PushVersionMessageResponse pushVersionMessage(PushVersionMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushVersionMessageWithOptions(request, runtime);
    }

    public QueryPrepublishPassedDeviceCountResponse queryPrepublishPassedDeviceCountWithOptions(QueryPrepublishPassedDeviceCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPrepublishPassedDeviceCount", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPrepublishPassedDeviceCountResponse());
    }

    public QueryPrepublishPassedDeviceCountResponse queryPrepublishPassedDeviceCount(QueryPrepublishPassedDeviceCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPrepublishPassedDeviceCountWithOptions(request, runtime);
    }

    public SubmitAssistReportResponse submitAssistReportWithOptions(SubmitAssistReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitAssistReport", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitAssistReportResponse());
    }

    public SubmitAssistReportResponse submitAssistReport(SubmitAssistReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitAssistReportWithOptions(request, runtime);
    }

    public UpdateApiGatewayAppStatusResponse updateApiGatewayAppStatusWithOptions(UpdateApiGatewayAppStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApiGatewayAppStatus", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateApiGatewayAppStatusResponse());
    }

    public UpdateApiGatewayAppStatusResponse updateApiGatewayAppStatus(UpdateApiGatewayAppStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateApiGatewayAppStatusWithOptions(request, runtime);
    }

    public UpdateAppBlackWhiteVersionsResponse updateAppBlackWhiteVersionsWithOptions(UpdateAppBlackWhiteVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppBlackWhiteVersions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppBlackWhiteVersionsResponse());
    }

    public UpdateAppBlackWhiteVersionsResponse updateAppBlackWhiteVersions(UpdateAppBlackWhiteVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppBlackWhiteVersionsWithOptions(request, runtime);
    }

    public UpdateAppVersionResponse updateAppVersionWithOptions(UpdateAppVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppVersionResponse());
    }

    public UpdateAppVersionResponse updateAppVersion(UpdateAppVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppVersionWithOptions(request, runtime);
    }

    public UpdateAppVersionReleaseNoteResponse updateAppVersionReleaseNoteWithOptions(UpdateAppVersionReleaseNoteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppVersionReleaseNote", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppVersionReleaseNoteResponse());
    }

    public UpdateAppVersionReleaseNoteResponse updateAppVersionReleaseNote(UpdateAppVersionReleaseNoteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppVersionReleaseNoteWithOptions(request, runtime);
    }

    public UpdateAppVersionRemarkResponse updateAppVersionRemarkWithOptions(UpdateAppVersionRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppVersionRemark", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppVersionRemarkResponse());
    }

    public UpdateAppVersionRemarkResponse updateAppVersionRemark(UpdateAppVersionRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppVersionRemarkWithOptions(request, runtime);
    }

    public UpdateAppVersionStatusResponse updateAppVersionStatusWithOptions(UpdateAppVersionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppVersionStatus", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppVersionStatusResponse());
    }

    public UpdateAppVersionStatusResponse updateAppVersionStatus(UpdateAppVersionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppVersionStatusWithOptions(request, runtime);
    }

    public UpdateCustomizedFilterResponse updateCustomizedFilterWithOptions(UpdateCustomizedFilterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCustomizedFilter", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCustomizedFilterResponse());
    }

    public UpdateCustomizedFilterResponse updateCustomizedFilter(UpdateCustomizedFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCustomizedFilterWithOptions(request, runtime);
    }

    public UpdateDeviceModelResponse updateDeviceModelWithOptions(UpdateDeviceModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDeviceModel", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDeviceModelResponse());
    }

    public UpdateDeviceModelResponse updateDeviceModel(UpdateDeviceModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceModelWithOptions(request, runtime);
    }

    public UpdateNamespaceDataResponse updateNamespaceDataWithOptions(UpdateNamespaceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateNamespaceData", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateNamespaceDataResponse());
    }

    public UpdateNamespaceDataResponse updateNamespaceData(UpdateNamespaceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateNamespaceDataWithOptions(request, runtime);
    }

    public UpdateOsBlackWhiteVersionsResponse updateOsBlackWhiteVersionsWithOptions(UpdateOsBlackWhiteVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsBlackWhiteVersions", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsBlackWhiteVersionsResponse());
    }

    public UpdateOsBlackWhiteVersionsResponse updateOsBlackWhiteVersions(UpdateOsBlackWhiteVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsBlackWhiteVersionsWithOptions(request, runtime);
    }

    public UpdateOsVersionResponse updateOsVersionWithOptions(UpdateOsVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsVersion", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsVersionResponse());
    }

    public UpdateOsVersionResponse updateOsVersion(UpdateOsVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionWithOptions(request, runtime);
    }

    public UpdateOsVersionReleaseNoteResponse updateOsVersionReleaseNoteWithOptions(UpdateOsVersionReleaseNoteRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsVersionReleaseNote", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsVersionReleaseNoteResponse());
    }

    public UpdateOsVersionReleaseNoteResponse updateOsVersionReleaseNote(UpdateOsVersionReleaseNoteRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionReleaseNoteWithOptions(request, runtime);
    }

    public UpdateOsVersionRemarkResponse updateOsVersionRemarkWithOptions(UpdateOsVersionRemarkRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsVersionRemark", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsVersionRemarkResponse());
    }

    public UpdateOsVersionRemarkResponse updateOsVersionRemark(UpdateOsVersionRemarkRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionRemarkWithOptions(request, runtime);
    }

    public UpdateOsVersionStatusResponse updateOsVersionStatusWithOptions(UpdateOsVersionStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateOsVersionStatus", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateOsVersionStatusResponse());
    }

    public UpdateOsVersionStatusResponse updateOsVersionStatus(UpdateOsVersionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOsVersionStatusWithOptions(request, runtime);
    }

    public UpdateProjectResponse updateProjectWithOptions(UpdateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateProject", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateProjectResponse());
    }

    public UpdateProjectResponse updateProject(UpdateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProjectWithOptions(request, runtime);
    }

    public UpdateSchemaSubscribeResponse updateSchemaSubscribeWithOptions(UpdateSchemaSubscribeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSchemaSubscribe", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSchemaSubscribeResponse());
    }

    public UpdateSchemaSubscribeResponse updateSchemaSubscribe(UpdateSchemaSubscribeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSchemaSubscribeWithOptions(request, runtime);
    }

    public UpdateShadowSchemaResponse updateShadowSchemaWithOptions(UpdateShadowSchemaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateShadowSchema", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateShadowSchemaResponse());
    }

    public UpdateShadowSchemaResponse updateShadowSchema(UpdateShadowSchemaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateShadowSchemaWithOptions(request, runtime);
    }

    public UpdateTriggerResponse updateTriggerWithOptions(UpdateTriggerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTrigger", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTriggerResponse());
    }

    public UpdateTriggerResponse updateTrigger(UpdateTriggerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTriggerWithOptions(request, runtime);
    }

    public UpdateUpstreamAppServerResponse updateUpstreamAppServerWithOptions(UpdateUpstreamAppServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUpstreamAppServer", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUpstreamAppServerResponse());
    }

    public UpdateUpstreamAppServerResponse updateUpstreamAppServer(UpdateUpstreamAppServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUpstreamAppServerWithOptions(request, runtime);
    }

    public UpdateVersionDeviceGroupResponse updateVersionDeviceGroupWithOptions(UpdateVersionDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVersionDeviceGroup", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVersionDeviceGroupResponse());
    }

    public UpdateVersionDeviceGroupResponse updateVersionDeviceGroup(UpdateVersionDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVersionDeviceGroupWithOptions(request, runtime);
    }

    public UpdateVersionPrepublishActiveStatusResponse updateVersionPrepublishActiveStatusWithOptions(UpdateVersionPrepublishActiveStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateVersionPrepublishActiveStatus", "2018-05-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateVersionPrepublishActiveStatusResponse());
    }

    public UpdateVersionPrepublishActiveStatusResponse updateVersionPrepublishActiveStatus(UpdateVersionPrepublishActiveStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateVersionPrepublishActiveStatusWithOptions(request, runtime);
    }
}
