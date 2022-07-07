// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901;

import com.aliyun.tea.*;
import com.aliyun.mm_multiply20210901.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("mm-multiply", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AbortContractResponse abortContractWithOptions(AbortContractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contractId)) {
            query.put("ContractId", request.contractId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortContract"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortContractResponse());
    }

    public AbortContractResponse abortContract(AbortContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.abortContractWithOptions(request, runtime);
    }

    public ActiveCollectionAccountResponse activeCollectionAccountWithOptions(ActiveCollectionAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collectionMode)) {
            query.put("CollectionMode", request.collectionMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveCollectionAccount"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveCollectionAccountResponse());
    }

    public ActiveCollectionAccountResponse activeCollectionAccount(ActiveCollectionAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeCollectionAccountWithOptions(request, runtime);
    }

    public AddMallConfigResponse addMallConfigWithOptions(AddMallConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddMallConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddMallConfigResponse());
    }

    public AddMallConfigResponse addMallConfig(AddMallConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addMallConfigWithOptions(request, runtime);
    }

    public ApplyDistributorResponse applyDistributorWithOptions(ApplyDistributorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelSupplierId)) {
            body.put("ChannelSupplierId", request.channelSupplierId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelSupplierName)) {
            body.put("ChannelSupplierName", request.channelSupplierName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractor)) {
            body.put("Contractor", request.contractor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorName)) {
            body.put("DistributorName", request.distributorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityInfo)) {
            body.put("EntityInfo", request.entityInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.industry)) {
            body.put("Industry", request.industry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preference)) {
            body.put("Preference", request.preference);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scale)) {
            body.put("Scale", request.scale);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDistributor"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDistributorResponse());
    }

    public ApplyDistributorResponse applyDistributor(ApplyDistributorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyDistributorWithOptions(request, runtime);
    }

    public ApplyDistributorMallResponse applyDistributorMallWithOptions(ApplyDistributorMallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributionMallType)) {
            body.put("DistributionMallType", request.distributionMallType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDistributorMall"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDistributorMallResponse());
    }

    public ApplyDistributorMallResponse applyDistributorMall(ApplyDistributorMallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyDistributorMallWithOptions(request, runtime);
    }

    public CheckAccountResponse checkAccountWithOptions(CheckAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckAccount"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckAccountResponse());
    }

    public CheckAccountResponse checkAccount(CheckAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkAccountWithOptions(request, runtime);
    }

    public CheckDomainDnsTxtResponse checkDomainDnsTxtWithOptions(CheckDomainDnsTxtRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckDomainDnsTxt"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckDomainDnsTxtResponse());
    }

    public CheckDomainDnsTxtResponse checkDomainDnsTxt(CheckDomainDnsTxtRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDomainDnsTxtWithOptions(request, runtime);
    }

    public CheckItemMarketingStatusResponse checkItemMarketingStatusWithOptions(CheckItemMarketingStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckItemMarketingStatus"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckItemMarketingStatusResponse());
    }

    public CheckItemMarketingStatusResponse checkItemMarketingStatus(CheckItemMarketingStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkItemMarketingStatusWithOptions(request, runtime);
    }

    public CreateBusinessResponse createBusinessWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBusiness"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBusinessResponse());
    }

    public CreateBusinessResponse createBusiness() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBusinessWithOptions(runtime);
    }

    public CreateCouponTemplateResponse createCouponTemplateWithOptions(CreateCouponTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCouponTemplateShrinkRequest request = new CreateCouponTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.couponTemplateDTO))) {
            request.couponTemplateDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.couponTemplateDTO), "CouponTemplateDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateDTOShrink)) {
            body.put("CouponTemplateDTO", request.couponTemplateDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCouponTemplate"),
            new TeaPair("version", "2021-09-01"),
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

    public CreateCouponTemplateResponse createCouponTemplate(CreateCouponTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCouponTemplateWithOptions(request, runtime);
    }

    public CreatePointExchangeRuleResponse createPointExchangeRuleWithOptions(CreatePointExchangeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateIdList)) {
            body.put("CouponTemplateIdList", request.couponTemplateIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointAmount)) {
            body.put("PointAmount", request.pointAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePointExchangeRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePointExchangeRuleResponse());
    }

    public CreatePointExchangeRuleResponse createPointExchangeRule(CreatePointExchangeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPointExchangeRuleWithOptions(request, runtime);
    }

    public CreateRainbowDistributionMallResponse createRainbowDistributionMallWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRainbowDistributionMall"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRainbowDistributionMallResponse());
    }

    public CreateRainbowDistributionMallResponse createRainbowDistributionMall() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRainbowDistributionMallWithOptions(runtime);
    }

    public CreateRelationResponse createRelationWithOptions(CreateRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            body.put("MallId", request.mallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRelation"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRelationResponse());
    }

    public CreateRelationResponse createRelation(CreateRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRelationWithOptions(request, runtime);
    }

    public CreateShopResponse createShopWithOptions(CreateShopRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateShopShrinkRequest request = new CreateShopShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.extInfo)) {
            request.extInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.extInfo, "ExtInfo", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.extInfoShrink)) {
            query.put("ExtInfo", request.extInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbShopDescription)) {
            query.put("TbShopDescription", request.tbShopDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbShopId)) {
            query.put("TbShopId", request.tbShopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tbShopName)) {
            query.put("TbShopName", request.tbShopName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("Token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateShop"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateShopResponse());
    }

    public CreateShopResponse createShop(CreateShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createShopWithOptions(request, runtime);
    }

    public CreateTransactionResponse createTransactionWithOptions(CreateTransactionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptElectronicInvoice)) {
            body.put("AcceptElectronicInvoice", request.acceptElectronicInvoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.address)) {
            body.put("Address", request.address);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aliasName)) {
            body.put("AliasName", request.aliasName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoInvoice)) {
            body.put("AutoInvoice", request.autoInvoice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankAccount)) {
            body.put("BankAccount", request.bankAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bankName)) {
            body.put("BankName", request.bankName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certName)) {
            body.put("CertName", request.certName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certNo)) {
            body.put("CertNo", request.certNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.certType)) {
            body.put("CertType", request.certType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cityCode)) {
            body.put("CityCode", request.cityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactMobile)) {
            body.put("ContactMobile", request.contactMobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactName)) {
            body.put("ContactName", request.contactName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactTag)) {
            body.put("ContactTag", request.contactTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contactType)) {
            body.put("ContactType", request.contactType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.districtCode)) {
            body.put("DistrictCode", request.districtCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idType)) {
            body.put("IdType", request.idType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceAddress)) {
            body.put("InvoiceAddress", request.invoiceAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invoiceTelephone)) {
            body.put("InvoiceTelephone", request.invoiceTelephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMiniStyle)) {
            body.put("IsMiniStyle", request.isMiniStyle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalCertImage)) {
            body.put("LegalCertImage", request.legalCertImage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalCertNo)) {
            body.put("LegalCertNo", request.legalCertNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalCertType)) {
            body.put("LegalCertType", request.legalCertType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.legalName)) {
            body.put("LegalName", request.legalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailAddress)) {
            body.put("MailAddress", request.mailAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailCityCode)) {
            body.put("MailCityCode", request.mailCityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailDistrictCode)) {
            body.put("MailDistrictCode", request.mailDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailName)) {
            body.put("MailName", request.mailName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailProvinceCode)) {
            body.put("MailProvinceCode", request.mailProvinceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mailTelephone)) {
            body.put("MailTelephone", request.mailTelephone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merchantType)) {
            body.put("MerchantType", request.merchantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.onlyInvoiceInfo)) {
            body.put("OnlyInvoiceInfo", request.onlyInvoiceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDoorImages)) {
            body.put("OutDoorImages", request.outDoorImages);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outerMerchantId)) {
            body.put("OuterMerchantId", request.outerMerchantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payLoginId)) {
            body.put("PayLoginId", request.payLoginId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provinceCode)) {
            body.put("ProvinceCode", request.provinceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scene)) {
            body.put("Scene", request.scene);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sellerId)) {
            body.put("SellerId", request.sellerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicePhone)) {
            body.put("ServicePhone", request.servicePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signTimeWithIsv)) {
            body.put("SignTimeWithIsv", request.signTimeWithIsv);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxNo)) {
            body.put("TaxNo", request.taxNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxPayerQualification)) {
            body.put("TaxPayerQualification", request.taxPayerQualification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taxPayerValidation)) {
            body.put("TaxPayerValidation", request.taxPayerValidation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withInvoice)) {
            body.put("WithInvoice", request.withInvoice);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTransaction"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTransactionResponse());
    }

    public CreateTransactionResponse createTransaction(CreateTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTransactionWithOptions(request, runtime);
    }

    public DeletePointExchangeRuleResponse deletePointExchangeRuleWithOptions(DeletePointExchangeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleIdList)) {
            body.put("RuleIdList", request.ruleIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePointExchangeRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePointExchangeRuleResponse());
    }

    public DeletePointExchangeRuleResponse deletePointExchangeRule(DeletePointExchangeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePointExchangeRuleWithOptions(request, runtime);
    }

    public DeletePointGrantRuleResponse deletePointGrantRuleWithOptions(DeletePointGrantRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePointGrantRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePointGrantRuleResponse());
    }

    public DeletePointGrantRuleResponse deletePointGrantRule(DeletePointGrantRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePointGrantRuleWithOptions(request, runtime);
    }

    public DownShelfItemsResponse downShelfItemsWithOptions(DownShelfItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIds)) {
            body.put("ItemIds", request.itemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownShelfItems"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownShelfItemsResponse());
    }

    public DownShelfItemsResponse downShelfItems(DownShelfItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downShelfItemsWithOptions(request, runtime);
    }

    public EditSkusResponse editSkusWithOptions(EditSkusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.descOption)) {
            body.put("DescOption", request.descOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstPicUrl)) {
            body.put("FirstPicUrl", request.firstPicUrl);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageList)) {
            bodyFlat.put("ImageList", request.imageList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.picUrl)) {
            body.put("PicUrl", request.picUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skus)) {
            bodyFlat.put("Skus", request.skus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditSkus"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditSkusResponse());
    }

    public EditSkusResponse editSkus(EditSkusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editSkusWithOptions(request, runtime);
    }

    public EnableTemporaryDomainResponse enableTemporaryDomainWithOptions(EnableTemporaryDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableTemporaryDomain"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableTemporaryDomainResponse());
    }

    public EnableTemporaryDomainResponse enableTemporaryDomain(EnableTemporaryDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableTemporaryDomainWithOptions(request, runtime);
    }

    public GetBusinessAnalysisResponse getBusinessAnalysisWithOptions(GetBusinessAnalysisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dateType)) {
            body.put("DateType", request.dateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupTags)) {
            body.put("GroupTags", request.groupTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indexTags)) {
            body.put("IndexTags", request.indexTags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBusinessAnalysis"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBusinessAnalysisResponse());
    }

    public GetBusinessAnalysisResponse getBusinessAnalysis(GetBusinessAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBusinessAnalysisWithOptions(request, runtime);
    }

    public GetContractContentResponse getContractContentWithOptions(GetContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContractContent"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContractContentResponse());
    }

    public GetContractContentResponse getContractContent(GetContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getContractContentWithOptions(request, runtime);
    }

    public GetContractProgressResponse getContractProgressWithOptions(GetContractProgressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetContractProgress"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetContractProgressResponse());
    }

    public GetContractProgressResponse getContractProgress(GetContractProgressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getContractProgressWithOptions(request, runtime);
    }

    public GetCouponItemSaleStdResponse getCouponItemSaleStdWithOptions(GetCouponItemSaleStdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponPlatformType)) {
            body.put("CouponPlatformType", request.couponPlatformType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateCd)) {
            body.put("CouponTemplateCd", request.couponTemplateCd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            body.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByMethod)) {
            body.put("OrderByMethod", request.orderByMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCouponItemSaleStd"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCouponItemSaleStdResponse());
    }

    public GetCouponItemSaleStdResponse getCouponItemSaleStd(GetCouponItemSaleStdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCouponItemSaleStdWithOptions(request, runtime);
    }

    public GetCouponSaleStdResponse getCouponSaleStdWithOptions(GetCouponSaleStdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizDate)) {
            body.put("BizDate", request.bizDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponPlatformType)) {
            body.put("CouponPlatformType", request.couponPlatformType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateCd)) {
            body.put("CouponTemplateCd", request.couponTemplateCd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCouponSaleStd"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCouponSaleStdResponse());
    }

    public GetCouponSaleStdResponse getCouponSaleStd(GetCouponSaleStdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCouponSaleStdWithOptions(request, runtime);
    }

    public GetDeductionInfoResponse getDeductionInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeductionInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeductionInfoResponse());
    }

    public GetDeductionInfoResponse getDeductionInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeductionInfoWithOptions(runtime);
    }

    public GetDeductionUrlResponse getDeductionUrlWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeductionUrl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeductionUrlResponse());
    }

    public GetDeductionUrlResponse getDeductionUrl() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeductionUrlWithOptions(runtime);
    }

    public GetDistributorSignatureUrlResponse getDistributorSignatureUrlWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDistributorSignatureUrl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDistributorSignatureUrlResponse());
    }

    public GetDistributorSignatureUrlResponse getDistributorSignatureUrl() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDistributorSignatureUrlWithOptions(runtime);
    }

    public GetDivisionListResponse getDivisionListWithOptions(GetDivisionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDivisionList"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDivisionListResponse());
    }

    public GetDivisionListResponse getDivisionList(GetDivisionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDivisionListWithOptions(request, runtime);
    }

    public GetDomainResponse getDomainWithOptions(GetDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    public GetDomainResponse getDomain(GetDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainWithOptions(request, runtime);
    }

    public GetDomainDnsTxtResponse getDomainDnsTxtWithOptions(GetDomainDnsTxtRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainDnsTxt"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainDnsTxtResponse());
    }

    public GetDomainDnsTxtResponse getDomainDnsTxt(GetDomainDnsTxtRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainDnsTxtWithOptions(request, runtime);
    }

    public GetItemDetailResponse getItemDetailWithOptions(GetItemDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetItemDetail"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetItemDetailResponse());
    }

    public GetItemDetailResponse getItemDetail(GetItemDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getItemDetailWithOptions(request, runtime);
    }

    public GetMallConfigResponse getMallConfigWithOptions(GetMallConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMallConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMallConfigResponse());
    }

    public GetMallConfigResponse getMallConfig(GetMallConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMallConfigWithOptions(request, runtime);
    }

    public GetPointCommonRuleResponse getPointCommonRuleWithOptions(GetPointCommonRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPointCommonRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPointCommonRuleResponse());
    }

    public GetPointCommonRuleResponse getPointCommonRule(GetPointCommonRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPointCommonRuleWithOptions(request, runtime);
    }

    public GetTaobaoLoginUrlResponse getTaobaoLoginUrlWithOptions(GetTaobaoLoginUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaobaoLoginUrl"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaobaoLoginUrlResponse());
    }

    public GetTaobaoLoginUrlResponse getTaobaoLoginUrl(GetTaobaoLoginUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaobaoLoginUrlWithOptions(request, runtime);
    }

    public GetTokenInfoResponse getTokenInfoWithOptions(GetTokenInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenInfoResponse());
    }

    public GetTokenInfoResponse getTokenInfo(GetTokenInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTokenInfoWithOptions(request, runtime);
    }

    public GetUserStatusResponse getUserStatusWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserStatus"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserStatusResponse());
    }

    public GetUserStatusResponse getUserStatus() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserStatusWithOptions(runtime);
    }

    public ListAvailableRuleCouponTemplatesResponse listAvailableRuleCouponTemplatesWithOptions(ListAvailableRuleCouponTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableRuleCouponTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableRuleCouponTemplatesResponse());
    }

    public ListAvailableRuleCouponTemplatesResponse listAvailableRuleCouponTemplates(ListAvailableRuleCouponTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAvailableRuleCouponTemplatesWithOptions(request, runtime);
    }

    public ListBindShopResponse listBindShopWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindShop"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindShopResponse());
    }

    public ListBindShopResponse listBindShop() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBindShopWithOptions(runtime);
    }

    public ListBusinessResponse listBusinessWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBusiness"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBusinessResponse());
    }

    public ListBusinessResponse listBusiness() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listBusinessWithOptions(runtime);
    }

    public ListChannelSupplierResponse listChannelSupplierWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListChannelSupplier"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListChannelSupplierResponse());
    }

    public ListChannelSupplierResponse listChannelSupplier() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listChannelSupplierWithOptions(runtime);
    }

    public ListCollectionAccountInfoResponse listCollectionAccountInfoWithOptions(ListCollectionAccountInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCollectionAccountInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCollectionAccountInfoResponse());
    }

    public ListCollectionAccountInfoResponse listCollectionAccountInfo(ListCollectionAccountInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCollectionAccountInfoWithOptions(request, runtime);
    }

    public ListContractResponse listContractWithOptions(ListContractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListContract"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListContractResponse());
    }

    public ListContractResponse listContract(ListContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listContractWithOptions(request, runtime);
    }

    public ListCouponTemplateResponse listCouponTemplateWithOptions(ListCouponTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCouponTemplateShrinkRequest request = new ListCouponTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.queryCouponTemplateListDTO))) {
            request.queryCouponTemplateListDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.queryCouponTemplateListDTO), "QueryCouponTemplateListDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCouponTemplateListDTOShrink)) {
            body.put("QueryCouponTemplateListDTO", request.queryCouponTemplateListDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCouponTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCouponTemplateResponse());
    }

    public ListCouponTemplateResponse listCouponTemplate(ListCouponTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCouponTemplateWithOptions(request, runtime);
    }

    public ListDeductionResponse listDeductionWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDeduction"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDeductionResponse());
    }

    public ListDeductionResponse listDeduction() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeductionWithOptions(runtime);
    }

    public ListDistributorMallResponse listDistributorMallWithOptions(ListDistributorMallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDistributorMall"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDistributorMallResponse());
    }

    public ListDistributorMallResponse listDistributorMall(ListDistributorMallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributorMallWithOptions(request, runtime);
    }

    public ListOrderResponse listOrderWithOptions(ListOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrder"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrderResponse());
    }

    public ListOrderResponse listOrder(ListOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrderWithOptions(request, runtime);
    }

    public ListPaymentStatementResponse listPaymentStatementWithOptions(ListPaymentStatementRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payDateEnd)) {
            query.put("PayDateEnd", request.payDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payDateStart)) {
            query.put("PayDateStart", request.payDateStart);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPaymentStatement"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPaymentStatementResponse());
    }

    public ListPaymentStatementResponse listPaymentStatement(ListPaymentStatementRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPaymentStatementWithOptions(request, runtime);
    }

    public ListPaymentStatementDetailsResponse listPaymentStatementDetailsWithOptions(ListPaymentStatementDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCd)) {
            query.put("OrderCd", request.orderCd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDateEnd)) {
            query.put("OrderDateEnd", request.orderDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderDateStart)) {
            query.put("OrderDateStart", request.orderDateStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderFrom)) {
            query.put("OrderFrom", request.orderFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payChannelType)) {
            query.put("PayChannelType", request.payChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platOrderCd)) {
            query.put("PlatOrderCd", request.platOrderCd);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPaymentStatementDetails"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPaymentStatementDetailsResponse());
    }

    public ListPaymentStatementDetailsResponse listPaymentStatementDetails(ListPaymentStatementDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPaymentStatementDetailsWithOptions(request, runtime);
    }

    public ListPointExchangeRulesResponse listPointExchangeRulesWithOptions(ListPointExchangeRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByField)) {
            body.put("OrderByField", request.orderByField);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByMethod)) {
            body.put("OrderByMethod", request.orderByMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKeyword)) {
            body.put("SearchKeyword", request.searchKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPointExchangeRules"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPointExchangeRulesResponse());
    }

    public ListPointExchangeRulesResponse listPointExchangeRules(ListPointExchangeRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPointExchangeRulesWithOptions(request, runtime);
    }

    public ListReverseOrderResponse listReverseOrderWithOptions(ListReverseOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListReverseOrder"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReverseOrderResponse());
    }

    public ListReverseOrderResponse listReverseOrder(ListReverseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listReverseOrderWithOptions(request, runtime);
    }

    public ListRuleCouponTemplatesResponse listRuleCouponTemplatesWithOptions(ListRuleCouponTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRuleCouponTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRuleCouponTemplatesResponse());
    }

    public ListRuleCouponTemplatesResponse listRuleCouponTemplates(ListRuleCouponTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleCouponTemplatesWithOptions(request, runtime);
    }

    public ListSettlementStatusResponse listSettlementStatusWithOptions(ListSettlementStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.merchantType)) {
            body.put("MerchantType", request.merchantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusType)) {
            body.put("StatusType", request.statusType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSettlementStatus"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSettlementStatusResponse());
    }

    public ListSettlementStatusResponse listSettlementStatus(ListSettlementStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSettlementStatusWithOptions(request, runtime);
    }

    public ListShopResponse listShopWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListShop"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListShopResponse());
    }

    public ListShopResponse listShop() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listShopWithOptions(runtime);
    }

    public ListStoreItemsResponse listStoreItemsWithOptions(ListStoreItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelOptionItemId)) {
            body.put("ChannelOptionItemId", request.channelOptionItemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endEnterWarehouseTime)) {
            body.put("EndEnterWarehouseTime", request.endEnterWarehouseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemCatagoryId)) {
            body.put("ItemCatagoryId", request.itemCatagoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemGroupId)) {
            body.put("ItemGroupId", request.itemGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            body.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startEnterWarehouseTime)) {
            body.put("StartEnterWarehouseTime", request.startEnterWarehouseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            body.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStoreItems"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStoreItemsResponse());
    }

    public ListStoreItemsResponse listStoreItems(ListStoreItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStoreItemsWithOptions(request, runtime);
    }

    public ListStoresResponse listStoresWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStores"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStoresResponse());
    }

    public ListStoresResponse listStores() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStoresWithOptions(runtime);
    }

    public ListTransactionResponse listTransactionWithOptions(ListTransactionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTransaction"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTransactionResponse());
    }

    public ListTransactionResponse listTransaction(ListTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTransactionWithOptions(request, runtime);
    }

    public ModifyDistributorMallResponse modifyDistributorMallWithOptions(ModifyDistributorMallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distributorMallDescription)) {
            body.put("DistributorMallDescription", request.distributorMallDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorMallId)) {
            body.put("DistributorMallId", request.distributorMallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distributorMallName)) {
            body.put("DistributorMallName", request.distributorMallName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDistributorMall"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDistributorMallResponse());
    }

    public ModifyDistributorMallResponse modifyDistributorMall(ModifyDistributorMallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDistributorMallWithOptions(request, runtime);
    }

    public ModifyItemResponse modifyItemWithOptions(ModifyItemRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIdsJson)) {
            query.put("ItemIdsJson", request.itemIdsJson);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyItem"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyItemResponse());
    }

    public ModifyItemResponse modifyItem(ModifyItemRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyItemWithOptions(request, runtime);
    }

    public ModifyShopResponse modifyShopWithOptions(ModifyShopRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            query.put("StoreId", request.storeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.title)) {
            query.put("Title", request.title);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyShop"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyShopResponse());
    }

    public ModifyShopResponse modifyShop(ModifyShopRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyShopWithOptions(request, runtime);
    }

    public PackageLightAppResponse packageLightAppWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PackageLightApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PackageLightAppResponse());
    }

    public PackageLightAppResponse packageLightApp() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.packageLightAppWithOptions(runtime);
    }

    public QueryCouponTemplateCountDetailResponse queryCouponTemplateCountDetailWithOptions(QueryCouponTemplateCountDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateId)) {
            body.put("CouponTemplateId", request.couponTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTag)) {
            body.put("QueryTag", request.queryTag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCouponTemplateCountDetail"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCouponTemplateCountDetailResponse());
    }

    public QueryCouponTemplateCountDetailResponse queryCouponTemplateCountDetail(QueryCouponTemplateCountDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCouponTemplateCountDetailWithOptions(request, runtime);
    }

    public QueryCouponTemplateDetailResponse queryCouponTemplateDetailWithOptions(QueryCouponTemplateDetailRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCouponTemplateDetailShrinkRequest request = new QueryCouponTemplateDetailShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.queryCouponTemplateDetailDTO))) {
            request.queryCouponTemplateDetailDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.queryCouponTemplateDetailDTO), "QueryCouponTemplateDetailDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCouponTemplateDetailDTOShrink)) {
            body.put("QueryCouponTemplateDetailDTO", request.queryCouponTemplateDetailDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCouponTemplateDetail"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCouponTemplateDetailResponse());
    }

    public QueryCouponTemplateDetailResponse queryCouponTemplateDetail(QueryCouponTemplateDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCouponTemplateDetailWithOptions(request, runtime);
    }

    public QueryPointGrantRuleResponse queryPointGrantRuleWithOptions(QueryPointGrantRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryPointGrantRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryPointGrantRuleResponse());
    }

    public QueryPointGrantRuleResponse queryPointGrantRule(QueryPointGrantRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPointGrantRuleWithOptions(request, runtime);
    }

    public RemoveDomainResponse removeDomainWithOptions(RemoveDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveDomain"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveDomainResponse());
    }

    public RemoveDomainResponse removeDomain(RemoveDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeDomainWithOptions(request, runtime);
    }

    public SetDomainResponse setDomainWithOptions(SetDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDomain"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDomainResponse());
    }

    public SetDomainResponse setDomain(SetDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDomainWithOptions(request, runtime);
    }

    public SignContractResponse signContractWithOptions(SignContractRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contractId)) {
            query.put("ContractId", request.contractId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.origin)) {
            query.put("Origin", request.origin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.signContent)) {
            query.put("SignContent", request.signContent);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SignContract"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SignContractResponse());
    }

    public SignContractResponse signContract(SignContractRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.signContractWithOptions(request, runtime);
    }

    public SyncItemsResponse syncItemsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncItems"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncItemsResponse());
    }

    public SyncItemsResponse syncItems() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncItemsWithOptions(runtime);
    }

    public UpShelfItemsResponse upShelfItemsWithOptions(UpShelfItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemIds)) {
            body.put("ItemIds", request.itemIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storeId)) {
            body.put("StoreId", request.storeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpShelfItems"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpShelfItemsResponse());
    }

    public UpShelfItemsResponse upShelfItems(UpShelfItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upShelfItemsWithOptions(request, runtime);
    }

    public UpdateCertResponse updateCertWithOptions(UpdateCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCert"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCertResponse());
    }

    public UpdateCertResponse updateCert(UpdateCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCertWithOptions(request, runtime);
    }

    public UpdateCouponTemplateResponse updateCouponTemplateWithOptions(UpdateCouponTemplateRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCouponTemplateShrinkRequest request = new UpdateCouponTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.couponTemplateDTO))) {
            request.couponTemplateDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.couponTemplateDTO), "CouponTemplateDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateDTOShrink)) {
            body.put("CouponTemplateDTO", request.couponTemplateDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCouponTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCouponTemplateResponse());
    }

    public UpdateCouponTemplateResponse updateCouponTemplate(UpdateCouponTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCouponTemplateWithOptions(request, runtime);
    }

    public UpdateCouponTemplateStatusResponse updateCouponTemplateStatusWithOptions(UpdateCouponTemplateStatusRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCouponTemplateStatusShrinkRequest request = new UpdateCouponTemplateStatusShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.couponTemplateStatusDTO))) {
            request.couponTemplateStatusDTOShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.couponTemplateStatusDTO), "CouponTemplateStatusDTO", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateStatusDTOShrink)) {
            body.put("CouponTemplateStatusDTO", request.couponTemplateStatusDTOShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCouponTemplateStatus"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCouponTemplateStatusResponse());
    }

    public UpdateCouponTemplateStatusResponse updateCouponTemplateStatus(UpdateCouponTemplateStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCouponTemplateStatusWithOptions(request, runtime);
    }

    public UpdateMallConfigResponse updateMallConfigWithOptions(UpdateMallConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channel)) {
            query.put("Channel", request.channel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mallId)) {
            query.put("MallId", request.mallId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            query.put("Params", request.params);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMallConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMallConfigResponse());
    }

    public UpdateMallConfigResponse updateMallConfig(UpdateMallConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateMallConfigWithOptions(request, runtime);
    }

    public UpdatePointCommonRuleResponse updatePointCommonRuleWithOptions(UpdatePointCommonRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveInterval)) {
            body.put("EffectiveInterval", request.effectiveInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTime)) {
            body.put("EffectiveTime", request.effectiveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeUnit)) {
            body.put("EffectiveTimeUnit", request.effectiveTimeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveType)) {
            body.put("EffectiveType", request.effectiveType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitInterval)) {
            body.put("LimitInterval", request.limitInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.limitStatus)) {
            body.put("LimitStatus", request.limitStatus);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePointCommonRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePointCommonRuleResponse());
    }

    public UpdatePointCommonRuleResponse updatePointCommonRule(UpdatePointCommonRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePointCommonRuleWithOptions(request, runtime);
    }

    public UpdatePointExchangeRuleResponse updatePointExchangeRuleWithOptions(UpdatePointExchangeRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.couponTemplateIdList)) {
            body.put("CouponTemplateIdList", request.couponTemplateIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointAmount)) {
            body.put("PointAmount", request.pointAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            body.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            body.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            body.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePointExchangeRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePointExchangeRuleResponse());
    }

    public UpdatePointExchangeRuleResponse updatePointExchangeRule(UpdatePointExchangeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePointExchangeRuleWithOptions(request, runtime);
    }

    public UpdatePointGrantRuleResponse updatePointGrantRuleWithOptions(UpdatePointGrantRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pointAmount)) {
            body.put("PointAmount", request.pointAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAmount)) {
            body.put("StartAmount", request.startAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.typeCode)) {
            body.put("TypeCode", request.typeCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePointGrantRule"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePointGrantRuleResponse());
    }

    public UpdatePointGrantRuleResponse updatePointGrantRule(UpdatePointGrantRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePointGrantRuleWithOptions(request, runtime);
    }
}
