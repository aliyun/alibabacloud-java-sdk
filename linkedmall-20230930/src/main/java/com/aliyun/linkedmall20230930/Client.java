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
     * <b>description</b> :
     * <p>Cancel a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a refund order.</p>
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
     * <b>description</b> :
     * <p>Cancel a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels a refund order.</p>
     * @return CancelRefundOrderResponse
     */
    public CancelRefundOrderResponse cancelRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Confirms the receipt of goods.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms the receipt of goods.</p>
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
     * <b>description</b> :
     * <p>Confirms the receipt of goods.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms the receipt of goods.</p>
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
     * <b>description</b> :
     * <p>Backfill shipping notice information.</p>
     * 
     * <b>summary</b> : 
     * <p>Backfill shipping notice information.</p>
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
     * <b>description</b> :
     * <p>Backfill shipping notice information.</p>
     * 
     * <b>summary</b> : 
     * <p>Backfill shipping notice information.</p>
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
     * <b>description</b> :
     * <p>Creates a purchase order and returns the purchase order ID. Messages communicate the specific result of order creation. After the order is created, you can query the order details associated with the purchase order using the order API.</p>
     * <blockquote>
     * <p>Warning: Note: Purchase order creation is an asynchronous task. If a distributor calls this API and receives an abnormal status (such as error code 503), do not immediately process customer refunds. Distributors must wait for and consume the PurchaseOrderCreate message (the purchase order creation result message) to determine the order status—for example, by consuming the order status synchronization message—before proceeding with business logic. This prevents financial losses.
     * Notice: Note: If you do not receive the PurchaseOrderCreate message (the purchase order creation result message) after calling the purchase order creation API, submit a ticket to the technical support team to inquire about the cause.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a purchase order and returns the purchase order ID. The specific result of order creation is communicated through messages. After the order is created, you can query the order details associated with the purchase order using the order API.</p>
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
     * <b>description</b> :
     * <p>Creates a purchase order and returns the purchase order ID. Messages communicate the specific result of order creation. After the order is created, you can query the order details associated with the purchase order using the order API.</p>
     * <blockquote>
     * <p>Warning: Note: Purchase order creation is an asynchronous task. If a distributor calls this API and receives an abnormal status (such as error code 503), do not immediately process customer refunds. Distributors must wait for and consume the PurchaseOrderCreate message (the purchase order creation result message) to determine the order status—for example, by consuming the order status synchronization message—before proceeding with business logic. This prevents financial losses.
     * Notice: Note: If you do not receive the PurchaseOrderCreate message (the purchase order creation result message) after calling the purchase order creation API, submit a ticket to the technical support team to inquire about the cause.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a purchase order and returns the purchase order ID. The specific result of order creation is communicated through messages. After the order is created, you can query the order details associated with the purchase order using the order API.</p>
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
     * <b>description</b> :
     * <p>Creates a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a support ticket.</p>
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
     * <b>description</b> :
     * <p>Creates a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Create a support ticket.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of an order.</p>
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
     * <b>summary</b> : 
     * <p>Queries the details of an order.</p>
     * @return GetOrderResponse
     */
    public GetOrderResponse getOrder(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrderWithOptions(orderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve the transaction order status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the purchase order status.</p>
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
     * <b>description</b> :
     * <p>Retrieve the transaction order status.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve the purchase order status.</p>
     * @return GetPurchaseOrderStatusResponse
     */
    public GetPurchaseOrderStatusResponse getPurchaseOrderStatus(String purchaseOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaseOrderStatusWithOptions(purchaseOrderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the purchaser\&quot;s shop.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the purchaser\&quot;s shop.</p>
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
     * <b>description</b> :
     * <p>Retrieves the purchaser\&quot;s shop.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the purchaser\&quot;s shop.</p>
     * @return GetPurchaserShopResponse
     */
    public GetPurchaserShopResponse getPurchaserShop(String purchaserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaserShopWithOptions(purchaserId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve after-sales order details</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve details of an after-sales order.</p>
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
     * <b>description</b> :
     * <p>Retrieve after-sales order details</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve details of an after-sales order.</p>
     * @return GetRefundOrderResponse
     */
    public GetRefundOrderResponse getRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieve product details from the selection pool using the product ID. You can also specify a region code to check regional inventory.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a product in the selection pool.</p>
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
     * <b>description</b> :
     * <p>Retrieve product details from the selection pool using the product ID. You can also specify a region code to check regional inventory.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the details of a product in the selection pool.</p>
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
     * <b>description</b> :
     * <p>Queries sales information for products in the selection pool. Distributors can call this operation to check product sales details, such as product status. Use the divisionCode input parameter to check whether a product is available for sale in a specific region. We recommend using a five-level administrative division code (township or subdistrict level).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sales information for products in the selection pool.</p>
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
     * <b>description</b> :
     * <p>Queries sales information for products in the selection pool. Distributors can call this operation to check product sales details, such as product status. Use the divisionCode input parameter to check whether a product is available for sale in a specific region. We recommend using a five-level administrative division code (township or subdistrict level).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries sales information for products in the selection pool.</p>
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
     * <b>description</b> :
     * <p>Retrieves all subcategories for a parent category ID, or the details for a specific category ID.
     * If the parent category ID (parentCategoryId) is 0, the API returns the top-level categories under the root category.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists categories.</p>
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
     * <b>description</b> :
     * <p>Retrieves all subcategories for a parent category ID, or the details for a specific category ID.
     * If the parent category ID (parentCategoryId) is 0, the API returns the top-level categories under the root category.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists categories.</p>
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
     * <b>description</b> :
     * <p>Retrieves logistics information for an order.</p>
     * 
     * <b>summary</b> : 
     * <p>Query logistics information for an order.</p>
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
     * <b>description</b> :
     * <p>Retrieves logistics information for an order.</p>
     * 
     * <b>summary</b> : 
     * <p>Query logistics information for an order.</p>
     * @return ListLogisticsOrdersResponse
     */
    public ListLogisticsOrdersResponse listLogisticsOrders(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogisticsOrdersWithOptions(orderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Lists purchaser shops.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists purchaser shops.</p>
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
     * <b>description</b> :
     * <p>Lists purchaser shops.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists purchaser shops.</p>
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
     * <b>description</b> :
     * <p>You can query product sales information for the selection pool in batches. Distributors can call this operation to retrieve product sales details, such as product status. Use the divisionCode input parameter to check whether products are available for sale in a specific region. We recommend that you pass a five-level address code (town or street level).</p>
     * 
     * <b>summary</b> : 
     * <p>Query product sales information for the selection pool in batches.</p>
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
     * <b>description</b> :
     * <p>You can query product sales information for the selection pool in batches. Distributors can call this operation to retrieve product sales details, such as product status. Use the divisionCode input parameter to check whether products are available for sale in a specific region. We recommend that you pass a five-level address code (town or street level).</p>
     * 
     * <b>summary</b> : 
     * <p>Query product sales information for the selection pool in batches.</p>
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
     * <b>summary</b> : 
     * <p>Retrieves a list of products from a product selection pool.</p>
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
     * <b>summary</b> : 
     * <p>Retrieves a list of products from a product selection pool.</p>
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
     * <b>description</b> :
     * <p>Query SKU sales information for items in the selection pool in batch. Distributors can call this API to retrieve batch details about SKU sales status and other attributes. To determine whether SKUs are sellable in a specific region, use the divisionCode parameter—preferably a five-level administrative division code for townships or subdistricts.</p>
     * 
     * <b>summary</b> : 
     * <p>Query SKU sales information for items in the selection pool in batch.</p>
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
     * <b>description</b> :
     * <p>Query SKU sales information for items in the selection pool in batch. Distributors can call this API to retrieve batch details about SKU sales status and other attributes. To determine whether SKUs are sellable in a specific region, use the divisionCode parameter—preferably a five-level administrative division code for townships or subdistricts.</p>
     * 
     * <b>summary</b> : 
     * <p>Query SKU sales information for items in the selection pool in batch.</p>
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
     * <b>description</b> :
     * <p>Queries child division codes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries child division codes.</p>
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
     * <b>description</b> :
     * <p>Queries child division codes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries child division codes.</p>
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
     * <b>description</b> :
     * <p>Queries a list of orders.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of orders.</p>
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
     * <b>description</b> :
     * <p>Queries a list of orders.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of orders.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * This API will be offline soon. For purchase order rendering, use the SplitPurchaseOrder API, which supports both purchase order rendering and splitting.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Renders a purchase order and returns both sellable and unsellable products. Customers can then select the sellable products to place their orders.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: 
     * This API will be offline soon. For purchase order rendering, use the SplitPurchaseOrder API, which supports both purchase order rendering and splitting.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Renders a purchase order and returns both sellable and unsellable products. Customers can then select the sellable products to place their orders.</p>
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
     * <b>description</b> :
     * <p>Renders a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Reverse Single Rendering</p>
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
     * <b>description</b> :
     * <p>Renders a refund order.</p>
     * 
     * <b>summary</b> : 
     * <p>Reverse Single Rendering</p>
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
     * <b>summary</b> : 
     * <p>The product search API is a paginated interface for searching products based on various criteria.</p>
     * 
     * @param request SearchProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchProductsResponse
     */
    public SearchProductsResponse searchProductsWithOptions(SearchProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandName)) {
            body.put("brandName", request.brandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryIds)) {
            body.put("categoryIds", request.categoryIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createEndTime)) {
            body.put("createEndTime", request.createEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createStartTime)) {
            body.put("createStartTime", request.createStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionHighPrice)) {
            body.put("distributionHighPrice", request.distributionHighPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionHighPriceRatio)) {
            body.put("distributionHighPriceRatio", request.distributionHighPriceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionLowPrice)) {
            body.put("distributionLowPrice", request.distributionLowPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributionLowPriceRatio)) {
            body.put("distributionLowPriceRatio", request.distributionLowPriceRatio);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highMarkPrice)) {
            body.put("highMarkPrice", request.highMarkPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.highPrice)) {
            body.put("highPrice", request.highPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inGroup)) {
            body.put("inGroup", request.inGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inGroupEndTime)) {
            body.put("inGroupEndTime", request.inGroupEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inGroupStartTime)) {
            body.put("inGroupStartTime", request.inGroupStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inventoryRiskLevel)) {
            body.put("inventoryRiskLevel", request.inventoryRiskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lmItemId)) {
            body.put("lmItemId", request.lmItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowMarkPrice)) {
            body.put("lowMarkPrice", request.lowMarkPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lowPrice)) {
            body.put("lowPrice", request.lowPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyEndTime)) {
            body.put("modifyEndTime", request.modifyEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyStartTime)) {
            body.put("modifyStartTime", request.modifyStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            body.put("orderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDirection)) {
            body.put("orderDirection", request.orderDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            body.put("platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productId)) {
            body.put("productId", request.productId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productName)) {
            body.put("productName", request.productName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productStatus)) {
            body.put("productStatus", request.productStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            body.put("purchaserId", request.purchaserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxRate)) {
            body.put("taxRate", request.taxRate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tradeModeAndCredit)) {
            body.put("tradeModeAndCredit", request.tradeModeAndCredit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchProducts"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/searchProduct"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The product search API is a paginated interface for searching products based on various criteria.</p>
     * 
     * @param request SearchProductsRequest
     * @return SearchProductsResponse
     */
    public SearchProductsResponse searchProducts(SearchProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchProductsWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Distributors use this API to add products to their selection group.</p>
     * <blockquote>
     * <p>We recommend that distributors who onboard on or after January 1, 2025 use this API. For more information about adding products and the related impact, see the <a href="https://help.aliyun.com/zh/linkedmall/user-guide/product-interface-best-practices?spm=a2c4g.11186623.help-menu-88587.d_2_2_0_8_0.58122056oN3crP%5C&scm=20140722.H_2869668._.OR_help-T_cn~zh-V_1#lFENl">product best practices</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The distributor takes delivery of goods.</p>
     * 
     * @param request SelectionGroupAddProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectionGroupAddProductResponse
     */
    public SelectionGroupAddProductResponse selectionGroupAddProductWithOptions(SelectionGroupAddProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            body.put("productIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            body.put("purchaserId", request.purchaserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectionGroupAddProduct"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/addProduct"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectionGroupAddProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Distributors use this API to add products to their selection group.</p>
     * <blockquote>
     * <p>We recommend that distributors who onboard on or after January 1, 2025 use this API. For more information about adding products and the related impact, see the <a href="https://help.aliyun.com/zh/linkedmall/user-guide/product-interface-best-practices?spm=a2c4g.11186623.help-menu-88587.d_2_2_0_8_0.58122056oN3crP%5C&scm=20140722.H_2869668._.OR_help-T_cn~zh-V_1#lFENl">product best practices</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>The distributor takes delivery of goods.</p>
     * 
     * @param request SelectionGroupAddProductRequest
     * @return SelectionGroupAddProductResponse
     */
    public SelectionGroupAddProductResponse selectionGroupAddProduct(SelectionGroupAddProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectionGroupAddProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Distributors use this API to remove products from their stock.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes products from a distributor\&quot;s stock.</p>
     * 
     * @param request SelectionGroupRemoveProductRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SelectionGroupRemoveProductResponse
     */
    public SelectionGroupRemoveProductResponse selectionGroupRemoveProductWithOptions(SelectionGroupRemoveProductRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productIds)) {
            body.put("productIds", request.productIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaserId)) {
            body.put("purchaserId", request.purchaserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SelectionGroupRemoveProduct"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/opensaas-s2b/opensaas-s2b-biz-trade/v2/selectionPool/selection-group/product/command/removeProduct"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SelectionGroupRemoveProductResponse());
    }

    /**
     * <b>description</b> :
     * <p>Distributors use this API to remove products from their stock.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes products from a distributor\&quot;s stock.</p>
     * 
     * @param request SelectionGroupRemoveProductRequest
     * @return SelectionGroupRemoveProductResponse
     */
    public SelectionGroupRemoveProductResponse selectionGroupRemoveProduct(SelectionGroupRemoveProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.selectionGroupRemoveProductWithOptions(request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this API before creating a purchase order. It returns two lists: one for sellable items and one for unsellable items. The sellable items list follows the final parent-child order split structure.</p>
     * 
     * <b>summary</b> : 
     * <p>Splits a purchase order and renders the resulting parent-child order structure. This API returns a list of items based on the final parent-child order structure. Distributors can use this response to render the final parent-child order layout, which simplifies receiving the purchase order creation success message and backfilling parent-child order information later.</p>
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
     * <b>description</b> :
     * <p>Call this API before creating a purchase order. It returns two lists: one for sellable items and one for unsellable items. The sellable items list follows the final parent-child order split structure.</p>
     * 
     * <b>summary</b> : 
     * <p>Splits a purchase order and renders the resulting parent-child order structure. This API returns a list of items based on the final parent-child order structure. Distributors can use this response to render the final parent-child order layout, which simplifies receiving the purchase order creation success message and backfilling parent-child order information later.</p>
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
