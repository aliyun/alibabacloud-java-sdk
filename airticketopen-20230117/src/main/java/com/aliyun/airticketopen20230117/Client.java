// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117;

import com.aliyun.tea.*;
import com.aliyun.airticketopen20230117.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
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
     * <p>账号资金流水</p>
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
     * <p>账号资金流水</p>
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
     * <b>description</b> :
     * <p>search ancillary for selected solution, you should enter the solution_id returned by enrich.</p>
     * 
     * <b>summary</b> : 
     * <p>Ancillary - Suggestion</p>
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
     * <b>description</b> :
     * <p>search ancillary for selected solution, you should enter the solution_id returned by enrich.</p>
     * 
     * <b>summary</b> : 
     * <p>Ancillary - Suggestion</p>
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
     * <b>description</b> :
     * <p>Enter solution_id returned by enrich, ancillary_id returned by ancillarySuggest(optional), passengers information and contact information, the book interface will create an order wait for pay.
     * There are two issues should be noticed:</p>
     * <ol>
     * <li>the solution_id must be processed by pricing.</li>
     * <li>the order created by book interface should be pay within 30 minutes, otherwise the order will be closed.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Transaction-Reservation</p>
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
     * <b>description</b> :
     * <p>Enter solution_id returned by enrich, ancillary_id returned by ancillarySuggest(optional), passengers information and contact information, the book interface will create an order wait for pay.
     * There are two issues should be noticed:</p>
     * <ol>
     * <li>the solution_id must be processed by pricing.</li>
     * <li>the order created by book interface should be pay within 30 minutes, otherwise the order will be closed.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Transaction-Reservation</p>
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
     * <b>description</b> :
     * <p>close an unpaid order</p>
     * 
     * <b>summary</b> : 
     * <p>Transaction - Unpaid Cancellation</p>
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
     * <b>description</b> :
     * <p>close an unpaid order</p>
     * 
     * <b>summary</b> : 
     * <p>Transaction - Unpaid Cancellation</p>
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
     * <p>改签-Apply</p>
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
     * <p>改签-Apply</p>
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
     * <p>改签-取消</p>
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
     * <p>改签-取消</p>
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
     * <p>改签-确认</p>
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
     * <p>改签-确认</p>
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
     * <p>改签-Detail</p>
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
     * <p>改签-Detail</p>
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
     * <p>改签单列表-关于买家账号</p>
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
     * <p>改签单列表-关于买家账号</p>
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
     * <p>改签单列表-关于正向订单</p>
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
     * <p>改签单列表-关于正向订单</p>
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
     * <b>summary</b> : 
     * <p>数据收集-低价航班信息</p>
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lowestPriceFlightList)) {
            request.lowestPriceFlightListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lowestPriceFlightList, "lowestPriceFlightList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lowestPriceFlightListShrink)) {
            body.put("lowestPriceFlightList", request.lowestPriceFlightListShrink);
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
     * <b>summary</b> : 
     * <p>数据收集-低价航班信息</p>
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
     * <p>Enrich supports two modes:</p>
     * <ol>
     * <li>mode1: enter solution_id returned by Search.</li>
     * <li>mode2: enter journeyParamList.
     * If you already confirm which flight to fly with, then you can use mode2, otherwise, use mode1(search first, then chose one solution_ID and Enrich).</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Search-Enrich</p>
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
     * <p>Enrich supports two modes:</p>
     * <ol>
     * <li>mode1: enter solution_id returned by Search.</li>
     * <li>mode2: enter journeyParamList.
     * If you already confirm which flight to fly with, then you can use mode2, otherwise, use mode1(search first, then chose one solution_ID and Enrich).</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Search-Enrich</p>
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
     * <p>附件上传</p>
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
     * <p>附件上传</p>
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
     * <p>航变信息-关于订单</p>
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
     * <p>航变信息-关于订单</p>
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
     * <p>Get Token</p>
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
     * <p>Get Token</p>
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
     * <b>summary</b> : 
     * <p>航程行李直挂</p>
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
     * <b>summary</b> : 
     * <p>航程行李直挂</p>
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
     * <b>description</b> :
     * <p>query order detail</p>
     * 
     * <b>summary</b> : 
     * <p>Trade-Order Details</p>
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
     * <b>description</b> :
     * <p>query order detail</p>
     * 
     * <b>summary</b> : 
     * <p>Trade-Order Details</p>
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
     * <b>description</b> :
     * <p>query order list</p>
     * 
     * <b>summary</b> : 
     * <p>Trade - Order List</p>
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
     * <b>description</b> :
     * <p>query order list</p>
     * 
     * <b>summary</b> : 
     * <p>Trade - Order List</p>
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
     * <b>description</b> :
     * <p>Check is price and remaining seats of solution you selected has changed. You should enter the solution_id returned by enrich.</p>
     * 
     * <b>summary</b> : 
     * <p>Trade - Seat and Price Verification</p>
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
     * <b>description</b> :
     * <p>Check is price and remaining seats of solution you selected has changed. You should enter the solution_id returned by enrich.</p>
     * 
     * <b>summary</b> : 
     * <p>Trade - Seat and Price Verification</p>
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
     * <b>description</b> :
     * <p>Apply for a refund and generate a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>退票-申请</p>
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
     * <b>description</b> :
     * <p>Apply for a refund and generate a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>退票-申请</p>
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
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * <b>summary</b> : 
     * <p>Refund - Detail</p>
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
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * <b>summary</b> : 
     * <p>Refund - Detail</p>
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
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * <b>summary</b> : 
     * <p>Refund - Detail List</p>
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
     * <b>description</b> :
     * <p>Query refund order detail.</p>
     * 
     * <b>summary</b> : 
     * <p>Refund - Detail List</p>
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
     * <b>description</b> :
     * <p>Enter the information of departure, arrival, departure date, passenger number and cabin, return the lowest price for each flight.</p>
     * 
     * <b>summary</b> : 
     * <p>search</p>
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
     * <b>description</b> :
     * <p>Enter the information of departure, arrival, departure date, passenger number and cabin, return the lowest price for each flight.</p>
     * 
     * <b>summary</b> : 
     * <p>search</p>
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
     * <p>Transaction - Payment and Ticket Issuance</p>
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
     * <p>Transaction - Payment and Ticket Issuance</p>
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
     * <p>Pre-check for Ticketing, this interface is optional to use.</p>
     * 
     * <b>summary</b> : 
     * <p>Transaction - Pre-payment verification</p>
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
     * <p>Pre-check for Ticketing, this interface is optional to use.</p>
     * 
     * <b>summary</b> : 
     * <p>Transaction - Pre-payment verification</p>
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
     * <b>summary</b> : 
     * <p>航程过境签</p>
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
     * <b>summary</b> : 
     * <p>航程过境签</p>
     * 
     * @param request TransitVisaRequest
     * @return TransitVisaResponse
     */
    public TransitVisaResponse transitVisa(TransitVisaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        TransitVisaHeaders headers = new TransitVisaHeaders();
        return this.transitVisaWithOptions(request, headers, runtime);
    }
}
