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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChildNick", request.childNick);
        query.put("ChildUserId", request.childUserId);
        query.put("ParentUserId", request.parentUserId);
        query.put("PermissionCodes", request.permissionCodes);
        query.put("RelationType", request.relationType);
        query.put("RequestId", request.requestId);
        query.put("RoleCodes", request.roleCodes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAccountRelationResponse());
    }

    public AddAccountRelationResponse addAccountRelation(AddAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addAccountRelationWithOptions(request, runtime);
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResourceWithOptions(AllocateCostUnitResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FromUnitId", request.fromUnitId);
        query.put("FromUnitUserId", request.fromUnitUserId);
        query.put("ResourceInstanceList", request.resourceInstanceList);
        query.put("ToUnitId", request.toUnitId);
        query.put("ToUnitUserId", request.toUnitUserId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateCostUnitResource"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateCostUnitResourceResponse());
    }

    public AllocateCostUnitResourceResponse allocateCostUnitResource(AllocateCostUnitResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.allocateCostUnitResourceWithOptions(request, runtime);
    }

    public ApplyInvoiceResponse applyInvoiceWithOptions(ApplyInvoiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AddressId", request.addressId);
        query.put("ApplyUserNick", request.applyUserNick);
        query.put("CustomerId", request.customerId);
        query.put("InvoiceAmount", request.invoiceAmount);
        query.put("InvoiceByAmount", request.invoiceByAmount);
        query.put("InvoicingType", request.invoicingType);
        query.put("OwnerId", request.ownerId);
        query.put("ProcessWay", request.processWay);
        query.put("SelectedIds", request.selectedIds);
        query.put("UserRemark", request.userRemark);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyInvoice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyInvoiceResponse());
    }

    public ApplyInvoiceResponse applyInvoice(ApplyInvoiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyInvoiceWithOptions(request, runtime);
    }

    public CancelOrderResponse cancelOrderWithOptions(CancelOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelOrder"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelOrderResponse());
    }

    public CancelOrderResponse cancelOrder(CancelOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOrderWithOptions(request, runtime);
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmountWithOptions(ChangeResellerConsumeAmountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AdjustType", request.adjustType);
        query.put("Amount", request.amount);
        query.put("BusinessType", request.businessType);
        query.put("Currency", request.currency);
        query.put("ExtendMap", request.extendMap);
        query.put("OutBizId", request.outBizId);
        query.put("OwnerId", request.ownerId);
        query.put("Source", request.source);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResellerConsumeAmount"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeResellerConsumeAmountResponse());
    }

    public ChangeResellerConsumeAmountResponse changeResellerConsumeAmount(ChangeResellerConsumeAmountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeResellerConsumeAmountWithOptions(request, runtime);
    }

    public ConfirmRelationResponse confirmRelationWithOptions(ConfirmRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChildUserId", request.childUserId);
        query.put("ConfirmCode", request.confirmCode);
        query.put("ParentUserId", request.parentUserId);
        query.put("PermissionCodes", request.permissionCodes);
        query.put("RelationType", request.relationType);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmRelationResponse());
    }

    public ConfirmRelationResponse confirmRelation(ConfirmRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmRelationWithOptions(request, runtime);
    }

    public ConvertChargeTypeResponse convertChargeTypeWithOptions(ConvertChargeTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OwnerId", request.ownerId);
        query.put("Period", request.period);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConvertChargeType"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConvertChargeTypeResponse());
    }

    public ConvertChargeTypeResponse convertChargeType(ConvertChargeTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.convertChargeTypeWithOptions(request, runtime);
    }

    public CreateAgAccountResponse createAgAccountWithOptions(CreateAgAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountAttr", request.accountAttr);
        query.put("CityName", request.cityName);
        query.put("EnterpriseName", request.enterpriseName);
        query.put("FirstName", request.firstName);
        query.put("LastName", request.lastName);
        query.put("LoginEmail", request.loginEmail);
        query.put("NationCode", request.nationCode);
        query.put("Postcode", request.postcode);
        query.put("ProvinceName", request.provinceName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAgAccount"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAgAccountResponse());
    }

    public CreateAgAccountResponse createAgAccount(CreateAgAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAgAccountWithOptions(request, runtime);
    }

    public CreateCostUnitResponse createCostUnitWithOptions(CreateCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UnitEntityList", request.unitEntityList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCostUnitResponse());
    }

    public CreateCostUnitResponse createCostUnit(CreateCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCostUnitWithOptions(request, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("Logistics", request.logistics);
        query.put("OwnerId", request.ownerId);
        query.put("Parameter", request.parameter);
        query.put("Period", request.period);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("RenewPeriod", request.renewPeriod);
        query.put("RenewalStatus", request.renewalStatus);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    public CreateResellerUserQuotaResponse createResellerUserQuotaWithOptions(CreateResellerUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("Currency", request.currency);
        query.put("OutBizId", request.outBizId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResellerUserQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResellerUserQuotaResponse());
    }

    public CreateResellerUserQuotaResponse createResellerUserQuota(CreateResellerUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResellerUserQuotaWithOptions(request, runtime);
    }

    public CreateResourcePackageResponse createResourcePackageWithOptions(CreateResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Duration", request.duration);
        query.put("EffectiveDate", request.effectiveDate);
        query.put("OwnerId", request.ownerId);
        query.put("PackageType", request.packageType);
        query.put("PricingCycle", request.pricingCycle);
        query.put("ProductCode", request.productCode);
        query.put("Specification", request.specification);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourcePackageResponse());
    }

    public CreateResourcePackageResponse createResourcePackage(CreateResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createResourcePackageWithOptions(request, runtime);
    }

    public CreateSavingsPlansInstanceResponse createSavingsPlansInstanceWithOptions(CreateSavingsPlansInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CommodityCode", request.commodityCode);
        query.put("Duration", request.duration);
        query.put("EffectiveDate", request.effectiveDate);
        query.put("PayMode", request.payMode);
        query.put("PoolValue", request.poolValue);
        query.put("PricingCycle", request.pricingCycle);
        query.put("Region", request.region);
        query.put("SpecType", request.specType);
        query.put("Specification", request.specification);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavingsPlansInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavingsPlansInstanceResponse());
    }

    public CreateSavingsPlansInstanceResponse createSavingsPlansInstance(CreateSavingsPlansInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSavingsPlansInstanceWithOptions(request, runtime);
    }

    public DeleteCostUnitResponse deleteCostUnitWithOptions(DeleteCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerUid", request.ownerUid);
        query.put("UnitId", request.unitId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCostUnitResponse());
    }

    public DeleteCostUnitResponse deleteCostUnit(DeleteCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCostUnitWithOptions(request, runtime);
    }

    public DescribeInstanceBillResponse describeInstanceBillWithOptions(DescribeInstanceBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("BillingDate", request.billingDate);
        query.put("Granularity", request.granularity);
        query.put("InstanceID", request.instanceID);
        query.put("IsBillingItem", request.isBillingItem);
        query.put("IsHideZeroCharge", request.isHideZeroCharge);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceBillResponse());
    }

    public DescribeInstanceBillResponse describeInstanceBill(DescribeInstanceBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceBillWithOptions(request, runtime);
    }

    public DescribePricingModuleResponse describePricingModuleWithOptions(DescribePricingModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePricingModule"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePricingModuleResponse());
    }

    public DescribePricingModuleResponse describePricingModule(DescribePricingModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePricingModuleWithOptions(request, runtime);
    }

    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetailWithOptions(DescribeResourceCoverageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("PeriodType", request.periodType);
        query.put("ResourceType", request.resourceType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceCoverageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceCoverageDetailResponse());
    }

    public DescribeResourceCoverageDetailResponse describeResourceCoverageDetail(DescribeResourceCoverageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceCoverageDetailWithOptions(request, runtime);
    }

    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotalWithOptions(DescribeResourceCoverageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("PeriodType", request.periodType);
        query.put("ResourceType", request.resourceType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceCoverageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceCoverageTotalResponse());
    }

    public DescribeResourceCoverageTotalResponse describeResourceCoverageTotal(DescribeResourceCoverageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceCoverageTotalWithOptions(request, runtime);
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProductWithOptions(DescribeResourcePackageProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ProductCode", request.productCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourcePackageProduct"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourcePackageProductResponse());
    }

    public DescribeResourcePackageProductResponse describeResourcePackageProduct(DescribeResourcePackageProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourcePackageProductWithOptions(request, runtime);
    }

    public DescribeResourceUsageDetailResponse describeResourceUsageDetailWithOptions(DescribeResourceUsageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("PeriodType", request.periodType);
        query.put("ResourceType", request.resourceType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceUsageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceUsageDetailResponse());
    }

    public DescribeResourceUsageDetailResponse describeResourceUsageDetail(DescribeResourceUsageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageDetailWithOptions(request, runtime);
    }

    public DescribeResourceUsageTotalResponse describeResourceUsageTotalWithOptions(DescribeResourceUsageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("PeriodType", request.periodType);
        query.put("ResourceType", request.resourceType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceUsageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceUsageTotalResponse());
    }

    public DescribeResourceUsageTotalResponse describeResourceUsageTotal(DescribeResourceUsageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeResourceUsageTotalWithOptions(request, runtime);
    }

    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetailWithOptions(DescribeSavingsPlansCoverageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("MaxResults", request.maxResults);
        query.put("PeriodType", request.periodType);
        query.put("StartPeriod", request.startPeriod);
        query.put("Token", request.token);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansCoverageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansCoverageDetailResponse());
    }

    public DescribeSavingsPlansCoverageDetailResponse describeSavingsPlansCoverageDetail(DescribeSavingsPlansCoverageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansCoverageDetailWithOptions(request, runtime);
    }

    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotalWithOptions(DescribeSavingsPlansCoverageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("PeriodType", request.periodType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansCoverageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansCoverageTotalResponse());
    }

    public DescribeSavingsPlansCoverageTotalResponse describeSavingsPlansCoverageTotal(DescribeSavingsPlansCoverageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansCoverageTotalWithOptions(request, runtime);
    }

    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetailWithOptions(DescribeSavingsPlansUsageDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("MaxResults", request.maxResults);
        query.put("PeriodType", request.periodType);
        query.put("StartPeriod", request.startPeriod);
        query.put("Token", request.token);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansUsageDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansUsageDetailResponse());
    }

    public DescribeSavingsPlansUsageDetailResponse describeSavingsPlansUsageDetail(DescribeSavingsPlansUsageDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansUsageDetailWithOptions(request, runtime);
    }

    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotalWithOptions(DescribeSavingsPlansUsageTotalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("EndPeriod", request.endPeriod);
        query.put("PeriodType", request.periodType);
        query.put("StartPeriod", request.startPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSavingsPlansUsageTotal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSavingsPlansUsageTotalResponse());
    }

    public DescribeSavingsPlansUsageTotalResponse describeSavingsPlansUsageTotal(DescribeSavingsPlansUsageTotalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSavingsPlansUsageTotalWithOptions(request, runtime);
    }

    public DescribeSplitItemBillResponse describeSplitItemBillWithOptions(DescribeSplitItemBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("BillingDate", request.billingDate);
        query.put("Granularity", request.granularity);
        query.put("InstanceID", request.instanceID);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SplitItemID", request.splitItemID);
        query.put("SubscriptionType", request.subscriptionType);
        query.put("TagFilter", request.tagFilter);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSplitItemBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSplitItemBillResponse());
    }

    public DescribeSplitItemBillResponse describeSplitItemBill(DescribeSplitItemBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSplitItemBillWithOptions(request, runtime);
    }

    public EnableBillGenerationResponse enableBillGenerationWithOptions(EnableBillGenerationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableBillGeneration"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableBillGenerationResponse());
    }

    public EnableBillGenerationResponse enableBillGeneration(EnableBillGenerationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableBillGenerationWithOptions(request, runtime);
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfoWithOptions(GetCustomerAccountInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerAccountInfo"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerAccountInfoResponse());
    }

    public GetCustomerAccountInfoResponse getCustomerAccountInfo(GetCustomerAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerAccountInfoWithOptions(request, runtime);
    }

    public GetCustomerListResponse getCustomerListWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomerList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomerListResponse());
    }

    public GetCustomerListResponse getCustomerList() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCustomerListWithOptions(runtime);
    }

    public GetOrderDetailResponse getOrderDetailWithOptions(GetOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderDetailResponse());
    }

    public GetOrderDetailResponse getOrderDetail(GetOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderDetailWithOptions(request, runtime);
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPriceWithOptions(GetPayAsYouGoPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ModuleList", request.moduleList);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("Region", request.region);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPayAsYouGoPrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPayAsYouGoPriceResponse());
    }

    public GetPayAsYouGoPriceResponse getPayAsYouGoPrice(GetPayAsYouGoPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPayAsYouGoPriceWithOptions(request, runtime);
    }

    public GetResourcePackagePriceResponse getResourcePackagePriceWithOptions(GetResourcePackagePriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Duration", request.duration);
        query.put("EffectiveDate", request.effectiveDate);
        query.put("InstanceId", request.instanceId);
        query.put("OrderType", request.orderType);
        query.put("OwnerId", request.ownerId);
        query.put("PackageType", request.packageType);
        query.put("PricingCycle", request.pricingCycle);
        query.put("ProductCode", request.productCode);
        query.put("Specification", request.specification);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePackagePrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePackagePriceResponse());
    }

    public GetResourcePackagePriceResponse getResourcePackagePrice(GetResourcePackagePriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourcePackagePriceWithOptions(request, runtime);
    }

    public GetSubscriptionPriceResponse getSubscriptionPriceWithOptions(GetSubscriptionPriceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("ModuleList", request.moduleList);
        query.put("OrderType", request.orderType);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("Quantity", request.quantity);
        query.put("Region", request.region);
        query.put("ServicePeriodQuantity", request.servicePeriodQuantity);
        query.put("ServicePeriodUnit", request.servicePeriodUnit);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubscriptionPrice"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubscriptionPriceResponse());
    }

    public GetSubscriptionPriceResponse getSubscriptionPrice(GetSubscriptionPriceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSubscriptionPriceWithOptions(request, runtime);
    }

    public ModifyAccountRelationResponse modifyAccountRelationWithOptions(ModifyAccountRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChildNick", request.childNick);
        query.put("ChildUserId", request.childUserId);
        query.put("ParentUserId", request.parentUserId);
        query.put("PermissionCodes", request.permissionCodes);
        query.put("RelationOperation", request.relationOperation);
        query.put("RelationType", request.relationType);
        query.put("RequestId", request.requestId);
        query.put("RoleCodes", request.roleCodes);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountRelationResponse());
    }

    public ModifyAccountRelationResponse modifyAccountRelation(ModifyAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyAccountRelationWithOptions(request, runtime);
    }

    public ModifyCostUnitResponse modifyCostUnitWithOptions(ModifyCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UnitEntityList", request.unitEntityList);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCostUnitResponse());
    }

    public ModifyCostUnitResponse modifyCostUnit(ModifyCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyCostUnitWithOptions(request, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("InstanceId", request.instanceId);
        query.put("ModifyType", request.modifyType);
        query.put("OwnerId", request.ownerId);
        query.put("Parameter", request.parameter);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    public QueryAccountBalanceResponse queryAccountBalanceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountBalance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountBalanceResponse());
    }

    public QueryAccountBalanceResponse queryAccountBalance() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountBalanceWithOptions(runtime);
    }

    public QueryAccountBillResponse queryAccountBillWithOptions(QueryAccountBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("BillingDate", request.billingDate);
        query.put("Granularity", request.granularity);
        query.put("IsGroupByProduct", request.isGroupByProduct);
        query.put("OwnerID", request.ownerID);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountBillResponse());
    }

    public QueryAccountBillResponse queryAccountBill(QueryAccountBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountBillWithOptions(request, runtime);
    }

    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetailsWithOptions(QueryAccountTransactionDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CreateTimeEnd", request.createTimeEnd);
        query.put("CreateTimeStart", request.createTimeStart);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("RecordID", request.recordID);
        query.put("TransactionChannel", request.transactionChannel);
        query.put("TransactionChannelSN", request.transactionChannelSN);
        query.put("TransactionNumber", request.transactionNumber);
        query.put("TransactionType", request.transactionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountTransactionDetails"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountTransactionDetailsResponse());
    }

    public QueryAccountTransactionDetailsResponse queryAccountTransactionDetails(QueryAccountTransactionDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountTransactionDetailsWithOptions(request, runtime);
    }

    public QueryAccountTransactionsResponse queryAccountTransactionsWithOptions(QueryAccountTransactionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CreateTimeEnd", request.createTimeEnd);
        query.put("CreateTimeStart", request.createTimeStart);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RecordID", request.recordID);
        query.put("TransactionChannelSN", request.transactionChannelSN);
        query.put("TransactionNumber", request.transactionNumber);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountTransactions"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountTransactionsResponse());
    }

    public QueryAccountTransactionsResponse queryAccountTransactions(QueryAccountTransactionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountTransactionsWithOptions(request, runtime);
    }

    public QueryAvailableInstancesResponse queryAvailableInstancesWithOptions(QueryAvailableInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CreateTimeEnd", request.createTimeEnd);
        query.put("CreateTimeStart", request.createTimeStart);
        query.put("EndTimeEnd", request.endTimeEnd);
        query.put("EndTimeStart", request.endTimeStart);
        query.put("InstanceIDs", request.instanceIDs);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("Region", request.region);
        query.put("RenewStatus", request.renewStatus);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAvailableInstances"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAvailableInstancesResponse());
    }

    public QueryAvailableInstancesResponse queryAvailableInstances(QueryAvailableInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAvailableInstancesWithOptions(request, runtime);
    }

    public QueryBillResponse queryBillWithOptions(QueryBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("IsDisplayLocalCurrency", request.isDisplayLocalCurrency);
        query.put("IsHideZeroCharge", request.isHideZeroCharge);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillResponse());
    }

    public QueryBillResponse queryBill(QueryBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillWithOptions(request, runtime);
    }

    public QueryBillOverviewResponse queryBillOverviewWithOptions(QueryBillOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBillOverview"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillOverviewResponse());
    }

    public QueryBillOverviewResponse queryBillOverview(QueryBillOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillOverviewWithOptions(request, runtime);
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscriptionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBillToOSSSubscription"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBillToOSSSubscriptionResponse());
    }

    public QueryBillToOSSSubscriptionResponse queryBillToOSSSubscription() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBillToOSSSubscriptionWithOptions(runtime);
    }

    public QueryCashCouponsResponse queryCashCouponsWithOptions(QueryCashCouponsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EffectiveOrNot", request.effectiveOrNot);
        query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        query.put("ExpiryTimeStart", request.expiryTimeStart);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCashCoupons"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCashCouponsResponse());
    }

    public QueryCashCouponsResponse queryCashCoupons(QueryCashCouponsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCashCouponsWithOptions(request, runtime);
    }

    public QueryCostUnitResponse queryCostUnitWithOptions(QueryCostUnitRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerUid", request.ownerUid);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ParentUnitId", request.parentUnitId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostUnit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostUnitResponse());
    }

    public QueryCostUnitResponse queryCostUnit(QueryCostUnitRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCostUnitWithOptions(request, runtime);
    }

    public QueryCostUnitResourceResponse queryCostUnitResourceWithOptions(QueryCostUnitResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerUid", request.ownerUid);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("UnitId", request.unitId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCostUnitResource"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCostUnitResourceResponse());
    }

    public QueryCostUnitResourceResponse queryCostUnitResource(QueryCostUnitResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCostUnitResourceWithOptions(request, runtime);
    }

    public QueryCustomerAddressListResponse queryCustomerAddressListWithOptions(QueryCustomerAddressListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCustomerAddressList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCustomerAddressListResponse());
    }

    public QueryCustomerAddressListResponse queryCustomerAddressList(QueryCustomerAddressListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCustomerAddressListWithOptions(request, runtime);
    }

    public QueryDPUtilizationDetailResponse queryDPUtilizationDetailWithOptions(QueryDPUtilizationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CommodityCode", request.commodityCode);
        query.put("DeductedInstanceId", request.deductedInstanceId);
        query.put("EndTime", request.endTime);
        query.put("IncludeShare", request.includeShare);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("LastToken", request.lastToken);
        query.put("Limit", request.limit);
        query.put("ProdCode", request.prodCode);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDPUtilizationDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDPUtilizationDetailResponse());
    }

    public QueryDPUtilizationDetailResponse queryDPUtilizationDetail(QueryDPUtilizationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDPUtilizationDetailWithOptions(request, runtime);
    }

    public QueryEvaluateListResponse queryEvaluateListWithOptions(QueryEvaluateListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillCycle", request.billCycle);
        query.put("BizTypeList", request.bizTypeList);
        query.put("EndAmount", request.endAmount);
        query.put("EndBizTime", request.endBizTime);
        query.put("EndSearchTime", request.endSearchTime);
        query.put("OutBizId", request.outBizId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("SortType", request.sortType);
        query.put("StartAmount", request.startAmount);
        query.put("StartBizTime", request.startBizTime);
        query.put("StartSearchTime", request.startSearchTime);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEvaluateList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEvaluateListResponse());
    }

    public QueryEvaluateListResponse queryEvaluateList(QueryEvaluateListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEvaluateListWithOptions(request, runtime);
    }

    public QueryFinancialAccountInfoResponse queryFinancialAccountInfoWithOptions(QueryFinancialAccountInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryFinancialAccountInfo"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryFinancialAccountInfoResponse());
    }

    public QueryFinancialAccountInfoResponse queryFinancialAccountInfo(QueryFinancialAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryFinancialAccountInfoWithOptions(request, runtime);
    }

    public QueryInstanceBillResponse queryInstanceBillWithOptions(QueryInstanceBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("BillingDate", request.billingDate);
        query.put("Granularity", request.granularity);
        query.put("IsBillingItem", request.isBillingItem);
        query.put("IsHideZeroCharge", request.isHideZeroCharge);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceBillResponse());
    }

    public QueryInstanceBillResponse queryInstanceBill(QueryInstanceBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceBillWithOptions(request, runtime);
    }

    public QueryInstanceByTagResponse queryInstanceByTagWithOptions(QueryInstanceByTagRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceByTag"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceByTagResponse());
    }

    public QueryInstanceByTagResponse queryInstanceByTag(QueryInstanceByTagRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceByTagWithOptions(request, runtime);
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCostWithOptions(QueryInstanceGaapCostRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillingCycle", request.billingCycle);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceGaapCost"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceGaapCostResponse());
    }

    public QueryInstanceGaapCostResponse queryInstanceGaapCost(QueryInstanceGaapCostRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInstanceGaapCostWithOptions(request, runtime);
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerListWithOptions(QueryInvoicingCustomerListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInvoicingCustomerList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInvoicingCustomerListResponse());
    }

    public QueryInvoicingCustomerListResponse queryInvoicingCustomerList(QueryInvoicingCustomerListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryInvoicingCustomerListWithOptions(request, runtime);
    }

    public QueryMonthlyBillResponse queryMonthlyBillWithOptions(QueryMonthlyBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillingCycle", request.billingCycle);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonthlyBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonthlyBillResponse());
    }

    public QueryMonthlyBillResponse queryMonthlyBill(QueryMonthlyBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonthlyBillWithOptions(request, runtime);
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumptionWithOptions(QueryMonthlyInstanceConsumptionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillingCycle", request.billingCycle);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMonthlyInstanceConsumption"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMonthlyInstanceConsumptionResponse());
    }

    public QueryMonthlyInstanceConsumptionResponse queryMonthlyInstanceConsumption(QueryMonthlyInstanceConsumptionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMonthlyInstanceConsumptionWithOptions(request, runtime);
    }

    public QueryOrdersResponse queryOrdersWithOptions(QueryOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CreateTimeEnd", request.createTimeEnd);
        query.put("CreateTimeStart", request.createTimeStart);
        query.put("OrderType", request.orderType);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("PaymentStatus", request.paymentStatus);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrders"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrdersResponse());
    }

    public QueryOrdersResponse queryOrders(QueryOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrdersWithOptions(request, runtime);
    }

    public QueryPermissionListResponse queryPermissionListWithOptions(QueryPermissionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("RelationId", request.relationId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPermissionList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPermissionListResponse());
    }

    public QueryPermissionListResponse queryPermissionList(QueryPermissionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPermissionListWithOptions(request, runtime);
    }

    public QueryPrepaidCardsResponse queryPrepaidCardsWithOptions(QueryPrepaidCardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EffectiveOrNot", request.effectiveOrNot);
        query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        query.put("ExpiryTimeStart", request.expiryTimeStart);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPrepaidCards"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPrepaidCardsResponse());
    }

    public QueryPrepaidCardsResponse queryPrepaidCards(QueryPrepaidCardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPrepaidCardsWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("QueryTotalCount", request.queryTotalCount);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryProductList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetailWithOptions(QueryRIUtilizationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DeductedInstanceId", request.deductedInstanceId);
        query.put("EndTime", request.endTime);
        query.put("InstanceSpec", request.instanceSpec);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("RICommodityCode", request.RICommodityCode);
        query.put("RIInstanceId", request.RIInstanceId);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRIUtilizationDetail"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRIUtilizationDetailResponse());
    }

    public QueryRIUtilizationDetailResponse queryRIUtilizationDetail(QueryRIUtilizationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRIUtilizationDetailWithOptions(request, runtime);
    }

    public QueryRedeemResponse queryRedeemWithOptions(QueryRedeemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRedeem"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRedeemResponse());
    }

    public QueryRedeemResponse queryRedeem(QueryRedeemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRedeemWithOptions(request, runtime);
    }

    public QueryRelationListResponse queryRelationListWithOptions(QueryRelationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StatusList", request.statusList);
        query.put("UserId", request.userId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRelationList"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRelationListResponse());
    }

    public QueryRelationListResponse queryRelationList(QueryRelationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRelationListWithOptions(request, runtime);
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuotaWithOptions(QueryResellerAvailableQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ItemCodes", request.itemCodes);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResellerAvailableQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResellerAvailableQuotaResponse());
    }

    public QueryResellerAvailableQuotaResponse queryResellerAvailableQuota(QueryResellerAvailableQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryResellerAvailableQuotaWithOptions(request, runtime);
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstancesWithOptions(QueryResourcePackageInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ExpiryTimeEnd", request.expiryTimeEnd);
        query.put("ExpiryTimeStart", request.expiryTimeStart);
        query.put("IncludePartner", request.includePartner);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryResourcePackageInstances"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryResourcePackageInstancesResponse());
    }

    public QueryResourcePackageInstancesResponse queryResourcePackageInstances(QueryResourcePackageInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryResourcePackageInstancesWithOptions(request, runtime);
    }

    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLogWithOptions(QuerySavingsPlansDeductLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("InstanceType", request.instanceType);
        query.put("Locale", request.locale);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingsPlansDeductLog"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingsPlansDeductLogResponse());
    }

    public QuerySavingsPlansDeductLogResponse querySavingsPlansDeductLog(QuerySavingsPlansDeductLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingsPlansDeductLogWithOptions(request, runtime);
    }

    public QuerySavingsPlansInstanceResponse querySavingsPlansInstanceWithOptions(QuerySavingsPlansInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EndTime", request.endTime);
        query.put("InstanceId", request.instanceId);
        query.put("Locale", request.locale);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySavingsPlansInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySavingsPlansInstanceResponse());
    }

    public QuerySavingsPlansInstanceResponse querySavingsPlansInstance(QuerySavingsPlansInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySavingsPlansInstanceWithOptions(request, runtime);
    }

    public QuerySettleBillResponse querySettleBillWithOptions(QuerySettleBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("IsDisplayLocalCurrency", request.isDisplayLocalCurrency);
        query.put("IsHideZeroCharge", request.isHideZeroCharge);
        query.put("MaxResults", request.maxResults);
        query.put("NextToken", request.nextToken);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("RecordID", request.recordID);
        query.put("SubscriptionType", request.subscriptionType);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySettleBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySettleBillResponse());
    }

    public QuerySettleBillResponse querySettleBill(QuerySettleBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySettleBillWithOptions(request, runtime);
    }

    public QuerySettlementBillResponse querySettlementBillWithOptions(QuerySettlementBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillingCycle", request.billingCycle);
        query.put("EndTime", request.endTime);
        query.put("IsHideZeroCharge", request.isHideZeroCharge);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("StartTime", request.startTime);
        query.put("SubscriptionType", request.subscriptionType);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySettlementBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySettlementBillResponse());
    }

    public QuerySettlementBillResponse querySettlementBill(QuerySettlementBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySettlementBillWithOptions(request, runtime);
    }

    public QuerySplitItemBillResponse querySplitItemBillWithOptions(QuerySplitItemBillRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillOwnerId", request.billOwnerId);
        query.put("BillingCycle", request.billingCycle);
        query.put("OwnerId", request.ownerId);
        query.put("PageNum", request.pageNum);
        query.put("PageSize", request.pageSize);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySplitItemBill"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySplitItemBillResponse());
    }

    public QuerySplitItemBillResponse querySplitItemBill(QuerySplitItemBillRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySplitItemBillWithOptions(request, runtime);
    }

    public QueryUserOmsDataResponse queryUserOmsDataWithOptions(QueryUserOmsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("DataType", request.dataType);
        query.put("EndTime", request.endTime);
        query.put("Marker", request.marker);
        query.put("OwnerId", request.ownerId);
        query.put("PageSize", request.pageSize);
        query.put("StartTime", request.startTime);
        query.put("Table", request.table);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUserOmsData"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUserOmsDataResponse());
    }

    public QueryUserOmsDataResponse queryUserOmsData(QueryUserOmsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUserOmsDataWithOptions(request, runtime);
    }

    public RelieveAccountRelationResponse relieveAccountRelationWithOptions(RelieveAccountRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ChildUserId", request.childUserId);
        query.put("ParentUserId", request.parentUserId);
        query.put("RelationType", request.relationType);
        query.put("RequestId", request.requestId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RelieveAccountRelation"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RelieveAccountRelationResponse());
    }

    public RelieveAccountRelationResponse relieveAccountRelation(RelieveAccountRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.relieveAccountRelationWithOptions(request, runtime);
    }

    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ClientToken", request.clientToken);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("RenewPeriod", request.renewPeriod);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    public RenewResourcePackageResponse renewResourcePackageWithOptions(RenewResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Duration", request.duration);
        query.put("EffectiveDate", request.effectiveDate);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerId", request.ownerId);
        query.put("PricingCycle", request.pricingCycle);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewResourcePackageResponse());
    }

    public RenewResourcePackageResponse renewResourcePackage(RenewResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renewResourcePackageWithOptions(request, runtime);
    }

    public SaveUserCreditResponse saveUserCreditWithOptions(SaveUserCreditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AvoidExpiration", request.avoidExpiration);
        query.put("AvoidNotification", request.avoidNotification);
        query.put("AvoidPrepaidExpiration", request.avoidPrepaidExpiration);
        query.put("AvoidPrepaidNotification", request.avoidPrepaidNotification);
        query.put("CreditType", request.creditType);
        query.put("CreditValue", request.creditValue);
        query.put("Description", request.description);
        query.put("Operator", request.operator);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveUserCredit"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveUserCreditResponse());
    }

    public SaveUserCreditResponse saveUserCredit(SaveUserCreditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveUserCreditWithOptions(request, runtime);
    }

    public SetAllExpirationDayResponse setAllExpirationDayWithOptions(SetAllExpirationDayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("UnifyExpireDay", request.unifyExpireDay);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAllExpirationDay"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAllExpirationDayResponse());
    }

    public SetAllExpirationDayResponse setAllExpirationDay(SetAllExpirationDayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setAllExpirationDayWithOptions(request, runtime);
    }

    public SetCreditLabelActionResponse setCreditLabelActionWithOptions(SetCreditLabelActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ActionType", request.actionType);
        query.put("ClearCycle", request.clearCycle);
        query.put("CreditAmount", request.creditAmount);
        query.put("CurrencyCode", request.currencyCode);
        query.put("DailyCycle", request.dailyCycle);
        query.put("Description", request.description);
        query.put("IsNeedAddSettleLabel", request.isNeedAddSettleLabel);
        query.put("IsNeedAdjustCreditAccount", request.isNeedAdjustCreditAccount);
        query.put("IsNeedSaveNotifyRule", request.isNeedSaveNotifyRule);
        query.put("IsNeedSetCreditAmount", request.isNeedSetCreditAmount);
        query.put("NeedNotice", request.needNotice);
        query.put("NewCreateMode", request.newCreateMode);
        query.put("Operator", request.operator);
        query.put("RequestId", request.requestId);
        query.put("SiteCode", request.siteCode);
        query.put("Source", request.source);
        query.put("Uid", request.uid);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetCreditLabelAction"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetCreditLabelActionResponse());
    }

    public SetCreditLabelActionResponse setCreditLabelAction(SetCreditLabelActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setCreditLabelActionWithOptions(request, runtime);
    }

    public SetRenewalResponse setRenewalWithOptions(SetRenewalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceIDs", request.instanceIDs);
        query.put("OwnerId", request.ownerId);
        query.put("ProductCode", request.productCode);
        query.put("ProductType", request.productType);
        query.put("RenewalPeriod", request.renewalPeriod);
        query.put("RenewalPeriodUnit", request.renewalPeriodUnit);
        query.put("RenewalStatus", request.renewalStatus);
        query.put("SubscriptionType", request.subscriptionType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetRenewal"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetRenewalResponse());
    }

    public SetRenewalResponse setRenewal(SetRenewalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRenewalWithOptions(request, runtime);
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdWithOptions(SetResellerUserAlarmThresholdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AlarmThresholds", request.alarmThresholds);
        query.put("AlarmType", request.alarmType);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserAlarmThreshold"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserAlarmThresholdResponse());
    }

    public SetResellerUserAlarmThresholdResponse setResellerUserAlarmThreshold(SetResellerUserAlarmThresholdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserAlarmThresholdWithOptions(request, runtime);
    }

    public SetResellerUserQuotaResponse setResellerUserQuotaWithOptions(SetResellerUserQuotaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Amount", request.amount);
        query.put("Currency", request.currency);
        query.put("OutBizId", request.outBizId);
        query.put("OwnerId", request.ownerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserQuota"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserQuotaResponse());
    }

    public SetResellerUserQuotaResponse setResellerUserQuota(SetResellerUserQuotaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserQuotaWithOptions(request, runtime);
    }

    public SetResellerUserStatusResponse setResellerUserStatusWithOptions(SetResellerUserStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BusinessType", request.businessType);
        query.put("OwnerId", request.ownerId);
        query.put("Status", request.status);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetResellerUserStatus"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetResellerUserStatusResponse());
    }

    public SetResellerUserStatusResponse setResellerUserStatus(SetResellerUserStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setResellerUserStatusWithOptions(request, runtime);
    }

    public SubscribeBillToOSSResponse subscribeBillToOSSWithOptions(SubscribeBillToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BeginBillingCycle", request.beginBillingCycle);
        query.put("BucketOwnerId", request.bucketOwnerId);
        query.put("MultAccountRelSubscribe", request.multAccountRelSubscribe);
        query.put("SubscribeBucket", request.subscribeBucket);
        query.put("SubscribeType", request.subscribeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubscribeBillToOSS"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubscribeBillToOSSResponse());
    }

    public SubscribeBillToOSSResponse subscribeBillToOSS(SubscribeBillToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.subscribeBillToOSSWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("Tag", request.tag);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSSWithOptions(UnsubscribeBillToOSSRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("MultAccountRelSubscribe", request.multAccountRelSubscribe);
        query.put("SubscribeType", request.subscribeType);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnsubscribeBillToOSS"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnsubscribeBillToOSSResponse());
    }

    public UnsubscribeBillToOSSResponse unsubscribeBillToOSS(UnsubscribeBillToOSSRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unsubscribeBillToOSSWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("All", request.all);
        query.put("ResourceId", request.resourceId);
        query.put("ResourceType", request.resourceType);
        query.put("TagKey", request.tagKey);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpgradeResourcePackageResponse upgradeResourcePackageWithOptions(UpgradeResourcePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("EffectiveDate", request.effectiveDate);
        query.put("InstanceId", request.instanceId);
        query.put("OwnerId", request.ownerId);
        query.put("Specification", request.specification);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeResourcePackage"),
            new TeaPair("version", "2017-12-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeResourcePackageResponse());
    }

    public UpgradeResourcePackageResponse upgradeResourcePackage(UpgradeResourcePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeResourcePackageWithOptions(request, runtime);
    }
}
