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
     * <p>作废优惠券</p>
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
     * <p>作废优惠券</p>
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
     * <p>Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
     * You can call this operation to cancel the subscription to only one type of bill at a time.
     * After the subscription to a type of bill is canceled, bills of this type are no longer pushed to the specified Object Storage Service (OSS) bucket.
     * **This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the subscription to multi-level bills as an Alibaba Cloud eco-partner.</p>
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
     * <p>Make sure that you are a distributor of the Alibaba Cloud international ecosystem.
     * You can call this operation to cancel the subscription to only one type of bill at a time.
     * After the subscription to a type of bill is canceled, bills of this type are no longer pushed to the specified Object Storage Service (OSS) bucket.
     * **This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the subscription to multi-level bills as an Alibaba Cloud eco-partner.</p>
     * 
     * @param request CancelSubscriptionBillRequest
     * @return CancelSubscriptionBillResponse
     */
    public CancelSubscriptionBillResponse cancelSubscriptionBill(CancelSubscriptionBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelSubscriptionBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>优惠券审批状态列表</p>
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
     * <b>summary</b> : 
     * <p>优惠券审批状态列表</p>
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
     * <p>创建优惠券模板</p>
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
     * <p>创建优惠券模板</p>
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
     * <p>This function is designed for create a customer who is to be invited.</p>
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
     * <p>This function is designed for create a customer who is to be invited.</p>
     * 
     * @param request CreateCustomerRequest
     * @return CreateCustomerResponse
     */
    public CreateCustomerResponse createCustomer(CreateCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query quota adjustment list of Distribution Customer from International Site. Not available on Domestic Site.</p>
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
     * <b>summary</b> : 
     * <p>Query quota adjustment list of Distribution Customer from International Site. Not available on Domestic Site.</p>
     * 
     * @param request CustomerQuotaRecordListRequest
     * @return CustomerQuotaRecordListResponse
     */
    public CustomerQuotaRecordListResponse customerQuotaRecordList(CustomerQuotaRecordListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.customerQuotaRecordListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Note that sometimes you may find that the customer\&quot;s Used Credit is negative. This indicates that there is no need to restore the Used Credit, and its ready for customer\&quot;s usage. This phenomenon occurs because a refund is generated while the customer\&quot;s credit is full, thereby triggered additional increasing on the customer\&quot;s credit.
     * For example, if the customer\&quot;s maximum Available Credit is 1000 with no usage, and a refund of 300 occurs, the Used Credit will become -300.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to offset the Deducted Credit of a Distribution Customer. For example, if the current Deducted Credit is 500 and the Available Credit is 1000, by offsetting 300, the Deducted Credit will then become 200, and the Available Credit becomes 1300.</p>
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
     * <b>description</b> :
     * <p>Note that sometimes you may find that the customer\&quot;s Used Credit is negative. This indicates that there is no need to restore the Used Credit, and its ready for customer\&quot;s usage. This phenomenon occurs because a refund is generated while the customer\&quot;s credit is full, thereby triggered additional increasing on the customer\&quot;s credit.
     * For example, if the customer\&quot;s maximum Available Credit is 1000 with no usage, and a refund of 300 occurs, the Used Credit will become -300.</p>
     * 
     * <b>summary</b> : 
     * <p>This API is used to offset the Deducted Credit of a Distribution Customer. For example, if the current Deducted Credit is 500 and the Available Credit is 1000, by offsetting 300, the Deducted Credit will then become 200, and the Available Credit becomes 1300.</p>
     * 
     * @param request DeductOutstandingBalanceRequest
     * @return DeductOutstandingBalanceResponse
     */
    public DeductOutstandingBalanceResponse deductOutstandingBalance(DeductOutstandingBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deductOutstandingBalanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>作废优惠券模板</p>
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
     * <b>summary</b> : 
     * <p>作废优惠券模板</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Set the after-shutdown instance status for post-pay End Users as a Reseller.</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Set the after-shutdown instance status for post-pay End Users as a Reseller.</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Set the New Buy status for Sub-Customer as a Partner.</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Set the New Buy status for Sub-Customer as a Partner.</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the End User\&quot;s Shutdown Policy as a Reseller.</p>
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
     * <p>The caller should be the Partner as identified in the Alibaba Cloud distribution model. </br>
     * **This content is only published on the international site. **</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the End User\&quot;s Shutdown Policy as a Reseller.</p>
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
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
     * 
     * <b>summary</b> : 
     * <p>Export quota amount adjustment history as a Distribution Customer from International Site. Only available on International Site.</p>
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
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
     * 
     * <b>summary</b> : 
     * <p>Export quota amount adjustment history as a Distribution Customer from International Site. Only available on International Site.</p>
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
     * <p>额度冲减明细列表导出接口</p>
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
     * <p>额度冲减明细列表导出接口</p>
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
     * <p>Return Distribution Customer\&quot;s account information.</p>
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
     * <p>Return Distribution Customer\&quot;s account information.</p>
     * 
     * @param request GetAccountInfoRequest
     * @return GetAccountInfoResponse
     */
    public GetAccountInfoResponse getAccountInfo(GetAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提供返佣商品API</p>
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
     * <b>summary</b> : 
     * <p>提供返佣商品API</p>
     * 
     * @param request GetCommissionableProductsRequest
     * @return GetCommissionableProductsResponse
     */
    public GetCommissionableProductsResponse getCommissionableProducts(GetCommissionableProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommissionableProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询优惠券模板详情</p>
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
     * <b>summary</b> : 
     * <p>查询优惠券模板详情</p>
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
     * <p>国际渠道分销优惠券可抵扣产品</p>
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
     * <p>国际渠道分销优惠券可抵扣产品</p>
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
     * <p>Query Credit Control information of Distribution Customers. The PopCreditInfoJson in the Return Parameter will be empty if the Distribution Customer is an Agency. This function is only available for Resellers and Distributors.</p>
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
     * <p>Query Credit Control information of Distribution Customers. The PopCreditInfoJson in the Return Parameter will be empty if the Distribution Customer is an Agency. This function is only available for Resellers and Distributors.</p>
     * 
     * @param request GetCreditInfoRequest
     * @return GetCreditInfoResponse
     */
    public GetCreditInfoResponse getCreditInfo(GetCreditInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreditInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>客户订单查询</p>
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
     * <b>summary</b> : 
     * <p>客户订单查询</p>
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
     * <p>Issue Distributor\&quot;s daily Bill. This function is only available for Resellers and Distributors.</p>
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
     * <p>Issue Distributor\&quot;s daily Bill. This function is only available for Resellers and Distributors.</p>
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
     * <p>Query invitation status of customer who have been created and invited.</p>
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
     * <p>Query invitation status of customer who have been created and invited.</p>
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
     * <p>Issue Distributor\&quot;s Monthly Bill. This function is only available for Resellers and Distributors.</p>
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
     * <p>Issue Distributor\&quot;s Monthly Bill. This function is only available for Resellers and Distributors.</p>
     * 
     * @param request GetMonthlyBillRequest
     * @return GetMonthlyBillResponse
     */
    public GetMonthlyBillResponse getMonthlyBill(GetMonthlyBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMonthlyBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下单控制记录查询</p>
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
     * <b>summary</b> : 
     * <p>下单控制记录查询</p>
     * 
     * @param request GetPurchaseControlRecordRequest
     * @return GetPurchaseControlRecordResponse
     */
    public GetPurchaseControlRecordResponse getPurchaseControlRecord(GetPurchaseControlRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPurchaseControlRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询延停策略修改记录</p>
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
     * <b>summary</b> : 
     * <p>查询延停策略修改记录</p>
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
     * <p>Query all the Unassociated Customer.</p>
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
     * <p>Query all the Unassociated Customer.</p>
     * 
     * @param request GetUnassociatedCustomerRequest
     * @return GetUnassociatedCustomerResponse
     */
    public GetUnassociatedCustomerResponse getUnassociatedCustomer(GetUnassociatedCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUnassociatedCustomerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The current API request rate for the Cloud Product has not been disclosed.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiate the Partner registration invitation.</p>
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
     * <b>description</b> :
     * <p>The current API request rate for the Cloud Product has not been disclosed.</p>
     * 
     * <b>summary</b> : 
     * <p>Initiate the Partner registration invitation.</p>
     * 
     * @param request InviteSubAccountRequest
     * @return InviteSubAccountResponse
     */
    public InviteSubAccountResponse inviteSubAccount(InviteSubAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteSubAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>发放优惠券</p>
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
     * <p>发放优惠券</p>
     * 
     * @param request IssueCouponForCustomerRequest
     * @return IssueCouponForCustomerResponse
     */
    public IssueCouponForCustomerResponse issueCouponForCustomer(IssueCouponForCustomerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.issueCouponForCustomerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The current API request rate for cloud products has not been disclosed.</p>
     * 
     * <b>summary</b> : 
     * <p>This function is available for all Distributors. It displays the corresponding region code information based on the operable countries as agreed in the Distributor\&quot;s contract.</p>
     * 
     * @param request ListCountriesRequest
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
     * <b>description</b> :
     * <p>The current API request rate for cloud products has not been disclosed.</p>
     * 
     * <b>summary</b> : 
     * <p>This function is available for all Distributors. It displays the corresponding region code information based on the operable countries as agreed in the Distributor\&quot;s contract.</p>
     * @return ListCountriesResponse
     */
    public ListCountriesResponse listCountries() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCountriesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>优惠券使用量列表查询</p>
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
     * <b>summary</b> : 
     * <p>优惠券使用量列表查询</p>
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
     * <p>通用查询导出任务列表</p>
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
     * <p>通用查询导出任务列表</p>
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
     * <p>额度冲减明细列表</p>
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
     * <p>额度冲减明细列表</p>
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
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
     * 
     * <b>summary</b> : 
     * <p>Check the result of export quota list as a Distribution Customer from International Site. Only available on International Site.</p>
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
     * <p>Caller must be a Partner from International Site, either Distribution or Reseller will do.</p>
     * 
     * <b>summary</b> : 
     * <p>Check the result of export quota list as a Distribution Customer from International Site. Only available on International Site.</p>
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
     * <p>Resend invitation email.</p>
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
     * <p>Resend invitation email.</p>
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
     * <p>This function is designed for Sub Account information maintenance, including Nickname and Remark.</p>
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
     * <p>This function is designed for Sub Account information maintenance, including Nickname and Remark.</p>
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
     * <p>Set Credit Line for Distribution Customers. This function is only available for Resellers and Distributors.</p>
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
     * <p>Set Credit Line for Distribution Customers. This function is only available for Resellers and Distributors.</p>
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
     * <p>You can use this API to set the threshold for the use of credit control. When the customer credit control reaches below the threshold, it will pass through the notification email distributor. This feature is for Reseller and Distributor only.</p>
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
     * <p>You can use this API to set the threshold for the use of credit control. When the customer credit control reaches below the threshold, it will pass through the notification email distributor. This feature is for Reseller and Distributor only.</p>
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
     * <p>  Make sure that you are a distributor of the Alibaba Cloud international ecosystem.</p>
     * <ul>
     * <li>You can call this operation to subscribe to only one type of bill at a time.</li>
     * <li>After the subscription to a type of bill is generated, the bill for the previous day is pushed on a daily basis from the next day. On the fifth day of each month, the full-data bill for the previous month is pushed.</li>
     * <li>A daily bill may be delayed. The delayed bill is pushed the next day after it is generated. The delayed bill may contain the bill data that is delayed until the previous day. We recommend that you query the full-data bill for the previous month at the beginning of each month.</li>
     * <li>Your account must be granted the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The following file name formats are supported for bills:</li>
     * </ul>
     * <pre><code>BillingItemDetailForBillingPeriod
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01. 
     * InstanceDetailForBillingPeriod
     *  
     *  File name format of a daily bill: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01. 
     * BillingItemDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * InstanceDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * The fileNo field exists only when the number of bill rows reaches the maximum rows in a single bill file and the bill is split into multiple files.
     * </code></pre>
     * <p>**This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the subscription to multi-level bills as an Alibaba Cloud eco-partner.</p>
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
     * <p>  Make sure that you are a distributor of the Alibaba Cloud international ecosystem.</p>
     * <ul>
     * <li>You can call this operation to subscribe to only one type of bill at a time.</li>
     * <li>After the subscription to a type of bill is generated, the bill for the previous day is pushed on a daily basis from the next day. On the fifth day of each month, the full-data bill for the previous month is pushed.</li>
     * <li>A daily bill may be delayed. The delayed bill is pushed the next day after it is generated. The delayed bill may contain the bill data that is delayed until the previous day. We recommend that you query the full-data bill for the previous month at the beginning of each month.</li>
     * <li>Your account must be granted the <a href="https://ram.console.aliyun.com/?spm=api-workbench.API%20Document.0.0.68c71e0fhmTSJp#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The following file name formats are supported for bills:</li>
     * </ul>
     * <pre><code>BillingItemDetailForBillingPeriod
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_BillingItemDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerBillingItemDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetail_201903_0001_01. 
     * InstanceDetailForBillingPeriod
     *  
     *  File name format of a daily bill: UID_PartnerInstanceDetail_YYYYMMDD_SquenceNo_fileNo. Example: 169**_InstanceDetail_20190310_0001_01. 
     *   
     * File name format of a monthly full-data bill: UID_PartnerInstanceDetail_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetail_201903_1999-0001_01. 
     * BillingItemDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerBillingItemDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_BillingItemDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * InstanceDetailMonthly
     *   
     * File name format of a daily bill: UID_PartnerInstanceDetailMonthly_YYYYMM_SquenceNo_fileNo. Example: 169**_InstanceDetailMonthly_201903_0001_01. This bill contains the bill data that is generated from the beginning of the current month to the fifth day of the next month. 
     * The fileNo field exists only when the number of bill rows reaches the maximum rows in a single bill file and the bill is split into multiple files.
     * </code></pre>
     * <p>**This topic is published only on the international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Generates the subscription to multi-level bills as an Alibaba Cloud eco-partner.</p>
     * 
     * @param request SubscriptionBillRequest
     * @return SubscriptionBillResponse
     */
    public SubscriptionBillResponse subscriptionBill(SubscriptionBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscriptionBillWithOptions(request, runtime);
    }
}
