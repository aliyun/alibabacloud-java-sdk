// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930;

import com.aliyun.tea.*;
import com.aliyun.linkedmall20230930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @summary 取消逆向单
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelRefundOrderResponse
     */
    public CancelRefundOrderResponse cancelRefundOrderWithOptions(String disputeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelRefundOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/" + com.aliyun.openapiutil.Client.getEncodeParam(disputeId) + "/commands/cancel"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelRefundOrderResponse());
    }

    /**
     * @summary 取消逆向单
     *
     * @return CancelRefundOrderResponse
     */
    public CancelRefundOrderResponse cancelRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * @summary 确认收货（订单）
     *
     * @param request ConfirmDisburseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmDisburseResponse
     */
    public ConfirmDisburseResponse confirmDisburseWithOptions(ConfirmDisburseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmDisburse"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/commands/confirmDisburse"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmDisburseResponse());
    }

    /**
     * @summary 确认收货（订单）
     *
     * @param request ConfirmDisburseRequest
     * @return ConfirmDisburseResponse
     */
    public ConfirmDisburseResponse confirmDisburse(ConfirmDisburseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.confirmDisburseWithOptions(request, headers, runtime);
    }

    /**
     * @summary 提交运单信息
     *
     * @param request CreateGoodsShippingNoticeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGoodsShippingNoticeResponse
     */
    public CreateGoodsShippingNoticeResponse createGoodsShippingNoticeWithOptions(CreateGoodsShippingNoticeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGoodsShippingNotice"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/command/createGoodsShippingNotice"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGoodsShippingNoticeResponse());
    }

    /**
     * @summary 提交运单信息
     *
     * @param request CreateGoodsShippingNoticeRequest
     * @return CreateGoodsShippingNoticeResponse
     */
    public CreateGoodsShippingNoticeResponse createGoodsShippingNotice(CreateGoodsShippingNoticeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createGoodsShippingNoticeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建采购单
     *
     * @param request CreatePurchaseOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePurchaseOrderResponse
     */
    public CreatePurchaseOrderResponse createPurchaseOrderWithOptions(CreatePurchaseOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePurchaseOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePurchaseOrderResponse());
    }

    /**
     * @summary 创建采购单
     *
     * @param request CreatePurchaseOrderRequest
     * @return CreatePurchaseOrderResponse
     */
    public CreatePurchaseOrderResponse createPurchaseOrder(CreatePurchaseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPurchaseOrderWithOptions(request, headers, runtime);
    }

    /**
     * @summary 创建逆向单
     *
     * @param request CreateRefundOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRefundOrderResponse
     */
    public CreateRefundOrderResponse createRefundOrderWithOptions(CreateRefundOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRefundOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRefundOrderResponse());
    }

    /**
     * @summary 创建逆向单
     *
     * @param request CreateRefundOrderRequest
     * @return CreateRefundOrderResponse
     */
    public CreateRefundOrderResponse createRefundOrder(CreateRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRefundOrderWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询主单详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderResponse
     */
    public GetOrderResponse getOrderWithOptions(String orderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/" + com.aliyun.openapiutil.Client.getEncodeParam(orderId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderResponse());
    }

    /**
     * @summary 查询主单详情
     *
     * @return GetOrderResponse
     */
    public GetOrderResponse getOrder(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrderWithOptions(orderId, headers, runtime);
    }

    /**
     * @summary 查询采购单状态
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPurchaseOrderStatusResponse
     */
    public GetPurchaseOrderStatusResponse getPurchaseOrderStatusWithOptions(String purchaseOrderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurchaseOrderStatus"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/" + com.aliyun.openapiutil.Client.getEncodeParam(purchaseOrderId) + "/status"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurchaseOrderStatusResponse());
    }

    /**
     * @summary 查询采购单状态
     *
     * @return GetPurchaseOrderStatusResponse
     */
    public GetPurchaseOrderStatusResponse getPurchaseOrderStatus(String purchaseOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaseOrderStatusWithOptions(purchaseOrderId, headers, runtime);
    }

    /**
     * @summary 查询分销商店铺
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPurchaserShopResponse
     */
    public GetPurchaserShopResponse getPurchaserShopWithOptions(String purchaserId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurchaserShop"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaserShops/" + com.aliyun.openapiutil.Client.getEncodeParam(purchaserId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurchaserShopResponse());
    }

    /**
     * @summary 查询分销商店铺
     *
     * @return GetPurchaserShopResponse
     */
    public GetPurchaserShopResponse getPurchaserShop(String purchaserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaserShopWithOptions(purchaserId, headers, runtime);
    }

    /**
     * @summary 查询逆向单详情
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRefundOrderResponse
     */
    public GetRefundOrderResponse getRefundOrderWithOptions(String disputeId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRefundOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/" + com.aliyun.openapiutil.Client.getEncodeParam(disputeId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRefundOrderResponse());
    }

    /**
     * @summary 查询逆向单详情
     *
     * @return GetRefundOrderResponse
     */
    public GetRefundOrderResponse getRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * @summary 查询选品池商品详情
     *
     * @param request GetSelectionProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSelectionProductResponse
     */
    public GetSelectionProductResponse getSelectionProductWithOptions(String productId, GetSelectionProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("divisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            query.put("purchaserId", request.purchaserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSelectionProduct"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/" + com.aliyun.openapiutil.Client.getEncodeParam(productId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSelectionProductResponse());
    }

    /**
     * @summary 查询选品池商品详情
     *
     * @param request GetSelectionProductRequest
     * @return GetSelectionProductResponse
     */
    public GetSelectionProductResponse getSelectionProduct(String productId, GetSelectionProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSelectionProductWithOptions(productId, request, headers, runtime);
    }

    /**
     * @summary 查询选品池商品库存
     *
     * @param request GetSelectionProductSaleInfoRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSelectionProductSaleInfoResponse
     */
    public GetSelectionProductSaleInfoResponse getSelectionProductSaleInfoWithOptions(String productId, GetSelectionProductSaleInfoRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.divisionCode)) {
            query.put("divisionCode", request.divisionCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            query.put("purchaserId", request.purchaserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSelectionProductSaleInfo"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/" + com.aliyun.openapiutil.Client.getEncodeParam(productId) + "/saleInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSelectionProductSaleInfoResponse());
    }

    /**
     * @summary 查询选品池商品库存
     *
     * @param request GetSelectionProductSaleInfoRequest
     * @return GetSelectionProductSaleInfoResponse
     */
    public GetSelectionProductSaleInfoResponse getSelectionProductSaleInfo(String productId, GetSelectionProductSaleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getSelectionProductSaleInfoWithOptions(productId, request, headers, runtime);
    }

    /**
     * @summary 查询类目
     *
     * @param request ListCategoriesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategoriesWithOptions(ListCategoriesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCategories"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/categories/commands/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCategoriesResponse());
    }

    /**
     * @summary 查询类目
     *
     * @param request ListCategoriesRequest
     * @return ListCategoriesResponse
     */
    public ListCategoriesResponse listCategories(ListCategoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCategoriesWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询物流信息（订单）
     *
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogisticsOrdersResponse
     */
    public ListLogisticsOrdersResponse listLogisticsOrdersWithOptions(String orderId, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogisticsOrders"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/" + com.aliyun.openapiutil.Client.getEncodeParam(orderId) + "/logisticsOrders"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogisticsOrdersResponse());
    }

    /**
     * @summary 查询物流信息（订单）
     *
     * @return ListLogisticsOrdersResponse
     */
    public ListLogisticsOrdersResponse listLogisticsOrders(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogisticsOrdersWithOptions(orderId, headers, runtime);
    }

    /**
     * @summary 采购方店铺列表查询
     *
     * @param request ListPurchaserShopsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPurchaserShopsResponse
     */
    public ListPurchaserShopsResponse listPurchaserShopsWithOptions(ListPurchaserShopsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPurchaserShops"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaserShops"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPurchaserShopsResponse());
    }

    /**
     * @summary 采购方店铺列表查询
     *
     * @param request ListPurchaserShopsRequest
     * @return ListPurchaserShopsResponse
     */
    public ListPurchaserShopsResponse listPurchaserShops(ListPurchaserShopsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPurchaserShopsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量查询选品池商品库存
     *
     * @param request ListSelectionProductSaleInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSelectionProductSaleInfosResponse
     */
    public ListSelectionProductSaleInfosResponse listSelectionProductSaleInfosWithOptions(ListSelectionProductSaleInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSelectionProductSaleInfos"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products/saleInfo/commands/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSelectionProductSaleInfosResponse());
    }

    /**
     * @summary 批量查询选品池商品库存
     *
     * @param request ListSelectionProductSaleInfosRequest
     * @return ListSelectionProductSaleInfosResponse
     */
    public ListSelectionProductSaleInfosResponse listSelectionProductSaleInfos(ListSelectionProductSaleInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSelectionProductSaleInfosWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询商品列表
     *
     * @param request ListSelectionProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSelectionProductsResponse
     */
    public ListSelectionProductsResponse listSelectionProductsWithOptions(ListSelectionProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            query.put("purchaserId", request.purchaserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSelectionProducts"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/products"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSelectionProductsResponse());
    }

    /**
     * @summary 查询商品列表
     *
     * @param request ListSelectionProductsRequest
     * @return ListSelectionProductsResponse
     */
    public ListSelectionProductsResponse listSelectionProducts(ListSelectionProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSelectionProductsWithOptions(request, headers, runtime);
    }

    /**
     * @summary 批量查询选品池商品SKU库存
     *
     * @param request ListSelectionSkuSaleInfosRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSelectionSkuSaleInfosResponse
     */
    public ListSelectionSkuSaleInfosResponse listSelectionSkuSaleInfosWithOptions(ListSelectionSkuSaleInfosRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSelectionSkuSaleInfos"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/skus/saleInfo/commands/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSelectionSkuSaleInfosResponse());
    }

    /**
     * @summary 批量查询选品池商品SKU库存
     *
     * @param request ListSelectionSkuSaleInfosRequest
     * @return ListSelectionSkuSaleInfosResponse
     */
    public ListSelectionSkuSaleInfosResponse listSelectionSkuSaleInfos(ListSelectionSkuSaleInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSelectionSkuSaleInfosWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询地址divisionCode
     *
     * @param request QueryChildDivisionCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryChildDivisionCodeResponse
     */
    public QueryChildDivisionCodeResponse queryChildDivisionCodeWithOptions(QueryChildDivisionCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryChildDivisionCode"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/division/commands/queryChildDivisionCode"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryChildDivisionCodeResponse());
    }

    /**
     * @summary 查询地址divisionCode
     *
     * @param request QueryChildDivisionCodeRequest
     * @return QueryChildDivisionCodeResponse
     */
    public QueryChildDivisionCodeResponse queryChildDivisionCode(QueryChildDivisionCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryChildDivisionCodeWithOptions(request, headers, runtime);
    }

    /**
     * @summary 查询主单列表
     *
     * @param request QueryOrdersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrdersResponse
     */
    public QueryOrdersResponse queryOrdersWithOptions(QueryOrdersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrders"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/orders/commands/query"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrdersResponse());
    }

    /**
     * @summary 查询主单列表
     *
     * @param request QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryOrdersWithOptions(request, headers, runtime);
    }

    /**
     * @summary 渲染采购单
     *
     * @param request RenderPurchaseOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderPurchaseOrderResponse
     */
    public RenderPurchaseOrderResponse renderPurchaseOrderWithOptions(RenderPurchaseOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderPurchaseOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/commands/render"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderPurchaseOrderResponse());
    }

    /**
     * @summary 渲染采购单
     *
     * @param request RenderPurchaseOrderRequest
     * @return RenderPurchaseOrderResponse
     */
    public RenderPurchaseOrderResponse renderPurchaseOrder(RenderPurchaseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renderPurchaseOrderWithOptions(request, headers, runtime);
    }

    /**
     * @summary 逆向单渲染
     *
     * @param request RenderRefundOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenderRefundOrderResponse
     */
    public RenderRefundOrderResponse renderRefundOrderWithOptions(RenderRefundOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenderRefundOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/refunds/commands/render"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenderRefundOrderResponse());
    }

    /**
     * @summary 逆向单渲染
     *
     * @param request RenderRefundOrderRequest
     * @return RenderRefundOrderResponse
     */
    public RenderRefundOrderResponse renderRefundOrder(RenderRefundOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renderRefundOrderWithOptions(request, headers, runtime);
    }

    /**
     * @summary 渲染拆分采购单
     *
     * @param request SplitPurchaseOrderRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SplitPurchaseOrderResponse
     */
    public SplitPurchaseOrderResponse splitPurchaseOrderWithOptions(SplitPurchaseOrderRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SplitPurchaseOrder"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/purchaseOrders/commands/split"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SplitPurchaseOrderResponse());
    }

    /**
     * @summary 渲染拆分采购单
     *
     * @param request SplitPurchaseOrderRequest
     * @return SplitPurchaseOrderResponse
     */
    public SplitPurchaseOrderResponse splitPurchaseOrder(SplitPurchaseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.splitPurchaseOrderWithOptions(request, headers, runtime);
    }
}
