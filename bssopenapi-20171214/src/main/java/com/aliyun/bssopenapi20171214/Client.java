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
     * <p>For more information about a financial relationship, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/116383.html">Usage notes on the trusteeship</a>. 
     * If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
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
     * <p>For more information about a financial relationship, see &lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/doc-detail/116383.html">Usage notes on the trusteeship</a>. 
     * If enterprise names used by the management account and a member for real-name verification are the same, you do not need to call an API operation for confirmation. Otherwise, you must call the ConfirmRelation operation for confirmation.</p>
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
     * <p>Allocates resource instances (instance-based and attached-resource-based) from a source financial unit to a destination financial unit.</p>
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
     * <p>Allocates resource instances (instance-based and attached-resource-based) from a source financial unit to a destination financial unit.</p>
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
     * <p>Submits an invoice application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.emails)) {
            query.put("emails", request.emails);
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
     * <p>Submits an invoice application.</p>
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
     * <b>description</b> :
     * <p>Deducts user quota consumption.</p>
     * 
     * <b>summary</b> : 
     * <p>Deducts user quota consumption.</p>
     * 
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
     * <b>description</b> :
     * <p>Deducts user quota consumption.</p>
     * 
     * <b>summary</b> : 
     * <p>Deducts user quota consumption.</p>
     * 
     * @param request ChangeResellerConsumeAmountRequest
     * @return ChangeResellerConsumeAmountResponse
     */
    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResellerConsumeAmountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Currently, only financial management linking is supported. The linked account needs to confirm the invitation only when the real-name verification information of the main account and the linked account is inconsistent.</li>
     * <li>The permissions to be confirmed must be exactly the same as the permissions specified in the invitation initiated by the main account for the confirmation to succeed.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Confirms an invitation initiated by the main account for a linked account.</p>
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
     * <ol>
     * <li>Currently, only financial management linking is supported. The linked account needs to confirm the invitation only when the real-name verification information of the main account and the linked account is inconsistent.</li>
     * <li>The permissions to be confirmed must be exactly the same as the permissions specified in the invitation initiated by the main account for the confirmation to succeed.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Confirms an invitation initiated by the main account for a linked account.</p>
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
     * <p>Changes the subscription type for an instance. Currently, this operation supports converting pay-as-you-go instances of SLB, EIP, and NAT Gateway to subscription instances, and converting subscription instances of SLB and EIP to pay-as-you-go instances.</p>
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
     * <p>Changes the subscription type for an instance. Currently, this operation supports converting pay-as-you-go instances of SLB, EIP, and NAT Gateway to subscription instances, and converting subscription instances of SLB and EIP to pay-as-you-go instances.</p>
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
     * <p>Creates a master-member relationship for financial management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an account linking relationship.</p>
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
     * <p>Creates a master-member relationship for financial management.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an account linking relationship.</p>
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
     * <p>Creates financial units. Batch creation is supported.</p>
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
     * <p>Creates financial units. Batch creation is supported.</p>
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
     * <p>Creates an instance resource. This operation creates an order for a new instance resource and completes automatic payment. ECS and RDS product series are not supported.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
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
     * <p>Creates an instance resource. This operation creates an order for a new instance resource and completes automatic payment. ECS and RDS product series are not supported.</p>
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
     * <p>Creates a user quota ledger and a quota consumption ledger.</p>
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
     * <p>Creates a user quota ledger and a quota consumption ledger.</p>
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
     * <p>创建资源包</p>
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
     * <p>创建资源包</p>
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
     * <p>创建节省计划实例</p>
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
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

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
     * <p>创建节省计划实例</p>
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
     * <p>Deletes a financial unit.</p>
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
     * <p>Deletes a financial unit.</p>
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
     * <p>This OpenAPI is in beta and available only to whitelisted users. Excessive calls may cause performance issues, such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a summary of cost budgets.</p>
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
     * <p>This OpenAPI is in beta and available only to whitelisted users. Excessive calls may cause performance issues, such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a summary of cost budgets.</p>
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
     * <ul>
     * <li>Amortized costs cannot be used for settlement or reconciliation. They are used to allocate your subscription and pay-as-you-go fees based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. The reason for this delay is that scenarios such as delayed billing, refunds, bill adjustments, and overdue payment write-offs can occur during the month. The data for the current month does not include unsettled pay-as-you-go fees for which bills have not yet been generated.</li>
     * <li>Amortized cost data from the last 12 months is available.</li>
     * <li>Data for attached resources is reflected in the amortized costs 48 hours after the split bill is generated. To use this feature, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for items that are not attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated intra-month. They are updated only after 12:00 on the sixth day of the following month. Consequently, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for these months.</li>
     * <li>Amortized cost data is available for querying 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized costs of instances for a specified amortization month.</p>
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
     * <ul>
     * <li>Amortized costs cannot be used for settlement or reconciliation. They are used to allocate your subscription and pay-as-you-go fees based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. The reason for this delay is that scenarios such as delayed billing, refunds, bill adjustments, and overdue payment write-offs can occur during the month. The data for the current month does not include unsettled pay-as-you-go fees for which bills have not yet been generated.</li>
     * <li>Amortized cost data from the last 12 months is available.</li>
     * <li>Data for attached resources is reflected in the amortized costs 48 hours after the split bill is generated. To use this feature, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for items that are not attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated intra-month. They are updated only after 12:00 on the sixth day of the following month. Consequently, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for these months.</li>
     * <li>Amortized cost data is available for querying 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized costs of instances for a specified amortization month.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are not used for settlement or reconciliation. They are used to allocate your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. This delay accounts for events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs. Data for the current month does not include unsettled pay-as-you-go fees.</li>
     * <li>Amortized cost data is available for the past 12 months.</li>
     * <li>Data for attached resources in the amortized costs is updated 48 hours after the split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated mid-month. They are updated only after 12:00 on the sixth day of the following month. In addition, specific costs for attached resources, such as domain names, buckets, and EIPs, of products such as CDN, OSS, and Internet Shared Bandwidth, are not provided for this period.</li>
     * <li>Amortized cost data is available only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Costs</a> feature. The data becomes available 48 hours after enablement.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of an instance by billing cycle.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are not used for settlement or reconciliation. They are used to allocate your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. This delay accounts for events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs. Data for the current month does not include unsettled pay-as-you-go fees.</li>
     * <li>Amortized cost data is available for the past 12 months.</li>
     * <li>Data for attached resources in the amortized costs is updated 48 hours after the split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs are not updated mid-month. They are updated only after 12:00 on the sixth day of the following month. In addition, specific costs for attached resources, such as domain names, buckets, and EIPs, of products such as CDN, OSS, and Internet Shared Bandwidth, are not provided for this period.</li>
     * <li>Amortized cost data is available only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Costs</a> feature. The data becomes available 48 hours after enablement.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of an instance by billing cycle.</p>
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
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be viewed or exported after 12:00 on the 3rd day of the next month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>The bill data for the current month does not include unsettled pay-as-you-go data that is unbilled or accumulating.</li>
     * <li>Data for the last 18 months is supported. </li>
     * <li>Bill data is updated with a 24-hour delay compared to actual consumption. Information related to the instance ID, such as instance configuration, instance type, instance alias, resource group, public IP address, private IP address, and zone, is updated with a 48-hour delay.  </li>
     * <li>Bill data does not provide the specific costs of individual split items, such as domain names, buckets, and EIPs, for split-type cloud services, such as CDN, OSS, and Internet Shared Bandwidth. To view data that includes split items, go to the split bill page.</li>
     * <li>For cloud communication products, only detail data from June 2020 onwards is supported. For HiChina products, including domain names and trademarks, only detail data from November 2020 onwards is supported.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumption summary of all product instances or billable items for a user within a specific billing cycle.</p>
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
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be viewed or exported after 12:00 on the 3rd day of the next month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>The bill data for the current month does not include unsettled pay-as-you-go data that is unbilled or accumulating.</li>
     * <li>Data for the last 18 months is supported. </li>
     * <li>Bill data is updated with a 24-hour delay compared to actual consumption. Information related to the instance ID, such as instance configuration, instance type, instance alias, resource group, public IP address, private IP address, and zone, is updated with a 48-hour delay.  </li>
     * <li>Bill data does not provide the specific costs of individual split items, such as domain names, buckets, and EIPs, for split-type cloud services, such as CDN, OSS, and Internet Shared Bandwidth. To view data that includes split items, go to the split bill page.</li>
     * <li>For cloud communication products, only detail data from June 2020 onwards is supported. For HiChina products, including domain names and trademarks, only detail data from November 2020 onwards is supported.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the consumption summary of all product instances or billable items for a user within a specific billing cycle.</p>
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
     * <p>Queries the module information of a specific Alibaba Cloud product.</p>
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
     * <p>Queries the module information of a specific Alibaba Cloud product.</p>
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
     * <ul>
     * <li>Amortized costs are for cost allocation purposes only and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. Data for the current month is not final. This is because it does not include unsettled pay-as-you-go fees and may change due to events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data for attached resources, which requires you to enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>, is updated 48 hours after the split bill is generated. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated during the month. They were updated only after 12:00 on the sixth day of the following month. In addition, cost details for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for this period.</li>
     * <li>Amortized cost data becomes available 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of products for a specified month.</p>
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
     * <ul>
     * <li>Amortized costs are for cost allocation purposes only and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified allocation rules.</li>
     * <li>The final data for a month is available after 12:00 on the sixth day of the following month. Data for the current month is not final. This is because it does not include unsettled pay-as-you-go fees and may change due to events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data for attached resources, which requires you to enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>, is updated 48 hours after the split bill is generated. Data for other resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated during the month. They were updated only after 12:00 on the sixth day of the following month. In addition, cost details for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available for this period.</li>
     * <li>Amortized cost data becomes available 48 hours after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of products for a specified month.</p>
     * 
     * @param request DescribeProductAmortizedCostByAmortizationPeriodRequest
     * @return DescribeProductAmortizedCostByAmortizationPeriodResponse
     */
    public DescribeProductAmortizedCostByAmortizationPeriodResponse describeProductAmortizedCostByAmortizationPeriod(DescribeProductAmortizedCostByAmortizationPeriodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeProductAmortizedCostByAmortizationPeriodWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are used for cost allocation and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified rules.</li>
     * <li>The final data for a given month is available after 12:00 on the sixth day of the following month. This delay ensures that potential mid-month events, such as delayed billing, refunds, bill adjustments, and overdue payment write-offs, are included. Data for the current month does not include unsettled pay-as-you-go fees that have not yet been billed or are still accumulating.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data related to attached resources is updated in the amortized costs 48 hours after the corresponding split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data that is not related to attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated mid-month and were only updated after 12:00 on the sixth day of the following month. Additionally, for this period, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available.</li>
     * <li>Amortized cost data is provided only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature. The data is available 48 hours after you enable it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of a product for a specific billing cycle.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>Amortized costs are used for cost allocation and cannot be used for settlement or reconciliation. This feature allocates your cloud expenses, including both subscription and pay-as-you-go fees, based on specified rules.</li>
     * <li>The final data for a given month is available after 12:00 on the sixth day of the following month. This delay ensures that potential mid-month events, such as delayed billing, refunds, bill adjustments, and overdue payment write-offs, are included. Data for the current month does not include unsettled pay-as-you-go fees that have not yet been billed or are still accumulating.</li>
     * <li>Amortized cost data for the past 12 months is available.</li>
     * <li>Data related to attached resources is updated in the amortized costs 48 hours after the corresponding split bill is generated. To view the costs of attached resources, you must first enable <a href="https://usercenter2.aliyun.com/finance/split-bill">split bills</a>. Data that is not related to attached resources is updated 48 hours after the detailed bill is generated.</li>
     * <li>For months before August 2021, amortized costs were not updated mid-month and were only updated after 12:00 on the sixth day of the following month. Additionally, for this period, specific costs for attached resources, such as domain names, buckets, and EIPs, for products such as CDN, OSS, and Internet Shared Bandwidth are not available.</li>
     * <li>Amortized cost data is provided only after you enable the <a href="https://usercenter2.aliyun.com/finance/amortized-costs">Amortized Cost</a> feature. The data is available 48 hours after you enable it.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the monthly amortized cost of a product for a specific billing cycle.</p>
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
     * <ol>
     * <li>The data is consistent with the list data in the Coverage Overview section of the Resource Instance Management menu in the User Center.</li>
     * <li>Currently, coverage queries are supported for reserved instances (RIs) and storage capacity units (SCUs).</li>
     * <li>Coverage queries are provided in three dimensions: hour, day, and month.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage details of reserved instances and storage capacity units (SCUs).</p>
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
     * <ol>
     * <li>The data is consistent with the list data in the Coverage Overview section of the Resource Instance Management menu in the User Center.</li>
     * <li>Currently, coverage queries are supported for reserved instances (RIs) and storage capacity units (SCUs).</li>
     * <li>Coverage queries are provided in three dimensions: hour, day, and month.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage details of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Returns the same summary data as the Coverage Overview in the Resource Instance Management menu of the User Center.
     * Currently, coverage queries are supported for two resource types: reserved instances (RIs) and storage capacity units (SCUs).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage summary of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Returns the same summary data as the Coverage Overview in the Resource Instance Management menu of the User Center.
     * Currently, coverage queries are supported for two resource types: reserved instances (RIs) and storage capacity units (SCUs).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the coverage summary of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Queries the usage details of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Queries the usage details of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Queries the usage summary of reserved instances and storage capacity units (SCUs).</p>
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
     * <p>Queries the usage summary of reserved instances and storage capacity units (SCUs).</p>
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
     * @param tmpReq DescribeSavingsPlansCoverageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansCoverageDetailResponse
     */
    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetailWithOptions(DescribeSavingsPlansCoverageDetailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSavingsPlansCoverageDetailShrinkRequest request = new DescribeSavingsPlansCoverageDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParam)) {
            request.filterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParam, "FilterParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamShrink)) {
            query.put("FilterParam", request.filterParamShrink);
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
     * <p>Queries the summary of savings plan coverage.</p>
     * 
     * @param tmpReq DescribeSavingsPlansCoverageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotalWithOptions(DescribeSavingsPlansCoverageTotalRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSavingsPlansCoverageTotalShrinkRequest request = new DescribeSavingsPlansCoverageTotalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParam)) {
            request.filterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParam, "FilterParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamShrink)) {
            query.put("FilterParam", request.filterParamShrink);
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
     * <p>Queries the summary of savings plan coverage.</p>
     * 
     * @param request DescribeSavingsPlansCoverageTotalRequest
     * @return DescribeSavingsPlansCoverageTotalResponse
     */
    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSavingsPlansCoverageTotalWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage details of savings plans.</p>
     * 
     * @param tmpReq DescribeSavingsPlansUsageDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansUsageDetailResponse
     */
    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetailWithOptions(DescribeSavingsPlansUsageDetailRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSavingsPlansUsageDetailShrinkRequest request = new DescribeSavingsPlansUsageDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParam)) {
            request.filterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParam, "FilterParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamShrink)) {
            query.put("FilterParam", request.filterParamShrink);
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
     * <b>summary</b> : 
     * <p>Queries the usage details of savings plans.</p>
     * 
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
     * @param tmpReq DescribeSavingsPlansUsageTotalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSavingsPlansUsageTotalResponse
     */
    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotalWithOptions(DescribeSavingsPlansUsageTotalRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSavingsPlansUsageTotalShrinkRequest request = new DescribeSavingsPlansUsageTotalShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterParam)) {
            request.filterParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterParam, "FilterParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billOwnerId)) {
            query.put("BillOwnerId", request.billOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endPeriod)) {
            query.put("EndPeriod", request.endPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterParamShrink)) {
            query.put("FilterParam", request.filterParamShrink);
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
     * <ul>
     * <li>The query results for the current month\&quot;s split bills are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be queried after 12:00 on the 4th day of the next month. The split bill data for the current month does not include unsettled pay-as-you-go data (unbilled or being accumulated).</li>
     * <li>Split bill data is available for the last 12 months.</li>
     * <li>Split bill data is updated with a 48-hour delay compared to actual expenses. For split cloud services (such as CDN, OSS, and Internet Shared Bandwidth), the specific expenses for each attached resource (such as domain names, buckets, and EIPs) are updated with a 72-hour delay.</li>
     * <li>Split bill data is available only after you enable the feature on the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/finance/split-bill">Split Bill</a> page in the console. The data becomes available 24 hours after you enable the feature.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
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
     * <ul>
     * <li>The query results for the current month\&quot;s split bills are for reference only and cannot be used as the basis for reconciliation. The final bill for the current month can be queried after 12:00 on the 4th day of the next month. The split bill data for the current month does not include unsettled pay-as-you-go data (unbilled or being accumulated).</li>
     * <li>Split bill data is available for the last 12 months.</li>
     * <li>Split bill data is updated with a 48-hour delay compared to actual expenses. For split cloud services (such as CDN, OSS, and Internet Shared Bandwidth), the specific expenses for each attached resource (such as domain names, buckets, and EIPs) are updated with a 72-hour delay.</li>
     * <li>Split bill data is available only after you enable the feature on the &lt;props=&quot;china&quot;&gt;<a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a>&lt;props=&quot;intl&quot;&gt;<a href="https://usercenter2-intl.aliyun.com/finance/split-bill">Split Bill</a> page in the console. The data becomes available 24 hours after you enable the feature.</li>
     * <li>The rate limit is 10 requests per second per user. If a timeout occurs, retry the request.</li>
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
     * <p>Queries the details of an account linking.</p>
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
     * <p>Queries the details of an account linking.</p>
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
     * <p>Queries the account information of an end customer under a partner.</p>
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
     * <p>Queries the account information of an end customer under a partner.</p>
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
     * <p>The system queries the list of associated end customer UIDs based on the AccessKey pair in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of end customer UIDs under a partner.</p>
     * 
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
     * <p>The system queries the list of associated end customer UIDs based on the AccessKey pair in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of end customer UIDs under a partner.</p>
     * @return GetCustomerListResponse
     */
    public GetCustomerListResponse getCustomerList() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerListWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific order for a user or a distribution customer.</p>
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
     * <p>Queries the details of a specific order for a user or a distribution customer.</p>
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
     * <h3>Operation description</h3>
     * <ol>
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of a product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query pricing module information</a>.</li>
     * <li>Call this operation with the obtained product configuration parameters to query the price of a pay-as-you-go product.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of a pay-as-you-go product.</p>
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
     * <h3>Operation description</h3>
     * <ol>
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of a product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query pricing module information</a>.</li>
     * <li>Call this operation with the obtained product configuration parameters to query the price of a pay-as-you-go product.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the price of a pay-as-you-go product.</p>
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
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query product module information</a>.</li>
     * <li>Call this operation to query the prices of subscription products based on the obtained product configuration parameters.</li>
     * <li>Concatenate the Config parameter under ModuleList based on the config parameter returned by the DescribePricingModule operation. Do not omit any parameters. Otherwise, an error occurs during the price inquiry.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of subscription products.</p>
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
     * <li>Call QueryProductList to obtain the product code. For more information, see <a href="https://help.aliyun.com/document_detail/95984.html">Query product information</a>.</li>
     * <li>Call the DescribePricingModule operation to obtain the configuration parameters of the product. For more information, see <a href="https://help.aliyun.com/document_detail/96469.html">Query product module information</a>.</li>
     * <li>Call this operation to query the prices of subscription products based on the obtained product configuration parameters.</li>
     * <li>Concatenate the Config parameter under ModuleList based on the config parameter returned by the DescribePricingModule operation. Do not omit any parameters. Otherwise, an error occurs during the price inquiry.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the prices of subscription products.</p>
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
     * <li><strong>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</strong></li>
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund rules</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International Website</a></li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the refund amount for an instance that you want to unsubscribe from.</p>
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
     * <li><strong>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</strong></li>
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund rules</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International Website</a></li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the refund amount for an instance that you want to unsubscribe from.</p>
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
     * <p>Adds or deletes permissions for an account linking relationship.</p>
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
     * <p>Adds or deletes permissions for an account linking relationship.</p>
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
     * <p>Modifies financial units. Batch modification is supported.</p>
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
     * <p>Modifies financial units. Batch modification is supported.</p>
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
     * <p>Modifies the resource configuration of an instance. Invoking this operation creates an order for the Upgrade/Downgrade of instance resources and processes automatic payment. This operation does not support configuration changes for ECS or RDS products. Use the dedicated API of the corresponding product to execute the Upgrade/Downgrade.</p>
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
     * <p>Modifies the resource configuration of an instance. Invoking this operation creates an order for the Upgrade/Downgrade of instance resources and processes automatic payment. This operation does not support configuration changes for ECS or RDS products. Use the dedicated API of the corresponding product to execute the Upgrade/Downgrade.</p>
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
     * <p>对客订单支付接口</p>
     * 
     * @param request PayOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PayOrderResponse
     */
    public PayOrderResponse payOrderWithOptions(PayOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.buyerId)) {
            query.put("BuyerId", request.buyerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paySubmitUid)) {
            query.put("PaySubmitUid", request.paySubmitUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payerId)) {
            query.put("PayerId", request.payerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PayOrder"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PayOrderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>对客订单支付接口</p>
     * 
     * @param request PayOrderRequest
     * @return PayOrderResponse
     */
    public PayOrderResponse payOrder(PayOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.payOrderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user\&quot;s account balance.</p>
     * 
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
     * <p>Queries the user\&quot;s account balance.</p>
     * @return QueryAccountBalanceResponse
     */
    public QueryAccountBalanceResponse queryAccountBalance() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBalanceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>Data for the current month is for reference only. Do not use it for reconciliation. The final bill for the current month is available to view or export after 12:00 on the third day of the next month. This delay accounts for mid-month events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Data from the last 18 months is available.</li>
     * <li>Billing data is updated 24 hours after actual resource consumption. Information related to instance IDs, such as instance configurations, instance types, instance nicknames, resource groups, public IP addresses, private IP addresses, and zones, is updated with a 48-hour delay.</li>
     * <li>Billing data does not include the costs of attached resources, such as domain names, buckets, and elastic IP addresses (EIPs), for products such as CDN, OSS, and Internet Shared Bandwidth. To view statistics that include data for attached resources, go to Split Bill.</li>
     * <li>For Alibaba Cloud Communications products, detailed data is available only from June 2020 onwards. For HiChina products, such as Domain Names and trademarks, detailed data is available only from November 2020 onwards.</li>
     * <li>Each account is limited to 10 queries per second. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries account spending within a billing cycle and aggregates the data by resource owner.</p>
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
     * <ul>
     * <li>Data for the current month is for reference only. Do not use it for reconciliation. The final bill for the current month is available to view or export after 12:00 on the third day of the next month. This delay accounts for mid-month events such as delayed billing, refunds, bill adjustments, and overdue payment write-offs.</li>
     * <li>Data from the last 18 months is available.</li>
     * <li>Billing data is updated 24 hours after actual resource consumption. Information related to instance IDs, such as instance configurations, instance types, instance nicknames, resource groups, public IP addresses, private IP addresses, and zones, is updated with a 48-hour delay.</li>
     * <li>Billing data does not include the costs of attached resources, such as domain names, buckets, and elastic IP addresses (EIPs), for products such as CDN, OSS, and Internet Shared Bandwidth. To view statistics that include data for attached resources, go to Split Bill.</li>
     * <li>For Alibaba Cloud Communications products, detailed data is available only from June 2020 onwards. For HiChina products, such as Domain Names and trademarks, detailed data is available only from November 2020 onwards.</li>
     * <li>Each account is limited to 10 queries per second. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries account spending within a billing cycle and aggregates the data by resource owner.</p>
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
     * <p>Queries the income and expenditure details of account transactions.</p>
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
     * <p>Queries the income and expenditure details of account transactions.</p>
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
     * <p>Queries the transaction records of a user account.</p>
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
     * <p>Queries the transaction records of a user account.</p>
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
     * <p>Queries the list of available instances for the user.</p>
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
     * <p>Queries the list of available instances for the user.</p>
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
     * <p>Queries the settlement bills of a user within a specific billing cycle.</p>
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
     * <p>Queries the settlement bills of a user within a specific billing cycle.</p>
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
     * <p>Queries the bill overview of a user for a specific billing cycle.</p>
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
     * <p>Queries the bill overview of a user for a specific billing cycle.</p>
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
     * <p>Queries the records of bill subscriptions to OSS buckets.</p>
     * 
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
     * <p>Queries the records of bill subscriptions to OSS buckets.</p>
     * @return QueryBillToOSSSubscriptionResponse
     */
    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillToOSSSubscriptionWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries user voucher information.</p>
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
     * <p>Queries user voucher information.</p>
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
     * <p>Retrieves a list of commodity information based on a product code.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of commodity information based on a product code.</p>
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
     * <p>Retrieves a list of commodity information based on a product code.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a list of commodity information based on a product code.</p>
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
     * <p>Queries all financial unit nodes under the current node of the financial unit tree. If ParentUnitId is set to -1, all financial units are queried.</p>
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
     * <p>Queries all financial unit nodes under the current node of the financial unit tree. If ParentUnitId is set to -1, all financial units are queried.</p>
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
     * <p>Queries the list of resource instances that belong to a financial unit of a user. When UnitId is set to 0, the query returns unallocated primary and sub-resource instances.</p>
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
     * <p>Queries the list of resource instances that belong to a financial unit of a user. When UnitId is set to 0, the query returns unallocated primary and sub-resource instances.</p>
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
     * <p>Queries the Alibaba Cloud invoice mailing address information service.</p>
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
     * <p>Queries the Alibaba Cloud invoice mailing address information service.</p>
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
     * <li>Only usage records from the past year are supported.</li>
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
     * <li>Only usage records from the past year are supported.</li>
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
     * <p>Queries a list of objects that are eligible for invoicing.</p>
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
     * <p>Queries a list of objects that are eligible for invoicing.</p>
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
     * <p>Queries the enterprise financial account information of an account that has primary-subsidiary relationship permissions.</p>
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
     * <p>Queries the enterprise financial account information of an account that has primary-subsidiary relationship permissions.</p>
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
     * <h2>API description</h2>
     * <p>Note the following when you call this operation:</p>
     * <ul>
     * <li>The API for instance bills has been upgraded. We recommend that you use the new operation <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a>. This operation no longer supports querying data beyond the 50,000th row.</li>
     * <li>Instance bills are generated based on split billing data. A delay of about one day may occur.</li>
     * <li>Instance information may change within a billing cycle. The instance Config and Spec in the monthly summary reflect the information at the time the record was generated. For more information, see the corresponding detailed bill.</li>
     * <li>Data for Alibaba Cloud Communications products is available from June 2020. Data for HiChina products is available from November 2020.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>For the international site (alibabacloud.com), select Singapore as the endpoint.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage summary of all product instances or billable items for an account in a billing cycle. This operation has been upgraded to DescribeInstanceBill. This operation no longer queries data beyond the 50,000th row.</p>
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
     * <h2>API description</h2>
     * <p>Note the following when you call this operation:</p>
     * <ul>
     * <li>The API for instance bills has been upgraded. We recommend that you use the new operation <a href="https://help.aliyun.com/document_detail/209402.html">DescribeInstanceBill</a>. This operation no longer supports querying data beyond the 50,000th row.</li>
     * <li>Instance bills are generated based on split billing data. A delay of about one day may occur.</li>
     * <li>Instance information may change within a billing cycle. The instance Config and Spec in the monthly summary reflect the information at the time the record was generated. For more information, see the corresponding detailed bill.</li>
     * <li>Data for Alibaba Cloud Communications products is available from June 2020. Data for HiChina products is available from November 2020.
     * &lt;props=&quot;intl&quot;&gt;</li>
     * <li>For the international site (alibabacloud.com), select Singapore as the endpoint.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the usage summary of all product instances or billable items for an account in a billing cycle. This operation has been upgraded to DescribeInstanceBill. This operation no longer queries data beyond the 50,000th row.</p>
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
     * <p>Queries a list of instances by tags.</p>
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
     * <p>Queries a list of instances by tags.</p>
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
     * <p>This API is deprecated. Use the following APIs to retrieve the amortized cost: <code>DescribeInstanceAmortizedCostByAmortizationPeriod</code> - retrieves instance costs by amortization period; <code>DescribeProductAmortizedCostByAmortizationPeriod</code> - retrieves product costs by amortization period; <code>DescribeInstanceAmortizedCostByConsumePeriod</code> - retrieves instance costs by consume period; <code>DescribeProductAmortizedCostByConsumePeriod</code> - retrieves product costs by consume period.</p>
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
     * <p>This API is deprecated. Use the following APIs to retrieve the amortized cost: <code>DescribeInstanceAmortizedCostByAmortizationPeriod</code> - retrieves instance costs by amortization period; <code>DescribeProductAmortizedCostByAmortizationPeriod</code> - retrieves product costs by amortization period; <code>DescribeInstanceAmortizedCostByConsumePeriod</code> - retrieves instance costs by consume period; <code>DescribeProductAmortizedCostByConsumePeriod</code> - retrieves product costs by consume period.</p>
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
     * <p>Queries the invoicing information of an Alibaba Cloud user.</p>
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
     * <p>Queries the invoicing information of an Alibaba Cloud user.</p>
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
     * <p>Queries the orders of users or distribution customers. By default, this operation queries orders created within the last hour. To query orders over a longer period, specify the CreateTimeStart and CreateTimeEnd parameters.</p>
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
     * <p>Queries the orders of users or distribution customers. By default, this operation queries orders created within the last hour. To query orders over a longer period, specify the CreateTimeStart and CreateTimeEnd parameters.</p>
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
     * <p>Queries the permissions for a master-member relationship based on the relationship ID.</p>
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
     * <p>Queries the permissions for a master-member relationship based on the relationship ID.</p>
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
     * <p>Queries user card package information.</p>
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
     * <p>Queries user card package information.</p>
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
     * <p>Queries the pricing entities under a commodity. A pricing entity is the smallest product capability used for metering and cost calculation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the pricing entities under a commodity. A pricing entity is the smallest product capability used for metering and cost calculation.</p>
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
     * <p>Queries the pricing entities under a commodity. A pricing entity is the smallest product capability used for metering and cost calculation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the pricing entities under a commodity. A pricing entity is the smallest product capability used for metering and cost calculation.</p>
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
     * <p>Queries the list of products available for the current account to order. The response includes the product code, product name, and subscription type (subscription or pay-as-you-go).</p>
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
     * <p>Queries the list of products available for the current account to order. The response includes the product code, product name, and subscription type (subscription or pay-as-you-go).</p>
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
     * <p>Queries the usage of reserved instances (RIs).</p>
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
     * <p>Queries the usage of reserved instances (RIs).</p>
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
     * <p>Queries the redemption ticket information of a user.</p>
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
     * <p>Queries the redemption ticket information of a user.</p>
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
     * <p>Queries a list of the relationships of member accounts.</p>
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
     * <p>Queries a list of the relationships of member accounts.</p>
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
     * <p>Queries the available quota for a user in a reseller payment scenario.</p>
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
     * <p>Queries the available quota for a user in a reseller payment scenario.</p>
     * 
     * @param request QueryResellerAvailableQuotaRequest
     * @return QueryResellerAvailableQuotaResponse
     */
    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResellerAvailableQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the alarm thresholds for low quotas.</p>
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
     * <b>description</b> :
     * <p>Queries the alarm thresholds for low quotas.</p>
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
     * <p>Queries the instances of a specific resource plan for a user. Only valid resource plans are supported.</p>
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
     * <p>Queries the instances of a specific resource plan for a user. Only valid resource plans are supported.</p>
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
     * <p>Queries the details of savings plan deductions.</p>
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
     * <p>Queries the details of savings plan deductions.</p>
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
     * <p>Queries the discount information for savings plans.</p>
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
     * <p>Queries the discount information for savings plans.</p>
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
     * <p>Queries information about your savings plan instances.</p>
     * 
     * @param request QuerySavingsPlansInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySavingsPlansInstanceResponse
     */
    public QuerySavingsPlansInstanceResponse querySavingsPlansInstanceWithOptions(QuerySavingsPlansInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

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
     * <p>Queries information about your savings plan instances.</p>
     * 
     * @param request QuerySavingsPlansInstanceRequest
     * @return QuerySavingsPlansInstanceResponse
     */
    public QuerySavingsPlansInstanceResponse querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySavingsPlansInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used for reconciliation. The final bill for the current month is available for viewing or export after 12:00 on the 2nd of the following month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, adjustments, and overdue payment write-offs.</li>
     * <li>Bill data is updated with a 5-hour delay relative to actual cost consumption.</li>
     * <li>For bills in the &quot;Unsettled&quot; state in historical billing cycles, the status is updated to settled 5 hours after payment. For bills in the &quot;Unsettled&quot; state in the current month, the status is updated to settled when the bill is generated at 12:00 on the 2nd of the following month.</li>
     * <li>This API supports graceful backoff with a request rate of 600/60(s).</li>
     * <li>The rate limit per user is 10 requests per second. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the settlement bills of a user for a specific billing cycle. Supports domestic accounts with more than 50,000 bill entries.</p>
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
     * <b>description</b> :
     * <ul>
     * <li>The query results for the current month are for reference only and cannot be used for reconciliation. The final bill for the current month is available for viewing or export after 12:00 on the 2nd of the following month. During the month, a few scenarios may occur, including but not limited to delayed billing, refunds, adjustments, and overdue payment write-offs.</li>
     * <li>Bill data is updated with a 5-hour delay relative to actual cost consumption.</li>
     * <li>For bills in the &quot;Unsettled&quot; state in historical billing cycles, the status is updated to settled 5 hours after payment. For bills in the &quot;Unsettled&quot; state in the current month, the status is updated to settled when the bill is generated at 12:00 on the 2nd of the following month.</li>
     * <li>This API supports graceful backoff with a request rate of 600/60(s).</li>
     * <li>The rate limit per user is 10 requests per second. If a timeout occurs, retry the request.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the settlement bills of a user for a specific billing cycle. Supports domestic accounts with more than 50,000 bill entries.</p>
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
     * <p>Queries the list of SKUs and their list prices under a specified pricing entity of a commodity. A product feature typically has 1 to multiple SKUs, and some products can have tens of thousands of SKUs. The request parameters support filtered queries based on specific SKU configuration conditions.</p>
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
     * <p>Queries the list of SKUs and their list prices under a specified pricing entity of a commodity. A product feature typically has 1 to multiple SKUs, and some products can have tens of thousands of SKUs. The request parameters support filtered queries based on specific SKU configuration conditions.</p>
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
     * <ul>
     * <li>The API for split bills is upgraded. We recommend that you use the new <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation. This operation no longer supports querying more than 50,000 rows of data.</li>
     * <li>The data is consistent with the split bill data for the specified billing cycle in the User Center.</li>
     * <li>You can query split bills that were generated within the last 12 months.</li>
     * <li>To use this feature, you must first enable it on the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> page in the console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills. This API has been upgraded. We recommend that you use the new DescribeSplitItemBill operation.</p>
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
     * <ul>
     * <li>The API for split bills is upgraded. We recommend that you use the new <a href="https://help.aliyun.com/document_detail/208169.html">DescribeSplitItemBill</a> operation. This operation no longer supports querying more than 50,000 rows of data.</li>
     * <li>The data is consistent with the split bill data for the specified billing cycle in the User Center.</li>
     * <li>You can query split bills that were generated within the last 12 months.</li>
     * <li>To use this feature, you must first enable it on the <a href="https://usercenter2.aliyun.com/finance/split-bill">Split Bill</a> page in the console.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries split bills. This API has been upgraded. We recommend that you use the new DescribeSplitItemBill operation.</p>
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
     * <h2>API description</h2>
     * <ul>
     * <li>The specified cloud service parameter must be one of the following cloud service codes. The metering data types include hourly and daily.</li>
     * <li>The time format must comply with the ISO 8601 standard. Time specification constraints:<ul>
     * <li>   Due to delays in data push, the data integrity of hourly metering data is guaranteed for the past 24 hours, and the data integrity of daily metering data is guaranteed for the past 2 days.</li>
     * <li>   The time span can cover the metering data of the most recent quarter.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metering records for the specified cloud service.</p>
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
     * <h2>API description</h2>
     * <ul>
     * <li>The specified cloud service parameter must be one of the following cloud service codes. The metering data types include hourly and daily.</li>
     * <li>The time format must comply with the ISO 8601 standard. Time specification constraints:<ul>
     * <li>   Due to delays in data push, the data integrity of hourly metering data is guaranteed for the past 24 hours, and the data integrity of daily metering data is guaranteed for the past 2 days.</li>
     * <li>   The time span can cover the metering data of the most recent quarter.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metering records for the specified cloud service.</p>
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
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</li>
     * <li>This operation can be called only by direct customers. Reseller customers cannot use this operation.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund policy</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International site</a></li>
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
     * <li>Only the actual paid amount is refunded. Used vouchers are not refunded.</li>
     * <li>Carefully verify the information about the resource to be unsubscribed, and confirm the unsubscription terms and refund amount. Resources cannot be recovered after unsubscription.</li>
     * <li>This operation can be called only by direct customers. Reseller customers cannot use this operation.</li>
     * <li>For other questions, refer to: &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/knowledge_detail/116043.html?spm=a2c81.e1d666e.app.2.62ae11271Kd6iM">Refund policy</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/user-center/user-guide/refund-rules">Refund rules for Alibaba Cloud International site</a></li>
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
     * <p>Disassociates a RAM user from an Alibaba Cloud account.</p>
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
     * <p>Disassociates a RAM user from an Alibaba Cloud account.</p>
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
     * <p>Renews an instance and changes its configuration. The configuration change is applied after the renewal order takes effect. Payment is processed automatically. This operation cannot be used to create ECS or RDS instances.</p>
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
     * <p>Renews an instance and changes its configuration. The configuration change is applied after the renewal order takes effect. Payment is processed automatically. This operation cannot be used to create ECS or RDS instances.</p>
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
     * <p>Renews a specified instance. This operation does not support renewing ECS, RDS, or Redis instances. To renew these instances, call the dedicated renewal API of the corresponding service.</p>
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
     * <p>Renews a specified instance. This operation does not support renewing ECS, RDS, or Redis instances. To renew these instances, call the dedicated renewal API of the corresponding service.</p>
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
     * <p>Renews a resource package instance.</p>
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
     * <p>Renews a resource package instance.</p>
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
     * <b>description</b> :
     * <p>Configures low-balance alert rules for quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures low-balance alert rules for quotas.</p>
     * 
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
     * <b>description</b> :
     * <p>Configures low-balance alert rules for quotas.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures low-balance alert rules for quotas.</p>
     * 
     * @param request SetResellerUserAlarmThresholdRequest
     * @return SetResellerUserAlarmThresholdResponse
     */
    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>设置用户配额账本的Quota额度</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the quota ledger and consumption ledger.</p>
     * 
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
     * <b>description</b> :
     * <p>设置用户配额账本的Quota额度</p>
     * 
     * <b>summary</b> : 
     * <p>Modify the quota ledger and consumption ledger.</p>
     * 
     * @param request SetResellerUserQuotaRequest
     * @return SetResellerUserQuotaResponse
     */
    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets the status of a reseller\&quot;s user account, such as frozen or hosted.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the SQL audit feature for users.</p>
     * 
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
     * <b>description</b> :
     * <p>Sets the status of a reseller\&quot;s user account, such as frozen or hosted.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the SQL audit feature for users.</p>
     * 
     * @param request SetResellerUserStatusRequest
     * @return SetResellerUserStatusResponse
     */
    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置节省计划用户级抵扣规则</p>
     * 
     * @param tmpReq SetSavingPlanUserDeductRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSavingPlanUserDeductRuleResponse
     */
    public SetSavingPlanUserDeductRuleResponse setSavingPlanUserDeductRuleWithOptions(SetSavingPlanUserDeductRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSavingPlanUserDeductRuleShrinkRequest request = new SetSavingPlanUserDeductRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userDeductRules)) {
            request.userDeductRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userDeductRules, "UserDeductRules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spnInstanceCode)) {
            body.put("SpnInstanceCode", request.spnInstanceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userDeductRulesShrink)) {
            body.put("UserDeductRules", request.userDeductRulesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSavingPlanUserDeductRule"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSavingPlanUserDeductRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置节省计划用户级抵扣规则</p>
     * 
     * @param request SetSavingPlanUserDeductRuleRequest
     * @return SetSavingPlanUserDeductRuleResponse
     */
    public SetSavingPlanUserDeductRuleResponse setSavingPlanUserDeductRule(SetSavingPlanUserDeductRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSavingPlanUserDeductRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before calling this operation, note the following information:</p>
     * <ul>
     * <li>You can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, the bill file generated on the previous day is pushed daily starting from the next day. On the 4th of each month, the full bill files for the entire billing cycle of the previous month are pushed. The monthly bill PDF is pushed on the 4th of each month for the previous month.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bills are pushed the day after they are generated and may include bills from earlier days that were delayed until the previous day. Pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>To use OSS subscription for the first time, grant the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user. If the authorization is revoked, the system stops pushing files, and the user must re-authorize.</p>
     * </blockquote>
     * </li>
     * <li>This subscription is the same feature as &quot;Bill Data Storage&quot; in the Expenses and Costs console. Subscriptions are synchronized between the two.</li>
     * <li>When subscribing to a directory under a bucket, follow the directory naming conventions:<ul>
     * <li>Emojis are not allowed. Use valid UTF-8 characters.</li>
     * <li>Use / to separate paths and quickly create subdirectories. Do not start with / or \, and do not use consecutive / characters.</li>
     * <li>A subdirectory named .. is not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p><strong>BillingItemDetailForBillingPeriod</strong> (billing item details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_BillingItemDetail_YYYYMMDD</code>, for example, <code>169**_BillingItemDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>, for example, <code>169**_BillingItemDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailForBillingPeriod</strong> (instance bill details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_InstanceDetail_YYYYMMDD</code>, for example, <code>169**_InstanceDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>, for example, <code>169**_InstanceDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailMonthly</strong> (instance bill summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_InstanceDetailMonthly_YYYYMM</code>, for example, <code>169**_InstanceDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>BillingItemDetailMonthly</strong> (billing item summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_BillingItemDetailMonthly_YYYYMM</code>, for example, <code>169**_BillingItemDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>SplitItemDetailDaily</strong> (split bill daily summary)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_SplitItemDetailDaily_YYYYMM</code>, for example, <code>169**_SplitItemDetailDaily_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>MonthBill</strong> (monthly bill PDF)</p>
     * <ul>
     * <li>Monthly push file name format: <code>UID_MonthBill_YYYYMM</code>, for example, <code>169**_MonthBill_201903</code>. The file for the previous month is pushed on the 4th of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Except for MonthBill, which is a PDF file, all other file types are CSV files. If the number of rows in a bill file exceeds a certain threshold, the file is automatically split into multiple CSV files, which are then compressed into a single ZIP file. The ZIP file name follows the same format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to bill files by using Object Storage Service (OSS), which stores billing data in a specified OSS bucket.</p>
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
     * <p>Before calling this operation, note the following information:</p>
     * <ul>
     * <li>You can subscribe to one type of bill file at a time.</li>
     * <li>After subscription, the bill file generated on the previous day is pushed daily starting from the next day. On the 4th of each month, the full bill files for the entire billing cycle of the previous month are pushed. The monthly bill PDF is pushed on the 4th of each month for the previous month.</li>
     * <li>Bill files generated on a daily basis may be delayed. Delayed bills are pushed the day after they are generated and may include bills from earlier days that were delayed until the previous day. Pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>To use OSS subscription for the first time, grant the <a href="https://ram.console.aliyun.com/#/role/authorize?request=%7B%22Requests%22:%20%7B%22request1%22:%20%7B%22RoleName%22:%20%22AliyunConsumeDump2OSSRole%22,%20%22TemplateId%22:%20%22Dump2OSSRole%22%7D%7D,%20%22ReturnUrl%22:%20%22https:%2F%2Fusercenter2.aliyun.com%22,%20%22Service%22:%20%22Consume%22%7D">AliyunConsumeDump2OSSRole</a> permission to the subscribing user. If the authorization is revoked, the system stops pushing files, and the user must re-authorize.</p>
     * </blockquote>
     * </li>
     * <li>This subscription is the same feature as &quot;Bill Data Storage&quot; in the Expenses and Costs console. Subscriptions are synchronized between the two.</li>
     * <li>When subscribing to a directory under a bucket, follow the directory naming conventions:<ul>
     * <li>Emojis are not allowed. Use valid UTF-8 characters.</li>
     * <li>Use / to separate paths and quickly create subdirectories. Do not start with / or \, and do not use consecutive / characters.</li>
     * <li>A subdirectory named .. is not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p><strong>BillingItemDetailForBillingPeriod</strong> (billing item details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_BillingItemDetail_YYYYMMDD</code>, for example, <code>169**_BillingItemDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_BillingItemDetail_YYYYMM</code>, for example, <code>169**_BillingItemDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailForBillingPeriod</strong> (instance bill details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>UID_InstanceDetail_YYYYMMDD</code>, for example, <code>169**_InstanceDetail_20190310</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>UID_InstanceDetail_YYYYMM</code>, for example, <code>169**_InstanceDetail_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>InstanceDetailMonthly</strong> (instance bill summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_InstanceDetailMonthly_YYYYMM</code>, for example, <code>169**_InstanceDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>BillingItemDetailMonthly</strong> (billing item summary by billing cycle)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_BillingItemDetailMonthly_YYYYMM</code>, for example, <code>169**_BillingItemDetailMonthly_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>SplitItemDetailDaily</strong> (split bill daily summary)</p>
     * <ul>
     * <li>Daily push file name format: <code>UID_SplitItemDetailDaily_YYYYMM</code>, for example, <code>169**_SplitItemDetailDaily_201903</code>. This file is updated daily with full data from the beginning of the month to the current day, until the 4th of the next month.</li>
     * </ul>
     * </li>
     * <li><p><strong>MonthBill</strong> (monthly bill PDF)</p>
     * <ul>
     * <li>Monthly push file name format: <code>UID_MonthBill_YYYYMM</code>, for example, <code>169**_MonthBill_201903</code>. The file for the previous month is pushed on the 4th of each month.</li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Except for MonthBill, which is a PDF file, all other file types are CSV files. If the number of rows in a bill file exceeds a certain threshold, the file is automatically split into multiple CSV files, which are then compressed into a single ZIP file. The ZIP file name follows the same format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Subscribes to bill files by using Object Storage Service (OSS), which stores billing data in a specified OSS bucket.</p>
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
     * <p>Adds tags to resources.</p>
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
     * <p>Adds tags to resources.</p>
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
     * <p>Cancels a detailed list export subscription.</p>
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
     * <p>Cancels a detailed list export subscription.</p>
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
