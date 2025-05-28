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
     * <p>取消资金账户低额预警</p>
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
     * <b>summary</b> : 
     * <p>取消资金账户低额预警</p>
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
     * <p>创建财务单元</p>
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
     * <b>summary</b> : 
     * <p>创建财务单元</p>
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
     * <p>创建资金账户付款关系</p>
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
     * <p>创建资金账户付款关系</p>
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
     * <p>创建资金账户划拨/回收</p>
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
     * <p>创建资金账户划拨/回收</p>
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
     * <p>创建账单订阅</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.nbid)) {
            query.put("Nbid", request.nbid);
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
     * <b>summary</b> : 
     * <p>创建账单订阅</p>
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
     * <p>删除财务单元</p>
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
     * <b>summary</b> : 
     * <p>删除财务单元</p>
     * 
     * @param request DeleteCostCenterRequest
     * @return DeleteCostCenterResponse
     */
    public DeleteCostCenterResponse deleteCostCenter(DeleteCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostCenterWithOptions(request, runtime);
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
     * <p>取消账单订阅</p>
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
     * <p>取消账单订阅</p>
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
     * <p>查询优惠券列表</p>
     * 
     * @param tmpReq DescribeCouponRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCouponResponse
     */
    public DescribeCouponResponse describeCouponWithOptions(DescribeCouponRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeCouponShrinkRequest request = new DescribeCouponShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ecIdAccountIds)) {
            request.ecIdAccountIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ecIdAccountIds, "EcIdAccountIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCoupon"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCouponResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询优惠券列表</p>
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
     * <p>查询优惠券可用商品列表</p>
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

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCouponItemList"),
            new TeaPair("version", "2023-09-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCouponItemListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询优惠券可用商品列表</p>
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
     * <p>查询资金账户可用金</p>
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
     * <p>查询资金账户可用金</p>
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
     * <p>查询资金账户可分配信控额度</p>
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
     * <p>查询资金账户可分配信控额度</p>
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
     * <p>查询资金账户可回收金额</p>
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
     * <p>查询资金账户可回收金额</p>
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
     * <p>查询资金账户的可转出金额</p>
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
     * <p>查询资金账户的可转出金额</p>
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
     * <p>查询资金账户可提现金额</p>
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
     * <p>查询资金账户可提现金额</p>
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
     * <p>查询资金账户低额预警</p>
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
     * <p>查询资金账户低额预警</p>
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
     * <p>查询资金账户收支明细</p>
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
     * <p>查询资金账户收支明细</p>
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
     * <p>查询资金账户列表</p>
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
     * <p>查询资金账户列表</p>
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
     * <p>查询资金账户的付款关系</p>
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
     * <p>查询资金账户的付款关系</p>
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
     * <p>查看已订阅的报告列表</p>
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
     * <p>查看已订阅的报告列表</p>
     * 
     * @param request ListReportDefinitionsRequest
     * @return ListReportDefinitionsResponse
     */
    public ListReportDefinitionsResponse listReportDefinitions(ListReportDefinitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReportDefinitionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改财务单元</p>
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
     * <b>summary</b> : 
     * <p>修改财务单元</p>
     * 
     * @param request ModifyCostCenterRequest
     * @return ModifyCostCenterResponse
     */
    public ModifyCostCenterResponse modifyCostCenter(ModifyCostCenterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostCenterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询财务单元</p>
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
     * <b>summary</b> : 
     * <p>查询财务单元</p>
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
     * <p>查询财务单元下资源信息</p>
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
     * <p>查询财务单元下资源信息</p>
     * 
     * @param request QueryCostCenterResourceRequest
     * @return QueryCostCenterResourceResponse
     */
    public QueryCostCenterResourceResponse queryCostCenterResource(QueryCostCenterResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostCenterResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置资金账户的信控限额</p>
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
     * <p>设置资金账户的信控限额</p>
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
     * <p>设置资金账户低额预警</p>
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
     * <p>设置资金账户低额预警</p>
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
}
