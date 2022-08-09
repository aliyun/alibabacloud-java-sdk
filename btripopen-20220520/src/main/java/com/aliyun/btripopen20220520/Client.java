// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520;

import com.aliyun.tea.*;
import com.aliyun.btripopen20220520.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.accessTokenWithOptions(request, headers, runtime);
    }

    public AccessTokenResponse accessTokenWithOptions(AccessTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appKey)) {
            query.put("app_key", request.appKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccessToken"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/btrip-open-auth/v1/access-token/action/take"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccessTokenResponse());
    }

    public AddressGetResponse addressGet(AddressGetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.addressGetWithOptions(request, headers, runtime);
    }

    public AddressGetResponse addressGetWithOptions(AddressGetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ApplyAddResponse applyAdd(ApplyAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyAddWithOptions(request, headers, runtime);
    }

    public ApplyAddResponse applyAddWithOptions(ApplyAddRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ApplyListQueryResponse applyListQuery(ApplyListQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyListQueryWithOptions(request, headers, runtime);
    }

    public ApplyListQueryResponse applyListQueryWithOptions(ApplyListQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyModifyWithOptions(request, headers, runtime);
    }

    public ApplyModifyResponse applyModifyWithOptions(ApplyModifyRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyQueryWithOptions(request, headers, runtime);
    }

    public ApplyQueryResponse applyQueryWithOptions(ApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.carApplyAddWithOptions(request, headers, runtime);
    }

    public CarApplyAddResponse carApplyAddWithOptions(CarApplyAddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.carApplyModifyWithOptions(request, headers, runtime);
    }

    public CarApplyModifyResponse carApplyModifyWithOptions(CarApplyModifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corp_id", request.corpId);
        }

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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.carApplyQueryWithOptions(request, headers, runtime);
    }

    public CarApplyQueryResponse carApplyQueryWithOptions(CarApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.carBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public CarBillSettlementQueryResponse carBillSettlementQueryWithOptions(CarBillSettlementQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.carOrderListQueryWithOptions(request, headers, runtime);
    }

    public CarOrderListQueryResponse carOrderListQueryWithOptions(CarOrderListQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CommonApplyQueryResponse commonApplyQuery(CommonApplyQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commonApplyQueryWithOptions(request, headers, runtime);
    }

    public CommonApplyQueryResponse commonApplyQueryWithOptions(CommonApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.commonApplySyncWithOptions(request, headers, runtime);
    }

    public CommonApplySyncResponse commonApplySyncWithOptions(CommonApplySyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.corpTokenWithOptions(request, headers, runtime);
    }

    public CorpTokenResponse corpTokenWithOptions(CorpTokenRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.costCenterDeleteWithOptions(request, headers, runtime);
    }

    public CostCenterDeleteResponse costCenterDeleteWithOptions(CostCenterDeleteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            query.put("thirdpart_id", request.thirdpartId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.costCenterModifyWithOptions(request, headers, runtime);
    }

    public CostCenterModifyResponse costCenterModifyWithOptions(CostCenterModifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.costCenterQueryWithOptions(request, headers, runtime);
    }

    public CostCenterQueryResponse costCenterQueryWithOptions(CostCenterQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.needOrgEntity)) {
            body.put("need_org_entity", request.needOrgEntity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartId)) {
            body.put("thirdpart_id", request.thirdpartId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CostCenterQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/costcenter"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CostCenterQueryResponse());
    }

    public CostCenterSaveResponse costCenterSave(CostCenterSaveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.costCenterSaveWithOptions(request, headers, runtime);
    }

    public CostCenterSaveResponse costCenterSaveWithOptions(CostCenterSaveRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayNo)) {
            body.put("alipay_no", request.alipayNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corp_id", request.corpId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.departmentSaveWithOptions(request, headers, runtime);
    }

    public DepartmentSaveResponse departmentSaveWithOptions(DepartmentSaveRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.entityAddWithOptions(request, headers, runtime);
    }

    public EntityAddResponse entityAddWithOptions(EntityAddRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.entityDeleteWithOptions(request, headers, runtime);
    }

    public EntityDeleteResponse entityDeleteWithOptions(EntityDeleteRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.entitySetWithOptions(request, headers, runtime);
    }

    public EntitySetResponse entitySetWithOptions(EntitySetRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exceedApplySyncWithOptions(request, headers, runtime);
    }

    public ExceedApplySyncResponse exceedApplySyncWithOptions(ExceedApplySyncRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizCategory)) {
            query.put("biz_category", request.bizCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.flightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public FlightBillSettlementQueryResponse flightBillSettlementQueryWithOptions(FlightBillSettlementQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.flightExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public FlightExceedApplyQueryResponse flightExceedApplyQueryWithOptions(FlightExceedApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.flightOrderListQueryWithOptions(request, headers, runtime);
    }

    public FlightOrderListQueryResponse flightOrderListQueryWithOptions(FlightOrderListQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.flightOrderQueryWithOptions(request, headers, runtime);
    }

    public FlightOrderQueryResponse flightOrderQueryWithOptions(FlightOrderQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.hotelBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public HotelBillSettlementQueryResponse hotelBillSettlementQueryWithOptions(HotelBillSettlementQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.hotelExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public HotelExceedApplyQueryResponse hotelExceedApplyQueryWithOptions(HotelExceedApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.hotelOrderListQueryWithOptions(request, headers, runtime);
    }

    public HotelOrderListQueryResponse hotelOrderListQueryWithOptions(HotelOrderListQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public InvoiceAddResponse invoiceAdd(InvoiceAddRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invoiceAddWithOptions(request, headers, runtime);
    }

    public InvoiceAddResponse invoiceAddWithOptions(InvoiceAddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invoiceDeleteWithOptions(request, headers, runtime);
    }

    public InvoiceDeleteResponse invoiceDeleteWithOptions(InvoiceDeleteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invoiceModifyWithOptions(request, headers, runtime);
    }

    public InvoiceModifyResponse invoiceModifyWithOptions(InvoiceModifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invoiceRuleSaveWithOptions(request, headers, runtime);
    }

    public InvoiceRuleSaveResponse invoiceRuleSaveWithOptions(InvoiceRuleSaveRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.invoiceSearchWithOptions(request, headers, runtime);
    }

    public InvoiceSearchResponse invoiceSearchWithOptions(InvoiceSearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.isvUserSaveWithOptions(request, headers, runtime);
    }

    public IsvUserSaveResponse isvUserSaveWithOptions(IsvUserSaveRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.monthBillGetWithOptions(request, headers, runtime);
    }

    public MonthBillGetResponse monthBillGetWithOptions(MonthBillGetRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billMonth)) {
            query.put("bill_month", request.billMonth);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.projectAddWithOptions(request, headers, runtime);
    }

    public ProjectAddResponse projectAddWithOptions(ProjectAddRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corp_id", request.corpId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.projectDeleteWithOptions(request, headers, runtime);
    }

    public ProjectDeleteResponse projectDeleteWithOptions(ProjectDeleteRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.projectModifyWithOptions(request, headers, runtime);
    }

    public ProjectModifyResponse projectModifyWithOptions(ProjectModifyRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            body.put("corp_id", request.corpId);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public TrainBillSettlementQueryResponse trainBillSettlementQueryWithOptions(TrainBillSettlementQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public TrainExceedApplyQueryResponse trainExceedApplyQueryWithOptions(TrainExceedApplyQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applyId)) {
            query.put("apply_id", request.applyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpId)) {
            query.put("corp_id", request.corpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainOrderListQueryWithOptions(request, headers, runtime);
    }

    public TrainOrderListQueryResponse trainOrderListQueryWithOptions(TrainOrderListQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.trainOrderQueryWithOptions(request, headers, runtime);
    }

    public TrainOrderQueryResponse trainOrderQueryWithOptions(TrainOrderQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("user_id", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UserQueryResponse userQuery(UserQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.userQueryWithOptions(request, headers, runtime);
    }

    public UserQueryResponse userQueryWithOptions(UserQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modifiedTimeGreaterOrEqualThan)) {
            query.put("modified_time_greater_or_equal_than", request.modifiedTimeGreaterOrEqualThan);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCorpId)) {
            query.put("third_part_corp_id", request.thirdPartCorpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartJobNo)) {
            query.put("third_part_job_no", request.thirdPartJobNo);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
