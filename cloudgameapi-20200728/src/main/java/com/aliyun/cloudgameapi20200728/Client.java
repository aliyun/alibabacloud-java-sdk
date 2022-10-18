// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728;

import com.aliyun.tea.*;
import com.aliyun.cloudgameapi20200728.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudgameapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public AdaptGameVersionResponse adaptGameVersionWithOptions(AdaptGameVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AdaptGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new AdaptGameVersionResponse());
    }

    public AdaptGameVersionResponse adaptGameVersion(AdaptGameVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.adaptGameVersionWithOptions(request, runtime);
    }

    public AddGameToProjectResponse addGameToProjectWithOptions(AddGameToProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGameToProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new AddGameToProjectResponse());
    }

    public AddGameToProjectResponse addGameToProject(AddGameToProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGameToProjectWithOptions(request, runtime);
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlotWithOptions(BatchDispatchGameSlotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDispatchGameSlot", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchDispatchGameSlotResponse());
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlot(BatchDispatchGameSlotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDispatchGameSlotWithOptions(request, runtime);
    }

    public BatchStopGameSessionsResponse batchStopGameSessionsWithOptions(BatchStopGameSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchStopGameSessions", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchStopGameSessionsResponse());
    }

    public BatchStopGameSessionsResponse batchStopGameSessions(BatchStopGameSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopGameSessionsWithOptions(request, runtime);
    }

    public CancelGameHangResponse cancelGameHangWithOptions(CancelGameHangRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelGameHang", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CancelGameHangResponse());
    }

    public CancelGameHangResponse cancelGameHang(CancelGameHangRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelGameHangWithOptions(request, runtime);
    }

    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloseOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CloseOrderResponse());
    }

    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    public CreateGameResponse createGameWithOptions(CreateGameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateGameResponse());
    }

    public CreateGameResponse createGame(CreateGameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGameWithOptions(request, runtime);
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflowWithOptions(CreateGameDeployWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateGameDeployWorkflow", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateGameDeployWorkflowResponse());
    }

    public CreateGameDeployWorkflowResponse createGameDeployWorkflow(CreateGameDeployWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGameDeployWorkflowWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public CreateProjectResponse createProjectWithOptions(CreateProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateProjectResponse());
    }

    public CreateProjectResponse createProject(CreateProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProjectWithOptions(request, runtime);
    }

    public CreateTokenResponse createTokenWithOptions(CreateTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateToken", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new CreateTokenResponse());
    }

    public CreateTokenResponse createToken(CreateTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTokenWithOptions(request, runtime);
    }

    public DeleteGameResponse deleteGameWithOptions(DeleteGameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGameResponse());
    }

    public DeleteGameResponse deleteGame(DeleteGameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGameWithOptions(request, runtime);
    }

    public DeleteGameArchiveResponse deleteGameArchiveWithOptions(DeleteGameArchiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGameArchive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGameArchiveResponse());
    }

    public DeleteGameArchiveResponse deleteGameArchive(DeleteGameArchiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGameArchiveWithOptions(request, runtime);
    }

    public DeleteGameVersionResponse deleteGameVersionWithOptions(DeleteGameVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteGameVersionResponse());
    }

    public DeleteGameVersionResponse deleteGameVersion(DeleteGameVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGameVersionWithOptions(request, runtime);
    }

    public DeleteProjectResponse deleteProjectWithOptions(DeleteProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProjectResponse());
    }

    public DeleteProjectResponse deleteProject(DeleteProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProjectWithOptions(request, runtime);
    }

    public DeliveryOrderResponse deliveryOrderWithOptions(DeliveryOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeliveryOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DeliveryOrderResponse());
    }

    public DeliveryOrderResponse deliveryOrder(DeliveryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deliveryOrderWithOptions(request, runtime);
    }

    public DispatchGameSlotResponse dispatchGameSlotWithOptions(DispatchGameSlotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DispatchGameSlot", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new DispatchGameSlotResponse());
    }

    public DispatchGameSlotResponse dispatchGameSlot(DispatchGameSlotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dispatchGameSlotWithOptions(request, runtime);
    }

    public GetGameCcuResponse getGameCcuWithOptions(GetGameCcuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameCcu", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameCcuResponse());
    }

    public GetGameCcuResponse getGameCcu(GetGameCcuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameCcuWithOptions(request, runtime);
    }

    public GetGameStatusResponse getGameStatusWithOptions(GetGameStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameStatusResponse());
    }

    public GetGameStatusResponse getGameStatus(GetGameStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameStatusWithOptions(request, runtime);
    }

    public GetGameStockResponse getGameStockWithOptions(GetGameStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameStock", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameStockResponse());
    }

    public GetGameStockResponse getGameStock(GetGameStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameStockWithOptions(request, runtime);
    }

    public GetGameTrialSurplusDurationResponse getGameTrialSurplusDurationWithOptions(GetGameTrialSurplusDurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameTrialSurplusDuration", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameTrialSurplusDurationResponse());
    }

    public GetGameTrialSurplusDurationResponse getGameTrialSurplusDuration(GetGameTrialSurplusDurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameTrialSurplusDurationWithOptions(request, runtime);
    }

    public GetGameVersionResponse getGameVersionWithOptions(GetGameVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameVersion", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameVersionResponse());
    }

    public GetGameVersionResponse getGameVersion(GetGameVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameVersionWithOptions(request, runtime);
    }

    public GetGameVersionProgressResponse getGameVersionProgressWithOptions(GetGameVersionProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGameVersionProgress", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetGameVersionProgressResponse());
    }

    public GetGameVersionProgressResponse getGameVersionProgress(GetGameVersionProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGameVersionProgressWithOptions(request, runtime);
    }

    public GetItemResponse getItemWithOptions(GetItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetItem", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetItemResponse());
    }

    public GetItemResponse getItem(GetItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getItemWithOptions(request, runtime);
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetailWithOptions(GetOutAccountBindDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOutAccountBindDetail", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetOutAccountBindDetailResponse());
    }

    public GetOutAccountBindDetailResponse getOutAccountBindDetail(GetOutAccountBindDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOutAccountBindDetailWithOptions(request, runtime);
    }

    public GetQueuingSizeResponse getQueuingSizeWithOptions(GetQueuingSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetQueuingSize", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetQueuingSizeResponse());
    }

    public GetQueuingSizeResponse getQueuingSize(GetQueuingSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueuingSizeWithOptions(request, runtime);
    }

    public GetSessionResponse getSessionWithOptions(GetSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSession", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetSessionResponse());
    }

    public GetSessionResponse getSession(GetSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSessionWithOptions(request, runtime);
    }

    public GetStopGameTokenResponse getStopGameTokenWithOptions(GetStopGameTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStopGameToken", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetStopGameTokenResponse());
    }

    public GetStopGameTokenResponse getStopGameToken(GetStopGameTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStopGameTokenWithOptions(request, runtime);
    }

    public KickPlayerResponse kickPlayerWithOptions(KickPlayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("KickPlayer", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new KickPlayerResponse());
    }

    public KickPlayerResponse kickPlayer(KickPlayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.kickPlayerWithOptions(request, runtime);
    }

    public ListBoughtGamesResponse listBoughtGamesWithOptions(ListBoughtGamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListBoughtGames", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListBoughtGamesResponse());
    }

    public ListBoughtGamesResponse listBoughtGames(ListBoughtGamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBoughtGamesWithOptions(request, runtime);
    }

    public ListContainerStatusResponse listContainerStatusWithOptions(ListContainerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListContainerStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListContainerStatusResponse());
    }

    public ListContainerStatusResponse listContainerStatus(ListContainerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listContainerStatusWithOptions(request, runtime);
    }

    public ListDeployableInstancesResponse listDeployableInstancesWithOptions(ListDeployableInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeployableInstances", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListDeployableInstancesResponse());
    }

    public ListDeployableInstancesResponse listDeployableInstances(ListDeployableInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDeployableInstancesWithOptions(request, runtime);
    }

    public ListGameServerIpResponse listGameServerIpWithOptions(ListGameServerIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGameServerIp", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListGameServerIpResponse());
    }

    public ListGameServerIpResponse listGameServerIp(ListGameServerIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGameServerIpWithOptions(request, runtime);
    }

    public ListGameVersionsResponse listGameVersionsWithOptions(ListGameVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGameVersions", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListGameVersionsResponse());
    }

    public ListGameVersionsResponse listGameVersions(ListGameVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGameVersionsWithOptions(request, runtime);
    }

    public ListGamesResponse listGamesWithOptions(ListGamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListGames", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListGamesResponse());
    }

    public ListGamesResponse listGames(ListGamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGamesWithOptions(request, runtime);
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatusWithOptions(ListHistoryContainerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListHistoryContainerStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListHistoryContainerStatusResponse());
    }

    public ListHistoryContainerStatusResponse listHistoryContainerStatus(ListHistoryContainerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listHistoryContainerStatusWithOptions(request, runtime);
    }

    public ListLatestGameArchiveResponse listLatestGameArchiveWithOptions(ListLatestGameArchiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLatestGameArchive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListLatestGameArchiveResponse());
    }

    public ListLatestGameArchiveResponse listLatestGameArchive(ListLatestGameArchiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLatestGameArchiveWithOptions(request, runtime);
    }

    public ListProjectsResponse listProjectsWithOptions(ListProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProjects", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListProjectsResponse());
    }

    public ListProjectsResponse listProjects(ListProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProjectsWithOptions(request, runtime);
    }

    public ListRequestEventResponse listRequestEventWithOptions(ListRequestEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRequestEvent", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new ListRequestEventResponse());
    }

    public ListRequestEventResponse listRequestEvent(ListRequestEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRequestEventWithOptions(request, runtime);
    }

    public QueryGameResponse queryGameWithOptions(QueryGameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryGameResponse());
    }

    public QueryGameResponse queryGame(QueryGameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGameWithOptions(request, runtime);
    }

    public QueryGameHangResponse queryGameHangWithOptions(QueryGameHangRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryGameHang", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryGameHangResponse());
    }

    public QueryGameHangResponse queryGameHang(QueryGameHangRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGameHangWithOptions(request, runtime);
    }

    public QueryItemsResponse queryItemsWithOptions(QueryItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryItems", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryItemsResponse());
    }

    public QueryItemsResponse queryItems(QueryItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryItemsWithOptions(request, runtime);
    }

    public QueryOrderResponse queryOrderWithOptions(QueryOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOrder", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryOrderResponse());
    }

    public QueryOrderResponse queryOrder(QueryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrderWithOptions(request, runtime);
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatusWithOptions(QueryOutAccountBindStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOutAccountBindStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryOutAccountBindStatusResponse());
    }

    public QueryOutAccountBindStatusResponse queryOutAccountBindStatus(QueryOutAccountBindStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOutAccountBindStatusWithOptions(request, runtime);
    }

    public QueryProjectResponse queryProjectWithOptions(QueryProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryProjectResponse());
    }

    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProjectWithOptions(request, runtime);
    }

    public QuerySessionStatusResponse querySessionStatusWithOptions(QuerySessionStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySessionStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QuerySessionStatusResponse());
    }

    public QuerySessionStatusResponse querySessionStatus(QuerySessionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySessionStatusWithOptions(request, runtime);
    }

    public QueryTenantResponse queryTenantWithOptions(QueryTenantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTenant", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryTenantResponse());
    }

    public QueryTenantResponse queryTenant(QueryTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTenantWithOptions(request, runtime);
    }

    public RemoveGameFromProjectResponse removeGameFromProjectWithOptions(RemoveGameFromProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveGameFromProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new RemoveGameFromProjectResponse());
    }

    public RemoveGameFromProjectResponse removeGameFromProject(RemoveGameFromProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeGameFromProjectWithOptions(request, runtime);
    }

    public RestoreGameArchiveResponse restoreGameArchiveWithOptions(RestoreGameArchiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestoreGameArchive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new RestoreGameArchiveResponse());
    }

    public RestoreGameArchiveResponse restoreGameArchive(RestoreGameArchiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restoreGameArchiveWithOptions(request, runtime);
    }

    public SetGameAliveResponse setGameAliveWithOptions(SetGameAliveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetGameAlive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SetGameAliveResponse());
    }

    public SetGameAliveResponse setGameAlive(SetGameAliveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGameAliveWithOptions(request, runtime);
    }

    public SetGameHangResponse setGameHangWithOptions(SetGameHangRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetGameHang", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SetGameHangResponse());
    }

    public SetGameHangResponse setGameHang(SetGameHangRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setGameHangWithOptions(request, runtime);
    }

    public SkipTrialPolicyResponse skipTrialPolicyWithOptions(SkipTrialPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SkipTrialPolicy", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SkipTrialPolicyResponse());
    }

    public SkipTrialPolicyResponse skipTrialPolicy(SkipTrialPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipTrialPolicyWithOptions(request, runtime);
    }

    public StartGameLiveResponse startGameLiveWithOptions(StartGameLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartGameLive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new StartGameLiveResponse());
    }

    public StartGameLiveResponse startGameLive(StartGameLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startGameLiveWithOptions(request, runtime);
    }

    public StopGameLiveResponse stopGameLiveWithOptions(StopGameLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopGameLive", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new StopGameLiveResponse());
    }

    public StopGameLiveResponse stopGameLive(StopGameLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopGameLiveWithOptions(request, runtime);
    }

    public StopGameSessionResponse stopGameSessionWithOptions(StopGameSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopGameSession", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new StopGameSessionResponse());
    }

    public StopGameSessionResponse stopGameSession(StopGameSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopGameSessionWithOptions(request, runtime);
    }

    public SubmitDeploymentResponse submitDeploymentWithOptions(SubmitDeploymentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitDeployment", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitDeploymentResponse());
    }

    public SubmitDeploymentResponse submitDeployment(SubmitDeploymentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDeploymentWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeDataWithOptions(SubmitInternalPurchaseChargeDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseChargeData", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseChargeDataResponse());
    }

    public SubmitInternalPurchaseChargeDataResponse submitInternalPurchaseChargeData(SubmitInternalPurchaseChargeDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitInternalPurchaseChargeDataWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrdersWithOptions(SubmitInternalPurchaseOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseOrders", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseOrdersResponse());
    }

    public SubmitInternalPurchaseOrdersResponse submitInternalPurchaseOrders(SubmitInternalPurchaseOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitInternalPurchaseOrdersWithOptions(request, runtime);
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlagWithOptions(SubmitInternalPurchaseReadyFlagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitInternalPurchaseReadyFlag", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new SubmitInternalPurchaseReadyFlagResponse());
    }

    public SubmitInternalPurchaseReadyFlagResponse submitInternalPurchaseReadyFlag(SubmitInternalPurchaseReadyFlagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitInternalPurchaseReadyFlagWithOptions(request, runtime);
    }

    public UpdateGameArchiveTagStatusResponse updateGameArchiveTagStatusWithOptions(UpdateGameArchiveTagStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateGameArchiveTagStatus", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new UpdateGameArchiveTagStatusResponse());
    }

    public UpdateGameArchiveTagStatusResponse updateGameArchiveTagStatus(UpdateGameArchiveTagStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGameArchiveTagStatusWithOptions(request, runtime);
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownloadWithOptions(UploadGameVersionByDownloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UploadGameVersionByDownload", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new UploadGameVersionByDownloadResponse());
    }

    public UploadGameVersionByDownloadResponse uploadGameVersionByDownload(UploadGameVersionByDownloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadGameVersionByDownloadWithOptions(request, runtime);
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
