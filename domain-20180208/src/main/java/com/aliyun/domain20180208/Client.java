// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180208;

import com.aliyun.tea.*;
import com.aliyun.domain20180208.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("domain", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request AcceptDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptDemandResponse
     */
    public AcceptDemandResponse acceptDemandWithOptions(AcceptDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptDemandResponse());
    }

    /**
     * @param request AcceptDemandRequest
     * @return AcceptDemandResponse
     */
    public AcceptDemandResponse acceptDemand(AcceptDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptDemandWithOptions(request, runtime);
    }

    /**
     * @param request BidDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BidDomainResponse
     */
    public BidDomainResponse bidDomainWithOptions(BidDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionId)) {
            body.put("AuctionId", request.auctionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxBid)) {
            body.put("MaxBid", request.maxBid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BidDomain"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BidDomainResponse());
    }

    /**
     * @param request BidDomainRequest
     * @return BidDomainResponse
     */
    public BidDomainResponse bidDomain(BidDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bidDomainWithOptions(request, runtime);
    }

    /**
     * @param request ChangeAuctionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeAuctionResponse
     */
    public ChangeAuctionResponse changeAuctionWithOptions(ChangeAuctionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionList)) {
            body.put("AuctionList", request.auctionList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeAuction"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeAuctionResponse());
    }

    /**
     * @param request ChangeAuctionRequest
     * @return ChangeAuctionResponse
     */
    public ChangeAuctionResponse changeAuction(ChangeAuctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAuctionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>校验域名在售状态</p>
     * 
     * @param request CheckDomainStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckDomainStatusResponse
     */
    public CheckDomainStatusResponse checkDomainStatusWithOptions(CheckDomainStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomainStatus"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验域名在售状态</p>
     * 
     * @param request CheckDomainStatusRequest
     * @return CheckDomainStatusResponse
     */
    public CheckDomainStatusResponse checkDomainStatus(CheckDomainStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDomainStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>一口价严选询价接口</p>
     * 
     * @param request CheckSelectedDomainStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSelectedDomainStatusResponse
     */
    public CheckSelectedDomainStatusResponse checkSelectedDomainStatusWithOptions(CheckSelectedDomainStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSelectedDomainStatus"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSelectedDomainStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>一口价严选询价接口</p>
     * 
     * @param request CheckSelectedDomainStatusRequest
     * @return CheckSelectedDomainStatusResponse
     */
    public CheckSelectedDomainStatusResponse checkSelectedDomainStatus(CheckSelectedDomainStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSelectedDomainStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一口价需求单</p>
     * 
     * @param request CreateFixedPriceDemandOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFixedPriceDemandOrderResponse
     */
    public CreateFixedPriceDemandOrderResponse createFixedPriceDemandOrderWithOptions(CreateFixedPriceDemandOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFixedPriceDemandOrder"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFixedPriceDemandOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一口价需求单</p>
     * 
     * @param request CreateFixedPriceDemandOrderRequest
     * @return CreateFixedPriceDemandOrderResponse
     */
    public CreateFixedPriceDemandOrderResponse createFixedPriceDemandOrder(CreateFixedPriceDemandOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFixedPriceDemandOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>一口价严选下单购买接口，阿里云账户余额直接扣费</p>
     * 
     * @param request CreateFixedPriceSelectedOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFixedPriceSelectedOrderResponse
     */
    public CreateFixedPriceSelectedOrderResponse createFixedPriceSelectedOrderWithOptions(CreateFixedPriceSelectedOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactId)) {
            query.put("ContactId", request.contactId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expectedPrice)) {
            query.put("ExpectedPrice", request.expectedPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFixedPriceSelectedOrder"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFixedPriceSelectedOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>一口价严选下单购买接口，阿里云账户余额直接扣费</p>
     * 
     * @param request CreateFixedPriceSelectedOrderRequest
     * @return CreateFixedPriceSelectedOrderResponse
     */
    public CreateFixedPriceSelectedOrderResponse createFixedPriceSelectedOrder(CreateFixedPriceSelectedOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFixedPriceSelectedOrderWithOptions(request, runtime);
    }

    /**
     * @param request FailDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailDemandResponse
     */
    public FailDemandResponse failDemandWithOptions(FailDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailDemandResponse());
    }

    /**
     * @param request FailDemandRequest
     * @return FailDemandResponse
     */
    public FailDemandResponse failDemand(FailDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failDemandWithOptions(request, runtime);
    }

    /**
     * @param request FinishDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishDemandResponse
     */
    public FinishDemandResponse finishDemandWithOptions(FinishDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishDemandResponse());
    }

    /**
     * @param request FinishDemandRequest
     * @return FinishDemandResponse
     */
    public FinishDemandResponse finishDemand(FinishDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishDemandWithOptions(request, runtime);
    }

    /**
     * @param request GetIntlDomainDownloadUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntlDomainDownloadUrlResponse
     */
    public GetIntlDomainDownloadUrlResponse getIntlDomainDownloadUrlWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntlDomainDownloadUrl"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntlDomainDownloadUrlResponse());
    }

    /**
     * @return GetIntlDomainDownloadUrlResponse
     */
    public GetIntlDomainDownloadUrlResponse getIntlDomainDownloadUrl() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntlDomainDownloadUrlWithOptions(runtime);
    }

    /**
     * @param request GetReserveDomainUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReserveDomainUrlResponse
     */
    public GetReserveDomainUrlResponse getReserveDomainUrlWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReserveDomainUrl"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReserveDomainUrlResponse());
    }

    /**
     * @return GetReserveDomainUrlResponse
     */
    public GetReserveDomainUrlResponse getReserveDomainUrl() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReserveDomainUrlWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>购买国际站预释放域名</p>
     * 
     * @param request PurchaseIntlDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PurchaseIntlDomainResponse
     */
    public PurchaseIntlDomainResponse purchaseIntlDomainWithOptions(PurchaseIntlDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionId)) {
            body.put("AuctionId", request.auctionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.price)) {
            body.put("Price", request.price);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PurchaseIntlDomain"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PurchaseIntlDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>购买国际站预释放域名</p>
     * 
     * @param request PurchaseIntlDomainRequest
     * @return PurchaseIntlDomainResponse
     */
    public PurchaseIntlDomainResponse purchaseIntlDomain(PurchaseIntlDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.purchaseIntlDomainWithOptions(request, runtime);
    }

    /**
     * @param request QueryAuctionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuctionDetailResponse
     */
    public QueryAuctionDetailResponse queryAuctionDetailWithOptions(QueryAuctionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionId)) {
            body.put("AuctionId", request.auctionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuctionDetail"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuctionDetailResponse());
    }

    /**
     * @param request QueryAuctionDetailRequest
     * @return QueryAuctionDetailResponse
     */
    public QueryAuctionDetailResponse queryAuctionDetail(QueryAuctionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuctionDetailWithOptions(request, runtime);
    }

    /**
     * @param request QueryAuctionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAuctionsResponse
     */
    public QueryAuctionsResponse queryAuctionsWithOptions(QueryAuctionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionEndTimeOrder)) {
            body.put("AuctionEndTimeOrder", request.auctionEndTimeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            body.put("Statuses", request.statuses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAuctions"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAuctionsResponse());
    }

    /**
     * @param request QueryAuctionsRequest
     * @return QueryAuctionsResponse
     */
    public QueryAuctionsResponse queryAuctions(QueryAuctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAuctionsWithOptions(request, runtime);
    }

    /**
     * @param request QueryBidRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBidRecordsResponse
     */
    public QueryBidRecordsResponse queryBidRecordsWithOptions(QueryBidRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionId)) {
            body.put("AuctionId", request.auctionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBidRecords"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBidRecordsResponse());
    }

    /**
     * @param request QueryBidRecordsRequest
     * @return QueryBidRecordsResponse
     */
    public QueryBidRecordsResponse queryBidRecords(QueryBidRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBidRecordsWithOptions(request, runtime);
    }

    /**
     * @param request QueryBookingDomainInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBookingDomainInfoResponse
     */
    public QueryBookingDomainInfoResponse queryBookingDomainInfoWithOptions(QueryBookingDomainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBookingDomainInfo"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBookingDomainInfoResponse());
    }

    /**
     * @param request QueryBookingDomainInfoRequest
     * @return QueryBookingDomainInfoResponse
     */
    public QueryBookingDomainInfoResponse queryBookingDomainInfo(QueryBookingDomainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBookingDomainInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询回购订单列表</p>
     * 
     * @param request QueryBrokerDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBrokerDemandResponse
     */
    public QueryBrokerDemandResponse queryBrokerDemandWithOptions(QueryBrokerDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBrokerDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBrokerDemandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询回购订单列表</p>
     * 
     * @param request QueryBrokerDemandRequest
     * @return QueryBrokerDemandResponse
     */
    public QueryBrokerDemandResponse queryBrokerDemand(QueryBrokerDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBrokerDemandWithOptions(request, runtime);
    }

    /**
     * @param request QueryBrokerDemandRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBrokerDemandRecordResponse
     */
    public QueryBrokerDemandRecordResponse queryBrokerDemandRecordWithOptions(QueryBrokerDemandRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBrokerDemandRecord"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBrokerDemandRecordResponse());
    }

    /**
     * @param request QueryBrokerDemandRecordRequest
     * @return QueryBrokerDemandRecordResponse
     */
    public QueryBrokerDemandRecordResponse queryBrokerDemandRecord(QueryBrokerDemandRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBrokerDemandRecordWithOptions(request, runtime);
    }

    /**
     * @param request QueryDomainTransferStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDomainTransferStatusResponse
     */
    public QueryDomainTransferStatusResponse queryDomainTransferStatusWithOptions(QueryDomainTransferStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDomainTransferStatus"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDomainTransferStatusResponse());
    }

    /**
     * @param request QueryDomainTransferStatusRequest
     * @return QueryDomainTransferStatusResponse
     */
    public QueryDomainTransferStatusResponse queryDomainTransferStatus(QueryDomainTransferStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDomainTransferStatusWithOptions(request, runtime);
    }

    /**
     * @param request QueryPurchasedDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPurchasedDomainsResponse
     */
    public QueryPurchasedDomainsResponse queryPurchasedDomainsWithOptions(QueryPurchasedDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            body.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endOperationTime)) {
            body.put("EndOperationTime", request.endOperationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opTimeOrder)) {
            body.put("OpTimeOrder", request.opTimeOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationStatus)) {
            body.put("OperationStatus", request.operationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startOperationTime)) {
            body.put("StartOperationTime", request.startOperationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateTimeOrder)) {
            body.put("UpdateTimeOrder", request.updateTimeOrder);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPurchasedDomains"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPurchasedDomainsResponse());
    }

    /**
     * @param request QueryPurchasedDomainsRequest
     * @return QueryPurchasedDomainsResponse
     */
    public QueryPurchasedDomainsResponse queryPurchasedDomains(QueryPurchasedDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPurchasedDomainsWithOptions(request, runtime);
    }

    /**
     * @param request RecordDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecordDemandResponse
     */
    public RecordDemandResponse recordDemandWithOptions(RecordDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecordDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecordDemandResponse());
    }

    /**
     * @param request RecordDemandRequest
     * @return RecordDemandResponse
     */
    public RecordDemandResponse recordDemand(RecordDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recordDemandWithOptions(request, runtime);
    }

    /**
     * @param request RefuseDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefuseDemandResponse
     */
    public RefuseDemandResponse refuseDemandWithOptions(RefuseDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseDemandResponse());
    }

    /**
     * @param request RefuseDemandRequest
     * @return RefuseDemandResponse
     */
    public RefuseDemandResponse refuseDemand(RefuseDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refuseDemandWithOptions(request, runtime);
    }

    /**
     * @param request RequestPayDemandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RequestPayDemandResponse
     */
    public RequestPayDemandResponse requestPayDemandWithOptions(RequestPayDemandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.message)) {
            query.put("Message", request.message);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.price)) {
            query.put("Price", request.price);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.produceType)) {
            query.put("ProduceType", request.produceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RequestPayDemand"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RequestPayDemandResponse());
    }

    /**
     * @param request RequestPayDemandRequest
     * @return RequestPayDemandResponse
     */
    public RequestPayDemandResponse requestPayDemand(RequestPayDemandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.requestPayDemandWithOptions(request, runtime);
    }

    /**
     * @param request ReserveDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReserveDomainResponse
     */
    public ReserveDomainResponse reserveDomainWithOptions(ReserveDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channels)) {
            body.put("Channels", request.channels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReserveDomain"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReserveDomainResponse());
    }

    /**
     * @param request ReserveDomainRequest
     * @return ReserveDomainResponse
     */
    public ReserveDomainResponse reserveDomain(ReserveDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reserveDomainWithOptions(request, runtime);
    }

    /**
     * @param request ReserveIntlDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReserveIntlDomainResponse
     */
    public ReserveIntlDomainResponse reserveIntlDomainWithOptions(ReserveIntlDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReserveIntlDomain"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReserveIntlDomainResponse());
    }

    /**
     * @param request ReserveIntlDomainRequest
     * @return ReserveIntlDomainResponse
     */
    public ReserveIntlDomainResponse reserveIntlDomain(ReserveIntlDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reserveIntlDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>严选列表导出，明日凌晨2点前生成文件，导出凌晨1点前所有在售严选域名</p>
     * 
     * @param request SelectedDomainListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectedDomainListResponse
     */
    public SelectedDomainListResponse selectedDomainListWithOptions(SelectedDomainListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listDate)) {
            query.put("ListDate", request.listDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectedDomainList"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectedDomainListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>严选列表导出，明日凌晨2点前生成文件，导出凌晨1点前所有在售严选域名</p>
     * 
     * @param request SelectedDomainListRequest
     * @return SelectedDomainListResponse
     */
    public SelectedDomainListResponse selectedDomainList(SelectedDomainListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.selectedDomainListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提交采购信息</p>
     * 
     * @param request SubmitPurchaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitPurchaseInfoResponse
     */
    public SubmitPurchaseInfoResponse submitPurchaseInfoWithOptions(SubmitPurchaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseCurrency)) {
            body.put("PurchaseCurrency", request.purchaseCurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchasePrice)) {
            body.put("PurchasePrice", request.purchasePrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseProofs)) {
            body.put("PurchaseProofs", request.purchaseProofs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitPurchaseInfo"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitPurchaseInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提交采购信息</p>
     * 
     * @param request SubmitPurchaseInfoRequest
     * @return SubmitPurchaseInfoResponse
     */
    public SubmitPurchaseInfoResponse submitPurchaseInfo(SubmitPurchaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitPurchaseInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>合作方同步报价</p>
     * 
     * @param request UpdatePartnerReservePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePartnerReservePriceResponse
     */
    public UpdatePartnerReservePriceResponse updatePartnerReservePriceWithOptions(UpdatePartnerReservePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.biddingId)) {
            body.put("BiddingId", request.biddingId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            body.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partnerType)) {
            body.put("PartnerType", request.partnerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservePrice)) {
            body.put("ReservePrice", request.reservePrice);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePartnerReservePrice"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePartnerReservePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>合作方同步报价</p>
     * 
     * @param request UpdatePartnerReservePriceRequest
     * @return UpdatePartnerReservePriceResponse
     */
    public UpdatePartnerReservePriceResponse updatePartnerReservePrice(UpdatePartnerReservePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePartnerReservePriceWithOptions(request, runtime);
    }
}
