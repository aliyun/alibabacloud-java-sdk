// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728;

import com.aliyun.tea.*;
import com.aliyun.cloudgameapi20200728.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudgameapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public DeleteGameVersionResponse deleteGameVersionWithOptions(DeleteGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGameVersionResponse());
    }

    public DeleteGameVersionResponse deleteGameVersion(DeleteGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGameVersionWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public ListDeployableInstancesResponse listDeployableInstancesWithOptions(ListDeployableInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeployableInstances", "HTTPS", "GET", "2020-07-28", "AK", TeaModel.buildMap(request), null, runtime), new ListDeployableInstancesResponse());
    }

    public ListDeployableInstancesResponse listDeployableInstances(ListDeployableInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeployableInstancesWithOptions(request, runtime);
    }

    public DeleteGameResponse deleteGameWithOptions(DeleteGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGameResponse());
    }

    public DeleteGameResponse deleteGame(DeleteGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGameWithOptions(request, runtime);
    }

    public SubmitDeploymentResponse submitDeploymentWithOptions(SubmitDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitDeployment", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitDeploymentResponse());
    }

    public SubmitDeploymentResponse submitDeployment(SubmitDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitDeploymentWithOptions(request, runtime);
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflowWithOptions(CreateGameDeployWorkflowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGameDeployWorkflow", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateGameDeployWorkflowResponse());
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflow(CreateGameDeployWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGameDeployWorkflowWithOptions(request, runtime);
    }

    public CreateGameResponse createGameWithOptions(CreateGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateGameResponse());
    }

    public CreateGameResponse createGame(CreateGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGameWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProjects", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListGameVersionsResponse listGameVersionsWithOptions(ListGameVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGameVersions", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListGameVersionsResponse());
    }

    public ListGameVersionsResponse listGameVersions(ListGameVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGameVersionsWithOptions(request, runtime);
    }

    public GetGameVersionProgressResponse getGameVersionProgressWithOptions(GetGameVersionProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameVersionProgress", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameVersionProgressResponse());
    }

    public GetGameVersionProgressResponse getGameVersionProgress(GetGameVersionProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameVersionProgressWithOptions(request, runtime);
    }

    public ListGamesResponse listGamesWithOptions(ListGamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGames", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListGamesResponse());
    }

    public ListGamesResponse listGames(ListGamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGamesWithOptions(request, runtime);
    }

    public AdaptGameVersionResponse adaptGameVersionWithOptions(AdaptGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdaptGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new AdaptGameVersionResponse());
    }

    public AdaptGameVersionResponse adaptGameVersion(AdaptGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.adaptGameVersionWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownloadWithOptions(UploadGameVersionByDownloadRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadGameVersionByDownload", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new UploadGameVersionByDownloadResponse());
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownload(UploadGameVersionByDownloadRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadGameVersionByDownloadWithOptions(request, runtime);
    }

    public RemoveGameFromProjectResponse removeGameFromProjectWithOptions(RemoveGameFromProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveGameFromProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveGameFromProjectResponse());
    }

    public RemoveGameFromProjectResponse removeGameFromProject(RemoveGameFromProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeGameFromProjectWithOptions(request, runtime);
    }

    public AddGameToProjectResponse addGameToProjectWithOptions(AddGameToProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGameToProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new AddGameToProjectResponse());
    }

    public AddGameToProjectResponse addGameToProject(AddGameToProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGameToProjectWithOptions(request, runtime);
    }

    public GetGameVersionResponse getGameVersionWithOptions(GetGameVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameVersionResponse());
    }

    public GetGameVersionResponse getGameVersion(GetGameVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameVersionWithOptions(request, runtime);
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatusWithOptions(ListHistoryContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListHistoryContainerStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListHistoryContainerStatusResponse());
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatus(ListHistoryContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listHistoryContainerStatusWithOptions(request, runtime);
    }

    public ListContainerStatusResponse listContainerStatusWithOptions(ListContainerStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListContainerStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListContainerStatusResponse());
    }

    public ListContainerStatusResponse listContainerStatus(ListContainerStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContainerStatusWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrdersWithOptions(SubmitInternalPurchaseOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseOrders", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseOrdersResponse());
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrders(SubmitInternalPurchaseOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseOrdersWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeDataWithOptions(SubmitInternalPurchaseChargeDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseChargeData", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseChargeDataResponse());
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeData(SubmitInternalPurchaseChargeDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseChargeDataWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlagWithOptions(SubmitInternalPurchaseReadyFlagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseReadyFlag", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseReadyFlagResponse());
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlag(SubmitInternalPurchaseReadyFlagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitInternalPurchaseReadyFlagWithOptions(request, runtime);
    }

    public GetGameStockResponse getGameStockWithOptions(GetGameStockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameStock", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameStockResponse());
    }

    public GetGameStockResponse getGameStock(GetGameStockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameStockWithOptions(request, runtime);
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetailWithOptions(GetOutAccountBindDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOutAccountBindDetail", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetOutAccountBindDetailResponse());
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetail(GetOutAccountBindDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOutAccountBindDetailWithOptions(request, runtime);
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatusWithOptions(QueryOutAccountBindStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOutAccountBindStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryOutAccountBindStatusResponse());
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatus(QueryOutAccountBindStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOutAccountBindStatusWithOptions(request, runtime);
    }

    public CreateTokenResponse createTokenWithOptions(CreateTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateToken", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateTokenResponse());
    }

    public CreateTokenResponse createToken(CreateTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTokenWithOptions(request, runtime);
    }

    public GetSessionResponse getSessionWithOptions(GetSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSession", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetSessionResponse());
    }

    public GetSessionResponse getSession(GetSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSessionWithOptions(request, runtime);
    }

    public SkipTrialPolicyResponse skipTrialPolicyWithOptions(SkipTrialPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SkipTrialPolicy", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SkipTrialPolicyResponse());
    }

    public SkipTrialPolicyResponse skipTrialPolicy(SkipTrialPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.skipTrialPolicyWithOptions(request, runtime);
    }

    public QueryTenantResponse queryTenantWithOptions(QueryTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTenant", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryTenantResponse());
    }

    public QueryTenantResponse queryTenant(QueryTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTenantWithOptions(request, runtime);
    }

    public QueryProjectResponse queryProjectWithOptions(QueryProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryProjectResponse());
    }

    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProjectWithOptions(request, runtime);
    }

    public QueryGameResponse queryGameWithOptions(QueryGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryGameResponse());
    }

    public QueryGameResponse queryGame(QueryGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGameWithOptions(request, runtime);
    }

    public BatchStopGameSessionsResponse batchStopGameSessionsWithOptions(BatchStopGameSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchStopGameSessions", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchStopGameSessionsResponse());
    }

    public BatchStopGameSessionsResponse batchStopGameSessions(BatchStopGameSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchStopGameSessionsWithOptions(request, runtime);
    }

    public GetStopGameTokenResponse getStopGameTokenWithOptions(GetStopGameTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStopGameToken", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetStopGameTokenResponse());
    }

    public GetStopGameTokenResponse getStopGameToken(GetStopGameTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStopGameTokenWithOptions(request, runtime);
    }

    public QueryItemsResponse queryItemsWithOptions(QueryItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryItems", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryItemsResponse());
    }

    public QueryItemsResponse queryItems(QueryItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemsWithOptions(request, runtime);
    }

    public GetItemResponse getItemWithOptions(GetItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetItem", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetItemResponse());
    }

    public GetItemResponse getItem(GetItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getItemWithOptions(request, runtime);
    }

    public DeliveryOrderResponse deliveryOrderWithOptions(DeliveryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeliveryOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeliveryOrderResponse());
    }

    public DeliveryOrderResponse deliveryOrder(DeliveryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deliveryOrderWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public QueryOrderResponse queryOrderWithOptions(QueryOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryOrderResponse());
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderWithOptions(request, runtime);
    }

    public ListBoughtGamesResponse listBoughtGamesWithOptions(ListBoughtGamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBoughtGames", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListBoughtGamesResponse());
    }

    public ListBoughtGamesResponse listBoughtGames(ListBoughtGamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBoughtGamesWithOptions(request, runtime);
    }

    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloseOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CloseOrderResponse());
    }

    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlotWithOptions(BatchDispatchGameSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDispatchGameSlot", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchDispatchGameSlotResponse());
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlot(BatchDispatchGameSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDispatchGameSlotWithOptions(request, runtime);
    }

    public StopGameSessionResponse stopGameSessionWithOptions(StopGameSessionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopGameSession", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new StopGameSessionResponse());
    }

    public StopGameSessionResponse stopGameSession(StopGameSessionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopGameSessionWithOptions(request, runtime);
    }

    public DispatchGameSlotResponse dispatchGameSlotWithOptions(DispatchGameSlotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DispatchGameSlot", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DispatchGameSlotResponse());
    }

    public DispatchGameSlotResponse dispatchGameSlot(DispatchGameSlotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.dispatchGameSlotWithOptions(request, runtime);
    }

    public GetGameCcuResponse getGameCcuWithOptions(GetGameCcuRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameCcu", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameCcuResponse());
    }

    public GetGameCcuResponse getGameCcu(GetGameCcuRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGameCcuWithOptions(request, runtime);
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
}
