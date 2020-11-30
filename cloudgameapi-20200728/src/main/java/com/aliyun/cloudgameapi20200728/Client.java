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


    public QueryTenantResponse queryTenantWithOptions(QueryTenantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTenant", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryTenantResponse());
    }

    public QueryTenantResponse queryTenant(QueryTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTenantWithOptions(request, runtime);
    }

    public QueryProjectResponse queryProjectWithOptions(QueryProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProject", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryProjectResponse());
    }

    public QueryProjectResponse queryProject(QueryProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProjectWithOptions(request, runtime);
    }

    public QueryGameResponse queryGameWithOptions(QueryGameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryGame", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new QueryGameResponse());
    }

    public QueryGameResponse queryGame(QueryGameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryGameWithOptions(request, runtime);
    }

    public BatchStopGameSessionsResponse batchStopGameSessionsWithOptions(BatchStopGameSessionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchStopGameSessions", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchStopGameSessionsResponse());
    }

    public BatchStopGameSessionsResponse batchStopGameSessions(BatchStopGameSessionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchStopGameSessionsWithOptions(request, runtime);
    }

    public GetStopGameTokenResponse getStopGameTokenWithOptions(GetStopGameTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStopGameToken", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new GetStopGameTokenResponse());
    }

    public GetStopGameTokenResponse getStopGameToken(GetStopGameTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStopGameTokenWithOptions(request, runtime);
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlotWithOptions(BatchDispatchGameSlotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDispatchGameSlot", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new BatchDispatchGameSlotResponse());
    }

    public BatchDispatchGameSlotResponse batchDispatchGameSlot(BatchDispatchGameSlotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchDispatchGameSlotWithOptions(request, runtime);
    }

    public StopGameSessionResponse stopGameSessionWithOptions(StopGameSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopGameSession", "HTTPS", "POST", "2020-07-28", "AK", null, TeaModel.buildMap(request), runtime), new StopGameSessionResponse());
    }

    public StopGameSessionResponse stopGameSession(StopGameSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopGameSessionWithOptions(request, runtime);
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
