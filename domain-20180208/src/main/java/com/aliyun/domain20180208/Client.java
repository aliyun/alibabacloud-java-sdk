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
     * <b>summary</b> : 
     * <p>闯入接口</p>
     * 
     * @param tmpReq BatchIntrudeDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchIntrudeDomainsResponse
     */
    public BatchIntrudeDomainsResponse batchIntrudeDomainsWithOptions(BatchIntrudeDomainsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchIntrudeDomainsShrinkRequest request = new BatchIntrudeDomainsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domainNames)) {
            request.domainNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domainNames, "DomainNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainNamesShrink)) {
            query.put("DomainNames", request.domainNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchIntrudeDomains"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchIntrudeDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>闯入接口</p>
     * 
     * @param request BatchIntrudeDomainsRequest
     * @return BatchIntrudeDomainsResponse
     */
    public BatchIntrudeDomainsResponse batchIntrudeDomains(BatchIntrudeDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchIntrudeDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据OutBizId（批量）查看带价PUSH状态，通常用于超时场景补偿</p>
     * 
     * @param tmpReq BatchQueryPushStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchQueryPushStatusResponse
     */
    public BatchQueryPushStatusResponse batchQueryPushStatusWithOptions(BatchQueryPushStatusRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchQueryPushStatusShrinkRequest request = new BatchQueryPushStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outBizIds)) {
            request.outBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outBizIds, "OutBizIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizIdsShrink)) {
            query.put("OutBizIds", request.outBizIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchQueryPushStatus"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchQueryPushStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据OutBizId（批量）查看带价PUSH状态，通常用于超时场景补偿</p>
     * 
     * @param request BatchQueryPushStatusRequest
     * @return BatchQueryPushStatusResponse
     */
    public BatchQueryPushStatusResponse batchQueryPushStatus(BatchQueryPushStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchQueryPushStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量撤回带价PUSH</p>
     * 
     * @param tmpReq BatchRecallPushRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRecallPushResponse
     */
    public BatchRecallPushResponse batchRecallPushWithOptions(BatchRecallPushRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchRecallPushShrinkRequest request = new BatchRecallPushShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.outBizIds)) {
            request.outBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.outBizIds, "OutBizIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.outBizIdsShrink)) {
            query.put("OutBizIds", request.outBizIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRecallPush"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRecallPushResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量撤回带价PUSH</p>
     * 
     * @param request BatchRecallPushRequest
     * @return BatchRecallPushResponse
     */
    public BatchRecallPushResponse batchRecallPush(BatchRecallPushRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchRecallPushWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>出价</p>
     * 
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
     * <b>summary</b> : 
     * <p>出价</p>
     * 
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
     * <p>校验域名带价PUSH接收方可接收</p>
     * 
     * @param request CheckPushReceiverRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckPushReceiverResponse
     */
    public CheckPushReceiverResponse checkPushReceiverWithOptions(CheckPushReceiverRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.receiverAccount)) {
            query.put("ReceiverAccount", request.receiverAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckPushReceiver"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckPushReceiverResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>校验域名带价PUSH接收方可接收</p>
     * 
     * @param request CheckPushReceiverRequest
     * @return CheckPushReceiverResponse
     */
    public CheckPushReceiverResponse checkPushReceiver(CheckPushReceiverRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkPushReceiverWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>发布域名PUSH，目前只支持0元PUSH</p>
     * 
     * @param tmpReq PushDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushDomainsResponse
     */
    public PushDomainsResponse pushDomainsWithOptions(PushDomainsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushDomainsShrinkRequest request = new PushDomainsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domainList)) {
            request.domainListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domainList, "DomainList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainListShrink)) {
            query.put("DomainList", request.domainListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizId)) {
            query.put("OutBizId", request.outBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishRemark)) {
            query.put("PublishRemark", request.publishRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receiverAccount)) {
            query.put("ReceiverAccount", request.receiverAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushDomains"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>发布域名PUSH，目前只支持0元PUSH</p>
     * 
     * @param request PushDomainsRequest
     * @return PushDomainsResponse
     */
    public PushDomainsResponse pushDomains(PushDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushDomainsWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>查询买家交易记录列表</p>
     * 
     * @param tmpReq QueryBuyerDomainTradeRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBuyerDomainTradeRecordsResponse
     */
    public QueryBuyerDomainTradeRecordsResponse queryBuyerDomainTradeRecordsWithOptions(QueryBuyerDomainTradeRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBuyerDomainTradeRecordsShrinkRequest request = new QueryBuyerDomainTradeRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.bizIdList)) {
            request.bizIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.bizIdList, "BizIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.domainNameList)) {
            request.domainNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.domainNameList, "DomainNameList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.suffixList)) {
            request.suffixListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.suffixList, "SuffixList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tradeTypeList)) {
            request.tradeTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tradeTypeList, "TradeTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizIdListShrink)) {
            query.put("BizIdList", request.bizIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainNameListShrink)) {
            query.put("DomainNameList", request.domainNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPrice)) {
            query.put("EndPrice", request.endPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sorter)) {
            query.put("Sorter", request.sorter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPrice)) {
            query.put("StartPrice", request.startPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            query.put("StatusList", request.statusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.suffixListShrink)) {
            query.put("SuffixList", request.suffixListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeTypeListShrink)) {
            query.put("TradeTypeList", request.tradeTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBuyerDomainTradeRecords"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBuyerDomainTradeRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询买家交易记录列表</p>
     * 
     * @param request QueryBuyerDomainTradeRecordsRequest
     * @return QueryBuyerDomainTradeRecordsResponse
     */
    public QueryBuyerDomainTradeRecordsResponse queryBuyerDomainTradeRecords(QueryBuyerDomainTradeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBuyerDomainTradeRecordsWithOptions(request, runtime);
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
     * <b>summary</b> : 
     * <p>查询汇率</p>
     * 
     * @param request QueryExchangeRateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExchangeRateResponse
     */
    public QueryExchangeRateResponse queryExchangeRateWithOptions(QueryExchangeRateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromCurrency)) {
            query.put("FromCurrency", request.fromCurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toCurrency)) {
            query.put("ToCurrency", request.toCurrency);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExchangeRate"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExchangeRateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询汇率</p>
     * 
     * @param request QueryExchangeRateRequest
     * @return QueryExchangeRateResponse
     */
    public QueryExchangeRateResponse queryExchangeRate(QueryExchangeRateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryExchangeRateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询竞价商品详情</p>
     * 
     * @param request QueryExportAuctionDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExportAuctionDetailResponse
     */
    public QueryExportAuctionDetailResponse queryExportAuctionDetailWithOptions(QueryExportAuctionDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auctionId)) {
            query.put("AuctionId", request.auctionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExportAuctionDetail"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExportAuctionDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询竞价商品详情</p>
     * 
     * @param request QueryExportAuctionDetailRequest
     * @return QueryExportAuctionDetailResponse
     */
    public QueryExportAuctionDetailResponse queryExportAuctionDetail(QueryExportAuctionDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryExportAuctionDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出的抢注域名</p>
     * 
     * @param request QueryExportDomainExpireSnatchsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryExportDomainExpireSnatchsResponse
     */
    public QueryExportDomainExpireSnatchsResponse queryExportDomainExpireSnatchsWithOptions(QueryExportDomainExpireSnatchsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentId)) {
            query.put("CurrentId", request.currentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryExportDomainExpireSnatchs"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryExportDomainExpireSnatchsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询导出的抢注域名</p>
     * 
     * @param request QueryExportDomainExpireSnatchsRequest
     * @return QueryExportDomainExpireSnatchsResponse
     */
    public QueryExportDomainExpireSnatchsResponse queryExportDomainExpireSnatchs(QueryExportDomainExpireSnatchsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryExportDomainExpireSnatchsWithOptions(request, runtime);
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

    /**
     * <b>summary</b> : 
     * <p>域名建站添加DNS记录</p>
     * 
     * @param request WebsiteAddDnsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WebsiteAddDnsRecordResponse
     */
    public WebsiteAddDnsRecordResponse websiteAddDnsRecordWithOptions(WebsiteAddDnsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websiteNo)) {
            query.put("WebsiteNo", request.websiteNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WebsiteAddDnsRecord"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WebsiteAddDnsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>域名建站添加DNS记录</p>
     * 
     * @param request WebsiteAddDnsRecordRequest
     * @return WebsiteAddDnsRecordResponse
     */
    public WebsiteAddDnsRecordResponse websiteAddDnsRecord(WebsiteAddDnsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.websiteAddDnsRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>域名建站删除DNS记录</p>
     * 
     * @param request WebsiteDeleteDnsRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return WebsiteDeleteDnsRecordResponse
     */
    public WebsiteDeleteDnsRecordResponse websiteDeleteDnsRecordWithOptions(WebsiteDeleteDnsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainName)) {
            query.put("DomainName", request.domainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rr)) {
            query.put("Rr", request.rr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.websiteNo)) {
            query.put("WebsiteNo", request.websiteNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "WebsiteDeleteDnsRecord"),
            new TeaPair("version", "2018-02-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new WebsiteDeleteDnsRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>域名建站删除DNS记录</p>
     * 
     * @param request WebsiteDeleteDnsRecordRequest
     * @return WebsiteDeleteDnsRecordResponse
     */
    public WebsiteDeleteDnsRecordResponse websiteDeleteDnsRecord(WebsiteDeleteDnsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.websiteDeleteDnsRecordWithOptions(request, runtime);
    }
}
