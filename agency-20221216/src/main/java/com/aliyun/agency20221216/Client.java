// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agency20221216;

import com.aliyun.tea.*;
import com.aliyun.agency20221216.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "agency.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "agency.aliyuncs.com"),
            new TeaPair("ap-south-1", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "agency.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-chengdu", "agency.aliyuncs.com"),
            new TeaPair("cn-edge-1", "agency.aliyuncs.com"),
            new TeaPair("cn-fujian", "agency.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "agency.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong", "agency.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "agency.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao", "agency.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "agency.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-wuhan", "agency.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "agency.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "agency.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "agency.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "agency.aliyuncs.com"),
            new TeaPair("eu-central-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1", "agency.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "agency.aliyuncs.com"),
            new TeaPair("me-east-1", "agency.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "agency.aliyuncs.com"),
            new TeaPair("us-east-1", "agency.aliyuncs.com"),
            new TeaPair("us-west-1", "agency.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agency", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Configures the automatic write-off feature before the end-of-month settlement. When the consumed but undeducted quota reaches the specified automatic write-off amount, the amount is transferred to the deducted quota for offset.</p>
     * 
     * @param request AutomaticWriteOffRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AutomaticWriteOffResponse
     */
    public AutomaticWriteOffResponse automaticWriteOffWithOptions(AutomaticWriteOffRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.automaticWriteOffAmount)) {
            query.put("AutomaticWriteOffAmount", request.automaticWriteOffAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.automaticWriteOffEnabled)) {
            query.put("AutomaticWriteOffEnabled", request.automaticWriteOffEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerUid)) {
            query.put("CustomerUid", request.customerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AutomaticWriteOff"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AutomaticWriteOffResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the automatic write-off feature before the end-of-month settlement. When the consumed but undeducted quota reaches the specified automatic write-off amount, the amount is transferred to the deducted quota for offset.</p>
     * 
     * @param request AutomaticWriteOffRequest
     * @return AutomaticWriteOffResponse
     */
    public AutomaticWriteOffResponse automaticWriteOff(AutomaticWriteOffRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.automaticWriteOffWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invalidates a coupon.</p>
     * 
     * @param request CancelCouponRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelCouponResponse
     */
    public CancelCouponResponse cancelCouponWithOptions(CancelCouponRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelCoupon"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelCouponResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invalidates a coupon.</p>
     * 
     * @param request CancelCouponRequest
     * @return CancelCouponResponse
     */
    public CancelCouponResponse cancelCoupon(CancelCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelCouponWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the caller is an international Alibaba Cloud master reseller partner.
     * You can unsubscribe from one type of bill file at a time.
     * After the corresponding bill type is unsubscribed, files are no longer pushed to the specified OSS space.
     * <strong>This content is published only on the international site.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribe from multi-level bills for international channel ecosystem partners.</p>
     * 
     * @param request CancelSubscriptionBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelSubscriptionBillResponse
     */
    public CancelSubscriptionBillResponse cancelSubscriptionBillWithOptions(CancelSubscriptionBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.subscribeType)) {
            query.put("SubscribeType", request.subscribeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelSubscriptionBill"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelSubscriptionBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the caller is an international Alibaba Cloud master reseller partner.
     * You can unsubscribe from one type of bill file at a time.
     * After the corresponding bill type is unsubscribed, files are no longer pushed to the specified OSS space.
     * <strong>This content is published only on the international site.</strong></p>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribe from multi-level bills for international channel ecosystem partners.</p>
     * 
     * @param request CancelSubscriptionBillRequest
     * @return CancelSubscriptionBillResponse
     */
    public CancelSubscriptionBillResponse cancelSubscriptionBill(CancelSubscriptionBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelSubscriptionBillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of coupon approval statuses.</p>
     * 
     * @param request CouponApprovalStatusListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CouponApprovalStatusListResponse
     */
    public CouponApprovalStatusListResponse couponApprovalStatusListWithOptions(CouponApprovalStatusListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateStatus)) {
            query.put("TemplateStatus", request.templateStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CouponApprovalStatusList"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CouponApprovalStatusListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of coupon approval statuses.</p>
     * 
     * @param request CouponApprovalStatusListRequest
     * @return CouponApprovalStatusListResponse
     */
    public CouponApprovalStatusListResponse couponApprovalStatusList(CouponApprovalStatusListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.couponApprovalStatusListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a coupon template.</p>
     * 
     * @param tmpReq CreateCouponTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCouponTemplateResponse
     */
    public CreateCouponTemplateResponse createCouponTemplateWithOptions(CreateCouponTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCouponTemplateShrinkRequest request = new CreateCouponTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.productType)) {
            request.productTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.productType, "ProductType", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicableProducts)) {
            query.put("ApplicableProducts", request.applicableProducts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costBearer)) {
            query.put("CostBearer", request.costBearer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponDescription)) {
            query.put("CouponDescription", request.couponDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireddate)) {
            query.put("Expireddate", request.expireddate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitPerPerson)) {
            query.put("LimitPerPerson", request.limitPerPerson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTypeShrink)) {
            query.put("ProductType", request.productTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purchaseType)) {
            query.put("PurchaseType", request.purchaseType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reasonForApplication)) {
            query.put("ReasonForApplication", request.reasonForApplication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateName)) {
            query.put("TemplateName", request.templateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vailddate)) {
            query.put("Vailddate", request.vailddate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vaildperioddays)) {
            query.put("Vaildperioddays", request.vaildperioddays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validUntil)) {
            query.put("ValidUntil", request.validUntil);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.value)) {
            query.put("Value", request.value);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCouponTemplate"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCouponTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a coupon template.</p>
     * 
     * @param request CreateCouponTemplateRequest
     * @return CreateCouponTemplateResponse
     */
    public CreateCouponTemplateResponse createCouponTemplate(CreateCouponTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCouponTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Registers a customer to be invited.</p>
     * 
     * @param request CreateCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomerResponse
     */
    public CreateCustomerResponse createCustomerWithOptions(CreateCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerName)) {
            query.put("CustomerName", request.customerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerSource)) {
            query.put("CustomerSource", request.customerSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerSubTrade)) {
            query.put("CustomerSubTrade", request.customerSubTrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerTrade)) {
            query.put("CustomerTrade", request.customerTrade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nation)) {
            query.put("Nation", request.nation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomer"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Registers a customer to be invited.</p>
     * 
     * @param request CreateCustomerRequest
     * @return CreateCustomerResponse
     */
    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be a channel master distributor partner or a channel distributor partner on the Alibaba Cloud International Website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota adjustment records for distribution customers on the Alibaba Cloud International Website. This operation applies only to international users and cannot be called on the Alibaba Cloud China Website.</p>
     * 
     * @param request CustomerQuotaRecordListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CustomerQuotaRecordListResponse
     */
    public CustomerQuotaRecordListResponse customerQuotaRecordListWithOptions(CustomerQuotaRecordListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CustomerQuotaRecordList"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CustomerQuotaRecordListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be a channel master distributor partner or a channel distributor partner on the Alibaba Cloud International Website.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota adjustment records for distribution customers on the Alibaba Cloud International Website. This operation applies only to international users and cannot be called on the Alibaba Cloud China Website.</p>
     * 
     * @param request CustomerQuotaRecordListRequest
     * @return CustomerQuotaRecordListResponse
     */
    public CustomerQuotaRecordListResponse customerQuotaRecordList(CustomerQuotaRecordListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.customerQuotaRecordListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reduces the deducted credit of a reseller\&quot;s customer. For example, if the current deducted credit is 500 and the available credit is 1000, a reduction of 300 changes the deducted credit to 200 and the available credit to 1300.
     * Note: Sometimes the used credit of a customer may be negative. This indicates that no recovery of the used credit is needed. Wait for the customer to consume the credit. This occurs when a refund is issued while the customer\&quot;s credit is fully used. As a result, the customer\&quot;s credit increases beyond the original limit.
     * For example, if the current maximum available credit of a customer is 1000 with no usage, and a refund of 300 occurs, the used credit becomes -300.</p>
     * 
     * @param request DeductOutstandingBalanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeductOutstandingBalanceResponse
     */
    public DeductOutstandingBalanceResponse deductOutstandingBalanceWithOptions(DeductOutstandingBalanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deductAmount)) {
            query.put("DeductAmount", request.deductAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeductOutstandingBalance"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeductOutstandingBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reduces the deducted credit of a reseller\&quot;s customer. For example, if the current deducted credit is 500 and the available credit is 1000, a reduction of 300 changes the deducted credit to 200 and the available credit to 1300.
     * Note: Sometimes the used credit of a customer may be negative. This indicates that no recovery of the used credit is needed. Wait for the customer to consume the credit. This occurs when a refund is issued while the customer\&quot;s credit is fully used. As a result, the customer\&quot;s credit increases beyond the original limit.
     * For example, if the current maximum available credit of a customer is 1000 with no usage, and a refund of 300 occurs, the used credit becomes -300.</p>
     * 
     * @param request DeductOutstandingBalanceRequest
     * @return DeductOutstandingBalanceResponse
     */
    public DeductOutstandingBalanceResponse deductOutstandingBalance(DeductOutstandingBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deductOutstandingBalanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the current caller is a distribution partner. 
     * <notice>Available only on the China site.</notice>.</p>
     * 
     * <b>summary</b> : 
     * <p>Invalidates a coupon template.</p>
     * 
     * @param request DeleteCouponTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCouponTemplateResponse
     */
    public DeleteCouponTemplateResponse deleteCouponTemplateWithOptions(DeleteCouponTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCouponTemplate"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCouponTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the current caller is a distribution partner. 
     * <notice>Available only on the China site.</notice>.</p>
     * 
     * <b>summary</b> : 
     * <p>Invalidates a coupon template.</p>
     * 
     * @param request DeleteCouponTemplateRequest
     * @return DeleteCouponTemplateResponse
     */
    public DeleteCouponTemplateResponse deleteCouponTemplate(DeleteCouponTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCouponTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel master distributor partner or an Alibaba Cloud international channel distributor partner.
     * <strong>This content is published only on the China site (Chinese).</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Manages the shutdown status of pay-as-you-go instances for resold subordinate customers by Alibaba Cloud international channel master distributor partners and Alibaba Cloud international channel distributor partners.</p>
     * 
     * @param request EditEndUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditEndUserStatusResponse
     */
    public EditEndUserStatusResponse editEndUserStatusWithOptions(EditEndUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditEndUserStatus"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditEndUserStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel master distributor partner or an Alibaba Cloud international channel distributor partner.
     * <strong>This content is published only on the China site (Chinese).</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Manages the shutdown status of pay-as-you-go instances for resold subordinate customers by Alibaba Cloud international channel master distributor partners and Alibaba Cloud international channel distributor partners.</p>
     * 
     * @param request EditEndUserStatusRequest
     * @return EditEndUserStatusResponse
     */
    public EditEndUserStatusResponse editEndUserStatus(EditEndUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editEndUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud reseller partner.
     * <strong>This content is published only on the China site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the new purchase status of a subordinate reseller customer for an Alibaba Cloud reseller partner.</p>
     * 
     * @param request EditNewBuyStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditNewBuyStatusResponse
     */
    public EditNewBuyStatusResponse editNewBuyStatusWithOptions(EditNewBuyStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newBuyStatus)) {
            query.put("NewBuyStatus", request.newBuyStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditNewBuyStatus"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditNewBuyStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud reseller partner.
     * <strong>This content is published only on the China site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the new purchase status of a subordinate reseller customer for an Alibaba Cloud reseller partner.</p>
     * 
     * @param request EditNewBuyStatusRequest
     * @return EditNewBuyStatusResponse
     */
    public EditNewBuyStatusResponse editNewBuyStatus(EditNewBuyStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editNewBuyStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel distributor partner or an Alibaba Cloud international channel reseller partner.
     * <strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the shutdown policy of a subordinate customer by an Alibaba Cloud distributor partner or reseller partner.</p>
     * 
     * @param request EditZeroCreditShutdownRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditZeroCreditShutdownResponse
     */
    public EditZeroCreditShutdownResponse editZeroCreditShutdownWithOptions(EditZeroCreditShutdownRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.shutdownPolicy)) {
            query.put("ShutdownPolicy", request.shutdownPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditZeroCreditShutdown"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditZeroCreditShutdownResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international channel distributor partner or an Alibaba Cloud international channel reseller partner.
     * <strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the shutdown policy of a subordinate customer by an Alibaba Cloud distributor partner or reseller partner.</p>
     * 
     * @param request EditZeroCreditShutdownRequest
     * @return EditZeroCreditShutdownResponse
     */
    public EditZeroCreditShutdownResponse editZeroCreditShutdown(EditZeroCreditShutdownRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editZeroCreditShutdownWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the quota adjustment records of a distributor\&quot;s customer, corresponding to the total budget adjustment details export feature on ACPN.</p>
     * 
     * @param request ExportCustomerQuotaRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportCustomerQuotaRecordResponse
     */
    public ExportCustomerQuotaRecordResponse exportCustomerQuotaRecordWithOptions(ExportCustomerQuotaRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserPk)) {
            query.put("EndUserPk", request.endUserPk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportCustomerQuotaRecord"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportCustomerQuotaRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Exports the quota adjustment records of a distributor\&quot;s customer, corresponding to the total budget adjustment details export feature on ACPN.</p>
     * 
     * @param request ExportCustomerQuotaRecordRequest
     * @return ExportCustomerQuotaRecordResponse
     */
    public ExportCustomerQuotaRecordResponse exportCustomerQuotaRecord(ExportCustomerQuotaRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportCustomerQuotaRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the reversed deduction details from ACPN.</p>
     * 
     * @param request ExportReversedDeductionHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportReversedDeductionHistoryResponse
     */
    public ExportReversedDeductionHistoryResponse exportReversedDeductionHistoryWithOptions(ExportReversedDeductionHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportUid)) {
            query.put("ExportUid", request.exportUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportReversedDeductionHistory"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportReversedDeductionHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the reversed deduction details from ACPN.</p>
     * 
     * @param request ExportReversedDeductionHistoryRequest
     * @return ExportReversedDeductionHistoryResponse
     */
    public ExportReversedDeductionHistoryResponse exportReversedDeductionHistory(ExportReversedDeductionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportReversedDeductionHistoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the account information of distribution customers.</p>
     * 
     * @param request GetAccountInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountInfoResponse
     */
    public GetAccountInfoResponse getAccountInfoWithOptions(GetAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountInfo"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns the account information of distribution customers.</p>
     * 
     * @param request GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of all active and delisted commission-eligible commodities for T1-level international distribution partners. This operation is available only for international users and cannot be called on the China site.</p>
     * 
     * @param tmpReq GetCommissionableProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommissionableProductsResponse
     */
    public GetCommissionableProductsResponse getCommissionableProductsWithOptions(GetCommissionableProductsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCommissionableProductsShrinkRequest request = new GetCommissionableProductsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.listShowStatusList)) {
            request.listShowStatusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.listShowStatusList, "ListShowStatusList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCodeList)) {
            query.put("CommodityCodeList", request.commodityCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fiscalYear)) {
            query.put("FiscalYear", request.fiscalYear);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listShowStatusListShrink)) {
            query.put("ListShowStatusList", request.listShowStatusListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipCodeList)) {
            query.put("PipCodeList", request.pipCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realEndMonth)) {
            query.put("RealEndMonth", request.realEndMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.realStartMonth)) {
            query.put("RealStartMonth", request.realStartMonth);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommissionableProducts"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommissionableProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of all active and delisted commission-eligible commodities for T1-level international distribution partners. This operation is available only for international users and cannot be called on the China site.</p>
     * 
     * @param request GetCommissionableProductsRequest
     * @return GetCommissionableProductsResponse
     */
    public GetCommissionableProductsResponse getCommissionableProducts(GetCommissionableProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommissionableProductsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the International site</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a coupon template.</p>
     * 
     * @param request GetCouponTemplateDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCouponTemplateDetailResponse
     */
    public GetCouponTemplateDetailResponse getCouponTemplateDetailWithOptions(GetCouponTemplateDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCouponTemplateDetail"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCouponTemplateDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the International site</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a coupon template.</p>
     * 
     * @param request GetCouponTemplateDetailRequest
     * @return GetCouponTemplateDetailResponse
     */
    public GetCouponTemplateDetailResponse getCouponTemplateDetail(GetCouponTemplateDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCouponTemplateDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the products that can be offset by international channel distribution coupons.</p>
     * 
     * @param request GetCoupondeductProductCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCoupondeductProductCodeResponse
     */
    public GetCoupondeductProductCodeResponse getCoupondeductProductCodeWithOptions(GetCoupondeductProductCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCoupondeductProductCode"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCoupondeductProductCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the products that can be offset by international channel distribution coupons.</p>
     * 
     * @param request GetCoupondeductProductCodeRequest
     * @return GetCoupondeductProductCodeResponse
     */
    public GetCoupondeductProductCodeResponse getCoupondeductProductCode(GetCoupondeductProductCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCoupondeductProductCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the credit control information of a distributor customer. If the distributor customer is of the Agency type, the PopCreditInfoJson parameter in the response is empty. This feature is available only for Reseller and Distributor.</p>
     * 
     * @param request GetCreditInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreditInfoResponse
     */
    public GetCreditInfoResponse getCreditInfoWithOptions(GetCreditInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreditInfo"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreditInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the credit control information of a distributor customer. If the distributor customer is of the Agency type, the PopCreditInfoJson parameter in the response is empty. This feature is available only for Reseller and Distributor.</p>
     * 
     * @param request GetCreditInfoRequest
     * @return GetCreditInfoResponse
     */
    public GetCreditInfoResponse getCreditInfo(GetCreditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreditInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries customer orders on the Alibaba Cloud International site. This operation is only allowed for the international site.</p>
     * 
     * @param request GetCustomerOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerOrdersResponse
     */
    public GetCustomerOrdersResponse getCustomerOrdersWithOptions(GetCustomerOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerOrders"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerOrdersResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries customer orders on the Alibaba Cloud International site. This operation is only allowed for the international site.</p>
     * 
     * @param request GetCustomerOrdersRequest
     * @return GetCustomerOrdersResponse
     */
    public GetCustomerOrdersResponse getCustomerOrders(GetCustomerOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the daily bills for resellers and distributors. This feature is only available for resellers and distributors.</p>
     * 
     * @param request GetDailyBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDailyBillResponse
     */
    public GetDailyBillResponse getDailyBillWithOptions(GetDailyBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwner)) {
            query.put("BillOwner", request.billOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billType)) {
            query.put("BillType", request.billType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            query.put("Date", request.date);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDailyBill"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDailyBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the daily bills for resellers and distributors. This feature is only available for resellers and distributors.</p>
     * 
     * @param request GetDailyBillRequest
     * @return GetDailyBillResponse
     */
    public GetDailyBillResponse getDailyBill(GetDailyBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDailyBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the invitation status of registered customers who have been sent invitations.</p>
     * 
     * @param request GetInviteStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInviteStatusResponse
     */
    public GetInviteStatusResponse getInviteStatusWithOptions(GetInviteStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inviteStatusList)) {
            query.put("InviteStatusList", request.inviteStatusList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInviteStatus"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInviteStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the invitation status of registered customers who have been sent invitations.</p>
     * 
     * @param request GetInviteStatusRequest
     * @return GetInviteStatusResponse
     */
    public GetInviteStatusResponse getInviteStatus(GetInviteStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInviteStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the monthly bill for distributors. This feature is available only to resellers and distributors.</p>
     * 
     * @param request GetMonthlyBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMonthlyBillResponse
     */
    public GetMonthlyBillResponse getMonthlyBillWithOptions(GetMonthlyBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwner)) {
            query.put("BillOwner", request.billOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billType)) {
            query.put("BillType", request.billType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            query.put("Month", request.month);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMonthlyBill"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMonthlyBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the monthly bill for distributors. This feature is available only to resellers and distributors.</p>
     * 
     * @param request GetMonthlyBillRequest
     * @return GetMonthlyBillResponse
     */
    public GetMonthlyBillResponse getMonthlyBill(GetMonthlyBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonthlyBillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries order control change records.</p>
     * 
     * @param request GetPurchaseControlRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPurchaseControlRecordResponse
     */
    public GetPurchaseControlRecordResponse getPurchaseControlRecordWithOptions(GetPurchaseControlRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerUID)) {
            query.put("CustomerUID", request.customerUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationTime)) {
            query.put("OperationTime", request.operationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPurchaseControlRecord"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPurchaseControlRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries order control change records.</p>
     * 
     * @param request GetPurchaseControlRecordRequest
     * @return GetPurchaseControlRecordResponse
     */
    public GetPurchaseControlRecordResponse getPurchaseControlRecord(GetPurchaseControlRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPurchaseControlRecordWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.
     * <strong>This content is published only on the international site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the modification records of the deferred shutdown policy.</p>
     * 
     * @param request GetShutdownPolicyRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetShutdownPolicyRecordResponse
     */
    public GetShutdownPolicyRecordResponse getShutdownPolicyRecordWithOptions(GetShutdownPolicyRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerUID)) {
            query.put("CustomerUID", request.customerUID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationTime)) {
            query.put("OperationTime", request.operationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetShutdownPolicyRecord"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetShutdownPolicyRecordResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud international site channel master distributor partner or an Alibaba Cloud international site channel distributor partner.
     * <strong>This content is published only on the international site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the modification records of the deferred shutdown policy.</p>
     * 
     * @param request GetShutdownPolicyRecordRequest
     * @return GetShutdownPolicyRecordResponse
     */
    public GetShutdownPolicyRecordResponse getShutdownPolicyRecord(GetShutdownPolicyRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getShutdownPolicyRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a coupon application initiated by a tier-2 distributor. This operation applies only to distributors.</p>
     * 
     * @param request GetTier2CouponApprovalDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTier2CouponApprovalDetailResponse
     */
    public GetTier2CouponApprovalDetailResponse getTier2CouponApprovalDetailWithOptions(GetTier2CouponApprovalDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationSheetId)) {
            query.put("ApplicationSheetId", request.applicationSheetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTier2CouponApprovalDetail"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTier2CouponApprovalDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a coupon application initiated by a tier-2 distributor. This operation applies only to distributors.</p>
     * 
     * @param request GetTier2CouponApprovalDetailRequest
     * @return GetTier2CouponApprovalDetailResponse
     */
    public GetTier2CouponApprovalDetailResponse getTier2CouponApprovalDetail(GetTier2CouponApprovalDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTier2CouponApprovalDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all unassociated customers.</p>
     * 
     * @param request GetUnassociatedCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUnassociatedCustomerResponse
     */
    public GetUnassociatedCustomerResponse getUnassociatedCustomerWithOptions(GetUnassociatedCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUnassociatedCustomer"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUnassociatedCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all unassociated customers.</p>
     * 
     * @param request GetUnassociatedCustomerRequest
     * @return GetUnassociatedCustomerResponse
     */
    public GetUnassociatedCustomerResponse getUnassociatedCustomer(GetUnassociatedCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUnassociatedCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Invites a customer to register as a partner customer.</p>
     * 
     * @param request InviteSubAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InviteSubAccountResponse
     */
    public InviteSubAccountResponse inviteSubAccountWithOptions(InviteSubAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountInfoList)) {
            query.put("AccountInfoList", request.accountInfoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteSubAccount"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteSubAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Invites a customer to register as a partner customer.</p>
     * 
     * @param request InviteSubAccountRequest
     * @return InviteSubAccountResponse
     */
    public InviteSubAccountResponse inviteSubAccount(InviteSubAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteSubAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The caller of this operation must be a channel master reseller partner on Alibaba Cloud International Website.</li>
     * <li>The system automatically determines whether the invitation is cross-region based on whether the RegisterNation parameter falls within the T1 contract coverage area. You can call the ListCountries operation to query the contract coverage area.</li>
     * </ol>
     * <ul>
     * <li>If the invitation is cross-region, a cross-region invitation approval process is initiated. After Alibaba Cloud approves the request, an invitation registration email is sent to the specified email address.</li>
     * <li>If the invitation is not cross-region, an invitation registration email is sent directly.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invites T2 Reseller sub-accounts in batch as a T1 partner.</p>
     * 
     * @param request InviteSubResellerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InviteSubResellerResponse
     */
    public InviteSubResellerResponse inviteSubResellerWithOptions(InviteSubResellerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountInfoList)) {
            query.put("AccountInfoList", request.accountInfoList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteSubReseller"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteSubResellerResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>The caller of this operation must be a channel master reseller partner on Alibaba Cloud International Website.</li>
     * <li>The system automatically determines whether the invitation is cross-region based on whether the RegisterNation parameter falls within the T1 contract coverage area. You can call the ListCountries operation to query the contract coverage area.</li>
     * </ol>
     * <ul>
     * <li>If the invitation is cross-region, a cross-region invitation approval process is initiated. After Alibaba Cloud approves the request, an invitation registration email is sent to the specified email address.</li>
     * <li>If the invitation is not cross-region, an invitation registration email is sent directly.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Invites T2 Reseller sub-accounts in batch as a T1 partner.</p>
     * 
     * @param request InviteSubResellerRequest
     * @return InviteSubResellerResponse
     */
    public InviteSubResellerResponse inviteSubReseller(InviteSubResellerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteSubResellerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Issues coupons.</p>
     * 
     * @param request IssueCouponForCustomerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IssueCouponForCustomerResponse
     */
    public IssueCouponForCustomerResponse issueCouponForCustomerWithOptions(IssueCouponForCustomerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationReason)) {
            query.put("ApplicationReason", request.applicationReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateId)) {
            query.put("CouponTemplateId", request.couponTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isUseBenefit)) {
            query.put("IsUseBenefit", request.isUseBenefit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uidlist)) {
            query.put("Uidlist", request.uidlist);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IssueCouponForCustomer"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IssueCouponForCustomerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Issues coupons.</p>
     * 
     * @param request IssueCouponForCustomerRequest
     * @return IssueCouponForCustomerResponse
     */
    public IssueCouponForCustomerResponse issueCouponForCustomer(IssueCouponForCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.issueCouponForCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of serviceable regions. This feature is available to all distributors. The response returns region codes based on the serviceable countries specified in the distributor contract.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCountriesResponse
     */
    public ListCountriesResponse listCountriesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCountries"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCountriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of serviceable regions. This feature is available to all distributors. The response returns region codes based on the serviceable countries specified in the distributor contract.</p>
     * @return ListCountriesResponse
     */
    public ListCountriesResponse listCountries() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCountriesWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of coupons issued by a distribution partner.</p>
     * 
     * @param request ListCouponUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCouponUsageResponse
     */
    public ListCouponUsageResponse listCouponUsageWithOptions(ListCouponUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateId)) {
            query.put("CouponTemplateId", request.couponTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.t2PartnerUid)) {
            query.put("T2PartnerUid", request.t2PartnerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCouponUsage"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCouponUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Ensure that the current calling account is a distribution partner. 
     * <notice>Available only on the international site.</notice></p>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of coupons issued by a distribution partner.</p>
     * 
     * @param request ListCouponUsageRequest
     * @return ListCouponUsageResponse
     */
    public ListCouponUsageResponse listCouponUsage(ListCouponUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCouponUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of exported files.</p>
     * 
     * @param request ListExportTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExportTasksResponse
     */
    public ListExportTasksResponse listExportTasksWithOptions(ListExportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneCode)) {
            query.put("SceneCode", request.sceneCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExportTasks"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExportTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of exported files.</p>
     * 
     * @param request ListExportTasksRequest
     * @return ListExportTasksResponse
     */
    public ListExportTasksResponse listExportTasks(ListExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExportTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coupon applications submitted by secondary distributors for their end users. This operation applies only to tier-1 distributors.</p>
     * 
     * @param request ListTier2CouponApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTier2CouponApprovalResponse
     */
    public ListTier2CouponApprovalResponse listTier2CouponApprovalWithOptions(ListTier2CouponApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationSheetId)) {
            query.put("ApplicationSheetId", request.applicationSheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalStatus)) {
            query.put("ApprovalStatus", request.approvalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.t2PartnerName)) {
            query.put("T2PartnerName", request.t2PartnerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.t2PartnerUid)) {
            query.put("T2PartnerUid", request.t2PartnerUid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTier2CouponApproval"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTier2CouponApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coupon applications submitted by secondary distributors for their end users. This operation applies only to tier-1 distributors.</p>
     * 
     * @param request ListTier2CouponApprovalRequest
     * @return ListTier2CouponApprovalResponse
     */
    public ListTier2CouponApprovalResponse listTier2CouponApproval(ListTier2CouponApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTier2CouponApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Approves a process that requires partner approval. This operation is applicable only to distributors.</p>
     * 
     * @param request ProcessApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessApprovalResponse
     */
    public ProcessApprovalResponse processApprovalWithOptions(ProcessApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationSheetId)) {
            query.put("ApplicationSheetId", request.applicationSheetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalAction)) {
            query.put("ApprovalAction", request.approvalAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalComments)) {
            query.put("ApprovalComments", request.approvalComments);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessApproval"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessApprovalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Approves a process that requires partner approval. This operation is applicable only to distributors.</p>
     * 
     * @param request ProcessApprovalRequest
     * @return ProcessApprovalResponse
     */
    public ProcessApprovalResponse processApproval(ProcessApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processApprovalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the change records of the automatic write-off quota by using paging.</p>
     * 
     * @param request QueryAutomaticWriteOffChangeRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAutomaticWriteOffChangeRecordsResponse
     */
    public QueryAutomaticWriteOffChangeRecordsResponse queryAutomaticWriteOffChangeRecordsWithOptions(QueryAutomaticWriteOffChangeRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customerUid)) {
            query.put("CustomerUid", request.customerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAutomaticWriteOffChangeRecords"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAutomaticWriteOffChangeRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the change records of the automatic write-off quota by using paging.</p>
     * 
     * @param request QueryAutomaticWriteOffChangeRecordsRequest
     * @return QueryAutomaticWriteOffChangeRecordsResponse
     */
    public QueryAutomaticWriteOffChangeRecordsResponse queryAutomaticWriteOffChangeRecords(QueryAutomaticWriteOffChangeRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAutomaticWriteOffChangeRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota offset details of a specified customer.</p>
     * 
     * @param request QueryReversedDeductionHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryReversedDeductionHistoryResponse
     */
    public QueryReversedDeductionHistoryResponse queryReversedDeductionHistoryWithOptions(QueryReversedDeductionHistoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            query.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryReversedDeductionHistory"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryReversedDeductionHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the quota offset details of a specified customer.</p>
     * 
     * @param request QueryReversedDeductionHistoryRequest
     * @return QueryReversedDeductionHistoryResponse
     */
    public QueryReversedDeductionHistoryResponse queryReversedDeductionHistory(QueryReversedDeductionHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryReversedDeductionHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota transaction export results for international distribution users. This API operation is available only on the international site.</p>
     * 
     * @param request QuotaListExportPagedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuotaListExportPagedResponse
     */
    public QuotaListExportPagedResponse quotaListExportPagedWithOptions(QuotaListExportPagedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuotaListExportPaged"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuotaListExportPagedResponse());
    }

    /**
     * <b>description</b> :
     * <p>The caller must be an Alibaba Cloud International site channel master distributor partner or an Alibaba Cloud International site channel distributor partner.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the quota transaction export results for international distribution users. This API operation is available only on the international site.</p>
     * 
     * @param request QuotaListExportPagedRequest
     * @return QuotaListExportPagedResponse
     */
    public QuotaListExportPagedResponse quotaListExportPaged(QuotaListExportPagedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.quotaListExportPagedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resends an invitation email.</p>
     * 
     * @param request ResendEmailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResendEmailResponse
     */
    public ResendEmailResponse resendEmailWithOptions(ResendEmailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inviteId)) {
            query.put("InviteId", request.inviteId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResendEmail"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResendEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resends an invitation email.</p>
     * 
     * @param request ResendEmailRequest
     * @return ResendEmailResponse
     */
    public ResendEmailResponse resendEmail(ResendEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resendEmailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates sub-account information, including the nickname and remarks.</p>
     * 
     * @param request SetAccountInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAccountInfoResponse
     */
    public SetAccountInfoResponse setAccountInfoWithOptions(SetAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountNickname)) {
            query.put("AccountNickname", request.accountNickname);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerBd)) {
            query.put("CustomerBd", request.customerBd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAccountInfo"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates sub-account information, including the nickname and remarks.</p>
     * 
     * @param request SetAccountInfoRequest
     * @return SetAccountInfoResponse
     */
    public SetAccountInfoResponse setAccountInfo(SetAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the credit limit for a reseller customer. This feature is available only for Resellers and Distributors.</p>
     * 
     * @param request SetCreditLineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetCreditLineResponse
     */
    public SetCreditLineResponse setCreditLineWithOptions(SetCreditLineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creditLine)) {
            query.put("CreditLine", request.creditLine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCreditLine"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCreditLineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the credit limit for a reseller customer. This feature is available only for Resellers and Distributors.</p>
     * 
     * @param request SetCreditLineRequest
     * @return SetCreditLineResponse
     */
    public SetCreditLineResponse setCreditLine(SetCreditLineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setCreditLineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the credit usage threshold. When a customer\&quot;s available credit falls below the threshold, the reseller is notified by email. This feature is available only for Resellers and Distributors.</p>
     * 
     * @param request SetWarningThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWarningThresholdResponse
     */
    public SetWarningThresholdResponse setWarningThresholdWithOptions(SetWarningThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warningValue)) {
            query.put("WarningValue", request.warningValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWarningThreshold"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWarningThresholdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the credit usage threshold. When a customer\&quot;s available credit falls below the threshold, the reseller is notified by email. This feature is available only for Resellers and Distributors.</p>
     * 
     * @param request SetWarningThresholdRequest
     * @return SetWarningThresholdResponse
     */
    public SetWarningThresholdResponse setWarningThreshold(SetWarningThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWarningThresholdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that the caller is an Alibaba Cloud international master reseller partner.</li>
     * <li>A user can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, bill files generated on the previous day are pushed daily starting from the next day. On the 5th of each month, full bill files for the previous billing cycle are pushed.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bill files are pushed the day after they are generated and may include bills that were delayed from earlier days. Pull the full files for the previous month at the beginning of each month.</li>
     * <li>Grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user.</li>
     * <li>File names.</li>
     * </ul>
     * <pre><code class="language-.">BillingItemDetailForBillingPeriod   (Billing item detail)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01.
     * InstanceDetailForBillingPeriod  (Instance bill detail)
     *  
     *  Daily push file name format: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01.
     * BillingItemDetailMonthly   (Billing item monthly bill)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * InstanceDetailMonthly  (Instance monthly bill)
     *   
     * Daily push file name format: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * fileNo exists only when the number of bill rows reaches the split threshold and the file is split.
     * </code></pre>
     * <p><strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to multi-level ecosystem partner bills on Alibaba Cloud International and generates bill files to OSS.</p>
     * 
     * @param request SubscriptionBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscriptionBillResponse
     */
    public SubscriptionBillResponse subscriptionBillWithOptions(SubscriptionBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginBillingCycle)) {
            query.put("BeginBillingCycle", request.beginBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billFormat)) {
            query.put("BillFormat", request.billFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketOwnerId)) {
            query.put("BucketOwnerId", request.bucketOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeBucket)) {
            query.put("SubscribeBucket", request.subscribeBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeSegmentSize)) {
            query.put("SubscribeSegmentSize", request.subscribeSegmentSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeType)) {
            query.put("SubscribeType", request.subscribeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscriptionBill"),
            new TeaPair("version", "2022-12-16"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscriptionBillResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Ensure that the caller is an Alibaba Cloud international master reseller partner.</li>
     * <li>A user can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, bill files generated on the previous day are pushed daily starting from the next day. On the 5th of each month, full bill files for the previous billing cycle are pushed.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bill files are pushed the day after they are generated and may include bills that were delayed from earlier days. Pull the full files for the previous month at the beginning of each month.</li>
     * <li>Grant the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user.</li>
     * <li>File names.</li>
     * </ul>
     * <pre><code class="language-.">BillingItemDetailForBillingPeriod   (Billing item detail)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01.
     * InstanceDetailForBillingPeriod  (Instance bill detail)
     *  
     *  Daily push file name format: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01.
     *   
     * Full file name format at the beginning of the next month: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01.
     * BillingItemDetailMonthly   (Billing item monthly bill)
     *   
     * Daily push file name format: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * InstanceDetailMonthly  (Instance monthly bill)
     *   
     * Daily push file name format: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This file is updated daily with full data from the beginning of the month to the current day, until the 5th of the next month.
     * fileNo exists only when the number of bill rows reaches the split threshold and the file is split.
     * </code></pre>
     * <p><strong>This content is published only on the Chinese site.</strong>.</p>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to multi-level ecosystem partner bills on Alibaba Cloud International and generates bill files to OSS.</p>
     * 
     * @param request SubscriptionBillRequest
     * @return SubscriptionBillResponse
     */
    public SubscriptionBillResponse subscriptionBill(SubscriptionBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscriptionBillWithOptions(request, runtime);
    }
}
