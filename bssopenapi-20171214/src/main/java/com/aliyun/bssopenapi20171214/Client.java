// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20171214;

import com.aliyun.tea.*;
import com.aliyun.bssopenapi20171214.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public AddAccountRelationResponse addAccountRelationWithOptions(AddAccountRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddAccountRelation", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new AddAccountRelationResponse());
    }

    public AddAccountRelationResponse addAccountRelation(AddAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccountRelationWithOptions(request, runtime);
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResourceWithOptions(AllocateCostUnitResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AllocateCostUnitResource", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new AllocateCostUnitResourceResponse());
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResource(AllocateCostUnitResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateCostUnitResourceWithOptions(request, runtime);
    }

    public ApplyInvoiceResponse applyInvoiceWithOptions(ApplyInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyInvoice", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyInvoiceResponse());
    }

    public ApplyInvoiceResponse applyInvoice(ApplyInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyInvoiceWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CancelOrder", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmountWithOptions(ChangeResellerConsumeAmountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ChangeResellerConsumeAmount", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ChangeResellerConsumeAmountResponse());
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeResellerConsumeAmountWithOptions(request, runtime);
    }

    public ConfirmRelationResponse confirmRelationWithOptions(ConfirmRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmRelation", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmRelationResponse());
    }

    public ConfirmRelationResponse confirmRelation(ConfirmRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmRelationWithOptions(request, runtime);
    }

    public ConvertChargeTypeResponse convertChargeTypeWithOptions(ConvertChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConvertChargeType", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ConvertChargeTypeResponse());
    }

    public ConvertChargeTypeResponse convertChargeType(ConvertChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertChargeTypeWithOptions(request, runtime);
    }

    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAgAccount", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAgAccountResponse());
    }

    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    public CreateCostUnitResponse createCostUnitWithOptions(CreateCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCostUnit", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCostUnitResponse());
    }

    public CreateCostUnitResponse createCostUnit(CreateCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCostUnitWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateInstance", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateResellerUserQuotaResponse createResellerUserQuotaWithOptions(CreateResellerUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResellerUserQuota", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResellerUserQuotaResponse());
    }

    public CreateResellerUserQuotaResponse createResellerUserQuota(CreateResellerUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResellerUserQuotaWithOptions(request, runtime);
    }

    public CreateResourcePackageResponse createResourcePackageWithOptions(CreateResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateResourcePackage", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new CreateResourcePackageResponse());
    }

    public CreateResourcePackageResponse createResourcePackage(CreateResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourcePackageWithOptions(request, runtime);
    }

    public DeleteCostUnitResponse deleteCostUnitWithOptions(DeleteCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCostUnit", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCostUnitResponse());
    }

    public DeleteCostUnitResponse deleteCostUnit(DeleteCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCostUnitWithOptions(request, runtime);
    }

    public DescribeInstanceBillResponse describeInstanceBillWithOptions(DescribeInstanceBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstanceBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceBillResponse());
    }

    public DescribeInstanceBillResponse describeInstanceBill(DescribeInstanceBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceBillWithOptions(request, runtime);
    }

    public DescribePricingModuleResponse describePricingModuleWithOptions(DescribePricingModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePricingModule", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePricingModuleResponse());
    }

    public DescribePricingModuleResponse describePricingModule(DescribePricingModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePricingModuleWithOptions(request, runtime);
    }

    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetailWithOptions(DescribeResourceCoverageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceCoverageDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceCoverageDetailResponse());
    }

    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceCoverageDetailWithOptions(request, runtime);
    }

    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotalWithOptions(DescribeResourceCoverageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceCoverageTotal", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceCoverageTotalResponse());
    }

    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceCoverageTotalWithOptions(request, runtime);
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProductWithOptions(DescribeResourcePackageProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourcePackageProduct", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourcePackageProductResponse());
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProduct(DescribeResourcePackageProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackageProductWithOptions(request, runtime);
    }

    public DescribeResourceUsageDetailResponse describeResourceUsageDetailWithOptions(DescribeResourceUsageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceUsageDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceUsageDetailResponse());
    }

    public DescribeResourceUsageDetailResponse describeResourceUsageDetail(DescribeResourceUsageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageDetailWithOptions(request, runtime);
    }

    public DescribeResourceUsageTotalResponse describeResourceUsageTotalWithOptions(DescribeResourceUsageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeResourceUsageTotal", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeResourceUsageTotalResponse());
    }

    public DescribeResourceUsageTotalResponse describeResourceUsageTotal(DescribeResourceUsageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageTotalWithOptions(request, runtime);
    }

    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetailWithOptions(DescribeSavingsPlansCoverageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSavingsPlansCoverageDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSavingsPlansCoverageDetailResponse());
    }

    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansCoverageDetailWithOptions(request, runtime);
    }

    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotalWithOptions(DescribeSavingsPlansCoverageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSavingsPlansCoverageTotal", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSavingsPlansCoverageTotalResponse());
    }

    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansCoverageTotalWithOptions(request, runtime);
    }

    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetailWithOptions(DescribeSavingsPlansUsageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSavingsPlansUsageDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSavingsPlansUsageDetailResponse());
    }

    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansUsageDetailWithOptions(request, runtime);
    }

    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotalWithOptions(DescribeSavingsPlansUsageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSavingsPlansUsageTotal", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSavingsPlansUsageTotalResponse());
    }

    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansUsageTotalWithOptions(request, runtime);
    }

    public DescribeSplitItemBillResponse describeSplitItemBillWithOptions(DescribeSplitItemBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSplitItemBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSplitItemBillResponse());
    }

    public DescribeSplitItemBillResponse describeSplitItemBill(DescribeSplitItemBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSplitItemBillWithOptions(request, runtime);
    }

    public EnableBillGenerationResponse enableBillGenerationWithOptions(EnableBillGenerationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableBillGeneration", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new EnableBillGenerationResponse());
    }

    public EnableBillGenerationResponse enableBillGeneration(EnableBillGenerationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableBillGenerationWithOptions(request, runtime);
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfoWithOptions(GetCustomerAccountInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCustomerAccountInfo", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetCustomerAccountInfoResponse());
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfo(GetCustomerAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerAccountInfoWithOptions(request, runtime);
    }

    public GetCustomerListResponse getCustomerListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetCustomerList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerListWithOptions(runtime);
    }

    public GetOrderDetailResponse getOrderDetailWithOptions(GetOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOrderDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetOrderDetailResponse());
    }

    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderDetailWithOptions(request, runtime);
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPriceWithOptions(GetPayAsYouGoPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPayAsYouGoPrice", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetPayAsYouGoPriceResponse());
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPayAsYouGoPriceWithOptions(request, runtime);
    }

    public GetResourcePackagePriceResponse getResourcePackagePriceWithOptions(GetResourcePackagePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourcePackagePrice", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourcePackagePriceResponse());
    }

    public GetResourcePackagePriceResponse getResourcePackagePrice(GetResourcePackagePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourcePackagePriceWithOptions(request, runtime);
    }

    public GetSubscriptionPriceResponse getSubscriptionPriceWithOptions(GetSubscriptionPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSubscriptionPrice", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetSubscriptionPriceResponse());
    }

    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubscriptionPriceWithOptions(request, runtime);
    }

    public ModifyAccountRelationResponse modifyAccountRelationWithOptions(ModifyAccountRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyAccountRelation", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyAccountRelationResponse());
    }

    public ModifyAccountRelationResponse modifyAccountRelation(ModifyAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountRelationWithOptions(request, runtime);
    }

    public ModifyCostUnitResponse modifyCostUnitWithOptions(ModifyCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyCostUnit", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyCostUnitResponse());
    }

    public ModifyCostUnitResponse modifyCostUnit(ModifyCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCostUnitWithOptions(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ModifyInstance", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    public QueryAccountBalanceResponse queryAccountBalanceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryAccountBalance", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountBalanceResponse());
    }

    public QueryAccountBalanceResponse queryAccountBalance() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountBalanceWithOptions(runtime);
    }

    public QueryAccountBillResponse queryAccountBillWithOptions(QueryAccountBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAccountBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountBillResponse());
    }

    public QueryAccountBillResponse queryAccountBill(QueryAccountBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountBillWithOptions(request, runtime);
    }

    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetailsWithOptions(QueryAccountTransactionDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAccountTransactionDetails", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountTransactionDetailsResponse());
    }

    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountTransactionDetailsWithOptions(request, runtime);
    }

    public QueryAccountTransactionsResponse queryAccountTransactionsWithOptions(QueryAccountTransactionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAccountTransactions", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAccountTransactionsResponse());
    }

    public QueryAccountTransactionsResponse queryAccountTransactions(QueryAccountTransactionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountTransactionsWithOptions(request, runtime);
    }

    public QueryAvailableInstancesResponse queryAvailableInstancesWithOptions(QueryAvailableInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryAvailableInstances", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryAvailableInstancesResponse());
    }

    public QueryAvailableInstancesResponse queryAvailableInstances(QueryAvailableInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAvailableInstancesWithOptions(request, runtime);
    }

    public QueryBillResponse queryBillWithOptions(QueryBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBillResponse());
    }

    public QueryBillResponse queryBill(QueryBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillWithOptions(request, runtime);
    }

    public QueryBillOverviewResponse queryBillOverviewWithOptions(QueryBillOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryBillOverview", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBillOverviewResponse());
    }

    public QueryBillOverviewResponse queryBillOverview(QueryBillOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillOverviewWithOptions(request, runtime);
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("QueryBillToOSSSubscription", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryBillToOSSSubscriptionResponse());
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillToOSSSubscriptionWithOptions(runtime);
    }

    public QueryCashCouponsResponse queryCashCouponsWithOptions(QueryCashCouponsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCashCoupons", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCashCouponsResponse());
    }

    public QueryCashCouponsResponse queryCashCoupons(QueryCashCouponsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCashCouponsWithOptions(request, runtime);
    }

    public QueryCostUnitResponse queryCostUnitWithOptions(QueryCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCostUnit", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCostUnitResponse());
    }

    public QueryCostUnitResponse queryCostUnit(QueryCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCostUnitWithOptions(request, runtime);
    }

    public QueryCostUnitResourceResponse queryCostUnitResourceWithOptions(QueryCostUnitResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCostUnitResource", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCostUnitResourceResponse());
    }

    public QueryCostUnitResourceResponse queryCostUnitResource(QueryCostUnitResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCostUnitResourceWithOptions(request, runtime);
    }

    public QueryCustomerAddressListResponse queryCustomerAddressListWithOptions(QueryCustomerAddressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryCustomerAddressList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryCustomerAddressListResponse());
    }

    public QueryCustomerAddressListResponse queryCustomerAddressList(QueryCustomerAddressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCustomerAddressListWithOptions(request, runtime);
    }

    public QueryDPUtilizationDetailResponse queryDPUtilizationDetailWithOptions(QueryDPUtilizationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDPUtilizationDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDPUtilizationDetailResponse());
    }

    public QueryDPUtilizationDetailResponse queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDPUtilizationDetailWithOptions(request, runtime);
    }

    public QueryEvaluateListResponse queryEvaluateListWithOptions(QueryEvaluateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryEvaluateList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryEvaluateListResponse());
    }

    public QueryEvaluateListResponse queryEvaluateList(QueryEvaluateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEvaluateListWithOptions(request, runtime);
    }

    public QueryFinancialAccountInfoResponse queryFinancialAccountInfoWithOptions(QueryFinancialAccountInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryFinancialAccountInfo", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryFinancialAccountInfoResponse());
    }

    public QueryFinancialAccountInfoResponse queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFinancialAccountInfoWithOptions(request, runtime);
    }

    public QueryInstanceBillResponse queryInstanceBillWithOptions(QueryInstanceBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInstanceBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInstanceBillResponse());
    }

    public QueryInstanceBillResponse queryInstanceBill(QueryInstanceBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceBillWithOptions(request, runtime);
    }

    public QueryInstanceByTagResponse queryInstanceByTagWithOptions(QueryInstanceByTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInstanceByTag", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInstanceByTagResponse());
    }

    public QueryInstanceByTagResponse queryInstanceByTag(QueryInstanceByTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceByTagWithOptions(request, runtime);
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCostWithOptions(QueryInstanceGaapCostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInstanceGaapCost", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInstanceGaapCostResponse());
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCost(QueryInstanceGaapCostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceGaapCostWithOptions(request, runtime);
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerListWithOptions(QueryInvoicingCustomerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryInvoicingCustomerList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryInvoicingCustomerListResponse());
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInvoicingCustomerListWithOptions(request, runtime);
    }

    public QueryMonthlyBillResponse queryMonthlyBillWithOptions(QueryMonthlyBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMonthlyBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMonthlyBillResponse());
    }

    public QueryMonthlyBillResponse queryMonthlyBill(QueryMonthlyBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonthlyBillWithOptions(request, runtime);
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionWithOptions(QueryMonthlyInstanceConsumptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMonthlyInstanceConsumption", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMonthlyInstanceConsumptionResponse());
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonthlyInstanceConsumptionWithOptions(request, runtime);
    }

    public QueryOrdersResponse queryOrdersWithOptions(QueryOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryOrders", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryOrdersResponse());
    }

    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrdersWithOptions(request, runtime);
    }

    public QueryPermissionListResponse queryPermissionListWithOptions(QueryPermissionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPermissionList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPermissionListResponse());
    }

    public QueryPermissionListResponse queryPermissionList(QueryPermissionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPermissionListWithOptions(request, runtime);
    }

    public QueryPrepaidCardsResponse queryPrepaidCardsWithOptions(QueryPrepaidCardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPrepaidCards", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPrepaidCardsResponse());
    }

    public QueryPrepaidCardsResponse queryPrepaidCards(QueryPrepaidCardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPrepaidCardsWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryProductList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryRedeemResponse queryRedeemWithOptions(QueryRedeemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRedeem", "2017-12-14", "HTTPS", "GET", "AK", "json", req, runtime), new QueryRedeemResponse());
    }

    public QueryRedeemResponse queryRedeem(QueryRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRedeemWithOptions(request, runtime);
    }

    public QueryRelationListResponse queryRelationListWithOptions(QueryRelationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRelationList", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRelationListResponse());
    }

    public QueryRelationListResponse queryRelationList(QueryRelationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRelationListWithOptions(request, runtime);
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuotaWithOptions(QueryResellerAvailableQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryResellerAvailableQuota", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryResellerAvailableQuotaResponse());
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryResellerAvailableQuotaWithOptions(request, runtime);
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstancesWithOptions(QueryResourcePackageInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryResourcePackageInstances", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryResourcePackageInstancesResponse());
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryResourcePackageInstancesWithOptions(request, runtime);
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetailWithOptions(QueryRIUtilizationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryRIUtilizationDetail", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryRIUtilizationDetailResponse());
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRIUtilizationDetailWithOptions(request, runtime);
    }

    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLogWithOptions(QuerySavingsPlansDeductLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySavingsPlansDeductLog", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySavingsPlansDeductLogResponse());
    }

    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingsPlansDeductLogWithOptions(request, runtime);
    }

    public QuerySavingsPlansInstanceResponse querySavingsPlansInstanceWithOptions(QuerySavingsPlansInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySavingsPlansInstance", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySavingsPlansInstanceResponse());
    }

    public QuerySavingsPlansInstanceResponse querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingsPlansInstanceWithOptions(request, runtime);
    }

    public QuerySettleBillResponse querySettleBillWithOptions(QuerySettleBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySettleBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySettleBillResponse());
    }

    public QuerySettleBillResponse querySettleBill(QuerySettleBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySettleBillWithOptions(request, runtime);
    }

    public QuerySettlementBillResponse querySettlementBillWithOptions(QuerySettlementBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySettlementBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySettlementBillResponse());
    }

    public QuerySettlementBillResponse querySettlementBill(QuerySettlementBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySettlementBillWithOptions(request, runtime);
    }

    public QuerySplitItemBillResponse querySplitItemBillWithOptions(QuerySplitItemBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QuerySplitItemBill", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QuerySplitItemBillResponse());
    }

    public QuerySplitItemBillResponse querySplitItemBill(QuerySplitItemBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySplitItemBillWithOptions(request, runtime);
    }

    public QueryUserOmsDataResponse queryUserOmsDataWithOptions(QueryUserOmsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryUserOmsData", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new QueryUserOmsDataResponse());
    }

    public QueryUserOmsDataResponse queryUserOmsData(QueryUserOmsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserOmsDataWithOptions(request, runtime);
    }

    public RelieveAccountRelationResponse relieveAccountRelationWithOptions(RelieveAccountRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RelieveAccountRelation", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RelieveAccountRelationResponse());
    }

    public RelieveAccountRelationResponse relieveAccountRelation(RelieveAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.relieveAccountRelationWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewInstance", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public RenewResourcePackageResponse renewResourcePackageWithOptions(RenewResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenewResourcePackage", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new RenewResourcePackageResponse());
    }

    public RenewResourcePackageResponse renewResourcePackage(RenewResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewResourcePackageWithOptions(request, runtime);
    }

    public SaveUserCreditResponse saveUserCreditWithOptions(SaveUserCreditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveUserCredit", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SaveUserCreditResponse());
    }

    public SaveUserCreditResponse saveUserCredit(SaveUserCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveUserCreditWithOptions(request, runtime);
    }

    public SetAllExpirationDayResponse setAllExpirationDayWithOptions(SetAllExpirationDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetAllExpirationDay", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetAllExpirationDayResponse());
    }

    public SetAllExpirationDayResponse setAllExpirationDay(SetAllExpirationDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAllExpirationDayWithOptions(request, runtime);
    }

    public SetCreditLabelActionResponse setCreditLabelActionWithOptions(SetCreditLabelActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetCreditLabelAction", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetCreditLabelActionResponse());
    }

    public SetCreditLabelActionResponse setCreditLabelAction(SetCreditLabelActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCreditLabelActionWithOptions(request, runtime);
    }

    public SetRenewalResponse setRenewalWithOptions(SetRenewalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRenewal", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetRenewalResponse());
    }

    public SetRenewalResponse setRenewal(SetRenewalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRenewalWithOptions(request, runtime);
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdWithOptions(SetResellerUserAlarmThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetResellerUserAlarmThreshold", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetResellerUserAlarmThresholdResponse());
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    public SetResellerUserQuotaResponse setResellerUserQuotaWithOptions(SetResellerUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetResellerUserQuota", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetResellerUserQuotaResponse());
    }

    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserQuotaWithOptions(request, runtime);
    }

    public SetResellerUserStatusResponse setResellerUserStatusWithOptions(SetResellerUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetResellerUserStatus", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SetResellerUserStatusResponse());
    }

    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserStatusWithOptions(request, runtime);
    }

    public SubscribeBillToOSSResponse subscribeBillToOSSWithOptions(SubscribeBillToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubscribeBillToOSS", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new SubscribeBillToOSSResponse());
    }

    public SubscribeBillToOSSResponse subscribeBillToOSS(SubscribeBillToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscribeBillToOSSWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSSWithOptions(UnsubscribeBillToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnsubscribeBillToOSS", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UnsubscribeBillToOSSResponse());
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsubscribeBillToOSSWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeResourcePackageResponse upgradeResourcePackageWithOptions(UpgradeResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeResourcePackage", "2017-12-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeResourcePackageResponse());
    }

    public UpgradeResourcePackageResponse upgradeResourcePackage(UpgradeResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeResourcePackageWithOptions(request, runtime);
    }
}
