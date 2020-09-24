// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214;

import com.aliyun.tea.*;
import com.aliyun.bssopenapi20171214.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "business.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "business.ap-southeast-1.aliyuncs.com"),
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
            new TeaPair("cn-hangzhou", "business.aliyuncs.com"),
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
            new TeaPair("cn-north-2-gov-1", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao", "business.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "business.aliyuncs.com"),
            new TeaPair("cn-shanghai", "business.aliyuncs.com"),
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
            new TeaPair("cn-yushanfang", "business.aliyuncs.com"),
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


    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetailsWithOptions(QueryAccountTransactionDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountTransactionDetails", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountTransactionDetailsResponse());
    }

    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTransactionDetailsWithOptions(request, runtime);
    }

    public QuerySettleBillResponse querySettleBillWithOptions(QuerySettleBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySettleBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QuerySettleBillResponse());
    }

    public QuerySettleBillResponse querySettleBill(QuerySettleBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySettleBillWithOptions(request, runtime);
    }

    public QuerySplitItemBillResponse querySplitItemBillWithOptions(QuerySplitItemBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySplitItemBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QuerySplitItemBillResponse());
    }

    public QuerySplitItemBillResponse querySplitItemBill(QuerySplitItemBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySplitItemBillWithOptions(request, runtime);
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetailWithOptions(QueryRIUtilizationDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRIUtilizationDetail", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryRIUtilizationDetailResponse());
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRIUtilizationDetailWithOptions(request, runtime);
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionWithOptions(QueryBillToOSSSubscriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBillToOSSSubscription", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryBillToOSSSubscriptionResponse());
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription(QueryBillToOSSSubscriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillToOSSSubscriptionWithOptions(request, runtime);
    }

    public QueryAccountBillResponse queryAccountBillWithOptions(QueryAccountBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountBillResponse());
    }

    public QueryAccountBillResponse queryAccountBill(QueryAccountBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBillWithOptions(request, runtime);
    }

    public CreateCostUnitResponse createCostUnitWithOptions(CreateCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCostUnit", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateCostUnitResponse());
    }

    public CreateCostUnitResponse createCostUnit(CreateCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCostUnitWithOptions(request, runtime);
    }

    public ModifyCostUnitResponse modifyCostUnitWithOptions(ModifyCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyCostUnit", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new ModifyCostUnitResponse());
    }

    public ModifyCostUnitResponse modifyCostUnit(ModifyCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCostUnitWithOptions(request, runtime);
    }

    public QueryCostUnitResponse queryCostUnitWithOptions(QueryCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCostUnit", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryCostUnitResponse());
    }

    public QueryCostUnitResponse queryCostUnit(QueryCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitWithOptions(request, runtime);
    }

    public DeleteCostUnitResponse deleteCostUnitWithOptions(DeleteCostUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteCostUnit", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new DeleteCostUnitResponse());
    }

    public DeleteCostUnitResponse deleteCostUnit(DeleteCostUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCostUnitWithOptions(request, runtime);
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResourceWithOptions(AllocateCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AllocateCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new AllocateCostUnitResourceResponse());
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResource(AllocateCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateCostUnitResourceWithOptions(request, runtime);
    }

    public QueryCostUnitResourceResponse queryCostUnitResourceWithOptions(QueryCostUnitResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCostUnitResource", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryCostUnitResourceResponse());
    }

    public QueryCostUnitResourceResponse queryCostUnitResource(QueryCostUnitResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCostUnitResourceWithOptions(request, runtime);
    }

    public RenewResourcePackageResponse renewResourcePackageWithOptions(RenewResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new RenewResourcePackageResponse());
    }

    public RenewResourcePackageResponse renewResourcePackage(RenewResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewResourcePackageWithOptions(request, runtime);
    }

    public UpgradeResourcePackageResponse upgradeResourcePackageWithOptions(UpgradeResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeResourcePackageResponse());
    }

    public UpgradeResourcePackageResponse upgradeResourcePackage(UpgradeResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeResourcePackageWithOptions(request, runtime);
    }

    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAgAccount", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateAgAccountResponse());
    }

    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfoWithOptions(GetCustomerAccountInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerAccountInfo", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetCustomerAccountInfoResponse());
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfo(GetCustomerAccountInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerAccountInfoWithOptions(request, runtime);
    }

    public GetCustomerListResponse getCustomerListWithOptions(GetCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetCustomerList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList(GetCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomerListWithOptions(request, runtime);
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmountWithOptions(ChangeResellerConsumeAmountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeResellerConsumeAmount", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new ChangeResellerConsumeAmountResponse());
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResellerConsumeAmountWithOptions(request, runtime);
    }

    public SetResellerUserStatusResponse setResellerUserStatusWithOptions(SetResellerUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserStatus", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new SetResellerUserStatusResponse());
    }

    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserStatusWithOptions(request, runtime);
    }

    public CreateResellerUserQuotaResponse createResellerUserQuotaWithOptions(CreateResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateResellerUserQuotaResponse());
    }

    public CreateResellerUserQuotaResponse createResellerUserQuota(CreateResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResellerUserQuotaWithOptions(request, runtime);
    }

    public SetResellerUserQuotaResponse setResellerUserQuotaWithOptions(SetResellerUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserQuota", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new SetResellerUserQuotaResponse());
    }

    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserQuotaWithOptions(request, runtime);
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuotaWithOptions(QueryResellerAvailableQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryResellerAvailableQuota", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryResellerAvailableQuotaResponse());
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResellerAvailableQuotaWithOptions(request, runtime);
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdWithOptions(SetResellerUserAlarmThresholdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetResellerUserAlarmThreshold", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new SetResellerUserAlarmThresholdResponse());
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    public QueryAccountTransactionsResponse queryAccountTransactionsWithOptions(QueryAccountTransactionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountTransactions", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountTransactionsResponse());
    }

    public QueryAccountTransactionsResponse queryAccountTransactions(QueryAccountTransactionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountTransactionsWithOptions(request, runtime);
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSSWithOptions(UnsubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnsubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new UnsubscribeBillToOSSResponse());
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unsubscribeBillToOSSWithOptions(request, runtime);
    }

    public SubscribeBillToOSSResponse subscribeBillToOSSWithOptions(SubscribeBillToOSSRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubscribeBillToOSS", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new SubscribeBillToOSSResponse());
    }

    public SubscribeBillToOSSResponse subscribeBillToOSS(SubscribeBillToOSSRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.subscribeBillToOSSWithOptions(request, runtime);
    }

    public QueryUserOmsDataResponse queryUserOmsDataWithOptions(QueryUserOmsDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryUserOmsData", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryUserOmsDataResponse());
    }

    public QueryUserOmsDataResponse queryUserOmsData(QueryUserOmsDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryUserOmsDataWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOrder", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public ApplyInvoiceResponse applyInvoiceWithOptions(ApplyInvoiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ApplyInvoice", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new ApplyInvoiceResponse());
    }

    public ApplyInvoiceResponse applyInvoice(ApplyInvoiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyInvoiceWithOptions(request, runtime);
    }

    public QueryCustomerAddressListResponse queryCustomerAddressListWithOptions(QueryCustomerAddressListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCustomerAddressList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryCustomerAddressListResponse());
    }

    public QueryCustomerAddressListResponse queryCustomerAddressList(QueryCustomerAddressListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCustomerAddressListWithOptions(request, runtime);
    }

    public QueryEvaluateListResponse queryEvaluateListWithOptions(QueryEvaluateListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEvaluateList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryEvaluateListResponse());
    }

    public QueryEvaluateListResponse queryEvaluateList(QueryEvaluateListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEvaluateListWithOptions(request, runtime);
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerListWithOptions(QueryInvoicingCustomerListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInvoicingCustomerList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryInvoicingCustomerListResponse());
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInvoicingCustomerListWithOptions(request, runtime);
    }

    public QueryBillOverviewResponse queryBillOverviewWithOptions(QueryBillOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBillOverview", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryBillOverviewResponse());
    }

    public QueryBillOverviewResponse queryBillOverview(QueryBillOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillOverviewWithOptions(request, runtime);
    }

    public QueryBillResponse queryBillWithOptions(QueryBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryBillResponse());
    }

    public QueryBillResponse queryBill(QueryBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBillWithOptions(request, runtime);
    }

    public QueryInstanceBillResponse queryInstanceBillWithOptions(QueryInstanceBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInstanceBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryInstanceBillResponse());
    }

    public QueryInstanceBillResponse queryInstanceBill(QueryInstanceBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceBillWithOptions(request, runtime);
    }

    public EnableBillGenerationResponse enableBillGenerationWithOptions(EnableBillGenerationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableBillGeneration", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new EnableBillGenerationResponse());
    }

    public EnableBillGenerationResponse enableBillGeneration(EnableBillGenerationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBillGenerationWithOptions(request, runtime);
    }

    public QueryRedeemResponse queryRedeemWithOptions(QueryRedeemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryRedeem", "HTTPS", "GET", "2017-12-14", "AK", TeaModel.buildMap(request), null, runtime), new QueryRedeemResponse());
    }

    public QueryRedeemResponse queryRedeem(QueryRedeemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryRedeemWithOptions(request, runtime);
    }

    public ConvertChargeTypeResponse convertChargeTypeWithOptions(ConvertChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ConvertChargeType", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new ConvertChargeTypeResponse());
    }

    public ConvertChargeTypeResponse convertChargeType(ConvertChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.convertChargeTypeWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstance", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyInstance", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    public DescribePricingModuleResponse describePricingModuleWithOptions(DescribePricingModuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePricingModule", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribePricingModuleResponse());
    }

    public DescribePricingModuleResponse describePricingModule(DescribePricingModuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePricingModuleWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductList", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCostWithOptions(QueryInstanceGaapCostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryInstanceGaapCost", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryInstanceGaapCostResponse());
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCost(QueryInstanceGaapCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceGaapCostWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RenewInstance", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public GetOrderDetailResponse getOrderDetailWithOptions(GetOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetOrderDetail", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetOrderDetailResponse());
    }

    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderDetailWithOptions(request, runtime);
    }

    public QueryOrdersResponse queryOrdersWithOptions(QueryOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOrders", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryOrdersResponse());
    }

    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrdersWithOptions(request, runtime);
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionWithOptions(QueryMonthlyInstanceConsumptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthlyInstanceConsumption", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryMonthlyInstanceConsumptionResponse());
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthlyInstanceConsumptionWithOptions(request, runtime);
    }

    public QuerySettlementBillResponse querySettlementBillWithOptions(QuerySettlementBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySettlementBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QuerySettlementBillResponse());
    }

    public QuerySettlementBillResponse querySettlementBill(QuerySettlementBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySettlementBillWithOptions(request, runtime);
    }

    public QueryMonthlyBillResponse queryMonthlyBillWithOptions(QueryMonthlyBillRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMonthlyBill", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryMonthlyBillResponse());
    }

    public QueryMonthlyBillResponse queryMonthlyBill(QueryMonthlyBillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMonthlyBillWithOptions(request, runtime);
    }

    public SetRenewalResponse setRenewalWithOptions(SetRenewalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetRenewal", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new SetRenewalResponse());
    }

    public SetRenewalResponse setRenewal(SetRenewalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRenewalWithOptions(request, runtime);
    }

    public QueryAvailableInstancesResponse queryAvailableInstancesWithOptions(QueryAvailableInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAvailableInstances", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAvailableInstancesResponse());
    }

    public QueryAvailableInstancesResponse queryAvailableInstances(QueryAvailableInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAvailableInstancesWithOptions(request, runtime);
    }

    public CreateResourcePackageResponse createResourcePackageWithOptions(CreateResourcePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateResourcePackage", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new CreateResourcePackageResponse());
    }

    public CreateResourcePackageResponse createResourcePackage(CreateResourcePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourcePackageWithOptions(request, runtime);
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstancesWithOptions(QueryResourcePackageInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryResourcePackageInstances", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryResourcePackageInstancesResponse());
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryResourcePackageInstancesWithOptions(request, runtime);
    }

    public GetResourcePackagePriceResponse getResourcePackagePriceWithOptions(GetResourcePackagePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetResourcePackagePrice", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetResourcePackagePriceResponse());
    }

    public GetResourcePackagePriceResponse getResourcePackagePrice(GetResourcePackagePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePackagePriceWithOptions(request, runtime);
    }

    public GetSubscriptionPriceResponse getSubscriptionPriceWithOptions(GetSubscriptionPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSubscriptionPrice", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetSubscriptionPriceResponse());
    }

    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubscriptionPriceWithOptions(request, runtime);
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPriceWithOptions(GetPayAsYouGoPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPayAsYouGoPrice", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new GetPayAsYouGoPriceResponse());
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPayAsYouGoPriceWithOptions(request, runtime);
    }

    public QueryPrepaidCardsResponse queryPrepaidCardsWithOptions(QueryPrepaidCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPrepaidCards", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryPrepaidCardsResponse());
    }

    public QueryPrepaidCardsResponse queryPrepaidCards(QueryPrepaidCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryPrepaidCardsWithOptions(request, runtime);
    }

    public QueryCashCouponsResponse queryCashCouponsWithOptions(QueryCashCouponsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCashCoupons", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryCashCouponsResponse());
    }

    public QueryCashCouponsResponse queryCashCoupons(QueryCashCouponsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCashCouponsWithOptions(request, runtime);
    }

    public QueryAccountBalanceResponse queryAccountBalanceWithOptions(QueryAccountBalanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAccountBalance", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new QueryAccountBalanceResponse());
    }

    public QueryAccountBalanceResponse queryAccountBalance(QueryAccountBalanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryAccountBalanceWithOptions(request, runtime);
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProductWithOptions(DescribeResourcePackageProductRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeResourcePackageProduct", "HTTPS", "POST", "2017-12-14", "AK", null, TeaModel.buildMap(request), runtime), new DescribeResourcePackageProductResponse());
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProduct(DescribeResourcePackageProductRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourcePackageProductWithOptions(request, runtime);
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
}
