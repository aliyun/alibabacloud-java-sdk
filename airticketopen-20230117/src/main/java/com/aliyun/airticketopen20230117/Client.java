// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117;

import com.aliyun.tea.*;
import com.aliyun.airticketopen20230117.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("airticketopen", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    /**
     * <b>summary</b> : 
     * <p>Queries the account fund flow list.</p>
     * 
     * @param request AccountFlowListRequest
     * @param headers AccountFlowListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccountFlowListResponse
     */
    public AccountFlowListResponse accountFlowListWithOptions(AccountFlowListRequest request, AccountFlowListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dayNum)) {
            query.put("day_num", request.dayNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("page_index", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utcBeginTime)) {
            query.put("utc_begin_time", request.utcBeginTime);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccountFlowList"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/account/flow-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccountFlowListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the account fund flow list.</p>
     * 
     * @param request AccountFlowListRequest
     * @return AccountFlowListResponse
     */
    public AccountFlowListResponse accountFlowList(AccountFlowListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AccountFlowListHeaders headers = new AccountFlowListHeaders();
        return this.accountFlowListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Recommends ancillary products.</p>
     * 
     * @param request AncillarySuggestRequest
     * @param headers AncillarySuggestHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AncillarySuggestResponse
     */
    public AncillarySuggestResponse ancillarySuggestWithOptions(AncillarySuggestRequest request, AncillarySuggestHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("solution_id", request.solutionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AncillarySuggest"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/ancillary/action-suggest"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AncillarySuggestResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Recommends ancillary products.</p>
     * 
     * @param request AncillarySuggestRequest
     * @return AncillarySuggestResponse
     */
    public AncillarySuggestResponse ancillarySuggest(AncillarySuggestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AncillarySuggestHeaders headers = new AncillarySuggestHeaders();
        return this.ancillarySuggestWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a booking order.</p>
     * 
     * @param tmpReq BookRequest
     * @param headers BookHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return BookResponse
     */
    public BookResponse bookWithOptions(BookRequest tmpReq, BookHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BookShrinkRequest request = new BookShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "contact", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerAncillaryPurchaseMapList)) {
            request.passengerAncillaryPurchaseMapListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerAncillaryPurchaseMapList, "passenger_ancillary_purchase_map_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.passengerList)) {
            request.passengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.passengerList, "passenger_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderNum)) {
            body.put("out_order_num", request.outOrderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerAncillaryPurchaseMapListShrink)) {
            body.put("passenger_ancillary_purchase_map_list", request.passengerAncillaryPurchaseMapListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passengerListShrink)) {
            body.put("passenger_list", request.passengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("solution_id", request.solutionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Book"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-book"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a booking order.</p>
     * 
     * @param request BookRequest
     * @return BookResponse
     */
    public BookResponse book(BookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        BookHeaders headers = new BookHeaders();
        return this.bookWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an unpaid order.</p>
     * 
     * @param request CancelRequest
     * @param headers CancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelResponse
     */
    public CancelResponse cancelWithOptions(CancelRequest request, CancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Cancel"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an unpaid order.</p>
     * 
     * @param request CancelRequest
     * @return CancelResponse
     */
    public CancelResponse cancel(CancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CancelHeaders headers = new CancelHeaders();
        return this.cancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a change application.</p>
     * 
     * @param tmpReq ChangeApplyRequest
     * @param headers ChangeApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeApplyResponse
     */
    public ChangeApplyResponse changeApplyWithOptions(ChangeApplyRequest tmpReq, ChangeApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ChangeApplyShrinkRequest request = new ChangeApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.changePassengerList)) {
            request.changePassengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.changePassengerList, "change_passenger_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.changedJourneys)) {
            request.changedJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.changedJourneys, "changed_journeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "contact", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changePassengerListShrink)) {
            body.put("change_passenger_list", request.changePassengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.changedJourneysShrink)) {
            body.put("changed_journeys", request.changedJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("type", request.type);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeApply"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/action-apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a change application.</p>
     * 
     * @param request ChangeApplyRequest
     * @return ChangeApplyResponse
     */
    public ChangeApplyResponse changeApply(ChangeApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeApplyHeaders headers = new ChangeApplyHeaders();
        return this.changeApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the change order.</p>
     * 
     * @param request ChangeCancelRequest
     * @param headers ChangeCancelHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeCancelResponse
     */
    public ChangeCancelResponse changeCancelWithOptions(ChangeCancelRequest request, ChangeCancelHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderNum)) {
            body.put("change_order_num", request.changeOrderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeCancel"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/action-cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeCancelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancel the change order.</p>
     * 
     * @param request ChangeCancelRequest
     * @return ChangeCancelResponse
     */
    public ChangeCancelResponse changeCancel(ChangeCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeCancelHeaders headers = new ChangeCancelHeaders();
        return this.changeCancelWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Confirms a flight change order.</p>
     * 
     * @param request ChangeConfirmRequest
     * @param headers ChangeConfirmHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeConfirmResponse
     */
    public ChangeConfirmResponse changeConfirmWithOptions(ChangeConfirmRequest request, ChangeConfirmHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderNum)) {
            body.put("change_order_num", request.changeOrderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeConfirm"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/action-confirm"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeConfirmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Confirms a flight change order.</p>
     * 
     * @param request ChangeConfirmRequest
     * @return ChangeConfirmResponse
     */
    public ChangeConfirmResponse changeConfirm(ChangeConfirmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeConfirmHeaders headers = new ChangeConfirmHeaders();
        return this.changeConfirmWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a flight change order.</p>
     * 
     * @param request ChangeDetailRequest
     * @param headers ChangeDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDetailResponse
     */
    public ChangeDetailResponse changeDetailWithOptions(ChangeDetailRequest request, ChangeDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.changeOrderNum)) {
            query.put("change_order_num", request.changeOrderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDetail"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a flight change order.</p>
     * 
     * @param request ChangeDetailRequest
     * @return ChangeDetailResponse
     */
    public ChangeDetailResponse changeDetail(ChangeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeDetailHeaders headers = new ChangeDetailHeaders();
        return this.changeDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a paging list of change order summaries by buyer account.</p>
     * 
     * @param request ChangeDetailListOfBuyerRequest
     * @param headers ChangeDetailListOfBuyerHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDetailListOfBuyerResponse
     */
    public ChangeDetailListOfBuyerResponse changeDetailListOfBuyerWithOptions(ChangeDetailListOfBuyerRequest request, ChangeDetailListOfBuyerHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("page_index", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utcCreateBegin)) {
            query.put("utc_create_begin", request.utcCreateBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.utcCreateEnd)) {
            query.put("utc_create_end", request.utcCreateEnd);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDetailListOfBuyer"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/buyer/detail-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDetailListOfBuyerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a paging list of change order summaries by buyer account.</p>
     * 
     * @param request ChangeDetailListOfBuyerRequest
     * @return ChangeDetailListOfBuyerResponse
     */
    public ChangeDetailListOfBuyerResponse changeDetailListOfBuyer(ChangeDetailListOfBuyerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeDetailListOfBuyerHeaders headers = new ChangeDetailListOfBuyerHeaders();
        return this.changeDetailListOfBuyerWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of change orders by the original order number.</p>
     * 
     * @param request ChangeDetailListOfOrderNumRequest
     * @param headers ChangeDetailListOfOrderNumHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeDetailListOfOrderNumResponse
     */
    public ChangeDetailListOfOrderNumResponse changeDetailListOfOrderNumWithOptions(ChangeDetailListOfOrderNumRequest request, ChangeDetailListOfOrderNumHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            query.put("order_num", request.orderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("page_index", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeDetailListOfOrderNum"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/change/order-num/detail-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeDetailListOfOrderNumResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of change orders by the original order number.</p>
     * 
     * @param request ChangeDetailListOfOrderNumRequest
     * @return ChangeDetailListOfOrderNumResponse
     */
    public ChangeDetailListOfOrderNumResponse changeDetailListOfOrderNum(ChangeDetailListOfOrderNumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ChangeDetailListOfOrderNumHeaders headers = new ChangeDetailListOfOrderNumHeaders();
        return this.changeDetailListOfOrderNumWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Collects lowest-price flight information.</p>
     * 
     * <b>summary</b> : 
     * <p>Collects lowest-price flight information.</p>
     * 
     * @param tmpReq CollectFlightLowestPriceRequest
     * @param headers CollectFlightLowestPriceHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CollectFlightLowestPriceResponse
     */
    public CollectFlightLowestPriceResponse collectFlightLowestPriceWithOptions(CollectFlightLowestPriceRequest tmpReq, CollectFlightLowestPriceHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CollectFlightLowestPriceShrinkRequest request = new CollectFlightLowestPriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lowestPriceFlightInfoList)) {
            request.lowestPriceFlightInfoListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lowestPriceFlightInfoList, "lowest_price_flight_info_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lowestPriceFlightInfoListShrink)) {
            body.put("lowest_price_flight_info_list", request.lowestPriceFlightInfoListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CollectFlightLowestPrice"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/data-collect/flight-lowest-price"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CollectFlightLowestPriceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Collects lowest-price flight information.</p>
     * 
     * <b>summary</b> : 
     * <p>Collects lowest-price flight information.</p>
     * 
     * @param request CollectFlightLowestPriceRequest
     * @return CollectFlightLowestPriceResponse
     */
    public CollectFlightLowestPriceResponse collectFlightLowestPrice(CollectFlightLowestPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CollectFlightLowestPriceHeaders headers = new CollectFlightLowestPriceHeaders();
        return this.collectFlightLowestPriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In the input parameters, choose either solution_id or journey_param_list. solution_id must be obtained from the Search API.</p>
     * 
     * <b>summary</b> : 
     * <p>Find richer quote information for the itinerary, including free baggage allowance, refund and change rules, and baggage through-check rules.</p>
     * 
     * @param tmpReq EnrichRequest
     * @param headers EnrichHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnrichResponse
     */
    public EnrichResponse enrichWithOptions(EnrichRequest tmpReq, EnrichHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EnrichShrinkRequest request = new EnrichShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.journeyParamList)) {
            request.journeyParamListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.journeyParamList, "journey_param_list", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adults)) {
            body.put("adults", request.adults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            body.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.children)) {
            body.put("children", request.children);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infants)) {
            body.put("infants", request.infants);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.journeyParamListShrink)) {
            body.put("journey_param_list", request.journeyParamListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("solution_id", request.solutionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Enrich"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-enrich"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnrichResponse());
    }

    /**
     * <b>description</b> :
     * <p>In the input parameters, choose either solution_id or journey_param_list. solution_id must be obtained from the Search API.</p>
     * 
     * <b>summary</b> : 
     * <p>Find richer quote information for the itinerary, including free baggage allowance, refund and change rules, and baggage through-check rules.</p>
     * 
     * @param request EnrichRequest
     * @return EnrichResponse
     */
    public EnrichResponse enrich(EnrichRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EnrichHeaders headers = new EnrichHeaders();
        return this.enrichWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a file as an attachment image. The file size is limited to 300 KB or less.</p>
     * 
     * @param request FileUploadRequest
     * @param headers FileUploadHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FileUploadResponse
     */
    public FileUploadResponse fileUploadWithOptions(FileUploadRequest request, FileUploadHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileContent)) {
            body.put("file_content", request.fileContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FileUpload"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/attachment/action-upload"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FileUploadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads a file as an attachment image. The file size is limited to 300 KB or less.</p>
     * 
     * @param request FileUploadRequest
     * @return FileUploadResponse
     */
    public FileUploadResponse fileUpload(FileUploadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FileUploadHeaders headers = new FileUploadHeaders();
        return this.fileUploadWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries flight change information by order number.</p>
     * 
     * @param request FlightChangeOfOrderRequest
     * @param headers FlightChangeOfOrderHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return FlightChangeOfOrderResponse
     */
    public FlightChangeOfOrderResponse flightChangeOfOrderWithOptions(FlightChangeOfOrderRequest request, FlightChangeOfOrderHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            query.put("order_num", request.orderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FlightChangeOfOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/flightchange/of-order"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FlightChangeOfOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries flight change information by order number.</p>
     * 
     * @param request FlightChangeOfOrderRequest
     * @return FlightChangeOfOrderResponse
     */
    public FlightChangeOfOrderResponse flightChangeOfOrder(FlightChangeOfOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        FlightChangeOfOrderHeaders headers = new FlightChangeOfOrderHeaders();
        return this.flightChangeOfOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a token for API calls. The token is valid for 2 hours.</p>
     * 
     * @param request GetTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenResponse
     */
    public GetTokenResponse getTokenWithOptions(GetTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetToken"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/token"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains a token for API calls. The token is valid for 2 hours.</p>
     * 
     * @param request GetTokenRequest
     * @return GetTokenResponse
     */
    public GetTokenResponse getToken(GetTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTokenWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries luggage through-check information for an itinerary. Provide itinerary information as input, and the API returns whether luggage through-check is supported for the itinerary. Luggage through-check applies to transfer and stopover scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries luggage through-check information for an itinerary.</p>
     * 
     * @param tmpReq LuggageDirectRequest
     * @param headers LuggageDirectHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return LuggageDirectResponse
     */
    public LuggageDirectResponse luggageDirectWithOptions(LuggageDirectRequest tmpReq, LuggageDirectHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        LuggageDirectShrinkRequest request = new LuggageDirectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flightSegmentParamList)) {
            request.flightSegmentParamListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flightSegmentParamList, "flight_segment_param_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flightSegmentParamListShrink)) {
            query.put("flight_segment_param_list", request.flightSegmentParamListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LuggageDirect"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/flight-data/luggage-direct"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LuggageDirectResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries luggage through-check information for an itinerary. Provide itinerary information as input, and the API returns whether luggage through-check is supported for the itinerary. Luggage through-check applies to transfer and stopover scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries luggage through-check information for an itinerary.</p>
     * 
     * @param request LuggageDirectRequest
     * @return LuggageDirectResponse
     */
    public LuggageDirectResponse luggageDirect(LuggageDirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        LuggageDirectHeaders headers = new LuggageDirectHeaders();
        return this.luggageDirectWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries order details.</p>
     * 
     * @param request OrderDetailRequest
     * @param headers OrderDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OrderDetailResponse
     */
    public OrderDetailResponse orderDetailWithOptions(OrderDetailRequest request, OrderDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            query.put("order_num", request.orderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outOrderNum)) {
            query.put("out_order_num", request.outOrderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderDetail"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/order-detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries order details.</p>
     * 
     * @param request OrderDetailRequest
     * @return OrderDetailResponse
     */
    public OrderDetailResponse orderDetail(OrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OrderDetailHeaders headers = new OrderDetailHeaders();
        return this.orderDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the order list.</p>
     * 
     * @param request OrderListRequest
     * @param headers OrderListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return OrderListResponse
     */
    public OrderListResponse orderListWithOptions(OrderListRequest request, OrderListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bookTimeEnd)) {
            query.put("book_time_end", request.bookTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bookTimeStart)) {
            query.put("book_time_start", request.bookTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("page_index", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("status", request.status);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OrderList"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/order-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OrderListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the order list.</p>
     * 
     * @param request OrderListRequest
     * @return OrderListResponse
     */
    public OrderListResponse orderList(OrderListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        OrderListHeaders headers = new OrderListHeaders();
        return this.orderListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies seat availability and pricing. If the price has changed, the developer can proceed with Book at the updated price. If the price has not changed, the order is placed at the original price.</p>
     * 
     * @param request PricingRequest
     * @param headers PricingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PricingResponse
     */
    public PricingResponse pricingWithOptions(PricingRequest request, PricingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("solution_id", request.solutionId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Pricing"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-pricing"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PricingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Verifies seat availability and pricing. If the price has changed, the developer can proceed with Book at the updated price. If the price has not changed, the order is placed at the original price.</p>
     * 
     * @param request PricingRequest
     * @return PricingResponse
     */
    public PricingResponse pricing(PricingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PricingHeaders headers = new PricingHeaders();
        return this.pricingWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a refund application for an air ticket.</p>
     * 
     * @param tmpReq RefundApplyRequest
     * @param headers RefundApplyHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundApplyResponse
     */
    public RefundApplyResponse refundApplyWithOptions(RefundApplyRequest tmpReq, RefundApplyHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefundApplyShrinkRequest request = new RefundApplyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundJourneys)) {
            request.refundJourneysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundJourneys, "refund_journeys", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundPassengerList)) {
            request.refundPassengerListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundPassengerList, "refund_passenger_list", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.refundType)) {
            request.refundTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.refundType, "refund_type", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundJourneysShrink)) {
            body.put("refund_journeys", request.refundJourneysShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundPassengerListShrink)) {
            body.put("refund_passenger_list", request.refundPassengerListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundTypeShrink)) {
            body.put("refund_type", request.refundTypeShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundApply"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/refund/action-apply"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundApplyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a refund application for an air ticket.</p>
     * 
     * @param request RefundApplyRequest
     * @return RefundApplyResponse
     */
    public RefundApplyResponse refundApply(RefundApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RefundApplyHeaders headers = new RefundApplyHeaders();
        return this.refundApplyWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a refund order.</p>
     * 
     * @param request RefundDetailRequest
     * @param headers RefundDetailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundDetailResponse
     */
    public RefundDetailResponse refundDetailWithOptions(RefundDetailRequest request, RefundDetailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.refundOrderNum)) {
            query.put("refund_order_num", request.refundOrderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundDetail"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/refund/detail"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a refund order.</p>
     * 
     * @param request RefundDetailRequest
     * @return RefundDetailResponse
     */
    public RefundDetailResponse refundDetail(RefundDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RefundDetailHeaders headers = new RefundDetailHeaders();
        return this.refundDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of refund orders.</p>
     * 
     * @param request RefundDetailListRequest
     * @param headers RefundDetailListHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundDetailListResponse
     */
    public RefundDetailListResponse refundDetailListWithOptions(RefundDetailListRequest request, RefundDetailListHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            query.put("order_num", request.orderNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("page_index", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("page_size", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCreateBeginTime)) {
            query.put("refund_create_begin_time", request.refundCreateBeginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundCreateEndTime)) {
            query.put("refund_create_end_time", request.refundCreateEndTime);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundDetailList"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/refund/detail-list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundDetailListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of refund orders.</p>
     * 
     * @param request RefundDetailListRequest
     * @return RefundDetailListResponse
     */
    public RefundDetailListResponse refundDetailList(RefundDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RefundDetailListHeaders headers = new RefundDetailListHeaders();
        return this.refundDetailListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for flight quotes and returns the lowest price across multiple flights. Note that the response of this operation does not include refund and change rules, free baggage allowance, or baggage through-check rules.</p>
     * 
     * @param tmpReq SearchRequest
     * @param headers SearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchResponse
     */
    public SearchResponse searchWithOptions(SearchRequest tmpReq, SearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchShrinkRequest request = new SearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.airLegs)) {
            request.airLegsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.airLegs, "air_legs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchControlOptions)) {
            request.searchControlOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchControlOptions, "search_control_options", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adults)) {
            body.put("adults", request.adults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.airLegsShrink)) {
            body.put("air_legs", request.airLegsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            body.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.children)) {
            body.put("children", request.children);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infants)) {
            body.put("infants", request.infants);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchControlOptionsShrink)) {
            body.put("search_control_options", request.searchControlOptionsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Search"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Searches for flight quotes and returns the lowest price across multiple flights. Note that the response of this operation does not include refund and change rules, free baggage allowance, or baggage through-check rules.</p>
     * 
     * @param request SearchRequest
     * @return SearchResponse
     */
    public SearchResponse search(SearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SearchHeaders headers = new SearchHeaders();
        return this.searchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Search and quote prices, currently providing the lowest price across multiple flights. Note that this API response includes refund/change rules, free baggage allowance, and baggage through-check rules.</p>
     * 
     * @param tmpReq StandardSearchRequest
     * @param headers StandardSearchHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return StandardSearchResponse
     */
    public StandardSearchResponse standardSearchWithOptions(StandardSearchRequest tmpReq, StandardSearchHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StandardSearchShrinkRequest request = new StandardSearchShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.airLegs)) {
            request.airLegsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.airLegs, "air_legs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.searchControlOptions)) {
            request.searchControlOptionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.searchControlOptions, "search_control_options", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adults)) {
            body.put("adults", request.adults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.airLegsShrink)) {
            body.put("air_legs", request.airLegsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cabinClass)) {
            body.put("cabin_class", request.cabinClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.children)) {
            body.put("children", request.children);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.infants)) {
            body.put("infants", request.infants);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchControlOptionsShrink)) {
            body.put("search_control_options", request.searchControlOptionsShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StandardSearch"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-standardsearch"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StandardSearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Search and quote prices, currently providing the lowest price across multiple flights. Note that this API response includes refund/change rules, free baggage allowance, and baggage through-check rules.</p>
     * 
     * @param request StandardSearchRequest
     * @return StandardSearchResponse
     */
    public StandardSearchResponse standardSearch(StandardSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        StandardSearchHeaders headers = new StandardSearchHeaders();
        return this.standardSearchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pays for and issues a ticket.</p>
     * 
     * @param request TicketingRequest
     * @param headers TicketingHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketingResponse
     */
    public TicketingResponse ticketingWithOptions(TicketingRequest request, TicketingHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Ticketing"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-ticketing"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pays for and issues a ticket.</p>
     * 
     * @param request TicketingRequest
     * @return TicketingResponse
     */
    public TicketingResponse ticketing(TicketingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketingHeaders headers = new TicketingHeaders();
        return this.ticketingWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a pre-ticketing check. This operation is optional.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a pre-ticketing check. This operation is optional.</p>
     * 
     * @param request TicketingCheckRequest
     * @param headers TicketingCheckHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TicketingCheckResponse
     */
    public TicketingCheckResponse ticketingCheckWithOptions(TicketingCheckRequest request, TicketingCheckHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderNum)) {
            body.put("order_num", request.orderNum);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TicketingCheck"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/trade/action-ticketing-check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TicketingCheckResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a pre-ticketing check. This operation is optional.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a pre-ticketing check. This operation is optional.</p>
     * 
     * @param request TicketingCheckRequest
     * @return TicketingCheckResponse
     */
    public TicketingCheckResponse ticketingCheck(TicketingCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TicketingCheckHeaders headers = new TicketingCheckHeaders();
        return this.ticketingCheckWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries transit visa requirements for a flight itinerary. You provide flight information, and the API returns whether a transit visa is required for the itinerary. Only transfer or stopover segments are valid input parameters (transfers or stopovers passing through a third country). The supported passenger type defaults to Chinese mainland travelers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries transit visa requirements for a flight itinerary. You provide flight information, and the API returns whether a transit visa is required for the itinerary. Only transfer or stopover segments are valid input parameters (transfers or stopovers passing through a third country). The supported passenger type defaults to Chinese mainland travelers.</p>
     * 
     * @param tmpReq TransitVisaRequest
     * @param headers TransitVisaHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransitVisaResponse
     */
    public TransitVisaResponse transitVisaWithOptions(TransitVisaRequest tmpReq, TransitVisaHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TransitVisaShrinkRequest request = new TransitVisaShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.flightSegmentParamList)) {
            request.flightSegmentParamListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.flightSegmentParamList, "flight_segment_param_list", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flightSegmentParamListShrink)) {
            query.put("flight_segment_param_list", request.flightSegmentParamListShrink);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketAccessToken)) {
            realHeaders.put("x-acs-airticket-access-token", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketAccessToken));
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.xAcsAirticketLanguage)) {
            realHeaders.put("x-acs-airticket-language", com.aliyun.teautil.Common.toJSONString(headers.xAcsAirticketLanguage));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransitVisa"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/airticket/v1/flight-data/transit-visa"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransitVisaResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries transit visa requirements for a flight itinerary. You provide flight information, and the API returns whether a transit visa is required for the itinerary. Only transfer or stopover segments are valid input parameters (transfers or stopovers passing through a third country). The supported passenger type defaults to Chinese mainland travelers.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries transit visa requirements for a flight itinerary. You provide flight information, and the API returns whether a transit visa is required for the itinerary. Only transfer or stopover segments are valid input parameters (transfers or stopovers passing through a third country). The supported passenger type defaults to Chinese mainland travelers.</p>
     * 
     * @param request TransitVisaRequest
     * @return TransitVisaResponse
     */
    public TransitVisaResponse transitVisa(TransitVisaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TransitVisaHeaders headers = new TransitVisaHeaders();
        return this.transitVisaWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>申请退款</p>
     * 
     * @param request ApplyRefundRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyRefundResponse
     */
    public ApplyRefundResponse applyRefundWithOptions(ApplyRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReason)) {
            body.put("RefundReason", request.refundReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "applyRefund"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/applyRefund"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>申请退款</p>
     * 
     * @param request ApplyRefundRequest
     * @return ApplyRefundResponse
     */
    public ApplyRefundResponse applyRefund(ApplyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.applyRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询酒店详情</p>
     * 
     * @param tmpReq BatchGetHotelDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetHotelDetailResponse
     */
    public BatchGetHotelDetailResponse batchGetHotelDetailWithOptions(BatchGetHotelDetailRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchGetHotelDetailShrinkRequest request = new BatchGetHotelDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "batchGetHotelDetail"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/batchGetHotelDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetHotelDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量查询酒店详情</p>
     * 
     * @param request BatchGetHotelDetailRequest
     * @return BatchGetHotelDetailResponse
     */
    public BatchGetHotelDetailResponse batchGetHotelDetail(BatchGetHotelDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetHotelDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消或退款</p>
     * 
     * @param request CancelOrRefundRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrRefundResponse
     */
    public CancelOrRefundResponse cancelOrRefundWithOptions(CancelOrRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "cancelOrRefund"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cancelOrRefund"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消或退款</p>
     * 
     * @param request CancelOrRefundRequest
     * @return CancelOrRefundResponse
     */
    public CancelOrRefundResponse cancelOrRefund(CancelOrRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelOrRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消订单</p>
     * 
     * @param request CancelOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "cancelOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/cancelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消订单</p>
     * 
     * @param request CancelOrderRequest
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创单并支付</p>
     * 
     * @param tmpReq CreateAndPayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAndPayResponse
     */
    public CreateAndPayResponse createAndPayWithOptions(CreateAndPayRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAndPayShrinkRequest request = new CreateAndPayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "Contact", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.guests)) {
            request.guestsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.guests, "Guests", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("Contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestsShrink)) {
            body.put("Guests", request.guestsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferId)) {
            body.put("ItemOfferId", request.itemOfferId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createAndPay"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/createAndPay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAndPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创单并支付</p>
     * 
     * @param request CreateAndPayRequest
     * @return CreateAndPayResponse
     */
    public CreateAndPayResponse createAndPay(CreateAndPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createAndPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建订单</p>
     * 
     * @param tmpReq CreateOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrderShrinkRequest request = new CreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "Contact", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.guests)) {
            request.guestsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.guests, "Guests", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("Contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestsShrink)) {
            body.put("Guests", request.guestsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferId)) {
            body.put("ItemOfferId", request.itemOfferId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "createOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/createOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建订单</p>
     * 
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a refund.</p>
     * 
     * @param request GlobalHotelApplyRefundRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelApplyRefundResponse
     */
    public GlobalHotelApplyRefundResponse globalHotelApplyRefundWithOptions(GlobalHotelApplyRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refundReason)) {
            body.put("RefundReason", request.refundReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelApplyRefund"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelApplyRefund"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelApplyRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies for a refund.</p>
     * 
     * @param request GlobalHotelApplyRefundRequest
     * @return GlobalHotelApplyRefundResponse
     */
    public GlobalHotelApplyRefundResponse globalHotelApplyRefund(GlobalHotelApplyRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelApplyRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries hotel details in batches.</p>
     * 
     * @param tmpReq GlobalHotelBatchGetHotelDetailRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelBatchGetHotelDetailResponse
     */
    public GlobalHotelBatchGetHotelDetailResponse globalHotelBatchGetHotelDetailWithOptions(GlobalHotelBatchGetHotelDetailRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelBatchGetHotelDetailShrinkRequest request = new GlobalHotelBatchGetHotelDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            body.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelBatchGetHotelDetail"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelBatchGetHotelDetail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelBatchGetHotelDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries hotel details in batches.</p>
     * 
     * @param request GlobalHotelBatchGetHotelDetailRequest
     * @return GlobalHotelBatchGetHotelDetailResponse
     */
    public GlobalHotelBatchGetHotelDetailResponse globalHotelBatchGetHotelDetail(GlobalHotelBatchGetHotelDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelBatchGetHotelDetailWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels or refunds an order.</p>
     * 
     * @param request GlobalHotelCancelOrRefundRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelCancelOrRefundResponse
     */
    public GlobalHotelCancelOrRefundResponse globalHotelCancelOrRefundWithOptions(GlobalHotelCancelOrRefundRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelCancelOrRefund"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelCancelOrRefund"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelCancelOrRefundResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels or refunds an order.</p>
     * 
     * @param request GlobalHotelCancelOrRefundRequest
     * @return GlobalHotelCancelOrRefundResponse
     */
    public GlobalHotelCancelOrRefundResponse globalHotelCancelOrRefund(GlobalHotelCancelOrRefundRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelCancelOrRefundWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an order.</p>
     * 
     * @param request GlobalHotelCancelOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelCancelOrderResponse
     */
    public GlobalHotelCancelOrderResponse globalHotelCancelOrderWithOptions(GlobalHotelCancelOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelCancelOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelCancelOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelCancelOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an order.</p>
     * 
     * @param request GlobalHotelCancelOrderRequest
     * @return GlobalHotelCancelOrderResponse
     */
    public GlobalHotelCancelOrderResponse globalHotelCancelOrder(GlobalHotelCancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelCancelOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an order and processes the payment.</p>
     * 
     * @param tmpReq GlobalHotelCreateAndPayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelCreateAndPayResponse
     */
    public GlobalHotelCreateAndPayResponse globalHotelCreateAndPayWithOptions(GlobalHotelCreateAndPayRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelCreateAndPayShrinkRequest request = new GlobalHotelCreateAndPayShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "Contact", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.guests)) {
            request.guestsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.guests, "Guests", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("Contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestsShrink)) {
            body.put("Guests", request.guestsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferId)) {
            body.put("ItemOfferId", request.itemOfferId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelCreateAndPay"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelCreateAndPay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelCreateAndPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an order and processes the payment.</p>
     * 
     * @param request GlobalHotelCreateAndPayRequest
     * @return GlobalHotelCreateAndPayResponse
     */
    public GlobalHotelCreateAndPayResponse globalHotelCreateAndPay(GlobalHotelCreateAndPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelCreateAndPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an order.</p>
     * 
     * @param tmpReq GlobalHotelCreateOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelCreateOrderResponse
     */
    public GlobalHotelCreateOrderResponse globalHotelCreateOrderWithOptions(GlobalHotelCreateOrderRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelCreateOrderShrinkRequest request = new GlobalHotelCreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.contact)) {
            request.contactShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.contact, "Contact", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.guests)) {
            request.guestsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.guests, "Guests", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactShrink)) {
            body.put("Contact", request.contactShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.guestsShrink)) {
            body.put("Guests", request.guestsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferId)) {
            body.put("ItemOfferId", request.itemOfferId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelCreateOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelCreateOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelCreateOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an order.</p>
     * 
     * @param request GlobalHotelCreateOrderRequest
     * @return GlobalHotelCreateOrderResponse
     */
    public GlobalHotelCreateOrderResponse globalHotelCreateOrder(GlobalHotelCreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelCreateOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Processes a distribution payment.</p>
     * 
     * @param request GlobalHotelPayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelPayResponse
     */
    public GlobalHotelPayResponse globalHotelPayWithOptions(GlobalHotelPayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelPay"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelPay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelPayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Processes a distribution payment.</p>
     * 
     * @param request GlobalHotelPayRequest
     * @return GlobalHotelPayResponse
     */
    public GlobalHotelPayResponse globalHotelPay(GlobalHotelPayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelPayWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the availability of hotel rate plans.</p>
     * 
     * @param tmpReq GlobalHotelQueryAvailabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelQueryAvailabilityResponse
     */
    public GlobalHotelQueryAvailabilityResponse globalHotelQueryAvailabilityWithOptions(GlobalHotelQueryAvailabilityRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelQueryAvailabilityShrinkRequest request = new GlobalHotelQueryAvailabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adultCount)) {
            body.put("AdultCount", request.adultCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDate)) {
            body.put("CheckInDate", request.checkInDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutDate)) {
            body.put("CheckOutDate", request.checkOutDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childCount)) {
            body.put("ChildCount", request.childCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelQueryAvailability"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelQueryAvailability"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelQueryAvailabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the availability of hotel rate plans.</p>
     * 
     * @param request GlobalHotelQueryAvailabilityRequest
     * @return GlobalHotelQueryAvailabilityResponse
     */
    public GlobalHotelQueryAvailabilityResponse globalHotelQueryAvailability(GlobalHotelQueryAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelQueryAvailabilityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries calendar-based rate availability for hotels in batch.</p>
     * 
     * @param tmpReq GlobalHotelQueryCalendarAvailabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelQueryCalendarAvailabilityResponse
     */
    public GlobalHotelQueryCalendarAvailabilityResponse globalHotelQueryCalendarAvailabilityWithOptions(GlobalHotelQueryCalendarAvailabilityRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelQueryCalendarAvailabilityShrinkRequest request = new GlobalHotelQueryCalendarAvailabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adultCount)) {
            body.put("AdultCount", request.adultCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDateEnd)) {
            body.put("CheckInDateEnd", request.checkInDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDateStart)) {
            body.put("CheckInDateStart", request.checkInDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childCount)) {
            body.put("ChildCount", request.childCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelQueryCalendarAvailability"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelQueryCalendarAvailability"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelQueryCalendarAvailabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries calendar-based rate availability for hotels in batch.</p>
     * 
     * @param request GlobalHotelQueryCalendarAvailabilityRequest
     * @return GlobalHotelQueryCalendarAvailabilityResponse
     */
    public GlobalHotelQueryCalendarAvailabilityResponse globalHotelQueryCalendarAvailability(GlobalHotelQueryCalendarAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelQueryCalendarAvailabilityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an order.</p>
     * 
     * @param request GlobalHotelQueryOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelQueryOrderResponse
     */
    public GlobalHotelQueryOrderResponse globalHotelQueryOrderWithOptions(GlobalHotelQueryOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelQueryOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelQueryOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelQueryOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries an order.</p>
     * 
     * @param request GlobalHotelQueryOrderRequest
     * @return GlobalHotelQueryOrderResponse
     */
    public GlobalHotelQueryOrderResponse globalHotelQueryOrder(GlobalHotelQueryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelQueryOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries city administrative divisions (in Chinese and English) by paging.</p>
     * 
     * @param request GlobalHotelSearchCityPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelSearchCityPageResponse
     */
    public GlobalHotelSearchCityPageResponse globalHotelSearchCityPageWithOptions(GlobalHotelSearchCityPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelSearchCityPage"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelSearchCityPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelSearchCityPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries city administrative divisions (in Chinese and English) by paging.</p>
     * 
     * @param request GlobalHotelSearchCityPageRequest
     * @return GlobalHotelSearchCityPageResponse
     */
    public GlobalHotelSearchCityPageResponse globalHotelSearchCityPage(GlobalHotelSearchCityPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelSearchCityPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query of the hotel list by city with paging support.</p>
     * 
     * @param request GlobalHotelSearchHotelListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelSearchHotelListResponse
     */
    public GlobalHotelSearchHotelListResponse globalHotelSearchHotelListWithOptions(GlobalHotelSearchHotelListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelSearchHotelList"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelSearchHotelList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelSearchHotelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query of the hotel list by city with paging support.</p>
     * 
     * @param request GlobalHotelSearchHotelListRequest
     * @return GlobalHotelSearchHotelListResponse
     */
    public GlobalHotelSearchHotelListResponse globalHotelSearchHotelList(GlobalHotelSearchHotelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelSearchHotelListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the price of a hotel offer.</p>
     * 
     * @param tmpReq GlobalHotelValidatePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GlobalHotelValidatePriceResponse
     */
    public GlobalHotelValidatePriceResponse globalHotelValidatePriceWithOptions(GlobalHotelValidatePriceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GlobalHotelValidatePriceShrinkRequest request = new GlobalHotelValidatePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adults)) {
            body.put("Adults", request.adults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.children)) {
            body.put("Children", request.children);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferKey)) {
            body.put("ItemOfferKey", request.itemOfferKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "globalHotelValidatePrice"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotelValidatePrice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GlobalHotelValidatePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Validates the price of a hotel offer.</p>
     * 
     * @param request GlobalHotelValidatePriceRequest
     * @return GlobalHotelValidatePriceResponse
     */
    public GlobalHotelValidatePriceResponse globalHotelValidatePrice(GlobalHotelValidatePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.globalHotelValidatePriceWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分销支付</p>
     * 
     * @param request PayRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return PayResponse
     */
    public PayResponse payWithOptions(PayRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "pay"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/pay"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分销支付</p>
     * 
     * @param request PayRequest
     * @return PayResponse
     */
    public PayResponse pay(PayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.payWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店报价可用性</p>
     * 
     * @param tmpReq QueryAvailabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvailabilityResponse
     */
    public QueryAvailabilityResponse queryAvailabilityWithOptions(QueryAvailabilityRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAvailabilityShrinkRequest request = new QueryAvailabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adultCount)) {
            body.put("AdultCount", request.adultCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDate)) {
            body.put("CheckInDate", request.checkInDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkOutDate)) {
            body.put("CheckOutDate", request.checkOutDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childCount)) {
            body.put("ChildCount", request.childCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "queryAvailability"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queryAvailability"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询酒店报价可用性</p>
     * 
     * @param request QueryAvailabilityRequest
     * @return QueryAvailabilityResponse
     */
    public QueryAvailabilityResponse queryAvailability(QueryAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryAvailabilityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量日历报价查询</p>
     * 
     * @param tmpReq QueryCalendarAvailabilityRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCalendarAvailabilityResponse
     */
    public QueryCalendarAvailabilityResponse queryCalendarAvailabilityWithOptions(QueryCalendarAvailabilityRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCalendarAvailabilityShrinkRequest request = new QueryCalendarAvailabilityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.standardHotelIds)) {
            request.standardHotelIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.standardHotelIds, "StandardHotelIds", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adultCount)) {
            body.put("AdultCount", request.adultCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDateEnd)) {
            body.put("CheckInDateEnd", request.checkInDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.checkInDateStart)) {
            body.put("CheckInDateStart", request.checkInDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childCount)) {
            body.put("ChildCount", request.childCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standardHotelIdsShrink)) {
            body.put("StandardHotelIds", request.standardHotelIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "queryCalendarAvailability"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queryCalendarAvailability"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCalendarAvailabilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量日历报价查询</p>
     * 
     * @param request QueryCalendarAvailabilityRequest
     * @return QueryCalendarAvailabilityResponse
     */
    public QueryCalendarAvailabilityResponse queryCalendarAvailability(QueryCalendarAvailabilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryCalendarAvailabilityWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询订单</p>
     * 
     * @param request QueryOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrderResponse
     */
    public QueryOrderResponse queryOrderWithOptions(QueryOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalOrderNo)) {
            body.put("ExternalOrderNo", request.externalOrderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderNo)) {
            body.put("OrderNo", request.orderNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "queryOrder"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/queryOrder"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询订单</p>
     * 
     * @param request QueryOrderRequest
     * @return QueryOrderResponse
     */
    public QueryOrderResponse queryOrder(QueryOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOrderWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询城市行政区划（中英文）</p>
     * 
     * @param request SearchCityPageRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchCityPageResponse
     */
    public SearchCityPageResponse searchCityPageWithOptions(SearchCityPageRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            body.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryCode)) {
            body.put("CountryCode", request.countryCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "searchCityPage"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/searchCityPage"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchCityPageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询城市行政区划（中英文）</p>
     * 
     * @param request SearchCityPageRequest
     * @return SearchCityPageResponse
     */
    public SearchCityPageResponse searchCityPage(SearchCityPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchCityPageWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>按城市分页查询酒店列表</p>
     * 
     * @param request SearchHotelListRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchHotelListResponse
     */
    public SearchHotelListResponse searchHotelListWithOptions(SearchHotelListRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "searchHotelList"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/globalHotel/searchHotelList"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchHotelListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>按城市分页查询酒店列表</p>
     * 
     * @param request SearchHotelListRequest
     * @return SearchHotelListResponse
     */
    public SearchHotelListResponse searchHotelList(SearchHotelListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchHotelListWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>验价</p>
     * 
     * @param tmpReq ValidatePriceRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ValidatePriceResponse
     */
    public ValidatePriceResponse validatePriceWithOptions(ValidatePriceRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ValidatePriceShrinkRequest request = new ValidatePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.childrenAges)) {
            request.childrenAgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.childrenAges, "ChildrenAges", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNo)) {
            body.put("AccountNo", request.accountNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adults)) {
            body.put("Adults", request.adults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.children)) {
            body.put("Children", request.children);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childrenAgesShrink)) {
            body.put("ChildrenAges", request.childrenAgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemOfferKey)) {
            body.put("ItemOfferKey", request.itemOfferKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roomCount)) {
            body.put("RoomCount", request.roomCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tracerId)) {
            body.put("TracerId", request.tracerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "validatePrice"),
            new TeaPair("version", "2023-01-17"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/validatePrice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidatePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>验价</p>
     * 
     * @param request ValidatePriceRequest
     * @return ValidatePriceResponse
     */
    public ValidatePriceResponse validatePrice(ValidatePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validatePriceWithOptions(request, headers, runtime);
    }
}
