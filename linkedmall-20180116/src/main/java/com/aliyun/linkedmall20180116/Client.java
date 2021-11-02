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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAddress", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddAddressResponse());
    }

    public AddAddressResponse addAddress(AddAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAddressWithOptions(request, runtime);
    }

    public AddItemLimitRuleResponse addItemLimitRuleWithOptions(AddItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddItemLimitRule", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddItemLimitRuleResponse());
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
        return TeaModel.toModel(this.doRPCRequest("AddItemToSubBizs", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddItemToSubBizsResponse());
    }

    public AddItemToSubBizsResponse addItemToSubBizs(AddItemToSubBizsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addItemToSubBizsWithOptions(request, runtime);
    }

    public AddSupplierNewItemsResponse addSupplierNewItemsWithOptions(AddSupplierNewItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSupplierNewItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddSupplierNewItemsResponse());
    }

    public AddSupplierNewItemsResponse addSupplierNewItems(AddSupplierNewItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSupplierNewItemsWithOptions(request, runtime);
    }

    public ApplyRefundResponse applyRefundWithOptions(ApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyRefund", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyRefundResponse());
    }

    public ApplyRefundResponse applyRefund(ApplyRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyRefundWithOptions(request, runtime);
    }

    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccountWithOptions(BatchRegistAnonymousTbAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchRegistAnonymousTbAccount", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new BatchRegistAnonymousTbAccountResponse());
    }

    public BatchRegistAnonymousTbAccountResponse batchRegistAnonymousTbAccount(BatchRegistAnonymousTbAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegistAnonymousTbAccountWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public CancelRefundResponse cancelRefundWithOptions(CancelRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelRefund", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CancelRefundResponse());
    }

    public CancelRefundResponse cancelRefund(CancelRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelRefundWithOptions(request, runtime);
    }

    public ConfirmDisburseResponse confirmDisburseWithOptions(ConfirmDisburseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmDisburse", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmDisburseResponse());
    }

    public ConfirmDisburseResponse confirmDisburse(ConfirmDisburseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmDisburseWithOptions(request, runtime);
    }

    public CreateMovieTicketOrderResponse createMovieTicketOrderWithOptions(CreateMovieTicketOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateMovieTicketOrder", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new CreateMovieTicketOrderResponse());
    }

    public CreateMovieTicketOrderResponse createMovieTicketOrder(CreateMovieTicketOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createMovieTicketOrderWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public CreateOrderV2Response createOrderV2WithOptions(CreateOrderV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrderV2", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrderV2Response());
    }

    public CreateOrderV2Response createOrderV2(CreateOrderV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderV2WithOptions(request, runtime);
    }

    public CreatePayUrlResponse createPayUrlWithOptions(CreatePayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePayUrl", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePayUrlResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateSettleConfirm", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateSettleConfirmResponse());
    }

    public CreateSettleConfirmResponse createSettleConfirm(CreateSettleConfirmRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSettleConfirmWithOptions(request, runtime);
    }

    public CreateVirtualProductOrderResponse createVirtualProductOrderWithOptions(CreateVirtualProductOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateVirtualProductOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateVirtualProductOrderResponse());
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
        return TeaModel.toModel(this.doRPCRequest("CreateWithholdTrade", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWithholdTradeResponse());
    }

    public CreateWithholdTradeResponse createWithholdTrade(CreateWithholdTradeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWithholdTradeWithOptions(request, runtime);
    }

    public DeleteBizItemsResponse deleteBizItemsWithOptions(DeleteBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBizItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBizItemsResponse());
    }

    public DeleteBizItemsResponse deleteBizItems(DeleteBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBizItemsWithOptions(request, runtime);
    }

    public DeleteItemLimitRuleResponse deleteItemLimitRuleWithOptions(DeleteItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteItemLimitRule", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteItemLimitRuleResponse());
    }

    public DeleteItemLimitRuleResponse deleteItemLimitRule(DeleteItemLimitRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteItemLimitRuleWithOptions(request, runtime);
    }

    public EnableOrderResponse enableOrderWithOptions(EnableOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new EnableOrderResponse());
    }

    public EnableOrderResponse enableOrder(EnableOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableOrderWithOptions(request, runtime);
    }

    public ExecuteNodeResponse executeNodeWithOptions(ExecuteNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteNode", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteNodeResponse());
    }

    public ExecuteNodeResponse executeNode(ExecuteNodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeNodeWithOptions(request, runtime);
    }

    public GetActivityGameInfoResponse getActivityGameInfoWithOptions(GetActivityGameInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetActivityGameInfo", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new GetActivityGameInfoResponse());
    }

    public GetActivityGameInfoResponse getActivityGameInfo(GetActivityGameInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getActivityGameInfoWithOptions(request, runtime);
    }

    public GetCategoryChainResponse getCategoryChainWithOptions(GetCategoryChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCategoryChain", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetCategoryChainResponse());
    }

    public GetCategoryChainResponse getCategoryChain(GetCategoryChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoryChainWithOptions(request, runtime);
    }

    public GetCategoryListResponse getCategoryListWithOptions(GetCategoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCategoryList", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetCategoryListResponse());
    }

    public GetCategoryListResponse getCategoryList(GetCategoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCategoryListWithOptions(request, runtime);
    }

    public GetCustomServiceUrlResponse getCustomServiceUrlWithOptions(GetCustomServiceUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCustomServiceUrl", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetCustomServiceUrlResponse());
    }

    public GetCustomServiceUrlResponse getCustomServiceUrl(GetCustomServiceUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomServiceUrlWithOptions(request, runtime);
    }

    public GetGuidePageResponse getGuidePageWithOptions(GetGuidePageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGuidePage", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new GetGuidePageResponse());
    }

    public GetGuidePageResponse getGuidePage(GetGuidePageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGuidePageWithOptions(request, runtime);
    }

    public GetItemPromotionResponse getItemPromotionWithOptions(GetItemPromotionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetItemPromotion", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetItemPromotionResponse());
    }

    public GetItemPromotionResponse getItemPromotion(GetItemPromotionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getItemPromotionWithOptions(request, runtime);
    }

    public GetLoginPageResponse getLoginPageWithOptions(GetLoginPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLoginPage", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetLoginPageResponse());
    }

    public GetLoginPageResponse getLoginPage(GetLoginPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginPageWithOptions(request, runtime);
    }

    public GetSwitchUrlResponse getSwitchUrlWithOptions(GetSwitchUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSwitchUrl", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetSwitchUrlResponse());
    }

    public GetSwitchUrlResponse getSwitchUrl(GetSwitchUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSwitchUrlWithOptions(request, runtime);
    }

    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserInfo", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserInfoResponse());
    }

    public GetUserInfoResponse getUserInfo(GetUserInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserInfoWithOptions(request, runtime);
    }

    public GetUserTokenPageResponse getUserTokenPageWithOptions(GetUserTokenPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserTokenPage", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new GetUserTokenPageResponse());
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
        return TeaModel.toModel(this.doRPCRequest("GetWithholdSignPageUrl", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetWithholdSignPageUrlResponse());
    }

    public GetWithholdSignPageUrlResponse getWithholdSignPageUrl(GetWithholdSignPageUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getWithholdSignPageUrlWithOptions(request, runtime);
    }

    public GrantPromotionToUserResponse grantPromotionToUserWithOptions(GrantPromotionToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantPromotionToUser", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GrantPromotionToUserResponse());
    }

    public GrantPromotionToUserResponse grantPromotionToUser(GrantPromotionToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantPromotionToUserWithOptions(request, runtime);
    }

    public InitApplyRefundResponse initApplyRefundWithOptions(InitApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitApplyRefund", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new InitApplyRefundResponse());
    }

    public InitApplyRefundResponse initApplyRefund(InitApplyRefundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initApplyRefundWithOptions(request, runtime);
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListItemActivities", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ListItemActivitiesResponse());
    }

    public ListItemActivitiesResponse listItemActivities(ListItemActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listItemActivitiesWithOptions(request, runtime);
    }

    public ListUserGameProcessResponse listUserGameProcessWithOptions(ListUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserGameProcess", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new ListUserGameProcessResponse());
    }

    public ListUserGameProcessResponse listUserGameProcess(ListUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserGameProcessWithOptions(request, runtime);
    }

    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItemsWithOptions(ModifyBasicAndBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBasicAndBizItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBasicAndBizItemsResponse());
    }

    public ModifyBasicAndBizItemsResponse modifyBasicAndBizItems(ModifyBasicAndBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBasicAndBizItemsWithOptions(request, runtime);
    }

    public ModifyBizItemsResponse modifyBizItemsWithOptions(ModifyBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyBizItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyBizItemsResponse());
    }

    public ModifyBizItemsResponse modifyBizItems(ModifyBizItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyBizItemsWithOptions(request, runtime);
    }

    public ModifyItemLimitRuleResponse modifyItemLimitRuleWithOptions(ModifyItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyItemLimitRule", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyItemLimitRuleResponse());
    }

    public ModifyItemLimitRuleResponse modifyItemLimitRule(ModifyItemLimitRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyItemLimitRuleWithOptions(request, runtime);
    }

    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddressWithOptions(ModifyOrderDeliveryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyOrderDeliveryAddress", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyOrderDeliveryAddressResponse());
    }

    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddress(ModifyOrderDeliveryAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyOrderDeliveryAddressWithOptions(request, runtime);
    }

    public NotifyPayOrderStatusResponse notifyPayOrderStatusWithOptions(NotifyPayOrderStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyPayOrderStatus", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyPayOrderStatusResponse());
    }

    public NotifyPayOrderStatusResponse notifyPayOrderStatus(NotifyPayOrderStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyPayOrderStatusWithOptions(request, runtime);
    }

    public NotifyWithholdFundResponse notifyWithholdFundWithOptions(NotifyWithholdFundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("NotifyWithholdFund", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new NotifyWithholdFundResponse());
    }

    public NotifyWithholdFundResponse notifyWithholdFund(NotifyWithholdFundRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyWithholdFundWithOptions(request, runtime);
    }

    public PushUserGameProcessResponse pushUserGameProcessWithOptions(PushUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("PushUserGameProcess", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new PushUserGameProcessResponse());
    }

    public PushUserGameProcessResponse pushUserGameProcess(PushUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushUserGameProcessWithOptions(request, runtime);
    }

    public QueryActivityItemsResponse queryActivityItemsWithOptions(QueryActivityItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryActivityItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryActivityItemsResponse());
    }

    public QueryActivityItemsResponse queryActivityItems(QueryActivityItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryActivityItemsWithOptions(request, runtime);
    }

    public QueryAddressResponse queryAddressWithOptions(QueryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAddress", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAddressResponse());
    }

    public QueryAddressResponse queryAddress(QueryAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressWithOptions(request, runtime);
    }

    public QueryAddressDetailResponse queryAddressDetailWithOptions(QueryAddressDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAddressDetail", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAddressDetailResponse());
    }

    public QueryAddressDetailResponse queryAddressDetail(QueryAddressDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressDetailWithOptions(request, runtime);
    }

    public QueryAddressListResponse queryAddressListWithOptions(QueryAddressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAddressList", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAddressListResponse());
    }

    public QueryAddressListResponse queryAddressList(QueryAddressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAddressListWithOptions(request, runtime);
    }

    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfoWithOptions(QueryAdvertisementSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAdvertisementSettleInfo", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAdvertisementSettleInfoResponse());
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
        return TeaModel.toModel(this.doRPCRequest("QueryAgreement", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAgreementResponse());
    }

    public QueryAgreementResponse queryAgreement(QueryAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAgreementWithOptions(request, runtime);
    }

    public QueryAllCinemasResponse queryAllCinemasWithOptions(QueryAllCinemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAllCinemas", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAllCinemasResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAllCities", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAllCitiesResponse());
    }

    public QueryAllCitiesResponse queryAllCities(QueryAllCitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllCitiesWithOptions(request, runtime);
    }

    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResultWithOptions(QueryBatchRegistAnonymousTbAccountResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBatchRegistAnonymousTbAccountResult", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBatchRegistAnonymousTbAccountResultResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBestSession4Items", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBestSession4ItemsResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBizItemList", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBizItemListResponse());
    }

    public QueryBizItemListResponse queryBizItemList(QueryBizItemListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizItemListWithOptions(request, runtime);
    }

    public QueryBizItemsResponse queryBizItemsWithOptions(QueryBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBizItems", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBizItemsResponse());
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
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBizItemsWithActivity", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryBizItemsWithActivityResponse());
    }

    public QueryBizItemsWithActivityResponse queryBizItemsWithActivity(QueryBizItemsWithActivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBizItemsWithActivityWithOptions(request, runtime);
    }

    public QueryGuideItemGroupResponse queryGuideItemGroupWithOptions(QueryGuideItemGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryGuideItemGroup", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryGuideItemGroupResponse());
    }

    public QueryGuideItemGroupResponse queryGuideItemGroup(QueryGuideItemGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGuideItemGroupWithOptions(request, runtime);
    }

    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventoryWithOptions(QueryGuideItemGroupWithOutInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryGuideItemGroupWithOutInventory", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryGuideItemGroupWithOutInventoryResponse());
    }

    public QueryGuideItemGroupWithOutInventoryResponse queryGuideItemGroupWithOutInventory(QueryGuideItemGroupWithOutInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryGuideItemGroupWithOutInventoryWithOptions(request, runtime);
    }

    public QueryHotMoviesResponse queryHotMoviesWithOptions(QueryHotMoviesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryHotMovies", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryHotMoviesResponse());
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
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInventoryOfItemsInBizItemGroup", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryInventoryOfItemsInBizItemGroupResponse());
    }

    public QueryInventoryOfItemsInBizItemGroupResponse queryInventoryOfItemsInBizItemGroup(QueryInventoryOfItemsInBizItemGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInventoryOfItemsInBizItemGroupWithOptions(request, runtime);
    }

    public QueryItemDetailResponse queryItemDetailWithOptions(QueryItemDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemDetail", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemDetailResponse());
    }

    public QueryItemDetailResponse queryItemDetail(QueryItemDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailWithOptions(request, runtime);
    }

    public QueryItemDetailInnerResponse queryItemDetailInnerWithOptions(QueryItemDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemDetailInner", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemDetailInnerResponse());
    }

    public QueryItemDetailInnerResponse queryItemDetailInner(QueryItemDetailInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemDetailInnerWithOptions(request, runtime);
    }

    public QueryItemDetailTeaResponse queryItemDetailTeaWithOptions(QueryItemDetailTeaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemDetailTea", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemDetailTeaResponse());
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
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemInSubBizs", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryItemInSubBizsResponse());
    }

    public QueryItemInSubBizsResponse queryItemInSubBizs(QueryItemInSubBizsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemInSubBizsWithOptions(request, runtime);
    }

    public QueryItemInventoryResponse queryItemInventoryWithOptions(QueryItemInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryItemInventory", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryItemInventoryResponse());
    }

    public QueryItemInventoryResponse queryItemInventory(QueryItemInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryItemInventoryWithOptions(request, runtime);
    }

    public QueryLogisticsResponse queryLogisticsWithOptions(QueryLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryLogistics", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryLogisticsResponse());
    }

    public QueryLogisticsResponse queryLogistics(QueryLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLogisticsWithOptions(request, runtime);
    }

    public QueryMediaSettleInfoResponse queryMediaSettleInfoWithOptions(QueryMediaSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMediaSettleInfo", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMediaSettleInfoResponse());
    }

    public QueryMediaSettleInfoResponse queryMediaSettleInfo(QueryMediaSettleInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMediaSettleInfoWithOptions(request, runtime);
    }

    public QueryMessagesResponse queryMessagesWithOptions(QueryMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMessages", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMessagesResponse());
    }

    public QueryMessagesResponse queryMessages(QueryMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMessagesWithOptions(request, runtime);
    }

    public QueryMovieCommentsResponse queryMovieCommentsWithOptions(QueryMovieCommentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMovieComments", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMovieCommentsResponse());
    }

    public QueryMovieCommentsResponse queryMovieComments(QueryMovieCommentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieCommentsWithOptions(request, runtime);
    }

    public QueryMovieSchedulesResponse queryMovieSchedulesWithOptions(QueryMovieSchedulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMovieSchedules", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMovieSchedulesResponse());
    }

    public QueryMovieSchedulesResponse queryMovieSchedules(QueryMovieSchedulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieSchedulesWithOptions(request, runtime);
    }

    public QueryMovieSeatsResponse queryMovieSeatsWithOptions(QueryMovieSeatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMovieSeats", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMovieSeatsResponse());
    }

    public QueryMovieSeatsResponse queryMovieSeats(QueryMovieSeatsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieSeatsWithOptions(request, runtime);
    }

    public QueryMovieTicketsResponse queryMovieTicketsWithOptions(QueryMovieTicketsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMovieTickets", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryMovieTicketsResponse());
    }

    public QueryMovieTicketsResponse queryMovieTickets(QueryMovieTicketsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMovieTicketsWithOptions(request, runtime);
    }

    public QueryOrderAndPaymentListResponse queryOrderAndPaymentListWithOptions(QueryOrderAndPaymentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderAndPaymentList", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderAndPaymentListResponse());
    }

    public QueryOrderAndPaymentListResponse queryOrderAndPaymentList(QueryOrderAndPaymentListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderAndPaymentListWithOptions(request, runtime);
    }

    public QueryOrderCommissionRateResponse queryOrderCommissionRateWithOptions(QueryOrderCommissionRateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderCommissionRate", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderCommissionRateResponse());
    }

    public QueryOrderCommissionRateResponse queryOrderCommissionRate(QueryOrderCommissionRateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderCommissionRateWithOptions(request, runtime);
    }

    public QueryOrderDetailInnerResponse queryOrderDetailInnerWithOptions(QueryOrderDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderDetailInner", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderDetailInnerResponse());
    }

    public QueryOrderDetailInnerResponse queryOrderDetailInner(QueryOrderDetailInnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderDetailInnerWithOptions(request, runtime);
    }

    public QueryOrderIdByPayIdResponse queryOrderIdByPayIdWithOptions(QueryOrderIdByPayIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderIdByPayId", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderIdByPayIdResponse());
    }

    public QueryOrderIdByPayIdResponse queryOrderIdByPayId(QueryOrderIdByPayIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderIdByPayIdWithOptions(request, runtime);
    }

    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSaleWithOptions(QueryOrderInfoAfterSaleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderInfoAfterSale", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryOrderInfoAfterSaleResponse());
    }

    public QueryOrderInfoAfterSaleResponse queryOrderInfoAfterSale(QueryOrderInfoAfterSaleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderInfoAfterSaleWithOptions(request, runtime);
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderItemInfoByPaymentIdForAiZhanYou", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderItemInfoByPaymentIdForAiZhanYouResponse());
    }

    public QueryOrderItemInfoByPaymentIdForAiZhanYouResponse queryOrderItemInfoByPaymentIdForAiZhanYou(QueryOrderItemInfoByPaymentIdForAiZhanYouRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderItemInfoByPaymentIdForAiZhanYouWithOptions(request, runtime);
    }

    public QueryOrderListResponse queryOrderListWithOptions(QueryOrderListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderList", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderListResponse());
    }

    public QueryOrderListResponse queryOrderList(QueryOrderListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderListWithOptions(request, runtime);
    }

    public QueryOrderLogisticsResponse queryOrderLogisticsWithOptions(QueryOrderLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrderLogistics", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrderLogisticsResponse());
    }

    public QueryOrderLogisticsResponse queryOrderLogistics(QueryOrderLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderLogisticsWithOptions(request, runtime);
    }

    public QueryRefundApplicationDetailResponse queryRefundApplicationDetailWithOptions(QueryRefundApplicationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRefundApplicationDetail", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRefundApplicationDetailResponse());
    }

    public QueryRefundApplicationDetailResponse queryRefundApplicationDetail(QueryRefundApplicationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRefundApplicationDetailWithOptions(request, runtime);
    }

    public QueryStatementsResponse queryStatementsWithOptions(QueryStatementsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryStatements", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryStatementsResponse());
    }

    public QueryStatementsResponse queryStatements(QueryStatementsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryStatementsWithOptions(request, runtime);
    }

    public QueryUnfinishedActivitiesResponse queryUnfinishedActivitiesWithOptions(QueryUnfinishedActivitiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnfinishedActivities", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnfinishedActivitiesResponse());
    }

    public QueryUnfinishedActivitiesResponse queryUnfinishedActivities(QueryUnfinishedActivitiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUnfinishedActivitiesWithOptions(request, runtime);
    }

    public QueryUnfinishedSessionsResponse queryUnfinishedSessionsWithOptions(QueryUnfinishedSessionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnfinishedSessions", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnfinishedSessionsResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUnfinishedSessions4Items", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUnfinishedSessions4ItemsResponse());
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUpcomingMovies", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUpcomingMoviesResponse());
    }

    public QueryUpcomingMoviesResponse queryUpcomingMovies(QueryUpcomingMoviesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUpcomingMoviesWithOptions(request, runtime);
    }

    public QueryUserGameProcessResponse queryUserGameProcessWithOptions(QueryUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUserGameProcess", "2018-01-16", "HTTPS", "GET", "AK", "json", req, runtime), new QueryUserGameProcessResponse());
    }

    public QueryUserGameProcessResponse queryUserGameProcess(QueryUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserGameProcessWithOptions(request, runtime);
    }

    public QueryWithholdTradeResponse queryWithholdTradeWithOptions(QueryWithholdTradeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryWithholdTrade", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new QueryWithholdTradeResponse());
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
        return TeaModel.toModel(this.doRPCRequest("RefundOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RefundOrderResponse());
    }

    public RefundOrderResponse refundOrder(RefundOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundOrderWithOptions(request, runtime);
    }

    public RefundPointResponse refundPointWithOptions(RefundPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefundPoint", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RefundPointResponse());
    }

    public RefundPointResponse refundPoint(RefundPointRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refundPointWithOptions(request, runtime);
    }

    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTaskWithOptions(RefuseMerchantSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RefuseMerchantSyncTask", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RefuseMerchantSyncTaskResponse());
    }

    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTask(RefuseMerchantSyncTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.refuseMerchantSyncTaskWithOptions(request, runtime);
    }

    public RegistAnonymousTbAccountResponse registAnonymousTbAccountWithOptions(RegistAnonymousTbAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegistAnonymousTbAccount", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RegistAnonymousTbAccountResponse());
    }

    public RegistAnonymousTbAccountResponse registAnonymousTbAccount(RegistAnonymousTbAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registAnonymousTbAccountWithOptions(request, runtime);
    }

    public ReleaseMovieSeatResponse releaseMovieSeatWithOptions(ReleaseMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReleaseMovieSeat", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ReleaseMovieSeatResponse());
    }

    public ReleaseMovieSeatResponse releaseMovieSeat(ReleaseMovieSeatRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseMovieSeatWithOptions(request, runtime);
    }

    public RemoveAddressResponse removeAddressWithOptions(RemoveAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveAddress", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveAddressResponse());
    }

    public RemoveAddressResponse removeAddress(RemoveAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeAddressWithOptions(request, runtime);
    }

    public RemoveMessagesResponse removeMessagesWithOptions(RemoveMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RemoveMessages", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RemoveMessagesResponse());
    }

    public RemoveMessagesResponse removeMessages(RemoveMessagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeMessagesWithOptions(request, runtime);
    }

    public RenderH5OrderResponse renderH5OrderWithOptions(RenderH5OrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenderH5Order", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RenderH5OrderResponse());
    }

    public RenderH5OrderResponse renderH5Order(RenderH5OrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renderH5OrderWithOptions(request, runtime);
    }

    public RenderOrderResponse renderOrderWithOptions(RenderOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenderOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RenderOrderResponse());
    }

    public RenderOrderResponse renderOrder(RenderOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renderOrderWithOptions(request, runtime);
    }

    public RepayForPayUrlResponse repayForPayUrlWithOptions(RepayForPayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RepayForPayUrl", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RepayForPayUrlResponse());
    }

    public RepayForPayUrlResponse repayForPayUrl(RepayForPayUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repayForPayUrlWithOptions(request, runtime);
    }

    public RepayOrderResponse repayOrderWithOptions(RepayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RepayOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RepayOrderResponse());
    }

    public RepayOrderResponse repayOrder(RepayOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.repayOrderWithOptions(request, runtime);
    }

    public ReserveMovieSeatResponse reserveMovieSeatWithOptions(ReserveMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReserveMovieSeat", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ReserveMovieSeatResponse());
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
        return TeaModel.toModel(this.doRPCRequest("SettleOrder", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new SettleOrderResponse());
    }

    public SettleOrderResponse settleOrder(SettleOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.settleOrderWithOptions(request, runtime);
    }

    public StartUserGameResponse startUserGameWithOptions(StartUserGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartUserGame", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new StartUserGameResponse());
    }

    public StartUserGameResponse startUserGame(StartUserGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startUserGameWithOptions(request, runtime);
    }

    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogisticsWithOptions(SubmitReturnGoodLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitReturnGoodLogistics", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitReturnGoodLogisticsResponse());
    }

    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogistics(SubmitReturnGoodLogisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitReturnGoodLogisticsWithOptions(request, runtime);
    }

    public SyncMerchantInfoResponse syncMerchantInfoWithOptions(SyncMerchantInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncMerchantInfo", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new SyncMerchantInfoResponse());
    }

    public SyncMerchantInfoResponse syncMerchantInfo(SyncMerchantInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncMerchantInfoWithOptions(request, runtime);
    }

    public UnsignWithholdAgreementResponse unsignWithholdAgreementWithOptions(UnsignWithholdAgreementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnsignWithholdAgreement", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new UnsignWithholdAgreementResponse());
    }

    public UnsignWithholdAgreementResponse unsignWithholdAgreement(UnsignWithholdAgreementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsignWithholdAgreementWithOptions(request, runtime);
    }

    public UpdateAddressResponse updateAddressWithOptions(UpdateAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAddress", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAddressResponse());
    }

    public UpdateAddressResponse updateAddress(UpdateAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAddressWithOptions(request, runtime);
    }

    public ValidateTaobaoAccountResponse validateTaobaoAccountWithOptions(ValidateTaobaoAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ValidateTaobaoAccount", "2018-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new ValidateTaobaoAccountResponse());
    }

    public ValidateTaobaoAccountResponse validateTaobaoAccount(ValidateTaobaoAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.validateTaobaoAccountWithOptions(request, runtime);
    }
}
