// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.easygene20210315;

import com.aliyun.tea.*;
import com.aliyun.easygene20210315.models.*;
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
        this._endpoint = this.getEndpoint("easygene", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortRunResponse abortRunWithOptions(AbortRunRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AbortRun", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new AbortRunResponse());
    }

    public AbortRunResponse abortRun(AbortRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abortRunWithOptions(request, runtime);
    }

    public AbortSubmissionResponse abortSubmissionWithOptions(AbortSubmissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AbortSubmission", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new AbortSubmissionResponse());
    }

    public AbortSubmissionResponse abortSubmission(AbortSubmissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abortSubmissionWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppShrinkRequest request = new CreateAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencies)) {
            request.dependenciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencies, "Dependencies", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configs)) {
            request.configsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configs, "Configs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateEntityResponse createEntityWithOptions(CreateEntityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEntityShrinkRequest request = new CreateEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityItems)) {
            request.entityItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityItems, "EntityItems", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateEntityResponse());
    }

    public CreateEntityResponse createEntity(CreateEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEntityWithOptions(request, runtime);
    }

    public CreateRunResponse createRunWithOptions(CreateRunRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRun", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRunResponse());
    }

    public CreateRunResponse createRun(CreateRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRunWithOptions(request, runtime);
    }

    public CreateSubmissionResponse createSubmissionWithOptions(CreateSubmissionRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSubmissionShrinkRequest request = new CreateSubmissionShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateSubmission", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSubmissionResponse());
    }

    public CreateSubmissionResponse createSubmission(CreateSubmissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubmissionWithOptions(request, runtime);
    }

    public CreateTemplateResponse createTemplateWithOptions(CreateTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTemplateShrinkRequest request = new CreateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplate", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateResponse());
    }

    public CreateTemplateResponse createTemplate(CreateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateWithOptions(request, runtime);
    }

    public CreateWorkspaceResponse createWorkspaceWithOptions(CreateWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWorkspace", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWorkspaceResponse());
    }

    public CreateWorkspaceResponse createWorkspace(CreateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWorkspaceWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteEntityItemsResponse deleteEntityItemsWithOptions(DeleteEntityItemsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEntityItemsShrinkRequest request = new DeleteEntityItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteEntityItems", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteEntityItemsResponse());
    }

    public DeleteEntityItemsResponse deleteEntityItems(DeleteEntityItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEntityItemsWithOptions(request, runtime);
    }

    public DeleteRunResponse deleteRunWithOptions(DeleteRunRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRun", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRunResponse());
    }

    public DeleteRunResponse deleteRun(DeleteRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRunWithOptions(request, runtime);
    }

    public DeleteSubmissionResponse deleteSubmissionWithOptions(DeleteSubmissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteSubmission", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteSubmissionResponse());
    }

    public DeleteSubmissionResponse deleteSubmission(DeleteSubmissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubmissionWithOptions(request, runtime);
    }

    public DeleteTemplateResponse deleteTemplateWithOptions(DeleteTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTemplate", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTemplateResponse());
    }

    public DeleteTemplateResponse deleteTemplate(DeleteTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTemplateWithOptions(request, runtime);
    }

    public DeleteWorkspaceResponse deleteWorkspaceWithOptions(DeleteWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteWorkspace", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteWorkspaceResponse());
    }

    public DeleteWorkspaceResponse deleteWorkspace(DeleteWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteWorkspaceWithOptions(request, runtime);
    }

    public DownloadEntityResponse downloadEntityWithOptions(DownloadEntityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DownloadEntityShrinkRequest request = new DownloadEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityNames)) {
            request.entityNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityNames, "EntityNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadEntityResponse());
    }

    public DownloadEntityResponse downloadEntity(DownloadEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadEntityWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApp", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public GetEntityResponse getEntityWithOptions(GetEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetEntityResponse());
    }

    public GetEntityResponse getEntity(GetEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEntityWithOptions(request, runtime);
    }

    public GetGlobalAppResponse getGlobalAppWithOptions(GetGlobalAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGlobalApp", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetGlobalAppResponse());
    }

    public GetGlobalAppResponse getGlobalApp(GetGlobalAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGlobalAppWithOptions(request, runtime);
    }

    public GetPublicDatasetResponse getPublicDatasetWithOptions(GetPublicDatasetRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPublicDatasetShrinkRequest request = new GetPublicDatasetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.attributes)) {
            request.attributesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.attributes, "Attributes", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPublicDataset", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetPublicDatasetResponse());
    }

    public GetPublicDatasetResponse getPublicDataset(GetPublicDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublicDatasetWithOptions(request, runtime);
    }

    public GetPublicDatasetEntityResponse getPublicDatasetEntityWithOptions(GetPublicDatasetEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPublicDatasetEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetPublicDatasetEntityResponse());
    }

    public GetPublicDatasetEntityResponse getPublicDatasetEntity(GetPublicDatasetEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublicDatasetEntityWithOptions(request, runtime);
    }

    public GetRunResponse getRunWithOptions(GetRunRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRun", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetRunResponse());
    }

    public GetRunResponse getRun(GetRunRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRunWithOptions(request, runtime);
    }

    public GetSubmissionResponse getSubmissionWithOptions(GetSubmissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSubmission", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new GetSubmissionResponse());
    }

    public GetSubmissionResponse getSubmission(GetSubmissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubmissionWithOptions(request, runtime);
    }

    public GetTemplateResponse getTemplateWithOptions(GetTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTemplate", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetTemplateResponse());
    }

    public GetTemplateResponse getTemplate(GetTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTemplateWithOptions(request, runtime);
    }

    public GetWorkspaceResponse getWorkspaceWithOptions(GetWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetWorkspace", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new GetWorkspaceResponse());
    }

    public GetWorkspaceResponse getWorkspace(GetWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWorkspaceWithOptions(request, runtime);
    }

    public InstallGlobalAppResponse installGlobalAppWithOptions(InstallGlobalAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallGlobalApp", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new InstallGlobalAppResponse());
    }

    public InstallGlobalAppResponse installGlobalApp(InstallGlobalAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installGlobalAppWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApps", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public ListAuthorizedSoftwareResponse listAuthorizedSoftwareWithOptions(ListAuthorizedSoftwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAuthorizedSoftware", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListAuthorizedSoftwareResponse());
    }

    public ListAuthorizedSoftwareResponse listAuthorizedSoftware(ListAuthorizedSoftwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAuthorizedSoftwareWithOptions(request, runtime);
    }

    public ListContainerImagesResponse listContainerImagesWithOptions(ListContainerImagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContainerImages", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListContainerImagesResponse());
    }

    public ListContainerImagesResponse listContainerImages(ListContainerImagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContainerImagesWithOptions(request, runtime);
    }

    public ListEntitiesResponse listEntitiesWithOptions(ListEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEntities", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListEntitiesResponse());
    }

    public ListEntitiesResponse listEntities(ListEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEntitiesWithOptions(request, runtime);
    }

    public ListEntityItemsResponse listEntityItemsWithOptions(ListEntityItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEntityItems", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListEntityItemsResponse());
    }

    public ListEntityItemsResponse listEntityItems(ListEntityItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEntityItemsWithOptions(request, runtime);
    }

    public ListGlobalAppsResponse listGlobalAppsWithOptions(ListGlobalAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGlobalApps", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListGlobalAppsResponse());
    }

    public ListGlobalAppsResponse listGlobalApps(ListGlobalAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGlobalAppsWithOptions(request, runtime);
    }

    public ListPublicDatasetResponse listPublicDatasetWithOptions(ListPublicDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublicDataset", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListPublicDatasetResponse());
    }

    public ListPublicDatasetResponse listPublicDataset(ListPublicDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublicDatasetWithOptions(request, runtime);
    }

    public ListPublicDatasetEntitiesResponse listPublicDatasetEntitiesWithOptions(ListPublicDatasetEntitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublicDatasetEntities", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListPublicDatasetEntitiesResponse());
    }

    public ListPublicDatasetEntitiesResponse listPublicDatasetEntities(ListPublicDatasetEntitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublicDatasetEntitiesWithOptions(request, runtime);
    }

    public ListPublicDatasetEntityItemsResponse listPublicDatasetEntityItemsWithOptions(ListPublicDatasetEntityItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublicDatasetEntityItems", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListPublicDatasetEntityItemsResponse());
    }

    public ListPublicDatasetEntityItemsResponse listPublicDatasetEntityItems(ListPublicDatasetEntityItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublicDatasetEntityItemsWithOptions(request, runtime);
    }

    public ListPublicDatasetTagsResponse listPublicDatasetTagsWithOptions(ListPublicDatasetTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublicDatasetTags", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListPublicDatasetTagsResponse());
    }

    public ListPublicDatasetTagsResponse listPublicDatasetTags(ListPublicDatasetTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublicDatasetTagsWithOptions(request, runtime);
    }

    public ListRegionsResponse listRegionsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRegions", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListRegionsResponse());
    }

    public ListRegionsResponse listRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    public ListRunsResponse listRunsWithOptions(ListRunsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRuns", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListRunsResponse());
    }

    public ListRunsResponse listRuns(ListRunsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRunsWithOptions(request, runtime);
    }

    public ListSubmissionsResponse listSubmissionsWithOptions(ListSubmissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSubmissions", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListSubmissionsResponse());
    }

    public ListSubmissionsResponse listSubmissions(ListSubmissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSubmissionsWithOptions(request, runtime);
    }

    public ListTemplatesResponse listTemplatesWithOptions(ListTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTemplates", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ListTemplatesResponse());
    }

    public ListTemplatesResponse listTemplates(ListTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTemplatesWithOptions(request, runtime);
    }

    public ListUserActiveRunsResponse listUserActiveRunsWithOptions(ListUserActiveRunsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserActiveRuns", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListUserActiveRunsResponse());
    }

    public ListUserActiveRunsResponse listUserActiveRuns(ListUserActiveRunsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserActiveRunsWithOptions(request, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(ListWorkspacesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWorkspaces", "2021-03-15", "HTTPS", "GET", "AK", "json", req, runtime), new ListWorkspacesResponse());
    }

    public ListWorkspacesResponse listWorkspaces(ListWorkspacesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkspacesWithOptions(request, runtime);
    }

    public ParseAppInputsResponse parseAppInputsWithOptions(ParseAppInputsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ParseAppInputsShrinkRequest request = new ParseAppInputsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependencies)) {
            request.dependenciesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependencies, "Dependencies", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ParseAppInputs", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ParseAppInputsResponse());
    }

    public ParseAppInputsResponse parseAppInputs(ParseAppInputsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.parseAppInputsWithOptions(request, runtime);
    }

    public ResumeSubmissionResponse resumeSubmissionWithOptions(ResumeSubmissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResumeSubmission", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new ResumeSubmissionResponse());
    }

    public ResumeSubmissionResponse resumeSubmission(ResumeSubmissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resumeSubmissionWithOptions(request, runtime);
    }

    public UpdateEntityResponse updateEntityWithOptions(UpdateEntityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEntityShrinkRequest request = new UpdateEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityItems)) {
            request.entityItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityItems, "EntityItems", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateEntityResponse());
    }

    public UpdateEntityResponse updateEntity(UpdateEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEntityWithOptions(request, runtime);
    }

    public UpdateTemplateResponse updateTemplateWithOptions(UpdateTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTemplateShrinkRequest request = new UpdateTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputs)) {
            request.inputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputs, "Inputs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outputs)) {
            request.outputsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outputs, "Outputs", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateTemplate", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateTemplateResponse());
    }

    public UpdateTemplateResponse updateTemplate(UpdateTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateTemplateWithOptions(request, runtime);
    }

    public UpdateWorkspaceResponse updateWorkspaceWithOptions(UpdateWorkspaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWorkspace", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWorkspaceResponse());
    }

    public UpdateWorkspaceResponse updateWorkspace(UpdateWorkspaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWorkspaceWithOptions(request, runtime);
    }

    public UploadEntityResponse uploadEntityWithOptions(UploadEntityRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadEntity", "2021-03-15", "HTTPS", "POST", "AK", "json", req, runtime), new UploadEntityResponse());
    }

    public UploadEntityResponse uploadEntity(UploadEntityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadEntityWithOptions(request, runtime);
    }
}
