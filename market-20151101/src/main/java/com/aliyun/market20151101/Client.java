// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101;

import com.aliyun.tea.*;
import com.aliyun.market20151101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._productId = "Market";
        com.aliyun.gateway.pop.Client gatewayClient = new com.aliyun.gateway.pop.Client();
        this._spi = gatewayClient;
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "market.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "market.aliyuncs.com"),
            new TeaPair("cn-chengdu", "market.aliyuncs.com"),
            new TeaPair("cn-hongkong", "market.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "market.aliyuncs.com"),
            new TeaPair("cn-qingdao", "market.aliyuncs.com"),
            new TeaPair("cn-shanghai", "market.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "market.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "market.aliyuncs.com"),
            new TeaPair("eu-central-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "market.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "market.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "market.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "market.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "market.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("market", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Activates an authorization code by calling ActivateLicense.</p>
     * 
     * @param request ActivateLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicenseWithOptions(ActivateLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identification)) {
            query.put("Identification", request.identification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.licenseCode)) {
            query.put("LicenseCode", request.licenseCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActivateLicense"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActivateLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Activates an authorization code by calling ActivateLicense.</p>
     * 
     * @param request ActivateLicenseRequest
     * @return ActivateLicenseResponse
     */
    public ActivateLicenseResponse activateLicense(ActivateLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activateLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets auto-renewal.</p>
     * 
     * @param request AutoRenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AutoRenewInstanceResponse
     */
    public AutoRenewInstanceResponse autoRenewInstanceWithOptions(AutoRenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewCycle)) {
            body.put("AutoRenewCycle", request.autoRenewCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            body.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBizId)) {
            body.put("OrderBizId", request.orderBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            body.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AutoRenewInstance"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AutoRenewInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets auto-renewal.</p>
     * 
     * @param request AutoRenewInstanceRequest
     * @return AutoRenewInstanceResponse
     */
    public AutoRenewInstanceResponse autoRenewInstance(AutoRenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.autoRenewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Confirms the receipt of a subscription notification failure message.</p>
     * <ul>
     * <li>After a successful call, the message will no longer be returned in subsequent queries. The platform considers that the merchant has correctly processed the message.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Confirms that the merchant has received and processed a notification message. After this call, the message will no longer be returned in subsequent queries.</p>
     * 
     * @param request ConfirmNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmNotificationResponse
     */
    public ConfirmNotificationResponse confirmNotificationWithOptions(ConfirmNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notificationRequestId)) {
            query.put("NotificationRequestId", request.notificationRequestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmNotification"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmNotificationResponse());
    }

    /**
     * <b>description</b> :
     * <p>Confirms the receipt of a subscription notification failure message.</p>
     * <ul>
     * <li>After a successful call, the message will no longer be returned in subsequent queries. The platform considers that the merchant has correctly processed the message.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Confirms that the merchant has received and processed a notification message. After this call, the message will no longer be returned in subsequent queries.</p>
     * 
     * @param request ConfirmNotificationRequest
     * @return ConfirmNotificationResponse
     */
    public ConfirmNotificationResponse confirmNotification(ConfirmNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmNotificationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing method and <a href="https://market.aliyun.com/">pricing</a> of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateOrder operation to create an order.
     * Before calling this operation, make sure that you fully understand the billing method and pricing of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * @param request CreateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodity)) {
            query.put("Commodity", request.commodity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderSouce)) {
            query.put("OrderSouce", request.orderSouce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, make sure that you fully understand the billing method and <a href="https://market.aliyun.com/">pricing</a> of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Calls the CreateOrder operation to create an order.
     * Before calling this operation, make sure that you fully understand the billing method and pricing of Alibaba Cloud Marketplace products.
     * To create an order for a commercial image, refer to <a href="https://help.aliyun.com/document_detail/25499.html">CreateInstance</a>.</p>
     * 
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query cross-account role authorization information, including the authorized user\&quot;s Alibaba Cloud account UID, name, authorization time, and authorized role name.</p>
     * 
     * @param request CrossAccountVerifyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CrossAccountVerifyTokenResponse
     */
    public CrossAccountVerifyTokenResponse crossAccountVerifyTokenWithOptions(CrossAccountVerifyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CrossAccountVerifyToken"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CrossAccountVerifyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query cross-account role authorization information, including the authorized user\&quot;s Alibaba Cloud account UID, name, authorization time, and authorized role name.</p>
     * 
     * @param request CrossAccountVerifyTokenRequest
     * @return CrossAccountVerifyTokenResponse
     */
    public CrossAccountVerifyTokenResponse crossAccountVerifyToken(CrossAccountVerifyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.crossAccountVerifyTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><strong>Note: This API operation supports Alibaba Cloud accounts and RAM users in retrieving API quota, total capacity, and usage information.</strong></h3>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the API quota, total capacity, and usage data of a user.</p>
     * 
     * @param request DescribeApiMeteringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApiMeteringResponse
     */
    public DescribeApiMeteringResponse describeApiMeteringWithOptions(DescribeApiMeteringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApiMetering"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApiMeteringResponse());
    }

    /**
     * <b>description</b> :
     * <h3><strong>Note: This API operation supports Alibaba Cloud accounts and RAM users in retrieving API quota, total capacity, and usage information.</strong></h3>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the API quota, total capacity, and usage data of a user.</p>
     * 
     * @param request DescribeApiMeteringRequest
     * @return DescribeApiMeteringResponse
     */
    public DescribeApiMeteringResponse describeApiMetering(DescribeApiMeteringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApiMeteringWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeCurrentNodeInfo to retrieve the process information of the current node.</p>
     * 
     * @param request DescribeCurrentNodeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCurrentNodeInfoResponse
     */
    public DescribeCurrentNodeInfoResponse describeCurrentNodeInfoWithOptions(DescribeCurrentNodeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCurrentNodeInfo"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCurrentNodeInfoResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeCurrentNodeInfo to retrieve the process information of the current node.</p>
     * 
     * @param request DescribeCurrentNodeInfoRequest
     * @return DescribeCurrentNodeInfoResponse
     */
    public DescribeCurrentNodeInfoResponse describeCurrentNodeInfo(DescribeCurrentNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCurrentNodeInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of promotional products with detailed information.</p>
     * 
     * @param request DescribeDistributionProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDistributionProductsResponse
     */
    public DescribeDistributionProductsResponse describeDistributionProductsWithOptions(DescribeDistributionProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDistributionProducts"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDistributionProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of promotional products with detailed information.</p>
     * 
     * @param request DescribeDistributionProductsRequest
     * @return DescribeDistributionProductsResponse
     */
    public DescribeDistributionProductsResponse describeDistributionProducts(DescribeDistributionProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDistributionProductsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account. Calls from non-promotion service provider accounts will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves promotion links for promoted products.</p>
     * 
     * @param tmpReq DescribeDistributionProductsLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDistributionProductsLinkResponse
     */
    public DescribeDistributionProductsLinkResponse describeDistributionProductsLinkWithOptions(DescribeDistributionProductsLinkRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeDistributionProductsLinkShrinkRequest request = new DescribeDistributionProductsLinkShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.codes)) {
            request.codesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.codes, "Codes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codesShrink)) {
            query.put("Codes", request.codesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDistributionProductsLink"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDistributionProductsLinkResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call this operation by using a promotion service provider account. Calls from non-promotion service provider accounts will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves promotion links for promoted products.</p>
     * 
     * @param request DescribeDistributionProductsLinkRequest
     * @return DescribeDistributionProductsLinkResponse
     */
    public DescribeDistributionProductsLinkResponse describeDistributionProductsLink(DescribeDistributionProductsLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDistributionProductsLinkWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the information about failed subscription notifications for a service provider.</p>
     * <ul>
     * <li>If no unconfirmed failed notifications exist, TotalCount returns 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of failed subscription notifications. After Alibaba Cloud Marketplace fails to call a service provider\&quot;s message SPI, the service provider can use this operation to proactively query the failed notification information.</p>
     * 
     * @param request DescribeFailedNotificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFailedNotificationsResponse
     */
    public DescribeFailedNotificationsResponse describeFailedNotificationsWithOptions(DescribeFailedNotificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFailedNotifications"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFailedNotificationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the information about failed subscription notifications for a service provider.</p>
     * <ul>
     * <li>If no unconfirmed failed notifications exist, TotalCount returns 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of failed subscription notifications. After Alibaba Cloud Marketplace fails to call a service provider\&quot;s message SPI, the service provider can use this operation to proactively query the failed notification information.</p>
     * 
     * @param request DescribeFailedNotificationsRequest
     * @return DescribeFailedNotificationsResponse
     */
    public DescribeFailedNotificationsResponse describeFailedNotifications(DescribeFailedNotificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFailedNotificationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>服务商侧查询镜像实例信息</p>
     * 
     * @param request DescribeImageInstanceForIsvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageInstanceForIsvResponse
     */
    public DescribeImageInstanceForIsvResponse describeImageInstanceForIsvWithOptions(DescribeImageInstanceForIsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerPk)) {
            query.put("CustomerPk", request.customerPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageInstanceForIsv"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageInstanceForIsvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>服务商侧查询镜像实例信息</p>
     * 
     * @param request DescribeImageInstanceForIsvRequest
     * @return DescribeImageInstanceForIsvResponse
     */
    public DescribeImageInstanceForIsvResponse describeImageInstanceForIsv(DescribeImageInstanceForIsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageInstanceForIsvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeInstance operation to query instance information.</p>
     * 
     * @param request DescribeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstance"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls the DescribeInstance operation to query instance information.</p>
     * 
     * @param request DescribeInstanceRequest
     * @return DescribeInstanceResponse
     */
    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance information from the service provider side.</p>
     * 
     * @param request DescribeInstanceForIsvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceForIsvResponse
     */
    public DescribeInstanceForIsvResponse describeInstanceForIsvWithOptions(DescribeInstanceForIsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceForIsv"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceForIsvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance information from the service provider side.</p>
     * 
     * @param request DescribeInstanceForIsvRequest
     * @return DescribeInstanceForIsvResponse
     */
    public DescribeInstanceForIsvResponse describeInstanceForIsv(DescribeInstanceForIsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceForIsvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of services purchased by the user.</p>
     * 
     * @param request DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.codes)) {
            query.put("Codes", request.codes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exceptCodes)) {
            query.put("ExceptCodes", request.exceptCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of services purchased by the user.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries business information based on an authorization code and first verifies whether the authorization code is valid.</p>
     * <ul>
     * <li>If the authorization code is invalid, an error message is returned.</li>
     * <li>If the authorization code is valid, the authorization information is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the invoice information of a Cloud Marketplace vendor store.</p>
     * 
     * @param request DescribeInvoiceForIsvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvoiceForIsvResponse
     */
    public DescribeInvoiceForIsvResponse describeInvoiceForIsvWithOptions(DescribeInvoiceForIsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceId)) {
            query.put("InvoiceId", request.invoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvoiceForIsv"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvoiceForIsvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries business information based on an authorization code and first verifies whether the authorization code is valid.</p>
     * <ul>
     * <li>If the authorization code is invalid, an error message is returned.</li>
     * <li>If the authorization code is valid, the authorization information is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the invoice information of a Cloud Marketplace vendor store.</p>
     * 
     * @param request DescribeInvoiceForIsvRequest
     * @return DescribeInvoiceForIsvResponse
     */
    public DescribeInvoiceForIsvResponse describeInvoiceForIsv(DescribeInvoiceForIsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvoiceForIsvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribeLicense to query license information.</p>
     * 
     * @param request DescribeLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLicenseResponse
     */
    public DescribeLicenseResponse describeLicenseWithOptions(DescribeLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.licenseCode)) {
            query.put("LicenseCode", request.licenseCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLicense"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribeLicense to query license information.</p>
     * 
     * @param request DescribeLicenseRequest
     * @return DescribeLicenseResponse
     */
    public DescribeLicenseResponse describeLicense(DescribeLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified order.</p>
     * 
     * @param request DescribeOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrderResponse
     */
    public DescribeOrderResponse describeOrderWithOptions(DescribeOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrder"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified order.</p>
     * 
     * @param request DescribeOrderRequest
     * @return DescribeOrderResponse
     */
    public DescribeOrderResponse describeOrder(DescribeOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries order details from the service provider side.</p>
     * 
     * @param request DescribeOrderForIsvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrderForIsvResponse
     */
    public DescribeOrderForIsvResponse describeOrderForIsvWithOptions(DescribeOrderForIsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrderForIsv"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrderForIsvResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries order details from the service provider side.</p>
     * 
     * @param request DescribeOrderForIsvRequest
     * @return DescribeOrderForIsvResponse
     */
    public DescribeOrderForIsvResponse describeOrderForIsv(DescribeOrderForIsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrderForIsvWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribePrice to query the price information of the corresponding product.</p>
     * 
     * @param request DescribePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodity)) {
            query.put("Commodity", request.commodity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribePrice to query the price information of the corresponding product.</p>
     * 
     * @param request DescribePriceRequest
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified product.</p>
     * 
     * @param request DescribeProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductResponse
     */
    public DescribeProductResponse describeProductWithOptions(DescribeProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUid)) {
            query.put("AliUid", request.aliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryDraft)) {
            query.put("QueryDraft", request.queryDraft);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProduct"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified product.</p>
     * 
     * @param request DescribeProductRequest
     * @return DescribeProductResponse
     */
    public DescribeProductResponse describeProduct(DescribeProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of products that meet the specified conditions along with their details.</p>
     * 
     * @param request DescribeProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProductsWithOptions(DescribeProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTerm)) {
            query.put("SearchTerm", request.searchTerm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProducts"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of products that meet the specified conditions along with their details.</p>
     * 
     * @param request DescribeProductsRequest
     * @return DescribeProductsResponse
     */
    public DescribeProductsResponse describeProducts(DescribeProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of project attachments.</p>
     * 
     * @param request DescribeProjectAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectAttachmentsResponse
     */
    public DescribeProjectAttachmentsResponse describeProjectAttachmentsWithOptions(DescribeProjectAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectAttachments"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectAttachmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of project attachments.</p>
     * 
     * @param request DescribeProjectAttachmentsRequest
     * @return DescribeProjectAttachmentsResponse
     */
    public DescribeProjectAttachmentsResponse describeProjectAttachments(DescribeProjectAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribeProjectInfo to query project information.</p>
     * 
     * @param request DescribeProjectInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectInfoResponse
     */
    public DescribeProjectInfoResponse describeProjectInfoWithOptions(DescribeProjectInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectInfo"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Calls DescribeProjectInfo to query project information.</p>
     * 
     * @param request DescribeProjectInfoRequest
     * @return DescribeProjectInfoResponse
     */
    public DescribeProjectInfoResponse describeProjectInfo(DescribeProjectInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of messages for a project workflow.</p>
     * 
     * @param request DescribeProjectMessagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectMessagesResponse
     */
    public DescribeProjectMessagesResponse describeProjectMessagesWithOptions(DescribeProjectMessagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectMessages"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectMessagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of messages for a project workflow.</p>
     * 
     * @param request DescribeProjectMessagesRequest
     * @return DescribeProjectMessagesResponse
     */
    public DescribeProjectMessagesResponse describeProjectMessages(DescribeProjectMessagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectMessagesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of project flow nodes by calling DescribeProjectNodes.</p>
     * 
     * @param request DescribeProjectNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectNodesResponse
     */
    public DescribeProjectNodesResponse describeProjectNodesWithOptions(DescribeProjectNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectNodes"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectNodesResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of project flow nodes by calling DescribeProjectNodes.</p>
     * 
     * @param request DescribeProjectNodesRequest
     * @return DescribeProjectNodesResponse
     */
    public DescribeProjectNodesResponse describeProjectNodes(DescribeProjectNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeProjectOperateLogs to retrieve the operation logs of a project flow.</p>
     * 
     * @param request DescribeProjectOperateLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProjectOperateLogsResponse
     */
    public DescribeProjectOperateLogsResponse describeProjectOperateLogsWithOptions(DescribeProjectOperateLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProjectOperateLogs"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProjectOperateLogsResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls DescribeProjectOperateLogs to retrieve the operation logs of a project flow.</p>
     * 
     * @param request DescribeProjectOperateLogsRequest
     * @return DescribeProjectOperateLogsResponse
     */
    public DescribeProjectOperateLogsResponse describeProjectOperateLogs(DescribeProjectOperateLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProjectOperateLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Completes the current process by calling FinishCurrentProjectNode.</p>
     * 
     * @param request FinishCurrentProjectNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FinishCurrentProjectNodeResponse
     */
    public FinishCurrentProjectNodeResponse finishCurrentProjectNodeWithOptions(FinishCurrentProjectNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateForm)) {
            query.put("TemplateForm", request.templateForm);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FinishCurrentProjectNode"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FinishCurrentProjectNodeResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Completes the current process by calling FinishCurrentProjectNode.</p>
     * 
     * @param request FinishCurrentProjectNodeRequest
     * @return FinishCurrentProjectNodeResponse
     */
    public FinishCurrentProjectNodeResponse finishCurrentProjectNode(FinishCurrentProjectNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.finishCurrentProjectNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries information about failed subscription notifications for merchants.</p>
     * <ul>
     * <li>If no unconfirmed notification failure information exists, TotalCount returns 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Processes invoice acceptance requests.</p>
     * 
     * @param request ModifyInvoiceForIsvRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInvoiceForIsvResponse
     */
    public ModifyInvoiceForIsvResponse modifyInvoiceForIsvWithOptions(ModifyInvoiceForIsvRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkNotice)) {
            query.put("CheckNotice", request.checkNotice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.electronUrl)) {
            query.put("ElectronUrl", request.electronUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceId)) {
            query.put("InvoiceId", request.invoiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.number)) {
            query.put("Number", request.number);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInvoiceForIsv"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInvoiceForIsvResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries information about failed subscription notifications for merchants.</p>
     * <ul>
     * <li>If no unconfirmed notification failure information exists, TotalCount returns 0.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Processes invoice acceptance requests.</p>
     * 
     * @param request ModifyInvoiceForIsvRequest
     * @return ModifyInvoiceForIsvResponse
     */
    public ModifyInvoiceForIsvResponse modifyInvoiceForIsv(ModifyInvoiceForIsvRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInvoiceForIsvWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls PauseProject to pause a project.</p>
     * 
     * @param request PauseProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseProjectResponse
     */
    public PauseProjectResponse pauseProjectWithOptions(PauseProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseProject"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseProjectResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls PauseProject to pause a project.</p>
     * 
     * @param request PauseProjectRequest
     * @return PauseProjectResponse
     */
    public PauseProjectResponse pauseProject(PauseProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Encoding and format requirements</h3>
     * <ul>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Ensure that the Metering field in the parameters is submitted strictly according to the examples in the documentation. In the past, many submissions were not valid JSON fields. You can use a JSON formatting tool to check the field before submission. Otherwise, the API call will fail.</li>
     * </ul>
     * <h3>Request frequency and single write volume limits</h3>
     * <ul>
     * <li>For hourly or daily metering: Alibaba Cloud Marketplace limits requests to once every 60 seconds per InstanceId, and each request supports writing up to 100 metering data records.</li>
     * <li>For real-time metering (for large model scenarios): Alibaba Cloud Marketplace has no frequency limit for requests per InstanceId, and each request supports writing up to 10 metering data records.</li>
     * </ul>
     * <h3>Limits on batch pushing of metering data</h3>
     * <ul>
     * <li>Batch pushing across InstanceIds of different products is not supported. When pushing in batches, ensure that all InstanceIds belong to the same product.</li>
     * <li>When pushing metering data in batches, the InstanceId attribute must belong to instances generated by the same product. Pushing instances of multiple products at the same time is not supported.</li>
     * </ul>
     * <h3>Time requirements for pushing metering data</h3>
     * <ul>
     * <li>For products billed hourly, the billing cutoff time is the next hour, and metering data must be pushed on time. For example, if the metering data is for 08:10 to 08:20, it must be pushed before 09:59. Otherwise, no bill will be generated. The rule for daily billing is similar: the data for the previous day must be pushed before 01:59 the next day. Otherwise, an error will be reported when pushing the metering data, and no bill will be generated.</li>
     * <li>For products billed by the minute, real-time pushed data is aggregated by the minute, and bills are generated by the minute.</li>
     * <li>If a product is set to real-time billing, StartTime and EndTime can be of any time width, but EndTime must be greater than StartTime.</li>
     * <li>If a product is set to non-real-time billing (such as hourly or daily), the interval between StartTime and EndTime must be greater than 5 minutes.</li>
     * </ul>
     * <h3>Timeliness of pushing data and billing</h3>
     * <ul>
     * <li>If the instance status is expired, metering data pushed after the expiration will not be billed. For example, if an instance expires at 2025-07-09 12:20:00, the metering data pushed for the hour from 2025-07-09 13:00:00 to 2025-07-09 14:00:00 will not be billed. However, the metering data for the hour from 2025-07-09 12:00:00 to 2025-07-09 13:00:00 can still be billed normally.</li>
     * <li>After metering data is pushed, bills are not generated immediately. For hourly billing, the bill is generated in the next time interval. For example, the bill for 08:00 to 09:00 is generated after 10:00. For daily billing, the bill is generated the next day. After the bill is generated, customers can view it in <a href="https://billing-cost.console.aliyun.com/finance/expense-report/expense-detail-by-instance">Alibaba Cloud Bill Details</a>.</li>
     * </ul>
     * <h3>Rounding down of amounts</h3>
     * <ul>
     * <li>If the bill amount is too small and a single bill amount is less than 0.01 CNY, the bill amount for the buyer is 0. For example, if the unit price of a product is 0.001 CNY per time and it is billed by the minute, and 9 times are consumed every minute, the bill amount per minute is 0. If it is billed hourly and the bill amount for a single hour is less than 0.01 CNY, the bill amount for the buyer is 0. The probability of rounding down to zero for minute-level billing may be higher than that for hourly billing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pushes metering data.</p>
     * 
     * @param request PushMeteringDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringDataWithOptions(PushMeteringDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.metering)) {
            query.put("Metering", request.metering);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushMeteringData"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushMeteringDataResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Encoding and format requirements</h3>
     * <ul>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Ensure that the Metering field in the parameters is submitted strictly according to the examples in the documentation. In the past, many submissions were not valid JSON fields. You can use a JSON formatting tool to check the field before submission. Otherwise, the API call will fail.</li>
     * </ul>
     * <h3>Request frequency and single write volume limits</h3>
     * <ul>
     * <li>For hourly or daily metering: Alibaba Cloud Marketplace limits requests to once every 60 seconds per InstanceId, and each request supports writing up to 100 metering data records.</li>
     * <li>For real-time metering (for large model scenarios): Alibaba Cloud Marketplace has no frequency limit for requests per InstanceId, and each request supports writing up to 10 metering data records.</li>
     * </ul>
     * <h3>Limits on batch pushing of metering data</h3>
     * <ul>
     * <li>Batch pushing across InstanceIds of different products is not supported. When pushing in batches, ensure that all InstanceIds belong to the same product.</li>
     * <li>When pushing metering data in batches, the InstanceId attribute must belong to instances generated by the same product. Pushing instances of multiple products at the same time is not supported.</li>
     * </ul>
     * <h3>Time requirements for pushing metering data</h3>
     * <ul>
     * <li>For products billed hourly, the billing cutoff time is the next hour, and metering data must be pushed on time. For example, if the metering data is for 08:10 to 08:20, it must be pushed before 09:59. Otherwise, no bill will be generated. The rule for daily billing is similar: the data for the previous day must be pushed before 01:59 the next day. Otherwise, an error will be reported when pushing the metering data, and no bill will be generated.</li>
     * <li>For products billed by the minute, real-time pushed data is aggregated by the minute, and bills are generated by the minute.</li>
     * <li>If a product is set to real-time billing, StartTime and EndTime can be of any time width, but EndTime must be greater than StartTime.</li>
     * <li>If a product is set to non-real-time billing (such as hourly or daily), the interval between StartTime and EndTime must be greater than 5 minutes.</li>
     * </ul>
     * <h3>Timeliness of pushing data and billing</h3>
     * <ul>
     * <li>If the instance status is expired, metering data pushed after the expiration will not be billed. For example, if an instance expires at 2025-07-09 12:20:00, the metering data pushed for the hour from 2025-07-09 13:00:00 to 2025-07-09 14:00:00 will not be billed. However, the metering data for the hour from 2025-07-09 12:00:00 to 2025-07-09 13:00:00 can still be billed normally.</li>
     * <li>After metering data is pushed, bills are not generated immediately. For hourly billing, the bill is generated in the next time interval. For example, the bill for 08:00 to 09:00 is generated after 10:00. For daily billing, the bill is generated the next day. After the bill is generated, customers can view it in <a href="https://billing-cost.console.aliyun.com/finance/expense-report/expense-detail-by-instance">Alibaba Cloud Bill Details</a>.</li>
     * </ul>
     * <h3>Rounding down of amounts</h3>
     * <ul>
     * <li>If the bill amount is too small and a single bill amount is less than 0.01 CNY, the bill amount for the buyer is 0. For example, if the unit price of a product is 0.001 CNY per time and it is billed by the minute, and 9 times are consumed every minute, the bill amount per minute is 0. If it is billed hourly and the bill amount for a single hour is less than 0.01 CNY, the bill amount for the buyer is 0. The probability of rounding down to zero for minute-level billing may be higher than that for hourly billing.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pushes metering data.</p>
     * 
     * @param request PushMeteringDataRequest
     * @return PushMeteringDataResponse
     */
    public PushMeteringDataResponse pushMeteringData(PushMeteringDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushMeteringDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation applies to prepaid pay-per-use products. Service providers can use this operation to push user usage deductions to Alibaba Cloud Marketplace.</li>
     * <li>This operation uses a forced update mode to directly deduct the specified number of uses. The caller must determine whether the user\&quot;s usage exceeds the limit.</li>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. The same <code>ClientToken</code> cannot be submitted repeatedly within 24 hours.</li>
     * <li>Retries for the same deduction operation must use the same <code>ClientToken</code>. New operations must use a new <code>ClientToken</code>.</li>
     * <li>If the previous request succeeded, even if no response was received due to a gateway timeout, a retry with the same <code>ClientToken</code> returns a success response idempotently without duplicate deductions.</li>
     * <li>If the result of the previous request is undetermined and the request is in the PROCESSING state, a retry with the same <code>ClientToken</code> returns a <code>DuplicateClientToken</code> error. Retry later or contact Alibaba Cloud Marketplace to confirm the push status.</li>
     * <li>Only one operation can be executed for the same <code>InstanceId</code> at a time. Concurrent requests return a <code>Throttling</code> error. Retry later.</li>
     * <li>You can directly call this operation in <a href="https://api.aliyun.com/#product=Market&api=PushTimesUsage&type=RPC&version=2015-11-01">OpenAPI Explorer</a> without the need to manually calculate the signature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pushes usage deductions for prepaid pay-per-use products to Alibaba Cloud Marketplace.</p>
     * 
     * @param request PushTimesUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushTimesUsageResponse
     */
    public PushTimesUsageResponse pushTimesUsageWithOptions(PushTimesUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjust)) {
            query.put("Adjust", request.adjust);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adjustDate)) {
            query.put("AdjustDate", request.adjustDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mark)) {
            query.put("Mark", request.mark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.times)) {
            query.put("Times", request.times);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushTimesUsage"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushTimesUsageResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Request description</h2>
     * <ul>
     * <li>This operation applies to prepaid pay-per-use products. Service providers can use this operation to push user usage deductions to Alibaba Cloud Marketplace.</li>
     * <li>This operation uses a forced update mode to directly deduct the specified number of uses. The caller must determine whether the user\&quot;s usage exceeds the limit.</li>
     * <li>All request parameters must be URL-encoded.</li>
     * <li>Use the <code>ClientToken</code> parameter to ensure idempotence. The same <code>ClientToken</code> cannot be submitted repeatedly within 24 hours.</li>
     * <li>Retries for the same deduction operation must use the same <code>ClientToken</code>. New operations must use a new <code>ClientToken</code>.</li>
     * <li>If the previous request succeeded, even if no response was received due to a gateway timeout, a retry with the same <code>ClientToken</code> returns a success response idempotently without duplicate deductions.</li>
     * <li>If the result of the previous request is undetermined and the request is in the PROCESSING state, a retry with the same <code>ClientToken</code> returns a <code>DuplicateClientToken</code> error. Retry later or contact Alibaba Cloud Marketplace to confirm the push status.</li>
     * <li>Only one operation can be executed for the same <code>InstanceId</code> at a time. Concurrent requests return a <code>Throttling</code> error. Retry later.</li>
     * <li>You can directly call this operation in <a href="https://api.aliyun.com/#product=Market&api=PushTimesUsage&type=RPC&version=2015-11-01">OpenAPI Explorer</a> without the need to manually calculate the signature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Pushes usage deductions for prepaid pay-per-use products to Alibaba Cloud Marketplace.</p>
     * 
     * @param request PushTimesUsageRequest
     * @return PushTimesUsageResponse
     */
    public PushTimesUsageResponse pushTimesUsage(PushTimesUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushTimesUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls ResumeProject to resume a paused project.</p>
     * 
     * @param request ResumeProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeProjectResponse
     */
    public ResumeProjectResponse resumeProjectWithOptions(ResumeProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeProject"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeProjectResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Calls ResumeProject to resume a paused project.</p>
     * 
     * @param request ResumeProjectRequest
     * @return ResumeProjectResponse
     */
    public ResumeProjectResponse resumeProject(ResumeProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeProjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers a rejection of the current process node by calling RollbackCurrentProjectNode.</p>
     * 
     * @param request RollbackCurrentProjectNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackCurrentProjectNodeResponse
     */
    public RollbackCurrentProjectNodeResponse rollbackCurrentProjectNodeWithOptions(RollbackCurrentProjectNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackCurrentProjectNode"),
            new TeaPair("version", "2015-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackCurrentProjectNodeResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>**.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Triggers a rejection of the current process node by calling RollbackCurrentProjectNode.</p>
     * 
     * @param request RollbackCurrentProjectNodeRequest
     * @return RollbackCurrentProjectNodeResponse
     */
    public RollbackCurrentProjectNodeResponse rollbackCurrentProjectNode(RollbackCurrentProjectNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackCurrentProjectNodeWithOptions(request, runtime);
    }
}
