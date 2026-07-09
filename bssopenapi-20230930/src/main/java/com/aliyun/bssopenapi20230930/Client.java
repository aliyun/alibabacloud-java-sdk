// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930;

import com.aliyun.tea.*;
import com.aliyun.bssopenapi20230930.models.*;

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
     * <b>summary</b> : 
     * <p>添加优惠券抵扣标签</p>
     * 
     * @param tmpReq AddCouponDeductTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCouponDeductTagResponse
     */
    public AddCouponDeductTagResponse addCouponDeductTagWithOptions(AddCouponDeductTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddCouponDeductTagShrinkRequest request = new AddCouponDeductTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCouponDeductTag"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCouponDeductTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加优惠券抵扣标签</p>
     * 
     * @param request AddCouponDeductTagRequest
     * @return AddCouponDeductTagResponse
     */
    public AddCouponDeductTagResponse addCouponDeductTag(AddCouponDeductTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCouponDeductTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Allocates resource instances (instance-based and attached-resource-based) from a source cost center to a destination cost center.</p>
     * 
     * @param tmpReq AllocateCostCenterResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateCostCenterResourceResponse
     */
    public AllocateCostCenterResourceResponse allocateCostCenterResourceWithOptions(AllocateCostCenterResourceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AllocateCostCenterResourceShrinkRequest request = new AllocateCostCenterResourceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceInstanceList)) {
            request.resourceInstanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceInstanceList, "ResourceInstanceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromCostCenterId)) {
            body.put("FromCostCenterId", request.fromCostCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromOwnerAccountId)) {
            body.put("FromOwnerAccountId", request.fromOwnerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceListShrink)) {
            body.put("ResourceInstanceList", request.resourceInstanceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toCostCenterId)) {
            body.put("ToCostCenterId", request.toCostCenterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateCostCenterResource"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateCostCenterResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Allocates resource instances (instance-based and attached-resource-based) from a source cost center to a destination cost center.</p>
     * 
     * @param request AllocateCostCenterResourceRequest
     * @return AllocateCostCenterResourceResponse
     */
    public AllocateCostCenterResourceResponse allocateCostCenterResource(AllocateCostCenterResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateCostCenterResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Cancels the low balance alert for a fund account.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the low balance alert for a fund account.</p>
     * 
     * @param request CancelFundAccountLowAvailableAmountAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelFundAccountLowAvailableAmountAlarmResponse
     */
    public CancelFundAccountLowAvailableAmountAlarmResponse cancelFundAccountLowAvailableAmountAlarmWithOptions(CancelFundAccountLowAvailableAmountAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelFundAccountLowAvailableAmountAlarm"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelFundAccountLowAvailableAmountAlarmResponse());
    }

    /**
     * <b>description</b> :
     * <p>Cancels the low balance alert for a fund account.</p>
     * 
     * <b>summary</b> : 
     * <p>Cancels the low balance alert for a fund account.</p>
     * 
     * @param request CancelFundAccountLowAvailableAmountAlarmRequest
     * @return CancelFundAccountLowAvailableAmountAlarmResponse
     */
    public CancelFundAccountLowAvailableAmountAlarmResponse cancelFundAccountLowAvailableAmountAlarm(CancelFundAccountLowAvailableAmountAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelFundAccountLowAvailableAmountAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>提货券账户检查是否存在</p>
     * 
     * @param request CheckAccountExistRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckAccountExistResponse
     */
    public CheckAccountExistResponse checkAccountExistWithOptions(CheckAccountExistRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.toUserType)) {
            body.put("ToUserType", request.toUserType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferAccount)) {
            body.put("TransferAccount", request.transferAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccountExist"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountExistResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>提货券账户检查是否存在</p>
     * 
     * @param request CheckAccountExistRequest
     * @return CheckAccountExistResponse
     */
    public CheckAccountExistResponse checkAccountExist(CheckAccountExistRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkAccountExistWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified budgetName exists.</p>
     * 
     * @param request CheckBudgetNameExistsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckBudgetNameExistsResponse
     */
    public CheckBudgetNameExistsResponse checkBudgetNameExistsWithOptions(CheckBudgetNameExistsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckBudgetNameExists"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBudgetNameExistsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether a specified budgetName exists.</p>
     * 
     * @param request CheckBudgetNameExistsRequest
     * @return CheckBudgetNameExistsResponse
     */
    public CheckBudgetNameExistsResponse checkBudgetNameExists(CheckBudgetNameExistsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkBudgetNameExistsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a budget.</p>
     * 
     * @param tmpReq CreateBudgetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBudgetResponse
     */
    public CreateBudgetResponse createBudgetWithOptions(CreateBudgetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBudgetShrinkRequest request = new CreateBudgetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cycleQuota)) {
            request.cycleQuotaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cycleQuota, "CycleQuota", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryFilter)) {
            request.queryFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryFilter, "QueryFilter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.warnConfs)) {
            request.warnConfsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.warnConfs, "WarnConfs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetType)) {
            body.put("BudgetType", request.budgetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleEndPeriod)) {
            body.put("CycleEndPeriod", request.cycleEndPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleQuotaShrink)) {
            body.put("CycleQuota", request.cycleQuotaShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleStartPeriod)) {
            body.put("CycleStartPeriod", request.cycleStartPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryFilterShrink)) {
            body.put("QueryFilter", request.queryFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("Quota", request.quota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaType)) {
            body.put("QuotaType", request.quotaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnConfsShrink)) {
            body.put("WarnConfs", request.warnConfsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBudget"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBudgetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a budget.</p>
     * 
     * @param request CreateBudgetRequest
     * @return CreateBudgetResponse
     */
    public CreateBudgetResponse createBudget(CreateBudgetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBudgetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates one or more cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Cost Center</p>
     * 
     * @param tmpReq CreateCostCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCostCenterResponse
     */
    public CreateCostCenterResponse createCostCenterWithOptions(CreateCostCenterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCostCenterShrinkRequest request = new CreateCostCenterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.costCenterEntityList)) {
            request.costCenterEntityListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.costCenterEntityList, "CostCenterEntityList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterEntityListShrink)) {
            query.put("CostCenterEntityList", request.costCenterEntityListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCostCenter"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCostCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates one or more cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Create Cost Center</p>
     * 
     * @param request CreateCostCenterRequest
     * @return CreateCostCenterResponse
     */
    public CreateCostCenterResponse createCostCenter(CreateCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a financial unit auto-allocation rule</p>
     * 
     * @param tmpReq CreateCostCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCostCenterRuleResponse
     */
    public CreateCostCenterRuleResponse createCostCenterRuleWithOptions(CreateCostCenterRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCostCenterRuleShrinkRequest request = new CreateCostCenterRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterExpression)) {
            request.filterExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterExpression, "FilterExpression", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterExpressionShrink)) {
            query.put("FilterExpression", request.filterExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            body.put("CostCenterId", request.costCenterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCostCenterRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCostCenterRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a financial unit auto-allocation rule</p>
     * 
     * @param request CreateCostCenterRuleRequest
     * @return CreateCostCenterRuleResponse
     */
    public CreateCostCenterRuleResponse createCostCenterRule(CreateCostCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCostCenterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create payment relationships for a fund account</p>
     * 
     * @param tmpReq CreateFundAccountPayRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFundAccountPayRelationResponse
     */
    public CreateFundAccountPayRelationResponse createFundAccountPayRelationWithOptions(CreateFundAccountPayRelationRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFundAccountPayRelationShrinkRequest request = new CreateFundAccountPayRelationShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFundAccountPayRelation"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFundAccountPayRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create payment relationships for a fund account</p>
     * 
     * @param request CreateFundAccountPayRelationRequest
     * @return CreateFundAccountPayRelationResponse
     */
    public CreateFundAccountPayRelationResponse createFundAccountPayRelation(CreateFundAccountPayRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFundAccountPayRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account transfer or revocation.</p>
     * 
     * @param request CreateFundAccountTransferRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFundAccountTransferResponse
     */
    public CreateFundAccountTransferResponse createFundAccountTransferWithOptions(CreateFundAccountTransferRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.financeType)) {
            body.put("FinanceType", request.financeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromFundAccountId)) {
            body.put("FromFundAccountId", request.fromFundAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toFundAccountId)) {
            body.put("ToFundAccountId", request.toFundAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferType)) {
            body.put("TransferType", request.transferType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFundAccountTransfer"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFundAccountTransferResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account transfer or revocation.</p>
     * 
     * @param request CreateFundAccountTransferRequest
     * @return CreateFundAccountTransferResponse
     */
    public CreateFundAccountTransferResponse createFundAccountTransfer(CreateFundAccountTransferRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFundAccountTransferWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Apply for Invoice</p>
     * 
     * @param tmpReq CreateInvoiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInvoiceResponse
     */
    public CreateInvoiceResponse createInvoiceWithOptions(CreateInvoiceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateInvoiceShrinkRequest request = new CreateInvoiceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceCandidateIds)) {
            request.invoiceCandidateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceCandidateIds, "InvoiceCandidateIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recipientEmails)) {
            request.recipientEmailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recipientEmails, "RecipientEmails", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceCandidateIdsShrink)) {
            query.put("InvoiceCandidateIds", request.invoiceCandidateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceMode)) {
            query.put("InvoiceMode", request.invoiceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceRemark)) {
            query.put("InvoiceRemark", request.invoiceRemark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceTitleId)) {
            query.put("InvoiceTitleId", request.invoiceTitleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceType)) {
            query.put("InvoiceType", request.invoiceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recipientEmailsShrink)) {
            query.put("RecipientEmails", request.recipientEmailsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInvoice"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInvoiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Apply for Invoice</p>
     * 
     * @param request CreateInvoiceRequest
     * @return CreateInvoiceResponse
     */
    public CreateInvoiceResponse createInvoice(CreateInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInvoiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this API operation, note the following information:</p>
     * <ul>
     * <li>You can subscribe to one type of billing file at a time.</li>
     * <li>Except for monthly bill PDFs, starting from the day after the subscription, the system pushes daily billing files that contain full detailed data from the beginning of the current month to the present. Before the 4th of each month, the system pushes full billing files for the complete billing cycle of the previous month.</li>
     * <li>Monthly bill PDFs are pushed before the 4th of each month for the previous month.</li>
     * <li>Billing files generated on a daily basis may have delays. Delayed billing files are pushed on the day after they are generated and may also contain bills that were delayed from before the previous day and generated on the previous day. We recommend that you pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>Apply for the required permissions by following the procedure described in the documentation: <a href="https://help.aliyun.com/zh/user-center/user-guide/billing-subscription?spm=5176.21213303.J_v8LsmxMG6alneH-O7TCPa.1.3ef82f3d5ZIf08&scm=20140722.S_help@@%E6%96%87%E6%A1%A3@@2861820._.ID_help@@%E6%96%87%E6%A1%A3@@2861820-RL_%E8%B4%A6%E5%8D%95%E8%AE%A2%E9%98%85-LOC_2024SPHelpResult-OR_ser-PAR1_2150419517478292121114501eaee8-V_4-RE_new5-P0_0-P1_0">Billing Subscription</a></p>
     * </blockquote>
     * </li>
     * <li>This subscription and the Expenses and Costs - Billing Subscription are the same feature, and subscriptions are interchangeable.</li>
     * <li>When subscribing to a directory under a bucket, follow the directory naming conventions:<ul>
     * <li>Emojis are not allowed. Use compliant UTF-8 characters.</li>
     * <li>Forward slashes (/) are used to separate paths and can quickly create subdirectories. However, do not start with / or \, and do not use consecutive forward slashes (/).</li>
     * <li>Subdirectories named .. are not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p>Example: <strong>consumeDetailBillV2</strong> (billing item details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMMDD}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_20190312</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMM}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Monthly bill PDF files are in .pdf format, and other file types are in .csv format. When the data volume is large, the system automatically splits the exported bills into multiple files and compresses them into one or more .zip files. The .zip file name format is the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a billing report subscription.</p>
     * 
     * @param request CreateReportDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReportDefinitionResponse
     */
    public CreateReportDefinitionResponse createReportDefinitionWithOptions(CreateReportDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginBillingCycle)) {
            query.put("BeginBillingCycle", request.beginBillingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMembers)) {
            query.put("IncludeMembers", request.includeMembers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.notSendOnNoData)) {
            query.put("NotSendOnNoData", request.notSendOnNoData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketName)) {
            query.put("OssBucketName", request.ossBucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketOwnerAccountId)) {
            query.put("OssBucketOwnerAccountId", request.ossBucketOwnerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucketPath)) {
            query.put("OssBucketPath", request.ossBucketPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sendWithAttach)) {
            query.put("SendWithAttach", request.sendWithAttach);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.splitFileOnUserId)) {
            query.put("SplitFileOnUserId", request.splitFileOnUserId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mcProject)) {
            body.put("McProject", request.mcProject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mcTableName)) {
            body.put("McTableName", request.mcTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportSourceType)) {
            body.put("ReportSourceType", request.reportSourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReportDefinition"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReportDefinitionResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this API operation, note the following information:</p>
     * <ul>
     * <li>You can subscribe to one type of billing file at a time.</li>
     * <li>Except for monthly bill PDFs, starting from the day after the subscription, the system pushes daily billing files that contain full detailed data from the beginning of the current month to the present. Before the 4th of each month, the system pushes full billing files for the complete billing cycle of the previous month.</li>
     * <li>Monthly bill PDFs are pushed before the 4th of each month for the previous month.</li>
     * <li>Billing files generated on a daily basis may have delays. Delayed billing files are pushed on the day after they are generated and may also contain bills that were delayed from before the previous day and generated on the previous day. We recommend that you pull the full files for the previous month at the beginning of each month.<blockquote>
     * <p>Apply for the required permissions by following the procedure described in the documentation: <a href="https://help.aliyun.com/zh/user-center/user-guide/billing-subscription?spm=5176.21213303.J_v8LsmxMG6alneH-O7TCPa.1.3ef82f3d5ZIf08&scm=20140722.S_help@@%E6%96%87%E6%A1%A3@@2861820._.ID_help@@%E6%96%87%E6%A1%A3@@2861820-RL_%E8%B4%A6%E5%8D%95%E8%AE%A2%E9%98%85-LOC_2024SPHelpResult-OR_ser-PAR1_2150419517478292121114501eaee8-V_4-RE_new5-P0_0-P1_0">Billing Subscription</a></p>
     * </blockquote>
     * </li>
     * <li>This subscription and the Expenses and Costs - Billing Subscription are the same feature, and subscriptions are interchangeable.</li>
     * <li>When subscribing to a directory under a bucket, follow the directory naming conventions:<ul>
     * <li>Emojis are not allowed. Use compliant UTF-8 characters.</li>
     * <li>Forward slashes (/) are used to separate paths and can quickly create subdirectories. However, do not start with / or \, and do not use consecutive forward slashes (/).</li>
     * <li>Subdirectories named .. are not allowed.</li>
     * <li>The total length must be 1 to 254 characters.</li>
     * </ul>
     * </li>
     * <li>File names:<ul>
     * <li><p>Example: <strong>consumeDetailBillV2</strong> (billing item details)</p>
     * <ul>
     * <li><p>Daily push file name format: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMMDD}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_20190312</code>.</p>
     * </li>
     * <li><p>Full file name format at the beginning of the next month: <code>{Account UID}_{Site ID}_{Bill type}_{YYYYMM|YYYYMM}</code>, for example: <code>169**_2688801000001_consumeDetailBillV2_201903</code>.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * </li>
     * <li>Monthly bill PDF files are in .pdf format, and other file types are in .csv format. When the data volume is large, the system automatically splits the exported bills into multiple files and compresses them into one or more .zip files. The .zip file name format is the same.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a billing report subscription.</p>
     * 
     * @param request CreateReportDefinitionRequest
     * @return CreateReportDefinitionResponse
     */
    public CreateReportDefinitionResponse createReportDefinition(CreateReportDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReportDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a budget.</p>
     * 
     * @param request DeleteBudgetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBudgetResponse
     */
    public DeleteBudgetResponse deleteBudgetWithOptions(DeleteBudgetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBudget"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBudgetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a budget.</p>
     * 
     * @param request DeleteBudgetRequest
     * @return DeleteBudgetResponse
     */
    public DeleteBudgetResponse deleteBudget(DeleteBudgetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBudgetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Cost Center</p>
     * 
     * @param request DeleteCostCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCostCenterResponse
     */
    public DeleteCostCenterResponse deleteCostCenterWithOptions(DeleteCostCenterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            query.put("CostCenterId", request.costCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            query.put("OwnerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCostCenter"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCostCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Cost Center</p>
     * 
     * @param request DeleteCostCenterRequest
     * @return DeleteCostCenterResponse
     */
    public DeleteCostCenterResponse deleteCostCenter(DeleteCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete financial unit automatic allocation rule</p>
     * 
     * @param tmpReq DeleteCostCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCostCenterRuleResponse
     */
    public DeleteCostCenterRuleResponse deleteCostCenterRuleWithOptions(DeleteCostCenterRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCostCenterRuleShrinkRequest request = new DeleteCostCenterRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterExpression)) {
            request.filterExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterExpression, "FilterExpression", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterExpressionShrink)) {
            query.put("FilterExpression", request.filterExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            body.put("CostCenterId", request.costCenterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCostCenterRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCostCenterRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API is in canary release and is only available to whitelisted users. Excessive calls may cause performance issues such as response timeouts.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete financial unit automatic allocation rule</p>
     * 
     * @param request DeleteCostCenterRuleRequest
     * @return DeleteCostCenterRuleResponse
     */
    public DeleteCostCenterRuleResponse deleteCostCenterRule(DeleteCostCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostCenterRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除优惠券的抵扣标签</p>
     * 
     * @param tmpReq DeleteCouponDeductTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCouponDeductTagResponse
     */
    public DeleteCouponDeductTagResponse deleteCouponDeductTagWithOptions(DeleteCouponDeductTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteCouponDeductTagShrinkRequest request = new DeleteCouponDeductTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tagKeys)) {
            request.tagKeysShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tagKeys, "TagKeys", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeysShrink)) {
            query.put("TagKeys", request.tagKeysShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCouponDeductTag"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCouponDeductTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除优惠券的抵扣标签</p>
     * 
     * @param request DeleteCouponDeductTagRequest
     * @return DeleteCouponDeductTagResponse
     */
    public DeleteCouponDeductTagResponse deleteCouponDeductTag(DeleteCouponDeductTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCouponDeductTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bill report export subscription.</p>
     * 
     * @param request DeleteReportDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteReportDefinitionResponse
     */
    public DeleteReportDefinitionResponse deleteReportDefinitionWithOptions(DeleteReportDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTaskId)) {
            query.put("ReportTaskId", request.reportTaskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteReportDefinition"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteReportDefinitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a bill report export subscription.</p>
     * 
     * @param request DeleteReportDefinitionRequest
     * @return DeleteReportDefinitionResponse
     */
    public DeleteReportDefinitionResponse deleteReportDefinition(DeleteReportDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteReportDefinitionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Budget</p>
     * 
     * @param request DescribeBudgetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBudgetResponse
     */
    public DescribeBudgetResponse describeBudgetWithOptions(DescribeBudgetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBudget"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBudgetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query a Single Budget</p>
     * 
     * @param request DescribeBudgetRequest
     * @return DescribeBudgetResponse
     */
    public DescribeBudgetResponse describeBudget(DescribeBudgetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBudgetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query budget list</p>
     * 
     * @param request DescribeBudgetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBudgetsResponse
     */
    public DescribeBudgetsResponse describeBudgetsWithOptions(DescribeBudgetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetType)) {
            body.put("BudgetType", request.budgetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireStatus)) {
            body.put("ExpireStatus", request.expireStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNo)) {
            body.put("PageNo", request.pageNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBudgets"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBudgetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query budget list</p>
     * 
     * @param request DescribeBudgetsRequest
     * @return DescribeBudgetsResponse
     */
    public DescribeBudgetsResponse describeBudgets(DescribeBudgetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBudgetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of coupons.</p>
     * 
     * @param tmpReq DescribeCouponRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCouponResponse
     */
    public DescribeCouponResponse describeCouponWithOptions(DescribeCouponRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCouponShrinkRequest request = new DescribeCouponShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.couponTemplateIdList)) {
            request.couponTemplateIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.couponTemplateIdList, "CouponTemplateIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponNo)) {
            query.put("CouponNo", request.couponNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateIdListShrink)) {
            query.put("CouponTemplateIdList", request.couponTemplateIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponType)) {
            query.put("CouponType", request.couponType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveEndTime)) {
            query.put("EffectiveEndTime", request.effectiveEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveStartTime)) {
            query.put("EffectiveStartTime", request.effectiveStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireEndDate)) {
            query.put("ExpireEndDate", request.expireEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireStartDate)) {
            query.put("ExpireStartDate", request.expireStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeShare)) {
            query.put("IncludeShare", request.includeShare);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            query.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCoupon"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCouponResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of coupons.</p>
     * 
     * @param request DescribeCouponRequest
     * @return DescribeCouponResponse
     */
    public DescribeCouponResponse describeCoupon(DescribeCouponRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of products available for a coupon.</p>
     * 
     * @param tmpReq DescribeCouponItemListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCouponItemListResponse
     */
    public DescribeCouponItemListResponse describeCouponItemListWithOptions(DescribeCouponItemListRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCouponItemListShrinkRequest request = new DescribeCouponItemListShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCouponItemList"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCouponItemListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of products available for a coupon.</p>
     * 
     * @param request DescribeCouponItemListRequest
     * @return DescribeCouponItemListResponse
     */
    public DescribeCouponItemListResponse describeCouponItemList(DescribeCouponItemListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCouponItemListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource plan deduction records.</p>
     * 
     * @param tmpReq DescribeDeductLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeductLogsResponse
     */
    public DescribeDeductLogsResponse describeDeductLogsWithOptions(DescribeDeductLogsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeDeductLogsShrinkRequest request = new DescribeDeductLogsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relationAccountIds)) {
            request.relationAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relationAccountIds, "RelationAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billInstanceId)) {
            query.put("BillInstanceId", request.billInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingCommodityCode)) {
            body.put("BillingCommodityCode", request.billingCommodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingEndTime)) {
            body.put("BillingEndTime", request.billingEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingStartTime)) {
            body.put("BillingStartTime", request.billingStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationAccountIdsShrink)) {
            body.put("RelationAccountIds", request.relationAccountIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeductLogs"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeductLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource plan deduction records.</p>
     * 
     * @param request DescribeDeductLogsRequest
     * @return DescribeDeductLogsResponse
     */
    public DescribeDeductLogsResponse describeDeductLogs(DescribeDeductLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeductLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource plan instances.</p>
     * 
     * @param tmpReq DescribeFrInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFrInstancesResponse
     */
    public DescribeFrInstancesResponse describeFrInstancesWithOptions(DescribeFrInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeFrInstancesShrinkRequest request = new DescribeFrInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTag)) {
            query.put("InstanceTag", request.instanceTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityType)) {
            body.put("CapacityType", request.capacityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            body.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            body.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            body.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCode)) {
            body.put("ProductCode", request.productCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortField)) {
            body.put("SortField", request.sortField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortRule)) {
            body.put("SortRule", request.sortRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            body.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateCode)) {
            body.put("TemplateCode", request.templateCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFrInstances"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFrInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries resource plan instances.</p>
     * 
     * @param request DescribeFrInstancesRequest
     * @return DescribeFrInstancesResponse
     */
    public DescribeFrInstancesResponse describeFrInstances(DescribeFrInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFrInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取客户使用SPN的概述信息</p>
     * 
     * @param tmpReq DescribeUserSpnSummaryInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserSpnSummaryInfoResponse
     */
    public DescribeUserSpnSummaryInfoResponse describeUserSpnSummaryInfoWithOptions(DescribeUserSpnSummaryInfoRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeUserSpnSummaryInfoShrinkRequest request = new DescribeUserSpnSummaryInfoShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserSpnSummaryInfo"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserSpnSummaryInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取客户使用SPN的概述信息</p>
     * 
     * @param request DescribeUserSpnSummaryInfoRequest
     * @return DescribeUserSpnSummaryInfoResponse
     */
    public DescribeUserSpnSummaryInfoResponse describeUserSpnSummaryInfo(DescribeUserSpnSummaryInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserSpnSummaryInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query available balance of fund account</p>
     * 
     * @param request GetFundAccountAvailableAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountAvailableAmountResponse
     */
    public GetFundAccountAvailableAmountResponse getFundAccountAvailableAmountWithOptions(GetFundAccountAvailableAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountAvailableAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountAvailableAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query available balance of fund account</p>
     * 
     * @param request GetFundAccountAvailableAmountRequest
     * @return GetFundAccountAvailableAmountResponse
     */
    public GetFundAccountAvailableAmountResponse getFundAccountAvailableAmount(GetFundAccountAvailableAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountAvailableAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query allocatable credit limit of a fund account</p>
     * 
     * @param request GetFundAccountCanAllocateCreditAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountCanAllocateCreditAmountResponse
     */
    public GetFundAccountCanAllocateCreditAmountResponse getFundAccountCanAllocateCreditAmountWithOptions(GetFundAccountCanAllocateCreditAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountCanAllocateCreditAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountCanAllocateCreditAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query allocatable credit limit of a fund account</p>
     * 
     * @param request GetFundAccountCanAllocateCreditAmountRequest
     * @return GetFundAccountCanAllocateCreditAmountResponse
     */
    public GetFundAccountCanAllocateCreditAmountResponse getFundAccountCanAllocateCreditAmount(GetFundAccountCanAllocateCreditAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountCanAllocateCreditAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the reclaimable amount of a fund account.</p>
     * 
     * @param request GetFundAccountCanRecycleAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountCanRecycleAmountResponse
     */
    public GetFundAccountCanRecycleAmountResponse getFundAccountCanRecycleAmountWithOptions(GetFundAccountCanRecycleAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recycleFromFundAccountId)) {
            body.put("RecycleFromFundAccountId", request.recycleFromFundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountCanRecycleAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountCanRecycleAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the reclaimable amount of a fund account.</p>
     * 
     * @param request GetFundAccountCanRecycleAmountRequest
     * @return GetFundAccountCanRecycleAmountResponse
     */
    public GetFundAccountCanRecycleAmountResponse getFundAccountCanRecycleAmount(GetFundAccountCanRecycleAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountCanRecycleAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the transferable amount of a fund account</p>
     * 
     * @param request GetFundAccountCanTransferAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountCanTransferAmountResponse
     */
    public GetFundAccountCanTransferAmountResponse getFundAccountCanTransferAmountWithOptions(GetFundAccountCanTransferAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountCanTransferAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountCanTransferAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the transferable amount of a fund account</p>
     * 
     * @param request GetFundAccountCanTransferAmountRequest
     * @return GetFundAccountCanTransferAmountResponse
     */
    public GetFundAccountCanTransferAmountResponse getFundAccountCanTransferAmount(GetFundAccountCanTransferAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountCanTransferAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Withdrawable Amount of Fund Account</p>
     * 
     * @param request GetFundAccountCanWithdrawAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountCanWithdrawAmountResponse
     */
    public GetFundAccountCanWithdrawAmountResponse getFundAccountCanWithdrawAmountWithOptions(GetFundAccountCanWithdrawAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountCanWithdrawAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountCanWithdrawAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Withdrawable Amount of Fund Account</p>
     * 
     * @param request GetFundAccountCanWithdrawAmountRequest
     * @return GetFundAccountCanWithdrawAmountResponse
     */
    public GetFundAccountCanWithdrawAmountResponse getFundAccountCanWithdrawAmount(GetFundAccountCanWithdrawAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountCanWithdrawAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query Fund Account Low Balance Alert</p>
     * 
     * @param request GetFundAccountLowAvailableAmountAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountLowAvailableAmountAlarmResponse
     */
    public GetFundAccountLowAvailableAmountAlarmResponse getFundAccountLowAvailableAmountAlarmWithOptions(GetFundAccountLowAvailableAmountAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountLowAvailableAmountAlarm"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountLowAvailableAmountAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query Fund Account Low Balance Alert</p>
     * 
     * @param request GetFundAccountLowAvailableAmountAlarmRequest
     * @return GetFundAccountLowAvailableAmountAlarmResponse
     */
    public GetFundAccountLowAvailableAmountAlarmResponse getFundAccountLowAvailableAmountAlarm(GetFundAccountLowAvailableAmountAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountLowAvailableAmountAlarmWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query fund account transaction details</p>
     * 
     * @param tmpReq GetFundAccountTransactionDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFundAccountTransactionDetailsResponse
     */
    public GetFundAccountTransactionDetailsResponse getFundAccountTransactionDetailsWithOptions(GetFundAccountTransactionDetailsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetFundAccountTransactionDetailsShrinkRequest request = new GetFundAccountTransactionDetailsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transactionChannelList)) {
            request.transactionChannelListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transactionChannelList, "TransactionChannelList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.transactionTypeList)) {
            request.transactionTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.transactionTypeList, "TransactionTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billNumber)) {
            body.put("BillNumber", request.billNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelTransactionNumber)) {
            body.put("ChannelTransactionNumber", request.channelTransactionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionChannelListShrink)) {
            body.put("TransactionChannelList", request.transactionChannelListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionDirection)) {
            body.put("TransactionDirection", request.transactionDirection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionNumber)) {
            body.put("TransactionNumber", request.transactionNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionType)) {
            body.put("TransactionType", request.transactionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionTypeListShrink)) {
            body.put("TransactionTypeList", request.transactionTypeListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFundAccountTransactionDetails"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFundAccountTransactionDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query fund account transaction details</p>
     * 
     * @param request GetFundAccountTransactionDetailsRequest
     * @return GetFundAccountTransactionDetailsResponse
     */
    public GetFundAccountTransactionDetailsResponse getFundAccountTransactionDetails(GetFundAccountTransactionDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFundAccountTransactionDetailsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific order for a user or a reseller\&quot;s customer.</p>
     * 
     * @param request GetOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderDetailResponse
     */
    public GetOrderDetailResponse getOrderDetailWithOptions(GetOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
        }

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
            new TeaPair("version", "2023-09-30"),
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
     * <p>Queries the details of a specific order for a user or a reseller\&quot;s customer.</p>
     * 
     * @param request GetOrderDetailRequest
     * @return GetOrderDetailResponse
     */
    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the order list of a user or a reseller customer. By default, this operation queries orders created within the most recent hour. To query orders over a longer time range, set the CreateTimeStart and CreateTimeEnd parameters.</p>
     * 
     * @param request GetOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrdersResponse
     */
    public GetOrdersResponse getOrdersWithOptions(GetOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            query.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            query.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberUid)) {
            query.put("MemberUid", request.memberUid);
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
            new TeaPair("action", "GetOrders"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the order list of a user or a reseller customer. By default, this operation queries orders created within the most recent hour. To query orders over a longer time range, set the CreateTimeStart and CreateTimeEnd parameters.</p>
     * 
     * @param request GetOrdersRequest
     * @return GetOrdersResponse
     */
    public GetOrdersResponse getOrders(GetOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划及可抵扣商品信息</p>
     * 
     * @param tmpReq GetSavingPlanDeductableCommodityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavingPlanDeductableCommodityResponse
     */
    public GetSavingPlanDeductableCommodityResponse getSavingPlanDeductableCommodityWithOptions(GetSavingPlanDeductableCommodityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSavingPlanDeductableCommodityShrinkRequest request = new GetSavingPlanDeductableCommodityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavingPlanDeductableCommodity"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavingPlanDeductableCommodityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划及可抵扣商品信息</p>
     * 
     * @param request GetSavingPlanDeductableCommodityRequest
     * @return GetSavingPlanDeductableCommodityResponse
     */
    public GetSavingPlanDeductableCommodityResponse getSavingPlanDeductableCommodity(GetSavingPlanDeductableCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSavingPlanDeductableCommodityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划实例共享账号信息</p>
     * 
     * @param tmpReq GetSavingPlanShareAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavingPlanShareAccountsResponse
     */
    public GetSavingPlanShareAccountsResponse getSavingPlanShareAccountsWithOptions(GetSavingPlanShareAccountsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSavingPlanShareAccountsShrinkRequest request = new GetSavingPlanShareAccountsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spnInstanceCode)) {
            query.put("SpnInstanceCode", request.spnInstanceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavingPlanShareAccounts"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavingPlanShareAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划实例共享账号信息</p>
     * 
     * @param request GetSavingPlanShareAccountsRequest
     * @return GetSavingPlanShareAccountsResponse
     */
    public GetSavingPlanShareAccountsResponse getSavingPlanShareAccounts(GetSavingPlanShareAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSavingPlanShareAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划实例客户自定义规则</p>
     * 
     * @param tmpReq GetSavingPlanUserDeductRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSavingPlanUserDeductRuleResponse
     */
    public GetSavingPlanUserDeductRuleResponse getSavingPlanUserDeductRuleWithOptions(GetSavingPlanUserDeductRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetSavingPlanUserDeductRuleShrinkRequest request = new GetSavingPlanUserDeductRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spnInstanceCode)) {
            query.put("SpnInstanceCode", request.spnInstanceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSavingPlanUserDeductRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSavingPlanUserDeductRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取节省计划实例客户自定义规则</p>
     * 
     * @param request GetSavingPlanUserDeductRuleRequest
     * @return GetSavingPlanUserDeductRuleResponse
     */
    public GetSavingPlanUserDeductRuleResponse getSavingPlanUserDeductRule(GetSavingPlanUserDeductRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSavingPlanUserDeductRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询优惠券设置的抵扣标签</p>
     * 
     * @param tmpReq ListCouponDeductTagRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCouponDeductTagResponse
     */
    public ListCouponDeductTagResponse listCouponDeductTagWithOptions(ListCouponDeductTagRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCouponDeductTagShrinkRequest request = new ListCouponDeductTagShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.couponId)) {
            query.put("CouponId", request.couponId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCouponDeductTag"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCouponDeductTagResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询优惠券设置的抵扣标签</p>
     * 
     * @param request ListCouponDeductTagRequest
     * @return ListCouponDeductTagResponse
     */
    public ListCouponDeductTagResponse listCouponDeductTag(ListCouponDeductTagRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCouponDeductTagWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query fund account list</p>
     * 
     * @param request ListFundAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFundAccountResponse
     */
    public ListFundAccountResponse listFundAccountWithOptions(ListFundAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryOnlyInUse)) {
            body.put("QueryOnlyInUse", request.queryOnlyInUse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryOnlyManage)) {
            body.put("QueryOnlyManage", request.queryOnlyManage);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFundAccount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFundAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query fund account list</p>
     * 
     * @param request ListFundAccountRequest
     * @return ListFundAccountResponse
     */
    public ListFundAccountResponse listFundAccount(ListFundAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFundAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query payment relationships of an account</p>
     * 
     * @param request ListFundAccountPayRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFundAccountPayRelationResponse
     */
    public ListFundAccountPayRelationResponse listFundAccountPayRelationWithOptions(ListFundAccountPayRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFundAccountPayRelation"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFundAccountPayRelationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query payment relationships of an account</p>
     * 
     * @param request ListFundAccountPayRelationRequest
     * @return ListFundAccountPayRelationResponse
     */
    public ListFundAccountPayRelationResponse listFundAccountPayRelation(ListFundAccountPayRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFundAccountPayRelationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query invoice candidate data, which can be used for invoicing.</p>
     * 
     * @param tmpReq ListInvoiceCandidateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInvoiceCandidateResponse
     */
    public ListInvoiceCandidateResponse listInvoiceCandidateWithOptions(ListInvoiceCandidateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListInvoiceCandidateShrinkRequest request = new ListInvoiceCandidateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.billingCycles)) {
            request.billingCyclesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.billingCycles, "BillingCycles", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.businessIds)) {
            request.businessIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.businessIds, "BusinessIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.invoiceIssuers)) {
            request.invoiceIssuersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.invoiceIssuers, "InvoiceIssuers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "Status", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.types)) {
            request.typesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.types, "Types", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingCyclesShrink)) {
            query.put("BillingCycles", request.billingCyclesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessIdsShrink)) {
            query.put("BusinessIds", request.businessIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceIssuersShrink)) {
            query.put("InvoiceIssuers", request.invoiceIssuersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("Status", request.statusShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typesShrink)) {
            query.put("Types", request.typesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvoiceCandidate"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvoiceCandidateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query invoice candidate data, which can be used for invoicing.</p>
     * 
     * @param request ListInvoiceCandidateRequest
     * @return ListInvoiceCandidateResponse
     */
    public ListInvoiceCandidateResponse listInvoiceCandidate(ListInvoiceCandidateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInvoiceCandidateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of available invoice titles</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInvoiceTitleResponse
     */
    public ListInvoiceTitleResponse listInvoiceTitleWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvoiceTitle"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvoiceTitleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of available invoice titles</p>
     * @return ListInvoiceTitleResponse
     */
    public ListInvoiceTitleResponse listInvoiceTitle() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInvoiceTitleWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of subscribed reports.</p>
     * 
     * @param request ListReportDefinitionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReportDefinitionsResponse
     */
    public ListReportDefinitionsResponse listReportDefinitionsWithOptions(ListReportDefinitionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReportDefinitions"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReportDefinitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of subscribed reports.</p>
     * 
     * @param request ListReportDefinitionsRequest
     * @return ListReportDefinitionsResponse
     */
    public ListReportDefinitionsResponse listReportDefinitions(ListReportDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReportDefinitionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies one or more cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify cost centers</p>
     * 
     * @param tmpReq ModifyCostCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCostCenterResponse
     */
    public ModifyCostCenterResponse modifyCostCenterWithOptions(ModifyCostCenterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCostCenterShrinkRequest request = new ModifyCostCenterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.costCenterEntityList)) {
            request.costCenterEntityListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.costCenterEntityList, "CostCenterEntityList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterEntityListShrink)) {
            query.put("CostCenterEntityList", request.costCenterEntityListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCostCenter"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCostCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies one or more cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Modify cost centers</p>
     * 
     * @param request ModifyCostCenterRequest
     * @return ModifyCostCenterResponse
     */
    public ModifyCostCenterResponse modifyCostCenter(ModifyCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modify one or more financial units</p>
     * 
     * <b>summary</b> : 
     * <p>Modify financial unit rules</p>
     * 
     * @param tmpReq ModifyCostCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCostCenterRuleResponse
     */
    public ModifyCostCenterRuleResponse modifyCostCenterRuleWithOptions(ModifyCostCenterRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyCostCenterRuleShrinkRequest request = new ModifyCostCenterRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterExpression)) {
            request.filterExpressionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterExpression, "FilterExpression", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterExpressionShrink)) {
            query.put("FilterExpression", request.filterExpressionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            body.put("CostCenterId", request.costCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            body.put("OwnerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCostCenterRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCostCenterRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modify one or more financial units</p>
     * 
     * <b>summary</b> : 
     * <p>Modify financial unit rules</p>
     * 
     * @param request ModifyCostCenterRuleRequest
     * @return ModifyCostCenterRuleResponse
     */
    public ModifyCostCenterRuleResponse modifyCostCenterRule(ModifyCostCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostCenterRuleWithOptions(request, runtime);
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
            new TeaPair("version", "2023-09-30"),
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
     * <b>description</b> :
     * <p>Query cost center expense overview results for a specified billing period</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center expense overview</p>
     * 
     * @param request QueryCostByCostCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostByCostCenterResponse
     */
    public QueryCostByCostCenterResponse queryCostByCostCenterWithOptions(QueryCostByCostCenterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.billingMonth)) {
            query.put("BillingMonth", request.billingMonth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayZeroAmountBills)) {
            query.put("DisplayZeroAmountBills", request.displayZeroAmountBills);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupByCostCenterLevel)) {
            query.put("GroupByCostCenterLevel", request.groupByCostCenterLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            query.put("OwnerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostByCostCenter"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostByCostCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query cost center expense overview results for a specified billing period</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center expense overview</p>
     * 
     * @param request QueryCostByCostCenterRequest
     * @return QueryCostByCostCenterResponse
     */
    public QueryCostByCostCenterResponse queryCostByCostCenter(QueryCostByCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostByCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries a parent financial unit and its child financial units.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries financial units.</p>
     * 
     * @param tmpReq QueryCostCenterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostCenterResponse
     */
    public QueryCostCenterResponse queryCostCenterWithOptions(QueryCostCenterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCostCenterShrinkRequest request = new QueryCostCenterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            query.put("OwnerAccountId", request.ownerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCostCenterId)) {
            query.put("ParentCostCenterId", request.parentCostCenterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostCenter"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostCenterResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries a parent financial unit and its child financial units.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries financial units.</p>
     * 
     * @param request QueryCostCenterRequest
     * @return QueryCostCenterResponse
     */
    public QueryCostCenterResponse queryCostCenter(QueryCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource instances that belong to a cost center of the user. When CostCenterId is 0, it queries unallocated primary and sub-resource instances.</p>
     * 
     * @param request QueryCostCenterResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostCenterResourceResponse
     */
    public QueryCostCenterResourceResponse queryCostCenterResourceWithOptions(QueryCostCenterResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            body.put("CostCenterId", request.costCenterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            body.put("OwnerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostCenterResource"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostCenterResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource instances that belong to a cost center of the user. When CostCenterId is 0, it queries unallocated primary and sub-resource instances.</p>
     * 
     * @param request QueryCostCenterResourceRequest
     * @return QueryCostCenterResourceResponse
     */
    public QueryCostCenterResourceResponse queryCostCenterResource(QueryCostCenterResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostCenterResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query parent cost center and its child cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center rules</p>
     * 
     * @param request QueryCostCenterRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostCenterRuleResponse
     */
    public QueryCostCenterRuleResponse queryCostCenterRuleWithOptions(QueryCostCenterRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.costCenterId)) {
            body.put("CostCenterId", request.costCenterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostCenterRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostCenterRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query parent cost center and its child cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center rules</p>
     * 
     * @param request QueryCostCenterRuleRequest
     * @return QueryCostCenterRuleResponse
     */
    public QueryCostCenterRuleResponse queryCostCenterRule(QueryCostCenterRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostCenterRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the sharing rules of user cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center sharing rules</p>
     * 
     * @param request QueryCostCenterShareRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCostCenterShareRuleResponse
     */
    public QueryCostCenterShareRuleResponse queryCostCenterShareRuleWithOptions(QueryCostCenterShareRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            query.put("OwnerAccountId", request.ownerAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostCenterShareRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostCenterShareRuleResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the sharing rules of user cost centers.</p>
     * 
     * <b>summary</b> : 
     * <p>Query cost center sharing rules</p>
     * 
     * @param request QueryCostCenterShareRuleRequest
     * @return QueryCostCenterShareRuleResponse
     */
    public QueryCostCenterShareRuleResponse queryCostCenterShareRule(QueryCostCenterShareRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostCenterShareRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the SLA compensation details list of a user. Only data from the last two months is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SLA compensation list of a user.</p>
     * 
     * @param request QueryMonthlySlaListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMonthlySlaListResponse
     */
    public QueryMonthlySlaListResponse queryMonthlySlaListWithOptions(QueryMonthlySlaListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            body.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            body.put("Months", request.months);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payStatuses)) {
            body.put("PayStatuses", request.payStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productCodes)) {
            body.put("ProductCodes", request.productCodes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonthlySlaList"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonthlySlaListResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the SLA compensation details list of a user. Only data from the last two months is available.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the SLA compensation list of a user.</p>
     * 
     * @param request QueryMonthlySlaListRequest
     * @return QueryMonthlySlaListResponse
     */
    public QueryMonthlySlaListResponse queryMonthlySlaList(QueryMonthlySlaListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthlySlaListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cost center sharing rules, including creating, modifying, and deleting sharing rules.</p>
     * 
     * @param tmpReq SaveCostCenterShareRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveCostCenterShareRuleResponse
     */
    public SaveCostCenterShareRuleResponse saveCostCenterShareRuleWithOptions(SaveCostCenterShareRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SaveCostCenterShareRuleShrinkRequest request = new SaveCostCenterShareRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.createShareRuleList)) {
            request.createShareRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.createShareRuleList, "CreateShareRuleList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modifyShareRuleList)) {
            request.modifyShareRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modifyShareRuleList, "ModifyShareRuleList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.removeShareRuleList)) {
            request.removeShareRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.removeShareRuleList, "RemoveShareRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createShareRuleListShrink)) {
            query.put("CreateShareRuleList", request.createShareRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyShareRuleListShrink)) {
            query.put("ModifyShareRuleList", request.modifyShareRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccountId)) {
            query.put("OwnerAccountId", request.ownerAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeShareRuleListShrink)) {
            query.put("RemoveShareRuleList", request.removeShareRuleListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveCostCenterShareRule"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveCostCenterShareRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies cost center sharing rules, including creating, modifying, and deleting sharing rules.</p>
     * 
     * @param request SaveCostCenterShareRuleRequest
     * @return SaveCostCenterShareRuleResponse
     */
    public SaveCostCenterShareRuleResponse saveCostCenterShareRule(SaveCostCenterShareRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveCostCenterShareRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set the credit control limit for a fund account</p>
     * 
     * @param request SetFundAccountCreditAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetFundAccountCreditAmountResponse
     */
    public SetFundAccountCreditAmountResponse setFundAccountCreditAmountWithOptions(SetFundAccountCreditAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creditAmount)) {
            body.put("CreditAmount", request.creditAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currency)) {
            body.put("Currency", request.currency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFundAccountCreditAmount"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFundAccountCreditAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Set the credit control limit for a fund account</p>
     * 
     * @param request SetFundAccountCreditAmountRequest
     * @return SetFundAccountCreditAmountResponse
     */
    public SetFundAccountCreditAmountResponse setFundAccountCreditAmount(SetFundAccountCreditAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setFundAccountCreditAmountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set Fund Account Low Balance Alert</p>
     * 
     * @param request SetFundAccountLowAvailableAmountAlarmRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetFundAccountLowAvailableAmountAlarmResponse
     */
    public SetFundAccountLowAvailableAmountAlarmResponse setFundAccountLowAvailableAmountAlarmWithOptions(SetFundAccountLowAvailableAmountAlarmRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fundAccountId)) {
            body.put("FundAccountId", request.fundAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdAmount)) {
            body.put("ThresholdAmount", request.thresholdAmount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetFundAccountLowAvailableAmountAlarm"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetFundAccountLowAvailableAmountAlarmResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Set Fund Account Low Balance Alert</p>
     * 
     * @param request SetFundAccountLowAvailableAmountAlarmRequest
     * @return SetFundAccountLowAvailableAmountAlarmResponse
     */
    public SetFundAccountLowAvailableAmountAlarmResponse setFundAccountLowAvailableAmountAlarm(SetFundAccountLowAvailableAmountAlarmRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setFundAccountLowAvailableAmountAlarmWithOptions(request, runtime);
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
            new TeaPair("version", "2023-09-30"),
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
     * <ol>
     * <li>Call QueryMonthlySlaList to obtain the claimable months and records.</li>
     * <li>Claim by month or by record.
     * Note: Only compensation for the last two months can be claimed. Historical compensation has been automatically issued.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>User claims coupons for the last two months.</p>
     * 
     * @param request SubmitSlaCouponApplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSlaCouponApplyResponse
     */
    public SubmitSlaCouponApplyResponse submitSlaCouponApplyWithOptions(SubmitSlaCouponApplyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIds)) {
            query.put("EcIdAccountIds", request.ecIdAccountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.damagedIds)) {
            body.put("DamagedIds", request.damagedIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.month)) {
            body.put("Month", request.month);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSlaCouponApply"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSlaCouponApplyResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>Call QueryMonthlySlaList to obtain the claimable months and records.</li>
     * <li>Claim by month or by record.
     * Note: Only compensation for the last two months can be claimed. Historical compensation has been automatically issued.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>User claims coupons for the last two months.</p>
     * 
     * @param request SubmitSlaCouponApplyRequest
     * @return SubmitSlaCouponApplyResponse
     */
    public SubmitSlaCouponApplyResponse submitSlaCouponApply(SubmitSlaCouponApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSlaCouponApplyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a budget.</p>
     * 
     * @param tmpReq UpdateBudgetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBudgetResponse
     */
    public UpdateBudgetResponse updateBudgetWithOptions(UpdateBudgetRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateBudgetShrinkRequest request = new UpdateBudgetShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cycleQuota)) {
            request.cycleQuotaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cycleQuota, "CycleQuota", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queryFilter)) {
            request.queryFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queryFilter, "QueryFilter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.warnConfs)) {
            request.warnConfsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.warnConfs, "WarnConfs", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ecIdAccountIdsShrink)) {
            query.put("EcIdAccountIds", request.ecIdAccountIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.budgetName)) {
            body.put("BudgetName", request.budgetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.budgetType)) {
            body.put("BudgetType", request.budgetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleEndPeriod)) {
            body.put("CycleEndPeriod", request.cycleEndPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleQuotaShrink)) {
            body.put("CycleQuota", request.cycleQuotaShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleStartPeriod)) {
            body.put("CycleStartPeriod", request.cycleStartPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cycleType)) {
            body.put("CycleType", request.cycleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.originalBudgetName)) {
            body.put("OriginalBudgetName", request.originalBudgetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryFilterShrink)) {
            body.put("QueryFilter", request.queryFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quota)) {
            body.put("Quota", request.quota);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaType)) {
            body.put("QuotaType", request.quotaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.warnConfsShrink)) {
            body.put("WarnConfs", request.warnConfsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBudget"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBudgetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a budget.</p>
     * 
     * @param request UpdateBudgetRequest
     * @return UpdateBudgetResponse
     */
    public UpdateBudgetResponse updateBudget(UpdateBudgetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBudgetWithOptions(request, runtime);
    }
}
