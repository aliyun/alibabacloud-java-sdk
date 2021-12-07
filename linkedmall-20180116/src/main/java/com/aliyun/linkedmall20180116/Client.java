// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116;

import com.aliyun.tea.*;
import com.aliyun.linkedmall20180116.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-south-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "linkedmall.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-chengdu", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-edge-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-fujian", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-wuhan", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "linkedmall.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-central-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1", "linkedmall.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "linkedmall.aliyuncs.com"),
            new TeaPair("me-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "linkedmall.aliyuncs.com"),
            new TeaPair("us-east-1", "linkedmall.aliyuncs.com"),
            new TeaPair("us-west-1", "linkedmall.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("linkedmall", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddAddressResponse addAddressWithOptions(AddAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAddressResponse());
    }

    public AddAddressResponse addAddress(AddAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAddressWithOptions(request, runtime);
    }

    public AddItemLimitRuleResponse addItemLimitRuleWithOptions(AddItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BeginTime", request.beginTime);
        query.put("BizId", request.bizId);
        query.put("EndTime", request.endTime);
        query.put("ItemId", request.itemId);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("RuleType", request.ruleType);
        query.put("SubBizCode", request.subBizCode);
        query.put("UpperNum", request.upperNum);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddItemLimitRuleResponse());
    }

    public AddItemLimitRuleResponse addItemLimitRule(AddItemLimitRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addItemLimitRuleWithOptions(request, runtime);
    }

    public AddItemToSubBizsResponse addItemToSubBizsWithOptions(AddItemToSubBizsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddItemToSubBizsShrinkRequest request = new AddItemToSubBizsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subBizIds)) {
            request.subBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subBizIds, "SubBizIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddItemToSubBizs"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddItemToSubBizsResponse());
    }

    public AddItemToSubBizsResponse addItemToSubBizs(AddItemToSubBizsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addItemToSubBizsWithOptions(request, runtime);
    }

    public AddSupplierNewItemsResponse addSupplierNewItemsWithOptions(AddSupplierNewItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemList", request.itemList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSupplierNewItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSupplierNewItemsResponse());
    }

    public AddSupplierNewItemsResponse addSupplierNewItems(AddSupplierNewItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSupplierNewItemsWithOptions(request, runtime);
    }

    public ApplyRefundResponse applyRefundWithOptions(ApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("ApplyReasonTextId", request.applyReasonTextId);
        query.put("ApplyRefundCount", request.applyRefundCount);
        query.put("ApplyRefundFee", request.applyRefundFee);
        query.put("BizClaimType", request.bizClaimType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("GoodsStatus", request.goodsStatus);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyRefundResponse());
    }

    public ApplyRefundResponse applyRefund(ApplyRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyRefundWithOptions(request, runtime);
    }

    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccountWithOptions(BatchRegistAnonymousTbAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("IdJsonList", request.idJsonList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRegistAnonymousTbAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRegistAnonymousTbAccountResponse());
    }

    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccount(BatchRegistAnonymousTbAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegistAnonymousTbAccountWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public CancelRefundResponse cancelRefundWithOptions(CancelRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("DisputeId", request.disputeId);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRefundResponse());
    }

    public CancelRefundResponse cancelRefund(CancelRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRefundWithOptions(request, runtime);
    }

    public ConfirmDisburseResponse confirmDisburseWithOptions(ConfirmDisburseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDisburse"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDisburseResponse());
    }

    public ConfirmDisburseResponse confirmDisburse(ConfirmDisburseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmDisburseWithOptions(request, runtime);
    }

    public CreateMovieTicketOrderResponse createMovieTicketOrderWithOptions(CreateMovieTicketOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMovieTicketOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMovieTicketOrderResponse());
    }

    public CreateMovieTicketOrderResponse createMovieTicketOrder(CreateMovieTicketOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMovieTicketOrderWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("BuyerMessageMap", request.buyerMessageMap);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("ExtJson", request.extJson);
        query.put("ItemId", request.itemId);
        query.put("ItemList", request.itemList);
        query.put("LmItemId", request.lmItemId);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("OutTradeId", request.outTradeId);
        query.put("Quantity", request.quantity);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("TotalAmount", request.totalAmount);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public CreateOrderV2Response createOrderV2WithOptions(CreateOrderV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("BuyerMessageMap", request.buyerMessageMap);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("ExtJson", request.extJson);
        query.put("ItemId", request.itemId);
        query.put("ItemList", request.itemList);
        query.put("LmItemId", request.lmItemId);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("OutTradeId", request.outTradeId);
        query.put("Quantity", request.quantity);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("TotalAmount", request.totalAmount);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrderV2"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderV2Response());
    }

    public CreateOrderV2Response createOrderV2(CreateOrderV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderV2WithOptions(request, runtime);
    }

    public CreatePayUrlResponse createPayUrlWithOptions(CreatePayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePayUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePayUrlResponse());
    }

    public CreatePayUrlResponse createPayUrl(CreatePayUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPayUrlWithOptions(request, runtime);
    }

    public CreateSettleConfirmResponse createSettleConfirmWithOptions(CreateSettleConfirmRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSettleConfirm"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSettleConfirmResponse());
    }

    public CreateSettleConfirmResponse createSettleConfirm(CreateSettleConfirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSettleConfirmWithOptions(request, runtime);
    }

    public CreateVirtualProductOrderResponse createVirtualProductOrderWithOptions(CreateVirtualProductOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("ExtJson", request.extJson);
        query.put("ItemId", request.itemId);
        query.put("ItemList", request.itemList);
        query.put("LmItemId", request.lmItemId);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("OutTradeId", request.outTradeId);
        query.put("Quantity", request.quantity);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("TotalAmount", request.totalAmount);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualProductOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualProductOrderResponse());
    }

    public CreateVirtualProductOrderResponse createVirtualProductOrder(CreateVirtualProductOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualProductOrderWithOptions(request, runtime);
    }

    public CreateWithholdTradeResponse createWithholdTradeWithOptions(CreateWithholdTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWithholdTrade"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWithholdTradeResponse());
    }

    public CreateWithholdTradeResponse createWithholdTrade(CreateWithholdTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWithholdTradeWithOptions(request, runtime);
    }

    public DeductUserPointResponse deductUserPointWithOptions(DeductUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeductUserPointShrinkRequest request = new DeductUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("RuleId", request.ruleId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeductUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeductUserPointResponse());
    }

    public DeductUserPointResponse deductUserPoint(DeductUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deductUserPointWithOptions(request, runtime);
    }

    public DeleteBizItemsResponse deleteBizItemsWithOptions(DeleteBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemIdList", request.itemIdList);
        query.put("SubBizId", request.subBizId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBizItemsResponse());
    }

    public DeleteBizItemsResponse deleteBizItems(DeleteBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBizItemsWithOptions(request, runtime);
    }

    public DeleteItemLimitRuleResponse deleteItemLimitRuleWithOptions(DeleteItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemId", request.itemId);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("RuleId", request.ruleId);
        query.put("SubBizCode", request.subBizCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteItemLimitRuleResponse());
    }

    public DeleteItemLimitRuleResponse deleteItemLimitRule(DeleteItemLimitRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteItemLimitRuleWithOptions(request, runtime);
    }

    public EnableOrderResponse enableOrderWithOptions(EnableOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("LmOrderId", request.lmOrderId);
        query.put("OutTradeId", request.outTradeId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableOrderResponse());
    }

    public EnableOrderResponse enableOrder(EnableOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableOrderWithOptions(request, runtime);
    }

    public ExecuteNodeResponse executeNodeWithOptions(ExecuteNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("NodeId", request.nodeId);
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("ProcessId", request.processId);
        query.put("ProcessInstanceId", request.processInstanceId);
        query.put("RequestData", request.requestData);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteNode"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteNodeResponse());
    }

    public ExecuteNodeResponse executeNode(ExecuteNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeNodeWithOptions(request, runtime);
    }

    public FreezeUserPointResponse freezeUserPointWithOptions(FreezeUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FreezeUserPointShrinkRequest request = new FreezeUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("RuleId", request.ruleId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FreezeUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FreezeUserPointResponse());
    }

    public FreezeUserPointResponse freezeUserPoint(FreezeUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.freezeUserPointWithOptions(request, runtime);
    }

    public GetActivityGameInfoResponse getActivityGameInfoWithOptions(GetActivityGameInfoRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetActivityGameInfoShrinkRequest request = new GetActivityGameInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("ActivityId", request.activityId);
        query.put("BizId", request.bizId);
        query.put("GameId", request.gameId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActivityGameInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActivityGameInfoResponse());
    }

    public GetActivityGameInfoResponse getActivityGameInfo(GetActivityGameInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getActivityGameInfoWithOptions(request, runtime);
    }

    public GetCategoryChainResponse getCategoryChainWithOptions(GetCategoryChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CategoryId", request.categoryId);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategoryChain"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoryChainResponse());
    }

    public GetCategoryChainResponse getCategoryChain(GetCategoryChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoryChainWithOptions(request, runtime);
    }

    public GetCategoryListResponse getCategoryListWithOptions(GetCategoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CategoryId", request.categoryId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCategoryList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCategoryListResponse());
    }

    public GetCategoryListResponse getCategoryList(GetCategoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoryListWithOptions(request, runtime);
    }

    public GetCustomServiceUrlResponse getCustomServiceUrlWithOptions(GetCustomServiceUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("Cuid", request.cuid);
        query.put("Nick", request.nick);
        query.put("SellerId", request.sellerId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomServiceUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomServiceUrlResponse());
    }

    public GetCustomServiceUrlResponse getCustomServiceUrl(GetCustomServiceUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomServiceUrlWithOptions(request, runtime);
    }

    public GetGuidePageResponse getGuidePageWithOptions(GetGuidePageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGuidePage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGuidePageResponse());
    }

    public GetGuidePageResponse getGuidePage(GetGuidePageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGuidePageWithOptions(request, runtime);
    }

    public GetItemPromotionResponse getItemPromotionWithOptions(GetItemPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetItemPromotion"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetItemPromotionResponse());
    }

    public GetItemPromotionResponse getItemPromotion(GetItemPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getItemPromotionWithOptions(request, runtime);
    }

    public GetLoginPageResponse getLoginPageWithOptions(GetLoginPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginPage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginPageResponse());
    }

    public GetLoginPageResponse getLoginPage(GetLoginPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginPageWithOptions(request, runtime);
    }

    public GetSwitchUrlResponse getSwitchUrlWithOptions(GetSwitchUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSwitchUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSwitchUrlResponse());
    }

    public GetSwitchUrlResponse getSwitchUrl(GetSwitchUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSwitchUrlWithOptions(request, runtime);
    }

    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AppName", request.appName);
        query.put("BizId", request.bizId);
        query.put("UserFlag", request.userFlag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserInfoResponse());
    }

    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserInfoWithOptions(request, runtime);
    }

    public GetUserTokenPageResponse getUserTokenPageWithOptions(GetUserTokenPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserTokenPage"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserTokenPageResponse());
    }

    public GetUserTokenPageResponse getUserTokenPage(GetUserTokenPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserTokenPageWithOptions(request, runtime);
    }

    public GetWithholdSignPageUrlResponse getWithholdSignPageUrlWithOptions(GetWithholdSignPageUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWithholdSignPageUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWithholdSignPageUrlResponse());
    }

    public GetWithholdSignPageUrlResponse getWithholdSignPageUrl(GetWithholdSignPageUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWithholdSignPageUrlWithOptions(request, runtime);
    }

    public GiveUserPointResponse giveUserPointWithOptions(GiveUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GiveUserPointShrinkRequest request = new GiveUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("RuleId", request.ruleId);
        query.put("TargetBizUid", request.targetBizUid);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GiveUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GiveUserPointResponse());
    }

    public GiveUserPointResponse giveUserPoint(GiveUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.giveUserPointWithOptions(request, runtime);
    }

    public GrantPromotionToUserResponse grantPromotionToUserWithOptions(GrantPromotionToUserRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantPromotionToUserShrinkRequest request = new GrantPromotionToUserShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExpireSeconds", request.expireSeconds);
        query.put("GrantMode", request.grantMode);
        query.put("GrantWay", request.grantWay);
        query.put("IdempotentId", request.idempotentId);
        query.put("PromotionId", request.promotionId);
        query.put("SecurityCode", request.securityCode);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantPromotionToUser"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPromotionToUserResponse());
    }

    public GrantPromotionToUserResponse grantPromotionToUser(GrantPromotionToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantPromotionToUserWithOptions(request, runtime);
    }

    public GrantUserPointResponse grantUserPointWithOptions(GrantUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GrantUserPointShrinkRequest request = new GrantUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("RuleId", request.ruleId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPointResponse());
    }

    public GrantUserPointResponse grantUserPoint(GrantUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantUserPointWithOptions(request, runtime);
    }

    public InitApplyRefundResponse initApplyRefundWithOptions(InitApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizClaimType", request.bizClaimType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("GoodsStatus", request.goodsStatus);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitApplyRefund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitApplyRefundResponse());
    }

    public InitApplyRefundResponse initApplyRefund(InitApplyRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initApplyRefundWithOptions(request, runtime);
    }

    public ListActivityAtmosphereResponse listActivityAtmosphereWithOptions(ListActivityAtmosphereRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActivityAtmosphere"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActivityAtmosphereResponse());
    }

    public ListActivityAtmosphereResponse listActivityAtmosphere(ListActivityAtmosphereRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActivityAtmosphereWithOptions(request, runtime);
    }

    public ListActivityGameInfoResponse listActivityGameInfoWithOptions(ListActivityGameInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListActivityGameInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActivityGameInfoResponse());
    }

    public ListActivityGameInfoResponse listActivityGameInfo(ListActivityGameInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActivityGameInfoWithOptions(request, runtime);
    }

    public ListItemActivitiesResponse listItemActivitiesWithOptions(ListItemActivitiesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListItemActivitiesShrinkRequest request = new ListItemActivitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemIds", request.itemIdsShrink);
        query.put("LmItemIds", request.lmItemIdsShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListItemActivities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListItemActivitiesResponse());
    }

    public ListItemActivitiesResponse listItemActivities(ListItemActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listItemActivitiesWithOptions(request, runtime);
    }

    public ListUserGameProcessResponse listUserGameProcessWithOptions(ListUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserGameProcessResponse());
    }

    public ListUserGameProcessResponse listUserGameProcess(ListUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserGameProcessWithOptions(request, runtime);
    }

    public ListUserPointRecordsResponse listUserPointRecordsWithOptions(ListUserPointRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPointRecords"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPointRecordsResponse());
    }

    public ListUserPointRecordsResponse listUserPointRecords(ListUserPointRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserPointRecordsWithOptions(request, runtime);
    }

    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItemsWithOptions(ModifyBasicAndBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizId", request.subBizId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBasicAndBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBasicAndBizItemsResponse());
    }

    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItems(ModifyBasicAndBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBasicAndBizItemsWithOptions(request, runtime);
    }

    public ModifyBizItemsResponse modifyBizItemsWithOptions(ModifyBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizId", request.subBizId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBizItemsResponse());
    }

    public ModifyBizItemsResponse modifyBizItems(ModifyBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBizItemsWithOptions(request, runtime);
    }

    public ModifyItemLimitRuleResponse modifyItemLimitRuleWithOptions(ModifyItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BeginTime", request.beginTime);
        query.put("BizId", request.bizId);
        query.put("EndTime", request.endTime);
        query.put("ItemId", request.itemId);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("RuleId", request.ruleId);
        query.put("RuleType", request.ruleType);
        query.put("SubBizCode", request.subBizCode);
        query.put("UpperNum", request.upperNum);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyItemLimitRule"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyItemLimitRuleResponse());
    }

    public ModifyItemLimitRuleResponse modifyItemLimitRule(ModifyItemLimitRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyItemLimitRuleWithOptions(request, runtime);
    }

    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddressWithOptions(ModifyOrderDeliveryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("ExtJson", request.extJson);
        query.put("LmOrderId", request.lmOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOrderDeliveryAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOrderDeliveryAddressResponse());
    }

    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddress(ModifyOrderDeliveryAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOrderDeliveryAddressWithOptions(request, runtime);
    }

    public NotifyPayOrderStatusResponse notifyPayOrderStatusWithOptions(NotifyPayOrderStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("ChannelId", request.channelId);
        query.put("OperationDate", request.operationDate);
        query.put("PayTypes", request.payTypes);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NotifyPayOrderStatus"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NotifyPayOrderStatusResponse());
    }

    public NotifyPayOrderStatusResponse notifyPayOrderStatus(NotifyPayOrderStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyPayOrderStatusWithOptions(request, runtime);
    }

    public NotifyWithholdFundResponse notifyWithholdFundWithOptions(NotifyWithholdFundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("ChannelId", request.channelId);
        query.put("OperationDate", request.operationDate);
        query.put("PayTypes", request.payTypes);
        query.put("RequestId", request.requestId);
        query.put("TenantOrderId", request.tenantOrderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "NotifyWithholdFund"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new NotifyWithholdFundResponse());
    }

    public NotifyWithholdFundResponse notifyWithholdFund(NotifyWithholdFundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyWithholdFundWithOptions(request, runtime);
    }

    public PushUserGameProcessResponse pushUserGameProcessWithOptions(PushUserGameProcessRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PushUserGameProcessShrinkRequest request = new PushUserGameProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.body)) {
            request.bodyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.body, "body", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("CurrentStepId", request.currentStepId);
        query.put("ProcessId", request.processId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUserGameProcessResponse());
    }

    public PushUserGameProcessResponse pushUserGameProcess(PushUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushUserGameProcessWithOptions(request, runtime);
    }

    public QueryActivityItemsResponse queryActivityItemsWithOptions(QueryActivityItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LmActivityId", request.lmActivityId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryActivityItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryActivityItemsResponse());
    }

    public QueryActivityItemsResponse queryActivityItems(QueryActivityItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryActivityItemsWithOptions(request, runtime);
    }

    public QueryAddressResponse queryAddressWithOptions(QueryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("DivisionCode", request.divisionCode);
        query.put("Ip", request.ip);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressResponse());
    }

    public QueryAddressResponse queryAddress(QueryAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressWithOptions(request, runtime);
    }

    public QueryAddressDetailResponse queryAddressDetailWithOptions(QueryAddressDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressInfo", request.addressInfo);
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddressDetail"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressDetailResponse());
    }

    public QueryAddressDetailResponse queryAddressDetail(QueryAddressDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressDetailWithOptions(request, runtime);
    }

    public QueryAddressListResponse queryAddressListWithOptions(QueryAddressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAddressList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAddressListResponse());
    }

    public QueryAddressListResponse queryAddressList(QueryAddressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressListWithOptions(request, runtime);
    }

    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfoWithOptions(QueryAdvertisementSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ChannelId", request.channelId);
        query.put("EndTime", request.endTime);
        query.put("ExtInfo", request.extInfo);
        query.put("MediaSettleDetailId", request.mediaSettleDetailId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SettleNo", request.settleNo);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAdvertisementSettleInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAdvertisementSettleInfoResponse());
    }

    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfo(QueryAdvertisementSettleInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAdvertisementSettleInfoWithOptions(request, runtime);
    }

    public QueryAgreementResponse queryAgreementWithOptions(QueryAgreementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAgreement"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAgreementResponse());
    }

    public QueryAgreementResponse queryAgreement(QueryAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgreementWithOptions(request, runtime);
    }

    public QueryAllCinemasResponse queryAllCinemasWithOptions(QueryAllCinemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CityCode", request.cityCode);
        query.put("ExtJson", request.extJson);
        query.put("PageNumber", request.pageNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllCinemas"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllCinemasResponse());
    }

    public QueryAllCinemasResponse queryAllCinemas(QueryAllCinemasRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllCinemasWithOptions(request, runtime);
    }

    public QueryAllCitiesResponse queryAllCitiesWithOptions(QueryAllCitiesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryAllCitiesShrinkRequest request = new QueryAllCitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extJson)) {
            request.extJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extJson, "ExtJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJsonShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllCities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllCitiesResponse());
    }

    public QueryAllCitiesResponse queryAllCities(QueryAllCitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllCitiesWithOptions(request, runtime);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResultWithOptions(QueryBatchRegistAnonymousTbAccountResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BatchId", request.batchId);
        query.put("BizId", request.bizId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBatchRegistAnonymousTbAccountResult"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBatchRegistAnonymousTbAccountResultResponse());
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResult(QueryBatchRegistAnonymousTbAccountResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBatchRegistAnonymousTbAccountResultWithOptions(request, runtime);
    }

    public QueryBestSession4ItemsResponse queryBestSession4ItemsWithOptions(QueryBestSession4ItemsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBestSession4ItemsShrinkRequest request = new QueryBestSession4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemIds", request.itemIdsShrink);
        query.put("LmItemIds", request.lmItemIdsShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBestSession4Items"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBestSession4ItemsResponse());
    }

    public QueryBestSession4ItemsResponse queryBestSession4Items(QueryBestSession4ItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBestSession4ItemsWithOptions(request, runtime);
    }

    public QueryBizItemListResponse queryBizItemListWithOptions(QueryBizItemListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemListShrinkRequest request = new QueryBizItemListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CategoryId", request.categoryId);
        query.put("ItemIds", request.itemIdsShrink);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SubBizId", request.subBizId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemListResponse());
    }

    public QueryBizItemListResponse queryBizItemList(QueryBizItemListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizItemListWithOptions(request, runtime);
    }

    public QueryBizItemsResponse queryBizItemsWithOptions(QueryBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SubBizId", request.subBizId);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItems"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemsResponse());
    }

    public QueryBizItemsResponse queryBizItems(QueryBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizItemsWithOptions(request, runtime);
    }

    public QueryBizItemsWithActivityResponse queryBizItemsWithActivityWithOptions(QueryBizItemsWithActivityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemsWithActivityShrinkRequest request = new QueryBizItemsWithActivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBizItemsWithActivity"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBizItemsWithActivityResponse());
    }

    public QueryBizItemsWithActivityResponse queryBizItemsWithActivity(QueryBizItemsWithActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizItemsWithActivityWithOptions(request, runtime);
    }

    public QueryBudgetTicketItemListByBizIdResponse queryBudgetTicketItemListByBizIdWithOptions(QueryBudgetTicketItemListByBizIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BudgetTicketNo", request.budgetTicketNo);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBudgetTicketItemListByBizId"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBudgetTicketItemListByBizIdResponse());
    }

    public QueryBudgetTicketItemListByBizIdResponse queryBudgetTicketItemListByBizId(QueryBudgetTicketItemListByBizIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBudgetTicketItemListByBizIdWithOptions(request, runtime);
    }

    public QueryGuideItemGroupResponse queryGuideItemGroupWithOptions(QueryGuideItemGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("GroupId", request.groupId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideItemGroup"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideItemGroupResponse());
    }

    public QueryGuideItemGroupResponse queryGuideItemGroup(QueryGuideItemGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGuideItemGroupWithOptions(request, runtime);
    }

    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventoryWithOptions(QueryGuideItemGroupWithOutInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryGuideItemGroupWithOutInventory"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryGuideItemGroupWithOutInventoryResponse());
    }

    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventory(QueryGuideItemGroupWithOutInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGuideItemGroupWithOutInventoryWithOptions(request, runtime);
    }

    public QueryHotMoviesResponse queryHotMoviesWithOptions(QueryHotMoviesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CityCode", request.cityCode);
        query.put("ExtJson", request.extJson);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryHotMovies"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryHotMoviesResponse());
    }

    public QueryHotMoviesResponse queryHotMovies(QueryHotMoviesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryHotMoviesWithOptions(request, runtime);
    }

    public QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroupWithOptions(QueryInventoryOfItemsInBizItemGroupRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryInventoryOfItemsInBizItemGroupShrinkRequest request = new QueryInventoryOfItemsInBizItemGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInventoryOfItemsInBizItemGroup"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInventoryOfItemsInBizItemGroupResponse());
    }

    public QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroup(QueryInventoryOfItemsInBizItemGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInventoryOfItemsInBizItemGroupWithOptions(request, runtime);
    }

    public QueryItemDetailResponse queryItemDetailWithOptions(QueryItemDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetail"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailResponse());
    }

    public QueryItemDetailResponse queryItemDetail(QueryItemDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailWithOptions(request, runtime);
    }

    public QueryItemDetailInnerResponse queryItemDetailInnerWithOptions(QueryItemDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("DivisionCode", request.divisionCode);
        query.put("Ip", request.ip);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetailInner"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailInnerResponse());
    }

    public QueryItemDetailInnerResponse queryItemDetailInner(QueryItemDetailInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailInnerWithOptions(request, runtime);
    }

    public QueryItemDetailTeaResponse queryItemDetailTeaWithOptions(QueryItemDetailTeaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemDetailTea"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemDetailTeaResponse());
    }

    public QueryItemDetailTeaResponse queryItemDetailTea(QueryItemDetailTeaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailTeaWithOptions(request, runtime);
    }

    public QueryItemInSubBizsResponse queryItemInSubBizsWithOptions(QueryItemInSubBizsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryItemInSubBizsShrinkRequest request = new QueryItemInSubBizsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.subBizIds)) {
            request.subBizIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.subBizIds, "SubBizIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemInSubBizs"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemInSubBizsResponse());
    }

    public QueryItemInSubBizsResponse queryItemInSubBizs(QueryItemInSubBizsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemInSubBizsWithOptions(request, runtime);
    }

    public QueryItemInventoryResponse queryItemInventoryWithOptions(QueryItemInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("DivisionCode", request.divisionCode);
        query.put("Ip", request.ip);
        query.put("ItemList", request.itemList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryItemInventory"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryItemInventoryResponse());
    }

    public QueryItemInventoryResponse queryItemInventory(QueryItemInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemInventoryWithOptions(request, runtime);
    }

    public QueryLogisticsResponse queryLogisticsWithOptions(QueryLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryLogisticsResponse());
    }

    public QueryLogisticsResponse queryLogistics(QueryLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLogisticsWithOptions(request, runtime);
    }

    public QueryMediaSettleInfoResponse queryMediaSettleInfoWithOptions(QueryMediaSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ChannelId", request.channelId);
        query.put("EndTime", request.endTime);
        query.put("ExtInfo", request.extInfo);
        query.put("MediaName", request.mediaName);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("SettleNo", request.settleNo);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMediaSettleInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMediaSettleInfoResponse());
    }

    public QueryMediaSettleInfoResponse queryMediaSettleInfo(QueryMediaSettleInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaSettleInfoWithOptions(request, runtime);
    }

    public QueryMessagesResponse queryMessagesWithOptions(QueryMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJson);
        query.put("Topic", request.topic);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMessages"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMessagesResponse());
    }

    public QueryMessagesResponse queryMessages(QueryMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMessagesWithOptions(request, runtime);
    }

    public QueryMovieCommentsResponse queryMovieCommentsWithOptions(QueryMovieCommentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJson);
        query.put("MovieId", request.movieId);
        query.put("PageNumber", request.pageNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieComments"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieCommentsResponse());
    }

    public QueryMovieCommentsResponse queryMovieComments(QueryMovieCommentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieCommentsWithOptions(request, runtime);
    }

    public QueryMovieSchedulesResponse queryMovieSchedulesWithOptions(QueryMovieSchedulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CinemaId", request.cinemaId);
        query.put("ExtJson", request.extJson);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieSchedules"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieSchedulesResponse());
    }

    public QueryMovieSchedulesResponse queryMovieSchedules(QueryMovieSchedulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieSchedulesWithOptions(request, runtime);
    }

    public QueryMovieSeatsResponse queryMovieSeatsWithOptions(QueryMovieSeatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJson);
        query.put("ScheduleId", request.scheduleId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieSeats"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieSeatsResponse());
    }

    public QueryMovieSeatsResponse queryMovieSeats(QueryMovieSeatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieSeatsWithOptions(request, runtime);
    }

    public QueryMovieTicketsResponse queryMovieTicketsWithOptions(QueryMovieTicketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMovieTickets"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMovieTicketsResponse());
    }

    public QueryMovieTicketsResponse queryMovieTickets(QueryMovieTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieTicketsWithOptions(request, runtime);
    }

    public QueryOrderAndPaymentListResponse queryOrderAndPaymentListWithOptions(QueryOrderAndPaymentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("FilterOption", request.filterOption);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderAndPaymentList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderAndPaymentListResponse());
    }

    public QueryOrderAndPaymentListResponse queryOrderAndPaymentList(QueryOrderAndPaymentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderAndPaymentListWithOptions(request, runtime);
    }

    public QueryOrderCommissionRateResponse queryOrderCommissionRateWithOptions(QueryOrderCommissionRateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderCommissionRate"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderCommissionRateResponse());
    }

    public QueryOrderCommissionRateResponse queryOrderCommissionRate(QueryOrderCommissionRateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderCommissionRateWithOptions(request, runtime);
    }

    public QueryOrderDetailInnerResponse queryOrderDetailInnerWithOptions(QueryOrderDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("FilterOption", request.filterOption);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderDetailInner"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderDetailInnerResponse());
    }

    public QueryOrderDetailInnerResponse queryOrderDetailInner(QueryOrderDetailInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderDetailInnerWithOptions(request, runtime);
    }

    public QueryOrderIdByPayIdResponse queryOrderIdByPayIdWithOptions(QueryOrderIdByPayIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("PaymentId", request.paymentId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderIdByPayId"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderIdByPayIdResponse());
    }

    public QueryOrderIdByPayIdResponse queryOrderIdByPayId(QueryOrderIdByPayIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderIdByPayIdWithOptions(request, runtime);
    }

    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSaleWithOptions(QueryOrderInfoAfterSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderInfoAfterSale"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderInfoAfterSaleResponse());
    }

    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSale(QueryOrderInfoAfterSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderInfoAfterSaleWithOptions(request, runtime);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("PaymentId", request.paymentId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderItemInfoByPaymentIdForAiZhanYou"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderItemInfoByPaymentIdForAiZhanYouResponse());
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYou(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(request, runtime);
    }

    public QueryOrderListResponse queryOrderListWithOptions(QueryOrderListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("FilterOption", request.filterOption);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderList"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderListResponse());
    }

    public QueryOrderListResponse queryOrderList(QueryOrderListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderListWithOptions(request, runtime);
    }

    public QueryOrderLogisticsResponse queryOrderLogisticsWithOptions(QueryOrderLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderLogisticsResponse());
    }

    public QueryOrderLogisticsResponse queryOrderLogistics(QueryOrderLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderLogisticsWithOptions(request, runtime);
    }

    public QueryRefundApplicationDetailResponse queryRefundApplicationDetailWithOptions(QueryRefundApplicationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRefundApplicationDetail"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRefundApplicationDetailResponse());
    }

    public QueryRefundApplicationDetailResponse queryRefundApplicationDetail(QueryRefundApplicationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRefundApplicationDetailWithOptions(request, runtime);
    }

    public QueryStatementsResponse queryStatementsWithOptions(QueryStatementsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("EndTime", request.endTime);
        query.put("ExtInfo", request.extInfo);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("PayeeIds", request.payeeIds);
        query.put("SettleNoes", request.settleNoes);
        query.put("SettleStatus", request.settleStatus);
        query.put("SettleType", request.settleType);
        query.put("StartTime", request.startTime);
        query.put("TenantId", request.tenantId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryStatements"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryStatementsResponse());
    }

    public QueryStatementsResponse queryStatements(QueryStatementsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStatementsWithOptions(request, runtime);
    }

    public QueryUnfinishedActivitiesResponse queryUnfinishedActivitiesWithOptions(QueryUnfinishedActivitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedActivities"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedActivitiesResponse());
    }

    public QueryUnfinishedActivitiesResponse queryUnfinishedActivities(QueryUnfinishedActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnfinishedActivitiesWithOptions(request, runtime);
    }

    public QueryUnfinishedSessionsResponse queryUnfinishedSessionsWithOptions(QueryUnfinishedSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("QueryTime", request.queryTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedSessions"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedSessionsResponse());
    }

    public QueryUnfinishedSessionsResponse queryUnfinishedSessions(QueryUnfinishedSessionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnfinishedSessionsWithOptions(request, runtime);
    }

    public QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4ItemsWithOptions(QueryUnfinishedSessions4ItemsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUnfinishedSessions4ItemsShrinkRequest request = new QueryUnfinishedSessions4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemIds", request.itemIdsShrink);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("QueryTime", request.queryTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUnfinishedSessions4Items"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUnfinishedSessions4ItemsResponse());
    }

    public QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4Items(QueryUnfinishedSessions4ItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnfinishedSessions4ItemsWithOptions(request, runtime);
    }

    public QueryUpcomingMoviesResponse queryUpcomingMoviesWithOptions(QueryUpcomingMoviesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUpcomingMoviesShrinkRequest request = new QueryUpcomingMoviesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extJson)) {
            request.extJsonShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extJson, "ExtJson", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CityCode", request.cityCode);
        query.put("ExtJson", request.extJsonShrink);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUpcomingMovies"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUpcomingMoviesResponse());
    }

    public QueryUpcomingMoviesResponse queryUpcomingMovies(QueryUpcomingMoviesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUpcomingMoviesWithOptions(request, runtime);
    }

    public QueryUserGameProcessResponse queryUserGameProcessWithOptions(QueryUserGameProcessRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserGameProcessShrinkRequest request = new QueryUserGameProcessShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("ProcessId", request.processId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserGameProcessResponse());
    }

    public QueryUserGameProcessResponse queryUserGameProcess(QueryUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserGameProcessWithOptions(request, runtime);
    }

    public QueryUserPointResponse queryUserPointWithOptions(QueryUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUserPointShrinkRequest request = new QueryUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserPointResponse());
    }

    public QueryUserPointResponse queryUserPoint(QueryUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserPointWithOptions(request, runtime);
    }

    public QueryWithholdTradeResponse queryWithholdTradeWithOptions(QueryWithholdTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryWithholdTrade"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryWithholdTradeResponse());
    }

    public QueryWithholdTradeResponse queryWithholdTrade(QueryWithholdTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryWithholdTradeWithOptions(request, runtime);
    }

    public RefundOrderResponse refundOrderWithOptions(RefundOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundOrderResponse());
    }

    public RefundOrderResponse refundOrder(RefundOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundOrderWithOptions(request, runtime);
    }

    public RefundPointResponse refundPointWithOptions(RefundPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LmOrderId", request.lmOrderId);
        query.put("Reason", request.reason);
        query.put("SellerId", request.sellerId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundPointResponse());
    }

    public RefundPointResponse refundPoint(RefundPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundPointWithOptions(request, runtime);
    }

    public RefundUserPointResponse refundUserPointWithOptions(RefundUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RefundUserPointShrinkRequest request = new RefundUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("OriginRecordId", request.originRecordId);
        query.put("RuleId", request.ruleId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundUserPointResponse());
    }

    public RefundUserPointResponse refundUserPoint(RefundUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundUserPointWithOptions(request, runtime);
    }

    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTaskWithOptions(RefuseMerchantSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SellerNick", request.sellerNick);
        query.put("TaskId", request.taskId);
        query.put("TimeStamp", request.timeStamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefuseMerchantSyncTask"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefuseMerchantSyncTaskResponse());
    }

    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTask(RefuseMerchantSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseMerchantSyncTaskWithOptions(request, runtime);
    }

    public RegistAnonymousTbAccountResponse registAnonymousTbAccountWithOptions(RegistAnonymousTbAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegistAnonymousTbAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegistAnonymousTbAccountResponse());
    }

    public RegistAnonymousTbAccountResponse registAnonymousTbAccount(RegistAnonymousTbAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registAnonymousTbAccountWithOptions(request, runtime);
    }

    public RegisterSettleAccountResponse registerSettleAccountWithOptions(RegisterSettleAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterSettleAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterSettleAccountResponse());
    }

    public RegisterSettleAccountResponse registerSettleAccount(RegisterSettleAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerSettleAccountWithOptions(request, runtime);
    }

    public ReleaseMovieSeatResponse releaseMovieSeatWithOptions(ReleaseMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("LockSeatApplyKey", request.lockSeatApplyKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseMovieSeat"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseMovieSeatResponse());
    }

    public ReleaseMovieSeatResponse releaseMovieSeat(ReleaseMovieSeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseMovieSeatWithOptions(request, runtime);
    }

    public RemoveAddressResponse removeAddressWithOptions(RemoveAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveAddressResponse());
    }

    public RemoveAddressResponse removeAddress(RemoveAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAddressWithOptions(request, runtime);
    }

    public RemoveMessagesResponse removeMessagesWithOptions(RemoveMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJson);
        query.put("MessageIds", request.messageIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMessages"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMessagesResponse());
    }

    public RemoveMessagesResponse removeMessages(RemoveMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMessagesWithOptions(request, runtime);
    }

    public RenderH5OrderResponse renderH5OrderWithOptions(RenderH5OrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("BuyOrderRequestModel", request.buyOrderRequestModel);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderH5Order"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderH5OrderResponse());
    }

    public RenderH5OrderResponse renderH5Order(RenderH5OrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renderH5OrderWithOptions(request, runtime);
    }

    public RenderOrderResponse renderOrderWithOptions(RenderOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("ExtJson", request.extJson);
        query.put("ItemList", request.itemList);
        query.put("LmItemId", request.lmItemId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderOrderResponse());
    }

    public RenderOrderResponse renderOrder(RenderOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renderOrderWithOptions(request, runtime);
    }

    public RepayForPayUrlResponse repayForPayUrlWithOptions(RepayForPayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepayForPayUrl"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepayForPayUrlResponse());
    }

    public RepayForPayUrlResponse repayForPayUrl(RepayForPayUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repayForPayUrlWithOptions(request, runtime);
    }

    public RepayOrderResponse repayOrderWithOptions(RepayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RepayOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RepayOrderResponse());
    }

    public RepayOrderResponse repayOrder(RepayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repayOrderWithOptions(request, runtime);
    }

    public ReserveMovieSeatResponse reserveMovieSeatWithOptions(ReserveMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("Mobile", request.mobile);
        query.put("ScheduleId", request.scheduleId);
        query.put("SeatIds", request.seatIds);
        query.put("SeatNames", request.seatNames);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReserveMovieSeat"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReserveMovieSeatResponse());
    }

    public ReserveMovieSeatResponse reserveMovieSeat(ReserveMovieSeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reserveMovieSeatWithOptions(request, runtime);
    }

    public SettleOrderResponse settleOrderWithOptions(SettleOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SettleOrder"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SettleOrderResponse());
    }

    public SettleOrderResponse settleOrder(SettleOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.settleOrderWithOptions(request, runtime);
    }

    public StartUserGameResponse startUserGameWithOptions(StartUserGameRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartUserGameShrinkRequest request = new StartUserGameShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("ActivityId", request.activityId);
        query.put("BizId", request.bizId);
        query.put("GameId", request.gameId);
        query.put("RouteId", request.routeId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UserApp", request.userApp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartUserGame"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartUserGameResponse());
    }

    public StartUserGameResponse startUserGame(StartUserGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startUserGameWithOptions(request, runtime);
    }

    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogisticsWithOptions(SubmitReturnGoodLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("CpCode", request.cpCode);
        query.put("DisputeId", request.disputeId);
        query.put("LogisticsNo", request.logisticsNo);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitReturnGoodLogistics"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitReturnGoodLogisticsResponse());
    }

    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogistics(SubmitReturnGoodLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitReturnGoodLogisticsWithOptions(request, runtime);
    }

    public SyncMerchantInfoResponse syncMerchantInfoWithOptions(SyncMerchantInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SellerNick", request.sellerNick);
        query.put("TaskId", request.taskId);
        query.put("TimeStamp", request.timeStamp);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncMerchantInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncMerchantInfoResponse());
    }

    public SyncMerchantInfoResponse syncMerchantInfo(SyncMerchantInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncMerchantInfoWithOptions(request, runtime);
    }

    public UnFreezeUserPointResponse unFreezeUserPointWithOptions(UnFreezeUserPointRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnFreezeUserPointShrinkRequest request = new UnFreezeUserPointShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountType", request.accountType);
        query.put("Amount", request.amount);
        query.put("BizId", request.bizId);
        query.put("IdempotentId", request.idempotentId);
        query.put("Message", request.message);
        query.put("RuleId", request.ruleId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("Title", request.title);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnFreezeUserPoint"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnFreezeUserPointResponse());
    }

    public UnFreezeUserPointResponse unFreezeUserPoint(UnFreezeUserPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unFreezeUserPointWithOptions(request, runtime);
    }

    public UnsignWithholdAgreementResponse unsignWithholdAgreementWithOptions(UnsignWithholdAgreementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnsignWithholdAgreement"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsignWithholdAgreementResponse());
    }

    public UnsignWithholdAgreementResponse unsignWithholdAgreement(UnsignWithholdAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsignWithholdAgreementWithOptions(request, runtime);
    }

    public UpdateAddressResponse updateAddressWithOptions(UpdateAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAddress"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAddressResponse());
    }

    public UpdateAddressResponse updateAddress(UpdateAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAddressWithOptions(request, runtime);
    }

    public ValidateTaobaoAccountResponse validateTaobaoAccountWithOptions(ValidateTaobaoAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("MobileNo", request.mobileNo);
        query.put("TbUserNick", request.tbUserNick);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ValidateTaobaoAccount"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ValidateTaobaoAccountResponse());
    }

    public ValidateTaobaoAccountResponse validateTaobaoAccount(ValidateTaobaoAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTaobaoAccountWithOptions(request, runtime);
    }
}
