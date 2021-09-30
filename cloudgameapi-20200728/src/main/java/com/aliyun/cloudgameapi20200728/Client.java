// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728;

import com.aliyun.tea.*;
import com.aliyun.cloudgameapi20200728.models.*;
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
        this._endpoint = this.getEndpoint("cloudgameapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public ListGamesResponse listGamesWithOptions(ListGamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGames", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListGamesResponse());
    }

    public ListGamesResponse listGames(ListGamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGamesWithOptions(request, runtime);
    }

    public QueryGameResponse queryGameWithOptions(QueryGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryGame", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryGameResponse());
    }

    public QueryGameResponse queryGame(QueryGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGameWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListProjects", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetailWithOptions(GetOutAccountBindDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOutAccountBindDetail", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetOutAccountBindDetailResponse());
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetail(GetOutAccountBindDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOutAccountBindDetailWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrder", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public AddGameToProjectResponse addGameToProjectWithOptions(AddGameToProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGameToProject", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new AddGameToProjectResponse());
    }

    public AddGameToProjectResponse addGameToProject(AddGameToProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGameToProjectWithOptions(request, runtime);
    }

    public ListGameVersionsResponse listGameVersionsWithOptions(ListGameVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListGameVersions", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListGameVersionsResponse());
    }

    public ListGameVersionsResponse listGameVersions(ListGameVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGameVersionsWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlagWithOptions(SubmitInternalPurchaseReadyFlagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitInternalPurchaseReadyFlag", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitInternalPurchaseReadyFlagResponse());
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlag(SubmitInternalPurchaseReadyFlagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseReadyFlagWithOptions(request, runtime);
    }

    public GetGameStockResponse getGameStockWithOptions(GetGameStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGameStock", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetGameStockResponse());
    }

    public GetGameStockResponse getGameStock(GetGameStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameStockWithOptions(request, runtime);
    }

    public ListDeployableInstancesResponse listDeployableInstancesWithOptions(ListDeployableInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDeployableInstances", "2020-07-28", "HTTPS", "GET", "AK", "json", req, runtime), new ListDeployableInstancesResponse());
    }

    public ListDeployableInstancesResponse listDeployableInstances(ListDeployableInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployableInstancesWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrdersWithOptions(SubmitInternalPurchaseOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitInternalPurchaseOrders", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitInternalPurchaseOrdersResponse());
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrders(SubmitInternalPurchaseOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseOrdersWithOptions(request, runtime);
    }

    public DeleteGameVersionResponse deleteGameVersionWithOptions(DeleteGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGameVersion", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGameVersionResponse());
    }

    public DeleteGameVersionResponse deleteGameVersion(DeleteGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGameVersionWithOptions(request, runtime);
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownloadWithOptions(UploadGameVersionByDownloadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadGameVersionByDownload", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new UploadGameVersionByDownloadResponse());
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownload(UploadGameVersionByDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadGameVersionByDownloadWithOptions(request, runtime);
    }

    public DeleteGameResponse deleteGameWithOptions(DeleteGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGame", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGameResponse());
    }

    public DeleteGameResponse deleteGame(DeleteGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGameWithOptions(request, runtime);
    }

    public AdaptGameVersionResponse adaptGameVersionWithOptions(AdaptGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AdaptGameVersion", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new AdaptGameVersionResponse());
    }

    public AdaptGameVersionResponse adaptGameVersion(AdaptGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adaptGameVersionWithOptions(request, runtime);
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatusWithOptions(QueryOutAccountBindStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOutAccountBindStatus", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOutAccountBindStatusResponse());
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatus(QueryOutAccountBindStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOutAccountBindStatusWithOptions(request, runtime);
    }

    public RemoveGameFromProjectResponse removeGameFromProjectWithOptions(RemoveGameFromProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveGameFromProject", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveGameFromProjectResponse());
    }

    public RemoveGameFromProjectResponse removeGameFromProject(RemoveGameFromProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGameFromProjectWithOptions(request, runtime);
    }

    public SkipTrialPolicyResponse skipTrialPolicyWithOptions(SkipTrialPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SkipTrialPolicy", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new SkipTrialPolicyResponse());
    }

    public SkipTrialPolicyResponse skipTrialPolicy(SkipTrialPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.skipTrialPolicyWithOptions(request, runtime);
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflowWithOptions(CreateGameDeployWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGameDeployWorkflow", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGameDeployWorkflowResponse());
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflow(CreateGameDeployWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGameDeployWorkflowWithOptions(request, runtime);
    }

    public StopGameSessionResponse stopGameSessionWithOptions(StopGameSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopGameSession", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new StopGameSessionResponse());
    }

    public StopGameSessionResponse stopGameSession(StopGameSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopGameSessionWithOptions(request, runtime);
    }

    public SubmitDeploymentResponse submitDeploymentWithOptions(SubmitDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitDeployment", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitDeploymentResponse());
    }

    public SubmitDeploymentResponse submitDeployment(SubmitDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDeploymentWithOptions(request, runtime);
    }

    public QueryProjectResponse queryProjectWithOptions(QueryProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProject", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProjectResponse());
    }

    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProjectWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteProject", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public ListContainerStatusResponse listContainerStatusWithOptions(ListContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListContainerStatus", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListContainerStatusResponse());
    }

    public ListContainerStatusResponse listContainerStatus(ListContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContainerStatusWithOptions(request, runtime);
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatusWithOptions(ListHistoryContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListHistoryContainerStatus", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListHistoryContainerStatusResponse());
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatus(ListHistoryContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHistoryContainerStatusWithOptions(request, runtime);
    }

    public CreateGameResponse createGameWithOptions(CreateGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGame", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGameResponse());
    }

    public CreateGameResponse createGame(CreateGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGameWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateProject", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public ListBoughtGamesResponse listBoughtGamesWithOptions(ListBoughtGamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListBoughtGames", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new ListBoughtGamesResponse());
    }

    public ListBoughtGamesResponse listBoughtGames(ListBoughtGamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBoughtGamesWithOptions(request, runtime);
    }

    public GetItemResponse getItemWithOptions(GetItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetItem", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetItemResponse());
    }

    public GetItemResponse getItem(GetItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getItemWithOptions(request, runtime);
    }

    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseOrder", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CloseOrderResponse());
    }

    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    public GetGameCcuResponse getGameCcuWithOptions(GetGameCcuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGameCcu", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetGameCcuResponse());
    }

    public GetGameCcuResponse getGameCcu(GetGameCcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameCcuWithOptions(request, runtime);
    }

    public CreateTokenResponse createTokenWithOptions(CreateTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateToken", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTokenResponse());
    }

    public CreateTokenResponse createToken(CreateTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTokenWithOptions(request, runtime);
    }

    public GetStopGameTokenResponse getStopGameTokenWithOptions(GetStopGameTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStopGameToken", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetStopGameTokenResponse());
    }

    public GetStopGameTokenResponse getStopGameToken(GetStopGameTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStopGameTokenWithOptions(request, runtime);
    }

    public BatchStopGameSessionsResponse batchStopGameSessionsWithOptions(BatchStopGameSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchStopGameSessions", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new BatchStopGameSessionsResponse());
    }

    public BatchStopGameSessionsResponse batchStopGameSessions(BatchStopGameSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopGameSessionsWithOptions(request, runtime);
    }

    public DeliveryOrderResponse deliveryOrderWithOptions(DeliveryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeliveryOrder", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new DeliveryOrderResponse());
    }

    public DeliveryOrderResponse deliveryOrder(DeliveryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deliveryOrderWithOptions(request, runtime);
    }

    public QueryTenantResponse queryTenantWithOptions(QueryTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryTenant", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryTenantResponse());
    }

    public QueryTenantResponse queryTenant(QueryTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeDataWithOptions(SubmitInternalPurchaseChargeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitInternalPurchaseChargeData", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitInternalPurchaseChargeDataResponse());
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeData(SubmitInternalPurchaseChargeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseChargeDataWithOptions(request, runtime);
    }

    public GetGameVersionResponse getGameVersionWithOptions(GetGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGameVersion", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetGameVersionResponse());
    }

    public GetGameVersionResponse getGameVersion(GetGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameVersionWithOptions(request, runtime);
    }

    public QueryItemsResponse queryItemsWithOptions(QueryItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItems", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemsResponse());
    }

    public QueryItemsResponse queryItems(QueryItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemsWithOptions(request, runtime);
    }

    public GetSessionResponse getSessionWithOptions(GetSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSession", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetSessionResponse());
    }

    public GetSessionResponse getSession(GetSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionWithOptions(request, runtime);
    }

    public QueryOrderResponse queryOrderWithOptions(QueryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrder", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderResponse());
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderWithOptions(request, runtime);
    }

    public DispatchGameSlotResponse dispatchGameSlotWithOptions(DispatchGameSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DispatchGameSlot", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new DispatchGameSlotResponse());
    }

    public DispatchGameSlotResponse dispatchGameSlot(DispatchGameSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dispatchGameSlotWithOptions(request, runtime);
    }

    public GetGameVersionProgressResponse getGameVersionProgressWithOptions(GetGameVersionProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGameVersionProgress", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new GetGameVersionProgressResponse());
    }

    public GetGameVersionProgressResponse getGameVersionProgress(GetGameVersionProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameVersionProgressWithOptions(request, runtime);
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlotWithOptions(BatchDispatchGameSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchDispatchGameSlot", "2020-07-28", "HTTPS", "POST", "AK", "json", req, runtime), new BatchDispatchGameSlotResponse());
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlot(BatchDispatchGameSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDispatchGameSlotWithOptions(request, runtime);
    }
}
