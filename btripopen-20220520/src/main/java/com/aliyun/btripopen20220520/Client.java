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

    public AccessTokenResponse accessToken(AccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.accessTokenWithOptions(request, headers, runtime);
    }

    public AddInvoiceEntityResponse addInvoiceEntityWithOptions(AddInvoiceEntityRequest tmpReq, AddInvoiceEntityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddInvoiceEntityShrinkRequest request = new AddInvoiceEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInvoiceEntity"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/entities"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInvoiceEntityResponse());
    }

    public AddInvoiceEntityResponse addInvoiceEntity(AddInvoiceEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddInvoiceEntityHeaders headers = new AddInvoiceEntityHeaders();
        return this.addInvoiceEntityWithOptions(request, headers, runtime);
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

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
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

    public AddressGetResponse addressGet(AddressGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddressGetHeaders headers = new AddressGetHeaders();
        return this.addressGetWithOptions(request, headers, runtime);
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

    public AirportSearchResponse airportSearch(AirportSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AirportSearchHeaders headers = new AirportSearchHeaders();
        return this.airportSearchWithOptions(request, headers, runtime);
    }

    public AllBaseCityInfoQueryResponse allBaseCityInfoQueryWithOptions(AllBaseCityInfoQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripAccessToken)) {
            realHeaders.put("x-acs-btrip-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripAccessToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllBaseCityInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/city/v1/code"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllBaseCityInfoQueryResponse());
    }

    public AllBaseCityInfoQueryResponse allBaseCityInfoQuery() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AllBaseCityInfoQueryHeaders headers = new AllBaseCityInfoQueryHeaders();
        return this.allBaseCityInfoQueryWithOptions(headers, runtime);
    }

    public ApplyAddResponse applyAddWithOptions(ApplyAddRequest tmpReq, ApplyAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyAddShrinkRequest request = new ApplyAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerStandard)) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerStandard, "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelShare)) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelShare, "hotel_share", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.extendField)) {
            body.put("extend_field", request.extendField);
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

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartDepartId)) {
            body.put("thirdpart_depart_id", request.thirdpartDepartId);
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

    public ApplyAddResponse applyAdd(ApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyAddHeaders headers = new ApplyAddHeaders();
        return this.applyAddWithOptions(request, headers, runtime);
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

    public ApplyApproveResponse applyApprove(ApplyApproveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyApproveHeaders headers = new ApplyApproveHeaders();
        return this.applyApproveWithOptions(request, headers, runtime);
    }

    public ApplyInvoiceTaskResponse applyInvoiceTaskWithOptions(ApplyInvoiceTaskRequest tmpReq, ApplyInvoiceTaskHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyInvoiceTaskShrinkRequest request = new ApplyInvoiceTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceTaskList)) {
            request.invoiceTaskListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceTaskList, "invoice_task_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            body.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceTaskListShrink)) {
            body.put("invoice_task_list", request.invoiceTaskListShrink);
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
            new TeaPair("action", "ApplyInvoiceTask"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/apply-invoice-task"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyInvoiceTaskResponse());
    }

    public ApplyInvoiceTaskResponse applyInvoiceTask(ApplyInvoiceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyInvoiceTaskHeaders headers = new ApplyInvoiceTaskHeaders();
        return this.applyInvoiceTaskWithOptions(request, headers, runtime);
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

    public ApplyListQueryResponse applyListQuery(ApplyListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyListQueryHeaders headers = new ApplyListQueryHeaders();
        return this.applyListQueryWithOptions(request, headers, runtime);
    }

    public ApplyModifyResponse applyModifyWithOptions(ApplyModifyRequest tmpReq, ApplyModifyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyModifyShrinkRequest request = new ApplyModifyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerList)) {
            request.externalTravelerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerList, "external_traveler_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalTravelerStandard)) {
            request.externalTravelerStandardShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalTravelerStandard, "external_traveler_standard", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelShare)) {
            request.hotelShareShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelShare, "hotel_share", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.extendField)) {
            body.put("extend_field", request.extendField);
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

        if (!com.aliyun.teautil.Common.isUnset(request.thirdpartDepartId)) {
            body.put("thirdpart_depart_id", request.thirdpartDepartId);
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

    public ApplyModifyResponse applyModify(ApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyModifyHeaders headers = new ApplyModifyHeaders();
        return this.applyModifyWithOptions(request, headers, runtime);
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

    public ApplyQueryResponse applyQuery(ApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ApplyQueryHeaders headers = new ApplyQueryHeaders();
        return this.applyQueryWithOptions(request, headers, runtime);
    }

    public BtripBillInfoAdjustResponse btripBillInfoAdjustWithOptions(BtripBillInfoAdjustRequest request, BtripBillInfoAdjustHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.primaryId)) {
            body.put("primary_id", request.primaryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartCostCenterId)) {
            body.put("third_part_cost_center_id", request.thirdPartCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartDepartmentId)) {
            body.put("third_part_department_id", request.thirdPartDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartInvoiceId)) {
            body.put("third_part_invoice_id", request.thirdPartInvoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartProjectId)) {
            body.put("third_part_project_id", request.thirdPartProjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BtripBillInfoAdjust"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bill/v1/info/action/adjust"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BtripBillInfoAdjustResponse());
    }

    public BtripBillInfoAdjustResponse btripBillInfoAdjust(BtripBillInfoAdjustRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BtripBillInfoAdjustHeaders headers = new BtripBillInfoAdjustHeaders();
        return this.btripBillInfoAdjustWithOptions(request, headers, runtime);
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

    public CarApplyAddResponse carApplyAdd(CarApplyAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyAddHeaders headers = new CarApplyAddHeaders();
        return this.carApplyAddWithOptions(request, headers, runtime);
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

    public CarApplyModifyResponse carApplyModify(CarApplyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyModifyHeaders headers = new CarApplyModifyHeaders();
        return this.carApplyModifyWithOptions(request, headers, runtime);
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

    public CarApplyQueryResponse carApplyQuery(CarApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarApplyQueryHeaders headers = new CarApplyQueryHeaders();
        return this.carApplyQueryWithOptions(request, headers, runtime);
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

    public CarBillSettlementQueryResponse carBillSettlementQuery(CarBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarBillSettlementQueryHeaders headers = new CarBillSettlementQueryHeaders();
        return this.carBillSettlementQueryWithOptions(request, headers, runtime);
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

    public CarOrderListQueryResponse carOrderListQuery(CarOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarOrderListQueryHeaders headers = new CarOrderListQueryHeaders();
        return this.carOrderListQueryWithOptions(request, headers, runtime);
    }

    public CarOrderQueryResponse carOrderQueryWithOptions(CarOrderQueryRequest request, CarOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subOrderId)) {
            query.put("sub_order_id", request.subOrderId);
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
            new TeaPair("action", "CarOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/car/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CarOrderQueryResponse());
    }

    public CarOrderQueryResponse carOrderQuery(CarOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CarOrderQueryHeaders headers = new CarOrderQueryHeaders();
        return this.carOrderQueryWithOptions(request, headers, runtime);
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

    public CitySearchResponse citySearch(CitySearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CitySearchHeaders headers = new CitySearchHeaders();
        return this.citySearchWithOptions(request, headers, runtime);
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

    public CommonApplyQueryResponse commonApplyQuery(CommonApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplyQueryHeaders headers = new CommonApplyQueryHeaders();
        return this.commonApplyQueryWithOptions(request, headers, runtime);
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

    public CommonApplySyncResponse commonApplySync(CommonApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CommonApplySyncHeaders headers = new CommonApplySyncHeaders();
        return this.commonApplySyncWithOptions(request, headers, runtime);
    }

    public CorpAuthLinkInfoQueryResponse corpAuthLinkInfoQueryWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CorpAuthLinkInfoQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/corp-authority-link/v1/info"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CorpAuthLinkInfoQueryResponse());
    }

    public CorpAuthLinkInfoQueryResponse corpAuthLinkInfoQuery() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.corpAuthLinkInfoQueryWithOptions(headers, runtime);
    }

    public CorpTokenResponse corpTokenWithOptions(CorpTokenRequest request, CorpTokenHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appSecret)) {
            query.put("app_secret", request.appSecret);
        }

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

    public CorpTokenResponse corpToken(CorpTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CorpTokenHeaders headers = new CorpTokenHeaders();
        return this.corpTokenWithOptions(request, headers, runtime);
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

    public CostCenterDeleteResponse costCenterDelete(CostCenterDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterDeleteHeaders headers = new CostCenterDeleteHeaders();
        return this.costCenterDeleteWithOptions(request, headers, runtime);
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

    public CostCenterModifyResponse costCenterModify(CostCenterModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterModifyHeaders headers = new CostCenterModifyHeaders();
        return this.costCenterModifyWithOptions(request, headers, runtime);
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

    public CostCenterQueryResponse costCenterQuery(CostCenterQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterQueryHeaders headers = new CostCenterQueryHeaders();
        return this.costCenterQueryWithOptions(request, headers, runtime);
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

    public CostCenterSaveResponse costCenterSave(CostCenterSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CostCenterSaveHeaders headers = new CostCenterSaveHeaders();
        return this.costCenterSaveWithOptions(request, headers, runtime);
    }

    public DeleteInvoiceEntityResponse deleteInvoiceEntityWithOptions(DeleteInvoiceEntityRequest tmpReq, DeleteInvoiceEntityHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteInvoiceEntityShrinkRequest request = new DeleteInvoiceEntityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            query.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInvoiceEntity"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/entities"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInvoiceEntityResponse());
    }

    public DeleteInvoiceEntityResponse deleteInvoiceEntity(DeleteInvoiceEntityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteInvoiceEntityHeaders headers = new DeleteInvoiceEntityHeaders();
        return this.deleteInvoiceEntityWithOptions(request, headers, runtime);
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

    public DepartmentSaveResponse departmentSave(DepartmentSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DepartmentSaveHeaders headers = new DepartmentSaveHeaders();
        return this.departmentSaveWithOptions(request, headers, runtime);
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

    public EntityAddResponse entityAdd(EntityAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityAddHeaders headers = new EntityAddHeaders();
        return this.entityAddWithOptions(request, headers, runtime);
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

    public EntityDeleteResponse entityDelete(EntityDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntityDeleteHeaders headers = new EntityDeleteHeaders();
        return this.entityDeleteWithOptions(request, headers, runtime);
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

    public EntitySetResponse entitySet(EntitySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EntitySetHeaders headers = new EntitySetHeaders();
        return this.entitySetWithOptions(request, headers, runtime);
    }

    public EstimatedPriceQueryResponse estimatedPriceQueryWithOptions(EstimatedPriceQueryRequest request, EstimatedPriceQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("end_time", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryId)) {
            query.put("itinerary_id", request.itineraryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("start_time", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
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
            new TeaPair("action", "EstimatedPriceQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/costcenter/v1/estimated-price"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EstimatedPriceQueryResponse());
    }

    public EstimatedPriceQueryResponse estimatedPriceQuery(EstimatedPriceQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EstimatedPriceQueryHeaders headers = new EstimatedPriceQueryHeaders();
        return this.estimatedPriceQueryWithOptions(request, headers, runtime);
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

    public ExceedApplySyncResponse exceedApplySync(ExceedApplySyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ExceedApplySyncHeaders headers = new ExceedApplySyncHeaders();
        return this.exceedApplySyncWithOptions(request, headers, runtime);
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

    public FlightBillSettlementQueryResponse flightBillSettlementQuery(FlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightBillSettlementQueryHeaders headers = new FlightBillSettlementQueryHeaders();
        return this.flightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public FlightCancelOrderResponse flightCancelOrderWithOptions(FlightCancelOrderRequest request, FlightCancelOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCancelOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCancelOrderResponse());
    }

    public FlightCancelOrderResponse flightCancelOrder(FlightCancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCancelOrderHeaders headers = new FlightCancelOrderHeaders();
        return this.flightCancelOrderWithOptions(request, headers, runtime);
    }

    public FlightCreateOrderResponse flightCreateOrderWithOptions(FlightCreateOrderRequest tmpReq, FlightCreateOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightCreateOrderShrinkRequest request = new FlightCreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contactInfo)) {
            request.contactInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contactInfo, "contact_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderAttr)) {
            request.orderAttrShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderAttr, "order_attr", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerInfoList)) {
            request.travelerInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerInfoList, "traveler_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrAirportCode)) {
            body.put("arr_airport_code", request.arrAirportCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            body.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("auto_pay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerName)) {
            body.put("buyer_name", request.buyerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buyerUniqueKey)) {
            body.put("buyer_unique_key", request.buyerUniqueKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactInfoShrink)) {
            body.put("contact_info", request.contactInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depAirportCode)) {
            body.put("dep_airport_code", request.depAirportCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            body.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            body.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderAttrShrink)) {
            body.put("order_attr", request.orderAttrShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParams)) {
            body.put("order_params", request.orderParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            body.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.price)) {
            body.put("price", request.price);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptAddress)) {
            body.put("receipt_address", request.receiptAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptTarget)) {
            body.put("receipt_target", request.receiptTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiptTitle)) {
            body.put("receipt_title", request.receiptTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerInfoListShrink)) {
            body.put("traveler_info_list", request.travelerInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            body.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightCreateOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightCreateOrderResponse());
    }

    public FlightCreateOrderResponse flightCreateOrder(FlightCreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightCreateOrderHeaders headers = new FlightCreateOrderHeaders();
        return this.flightCreateOrderWithOptions(request, headers, runtime);
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

    public FlightExceedApplyQueryResponse flightExceedApplyQuery(FlightExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightExceedApplyQueryHeaders headers = new FlightExceedApplyQueryHeaders();
        return this.flightExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public FlightItineraryScanQueryResponse flightItineraryScanQueryWithOptions(FlightItineraryScanQueryRequest request, FlightItineraryScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
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
            new TeaPair("action", "FlightItineraryScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/flight-itinerary"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightItineraryScanQueryResponse());
    }

    public FlightItineraryScanQueryResponse flightItineraryScanQuery(FlightItineraryScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightItineraryScanQueryHeaders headers = new FlightItineraryScanQueryHeaders();
        return this.flightItineraryScanQueryWithOptions(request, headers, runtime);
    }

    public FlightListingSearchResponse flightListingSearchWithOptions(FlightListingSearchRequest request, FlightListingSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightListingSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/flight/action/listing-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightListingSearchResponse());
    }

    public FlightListingSearchResponse flightListingSearch(FlightListingSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightListingSearchHeaders headers = new FlightListingSearchHeaders();
        return this.flightListingSearchWithOptions(request, headers, runtime);
    }

    public FlightOrderDetailInfoResponse flightOrderDetailInfoWithOptions(FlightOrderDetailInfoRequest request, FlightOrderDetailInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOrderDetailInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOrderDetailInfoResponse());
    }

    public FlightOrderDetailInfoResponse flightOrderDetailInfo(FlightOrderDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderDetailInfoHeaders headers = new FlightOrderDetailInfoHeaders();
        return this.flightOrderDetailInfoWithOptions(request, headers, runtime);
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

    public FlightOrderListQueryResponse flightOrderListQuery(FlightOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderListQueryHeaders headers = new FlightOrderListQueryHeaders();
        return this.flightOrderListQueryWithOptions(request, headers, runtime);
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

    public FlightOrderQueryResponse flightOrderQuery(FlightOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOrderQueryHeaders headers = new FlightOrderQueryHeaders();
        return this.flightOrderQueryWithOptions(request, headers, runtime);
    }

    public FlightOtaSearchResponse flightOtaSearchWithOptions(FlightOtaSearchRequest request, FlightOtaSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrierFlightNo)) {
            query.put("carrier_flight_no", request.carrierFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightNo)) {
            query.put("flight_no", request.flightNo);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightOtaSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/flight/action/ota-search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightOtaSearchResponse());
    }

    public FlightOtaSearchResponse flightOtaSearch(FlightOtaSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightOtaSearchHeaders headers = new FlightOtaSearchHeaders();
        return this.flightOtaSearchWithOptions(request, headers, runtime);
    }

    public FlightPayOrderResponse flightPayOrderWithOptions(FlightPayOrderRequest tmpReq, FlightPayOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightPayOrderShrinkRequest request = new FlightPayOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalPayPrice)) {
            body.put("personal_pay_price", request.personalPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPayPrice)) {
            body.put("total_pay_price", request.totalPayPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightPayOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/order/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightPayOrderResponse());
    }

    public FlightPayOrderResponse flightPayOrder(FlightPayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightPayOrderHeaders headers = new FlightPayOrderHeaders();
        return this.flightPayOrderWithOptions(request, headers, runtime);
    }

    public FlightRefundApplyResponse flightRefundApplyWithOptions(FlightRefundApplyRequest tmpReq, FlightRefundApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundApplyShrinkRequest request = new FlightRefundApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentInfoList)) {
            request.passengerSegmentInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentInfoList, "passenger_segment_info_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundVoucherInfo)) {
            request.refundVoucherInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundVoucherInfo, "refund_voucher_info", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpRefundPrice)) {
            body.put("corp_refund_price", request.corpRefundPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayRefundMoney)) {
            body.put("display_refund_money", request.displayRefundMoney);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            body.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemUnitIds)) {
            body.put("item_unit_ids", request.itemUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentInfoListShrink)) {
            body.put("passenger_segment_info_list", request.passengerSegmentInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalRefundPrice)) {
            body.put("personal_refund_price", request.personalRefundPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonDetail)) {
            body.put("reason_detail", request.reasonDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonType)) {
            body.put("reason_type", request.reasonType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundVoucherInfoShrink)) {
            body.put("refund_voucher_info", request.refundVoucherInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalRefundPrice)) {
            body.put("total_refund_price", request.totalRefundPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundApplyResponse());
    }

    public FlightRefundApplyResponse flightRefundApply(FlightRefundApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundApplyHeaders headers = new FlightRefundApplyHeaders();
        return this.flightRefundApplyWithOptions(request, headers, runtime);
    }

    public FlightRefundDetailResponse flightRefundDetailWithOptions(FlightRefundDetailRequest request, FlightRefundDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundDetailResponse());
    }

    public FlightRefundDetailResponse flightRefundDetail(FlightRefundDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundDetailHeaders headers = new FlightRefundDetailHeaders();
        return this.flightRefundDetailWithOptions(request, headers, runtime);
    }

    public FlightRefundPreCalResponse flightRefundPreCalWithOptions(FlightRefundPreCalRequest tmpReq, FlightRefundPreCalHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FlightRefundPreCalShrinkRequest request = new FlightRefundPreCalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerSegmentInfoList)) {
            request.passengerSegmentInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerSegmentInfoList, "passenger_segment_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerSegmentInfoListShrink)) {
            query.put("passenger_segment_info_list", request.passengerSegmentInfoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightRefundPreCal"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/refund/action/pre-cal"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightRefundPreCalResponse());
    }

    public FlightRefundPreCalResponse flightRefundPreCal(FlightRefundPreCalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightRefundPreCalHeaders headers = new FlightRefundPreCalHeaders();
        return this.flightRefundPreCalWithOptions(request, headers, runtime);
    }

    public FlightSearchListResponse flightSearchListWithOptions(FlightSearchListRequest request, FlightSearchListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.airlineCode)) {
            query.put("airline_code", request.airlineCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityCode)) {
            query.put("arr_city_code", request.arrCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrCityName)) {
            query.put("arr_city_name", request.arrCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arrDate)) {
            query.put("arr_date", request.arrDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            query.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityCode)) {
            query.put("dep_city_code", request.depCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCityName)) {
            query.put("dep_city_name", request.depCityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.flightNo)) {
            query.put("flight_no", request.flightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needMultiClassPrice)) {
            query.put("need_multi_class_price", request.needMultiClassPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferCityCode)) {
            query.put("transfer_city_code", request.transferCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferFlightNo)) {
            query.put("transfer_flight_no", request.transferFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferLeaveDate)) {
            query.put("transfer_leave_date", request.transferLeaveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tripType)) {
            query.put("trip_type", request.tripType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightSearchList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/huge/dtb-flight/v1/flight/action/search-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightSearchListResponse());
    }

    public FlightSearchListResponse flightSearchList(FlightSearchListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightSearchListHeaders headers = new FlightSearchListHeaders();
        return this.flightSearchListWithOptions(request, headers, runtime);
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

    public HotelBillSettlementQueryResponse hotelBillSettlementQuery(HotelBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelBillSettlementQueryHeaders headers = new HotelBillSettlementQueryHeaders();
        return this.hotelBillSettlementQueryWithOptions(request, headers, runtime);
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

    public HotelExceedApplyQueryResponse hotelExceedApplyQuery(HotelExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelExceedApplyQueryHeaders headers = new HotelExceedApplyQueryHeaders();
        return this.hotelExceedApplyQueryWithOptions(request, headers, runtime);
    }

    public HotelGoodsQueryResponse hotelGoodsQueryWithOptions(HotelGoodsQueryRequest request, HotelGoodsQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adultNum)) {
            query.put("adult_num", request.adultNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agreementPrice)) {
            query.put("agreement_price", request.agreementPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.beginDate)) {
            query.put("begin_date", request.beginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.breakfastIncluded)) {
            query.put("breakfast_included", request.breakfastIncluded);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("end_date", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelId)) {
            query.put("hotel_id", request.hotelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payOverType)) {
            query.put("pay_over_type", request.payOverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specialInvoice)) {
            query.put("special_invoice", request.specialInvoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superMan)) {
            query.put("super_man", request.superMan);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelGoodsQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/hotel-goods"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelGoodsQueryResponse());
    }

    public HotelGoodsQueryResponse hotelGoodsQuery(HotelGoodsQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelGoodsQueryHeaders headers = new HotelGoodsQueryHeaders();
        return this.hotelGoodsQueryWithOptions(request, headers, runtime);
    }

    public HotelIndexInfoResponse hotelIndexInfoWithOptions(HotelIndexInfoRequest request, HotelIndexInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelStatus)) {
            query.put("hotel_status", request.hotelStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageToken)) {
            query.put("page_token", request.pageToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelIndexInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/index-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelIndexInfoResponse());
    }

    public HotelIndexInfoResponse hotelIndexInfo(HotelIndexInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelIndexInfoHeaders headers = new HotelIndexInfoHeaders();
        return this.hotelIndexInfoWithOptions(request, headers, runtime);
    }

    public HotelOrderCancelResponse hotelOrderCancelWithOptions(HotelOrderCancelRequest request, HotelOrderCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderCancelResponse());
    }

    public HotelOrderCancelResponse hotelOrderCancel(HotelOrderCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderCancelHeaders headers = new HotelOrderCancelHeaders();
        return this.hotelOrderCancelWithOptions(request, headers, runtime);
    }

    public HotelOrderCreateResponse hotelOrderCreateWithOptions(HotelOrderCreateRequest tmpReq, HotelOrderCreateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelOrderCreateShrinkRequest request = new HotelOrderCreateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceInfo)) {
            request.invoiceInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceInfo, "invoice_info", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.occupantInfoList)) {
            request.occupantInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.occupantInfoList, "occupant_info_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.promotionInfo)) {
            request.promotionInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.promotionInfo, "promotion_info", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIn)) {
            body.put("check_in", request.checkIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOut)) {
            body.put("check_out", request.checkOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractEmail)) {
            body.put("contract_email", request.contractEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractName)) {
            body.put("contract_name", request.contractName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractPhone)) {
            body.put("contract_phone", request.contractPhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceInfoShrink)) {
            body.put("invoice_info", request.invoiceInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("item_id", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itineraryNo)) {
            body.put("itinerary_no", request.itineraryNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occupantInfoListShrink)) {
            body.put("occupant_info_list", request.occupantInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personPayPrice)) {
            body.put("person_pay_price", request.personPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionInfoShrink)) {
            body.put("promotion_info", request.promotionInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratePlanId)) {
            body.put("rate_plan_id", request.ratePlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            body.put("room_id", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            body.put("room_num", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("seller_id", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shid)) {
            body.put("shid", request.shid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalOrderPrice)) {
            body.put("total_order_price", request.totalOrderPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validateResKey)) {
            body.put("validate_res_key", request.validateResKey);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderCreate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderCreateResponse());
    }

    public HotelOrderCreateResponse hotelOrderCreate(HotelOrderCreateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderCreateHeaders headers = new HotelOrderCreateHeaders();
        return this.hotelOrderCreateWithOptions(request, headers, runtime);
    }

    public HotelOrderDetailInfoResponse hotelOrderDetailInfoWithOptions(HotelOrderDetailInfoRequest request, HotelOrderDetailInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderDetailInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderDetailInfoResponse());
    }

    public HotelOrderDetailInfoResponse hotelOrderDetailInfo(HotelOrderDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderDetailInfoHeaders headers = new HotelOrderDetailInfoHeaders();
        return this.hotelOrderDetailInfoWithOptions(request, headers, runtime);
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

    public HotelOrderListQueryResponse hotelOrderListQuery(HotelOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderListQueryHeaders headers = new HotelOrderListQueryHeaders();
        return this.hotelOrderListQueryWithOptions(request, headers, runtime);
    }

    public HotelOrderPayResponse hotelOrderPayWithOptions(HotelOrderPayRequest request, HotelOrderPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            body.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.companyPayFee)) {
            body.put("company_pay_fee", request.companyPayFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personPayFee)) {
            body.put("person_pay_fee", request.personPayFee);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPayAccount)) {
            body.put("third_pay_account", request.thirdPayAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdTradeNo)) {
            body.put("third_trade_no", request.thirdTradeNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPrice)) {
            body.put("total_price", request.totalPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/pay"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderPayResponse());
    }

    public HotelOrderPayResponse hotelOrderPay(HotelOrderPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderPayHeaders headers = new HotelOrderPayHeaders();
        return this.hotelOrderPayWithOptions(request, headers, runtime);
    }

    public HotelOrderPreValidateResponse hotelOrderPreValidateWithOptions(HotelOrderPreValidateRequest tmpReq, HotelOrderPreValidateHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelOrderPreValidateShrinkRequest request = new HotelOrderPreValidateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dailyList)) {
            request.dailyListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dailyList, "daily_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.occupantInfoList)) {
            request.occupantInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.occupantInfoList, "occupant_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkIn)) {
            query.put("check_in", request.checkIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOut)) {
            query.put("check_out", request.checkOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dailyListShrink)) {
            query.put("daily_list", request.dailyListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("item_id", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.numberOfAdultsPerRoom)) {
            query.put("number_of_adults_per_room", request.numberOfAdultsPerRoom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.occupantInfoListShrink)) {
            query.put("occupant_info_list", request.occupantInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ratePlanId)) {
            query.put("rate_plan_id", request.ratePlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomId)) {
            query.put("room_id", request.roomId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomNum)) {
            query.put("room_num", request.roomNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRoomPrice)) {
            query.put("search_room_price", request.searchRoomPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            query.put("seller_id", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shid)) {
            query.put("shid", request.shid);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelOrderPreValidate"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/orders/action/pre-validate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderPreValidateResponse());
    }

    public HotelOrderPreValidateResponse hotelOrderPreValidate(HotelOrderPreValidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderPreValidateHeaders headers = new HotelOrderPreValidateHeaders();
        return this.hotelOrderPreValidateWithOptions(request, headers, runtime);
    }

    public HotelOrderQueryResponse hotelOrderQueryWithOptions(HotelOrderQueryRequest request, HotelOrderQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("order_id", request.orderId);
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
            new TeaPair("action", "HotelOrderQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/hotel/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelOrderQueryResponse());
    }

    public HotelOrderQueryResponse hotelOrderQuery(HotelOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelOrderQueryHeaders headers = new HotelOrderQueryHeaders();
        return this.hotelOrderQueryWithOptions(request, headers, runtime);
    }

    public HotelRoomInfoResponse hotelRoomInfoWithOptions(HotelRoomInfoRequest tmpReq, HotelRoomInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelRoomInfoShrinkRequest request = new HotelRoomInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roomIds)) {
            request.roomIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roomIds, "room_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roomIdsShrink)) {
            query.put("room_ids", request.roomIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelRoomInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/room-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelRoomInfoResponse());
    }

    public HotelRoomInfoResponse hotelRoomInfo(HotelRoomInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelRoomInfoHeaders headers = new HotelRoomInfoHeaders();
        return this.hotelRoomInfoWithOptions(request, headers, runtime);
    }

    public HotelSearchResponse hotelSearchWithOptions(HotelSearchRequest tmpReq, HotelSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelSearchShrinkRequest request = new HotelSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.brandCode)) {
            request.brandCodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.brandCode, "brand_code", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.shids)) {
            request.shidsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.shids, "shids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adultNum)) {
            query.put("adult_num", request.adultNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandCodeShrink)) {
            query.put("brand_code", request.brandCodeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.btripUserId)) {
            query.put("btrip_user_id", request.btripUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDate)) {
            query.put("check_in_date", request.checkInDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutDate)) {
            query.put("check_out_date", request.checkOutDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            query.put("city_code", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dir)) {
            query.put("dir", request.dir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distance)) {
            query.put("distance", request.distance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtCode)) {
            query.put("district_code", request.districtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hotelStar)) {
            query.put("hotel_star", request.hotelStar);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isProtocol)) {
            query.put("is_protocol", request.isProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyWords)) {
            query.put("key_words", request.keyWords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrice)) {
            query.put("max_price", request.maxPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPrice)) {
            query.put("min_price", request.minPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payOverType)) {
            query.put("pay_over_type", request.payOverType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("payment_type", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.shidsShrink)) {
            query.put("shids", request.shidsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCode)) {
            query.put("sort_code", request.sortCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.superMan)) {
            query.put("super_man", request.superMan);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelSearch"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/hotels/action/search"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelSearchResponse());
    }

    public HotelSearchResponse hotelSearch(HotelSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelSearchHeaders headers = new HotelSearchHeaders();
        return this.hotelSearchWithOptions(request, headers, runtime);
    }

    public HotelStaticInfoResponse hotelStaticInfoWithOptions(HotelStaticInfoRequest tmpReq, HotelStaticInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        HotelStaticInfoShrinkRequest request = new HotelStaticInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hotelIds)) {
            request.hotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hotelIds, "hotel_ids", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hotelIdsShrink)) {
            query.put("hotel_ids", request.hotelIdsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HotelStaticInfo"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-hotel/v1/static-infos"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HotelStaticInfoResponse());
    }

    public HotelStaticInfoResponse hotelStaticInfo(HotelStaticInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        HotelStaticInfoHeaders headers = new HotelStaticInfoHeaders();
        return this.hotelStaticInfoWithOptions(request, headers, runtime);
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

    public IeFlightBillSettlementQueryResponse ieFlightBillSettlementQuery(IeFlightBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IeFlightBillSettlementQueryHeaders headers = new IeFlightBillSettlementQueryHeaders();
        return this.ieFlightBillSettlementQueryWithOptions(request, headers, runtime);
    }

    public InsInvoiceScanQueryResponse insInvoiceScanQueryWithOptions(InsInvoiceScanQueryRequest request, InsInvoiceScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
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
            new TeaPair("action", "InsInvoiceScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/ins-invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InsInvoiceScanQueryResponse());
    }

    public InsInvoiceScanQueryResponse insInvoiceScanQuery(InsInvoiceScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InsInvoiceScanQueryHeaders headers = new InsInvoiceScanQueryHeaders();
        return this.insInvoiceScanQueryWithOptions(request, headers, runtime);
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

    public InvoiceAddResponse invoiceAdd(InvoiceAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceAddHeaders headers = new InvoiceAddHeaders();
        return this.invoiceAddWithOptions(request, headers, runtime);
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

    public InvoiceDeleteResponse invoiceDelete(InvoiceDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceDeleteHeaders headers = new InvoiceDeleteHeaders();
        return this.invoiceDeleteWithOptions(request, headers, runtime);
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

    public InvoiceModifyResponse invoiceModify(InvoiceModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceModifyHeaders headers = new InvoiceModifyHeaders();
        return this.invoiceModifyWithOptions(request, headers, runtime);
    }

    public InvoiceRuleAddResponse invoiceRuleAddWithOptions(InvoiceRuleAddRequest tmpReq, InvoiceRuleAddHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleAddShrinkRequest request = new InvoiceRuleAddShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleAdd"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleAddResponse());
    }

    public InvoiceRuleAddResponse invoiceRuleAdd(InvoiceRuleAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleAddHeaders headers = new InvoiceRuleAddHeaders();
        return this.invoiceRuleAddWithOptions(request, headers, runtime);
    }

    public InvoiceRuleDeleteResponse invoiceRuleDeleteWithOptions(InvoiceRuleDeleteRequest tmpReq, InvoiceRuleDeleteHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InvoiceRuleDeleteShrinkRequest request = new InvoiceRuleDeleteShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.entities)) {
            request.entitiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.entities, "entities", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delAll)) {
            query.put("del_all", request.delAll);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entitiesShrink)) {
            query.put("entities", request.entitiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdPartId)) {
            query.put("third_part_id", request.thirdPartId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvoiceRuleDelete"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/invoice-rule"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvoiceRuleDeleteResponse());
    }

    public InvoiceRuleDeleteResponse invoiceRuleDelete(InvoiceRuleDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleDeleteHeaders headers = new InvoiceRuleDeleteHeaders();
        return this.invoiceRuleDeleteWithOptions(request, headers, runtime);
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

    public InvoiceRuleSaveResponse invoiceRuleSave(InvoiceRuleSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceRuleSaveHeaders headers = new InvoiceRuleSaveHeaders();
        return this.invoiceRuleSaveWithOptions(request, headers, runtime);
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

    public InvoiceSearchResponse invoiceSearch(InvoiceSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        InvoiceSearchHeaders headers = new InvoiceSearchHeaders();
        return this.invoiceSearchWithOptions(request, headers, runtime);
    }

    public IsvRuleSaveResponse isvRuleSaveWithOptions(IsvRuleSaveRequest request, IsvRuleSaveHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bookType)) {
            body.put("book_type", request.bookType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
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
            new TeaPair("action", "IsvRuleSave"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/rule"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsvRuleSaveResponse());
    }

    public IsvRuleSaveResponse isvRuleSave(IsvRuleSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IsvRuleSaveHeaders headers = new IsvRuleSaveHeaders();
        return this.isvRuleSaveWithOptions(request, headers, runtime);
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

    public IsvUserSaveResponse isvUserSave(IsvUserSaveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        IsvUserSaveHeaders headers = new IsvUserSaveHeaders();
        return this.isvUserSaveWithOptions(request, headers, runtime);
    }

    public MonthBillConfirmResponse monthBillConfirmWithOptions(MonthBillConfirmRequest request, MonthBillConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mailBillDate)) {
            body.put("mail_bill_date", request.mailBillDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MonthBillConfirm"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/bill/v1/status/action/confirm"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MonthBillConfirmResponse());
    }

    public MonthBillConfirmResponse monthBillConfirm(MonthBillConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MonthBillConfirmHeaders headers = new MonthBillConfirmHeaders();
        return this.monthBillConfirmWithOptions(request, headers, runtime);
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

    public MonthBillGetResponse monthBillGet(MonthBillGetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        MonthBillGetHeaders headers = new MonthBillGetHeaders();
        return this.monthBillGetWithOptions(request, headers, runtime);
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

    public ProjectAddResponse projectAdd(ProjectAddRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectAddHeaders headers = new ProjectAddHeaders();
        return this.projectAddWithOptions(request, headers, runtime);
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

    public ProjectDeleteResponse projectDelete(ProjectDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectDeleteHeaders headers = new ProjectDeleteHeaders();
        return this.projectDeleteWithOptions(request, headers, runtime);
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

    public ProjectModifyResponse projectModify(ProjectModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ProjectModifyHeaders headers = new ProjectModifyHeaders();
        return this.projectModifyWithOptions(request, headers, runtime);
    }

    public QueryReimbursementOrderResponse queryReimbursementOrderWithOptions(QueryReimbursementOrderRequest request, QueryReimbursementOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reimbOrderNo)) {
            query.put("reimb_order_no", request.reimbOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subCorpId)) {
            query.put("sub_corp_id", request.subCorpId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReimbursementOrder"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/reimbursement/v1/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReimbursementOrderResponse());
    }

    public QueryReimbursementOrderResponse queryReimbursementOrder(QueryReimbursementOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        QueryReimbursementOrderHeaders headers = new QueryReimbursementOrderHeaders();
        return this.queryReimbursementOrderWithOptions(request, headers, runtime);
    }

    public SyncSingleUserResponse syncSingleUserWithOptions(SyncSingleUserRequest tmpReq, SyncSingleUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SyncSingleUserShrinkRequest request = new SyncSingleUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.thirdDepartIdList)) {
            request.thirdDepartIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.thirdDepartIdList, "third_depart_id_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNo)) {
            body.put("job_no", request.jobNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.leaveStatus)) {
            body.put("leave_status", request.leaveStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerUserId)) {
            body.put("manager_user_id", request.managerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.position)) {
            body.put("position", request.position);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.positionLevel)) {
            body.put("position_level", request.positionLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realNameEn)) {
            body.put("real_name_en", request.realNameEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdDepartIdListShrink)) {
            body.put("third_depart_id_list", request.thirdDepartIdListShrink);
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
            new TeaPair("action", "SyncSingleUser"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/single-user/action/sync"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncSingleUserResponse());
    }

    public SyncSingleUserResponse syncSingleUser(SyncSingleUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncSingleUserHeaders headers = new SyncSingleUserHeaders();
        return this.syncSingleUserWithOptions(request, headers, runtime);
    }

    public SyncThirdUserMappingResponse syncThirdUserMappingWithOptions(SyncThirdUserMappingRequest request, SyncThirdUserMappingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdChannelType)) {
            body.put("third_channel_type", request.thirdChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thirdUserId)) {
            body.put("third_user_id", request.thirdUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("user_id", request.userId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncThirdUserMapping"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/user/v1/third-users/action/mapping"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncThirdUserMappingResponse());
    }

    public SyncThirdUserMappingResponse syncThirdUserMapping(SyncThirdUserMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SyncThirdUserMappingHeaders headers = new SyncThirdUserMappingHeaders();
        return this.syncThirdUserMappingWithOptions(request, headers, runtime);
    }

    public TicketChangingApplyResponse ticketChangingApplyWithOptions(TicketChangingApplyRequest tmpReq, TicketChangingApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingApplyShrinkRequest request = new TicketChangingApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modifyFlightInfoList)) {
            request.modifyFlightInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modifyFlightInfoList, "modify_flight_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            body.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyFlightInfoListShrink)) {
            body.put("modify_flight_info_list", request.modifyFlightInfoListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaItemId)) {
            body.put("ota_item_id", request.otaItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("session_id", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whetherRetry)) {
            body.put("whether_retry", request.whetherRetry);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingApply"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingApplyResponse());
    }

    public TicketChangingApplyResponse ticketChangingApply(TicketChangingApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingApplyHeaders headers = new TicketChangingApplyHeaders();
        return this.ticketChangingApplyWithOptions(request, headers, runtime);
    }

    public TicketChangingCancelResponse ticketChangingCancelWithOptions(TicketChangingCancelRequest request, TicketChangingCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingCancel"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/cancel"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingCancelResponse());
    }

    public TicketChangingCancelResponse ticketChangingCancel(TicketChangingCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingCancelHeaders headers = new TicketChangingCancelHeaders();
        return this.ticketChangingCancelWithOptions(request, headers, runtime);
    }

    public TicketChangingDetailResponse ticketChangingDetailWithOptions(TicketChangingDetailRequest request, TicketChangingDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            query.put("dis_sub_order_id", request.disSubOrderId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingDetail"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingDetailResponse());
    }

    public TicketChangingDetailResponse ticketChangingDetail(TicketChangingDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingDetailHeaders headers = new TicketChangingDetailHeaders();
        return this.ticketChangingDetailWithOptions(request, headers, runtime);
    }

    public TicketChangingEnquiryResponse ticketChangingEnquiryWithOptions(TicketChangingEnquiryRequest request, TicketChangingEnquiryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyDepartDate)) {
            query.put("modify_depart_date", request.modifyDepartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyFlightNo)) {
            query.put("modify_flight_no", request.modifyFlightNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            query.put("session_id", request.sessionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingEnquiry"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/enquiry"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingEnquiryResponse());
    }

    public TicketChangingEnquiryResponse ticketChangingEnquiry(TicketChangingEnquiryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingEnquiryHeaders headers = new TicketChangingEnquiryHeaders();
        return this.ticketChangingEnquiryWithOptions(request, headers, runtime);
    }

    public TicketChangingFlightListResponse ticketChangingFlightListWithOptions(TicketChangingFlightListRequest tmpReq, TicketChangingFlightListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingFlightListShrinkRequest request = new TicketChangingFlightListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.travelerInfoList)) {
            request.travelerInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.travelerInfoList, "traveler_info_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrCity)) {
            query.put("arr_city", request.arrCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depCity)) {
            query.put("dep_city", request.depCity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.depDate)) {
            query.put("dep_date", request.depDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            query.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isVoluntary)) {
            query.put("is_voluntary", request.isVoluntary);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.travelerInfoListShrink)) {
            query.put("traveler_info_list", request.travelerInfoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingFlightList"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/huge/dtb-flight/v1/ticket-changing-flight/action/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingFlightListResponse());
    }

    public TicketChangingFlightListResponse ticketChangingFlightList(TicketChangingFlightListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingFlightListHeaders headers = new TicketChangingFlightListHeaders();
        return this.ticketChangingFlightListWithOptions(request, headers, runtime);
    }

    public TicketChangingPayResponse ticketChangingPayWithOptions(TicketChangingPayRequest tmpReq, TicketChangingPayHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TicketChangingPayShrinkRequest request = new TicketChangingPayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extra)) {
            request.extraShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extra, "extra", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.corpPayPrice)) {
            body.put("corp_pay_price", request.corpPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disOrderId)) {
            body.put("dis_order_id", request.disOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disSubOrderId)) {
            body.put("dis_sub_order_id", request.disSubOrderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extraShrink)) {
            body.put("extra", request.extraShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.personalPayPrice)) {
            body.put("personal_pay_price", request.personalPayPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalPayPrice)) {
            body.put("total_pay_price", request.totalPayPrice);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketChangingPay"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/dtb-flight/v1/ticket-changing/action/pay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketChangingPayResponse());
    }

    public TicketChangingPayResponse ticketChangingPay(TicketChangingPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketChangingPayHeaders headers = new TicketChangingPayHeaders();
        return this.ticketChangingPayWithOptions(request, headers, runtime);
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

    public TrainBillSettlementQueryResponse trainBillSettlementQuery(TrainBillSettlementQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainBillSettlementQueryHeaders headers = new TrainBillSettlementQueryHeaders();
        return this.trainBillSettlementQueryWithOptions(request, headers, runtime);
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

    public TrainExceedApplyQueryResponse trainExceedApplyQuery(TrainExceedApplyQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainExceedApplyQueryHeaders headers = new TrainExceedApplyQueryHeaders();
        return this.trainExceedApplyQueryWithOptions(request, headers, runtime);
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

    public TrainOrderListQueryResponse trainOrderListQuery(TrainOrderListQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderListQueryHeaders headers = new TrainOrderListQueryHeaders();
        return this.trainOrderListQueryWithOptions(request, headers, runtime);
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

    public TrainOrderQueryResponse trainOrderQuery(TrainOrderQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderQueryHeaders headers = new TrainOrderQueryHeaders();
        return this.trainOrderQueryWithOptions(request, headers, runtime);
    }

    public TrainOrderQueryV2Response trainOrderQueryV2WithOptions(TrainOrderQueryV2Request request, TrainOrderQueryV2Headers headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsBtripCorpToken)) {
            realHeaders.put("x-acs-btrip-corp-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsBtripCorpToken));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TrainOrderQueryV2"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/train/v2/order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainOrderQueryV2Response());
    }

    public TrainOrderQueryV2Response trainOrderQueryV2(TrainOrderQueryV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainOrderQueryV2Headers headers = new TrainOrderQueryV2Headers();
        return this.trainOrderQueryV2WithOptions(request, headers, runtime);
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

    public TrainStationSearchResponse trainStationSearch(TrainStationSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainStationSearchHeaders headers = new TrainStationSearchHeaders();
        return this.trainStationSearchWithOptions(request, headers, runtime);
    }

    public TrainTicketScanQueryResponse trainTicketScanQueryWithOptions(TrainTicketScanQueryRequest request, TrainTicketScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
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
            new TeaPair("action", "TrainTicketScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/train-ticket"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TrainTicketScanQueryResponse());
    }

    public TrainTicketScanQueryResponse trainTicketScanQuery(TrainTicketScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TrainTicketScanQueryHeaders headers = new TrainTicketScanQueryHeaders();
        return this.trainTicketScanQueryWithOptions(request, headers, runtime);
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

    public UserQueryResponse userQuery(UserQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UserQueryHeaders headers = new UserQueryHeaders();
        return this.userQueryWithOptions(request, headers, runtime);
    }

    public VatInvoiceScanQueryResponse vatInvoiceScanQueryWithOptions(VatInvoiceScanQueryRequest request, VatInvoiceScanQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billId)) {
            query.put("bill_id", request.billId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceSubTaskId)) {
            query.put("invoice_sub_task_id", request.invoiceSubTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("page_no", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
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
            new TeaPair("action", "VatInvoiceScanQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/scan/v1/vat-invoice"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VatInvoiceScanQueryResponse());
    }

    public VatInvoiceScanQueryResponse vatInvoiceScanQuery(VatInvoiceScanQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        VatInvoiceScanQueryHeaders headers = new VatInvoiceScanQueryHeaders();
        return this.vatInvoiceScanQueryWithOptions(request, headers, runtime);
    }

    public WaitApplyInvoiceTaskDetailQueryResponse waitApplyInvoiceTaskDetailQueryWithOptions(WaitApplyInvoiceTaskDetailQueryRequest request, WaitApplyInvoiceTaskDetailQueryHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billDate)) {
            query.put("bill_date", request.billDate);
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
            new TeaPair("action", "WaitApplyInvoiceTaskDetailQuery"),
            new TeaPair("version", "2022-05-20"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/invoice/v1/wait-apply-task"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WaitApplyInvoiceTaskDetailQueryResponse());
    }

    public WaitApplyInvoiceTaskDetailQueryResponse waitApplyInvoiceTaskDetailQuery(WaitApplyInvoiceTaskDetailQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        WaitApplyInvoiceTaskDetailQueryHeaders headers = new WaitApplyInvoiceTaskDetailQueryHeaders();
        return this.waitApplyInvoiceTaskDetailQueryWithOptions(request, headers, runtime);
    }
}
