// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113;

import com.aliyun.tea.*;
import com.aliyun.miniapplcdp20200113.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("miniapplcdp", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GenerateAuthTokenResponse generateAuthTokenWithOptions(GenerateAuthTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAuthToken", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAuthTokenResponse());
    }

    public GenerateAuthTokenResponse generateAuthToken(GenerateAuthTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAuthTokenWithOptions(request, runtime);
    }

    public GetAppModelResponse getAppModelWithOptions(GetAppModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppModelResponse());
    }

    public GetAppModelResponse getAppModel(GetAppModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppModelWithOptions(request, runtime);
    }

    public ListModelsByPageResponse listModelsByPageWithOptions(ListModelsByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListModelsByPage", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListModelsByPageResponse());
    }

    public ListModelsByPageResponse listModelsByPage(ListModelsByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModelsByPageWithOptions(request, runtime);
    }

    public BatchCreateModelResponse batchCreateModelWithOptions(BatchCreateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchCreateModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new BatchCreateModelResponse());
    }

    public BatchCreateModelResponse batchCreateModel(BatchCreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCreateModelWithOptions(request, runtime);
    }

    public ListResourcesResponse listResourcesWithOptions(ListResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResources", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourcesResponse());
    }

    public ListResourcesResponse listResources(ListResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourcesWithOptions(request, runtime);
    }

    public GetEnvironmentResponse getEnvironmentWithOptions(GetEnvironmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEnvironment", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetEnvironmentResponse());
    }

    public GetEnvironmentResponse getEnvironment(GetEnvironmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEnvironmentWithOptions(request, runtime);
    }

    public UpdateModuleResponse updateModuleWithOptions(UpdateModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateModule", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateModuleResponse());
    }

    public UpdateModuleResponse updateModule(UpdateModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateModuleWithOptions(request, runtime);
    }

    public CreateLogicModelResponse createLogicModelWithOptions(CreateLogicModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLogicModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLogicModelResponse());
    }

    public CreateLogicModelResponse createLogicModel(CreateLogicModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLogicModelWithOptions(request, runtime);
    }

    public DeleteCommitResponse deleteCommitWithOptions(DeleteCommitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCommit", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCommitResponse());
    }

    public DeleteCommitResponse deleteCommit(DeleteCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCommitWithOptions(request, runtime);
    }

    public UpdateResourceInfoResponse updateResourceInfoWithOptions(UpdateResourceInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResourceInfo", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceInfoResponse());
    }

    public UpdateResourceInfoResponse updateResourceInfo(UpdateResourceInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceInfoWithOptions(request, runtime);
    }

    public GetResourceResponse getResourceWithOptions(GetResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResource", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourceResponse());
    }

    public GetResourceResponse getResource(GetResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceWithOptions(request, runtime);
    }

    public StopAppServerResponse stopAppServerWithOptions(StopAppServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopAppServer", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new StopAppServerResponse());
    }

    public StopAppServerResponse stopAppServer(StopAppServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopAppServerWithOptions(request, runtime);
    }

    public ListResourcesByPageResponse listResourcesByPageWithOptions(ListResourcesByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourcesByPage", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListResourcesByPageResponse());
    }

    public ListResourcesByPageResponse listResourcesByPage(ListResourcesByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourcesByPageWithOptions(request, runtime);
    }

    public GenerateAppUserPasswordResponse generateAppUserPasswordWithOptions(GenerateAppUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAppUserPassword", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAppUserPasswordResponse());
    }

    public GenerateAppUserPasswordResponse generateAppUserPassword(GenerateAppUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAppUserPasswordWithOptions(request, runtime);
    }

    public UpdateAppModelContentResponse updateAppModelContentWithOptions(UpdateAppModelContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppModelContent", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppModelContentResponse());
    }

    public UpdateAppModelContentResponse updateAppModelContent(UpdateAppModelContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppModelContentWithOptions(request, runtime);
    }

    public DeleteModelResponse deleteModelWithOptions(DeleteModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteModelResponse());
    }

    public DeleteModelResponse deleteModel(DeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteModelWithOptions(request, runtime);
    }

    public GetModelPackResponse getModelPackWithOptions(GetModelPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetModelPack", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetModelPackResponse());
    }

    public GetModelPackResponse getModelPack(GetModelPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelPackWithOptions(request, runtime);
    }

    public CloneAppResponse cloneAppWithOptions(CloneAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloneApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CloneAppResponse());
    }

    public CloneAppResponse cloneApp(CloneAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cloneAppWithOptions(request, runtime);
    }

    public CreateModelResponse createModelWithOptions(CreateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateModelResponse());
    }

    public CreateModelResponse createModel(CreateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createModelWithOptions(request, runtime);
    }

    public ListEnvironmentOverviewsResponse listEnvironmentOverviewsWithOptions(ListEnvironmentOverviewsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnvironmentOverviews", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnvironmentOverviewsResponse());
    }

    public ListEnvironmentOverviewsResponse listEnvironmentOverviews(ListEnvironmentOverviewsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnvironmentOverviewsWithOptions(request, runtime);
    }

    public CheckDomainResponse checkDomainWithOptions(CheckDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDomain", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDomainResponse());
    }

    public CheckDomainResponse checkDomain(CheckDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainWithOptions(request, runtime);
    }

    public BatchDeleteResourcesResponse batchDeleteResourcesWithOptions(BatchDeleteResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteResources", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteResourcesResponse());
    }

    public BatchDeleteResourcesResponse batchDeleteResources(BatchDeleteResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteResourcesWithOptions(request, runtime);
    }

    public UpdateDataModelContentResponse updateDataModelContentWithOptions(UpdateDataModelContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDataModelContent", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDataModelContentResponse());
    }

    public UpdateDataModelContentResponse updateDataModelContent(UpdateDataModelContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDataModelContentWithOptions(request, runtime);
    }

    public GetModuleResponse getModuleWithOptions(GetModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetModule", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetModuleResponse());
    }

    public GetModuleResponse getModule(GetModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModuleWithOptions(request, runtime);
    }

    public StartAppServerResponse startAppServerWithOptions(StartAppServerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartAppServer", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new StartAppServerResponse());
    }

    public StartAppServerResponse startAppServer(StartAppServerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAppServerWithOptions(request, runtime);
    }

    public GetDataModelResponse getDataModelWithOptions(GetDataModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataModelResponse());
    }

    public GetDataModelResponse getDataModel(GetDataModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataModelWithOptions(request, runtime);
    }

    public ListLogicModelsResponse listLogicModelsWithOptions(ListLogicModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLogicModels", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListLogicModelsResponse());
    }

    public ListLogicModelsResponse listLogicModels(ListLogicModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicModelsWithOptions(request, runtime);
    }

    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDomains", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListDomainsResponse());
    }

    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    public UpdateModelInfoResponse updateModelInfoWithOptions(UpdateModelInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateModelInfo", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateModelInfoResponse());
    }

    public UpdateModelInfoResponse updateModelInfo(UpdateModelInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateModelInfoWithOptions(request, runtime);
    }

    public GetDefaultAppUserResponse getDefaultAppUserWithOptions(GetDefaultAppUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDefaultAppUser", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetDefaultAppUserResponse());
    }

    public GetDefaultAppUserResponse getDefaultAppUser(GetDefaultAppUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultAppUserWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(runtime);
    }

    public ListPublishesResponse listPublishesWithOptions(ListPublishesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublishes", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListPublishesResponse());
    }

    public ListPublishesResponse listPublishes(ListPublishesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublishesWithOptions(request, runtime);
    }

    public GetPageModelResponse getPageModelWithOptions(GetPageModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPageModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetPageModelResponse());
    }

    public GetPageModelResponse getPageModel(GetPageModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPageModelWithOptions(request, runtime);
    }

    public CreateResourceResponse createResourceWithOptions(CreateResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResource", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourceResponse());
    }

    public CreateResourceResponse createResource(CreateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourceWithOptions(request, runtime);
    }

    public GetDomainOverviewResponse getDomainOverviewWithOptions(GetDomainOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomainOverview", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetDomainOverviewResponse());
    }

    public GetDomainOverviewResponse getDomainOverview(GetDomainOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainOverviewWithOptions(request, runtime);
    }

    public GetHistoryStatsResponse getHistoryStatsWithOptions(GetHistoryStatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHistoryStats", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetHistoryStatsResponse());
    }

    public GetHistoryStatsResponse getHistoryStats(GetHistoryStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHistoryStatsWithOptions(request, runtime);
    }

    public CreatePublishResponse createPublishWithOptions(CreatePublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePublish", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePublishResponse());
    }

    public CreatePublishResponse createPublish(CreatePublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPublishWithOptions(request, runtime);
    }

    public GetArtifactResponse getArtifactWithOptions(GetArtifactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetArtifact", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetArtifactResponse());
    }

    public GetArtifactResponse getArtifact(GetArtifactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getArtifactWithOptions(request, runtime);
    }

    public GetLogicModelResponse getLogicModelWithOptions(GetLogicModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogicModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogicModelResponse());
    }

    public GetLogicModelResponse getLogicModel(GetLogicModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogicModelWithOptions(request, runtime);
    }

    public GetDomainCnameResponse getDomainCnameWithOptions(GetDomainCnameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomainCname", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetDomainCnameResponse());
    }

    public GetDomainCnameResponse getDomainCname(GetDomainCnameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainCnameWithOptions(request, runtime);
    }

    public ListPageModelsResponse listPageModelsWithOptions(ListPageModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPageModels", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListPageModelsResponse());
    }

    public ListPageModelsResponse listPageModels(ListPageModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPageModelsWithOptions(request, runtime);
    }

    public UpdateDataModelAttributesResponse updateDataModelAttributesWithOptions(UpdateDataModelAttributesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDataModelAttributes", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDataModelAttributesResponse());
    }

    public UpdateDataModelAttributesResponse updateDataModelAttributes(UpdateDataModelAttributesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDataModelAttributesWithOptions(request, runtime);
    }

    public UpdateLogicModelContentResponse updateLogicModelContentWithOptions(UpdateLogicModelContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLogicModelContent", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLogicModelContentResponse());
    }

    public UpdateLogicModelContentResponse updateLogicModelContent(UpdateLogicModelContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLogicModelContentWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public GetModelResponse getModelWithOptions(GetModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetModelResponse());
    }

    public GetModelResponse getModel(GetModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelWithOptions(request, runtime);
    }

    public ListModelsResponse listModelsWithOptions(ListModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListModels", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListModelsResponse());
    }

    public ListModelsResponse listModels(ListModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModelsWithOptions(request, runtime);
    }

    public ListEnvironmentsResponse listEnvironmentsWithOptions(ListEnvironmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListEnvironments", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListEnvironmentsResponse());
    }

    public ListEnvironmentsResponse listEnvironments(ListEnvironmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listEnvironmentsWithOptions(request, runtime);
    }

    public GetCommitResponse getCommitWithOptions(GetCommitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCommit", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetCommitResponse());
    }

    public GetCommitResponse getCommit(GetCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCommitWithOptions(request, runtime);
    }

    public ListModulesResponse listModulesWithOptions(ListModulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListModules", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListModulesResponse());
    }

    public ListModulesResponse listModules(ListModulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listModulesWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public UpdateResourceResponse updateResourceWithOptions(UpdateResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResource", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceResponse());
    }

    public UpdateResourceResponse updateResource(UpdateResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceWithOptions(request, runtime);
    }

    public CreateCommitResponse createCommitWithOptions(CreateCommitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCommit", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCommitResponse());
    }

    public CreateCommitResponse createCommit(CreateCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCommitWithOptions(request, runtime);
    }

    public ResetAppUserPasswordResponse resetAppUserPasswordWithOptions(ResetAppUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAppUserPassword", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAppUserPasswordResponse());
    }

    public ResetAppUserPasswordResponse resetAppUserPassword(ResetAppUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAppUserPasswordWithOptions(request, runtime);
    }

    public RestoreModelResponse restoreModelWithOptions(RestoreModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RestoreModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new RestoreModelResponse());
    }

    public RestoreModelResponse restoreModel(RestoreModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restoreModelWithOptions(request, runtime);
    }

    public UpdateAppModelResponse updateAppModelWithOptions(UpdateAppModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAppModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppModelResponse());
    }

    public UpdateAppModelResponse updateAppModel(UpdateAppModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppModelWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApps", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public CreateTemplateAppResponse createTemplateAppWithOptions(CreateTemplateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTemplateApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTemplateAppResponse());
    }

    public CreateTemplateAppResponse createTemplateApp(CreateTemplateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTemplateAppWithOptions(request, runtime);
    }

    public ListCommitsResponse listCommitsWithOptions(ListCommitsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCommits", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListCommitsResponse());
    }

    public ListCommitsResponse listCommits(ListCommitsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCommitsWithOptions(request, runtime);
    }

    public ListPublishVersionsResponse listPublishVersionsWithOptions(ListPublishVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPublishVersions", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListPublishVersionsResponse());
    }

    public ListPublishVersionsResponse listPublishVersions(ListPublishVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPublishVersionsWithOptions(request, runtime);
    }

    public ListSystemModelsResponse listSystemModelsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListSystemModels", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListSystemModelsResponse());
    }

    public ListSystemModelsResponse listSystemModels() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSystemModelsWithOptions(runtime);
    }

    public UpdatePageModelContentResponse updatePageModelContentWithOptions(UpdatePageModelContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePageModelContent", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePageModelContentResponse());
    }

    public UpdatePageModelContentResponse updatePageModelContent(UpdatePageModelContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePageModelContentWithOptions(request, runtime);
    }

    public GetAppSecretResponse getAppSecretWithOptions(GetAppSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppSecret", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppSecretResponse());
    }

    public GetAppSecretResponse getAppSecret(GetAppSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppSecretWithOptions(request, runtime);
    }

    public SetEnvironmentDefaultDomainResponse setEnvironmentDefaultDomainWithOptions(SetEnvironmentDefaultDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetEnvironmentDefaultDomain", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new SetEnvironmentDefaultDomainResponse());
    }

    public SetEnvironmentDefaultDomainResponse setEnvironmentDefaultDomain(SetEnvironmentDefaultDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEnvironmentDefaultDomainWithOptions(request, runtime);
    }

    public GetRealtimeStatsResponse getRealtimeStatsWithOptions(GetRealtimeStatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRealtimeStats", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetRealtimeStatsResponse());
    }

    public GetRealtimeStatsResponse getRealtimeStats(GetRealtimeStatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRealtimeStatsWithOptions(request, runtime);
    }

    public CreateModuleResponse createModuleWithOptions(CreateModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateModule", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateModuleResponse());
    }

    public CreateModuleResponse createModule(CreateModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createModuleWithOptions(request, runtime);
    }

    public DeleteModuleResponse deleteModuleWithOptions(DeleteModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteModule", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteModuleResponse());
    }

    public DeleteModuleResponse deleteModule(DeleteModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteModuleWithOptions(request, runtime);
    }

    public BatchDeleteModelResponse batchDeleteModelWithOptions(BatchDeleteModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDeleteModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDeleteModelResponse());
    }

    public BatchDeleteModelResponse batchDeleteModel(BatchDeleteModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteModelWithOptions(request, runtime);
    }

    public BatchRestoreModelResponse batchRestoreModelWithOptions(BatchRestoreModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchRestoreModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new BatchRestoreModelResponse());
    }

    public BatchRestoreModelResponse batchRestoreModel(BatchRestoreModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRestoreModelWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public DeleteResourceResponse deleteResourceWithOptions(DeleteResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteResource", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteResourceResponse());
    }

    public DeleteResourceResponse deleteResource(DeleteResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteResourceWithOptions(request, runtime);
    }

    public GetPublishResponse getPublishWithOptions(GetPublishRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPublish", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetPublishResponse());
    }

    public GetPublishResponse getPublish(GetPublishRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPublishWithOptions(request, runtime);
    }

    public CreatePageModelResponse createPageModelWithOptions(CreatePageModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePageModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePageModelResponse());
    }

    public CreatePageModelResponse createPageModel(CreatePageModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPageModelWithOptions(request, runtime);
    }

    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDomain", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDomainResponse());
    }

    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    public ListArtifactsResponse listArtifactsWithOptions(ListArtifactsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListArtifacts", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListArtifactsResponse());
    }

    public ListArtifactsResponse listArtifacts(ListArtifactsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listArtifactsWithOptions(request, runtime);
    }

    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDomain", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDomainResponse());
    }

    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    public CreateDataModelResponse createDataModelWithOptions(CreateDataModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDataModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDataModelResponse());
    }

    public CreateDataModelResponse createDataModel(CreateDataModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataModelWithOptions(request, runtime);
    }

    public UpdateResourceContentResponse updateResourceContentWithOptions(UpdateResourceContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateResourceContent", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateResourceContentResponse());
    }

    public UpdateResourceContentResponse updateResourceContent(UpdateResourceContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateResourceContentWithOptions(request, runtime);
    }

    public GenerateUploadTokenResponse generateUploadTokenWithOptions(GenerateUploadTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateUploadToken", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateUploadTokenResponse());
    }

    public GenerateUploadTokenResponse generateUploadToken(GenerateUploadTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateUploadTokenWithOptions(request, runtime);
    }

    public GetLatestCommitResponse getLatestCommitWithOptions(GetLatestCommitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLatestCommit", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new GetLatestCommitResponse());
    }

    public GetLatestCommitResponse getLatestCommit(GetLatestCommitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLatestCommitWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public RunLogicModelResponse runLogicModelWithOptions(RunLogicModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunLogicModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new RunLogicModelResponse());
    }

    public RunLogicModelResponse runLogicModel(RunLogicModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runLogicModelWithOptions(request, runtime);
    }

    public ListAppModulesResponse listAppModulesWithOptions(ListAppModulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAppModules", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppModulesResponse());
    }

    public ListAppModulesResponse listAppModules(ListAppModulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppModulesWithOptions(request, runtime);
    }

    public ListDataModelsResponse listDataModelsWithOptions(ListDataModelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDataModels", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new ListDataModelsResponse());
    }

    public ListDataModelsResponse listDataModels(ListDataModelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataModelsWithOptions(request, runtime);
    }

    public UpdateModelResponse updateModelWithOptions(UpdateModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateModel", "2020-01-13", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateModelResponse());
    }

    public UpdateModelResponse updateModel(UpdateModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateModelWithOptions(request, runtime);
    }
}
