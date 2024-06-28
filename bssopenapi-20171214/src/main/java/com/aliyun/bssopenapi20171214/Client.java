// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214;

import com.aliyun.tea.*;
import com.aliyun.bssopenapi20171214.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-hangzhou", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai", "business.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "business.aliyuncs.com"),
            new TeaPair("cn-chengdu", "business.aliyuncs.com"),
            new TeaPair("cn-edge-1", "business.aliyuncs.com"),
            new TeaPair("cn-fujian", "business.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "business.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong", "business.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "business.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "business.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "business.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "business.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "business.aliyuncs.com"),
            new TeaPair("cn-wuhan", "business.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "business.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "business.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "business.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "business.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "business.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "business.aliyuncs.com"),
            new TeaPair("eu-central-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "business.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("bssopenapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>1\. For more information about a financial relationship, see <a href="https://help.aliyun.com/document_detail/100376.html?spm=a2c4g.11186623.6.563.52a83908ypl4yE">Financial relationships</a> or <a href="https://www.alibabacloud.com/help/en/doc-detail/116383.html">Financial relationships</a>. 2. If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a financial relationship.</p>
     * 
     * @param request AddAccountRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAccountRelationResponse
     */
    public AddAccountRelationResponse addAccountRelationWithOptions(AddAccountRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childNick)) {
            query.put("ChildNick", request.childNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childUserId)) {
            query.put("ChildUserId", request.childUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserId)) {
            query.put("ParentUserId", request.parentUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionCodes)) {
            query.put("PermissionCodes", request.permissionCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodes)) {
            query.put("RoleCodes", request.roleCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAccountRelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>1\. For more information about a financial relationship, see <a href="https://help.aliyun.com/document_detail/100376.html?spm=a2c4g.11186623.6.563.52a83908ypl4yE">Financial relationships</a> or <a href="https://www.alibabacloud.com/help/en/doc-detail/116383.html">Financial relationships</a>. 2. If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a financial relationship.</p>
     * 
     * @param request AddAccountRelationRequest
     * @return AddAccountRelationResponse
     */
    public AddAccountRelationResponse addAccountRelation(AddAccountRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAccountRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers resource instances from the source cost center to the destination cost center.</p>
     * 
     * @param request AllocateCostUnitResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateCostUnitResourceResponse
     */
    public AllocateCostUnitResourceResponse allocateCostUnitResourceWithOptions(AllocateCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromUnitId)) {
            query.put("FromUnitId", request.fromUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromUnitUserId)) {
            query.put("FromUnitUserId", request.fromUnitUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceList)) {
            query.put("ResourceInstanceList", request.resourceInstanceList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUnitId)) {
            query.put("ToUnitId", request.toUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toUnitUserId)) {
            query.put("ToUnitUserId", request.toUnitUserId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateCostUnitResource"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateCostUnitResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Transfers resource instances from the source cost center to the destination cost center.</p>
     * 
     * @param request AllocateCostUnitResourceRequest
     * @return AllocateCostUnitResourceResponse
     */
    public AllocateCostUnitResourceResponse allocateCostUnitResource(AllocateCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateCostUnitResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an application for an invoice.</p>
     * 
     * @param request ApplyInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyInvoiceResponse
     */
    public ApplyInvoiceResponse applyInvoiceWithOptions(ApplyInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressId)) {
            query.put("AddressId", request.addressId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyUserNick)) {
            query.put("ApplyUserNick", request.applyUserNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customerId)) {
            query.put("CustomerId", request.customerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceAmount)) {
            query.put("InvoiceAmount", request.invoiceAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceByAmount)) {
            query.put("InvoiceByAmount", request.invoiceByAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoicingType)) {
            query.put("InvoicingType", request.invoicingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processWay)) {
            query.put("ProcessWay", request.processWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedIds)) {
            query.put("SelectedIds", request.selectedIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userRemark)) {
            query.put("UserRemark", request.userRemark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyInvoice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyInvoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an application for an invoice.</p>
     * 
     * @param request ApplyInvoiceRequest
     * @return ApplyInvoiceResponse
     */
    public ApplyInvoiceResponse applyInvoice(ApplyInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an unpaid order.</p>
     * 
     * @param request CancelOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrder"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels an unpaid order.</p>
     * 
     * @param request CancelOrderRequest
     * @return CancelOrderResponse
     */
    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    /**
     * @param request ChangeResellerConsumeAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeResellerConsumeAmountResponse
     */
    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmountWithOptions(ChangeResellerConsumeAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adjustType)) {
            query.put("AdjustType", request.adjustType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            query.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendMap)) {
            query.put("ExtendMap", request.extendMap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizId)) {
            query.put("OutBizId", request.outBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResellerConsumeAmount"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResellerConsumeAmountResponse());
    }

    /**
     * @param request ChangeResellerConsumeAmountRequest
     * @return ChangeResellerConsumeAmountResponse
     */
    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResellerConsumeAmountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>1\. A member needs to confirm an invitation only if a financial management relationship is established between the management account and the member and enterprise names used by the management account and the member for real-name verification are different. 2. The permissions to be confirmed must be the same as those granted to the member when the management account initiates the invitation.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms the invitation initiated by the master account.</p>
     * 
     * @param request ConfirmRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmRelationResponse
     */
    public ConfirmRelationResponse confirmRelationWithOptions(ConfirmRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childUserId)) {
            query.put("ChildUserId", request.childUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.confirmCode)) {
            query.put("ConfirmCode", request.confirmCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserId)) {
            query.put("ParentUserId", request.parentUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionCodes)) {
            query.put("PermissionCodes", request.permissionCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationId)) {
            query.put("RelationId", request.relationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmRelationResponse());
    }

    /**
     * <b>description</b> :
     * <p>1\. A member needs to confirm an invitation only if a financial management relationship is established between the management account and the member and enterprise names used by the management account and the member for real-name verification are different. 2. The permissions to be confirmed must be the same as those granted to the member when the management account initiates the invitation.</p>
     * 
     * <b>summary</b> : 
     * <p>Confirms the invitation initiated by the master account.</p>
     * 
     * @param request ConfirmRelationRequest
     * @return ConfirmRelationResponse
     */
    public ConfirmRelationResponse confirmRelation(ConfirmRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the billing method of an instance. You can call this operation to switch the billing method from pay-as-you-go to subscription for Server Load Balancer (SLB) instances, elastic IP addresses (EIPs), and NAT gateways, and switch the billing method from subscription to pay-as-you-go for SLB instances and EIPs.</p>
     * 
     * @param request ConvertChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConvertChargeTypeResponse
     */
    public ConvertChargeTypeResponse convertChargeTypeWithOptions(ConvertChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertChargeType"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertChargeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the billing method of an instance. You can call this operation to switch the billing method from pay-as-you-go to subscription for Server Load Balancer (SLB) instances, elastic IP addresses (EIPs), and NAT gateways, and switch the billing method from subscription to pay-as-you-go for SLB instances and EIPs.</p>
     * 
     * @param request ConvertChargeTypeRequest
     * @return ConvertChargeTypeResponse
     */
    public ConvertChargeTypeResponse convertChargeType(ConvertChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an account so as to establish a master-member financial relationship.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an account to establish a financial relationship.</p>
     * 
     * @param request CreateAgAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAgAccountResponse
     */
    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountAttr)) {
            query.put("AccountAttr", request.accountAttr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityName)) {
            query.put("CityName", request.cityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enterpriseName)) {
            query.put("EnterpriseName", request.enterpriseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstName)) {
            query.put("FirstName", request.firstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastName)) {
            query.put("LastName", request.lastName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginEmail)) {
            query.put("LoginEmail", request.loginEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nationCode)) {
            query.put("NationCode", request.nationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.postcode)) {
            query.put("Postcode", request.postcode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceName)) {
            query.put("ProvinceName", request.provinceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgAccount"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to create an account so as to establish a master-member financial relationship.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an account to establish a financial relationship.</p>
     * 
     * @param request CreateAgAccountRequest
     * @return CreateAgAccountResponse
     */
    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cost center. You can create multiple cost centers at a time.</p>
     * 
     * @param request CreateCostUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCostUnitResponse
     */
    public CreateCostUnitResponse createCostUnitWithOptions(CreateCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.unitEntityList)) {
            query.put("UnitEntityList", request.unitEntityList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCostUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cost center. You can create multiple cost centers at a time.</p>
     * 
     * @param request CreateCostUnitRequest
     * @return CreateCostUnitResponse
     */
    public CreateCostUnitResponse createCostUnit(CreateCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCostUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance. If you call this operation, an order for a new instance is created and the order is automatically paid for. You cannot create Elastic Compute Service (ECS) instances or ApsaraDB RDS instances by calling the operation.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logistics)) {
            query.put("Logistics", request.logistics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            query.put("Parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewPeriod)) {
            query.put("RenewPeriod", request.renewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance. If you call this operation, an order for a new instance is created and the order is automatically paid for. You cannot create Elastic Compute Service (ECS) instances or ApsaraDB RDS instances by calling the operation.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     * 
     * @param request CreateResellerUserQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResellerUserQuotaResponse
     */
    public CreateResellerUserQuotaResponse createResellerUserQuotaWithOptions(CreateResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            query.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizId)) {
            query.put("OutBizId", request.outBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResellerUserQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResellerUserQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     * 
     * @param request CreateResellerUserQuotaRequest
     * @return CreateResellerUserQuotaResponse
     */
    public CreateResellerUserQuotaResponse createResellerUserQuota(CreateResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResellerUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource plan.</p>
     * 
     * @param request CreateResourcePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourcePackageResponse
     */
    public CreateResourcePackageResponse createResourcePackageWithOptions(CreateResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDate)) {
            query.put("EffectiveDate", request.effectiveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourcePackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource plan.</p>
     * 
     * @param request CreateResourcePackageRequest
     * @return CreateResourcePackageResponse
     */
    public CreateResourcePackageResponse createResourcePackage(CreateResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourcePackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a savings plan. After you call this operation, a savings plan is purchased and paid for.</p>
     * 
     * @param tmpReq CreateSavingsPlansInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSavingsPlansInstanceResponse
     */
    public CreateSavingsPlansInstanceResponse createSavingsPlansInstanceWithOptions(CreateSavingsPlansInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSavingsPlansInstanceShrinkRequest request = new CreateSavingsPlansInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extendMap)) {
            request.extendMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extendMap, "ExtendMap", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDate)) {
            query.put("EffectiveDate", request.effectiveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendMapShrink)) {
            query.put("ExtendMap", request.extendMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payMode)) {
            query.put("PayMode", request.payMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolValue)) {
            query.put("PoolValue", request.poolValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specType)) {
            query.put("SpecType", request.specType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavingsPlansInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavingsPlansInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a savings plan. After you call this operation, a savings plan is purchased and paid for.</p>
     * 
     * @param request CreateSavingsPlansInstanceRequest
     * @return CreateSavingsPlansInstanceResponse
     */
    public CreateSavingsPlansInstanceResponse createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSavingsPlansInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cost center.</p>
     * 
     * @param request DeleteCostUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCostUnitResponse
     */
    public DeleteCostUnitResponse deleteCostUnitWithOptions(DeleteCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("OwnerUid", request.ownerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitId)) {
            query.put("UnitId", request.unitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCostUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a cost center.</p>
     * 
     * @param request DeleteCostUnitRequest
     * @return DeleteCostUnitResponse
     */
    public DeleteCostUnitResponse deleteCostUnit(DeleteCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostUnitWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is in beta testing and is only available for specific users in the whitelist. Excessive calls may result in performance issues. For example, the response times out.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the summary information of the user &quot;Cost Management-Budget&quot;.</p>
     * 
     * @param request DescribeCostBudgetsSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCostBudgetsSummaryResponse
     */
    public DescribeCostBudgetsSummaryResponse describeCostBudgetsSummaryWithOptions(DescribeCostBudgetsSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            query.put("BudgetName", request.budgetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetStatus)) {
            query.put("BudgetStatus", request.budgetStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetType)) {
            query.put("BudgetType", request.budgetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCostBudgetsSummary"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCostBudgetsSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is in beta testing and is only available for specific users in the whitelist. Excessive calls may result in performance issues. For example, the response times out.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the summary information of the user &quot;Cost Management-Budget&quot;.</p>
     * 
     * @param request DescribeCostBudgetsSummaryRequest
     * @return DescribeCostBudgetsSummaryResponse
     */
    public DescribeCostBudgetsSummaryResponse describeCostBudgetsSummary(DescribeCostBudgetsSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCostBudgetsSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly allocated costs of instances by allocation month.</p>
     * 
     * @param request DescribeInstanceAmortizedCostByAmortizationPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponse describeInstanceAmortizedCostByAmortizationPeriodWithOptions(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumePeriodFilter)) {
            body.put("ConsumePeriodFilter", request.consumePeriodFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAmortizedCostByAmortizationPeriod"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAmortizedCostByAmortizationPeriodResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly allocated costs of instances by allocation month.</p>
     * 
     * @param request DescribeInstanceAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeInstanceAmortizedCostByAmortizationPeriodResponse describeInstanceAmortizedCostByAmortizationPeriod(DescribeInstanceAmortizedCostByAmortizationPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAmortizedCostByAmortizationPeriodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例摊销日摊销成本</p>
     * 
     * @param request DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse
     */
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse describeInstanceAmortizedCostByAmortizationPeriodDateWithOptions(DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amortizationDateEnd)) {
            body.put("AmortizationDateEnd", request.amortizationDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.amortizationDateStart)) {
            body.put("AmortizationDateStart", request.amortizationDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAmortizedCostByAmortizationPeriodDate"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例摊销日摊销成本</p>
     * 
     * @param request DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest
     * @return DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse
     */
    public DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse describeInstanceAmortizedCostByAmortizationPeriodDate(DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAmortizedCostByAmortizationPeriodDateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例账期月摊销成本</p>
     * 
     * @param request DescribeInstanceAmortizedCostByConsumePeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAmortizedCostByConsumePeriodResponse
     */
    public DescribeInstanceAmortizedCostByConsumePeriodResponse describeInstanceAmortizedCostByConsumePeriodWithOptions(DescribeInstanceAmortizedCostByConsumePeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amortizationPeriodFilter)) {
            body.put("AmortizationPeriodFilter", request.amortizationPeriodFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAmortizedCostByConsumePeriod"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAmortizedCostByConsumePeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例账期月摊销成本</p>
     * 
     * @param request DescribeInstanceAmortizedCostByConsumePeriodRequest
     * @return DescribeInstanceAmortizedCostByConsumePeriodResponse
     */
    public DescribeInstanceAmortizedCostByConsumePeriodResponse describeInstanceAmortizedCostByConsumePeriod(DescribeInstanceAmortizedCostByConsumePeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAmortizedCostByConsumePeriodWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Instance bills are generated after the total bill is split. In most cases, the instance bills do not include data generated on the last day of the specified billing cycle.</p>
     * <ul>
     * <li>The instance information may change during the billing cycle. The instance configurations and types in monthly bills are subject to the point in time when you query bills. For more information, see the corresponding bill details.</li>
     * <li>You can query data generated after June 2020 for Cloud Communications services. You can query data generated after November 2020 for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing information about instances or billable items in a billing cycle.</p>
     * 
     * @param request DescribeInstanceBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceBillResponse
     */
    public DescribeInstanceBillResponse describeInstanceBillWithOptions(DescribeInstanceBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingDate)) {
            query.put("BillingDate", request.billingDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceID)) {
            query.put("InstanceID", request.instanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBillingItem)) {
            query.put("IsBillingItem", request.isBillingItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHideZeroCharge)) {
            query.put("IsHideZeroCharge", request.isHideZeroCharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipCode)) {
            query.put("PipCode", request.pipCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Instance bills are generated after the total bill is split. In most cases, the instance bills do not include data generated on the last day of the specified billing cycle.</p>
     * <ul>
     * <li>The instance information may change during the billing cycle. The instance configurations and types in monthly bills are subject to the point in time when you query bills. For more information, see the corresponding bill details.</li>
     * <li>You can query data generated after June 2020 for Cloud Communications services. You can query data generated after November 2020 for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the billing information about instances or billable items in a billing cycle.</p>
     * 
     * @param request DescribeInstanceBillRequest
     * @return DescribeInstanceBillResponse
     */
    public DescribeInstanceBillResponse describeInstanceBill(DescribeInstanceBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实例摊销日抵扣还原摊销成本</p>
     * 
     * @param request DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse describeInstanceDeductAmortizedCostByAmortizationPeriodWithOptions(DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdList)) {
            body.put("InstanceIdList", request.instanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceDeductAmortizedCostByAmortizationPeriod"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实例摊销日抵扣还原摊销成本</p>
     * 
     * @param request DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeInstanceDeductAmortizedCostByAmortizationPeriodResponse describeInstanceDeductAmortizedCostByAmortizationPeriod(DescribeInstanceDeductAmortizedCostByAmortizationPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceDeductAmortizedCostByAmortizationPeriodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pricing information about an Alibaba Cloud service.</p>
     * 
     * @param request DescribePricingModuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePricingModuleResponse
     */
    public DescribePricingModuleResponse describePricingModuleWithOptions(DescribePricingModuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePricingModule"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePricingModuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pricing information about an Alibaba Cloud service.</p>
     * 
     * @param request DescribePricingModuleRequest
     * @return DescribePricingModuleResponse
     */
    public DescribePricingModuleResponse describePricingModule(DescribePricingModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePricingModuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the allocated costs of services by allocation month.</p>
     * 
     * @param request DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeProductAmortizedCostByAmortizationPeriodResponse describeProductAmortizedCostByAmortizationPeriodWithOptions(DescribeProductAmortizedCostByAmortizationPeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consumePeriodFilter)) {
            body.put("ConsumePeriodFilter", request.consumePeriodFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductAmortizedCostByAmortizationPeriod"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductAmortizedCostByAmortizationPeriodResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can view and export the allocated costs of the current month after 10:00 on the fourth day of the next month. The allocated costs of a single allocation month may involve orders or bills in different billing cycles. If a historical allocated amount is incorrect, the historical allocated costs need to be adjusted. As a result, the allocated costs displayed for a single allocation month may be different at different time points.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the allocated costs of services by allocation month.</p>
     * 
     * @param request DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeProductAmortizedCostByAmortizationPeriodResponse describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductAmortizedCostByAmortizationPeriodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>产品账期月摊销成本</p>
     * 
     * @param request DescribeProductAmortizedCostByConsumePeriodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeProductAmortizedCostByConsumePeriodResponse
     */
    public DescribeProductAmortizedCostByConsumePeriodResponse describeProductAmortizedCostByConsumePeriodWithOptions(DescribeProductAmortizedCostByConsumePeriodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amortizationPeriodFilter)) {
            body.put("AmortizationPeriodFilter", request.amortizationPeriodFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerIdList)) {
            body.put("BillOwnerIdList", request.billOwnerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billUserIdList)) {
            body.put("BillUserIdList", request.billUserIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            body.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.costUnitCode)) {
            body.put("CostUnitCode", request.costUnitCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productDetail)) {
            body.put("ProductDetail", request.productDetail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            body.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeProductAmortizedCostByConsumePeriod"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeProductAmortizedCostByConsumePeriodResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>产品账期月摊销成本</p>
     * 
     * @param request DescribeProductAmortizedCostByConsumePeriodRequest
     * @return DescribeProductAmortizedCostByConsumePeriodResponse
     */
    public DescribeProductAmortizedCostByConsumePeriodResponse describeProductAmortizedCostByConsumePeriod(DescribeProductAmortizedCostByConsumePeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductAmortizedCostByConsumePeriodWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>1\. The queried coverage details are the same as those displayed in the table on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * 2\. You can call this operation to query the coverage details of RIs or SCUs.
     * 3\. You can call this operation to query coverage details at an hourly, daily, or monthly granularity.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage details of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceCoverageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceCoverageDetailResponse
     */
    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetailWithOptions(DescribeResourceCoverageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceCoverageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceCoverageDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>1\. The queried coverage details are the same as those displayed in the table on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * 2\. You can call this operation to query the coverage details of RIs or SCUs.
     * 3\. You can call this operation to query coverage details at an hourly, daily, or monthly granularity.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage details of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceCoverageDetailRequest
     * @return DescribeResourceCoverageDetailResponse
     */
    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceCoverageDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The queried total coverage data is the same as the aggregated data displayed on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * You can call this operation to query the total coverage data of RIs or SCUs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total coverage data of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceCoverageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceCoverageTotalResponse
     */
    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotalWithOptions(DescribeResourceCoverageTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceCoverageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceCoverageTotalResponse());
    }

    /**
     * <b>description</b> :
     * <p>The queried total coverage data is the same as the aggregated data displayed on the Coverage tab of the Manage Reserved Instances page in the Billing Management console.
     * You can call this operation to query the total coverage data of RIs or SCUs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the total coverage data of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceCoverageTotalRequest
     * @return DescribeResourceCoverageTotalResponse
     */
    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceCoverageTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about resource plans of an Alibaba Cloud service.</p>
     * 
     * @param request DescribeResourcePackageProductRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourcePackageProductResponse
     */
    public DescribeResourcePackageProductResponse describeResourcePackageProductWithOptions(DescribeResourcePackageProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourcePackageProduct"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcePackageProductResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about resource plans of an Alibaba Cloud service.</p>
     * 
     * @param request DescribeResourcePackageProductRequest
     * @return DescribeResourcePackageProductResponse
     */
    public DescribeResourcePackageProductResponse describeResourcePackageProduct(DescribeResourcePackageProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcePackageProductWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage details of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceUsageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceUsageDetailResponse
     */
    public DescribeResourceUsageDetailResponse describeResourceUsageDetailWithOptions(DescribeResourceUsageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceUsageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceUsageDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage details of reserved instances (RIs) or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceUsageDetailRequest
     * @return DescribeResourceUsageDetailResponse
     */
    public DescribeResourceUsageDetailResponse describeResourceUsageDetail(DescribeResourceUsageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceUsageDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total usage data of reserved instances or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceUsageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceUsageTotalResponse
     */
    public DescribeResourceUsageTotalResponse describeResourceUsageTotalWithOptions(DescribeResourceUsageTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceUsageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceUsageTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total usage data of reserved instances or storage capacity units (SCUs).</p>
     * 
     * @param request DescribeResourceUsageTotalRequest
     * @return DescribeResourceUsageTotalResponse
     */
    public DescribeResourceUsageTotalResponse describeResourceUsageTotal(DescribeResourceUsageTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceUsageTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coverage details of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansCoverageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansCoverageDetailResponse
     */
    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetailWithOptions(DescribeSavingsPlansCoverageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansCoverageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansCoverageDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coverage details of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansCoverageDetailRequest
     * @return DescribeSavingsPlansCoverageDetailResponse
     */
    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSavingsPlansCoverageDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coverage summary of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansCoverageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotalWithOptions(DescribeSavingsPlansCoverageTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansCoverageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansCoverageTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the coverage summary of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansCoverageTotalRequest
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSavingsPlansCoverageTotalWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSavingsPlansUsageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansUsageDetailResponse
     */
    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetailWithOptions(DescribeSavingsPlansUsageDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansUsageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansUsageDetailResponse());
    }

    /**
     * @param request DescribeSavingsPlansUsageDetailRequest
     * @return DescribeSavingsPlansUsageDetailResponse
     */
    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSavingsPlansUsageDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage summary of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansUsageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansUsageTotalResponse
     */
    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotalWithOptions(DescribeSavingsPlansUsageTotalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodType)) {
            query.put("PeriodType", request.periodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startPeriod)) {
            query.put("StartPeriod", request.startPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansUsageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansUsageTotalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage summary of savings plans.</p>
     * 
     * @param request DescribeSavingsPlansUsageTotalRequest
     * @return DescribeSavingsPlansUsageTotalResponse
     */
    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSavingsPlansUsageTotalWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The data that you query by calling this operation is the same as the data that is queried by billing cycles in the Split Bill module of Cost Allocation.</p>
     * <ul>
     * <li>You can query split bills that were generated within the last 12 months by calling this operation.</li>
     * <li>You can query split bills only after you enable the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> service in the User Center console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills.</p>
     * 
     * @param request DescribeSplitItemBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSplitItemBillResponse
     */
    public DescribeSplitItemBillResponse describeSplitItemBillWithOptions(DescribeSplitItemBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingDate)) {
            query.put("BillingDate", request.billingDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceID)) {
            query.put("InstanceID", request.instanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHideZeroCharge)) {
            query.put("IsHideZeroCharge", request.isHideZeroCharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pipCode)) {
            query.put("PipCode", request.pipCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitItemID)) {
            query.put("SplitItemID", request.splitItemID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagFilter)) {
            query.put("TagFilter", request.tagFilter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSplitItemBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSplitItemBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The data that you query by calling this operation is the same as the data that is queried by billing cycles in the Split Bill module of Cost Allocation.</p>
     * <ul>
     * <li>You can query split bills that were generated within the last 12 months by calling this operation.</li>
     * <li>You can query split bills only after you enable the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> service in the User Center console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills.</p>
     * 
     * @param request DescribeSplitItemBillRequest
     * @return DescribeSplitItemBillResponse
     */
    public DescribeSplitItemBillResponse describeSplitItemBill(DescribeSplitItemBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSplitItemBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a financial relationship.</p>
     * 
     * @param request GetAccountRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountRelationResponse
     */
    public GetAccountRelationResponse getAccountRelationWithOptions(GetAccountRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a financial relationship.</p>
     * 
     * @param request GetAccountRelationRequest
     * @return GetAccountRelationResponse
     */
    public GetAccountRelationResponse getAccountRelation(GetAccountRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the account information about a customer of a virtual network operator (VNO).</p>
     * 
     * @param request GetCustomerAccountInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerAccountInfoResponse
     */
    public GetCustomerAccountInfoResponse getCustomerAccountInfoWithOptions(GetCustomerAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerAccountInfo"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the account information about a customer of a virtual network operator (VNO).</p>
     * 
     * @param request GetCustomerAccountInfoRequest
     * @return GetCustomerAccountInfoResponse
     */
    public GetCustomerAccountInfoResponse getCustomerAccountInfo(GetCustomerAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The system queries the IDs of customers of a VNO based on the AccessKey pair used in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs of customers of a virtual network operator (VNO).</p>
     * 
     * @param request GetCustomerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomerListResponse
     */
    public GetCustomerListResponse getCustomerListWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerListResponse());
    }

    /**
     * <b>description</b> :
     * <p>The system queries the IDs of customers of a VNO based on the AccessKey pair used in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IDs of customers of a virtual network operator (VNO).</p>
     * @return GetCustomerListResponse
     */
    public GetCustomerListResponse getCustomerList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an order that belongs to your Alibaba Cloud account or distributors.</p>
     * 
     * @param request GetOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderDetailResponse
     */
    public GetOrderDetailResponse getOrderDetailWithOptions(GetOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an order that belongs to your Alibaba Cloud account or distributors.</p>
     * 
     * @param request GetOrderDetailRequest
     * @return GetOrderDetailResponse
     */
    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetPayAsYouGoPrice operation to obtain the pay-as-you-go price of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the pay-as-you-go price of an Alibaba Cloud service.</p>
     * 
     * @param request GetPayAsYouGoPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPayAsYouGoPriceResponse
     */
    public GetPayAsYouGoPriceResponse getPayAsYouGoPriceWithOptions(GetPayAsYouGoPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.moduleList)) {
            query.put("ModuleList", request.moduleList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPayAsYouGoPrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPayAsYouGoPriceResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Usage notes</h3>
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetPayAsYouGoPrice operation to obtain the pay-as-you-go price of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the pay-as-you-go price of an Alibaba Cloud service.</p>
     * 
     * @param request GetPayAsYouGoPriceRequest
     * @return GetPayAsYouGoPriceResponse
     */
    public GetPayAsYouGoPriceResponse getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPayAsYouGoPriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price of a resource plan.</p>
     * 
     * @param request GetResourcePackagePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcePackagePriceResponse
     */
    public GetResourcePackagePriceResponse getResourcePackagePriceWithOptions(GetResourcePackagePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDate)) {
            query.put("EffectiveDate", request.effectiveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            query.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePackagePrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePackagePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price of a resource plan.</p>
     * 
     * @param request GetResourcePackagePriceRequest
     * @return GetResourcePackagePriceResponse
     */
    public GetResourcePackagePriceResponse getResourcePackagePrice(GetResourcePackagePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePackagePriceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetSubscriptionPrice operation to obtain the pricing of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the subscription price of an Alibaba Cloud service.</p>
     * 
     * @param request GetSubscriptionPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubscriptionPriceResponse
     */
    public GetSubscriptionPriceResponse getSubscriptionPriceWithOptions(GetSubscriptionPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleList)) {
            query.put("ModuleList", request.moduleList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePeriodQuantity)) {
            query.put("ServicePeriodQuantity", request.servicePeriodQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePeriodUnit)) {
            query.put("ServicePeriodUnit", request.servicePeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionPrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionPriceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Call the QueryProductList operation to obtain the code of the service. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">QueryProductList</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the service. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">DescribePricingModule</a>.</li>
     * <li>Call the GetSubscriptionPrice operation to obtain the pricing of the service based on the returned configuration parameters.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the subscription price of an Alibaba Cloud service.</p>
     * 
     * @param request GetSubscriptionPriceRequest
     * @return GetSubscriptionPriceResponse
     */
    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionPriceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li><strong>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</strong></li>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the refundable amount for an instance from which you want to unsubscribe.</p>
     * 
     * @param request InquiryPriceRefundInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InquiryPriceRefundInstanceResponse
     */
    public InquiryPriceRefundInstanceResponse inquiryPriceRefundInstanceWithOptions(InquiryPriceRefundInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InquiryPriceRefundInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InquiryPriceRefundInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li><strong>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</strong></li>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the refundable amount for an instance from which you want to unsubscribe.</p>
     * 
     * @param request InquiryPriceRefundInstanceRequest
     * @return InquiryPriceRefundInstanceResponse
     */
    public InquiryPriceRefundInstanceResponse inquiryPriceRefundInstance(InquiryPriceRefundInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inquiryPriceRefundInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or removes permissions granted to a member in a financial relationship.</p>
     * 
     * @param request ModifyAccountRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountRelationResponse
     */
    public ModifyAccountRelationResponse modifyAccountRelationWithOptions(ModifyAccountRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childNick)) {
            query.put("ChildNick", request.childNick);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.childUserId)) {
            query.put("ChildUserId", request.childUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserId)) {
            query.put("ParentUserId", request.parentUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionCodes)) {
            query.put("PermissionCodes", request.permissionCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationId)) {
            query.put("RelationId", request.relationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationOperation)) {
            query.put("RelationOperation", request.relationOperation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleCodes)) {
            query.put("RoleCodes", request.roleCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds or removes permissions granted to a member in a financial relationship.</p>
     * 
     * @param request ModifyAccountRelationRequest
     * @return ModifyAccountRelationResponse
     */
    public ModifyAccountRelationResponse modifyAccountRelation(ModifyAccountRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies one or more cost centers.</p>
     * 
     * @param request ModifyCostUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCostUnitResponse
     */
    public ModifyCostUnitResponse modifyCostUnitWithOptions(ModifyCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.unitEntityList)) {
            query.put("UnitEntityList", request.unitEntityList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCostUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies one or more cost centers.</p>
     * 
     * @param request ModifyCostUnitRequest
     * @return ModifyCostUnitResponse
     */
    public ModifyCostUnitResponse modifyCostUnit(ModifyCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of an instance. When you call this operation, the system generates a modification order and automatically completes the payment. You cannot call this operation to modify the configurations of an Elastic Compute Service (ECS) instance or ApsaraDB RDS instance. To modify the configurations of an ECS or ApsaraDB RDS instance, call the dedicated operation of the corresponding service.</p>
     * 
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyType)) {
            query.put("ModifyType", request.modifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            query.put("Parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of an instance. When you call this operation, the system generates a modification order and automatically completes the payment. You cannot call this operation to modify the configurations of an Elastic Compute Service (ECS) instance or ApsaraDB RDS instance. To modify the configurations of an ECS or ApsaraDB RDS instance, call the dedicated operation of the corresponding service.</p>
     * 
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the balance of your account.</p>
     * 
     * @param request QueryAccountBalanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountBalanceResponse
     */
    public QueryAccountBalanceResponse queryAccountBalanceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountBalance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountBalanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the balance of your account.</p>
     * @return QueryAccountBalanceResponse
     */
    public QueryAccountBalanceResponse queryAccountBalance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBalanceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Account bills are summarized based on instance bills. In most cases, the account bills do not include the data generated on the last day of the specified period.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services. However, the query results do not include the data of Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bills of your Alibaba Cloud account within a billing cycle. You can summarize the bills by resource owner.</p>
     * 
     * @param request QueryAccountBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountBillResponse
     */
    public QueryAccountBillResponse queryAccountBillWithOptions(QueryAccountBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingDate)) {
            query.put("BillingDate", request.billingDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isGroupByProduct)) {
            query.put("IsGroupByProduct", request.isGroupByProduct);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerID)) {
            query.put("OwnerID", request.ownerID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>Account bills are summarized based on instance bills. In most cases, the account bills do not include the data generated on the last day of the specified period.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services. However, the query results do not include the data of Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bills of your Alibaba Cloud account within a billing cycle. You can summarize the bills by resource owner.</p>
     * 
     * @param request QueryAccountBillRequest
     * @return QueryAccountBillResponse
     */
    public QueryAccountBillResponse queryAccountBill(QueryAccountBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of transactions within your account.</p>
     * 
     * @param request QueryAccountTransactionDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountTransactionDetailsResponse
     */
    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetailsWithOptions(QueryAccountTransactionDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordID)) {
            query.put("RecordID", request.recordID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionChannel)) {
            query.put("TransactionChannel", request.transactionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionChannelSN)) {
            query.put("TransactionChannelSN", request.transactionChannelSN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionNumber)) {
            query.put("TransactionNumber", request.transactionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionType)) {
            query.put("TransactionType", request.transactionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountTransactionDetails"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountTransactionDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of transactions within your account.</p>
     * 
     * @param request QueryAccountTransactionDetailsRequest
     * @return QueryAccountTransactionDetailsResponse
     */
    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTransactionDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries transactions within your Alibaba Cloud account.</p>
     * 
     * @param request QueryAccountTransactionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAccountTransactionsResponse
     */
    public QueryAccountTransactionsResponse queryAccountTransactionsWithOptions(QueryAccountTransactionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordID)) {
            query.put("RecordID", request.recordID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionChannel)) {
            query.put("TransactionChannel", request.transactionChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionChannelSN)) {
            query.put("TransactionChannelSN", request.transactionChannelSN);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionFlow)) {
            query.put("TransactionFlow", request.transactionFlow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionNumber)) {
            query.put("TransactionNumber", request.transactionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionType)) {
            query.put("TransactionType", request.transactionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountTransactions"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountTransactionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries transactions within your Alibaba Cloud account.</p>
     * 
     * @param request QueryAccountTransactionsRequest
     * @return QueryAccountTransactionsResponse
     */
    public QueryAccountTransactionsResponse queryAccountTransactions(QueryAccountTransactionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTransactionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available instances.</p>
     * 
     * @param request QueryAvailableInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryAvailableInstancesResponse
     */
    public QueryAvailableInstancesResponse queryAvailableInstancesWithOptions(QueryAvailableInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeEnd)) {
            query.put("EndTimeEnd", request.endTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTimeStart)) {
            query.put("EndTimeStart", request.endTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIDs)) {
            query.put("InstanceIDs", request.instanceIDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewStatus)) {
            query.put("RenewStatus", request.renewStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvailableInstances"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailableInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available instances.</p>
     * 
     * @param request QueryAvailableInstancesRequest
     * @return QueryAvailableInstancesResponse
     */
    public QueryAvailableInstancesResponse queryAvailableInstances(QueryAvailableInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bills in a billing cycle.</p>
     * 
     * @param request QueryBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBillResponse
     */
    public QueryBillResponse queryBillWithOptions(QueryBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDisplayLocalCurrency)) {
            query.put("IsDisplayLocalCurrency", request.isDisplayLocalCurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHideZeroCharge)) {
            query.put("IsHideZeroCharge", request.isHideZeroCharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bills in a billing cycle.</p>
     * 
     * @param request QueryBillRequest
     * @return QueryBillResponse
     */
    public QueryBillResponse queryBill(QueryBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bill overview information in a billing cycle.</p>
     * 
     * @param request QueryBillOverviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBillOverviewResponse
     */
    public QueryBillOverviewResponse queryBillOverviewWithOptions(QueryBillOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBillOverview"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillOverviewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bill overview information in a billing cycle.</p>
     * 
     * @param request QueryBillOverviewRequest
     * @return QueryBillOverviewResponse
     */
    public QueryBillOverviewResponse queryBillOverview(QueryBillOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillOverviewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscribed bills that are stored in Object Storage Service (OSS) bucket.</p>
     * 
     * @param request QueryBillToOSSSubscriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBillToOSSSubscriptionResponse
     */
    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBillToOSSSubscription"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillToOSSSubscriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the subscribed bills that are stored in Object Storage Service (OSS) bucket.</p>
     * @return QueryBillToOSSSubscriptionResponse
     */
    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillToOSSSubscriptionWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about vouchers.</p>
     * 
     * @param request QueryCashCouponsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCashCouponsResponse
     */
    public QueryCashCouponsResponse queryCashCouponsWithOptions(QueryCashCouponsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveOrNot)) {
            query.put("EffectiveOrNot", request.effectiveOrNot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeEnd)) {
            query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeStart)) {
            query.put("ExpiryTimeStart", request.expiryTimeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCashCoupons"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCashCouponsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about vouchers.</p>
     * 
     * @param request QueryCashCouponsRequest
     * @return QueryCashCouponsResponse
     */
    public QueryCashCouponsResponse queryCashCoupons(QueryCashCouponsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCashCouponsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a service based on the service code.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a service based on the service code.</p>
     * 
     * @param request QueryCommodityListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCommodityListResponse
     */
    public QueryCommodityListResponse queryCommodityListWithOptions(QueryCommodityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCommodityList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCommodityListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the information about a service based on the service code.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a service based on the service code.</p>
     * 
     * @param request QueryCommodityListRequest
     * @return QueryCommodityListResponse
     */
    public QueryCommodityListResponse queryCommodityList(QueryCommodityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCommodityListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all cost centers within the current node of the cost center tree. If the ParentUnitId parameter is set to -1, all cost centers are queried.</p>
     * 
     * @param request QueryCostUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostUnitResponse
     */
    public QueryCostUnitResponse queryCostUnitWithOptions(QueryCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("OwnerUid", request.ownerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUnitId)) {
            query.put("ParentUnitId", request.parentUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all cost centers within the current node of the cost center tree. If the ParentUnitId parameter is set to -1, all cost centers are queried.</p>
     * 
     * @param request QueryCostUnitRequest
     * @return QueryCostUnitResponse
     */
    public QueryCostUnitResponse queryCostUnit(QueryCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource instances that are allocated to a cost center. If the unitId parameter is set to 0, the unallocated primary resource instances and sub-resource instances are queried.</p>
     * 
     * @param request QueryCostUnitResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostUnitResourceResponse
     */
    public QueryCostUnitResourceResponse queryCostUnitResourceWithOptions(QueryCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerUid)) {
            query.put("OwnerUid", request.ownerUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unitId)) {
            query.put("UnitId", request.unitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostUnitResource"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostUnitResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource instances that are allocated to a cost center. If the unitId parameter is set to 0, the unallocated primary resource instances and sub-resource instances are queried.</p>
     * 
     * @param request QueryCostUnitResourceRequest
     * @return QueryCostUnitResourceResponse
     */
    public QueryCostUnitResourceResponse queryCostUnitResource(QueryCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the addresses to which invoices are mailed.</p>
     * 
     * @param request QueryCustomerAddressListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCustomerAddressListResponse
     */
    public QueryCustomerAddressListResponse queryCustomerAddressListWithOptions(QueryCustomerAddressListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomerAddressList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerAddressListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the addresses to which invoices are mailed.</p>
     * 
     * @param request QueryCustomerAddressListRequest
     * @return QueryCustomerAddressListResponse
     */
    public QueryCustomerAddressListResponse queryCustomerAddressList(QueryCustomerAddressListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerAddressListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Limits:</p>
     * <ul>
     * <li>Only the usage records within the past year can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of resource plans, including reserved instances (RIs) and storage capacity units (SCUs).</p>
     * 
     * @param request QueryDPUtilizationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDPUtilizationDetailResponse
     */
    public QueryDPUtilizationDetailResponse queryDPUtilizationDetailWithOptions(QueryDPUtilizationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deductedInstanceId)) {
            query.put("DeductedInstanceId", request.deductedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeShare)) {
            query.put("IncludeShare", request.includeShare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastToken)) {
            query.put("LastToken", request.lastToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limit)) {
            query.put("Limit", request.limit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodCode)) {
            query.put("ProdCode", request.prodCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDPUtilizationDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDPUtilizationDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Limits:</p>
     * <ul>
     * <li>Only the usage records within the past year can be queried.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage of resource plans, including reserved instances (RIs) and storage capacity units (SCUs).</p>
     * 
     * @param request QueryDPUtilizationDetailRequest
     * @return QueryDPUtilizationDetailResponse
     */
    public QueryDPUtilizationDetailResponse queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDPUtilizationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the orders for which you want to apply for invoices.</p>
     * 
     * @param request QueryEvaluateListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEvaluateListResponse
     */
    public QueryEvaluateListResponse queryEvaluateListWithOptions(QueryEvaluateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billCycle)) {
            query.put("BillCycle", request.billCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeList)) {
            query.put("BizTypeList", request.bizTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endAmount)) {
            query.put("EndAmount", request.endAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endBizTime)) {
            query.put("EndBizTime", request.endBizTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endSearchTime)) {
            query.put("EndSearchTime", request.endSearchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizId)) {
            query.put("OutBizId", request.outBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAmount)) {
            query.put("StartAmount", request.startAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startBizTime)) {
            query.put("StartBizTime", request.startBizTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startSearchTime)) {
            query.put("StartSearchTime", request.startSearchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEvaluateList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEvaluateListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the orders for which you want to apply for invoices.</p>
     * 
     * @param request QueryEvaluateListRequest
     * @return QueryEvaluateListResponse
     */
    public QueryEvaluateListResponse queryEvaluateList(QueryEvaluateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEvaluateListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a financial account.</p>
     * 
     * @param request QueryFinancialAccountInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryFinancialAccountInfoResponse
     */
    public QueryFinancialAccountInfoResponse queryFinancialAccountInfoWithOptions(QueryFinancialAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFinancialAccountInfo"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFinancialAccountInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a financial account.</p>
     * 
     * @param request QueryFinancialAccountInfoRequest
     * @return QueryFinancialAccountInfoResponse
     */
    public QueryFinancialAccountInfoResponse queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryFinancialAccountInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <ul>
     * <li>This API operation has been upgraded to DescribeInstanceBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a> operation to query the bills of instances or billable items in a billing cycle. You can call the QueryInstanceBill operation to query a maximum of 50,000 data rows in a bill.</li>
     * <li>Instance bills are generated after bills are split. In most cases, the instance bills do not include data generated on the last day of the specified period.</li>
     * <li>The instance information changes within a billing cycle. The instance configurations and specifications and the time when the instance was used in the billing cycle are all recorded. For more information, see the corresponding bill details.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services, and the data generated in November 2020 or later for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bills of instances or billable items in a billing cycle.</p>
     * 
     * @param request QueryInstanceBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceBillResponse
     */
    public QueryInstanceBillResponse queryInstanceBillWithOptions(QueryInstanceBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingDate)) {
            query.put("BillingDate", request.billingDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.granularity)) {
            query.put("Granularity", request.granularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isBillingItem)) {
            query.put("IsBillingItem", request.isBillingItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHideZeroCharge)) {
            query.put("IsHideZeroCharge", request.isHideZeroCharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceBillResponse());
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <ul>
     * <li>This API operation has been upgraded to DescribeInstanceBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a> operation to query the bills of instances or billable items in a billing cycle. You can call the QueryInstanceBill operation to query a maximum of 50,000 data rows in a bill.</li>
     * <li>Instance bills are generated after bills are split. In most cases, the instance bills do not include data generated on the last day of the specified period.</li>
     * <li>The instance information changes within a billing cycle. The instance configurations and specifications and the time when the instance was used in the billing cycle are all recorded. For more information, see the corresponding bill details.</li>
     * <li>You can query the data generated in June 2020 or later for Cloud Communications services, and the data generated in November 2020 or later for Alibaba Cloud Domains.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the bills of instances or billable items in a billing cycle.</p>
     * 
     * @param request QueryInstanceBillRequest
     * @return QueryInstanceBillResponse
     */
    public QueryInstanceBillResponse queryInstanceBill(QueryInstanceBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances by tag.</p>
     * 
     * @param request QueryInstanceByTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceByTagResponse
     */
    public QueryInstanceByTagResponse queryInstanceByTagWithOptions(QueryInstanceByTagRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceByTag"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceByTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instances by tag.</p>
     * 
     * @param request QueryInstanceByTagRequest
     * @return QueryInstanceByTagResponse
     */
    public QueryInstanceByTagResponse queryInstanceByTag(QueryInstanceByTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceByTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The code of the service.</p>
     * 
     * @param request QueryInstanceGaapCostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceGaapCostResponse
     */
    public QueryInstanceGaapCostResponse queryInstanceGaapCostWithOptions(QueryInstanceGaapCostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceGaapCost"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceGaapCostResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The code of the service.</p>
     * 
     * @param request QueryInstanceGaapCostRequest
     * @return QueryInstanceGaapCostResponse
     */
    public QueryInstanceGaapCostResponse queryInstanceGaapCost(QueryInstanceGaapCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceGaapCostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about invoice titles.</p>
     * 
     * @param request QueryInvoicingCustomerListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInvoicingCustomerListResponse
     */
    public QueryInvoicingCustomerListResponse queryInvoicingCustomerListWithOptions(QueryInvoicingCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInvoicingCustomerList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInvoicingCustomerListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about invoice titles.</p>
     * 
     * @param request QueryInvoicingCustomerListRequest
     * @return QueryInvoicingCustomerListResponse
     */
    public QueryInvoicingCustomerListResponse queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInvoicingCustomerListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the orders of your Alibaba Cloud account or distributors. By default, orders within the last hour are queried. To query earlier orders, specify the CreateTimeStart and CreateTimeEnd parameters.</p>
     * 
     * @param request QueryOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrdersResponse
     */
    public QueryOrdersResponse queryOrdersWithOptions(QueryOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentStatus)) {
            query.put("PaymentStatus", request.paymentStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrders"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the orders of your Alibaba Cloud account or distributors. By default, orders within the last hour are queried. To query earlier orders, specify the CreateTimeStart and CreateTimeEnd parameters.</p>
     * 
     * @param request QueryOrdersRequest
     * @return QueryOrdersResponse
     */
    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries, by relationship ID, permissions granted to accounts between which a management-member relationship is established.</p>
     * 
     * @param request QueryPermissionListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPermissionListResponse
     */
    public QueryPermissionListResponse queryPermissionListWithOptions(QueryPermissionListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.relationId)) {
            query.put("RelationId", request.relationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPermissionList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPermissionListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries, by relationship ID, permissions granted to accounts between which a management-member relationship is established.</p>
     * 
     * @param request QueryPermissionListRequest
     * @return QueryPermissionListResponse
     */
    public QueryPermissionListResponse queryPermissionList(QueryPermissionListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPermissionListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries prepaid cards.</p>
     * 
     * @param request QueryPrepaidCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPrepaidCardsResponse
     */
    public QueryPrepaidCardsResponse queryPrepaidCardsWithOptions(QueryPrepaidCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveOrNot)) {
            query.put("EffectiveOrNot", request.effectiveOrNot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeEnd)) {
            query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeStart)) {
            query.put("ExpiryTimeStart", request.expiryTimeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPrepaidCards"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPrepaidCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries prepaid cards.</p>
     * 
     * @param request QueryPrepaidCardsRequest
     * @return QueryPrepaidCardsResponse
     */
    public QueryPrepaidCardsResponse queryPrepaidCards(QueryPrepaidCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPrepaidCardsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the billable items of a service. A billable item is the minimum unit used to calculate costs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the billable items of a service.</p>
     * 
     * @param request QueryPriceEntityListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryPriceEntityListResponse
     */
    public QueryPriceEntityListResponse queryPriceEntityListWithOptions(QueryPriceEntityListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPriceEntityList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPriceEntityListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the billable items of a service. A billable item is the minimum unit used to calculate costs.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the billable items of a service.</p>
     * 
     * @param request QueryPriceEntityListRequest
     * @return QueryPriceEntityListResponse
     */
    public QueryPriceEntityListResponse queryPriceEntityList(QueryPriceEntityListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPriceEntityListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all Alibaba Cloud services.</p>
     * 
     * @param request QueryProductListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryProductListResponse
     */
    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTotalCount)) {
            query.put("QueryTotalCount", request.queryTotalCount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all Alibaba Cloud services.</p>
     * 
     * @param request QueryProductListRequest
     * @return QueryProductListResponse
     */
    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage details of a reserved instance (RI).</p>
     * 
     * @param request QueryRIUtilizationDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRIUtilizationDetailResponse
     */
    public QueryRIUtilizationDetailResponse queryRIUtilizationDetailWithOptions(QueryRIUtilizationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deductedInstanceId)) {
            query.put("DeductedInstanceId", request.deductedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RICommodityCode)) {
            query.put("RICommodityCode", request.RICommodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.RIInstanceId)) {
            query.put("RIInstanceId", request.RIInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRIUtilizationDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRIUtilizationDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage details of a reserved instance (RI).</p>
     * 
     * @param request QueryRIUtilizationDetailRequest
     * @return QueryRIUtilizationDetailResponse
     */
    public QueryRIUtilizationDetailResponse queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRIUtilizationDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a redemption coupon.</p>
     * 
     * @param request QueryRedeemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRedeemResponse
     */
    public QueryRedeemResponse queryRedeemWithOptions(QueryRedeemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRedeem"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRedeemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a redemption coupon.</p>
     * 
     * @param request QueryRedeemRequest
     * @return QueryRedeemResponse
     */
    public QueryRedeemResponse queryRedeem(QueryRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRedeemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the members of a management account.</p>
     * 
     * @param request QueryRelationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryRelationListResponse
     */
    public QueryRelationListResponse queryRelationListWithOptions(QueryRelationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRelationList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRelationListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the members of a management account.</p>
     * 
     * @param request QueryRelationListRequest
     * @return QueryRelationListResponse
     */
    public QueryRelationListResponse queryRelationList(QueryRelationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRelationListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     * 
     * @param request QueryResellerAvailableQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResellerAvailableQuotaResponse
     */
    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuotaWithOptions(QueryResellerAvailableQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemCodes)) {
            query.put("ItemCodes", request.itemCodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResellerAvailableQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResellerAvailableQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Indicates whether the call is successful. A value of true indicates that the call is successful. A value of false indicates that the call failed.</p>
     * 
     * @param request QueryResellerAvailableQuotaRequest
     * @return QueryResellerAvailableQuotaResponse
     */
    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResellerAvailableQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的信控预警阀值,该接口暂未测试启用</p>
     * 
     * @param request QueryResellerUserAlarmThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResellerUserAlarmThresholdResponse
     */
    public QueryResellerUserAlarmThresholdResponse queryResellerUserAlarmThresholdWithOptions(QueryResellerUserAlarmThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmType)) {
            query.put("AlarmType", request.alarmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResellerUserAlarmThreshold"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResellerUserAlarmThresholdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户的信控预警阀值,该接口暂未测试启用</p>
     * 
     * @param request QueryResellerUserAlarmThresholdRequest
     * @return QueryResellerUserAlarmThresholdResponse
     */
    public QueryResellerUserAlarmThresholdResponse queryResellerUserAlarmThreshold(QueryResellerUserAlarmThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instances of a resource plan. You can query the resource plans that are expired within one year.</p>
     * 
     * @param request QueryResourcePackageInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryResourcePackageInstancesResponse
     */
    public QueryResourcePackageInstancesResponse queryResourcePackageInstancesWithOptions(QueryResourcePackageInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeEnd)) {
            query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiryTimeStart)) {
            query.put("ExpiryTimeStart", request.expiryTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includePartner)) {
            query.put("IncludePartner", request.includePartner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResourcePackageInstances"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResourcePackageInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instances of a resource plan. You can query the resource plans that are expired within one year.</p>
     * 
     * @param request QueryResourcePackageInstancesRequest
     * @return QueryResourcePackageInstancesResponse
     */
    public QueryResourcePackageInstancesResponse queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResourcePackageInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deduction details of savings plans.</p>
     * 
     * @param request QuerySavingsPlansDeductLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySavingsPlansDeductLogResponse
     */
    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLogWithOptions(QuerySavingsPlansDeductLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingsPlansDeductLog"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingsPlansDeductLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deduction details of savings plans.</p>
     * 
     * @param request QuerySavingsPlansDeductLogRequest
     * @return QuerySavingsPlansDeductLogResponse
     */
    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySavingsPlansDeductLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries discounts on savings plans.</p>
     * 
     * @param request QuerySavingsPlansDiscountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySavingsPlansDiscountResponse
     */
    public QuerySavingsPlansDiscountResponse querySavingsPlansDiscountWithOptions(QuerySavingsPlansDiscountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingsPlansDiscount"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingsPlansDiscountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries discounts on savings plans.</p>
     * 
     * @param request QuerySavingsPlansDiscountRequest
     * @return QuerySavingsPlansDiscountResponse
     */
    public QuerySavingsPlansDiscountResponse querySavingsPlansDiscount(QuerySavingsPlansDiscountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySavingsPlansDiscountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about savings plan instances of the current user.</p>
     * 
     * @param request QuerySavingsPlansInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySavingsPlansInstanceResponse
     */
    public QuerySavingsPlansInstanceResponse querySavingsPlansInstanceWithOptions(QuerySavingsPlansInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            query.put("Locale", request.locale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingsPlansInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingsPlansInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about savings plan instances of the current user.</p>
     * 
     * @param request QuerySavingsPlansInstanceRequest
     * @return QuerySavingsPlansInstanceResponse
     */
    public QuerySavingsPlansInstanceResponse querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySavingsPlansInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>The code of the service.</p>
     * 
     * @param request QuerySettleBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySettleBillResponse
     */
    public QuerySettleBillResponse querySettleBillWithOptions(QuerySettleBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDisplayLocalCurrency)) {
            query.put("IsDisplayLocalCurrency", request.isDisplayLocalCurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isHideZeroCharge)) {
            query.put("IsHideZeroCharge", request.isHideZeroCharge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recordID)) {
            query.put("RecordID", request.recordID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySettleBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySettleBillResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>The code of the service.</p>
     * 
     * @param request QuerySettleBillRequest
     * @return QuerySettleBillResponse
     */
    public QuerySettleBillResponse querySettleBill(QuerySettleBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySettleBillWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the stock keeping units (SKUs) of a service. In most cases, a service has one or more SKUs. A service may even have tens of thousands of SKUs. You can call this operation to query the SKUs of a specific service and the prices of the SKUs. You can configure request parameters to query the specified SKUs based on the configurations of the SKUs.</p>
     * 
     * @param tmpReq QuerySkuPriceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySkuPriceListResponse
     */
    public QuerySkuPriceListResponse querySkuPriceListWithOptions(QuerySkuPriceListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QuerySkuPriceListShrinkRequest request = new QuerySkuPriceListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.priceFactorConditionMap)) {
            request.priceFactorConditionMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.priceFactorConditionMap, "PriceFactorConditionMap", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySkuPriceList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySkuPriceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the stock keeping units (SKUs) of a service. In most cases, a service has one or more SKUs. A service may even have tens of thousands of SKUs. You can call this operation to query the SKUs of a specific service and the prices of the SKUs. You can configure request parameters to query the specified SKUs based on the configurations of the SKUs.</p>
     * 
     * @param request QuerySkuPriceListRequest
     * @return QuerySkuPriceListResponse
     */
    public QuerySkuPriceListResponse querySkuPriceList(QuerySkuPriceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySkuPriceListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  This API operation has been upgraded to DescribeSplitItemBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation to query split bills. You can call the QuerySplitItemBill operation to query a maximum of 50,000 data rows in a bill.</p>
     * <ul>
     * <li>The data queried by calling the QuerySplitItemBill operation is consistent with the data that is displayed for the specified billing cycle on the Split Bill page in User Center.</li>
     * <li>You can call this operation to query split bills generated within the last 12 months.</li>
     * <li>This operation returns split bills only after you activate the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> service in User Center.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills.</p>
     * 
     * @param request QuerySplitItemBillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySplitItemBillResponse
     */
    public QuerySplitItemBillResponse querySplitItemBillWithOptions(QuerySplitItemBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySplitItemBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySplitItemBillResponse());
    }

    /**
     * <b>description</b> :
     * <p>  This API operation has been upgraded to DescribeSplitItemBill. We recommend that you call the <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation to query split bills. You can call the QuerySplitItemBill operation to query a maximum of 50,000 data rows in a bill.</p>
     * <ul>
     * <li>The data queried by calling the QuerySplitItemBill operation is consistent with the data that is displayed for the specified billing cycle on the Split Bill page in User Center.</li>
     * <li>You can call this operation to query split bills generated within the last 12 months.</li>
     * <li>This operation returns split bills only after you activate the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> service in User Center.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills.</p>
     * 
     * @param request QuerySplitItemBillRequest
     * @return QuerySplitItemBillResponse
     */
    public QuerySplitItemBillResponse querySplitItemBill(QuerySplitItemBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySplitItemBillWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the usage data of an Alibaba Cloud service. Take note of the following items:</p>
     * <ul>
     * <li>The service code that you specify for querying the usage data of a specific Alibaba Cloud service must be valid. You can query the usage data by hour or by day.</li>
     * <li>The time that you specify must follow the ISO8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.<ul>
     * <li>Latency exists in data pushes. Therefore, if you set the DataType parameter to Hour, the integrity of usage data recorded in the last 24 hours can be ensured. If you set the DataType parameter to Day, the integrity of usage data recorded in the last two days can be ensured.</li>
     * <li>You can query the usage data that is recorded in the last quarter.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of an Alibaba Cloud service.</p>
     * 
     * @param request QueryUserOmsDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryUserOmsDataResponse
     */
    public QueryUserOmsDataResponse queryUserOmsDataWithOptions(QueryUserOmsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.table)) {
            query.put("Table", request.table);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserOmsData"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserOmsDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the usage data of an Alibaba Cloud service. Take note of the following items:</p>
     * <ul>
     * <li>The service code that you specify for querying the usage data of a specific Alibaba Cloud service must be valid. You can query the usage data by hour or by day.</li>
     * <li>The time that you specify must follow the ISO8601 standard in the yyyy-MM-ddTHH:mm:ssZ format.<ul>
     * <li>Latency exists in data pushes. Therefore, if you set the DataType parameter to Hour, the integrity of usage data recorded in the last 24 hours can be ensured. If you set the DataType parameter to Day, the integrity of usage data recorded in the last two days can be ensured.</li>
     * <li>You can query the usage data that is recorded in the last quarter.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage data of an Alibaba Cloud service.</p>
     * 
     * @param request QueryUserOmsDataRequest
     * @return QueryUserOmsDataResponse
     */
    public QueryUserOmsDataResponse queryUserOmsData(QueryUserOmsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserOmsDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribes from an instance that is no longer needed.</p>
     * 
     * @param request RefundInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundInstanceResponse
     */
    public RefundInstanceResponse refundInstanceWithOptions(RefundInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediatelyRelease)) {
            query.put("ImmediatelyRelease", request.immediatelyRelease);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Refunds are applicable only for the actual paid amount. Vouchers used for the purchase are non-refundable.</li>
     * <li>Check the information about unsubscription and confirm the unsubscription terms and refundable amount. The resource that is unsubscribed cannot be restored.</li>
     * <li>For more information, see <a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Rules for unsubscribing from resources</a>.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribes from an instance that is no longer needed.</p>
     * 
     * @param request RefundInstanceRequest
     * @return RefundInstanceResponse
     */
    public RefundInstanceResponse refundInstance(RefundInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is provided for only VNOs to release instances. If a non-specific VNO calls this operation, the request is blocked.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases instances by Virtual Network Operators (VNOs).</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewStatus)) {
            query.put("RenewStatus", request.renewStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is provided for only VNOs to release instances. If a non-specific VNO calls this operation, the request is blocked.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases instances by Virtual Network Operators (VNOs).</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a financial relationship between the management account and a member.</p>
     * 
     * @param request RelieveAccountRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RelieveAccountRelationResponse
     */
    public RelieveAccountRelationResponse relieveAccountRelationWithOptions(RelieveAccountRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.childUserId)) {
            query.put("ChildUserId", request.childUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentUserId)) {
            query.put("ParentUserId", request.parentUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationId)) {
            query.put("RelationId", request.relationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestId)) {
            query.put("RequestId", request.requestId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RelieveAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RelieveAccountRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates a financial relationship between the management account and a member.</p>
     * 
     * @param request RelieveAccountRelationRequest
     * @return RelieveAccountRelationResponse
     */
    public RelieveAccountRelationResponse relieveAccountRelation(RelieveAccountRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.relieveAccountRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>续费变配接口</p>
     * 
     * @param request RenewChangeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewChangeInstanceResponse
     */
    public RenewChangeInstanceResponse renewChangeInstanceWithOptions(RenewChangeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameter)) {
            query.put("Parameter", request.parameter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewPeriod)) {
            query.put("RenewPeriod", request.renewPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewChangeInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewChangeInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>续费变配接口</p>
     * 
     * @param request RenewChangeInstanceRequest
     * @return RenewChangeInstanceResponse
     */
    public RenewChangeInstanceResponse renewChangeInstance(RenewChangeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewChangeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a specified instance. You cannot call this operation to renew Elastic Compute Service (ECS) instances, ApsaraDB RDS instances, or ApsaraDB for Redis instances. To renew these types of instances, call the dedicated operation of the corresponding service.</p>
     * 
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewPeriod)) {
            query.put("RenewPeriod", request.renewPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a specified instance. You cannot call this operation to renew Elastic Compute Service (ECS) instances, ApsaraDB RDS instances, or ApsaraDB for Redis instances. To renew these types of instances, call the dedicated operation of the corresponding service.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a resource plan.</p>
     * 
     * @param request RenewResourcePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewResourcePackageResponse
     */
    public RenewResourcePackageResponse renewResourcePackageWithOptions(RenewResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDate)) {
            query.put("EffectiveDate", request.effectiveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewResourcePackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a resource plan.</p>
     * 
     * @param request RenewResourcePackageRequest
     * @return RenewResourcePackageResponse
     */
    public RenewResourcePackageResponse renewResourcePackage(RenewResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewResourcePackageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets an expiration date for all Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request SetAllExpirationDayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAllExpirationDayResponse
     */
    public SetAllExpirationDayResponse setAllExpirationDayWithOptions(SetAllExpirationDayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unifyExpireDay)) {
            query.put("UnifyExpireDay", request.unifyExpireDay);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAllExpirationDay"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAllExpirationDayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets an expiration date for all Elastic Compute Service (ECS) instances.</p>
     * 
     * @param request SetAllExpirationDayRequest
     * @return SetAllExpirationDayResponse
     */
    public SetAllExpirationDayResponse setAllExpirationDay(SetAllExpirationDayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAllExpirationDayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables auto-renewal for an instance.</p>
     * 
     * @param request SetRenewalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetRenewalResponse
     */
    public SetRenewalResponse setRenewalWithOptions(SetRenewalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIDs)) {
            query.put("InstanceIDs", request.instanceIDs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalPeriod)) {
            query.put("RenewalPeriod", request.renewalPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalPeriodUnit)) {
            query.put("RenewalPeriodUnit", request.renewalPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionType)) {
            query.put("SubscriptionType", request.subscriptionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRenewal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRenewalResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables auto-renewal for an instance.</p>
     * 
     * @param request SetRenewalRequest
     * @return SetRenewalResponse
     */
    public SetRenewalResponse setRenewal(SetRenewalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRenewalWithOptions(request, runtime);
    }

    /**
     * @param request SetResellerUserAlarmThresholdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetResellerUserAlarmThresholdResponse
     */
    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdWithOptions(SetResellerUserAlarmThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmThresholds)) {
            query.put("AlarmThresholds", request.alarmThresholds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmType)) {
            query.put("AlarmType", request.alarmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserAlarmThreshold"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserAlarmThresholdResponse());
    }

    /**
     * @param request SetResellerUserAlarmThresholdRequest
     * @return SetResellerUserAlarmThresholdResponse
     */
    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    /**
     * @param request SetResellerUserQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetResellerUserQuotaResponse
     */
    public SetResellerUserQuotaResponse setResellerUserQuotaWithOptions(SetResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            query.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outBizId)) {
            query.put("OutBizId", request.outBizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserQuotaResponse());
    }

    /**
     * @param request SetResellerUserQuotaRequest
     * @return SetResellerUserQuotaResponse
     */
    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserQuotaWithOptions(request, runtime);
    }

    /**
     * @param request SetResellerUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetResellerUserStatusResponse
     */
    public SetResellerUserStatusResponse setResellerUserStatusWithOptions(SetResellerUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stopMode)) {
            query.put("StopMode", request.stopMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserStatus"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserStatusResponse());
    }

    /**
     * @param request SetResellerUserStatusRequest
     * @return SetResellerUserStatusResponse
     */
    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can subscribe to only one type of bill at a time.</li>
     * <li>The bills generated on the previous day are pushed on a daily basis the next day after you subscribe to the bills. The full-data bills for the previous month are pushed on the fourth day of each month. The monthly bills in the PDF format for the previous month are pushed on the fourth day of each month.</li>
     * <li>The daily bills may be delayed. The delayed bills are pushed the next day after they are generated. The delayed bills may include the bills that should have been pushed on the previous day. We recommend that you query the full-data bills for the previous month at the beginning of each month.</li>
     * <li>The bill subscriber must have the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The SubscribeBillToOSS operation has the same functionality as the Save Expense Details to OSS Bucket feature in User Center.</li>
     * <li>To subscribe to the bills stored in an OSS bucket, make sure that the directory name specified for the OSS bucket conforms to the following naming rules:</li>
     * </ul>
     * <ol>
     * <li><ol>
     * <li>The directory name can contain only UTF-8 characters and cannot contain emoticons.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>Forward slashes (/) are used to separate paths and can be used to create subdirectories with ease. The directory name cannot start with a forward slash (/), a backslash (\\), or consecutive forward slashes (/).</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The name of a subdirectory cannot be set to two consecutive periods (..).</li>
     * </ol>
     * </li>
     * <li><ol start="4">
     * <li>The directory name must be 1 to 254 characters in length.</li>
     * </ol>
     * </li>
     * </ol>
     * <ul>
     * <li>File names:<ul>
     * <li><strong>BillingItemDetailForBillingPeriod</strong> (Detailed bills of billable items)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetail_YYYYMMDD</code>. Example: <code>169**_BillingItemDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>. Example: <code>169**_BillingItemDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailForBillingPeriod</strong> (Detailed bills of instances)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetail_YYYYMMDD</code>. Example: <code>169**_InstanceDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>. Example: <code>169**_InstanceDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailMonthly</strong> (Instance-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetailMonthly_YYYYMM</code>. Example: <code>169**_InstanceDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>BillingItemDetailMonthly</strong> (Billable item-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetailMonthly_YYYYMM</code>. Example: <code>169**_BillingItemDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>SplitItemDetailDaily</strong> (Split bills summarized by day)<ul>
     * <li>File name format for a daily push: <code>UID_SplitItemDetailDaily_YYYYMM</code>. Example: <code>169**_SplitItemDetailDaily_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>MonthBill</strong> (Monthly bill in the PDF format)<ul>
     * <li>File name format for a monthly push: <code>UID_MonthBill_YYYYMM</code>. Example: <code>169**_MonthBill_201903</code>. The bill for the previous month is pushed on the fourth day of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>The bills of the MonthBill type are PDF files, whereas the bills of other types are CSV files. If the number of data rows in a bill exceeds a threshold, the bill is automatically split into multiple CSV files. Then, the multiple CSV files are automatically merged and compressed into a ZIP file that has the same name format as the original file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to the bills that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * @param request SubscribeBillToOSSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubscribeBillToOSSResponse
     */
    public SubscribeBillToOSSResponse subscribeBillToOSSWithOptions(SubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginBillingCycle)) {
            query.put("BeginBillingCycle", request.beginBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketOwnerId)) {
            query.put("BucketOwnerId", request.bucketOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketPath)) {
            query.put("BucketPath", request.bucketPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multAccountRelSubscribe)) {
            query.put("MultAccountRelSubscribe", request.multAccountRelSubscribe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rowLimitPerFile)) {
            query.put("RowLimitPerFile", request.rowLimitPerFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeBucket)) {
            query.put("SubscribeBucket", request.subscribeBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeType)) {
            query.put("SubscribeType", request.subscribeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usingSsl)) {
            query.put("UsingSsl", request.usingSsl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribeBillToOSS"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeBillToOSSResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, take note of the following items:</p>
     * <ul>
     * <li>You can subscribe to only one type of bill at a time.</li>
     * <li>The bills generated on the previous day are pushed on a daily basis the next day after you subscribe to the bills. The full-data bills for the previous month are pushed on the fourth day of each month. The monthly bills in the PDF format for the previous month are pushed on the fourth day of each month.</li>
     * <li>The daily bills may be delayed. The delayed bills are pushed the next day after they are generated. The delayed bills may include the bills that should have been pushed on the previous day. We recommend that you query the full-data bills for the previous month at the beginning of each month.</li>
     * <li>The bill subscriber must have the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission.</li>
     * <li>The SubscribeBillToOSS operation has the same functionality as the Save Expense Details to OSS Bucket feature in User Center.</li>
     * <li>To subscribe to the bills stored in an OSS bucket, make sure that the directory name specified for the OSS bucket conforms to the following naming rules:</li>
     * </ul>
     * <ol>
     * <li><ol>
     * <li>The directory name can contain only UTF-8 characters and cannot contain emoticons.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>Forward slashes (/) are used to separate paths and can be used to create subdirectories with ease. The directory name cannot start with a forward slash (/), a backslash (\\), or consecutive forward slashes (/).</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The name of a subdirectory cannot be set to two consecutive periods (..).</li>
     * </ol>
     * </li>
     * <li><ol start="4">
     * <li>The directory name must be 1 to 254 characters in length.</li>
     * </ol>
     * </li>
     * </ol>
     * <ul>
     * <li>File names:<ul>
     * <li><strong>BillingItemDetailForBillingPeriod</strong> (Detailed bills of billable items)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetail_YYYYMMDD</code>. Example: <code>169**_BillingItemDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>. Example: <code>169**_BillingItemDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailForBillingPeriod</strong> (Detailed bills of instances)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetail_YYYYMMDD</code>. Example: <code>169**_InstanceDetail_20190310</code>.</li>
     * <li>File name format for a full-data push at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>. Example: <code>169**_InstanceDetail_201903</code>.</li>
     * </ul>
     * </li>
     * <li><strong>InstanceDetailMonthly</strong> (Instance-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_InstanceDetailMonthly_YYYYMM</code>. Example: <code>169**_InstanceDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>BillingItemDetailMonthly</strong> (Billable item-based bills summarized by billing cycle)<ul>
     * <li>File name format for a daily push: <code>UID_BillingItemDetailMonthly_YYYYMM</code>. Example: <code>169**_BillingItemDetailMonthly_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>SplitItemDetailDaily</strong> (Split bills summarized by day)<ul>
     * <li>File name format for a daily push: <code>UID_SplitItemDetailDaily_YYYYMM</code>. Example: <code>169**_SplitItemDetailDaily_201903</code>. A bill of this type contains the full data generated from the beginning of the month to the current day, and is updated every day until the fourth day of the next month.</li>
     * </ul>
     * </li>
     * <li><strong>MonthBill</strong> (Monthly bill in the PDF format)<ul>
     * <li>File name format for a monthly push: <code>UID_MonthBill_YYYYMM</code>. Example: <code>169**_MonthBill_201903</code>. The bill for the previous month is pushed on the fourth day of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>The bills of the MonthBill type are PDF files, whereas the bills of other types are CSV files. If the number of data rows in a bill exceeds a threshold, the bill is automatically split into multiple CSV files. Then, the multiple CSV files are automatically merged and compressed into a ZIP file that has the same name format as the original file.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to the bills that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * @param request SubscribeBillToOSSRequest
     * @return SubscribeBillToOSSResponse
     */
    public SubscribeBillToOSSResponse subscribeBillToOSS(SubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeBillToOSSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unsubscribes from the bills that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * @param request UnsubscribeBillToOSSRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnsubscribeBillToOSSResponse
     */
    public UnsubscribeBillToOSSResponse unsubscribeBillToOSSWithOptions(UnsubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.multAccountRelSubscribe)) {
            query.put("MultAccountRelSubscribe", request.multAccountRelSubscribe);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscribeType)) {
            query.put("SubscribeType", request.subscribeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnsubscribeBillToOSS"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsubscribeBillToOSSResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unsubscribes from the bills that are stored in Object Storage Service (OSS) buckets.</p>
     * 
     * @param request UnsubscribeBillToOSSRequest
     * @return UnsubscribeBillToOSSResponse
     */
    public UnsubscribeBillToOSSResponse unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeBillToOSSWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a resource plan.</p>
     * 
     * @param request UpgradeResourcePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeResourcePackageResponse
     */
    public UpgradeResourcePackageResponse upgradeResourcePackageWithOptions(UpgradeResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveDate)) {
            query.put("EffectiveDate", request.effectiveDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specification)) {
            query.put("Specification", request.specification);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeResourcePackageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades a resource plan.</p>
     * 
     * @param request UpgradeResourcePackageRequest
     * @return UpgradeResourcePackageResponse
     */
    public UpgradeResourcePackageResponse upgradeResourcePackage(UpgradeResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeResourcePackageWithOptions(request, runtime);
    }
}
