// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520;

import com.aliyun.tea.*;
import com.aliyun.btripopen20220520.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("btripopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AccessTokenResponse accessToken(AccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.accessTokenWithOptions(request, headers, runtime);
    }

    public AccessTokenResponse accessTokenWithOptions(AccessTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("app_key", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/access-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessTokenResponse());
    }

    public AddressGetResponse addressGet(AddressGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddressGetHeaders headers = new AddressGetHeaders();
        return this.addressGetWithOptions(request, headers, runtime);
    }

    public AddressGetResponse addressGetWithOptions(AddressGetRequest request, AddressGetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("action_type", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryId)) {
            query.put("itinerary_id", request.itineraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddressGet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/v1/address"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddressGetResponse());
    }

    public AirportSearchResponse airportSearch(AirportSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AirportSearchHeaders headers = new AirportSearchHeaders();
        return this.airportSearchWithOptions(request, headers, runtime);
    }

    public AirportSearchResponse airportSearchWithOptions(AirportSearchRequest request, AirportSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AirportSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/airport"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AirportSearchResponse());
    }

    public ApplyAddResponse applyAdd(ApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyAddHeaders headers = new ApplyAddHeaders();
        return this.applyAddWithOptions(request, headers, runtime);
    }

    public ApplyAddResponse applyAddWithOptions(ApplyAddRequest tmpReq, ApplyAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyAddShrinkRequest request = new ApplyAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.externalTravelerStandard))) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.externalTravelerStandard), "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.hotelShare))) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.hotelShare), "hotel_share", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itineraryList)) {
            request.itineraryListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itineraryList, "itinerary_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itinerarySetList)) {
            request.itinerarySetListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itinerarySetList, "itinerary_set_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerList)) {
            request.travelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerList, "traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerStandard)) {
            request.travelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerStandard, "traveler_standard", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.internationalFlightCabins)) {
            query.put("international_flight_cabins", request.internationalFlightCabins);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budget)) {
            body.put("budget", request.budget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetMerge)) {
            body.put("budget_merge", request.budgetMerge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corp_name", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            body.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departName)) {
            body.put("depart_name", request.departName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerListShrink)) {
            body.put("external_traveler_list", request.externalTravelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerStandardShrink)) {
            body.put("external_traveler_standard", request.externalTravelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightBudget)) {
            body.put("flight_budget", request.flightBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelBudget)) {
            body.put("hotel_budget", request.hotelBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelShareShrink)) {
            body.put("hotel_share", request.hotelShareShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryListShrink)) {
            body.put("itinerary_list", request.itineraryListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryRule)) {
            body.put("itinerary_rule", request.itineraryRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itinerarySetListShrink)) {
            body.put("itinerary_set_list", request.itinerarySetListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitTraveler)) {
            body.put("limit_traveler", request.limitTraveler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            body.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartBusinessId)) {
            body.put("thirdpart_business_id", request.thirdpartBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.togetherBookRule)) {
            body.put("together_book_rule", request.togetherBookRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainBudget)) {
            body.put("train_budget", request.trainBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerListShrink)) {
            body.put("traveler_list", request.travelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerStandardShrink)) {
            body.put("traveler_standard", request.travelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripCause)) {
            body.put("trip_cause", request.tripCause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripDay)) {
            body.put("trip_day", request.tripDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripTitle)) {
            body.put("trip_title", request.tripTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            body.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleBudget)) {
            body.put("vehicle_budget", request.vehicleBudget);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAddResponse());
    }

    public ApplyApproveResponse applyApprove(ApplyApproveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyApproveHeaders headers = new ApplyApproveHeaders();
        return this.applyApproveWithOptions(request, headers, runtime);
    }

    public ApplyApproveResponse applyApproveWithOptions(ApplyApproveRequest request, ApplyApproveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            body.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.note)) {
            body.put("note", request.note);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            body.put("operate_time", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyApprove"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip/action/approve"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyApproveResponse());
    }

    public ApplyListQueryResponse applyListQuery(ApplyListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyListQueryHeaders headers = new ApplyListQueryHeaders();
        return this.applyListQueryWithOptions(request, headers, runtime);
    }

    public ApplyListQueryResponse applyListQueryWithOptions(ApplyListQueryRequest request, ApplyListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gmtModified)) {
            query.put("gmt_modified", request.gmtModified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyShangLvApply)) {
            query.put("only_shang_lv_apply", request.onlyShangLvApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            query.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trips"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyListQueryResponse());
    }

    public ApplyModifyResponse applyModify(ApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyModifyHeaders headers = new ApplyModifyHeaders();
        return this.applyModifyWithOptions(request, headers, runtime);
    }

    public ApplyModifyResponse applyModifyWithOptions(ApplyModifyRequest tmpReq, ApplyModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyModifyShrinkRequest request = new ApplyModifyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.externalTravelerStandard))) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.externalTravelerStandard), "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.hotelShare))) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.hotelShare), "hotel_share", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itineraryList)) {
            request.itineraryListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itineraryList, "itinerary_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itinerarySetList)) {
            request.itinerarySetListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itinerarySetList, "itinerary_set_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerList)) {
            request.travelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerList, "traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerStandard)) {
            request.travelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerStandard, "traveler_standard", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budget)) {
            body.put("budget", request.budget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetMerge)) {
            body.put("budget_merge", request.budgetMerge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpName)) {
            body.put("corp_name", request.corpName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            body.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departName)) {
            body.put("depart_name", request.departName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerListShrink)) {
            body.put("external_traveler_list", request.externalTravelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalTravelerStandardShrink)) {
            body.put("external_traveler_standard", request.externalTravelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightBudget)) {
            body.put("flight_budget", request.flightBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelBudget)) {
            body.put("hotel_budget", request.hotelBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelShareShrink)) {
            body.put("hotel_share", request.hotelShareShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryListShrink)) {
            body.put("itinerary_list", request.itineraryListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryRule)) {
            body.put("itinerary_rule", request.itineraryRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itinerarySetListShrink)) {
            body.put("itinerary_set_list", request.itinerarySetListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitTraveler)) {
            body.put("limit_traveler", request.limitTraveler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            body.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartBusinessId)) {
            body.put("thirdpart_business_id", request.thirdpartBusinessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.togetherBookRule)) {
            body.put("together_book_rule", request.togetherBookRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trainBudget)) {
            body.put("train_budget", request.trainBudget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerListShrink)) {
            body.put("traveler_list", request.travelerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerStandardShrink)) {
            body.put("traveler_standard", request.travelerStandardShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripCause)) {
            body.put("trip_cause", request.tripCause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripDay)) {
            body.put("trip_day", request.tripDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripTitle)) {
            body.put("trip_title", request.tripTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unionNo)) {
            body.put("union_no", request.unionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("user_name", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vehicleBudget)) {
            body.put("vehicle_budget", request.vehicleBudget);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyModifyResponse());
    }

    public ApplyQueryResponse applyQuery(ApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyQueryHeaders headers = new ApplyQueryHeaders();
        return this.applyQueryWithOptions(request, headers, runtime);
    }

    public ApplyQueryResponse applyQueryWithOptions(ApplyQueryRequest request, ApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyShowId)) {
            query.put("apply_show_id", request.applyShowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/biz-trip"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyQueryResponse());
    }

    public CarApplyAddResponse carApplyAdd(CarApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyAddHeaders headers = new CarApplyAddHeaders();
        return this.carApplyAddWithOptions(request, headers, runtime);
    }

    public CarApplyAddResponse carApplyAddWithOptions(CarApplyAddRequest request, CarApplyAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cause)) {
            body.put("cause", request.cause);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.city)) {
            body.put("city", request.city);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            body.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.finishedDate)) {
            body.put("finished_date", request.finishedDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectCode)) {
            body.put("project_code", request.projectCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            body.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesTotal)) {
            body.put("times_total", request.timesTotal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesType)) {
            body.put("times_type", request.timesType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timesUsed)) {
            body.put("times_used", request.timesUsed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyAddResponse());
    }

    public CarApplyModifyResponse carApplyModify(CarApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyModifyHeaders headers = new CarApplyModifyHeaders();
        return this.carApplyModifyWithOptions(request, headers, runtime);
    }

    public CarApplyModifyResponse carApplyModifyWithOptions(CarApplyModifyRequest request, CarApplyModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operateTime)) {
            body.put("operate_time", request.operateTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            body.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyModifyResponse());
    }

    public CarApplyQueryResponse carApplyQuery(CarApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyQueryHeaders headers = new CarApplyQueryHeaders();
        return this.carApplyQueryWithOptions(request, headers, runtime);
    }

    public CarApplyQueryResponse carApplyQueryWithOptions(CarApplyQueryRequest request, CarApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createdEndAt)) {
            query.put("created_end_at", request.createdEndAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdStartAt)) {
            query.put("created_start_at", request.createdStartAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("page_number", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartApplyId)) {
            query.put("third_part_apply_id", request.thirdPartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/car"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarApplyQueryResponse());
    }

    public CarBillSettlementQueryResponse carBillSettlementQuery(CarBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarBillSettlementQueryHeaders headers = new CarBillSettlementQueryHeaders();
        return this.carBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public CarBillSettlementQueryResponse carBillSettlementQueryWithOptions(CarBillSettlementQueryRequest request, CarBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarBillSettlementQueryResponse());
    }

    public CarOrderListQueryResponse carOrderListQuery(CarOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarOrderListQueryHeaders headers = new CarOrderListQueryHeaders();
        return this.carOrderListQueryWithOptions(request, headers, runtime);
    }

    public CarOrderListQueryResponse carOrderListQueryWithOptions(CarOrderListQueryRequest request, CarOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CarOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarOrderListQueryResponse());
    }

    public CitySearchResponse citySearch(CitySearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CitySearchHeaders headers = new CitySearchHeaders();
        return this.citySearchWithOptions(request, headers, runtime);
    }

    public CitySearchResponse citySearchWithOptions(CitySearchRequest request, CitySearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CitySearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/city"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CitySearchResponse());
    }

    public CommonApplyQueryResponse commonApplyQuery(CommonApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplyQueryHeaders headers = new CommonApplyQueryHeaders();
        return this.commonApplyQueryWithOptions(request, headers, runtime);
    }

    public CommonApplyQueryResponse commonApplyQueryWithOptions(CommonApplyQueryRequest request, CommonApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/common"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonApplyQueryResponse());
    }

    public CommonApplySyncResponse commonApplySync(CommonApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplySyncHeaders headers = new CommonApplySyncHeaders();
        return this.commonApplySyncWithOptions(request, headers, runtime);
    }

    public CommonApplySyncResponse commonApplySyncWithOptions(CommonApplySyncRequest request, CommonApplySyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyFlowId)) {
            query.put("thirdparty_flow_id", request.thirdpartyFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CommonApplySync"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/syn-common"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CommonApplySyncResponse());
    }

    public CorpTokenResponse corpToken(CorpTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CorpTokenHeaders headers = new CorpTokenHeaders();
        return this.corpTokenWithOptions(request, headers, runtime);
    }

    public CorpTokenResponse corpTokenWithOptions(CorpTokenRequest request, CorpTokenHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CorpToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/corp-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CorpTokenResponse());
    }

    public CostCenterDeleteResponse costCenterDelete(CostCenterDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterDeleteHeaders headers = new CostCenterDeleteHeaders();
        return this.costCenterDeleteWithOptions(request, headers, runtime);
    }

    public CostCenterDeleteResponse costCenterDeleteWithOptions(CostCenterDeleteRequest request, CostCenterDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/delete-costcenter"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterDeleteResponse());
    }

    public CostCenterModifyResponse costCenterModify(CostCenterModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterModifyHeaders headers = new CostCenterModifyHeaders();
        return this.costCenterModifyWithOptions(request, headers, runtime);
    }

    public CostCenterModifyResponse costCenterModifyWithOptions(CostCenterModifyRequest request, CostCenterModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayNo)) {
            body.put("alipay_no", request.alipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/modify-costcenter"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterModifyResponse());
    }

    public CostCenterQueryResponse costCenterQuery(CostCenterQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterQueryHeaders headers = new CostCenterQueryHeaders();
        return this.costCenterQueryWithOptions(request, headers, runtime);
    }

    public CostCenterQueryResponse costCenterQueryWithOptions(CostCenterQueryRequest request, CostCenterQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needOrgEntity)) {
            query.put("need_org_entity", request.needOrgEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/costcenter"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterQueryResponse());
    }

    public CostCenterSaveResponse costCenterSave(CostCenterSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterSaveHeaders headers = new CostCenterSaveHeaders();
        return this.costCenterSaveWithOptions(request, headers, runtime);
    }

    public CostCenterSaveResponse costCenterSaveWithOptions(CostCenterSaveRequest request, CostCenterSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayNo)) {
            body.put("alipay_no", request.alipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            body.put("number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/save-costcenter"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterSaveResponse());
    }

    public DepartmentSaveResponse departmentSave(DepartmentSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DepartmentSaveHeaders headers = new DepartmentSaveHeaders();
        return this.departmentSaveWithOptions(request, headers, runtime);
    }

    public DepartmentSaveResponse departmentSaveWithOptions(DepartmentSaveRequest tmpReq, DepartmentSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DepartmentSaveShrinkRequest request = new DepartmentSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.departList)) {
            request.departListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.departList, "depart_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.departListShrink)) {
            body.put("depart_list", request.departListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DepartmentSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/department/v1/department"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DepartmentSaveResponse());
    }

    public EntityAddResponse entityAdd(EntityAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityAddHeaders headers = new EntityAddHeaders();
        return this.entityAddWithOptions(request, headers, runtime);
    }

    public EntityAddResponse entityAddWithOptions(EntityAddRequest tmpReq, EntityAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntityAddShrinkRequest request = new EntityAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntityAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/add-entity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntityAddResponse());
    }

    public EntityDeleteResponse entityDelete(EntityDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityDeleteHeaders headers = new EntityDeleteHeaders();
        return this.entityDeleteWithOptions(request, headers, runtime);
    }

    public EntityDeleteResponse entityDeleteWithOptions(EntityDeleteRequest tmpReq, EntityDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntityDeleteShrinkRequest request = new EntityDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntityDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/entity/action/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntityDeleteResponse());
    }

    public EntitySetResponse entitySet(EntitySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntitySetHeaders headers = new EntitySetHeaders();
        return this.entitySetWithOptions(request, headers, runtime);
    }

    public EntitySetResponse entitySetWithOptions(EntitySetRequest tmpReq, EntitySetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EntitySetShrinkRequest request = new EntitySetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entityDOList)) {
            request.entityDOListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entityDOList, "entity_d_o_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityDOListShrink)) {
            body.put("entity_d_o_list", request.entityDOListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EntitySet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/set-entity"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EntitySetResponse());
    }

    public ExceedApplySyncResponse exceedApplySync(ExceedApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExceedApplySyncHeaders headers = new ExceedApplySyncHeaders();
        return this.exceedApplySyncWithOptions(request, headers, runtime);
    }

    public ExceedApplySyncResponse exceedApplySyncWithOptions(ExceedApplySyncRequest request, ExceedApplySyncHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartyFlowId)) {
            query.put("thirdparty_flow_id", request.thirdpartyFlowId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExceedApplySync"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/syn-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExceedApplySyncResponse());
    }

    public FlightBillSettlementQueryResponse flightBillSettlementQuery(FlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightBillSettlementQueryHeaders headers = new FlightBillSettlementQueryHeaders();
        return this.flightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public FlightBillSettlementQueryResponse flightBillSettlementQueryWithOptions(FlightBillSettlementQueryRequest request, FlightBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightBillSettlementQueryResponse());
    }

    public FlightExceedApplyQueryResponse flightExceedApplyQuery(FlightExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightExceedApplyQueryHeaders headers = new FlightExceedApplyQueryHeaders();
        return this.flightExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public FlightExceedApplyQueryResponse flightExceedApplyQueryWithOptions(FlightExceedApplyQueryRequest request, FlightExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/flight-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightExceedApplyQueryResponse());
    }

    public FlightOrderListQueryResponse flightOrderListQuery(FlightOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderListQueryHeaders headers = new FlightOrderListQueryHeaders();
        return this.flightOrderListQueryWithOptions(request, headers, runtime);
    }

    public FlightOrderListQueryResponse flightOrderListQueryWithOptions(FlightOrderListQueryRequest request, FlightOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderListQueryResponse());
    }

    public FlightOrderQueryResponse flightOrderQuery(FlightOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderQueryHeaders headers = new FlightOrderQueryHeaders();
        return this.flightOrderQueryWithOptions(request, headers, runtime);
    }

    public FlightOrderQueryResponse flightOrderQueryWithOptions(FlightOrderQueryRequest request, FlightOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/flight/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderQueryResponse());
    }

    public HotelBillSettlementQueryResponse hotelBillSettlementQuery(HotelBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelBillSettlementQueryHeaders headers = new HotelBillSettlementQueryHeaders();
        return this.hotelBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public HotelBillSettlementQueryResponse hotelBillSettlementQueryWithOptions(HotelBillSettlementQueryRequest request, HotelBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelBillSettlementQueryResponse());
    }

    public HotelExceedApplyQueryResponse hotelExceedApplyQuery(HotelExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelExceedApplyQueryHeaders headers = new HotelExceedApplyQueryHeaders();
        return this.hotelExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public HotelExceedApplyQueryResponse hotelExceedApplyQueryWithOptions(HotelExceedApplyQueryRequest request, HotelExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/hotel-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelExceedApplyQueryResponse());
    }

    public HotelOrderListQueryResponse hotelOrderListQuery(HotelOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderListQueryHeaders headers = new HotelOrderListQueryHeaders();
        return this.hotelOrderListQueryWithOptions(request, headers, runtime);
    }

    public HotelOrderListQueryResponse hotelOrderListQueryWithOptions(HotelOrderListQueryRequest request, HotelOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderListQueryResponse());
    }

    public IeFlightBillSettlementQueryResponse ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IeFlightBillSettlementQueryHeaders headers = new IeFlightBillSettlementQueryHeaders();
        return this.ieFlightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public IeFlightBillSettlementQueryResponse ieFlightBillSettlementQueryWithOptions(IeFlightBillSettlementQueryRequest request, IeFlightBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IeFlightBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/ie-flight/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IeFlightBillSettlementQueryResponse());
    }

    public InvoiceAddResponse invoiceAdd(InvoiceAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceAddHeaders headers = new InvoiceAddHeaders();
        return this.invoiceAddWithOptions(request, headers, runtime);
    }

    public InvoiceAddResponse invoiceAddWithOptions(InvoiceAddRequest request, InvoiceAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankName)) {
            body.put("bank_name", request.bankName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankNo)) {
            body.put("bank_no", request.bankNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxNo)) {
            body.put("tax_no", request.taxNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            body.put("tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/add-invoice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceAddResponse());
    }

    public InvoiceDeleteResponse invoiceDelete(InvoiceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceDeleteHeaders headers = new InvoiceDeleteHeaders();
        return this.invoiceDeleteWithOptions(request, headers, runtime);
    }

    public InvoiceDeleteResponse invoiceDeleteWithOptions(InvoiceDeleteRequest request, InvoiceDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceDeleteResponse());
    }

    public InvoiceModifyResponse invoiceModify(InvoiceModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceModifyHeaders headers = new InvoiceModifyHeaders();
        return this.invoiceModifyWithOptions(request, headers, runtime);
    }

    public InvoiceModifyResponse invoiceModifyWithOptions(InvoiceModifyRequest request, InvoiceModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankName)) {
            body.put("bank_name", request.bankName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankNo)) {
            body.put("bank_no", request.bankNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxNo)) {
            body.put("tax_no", request.taxNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tel)) {
            body.put("tel", request.tel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceModifyResponse());
    }

    public InvoiceRuleSaveResponse invoiceRuleSave(InvoiceRuleSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleSaveHeaders headers = new InvoiceRuleSaveHeaders();
        return this.invoiceRuleSaveWithOptions(request, headers, runtime);
    }

    public InvoiceRuleSaveResponse invoiceRuleSaveWithOptions(InvoiceRuleSaveRequest tmpReq, InvoiceRuleSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleSaveShrinkRequest request = new InvoiceRuleSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allEmploye)) {
            body.put("all_employe", request.allEmploye);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            body.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleSaveResponse());
    }

    public InvoiceSearchResponse invoiceSearch(InvoiceSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceSearchHeaders headers = new InvoiceSearchHeaders();
        return this.invoiceSearchWithOptions(request, headers, runtime);
    }

    public InvoiceSearchResponse invoiceSearchWithOptions(InvoiceSearchRequest request, InvoiceSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceSearchResponse());
    }

    public IsvUserSaveResponse isvUserSave(IsvUserSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IsvUserSaveHeaders headers = new IsvUserSaveHeaders();
        return this.isvUserSaveWithOptions(request, headers, runtime);
    }

    public IsvUserSaveResponse isvUserSaveWithOptions(IsvUserSaveRequest tmpReq, IsvUserSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IsvUserSaveShrinkRequest request = new IsvUserSaveShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userList)) {
            request.userListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userList, "user_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userListShrink)) {
            body.put("user_list", request.userListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsvUserSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/isvuser/v1/isvuser"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvUserSaveResponse());
    }

    public MonthBillGetResponse monthBillGet(MonthBillGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MonthBillGetHeaders headers = new MonthBillGetHeaders();
        return this.monthBillGetWithOptions(request, headers, runtime);
    }

    public MonthBillGetResponse monthBillGetWithOptions(MonthBillGetRequest request, MonthBillGetHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billMonth)) {
            query.put("bill_month", request.billMonth);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MonthBillGet"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/open/v1/month-bill"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MonthBillGetResponse());
    }

    public ProjectAddResponse projectAdd(ProjectAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectAddHeaders headers = new ProjectAddHeaders();
        return this.projectAddWithOptions(request, headers, runtime);
    }

    public ProjectAddResponse projectAddWithOptions(ProjectAddRequest request, ProjectAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectAddResponse());
    }

    public ProjectDeleteResponse projectDelete(ProjectDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectDeleteHeaders headers = new ProjectDeleteHeaders();
        return this.projectDeleteWithOptions(request, headers, runtime);
    }

    public ProjectDeleteResponse projectDeleteWithOptions(ProjectDeleteRequest request, ProjectDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectDeleteResponse());
    }

    public ProjectModifyResponse projectModify(ProjectModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectModifyHeaders headers = new ProjectModifyHeaders();
        return this.projectModifyWithOptions(request, headers, runtime);
    }

    public ProjectModifyResponse projectModifyWithOptions(ProjectModifyRequest request, ProjectModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("project_name", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            body.put("third_part_id", request.thirdPartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProjectModify"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cost/v1/project"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProjectModifyResponse());
    }

    public TrainBillSettlementQueryResponse trainBillSettlementQuery(TrainBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainBillSettlementQueryHeaders headers = new TrainBillSettlementQueryHeaders();
        return this.trainBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public TrainBillSettlementQueryResponse trainBillSettlementQueryWithOptions(TrainBillSettlementQueryRequest request, TrainBillSettlementQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodEnd)) {
            query.put("period_end", request.periodEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodStart)) {
            query.put("period_start", request.periodStart);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainBillSettlementQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/bill-settlement"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainBillSettlementQueryResponse());
    }

    public TrainExceedApplyQueryResponse trainExceedApplyQuery(TrainExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainExceedApplyQueryHeaders headers = new TrainExceedApplyQueryHeaders();
        return this.trainExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public TrainExceedApplyQueryResponse trainExceedApplyQueryWithOptions(TrainExceedApplyQueryRequest request, TrainExceedApplyQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainExceedApplyQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/apply/v1/train-exceed"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainExceedApplyQueryResponse());
    }

    public TrainOrderListQueryResponse trainOrderListQuery(TrainOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderListQueryHeaders headers = new TrainOrderListQueryHeaders();
        return this.trainOrderListQueryWithOptions(request, headers, runtime);
    }

    public TrainOrderListQueryResponse trainOrderListQueryWithOptions(TrainOrderListQueryRequest request, TrainOrderListQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allApply)) {
            query.put("all_apply", request.allApply);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.departId)) {
            query.put("depart_id", request.departId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartApplyId)) {
            query.put("thirdpart_apply_id", request.thirdpartApplyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateEndTime)) {
            query.put("update_end_time", request.updateEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateStartTime)) {
            query.put("update_start_time", request.updateStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderListQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderListQueryResponse());
    }

    public TrainOrderQueryResponse trainOrderQuery(TrainOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderQueryHeaders headers = new TrainOrderQueryHeaders();
        return this.trainOrderQueryWithOptions(request, headers, runtime);
    }

    public TrainOrderQueryResponse trainOrderQueryWithOptions(TrainOrderQueryRequest request, TrainOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderQueryResponse());
    }

    public TrainStationSearchResponse trainStationSearch(TrainStationSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainStationSearchHeaders headers = new TrainStationSearchHeaders();
        return this.trainStationSearchWithOptions(request, headers, runtime);
    }

    public TrainStationSearchResponse trainStationSearchWithOptions(TrainStationSearchRequest request, TrainStationSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("keyword", request.keyword);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainStationSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/train"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainStationSearchResponse());
    }

    public UserQueryResponse userQuery(UserQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UserQueryHeaders headers = new UserQueryHeaders();
        return this.userQueryWithOptions(request, headers, runtime);
    }

    public UserQueryResponse userQueryWithOptions(UserQueryRequest request, UserQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modifiedTimeGreaterOrEqualThan)) {
            query.put("modified_time_greater_or_equal_than", request.modifiedTimeGreaterOrEqualThan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("page_token", request.pageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartJobNo)) {
            query.put("third_part_job_no", request.thirdPartJobNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripSoCorpToken)) {
            realHeaders.put("x-acs-btrip-so-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripSoCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/user"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserQueryResponse());
    }
}
