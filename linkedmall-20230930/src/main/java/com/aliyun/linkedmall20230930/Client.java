// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930;

import com.aliyun.tea.*;
import com.aliyun.linkedmall20230930.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "linkedmall";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
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
     * <p>Cancels an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an after-sales ticket.</p>
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
     * <p>Cancels an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels an after-sales ticket.</p>
     * @return CancelRefundOrderResponse
     */
    public CancelRefundOrderResponse cancelRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Confirms receipt.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms receipt.</p>
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
     * <p>Confirms receipt.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms receipt.</p>
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
     * <p>Backfills the waybill information.</p>
     * 
     * <b>summary</b> : 
     * <p>Backfills the waybill information.</p>
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
     * <p>Backfills the waybill information.</p>
     * 
     * <b>summary</b> : 
     * <p>Backfills the waybill information.</p>
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
     * <p>Creates a purchase order and returns the purchase order ID. The order creation result is notified through messages. After the order is created, you can query the orders associated with the purchase order by calling the order API.</p>
     * <blockquote>
     * <p>Warning: Because purchase order creation is an asynchronous task, if an error (such as a 503 error code) is returned when a distributor calls this API, do not immediately process consumer refunds on the business side. Wait for and consume the PurchaseOrderCreate message (the purchase order creation result message) to check the order status (for example, consume the order status synchronization message to check the order status) before you process business logic to prevent financial losses.
     * Notice: If you do not receive the PurchaseOrderCreate message (the purchase order creation result message) after you call the purchase order creation API, submit a ticket in the technical integration group to check the cause.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a purchase order and returns the purchase order ID. The order creation result is notified through messages. After the order is created, you can query the orders associated with the purchase order by calling the order API.</p>
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
     * <p>Creates a purchase order and returns the purchase order ID. The order creation result is notified through messages. After the order is created, you can query the orders associated with the purchase order by calling the order API.</p>
     * <blockquote>
     * <p>Warning: Because purchase order creation is an asynchronous task, if an error (such as a 503 error code) is returned when a distributor calls this API, do not immediately process consumer refunds on the business side. Wait for and consume the PurchaseOrderCreate message (the purchase order creation result message) to check the order status (for example, consume the order status synchronization message to check the order status) before you process business logic to prevent financial losses.
     * Notice: If you do not receive the PurchaseOrderCreate message (the purchase order creation result message) after you call the purchase order creation API, submit a ticket in the technical integration group to check the cause.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Creates a purchase order and returns the purchase order ID. The order creation result is notified through messages. After the order is created, you can query the orders associated with the purchase order by calling the order API.</p>
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
     * <p>Creates an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an after-sales ticket.</p>
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
     * <p>Creates an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an after-sales ticket.</p>
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
     * <p>Queries the details of the main order.</p>
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
     * <p>Queries the details of the main order.</p>
     * @return GetOrderResponse
     */
    public GetOrderResponse getOrder(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getOrderWithOptions(orderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the status of a transaction order.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of a purchase order.</p>
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
     * <p>Retrieves the status of a transaction order.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the status of a purchase order.</p>
     * @return GetPurchaseOrderStatusResponse
     */
    public GetPurchaseOrderStatusResponse getPurchaseOrderStatus(String purchaseOrderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaseOrderStatusWithOptions(purchaseOrderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the purchaser store.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the purchaser store.</p>
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
     * <p>Retrieves the purchaser store.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the purchaser store.</p>
     * @return GetPurchaserShopResponse
     */
    public GetPurchaserShopResponse getPurchaserShop(String purchaserId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPurchaserShopWithOptions(purchaserId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the details of an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an after-sales ticket.</p>
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
     * <p>Retrieves the details of an after-sales ticket.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of an after-sales ticket.</p>
     * @return GetRefundOrderResponse
     */
    public GetRefundOrderResponse getRefundOrder(String disputeId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRefundOrderWithOptions(disputeId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the details of products in the selection pool by product ID. You can specify a division code to query the regional inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of products in the selection pool.</p>
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
     * <p>Queries the details of products in the selection pool by product ID. You can specify a division code to query the regional inventory of the product.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of products in the selection pool.</p>
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
     * <p>Queries the sales information of products in the selection pool. Distributors can call this operation to query product sales information, such as product status. Pass the divisionCode parameter (a level-5 address code for a town or sub-district is recommended) to check whether the product is available for sale in the specified region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of products in the selection pool.</p>
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
     * <p>Queries the sales information of products in the selection pool. Distributors can call this operation to query product sales information, such as product status. Pass the divisionCode parameter (a level-5 address code for a town or sub-district is recommended) to check whether the product is available for sale in the specified region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of products in the selection pool.</p>
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
     * <p>Queries all subcategories based on a parent category ID, or queries category details based on a category ID. If the parent category ID (parentCategoryId) is set to 0, the first-level categories under the root category are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of categories.</p>
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
     * <p>Queries all subcategories based on a parent category ID, or queries category details based on a category ID. If the parent category ID (parentCategoryId) is set to 0, the first-level categories under the root category are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of categories.</p>
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
     * <p>Queries the logistics information of an order.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logistics information of an order.</p>
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
     * <p>Queries the logistics information of an order.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the logistics information of an order.</p>
     * @return ListLogisticsOrdersResponse
     */
    public ListLogisticsOrdersResponse listLogisticsOrders(String orderId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogisticsOrdersWithOptions(orderId, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of purchaser shops.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of purchaser shops.</p>
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
     * <p>Retrieves a list of purchaser shops.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of purchaser shops.</p>
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
     * <p>Queries the sales information of products in the selection pool in batches. Distributors can call this operation to batch query product sales information, such as product status. You can use the divisionCode parameter (we recommend passing a level-5 address code for a town or sub-district) to batch query whether a product is available for sale in a specific region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of products in the selection pool in batches.</p>
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
     * <p>Queries the sales information of products in the selection pool in batches. Distributors can call this operation to batch query product sales information, such as product status. You can use the divisionCode parameter (we recommend passing a level-5 address code for a town or sub-district) to batch query whether a product is available for sale in a specific region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of products in the selection pool in batches.</p>
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
     * <p>Queries the list of products in the product selection pool.</p>
     * 
     * @param request ListSelectionProductsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSelectionProductsResponse
     */
    public ListSelectionProductsResponse listSelectionProductsWithOptions(ListSelectionProductsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            query.put("cursor", request.cursor);
        }

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
     * <p>Queries the list of products in the product selection pool.</p>
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
     * <p>Batch query of SKU sales information in a selection pool: Distributors can call this operation to query SKU sales information in batches, such as SKU status. You can use the divisionCode parameter to query whether SKUs are available for sale in a specific region in batches. We recommend that you specify a level-5 division code, such as a town or sub-district code.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of SKUs in a selection pool in batches.</p>
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
     * <p>Batch query of SKU sales information in a selection pool: Distributors can call this operation to query SKU sales information in batches, such as SKU status. You can use the divisionCode parameter to query whether SKUs are available for sale in a specific region in batches. We recommend that you specify a level-5 division code, such as a town or sub-district code.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sales information of SKUs in a selection pool in batches.</p>
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
     * <p>Queries the sub-region codes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sub-region codes.</p>
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
     * <p>Queries the sub-region codes.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the sub-region codes.</p>
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
     * <p>Lists orders.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists orders.</p>
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
     * <p>Lists orders.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists orders.</p>
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
     * <p>Renders an after-sales order.</p>
     * 
     * <b>summary</b> : 
     * <p>Renders a reverse order.</p>
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
     * <p>Renders an after-sales order.</p>
     * 
     * <b>summary</b> : 
     * <p>Renders a reverse order.</p>
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
     * <b>description</b> :
     * <p>Performs a paged query on the product list based on the page number and paging size.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries products based on various conditions and returns paginated results.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.cursor)) {
            body.put("cursor", request.cursor);
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
     * <b>description</b> :
     * <p>Performs a paged query on the product list based on the page number and paging size.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries products based on various conditions and returns paginated results.</p>
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
     * <p>Distributors can use this API operation to add products to the selection pool.</p>
     * <blockquote>
     * <p>Integrate this API operation if you are a distributor customer who registered on or after January 1, 2025. For details about the import operations and their impacts, refer to <a href="https://www.alibabacloud.com/help/en/linkedmall/user-guide/product-interface-best-practices#lFENl">Product best practices</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds products to the selection pool for a distributor.</p>
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
     * <p>Distributors can use this API operation to add products to the selection pool.</p>
     * <blockquote>
     * <p>Integrate this API operation if you are a distributor customer who registered on or after January 1, 2025. For details about the import operations and their impacts, refer to <a href="https://www.alibabacloud.com/help/en/linkedmall/user-guide/product-interface-best-practices#lFENl">Product best practices</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds products to the selection pool for a distributor.</p>
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
     * <p>Allows a distributor to dispatch products.</p>
     * 
     * <b>summary</b> : 
     * <p>Dispatches products for a distributor.</p>
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
     * <p>Allows a distributor to dispatch products.</p>
     * 
     * <b>summary</b> : 
     * <p>Dispatches products for a distributor.</p>
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
