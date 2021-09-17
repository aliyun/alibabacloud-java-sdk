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

    public QueryStatementsResponse queryStatementsWithOptions(QueryStatementsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("TenantId", request.tenantId);
        query.put("PayeeIds", request.payeeIds);
        query.put("SettleNoes", request.settleNoes);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("SettleStatus", request.settleStatus);
        query.put("SettleType", request.settleType);
        query.put("ExtInfo", request.extInfo);
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

    public QueryUserGameProcessResponse queryUserGameProcessWithOptions(QueryUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserGameProcess"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserGameProcessResponse());
    }

    public QueryUserGameProcessResponse queryUserGameProcess(QueryUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserGameProcessWithOptions(request, runtime);
    }

    public NotifyWithholdFundResponse notifyWithholdFundWithOptions(NotifyWithholdFundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("RequestId", request.requestId);
        query.put("OperationDate", request.operationDate);
        query.put("PayTypes", request.payTypes);
        query.put("Amount", request.amount);
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

    public CreateVirtualProductOrderResponse createVirtualProductOrderWithOptions(CreateVirtualProductOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("OutTradeId", request.outTradeId);
        query.put("ItemId", request.itemId);
        query.put("Quantity", request.quantity);
        query.put("TotalAmount", request.totalAmount);
        query.put("ExtJson", request.extJson);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
        query.put("LmItemId", request.lmItemId);
        query.put("ItemList", request.itemList);
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

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("AccountType", request.accountType);
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

    public QueryOrderCommissionRateResponse queryOrderCommissionRateWithOptions(QueryOrderCommissionRateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryOrderIdByPayIdResponse queryOrderIdByPayIdWithOptions(QueryOrderIdByPayIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("PaymentId", request.paymentId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public RepayForPayUrlResponse repayForPayUrlWithOptions(RepayForPayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public QueryMessagesResponse queryMessagesWithOptions(QueryMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("Topic", request.topic);
        query.put("ExtJson", request.extJson);
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

    public GetUserInfoResponse getUserInfoWithOptions(GetUserInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("UserFlag", request.userFlag);
        query.put("AppName", request.appName);
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

    public EnableOrderResponse enableOrderWithOptions(EnableOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("OutTradeId", request.outTradeId);
        query.put("LmOrderId", request.lmOrderId);
        query.put("ExtJson", request.extJson);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryItemDetailInnerResponse queryItemDetailInnerWithOptions(QueryItemDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ItemId", request.itemId);
        query.put("LmItemId", request.lmItemId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("BizUid", request.bizUid);
        query.put("DivisionCode", request.divisionCode);
        query.put("Ip", request.ip);
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

    public CreateOrderV2Response createOrderV2WithOptions(CreateOrderV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("OutTradeId", request.outTradeId);
        query.put("ItemId", request.itemId);
        query.put("Quantity", request.quantity);
        query.put("TotalAmount", request.totalAmount);
        query.put("ExtJson", request.extJson);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
        query.put("LmItemId", request.lmItemId);
        query.put("BuyerMessageMap", request.buyerMessageMap);
        query.put("ItemList", request.itemList);
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

    public QueryAddressResponse queryAddressWithOptions(QueryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("Ip", request.ip);
        query.put("DivisionCode", request.divisionCode);
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

    public QueryMovieSeatsResponse queryMovieSeatsWithOptions(QueryMovieSeatsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ScheduleId", request.scheduleId);
        query.put("ExtJson", request.extJson);
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

    public QueryBizItemListResponse queryBizItemListWithOptions(QueryBizItemListRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemListShrinkRequest request = new QueryBizItemListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizId", request.subBizId);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("UserId", request.userId);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("ItemIds", request.itemIdsShrink);
        query.put("CategoryId", request.categoryId);
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

    public QueryMediaSettleInfoResponse queryMediaSettleInfoWithOptions(QueryMediaSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaName", request.mediaName);
        query.put("ChannelId", request.channelId);
        query.put("SettleNo", request.settleNo);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("ExtInfo", request.extInfo);
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

    public QueryLogisticsResponse queryLogisticsWithOptions(QueryLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public RefundPointResponse refundPointWithOptions(RefundPointRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SellerId", request.sellerId);
        query.put("LmOrderId", request.lmOrderId);
        query.put("Reason", request.reason);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public ReserveMovieSeatResponse reserveMovieSeatWithOptions(ReserveMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ScheduleId", request.scheduleId);
        query.put("SeatIds", request.seatIds);
        query.put("SeatNames", request.seatNames);
        query.put("BizUid", request.bizUid);
        query.put("Mobile", request.mobile);
        query.put("ExtJson", request.extJson);
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

    public SyncMerchantInfoResponse syncMerchantInfoWithOptions(SyncMerchantInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("TaskId", request.taskId);
        query.put("SellerNick", request.sellerNick);
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

    public ListItemActivitiesResponse listItemActivitiesWithOptions(ListItemActivitiesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListItemActivitiesShrinkRequest request = new ListItemActivitiesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("ItemIds", request.itemIdsShrink);
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

    public QueryAllCinemasResponse queryAllCinemasWithOptions(QueryAllCinemasRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("CityCode", request.cityCode);
        query.put("PageNumber", request.pageNumber);
        query.put("ExtJson", request.extJson);
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

    public GrantPromotionToUserResponse grantPromotionToUserWithOptions(GrantPromotionToUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("PromotionId", request.promotionId);
        query.put("SecurityCode", request.securityCode);
        query.put("ExpireSeconds", request.expireSeconds);
        query.put("GrantWay", request.grantWay);
        query.put("IdempotentId", request.idempotentId);
        query.put("GrantMode", request.grantMode);
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
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPromotionToUserResponse());
    }

    public GrantPromotionToUserResponse grantPromotionToUser(GrantPromotionToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantPromotionToUserWithOptions(request, runtime);
    }

    public QueryRefundApplicationDetailResponse queryRefundApplicationDetailWithOptions(QueryRefundApplicationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public CancelRefundResponse cancelRefundWithOptions(CancelRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("DisputeId", request.disputeId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryAddressDetailResponse queryAddressDetailWithOptions(QueryAddressDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("AddressInfo", request.addressInfo);
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

    public ConfirmDisburseResponse confirmDisburseWithOptions(ConfirmDisburseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public PushUserGameProcessResponse pushUserGameProcessWithOptions(PushUserGameProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
        query.put("ProcessId", request.processId);
        query.put("CurrentStepId", request.currentStepId);
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
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushUserGameProcessResponse());
    }

    public PushUserGameProcessResponse pushUserGameProcess(PushUserGameProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pushUserGameProcessWithOptions(request, runtime);
    }

    public ModifyItemLimitRuleResponse modifyItemLimitRuleWithOptions(ModifyItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizCode", request.subBizCode);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("ItemId", request.itemId);
        query.put("UpperNum", request.upperNum);
        query.put("RuleId", request.ruleId);
        query.put("RuleType", request.ruleType);
        query.put("BeginTime", request.beginTime);
        query.put("EndTime", request.endTime);
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

    public RefuseMerchantSyncTaskResponse refuseMerchantSyncTaskWithOptions(RefuseMerchantSyncTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("TaskId", request.taskId);
        query.put("SellerNick", request.sellerNick);
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

    public QueryOrderLogisticsResponse queryOrderLogisticsWithOptions(QueryOrderLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public GetCustomServiceUrlResponse getCustomServiceUrlWithOptions(GetCustomServiceUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SellerId", request.sellerId);
        query.put("Cuid", request.cuid);
        query.put("Nick", request.nick);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryBestSession4ItemsResponse queryBestSession4ItemsWithOptions(QueryBestSession4ItemsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBestSession4ItemsShrinkRequest request = new QueryBestSession4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("ItemIds", request.itemIdsShrink);
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

    public SubmitReturnGoodLogisticsResponse submitReturnGoodLogisticsWithOptions(SubmitReturnGoodLogisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LogisticsNo", request.logisticsNo);
        query.put("CpCode", request.cpCode);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("DisputeId", request.disputeId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("OutTradeId", request.outTradeId);
        query.put("ItemId", request.itemId);
        query.put("Quantity", request.quantity);
        query.put("TotalAmount", request.totalAmount);
        query.put("ExtJson", request.extJson);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("OrderExpireTime", request.orderExpireTime);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
        query.put("LmItemId", request.lmItemId);
        query.put("BuyerMessageMap", request.buyerMessageMap);
        query.put("ItemList", request.itemList);
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

    public ModifyOrderDeliveryAddressResponse modifyOrderDeliveryAddressWithOptions(ModifyOrderDeliveryAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ExtJson", request.extJson);
        query.put("DeliveryAddress", request.deliveryAddress);
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

    public InitApplyRefundResponse initApplyRefundWithOptions(InitApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("BizClaimType", request.bizClaimType);
        query.put("GoodsStatus", request.goodsStatus);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryOrderListResponse queryOrderListWithOptions(QueryOrderListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("FilterOption", request.filterOption);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public RepayOrderResponse repayOrderWithOptions(RepayOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("LmOrderId", request.lmOrderId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public QueryBizItemsWithActivityResponse queryBizItemsWithActivityWithOptions(QueryBizItemsWithActivityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryBizItemsWithActivityShrinkRequest request = new QueryBizItemsWithActivityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
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

    public QueryBatchRegistAnonymousTbAccountResultResponse queryBatchRegistAnonymousTbAccountResultWithOptions(QueryBatchRegistAnonymousTbAccountResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BatchId", request.batchId);
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

    public ValidateTaobaoAccountResponse validateTaobaoAccountWithOptions(ValidateTaobaoAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("TbUserNick", request.tbUserNick);
        query.put("MobileNo", request.mobileNo);
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

    public RemoveMessagesResponse removeMessagesWithOptions(RemoveMessagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("MessageIds", request.messageIds);
        query.put("ExtJson", request.extJson);
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

    public GetSwitchUrlResponse getSwitchUrlWithOptions(GetSwitchUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public AddItemLimitRuleResponse addItemLimitRuleWithOptions(AddItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizCode", request.subBizCode);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("ItemId", request.itemId);
        query.put("UpperNum", request.upperNum);
        query.put("RuleType", request.ruleType);
        query.put("BeginTime", request.beginTime);
        query.put("EndTime", request.endTime);
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

    public NotifyPayOrderStatusResponse notifyPayOrderStatusWithOptions(NotifyPayOrderStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChannelId", request.channelId);
        query.put("RequestId", request.requestId);
        query.put("OperationDate", request.operationDate);
        query.put("PayTypes", request.payTypes);
        query.put("Amount", request.amount);
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

    public DeleteBizItemsResponse deleteBizItemsWithOptions(DeleteBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizId", request.subBizId);
        query.put("ItemIdList", request.itemIdList);
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

    public QueryActivityItemsResponse queryActivityItemsWithOptions(QueryActivityItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("PageNumber", request.pageNumber);
        query.put("PageSize", request.pageSize);
        query.put("LmActivityId", request.lmActivityId);
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

    public QueryMovieCommentsResponse queryMovieCommentsWithOptions(QueryMovieCommentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("MovieId", request.movieId);
        query.put("PageNumber", request.pageNumber);
        query.put("ExtJson", request.extJson);
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

    public RenderOrderResponse renderOrderWithOptions(RenderOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
        query.put("DeliveryAddress", request.deliveryAddress);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("LmItemId", request.lmItemId);
        query.put("AccountType", request.accountType);
        query.put("ItemList", request.itemList);
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

    public GetLoginPageResponse getLoginPageWithOptions(GetLoginPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public DeleteItemLimitRuleResponse deleteItemLimitRuleWithOptions(DeleteItemLimitRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizCode", request.subBizCode);
        query.put("LmActivityId", request.lmActivityId);
        query.put("LmItemId", request.lmItemId);
        query.put("ItemId", request.itemId);
        query.put("RuleId", request.ruleId);
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

    public ApplyRefundResponse applyRefundWithOptions(ApplyRefundRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("SubLmOrderId", request.subLmOrderId);
        query.put("BizClaimType", request.bizClaimType);
        query.put("ApplyRefundFee", request.applyRefundFee);
        query.put("ApplyRefundCount", request.applyRefundCount);
        query.put("ApplyReasonTextId", request.applyReasonTextId);
        query.put("GoodsStatus", request.goodsStatus);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public CreatePayUrlResponse createPayUrlWithOptions(CreatePayUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public QueryOrderAndPaymentListResponse queryOrderAndPaymentListWithOptions(QueryOrderAndPaymentListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("FilterOption", request.filterOption);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
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

    public GetActivityGameInfoResponse getActivityGameInfoWithOptions(GetActivityGameInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetActivityGameInfo"),
            new TeaPair("version", "2018-01-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetActivityGameInfoResponse());
    }

    public GetActivityGameInfoResponse getActivityGameInfo(GetActivityGameInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getActivityGameInfoWithOptions(request, runtime);
    }

    public QueryOrderDetailInnerResponse queryOrderDetailInnerWithOptions(QueryOrderDetailInnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("FilterOption", request.filterOption);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
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

    public ReleaseMovieSeatResponse releaseMovieSeatWithOptions(ReleaseMovieSeatRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LockSeatApplyKey", request.lockSeatApplyKey);
        query.put("BizUid", request.bizUid);
        query.put("ExtJson", request.extJson);
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

    public RenderH5OrderResponse renderH5OrderWithOptions(RenderH5OrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("BizUid", request.bizUid);
        query.put("UseAnonymousTbAccount", request.useAnonymousTbAccount);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("BuyOrderRequestModel", request.buyOrderRequestModel);
        query.put("AccountType", request.accountType);
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

    public QueryBizItemsResponse queryBizItemsWithOptions(QueryBizItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("SubBizId", request.subBizId);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
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

    public QueryAdvertisementSettleInfoResponse queryAdvertisementSettleInfoWithOptions(QueryAdvertisementSettleInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MediaSettleDetailId", request.mediaSettleDetailId);
        query.put("ChannelId", request.channelId);
        query.put("SettleNo", request.settleNo);
        query.put("StartTime", request.startTime);
        query.put("EndTime", request.endTime);
        query.put("PageSize", request.pageSize);
        query.put("PageNumber", request.pageNumber);
        query.put("ExtInfo", request.extInfo);
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

    public QueryUnfinishedSessions4ItemsResponse queryUnfinishedSessions4ItemsWithOptions(QueryUnfinishedSessions4ItemsRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryUnfinishedSessions4ItemsShrinkRequest request = new QueryUnfinishedSessions4ItemsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lmItemIds)) {
            request.lmItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lmItemIds, "LmItemIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.itemIds)) {
            request.itemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.itemIds, "ItemIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("LmItemIds", request.lmItemIdsShrink);
        query.put("ItemIds", request.itemIdsShrink);
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

    public ExecuteNodeResponse executeNodeWithOptions(ExecuteNodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProcessInstanceId", request.processInstanceId);
        query.put("ProcessId", request.processId);
        query.put("NodeInstanceId", request.nodeInstanceId);
        query.put("NodeId", request.nodeId);
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

    public StartUserGameResponse startUserGameWithOptions(StartUserGameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BizId", request.bizId);
        query.put("ThirdPartyUserId", request.thirdPartyUserId);
        query.put("AccountType", request.accountType);
        query.put("GameId", request.gameId);
        query.put("ActivityId", request.activityId);
        query.put("RouteId", request.routeId);
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
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartUserGameResponse());
    }

    public StartUserGameResponse startUserGame(StartUserGameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startUserGameWithOptions(request, runtime);
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
}
