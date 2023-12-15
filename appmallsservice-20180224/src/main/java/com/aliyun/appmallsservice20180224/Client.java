// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appmallsservice20180224;

import com.aliyun.tea.*;
import com.aliyun.appmallsservice20180224.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "appms.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "appms.aliyuncs.com"),
            new TeaPair("ap-south-1", "appms.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "appms.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "appms.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "appms.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "appms.aliyuncs.com"),
            new TeaPair("cn-beijing", "appms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "appms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "appms.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "appms.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-chengdu", "appms.aliyuncs.com"),
            new TeaPair("cn-edge-1", "appms.aliyuncs.com"),
            new TeaPair("cn-fujian", "appms.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "appms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "appms.aliyuncs.com"),
            new TeaPair("cn-hongkong", "appms.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "appms.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "appms.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "appms.aliyuncs.com"),
            new TeaPair("cn-qingdao", "appms.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "appms.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "appms.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "appms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "appms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "appms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "appms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-wuhan", "appms.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "appms.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "appms.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "appms.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "appms.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "appms.aliyuncs.com"),
            new TeaPair("eu-central-1", "appms.aliyuncs.com"),
            new TeaPair("eu-west-1", "appms.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "appms.aliyuncs.com"),
            new TeaPair("me-east-1", "appms.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "appms.aliyuncs.com"),
            new TeaPair("us-east-1", "appms.aliyuncs.com"),
            new TeaPair("us-west-1", "appms.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appmallsservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetMessagesResponse getMessagesWithOptions(GetMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topic)) {
            query.put("Topic", request.topic);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMessages"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMessagesResponse());
    }

    public GetMessagesResponse getMessages(GetMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMessagesWithOptions(request, runtime);
    }

    public RemoveMessagesResponse removeMessagesWithOptions(RemoveMessagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveMessagesShrinkRequest request = new RemoveMessagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.msgIds)) {
            request.msgIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.msgIds, "MsgIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.msgIdsShrink)) {
            query.put("MsgIds", request.msgIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMessages"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMessagesResponse());
    }

    public RemoveMessagesResponse removeMessages(RemoveMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeMessagesWithOptions(request, runtime);
    }

    public TaobaoFilmGetCinemasResponse taobaoFilmGetCinemasWithOptions(TaobaoFilmGetCinemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetCinemas"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetCinemasResponse());
    }

    public TaobaoFilmGetCinemasResponse taobaoFilmGetCinemas(TaobaoFilmGetCinemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetCinemasWithOptions(request, runtime);
    }

    public TaobaoFilmGetHotShowsResponse taobaoFilmGetHotShowsWithOptions(TaobaoFilmGetHotShowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetHotShows"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetHotShowsResponse());
    }

    public TaobaoFilmGetHotShowsResponse taobaoFilmGetHotShows(TaobaoFilmGetHotShowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetHotShowsWithOptions(request, runtime);
    }

    public TaobaoFilmGetRegionListResponse taobaoFilmGetRegionListWithOptions(TaobaoFilmGetRegionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetRegionList"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetRegionListResponse());
    }

    public TaobaoFilmGetRegionListResponse taobaoFilmGetRegionList(TaobaoFilmGetRegionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetRegionListWithOptions(request, runtime);
    }

    public TaobaoFilmGetSchedulesResponse taobaoFilmGetSchedulesWithOptions(TaobaoFilmGetSchedulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cinemaId)) {
            query.put("CinemaId", request.cinemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetSchedules"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetSchedulesResponse());
    }

    public TaobaoFilmGetSchedulesResponse taobaoFilmGetSchedules(TaobaoFilmGetSchedulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetSchedulesWithOptions(request, runtime);
    }

    public TaobaoFilmGetSeatsResponse taobaoFilmGetSeatsWithOptions(TaobaoFilmGetSeatsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetSeats"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetSeatsResponse());
    }

    public TaobaoFilmGetSeatsResponse taobaoFilmGetSeats(TaobaoFilmGetSeatsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetSeatsWithOptions(request, runtime);
    }

    public TaobaoFilmGetShowCommentsResponse taobaoFilmGetShowCommentsWithOptions(TaobaoFilmGetShowCommentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showId)) {
            query.put("ShowId", request.showId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetShowComments"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetShowCommentsResponse());
    }

    public TaobaoFilmGetShowCommentsResponse taobaoFilmGetShowComments(TaobaoFilmGetShowCommentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetShowCommentsWithOptions(request, runtime);
    }

    public TaobaoFilmGetSoonShowsResponse taobaoFilmGetSoonShowsWithOptions(TaobaoFilmGetSoonShowsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmGetSoonShows"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmGetSoonShowsResponse());
    }

    public TaobaoFilmGetSoonShowsResponse taobaoFilmGetSoonShows(TaobaoFilmGetSoonShowsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmGetSoonShowsWithOptions(request, runtime);
    }

    public TaobaoFilmIssueOrderResponse taobaoFilmIssueOrderWithOptions(TaobaoFilmIssueOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extOrderId)) {
            query.put("ExtOrderId", request.extOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extUserId)) {
            query.put("ExtUserId", request.extUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockSeatApplyKey)) {
            query.put("LockSeatApplyKey", request.lockSeatApplyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPrice)) {
            query.put("TotalPrice", request.totalPrice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmIssueOrder"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmIssueOrderResponse());
    }

    public TaobaoFilmIssueOrderResponse taobaoFilmIssueOrder(TaobaoFilmIssueOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmIssueOrderWithOptions(request, runtime);
    }

    public TaobaoFilmLockSeatResponse taobaoFilmLockSeatWithOptions(TaobaoFilmLockSeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extUserId)) {
            query.put("ExtUserId", request.extUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleId)) {
            query.put("ScheduleId", request.scheduleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatIds)) {
            query.put("SeatIds", request.seatIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.seatNames)) {
            query.put("SeatNames", request.seatNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmLockSeat"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmLockSeatResponse());
    }

    public TaobaoFilmLockSeatResponse taobaoFilmLockSeat(TaobaoFilmLockSeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmLockSeatWithOptions(request, runtime);
    }

    public TaobaoFilmUnLockSeatResponse taobaoFilmUnLockSeatWithOptions(TaobaoFilmUnLockSeatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extUserId)) {
            query.put("ExtUserId", request.extUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lockSeatApplyKey)) {
            query.put("LockSeatApplyKey", request.lockSeatApplyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramsJson)) {
            query.put("ParamsJson", request.paramsJson);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TaobaoFilmUnLockSeat"),
            new TeaPair("version", "2018-02-24"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TaobaoFilmUnLockSeatResponse());
    }

    public TaobaoFilmUnLockSeatResponse taobaoFilmUnLockSeat(TaobaoFilmUnLockSeatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.taobaoFilmUnLockSeatWithOptions(request, runtime);
    }
}
