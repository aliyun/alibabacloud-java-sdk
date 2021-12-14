// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20190715;

import com.aliyun.tea.*;
import com.aliyun.aiccs20190715.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("aiccs", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public Apply400ManagerIdentifyResponse apply400ManagerIdentifyWithOptions(Apply400ManagerIdentifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Empowerment", request.empowerment);
        query.put("ManagerCertEffDate", request.managerCertEffDate);
        query.put("ManagerCertExpDate", request.managerCertExpDate);
        query.put("ManagerCertNumber", request.managerCertNumber);
        query.put("ManagerCertPic", request.managerCertPic);
        query.put("ManagerCertType", request.managerCertType);
        query.put("ManagerMobilePhone", request.managerMobilePhone);
        query.put("ManagerName", request.managerName);
        query.put("Number", request.number);
        query.put("OldOrderId", request.oldOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SupplementaryMaterial", request.supplementaryMaterial);
        query.put("UnifiedstandardAgreement", request.unifiedstandardAgreement);
        query.put("WttorderId", request.wttorderId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Apply400ManagerIdentify"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Apply400ManagerIdentifyResponse());
    }

    public Apply400ManagerIdentifyResponse apply400ManagerIdentify(Apply400ManagerIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.apply400ManagerIdentifyWithOptions(request, runtime);
    }

    public Apply400QualificationResponse apply400QualificationWithOptions(Apply400QualificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ApplyRemark", request.applyRemark);
        query.put("BusinessLicensePic", request.businessLicensePic);
        query.put("CorpCertNumber", request.corpCertNumber);
        query.put("CorpCertType", request.corpCertType);
        query.put("CorpName", request.corpName);
        query.put("CorpNumber", request.corpNumber);
        query.put("CorpRegisteredAddrArea", request.corpRegisteredAddrArea);
        query.put("CorpRegisteredAddrCity", request.corpRegisteredAddrCity);
        query.put("CorpRegisteredAddrDetail", request.corpRegisteredAddrDetail);
        query.put("CorpRegisteredAddrProv", request.corpRegisteredAddrProv);
        query.put("CorpRegisteredEffDate", request.corpRegisteredEffDate);
        query.put("CorpRegisteredExpDate", request.corpRegisteredExpDate);
        query.put("LegalPersonCertEffDate", request.legalPersonCertEffDate);
        query.put("LegalPersonCertExpDate", request.legalPersonCertExpDate);
        query.put("LegalPersonCertNumber", request.legalPersonCertNumber);
        query.put("LegalPersonCertPic", request.legalPersonCertPic);
        query.put("LegalPersonCertType", request.legalPersonCertType);
        query.put("LegalPersonName", request.legalPersonName);
        query.put("LegalPersonPhoneNumber", request.legalPersonPhoneNumber);
        query.put("OldOrderId", request.oldOrderId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecId", request.specId);
        query.put("SpecIdArray", request.specIdArray);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Apply400Qualification"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Apply400QualificationResponse());
    }

    public Apply400QualificationResponse apply400Qualification(Apply400QualificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.apply400QualificationWithOptions(request, runtime);
    }

    public ApplyDownloadQualificationsResponse applyDownloadQualificationsWithOptions(ApplyDownloadQualificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("QualificationType", request.qualificationType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("specId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyDownloadQualifications"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyDownloadQualificationsResponse());
    }

    public ApplyDownloadQualificationsResponse applyDownloadQualifications(ApplyDownloadQualificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyDownloadQualificationsWithOptions(request, runtime);
    }

    public ApplyExpandSpecResponse applyExpandSpecWithOptions(ApplyExpandSpecRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyExpandSpec"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyExpandSpecResponse());
    }

    public ApplyExpandSpecResponse applyExpandSpec(ApplyExpandSpecRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyExpandSpecWithOptions(request, runtime);
    }

    public ApplyProcedureSceneResponse applyProcedureSceneWithOptions(ApplyProcedureSceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyProcedureScene"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyProcedureSceneResponse());
    }

    public ApplyProcedureSceneResponse applyProcedureScene(ApplyProcedureSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyProcedureSceneWithOptions(request, runtime);
    }

    public ApplyQualificationResponse applyQualificationWithOptions(ApplyQualificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyQualification"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyQualificationResponse());
    }

    public ApplyQualificationResponse applyQualification(ApplyQualificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyQualificationWithOptions(request, runtime);
    }

    public ApplyUpgradeNumberResponse applyUpgradeNumberWithOptions(ApplyUpgradeNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyUpgradeNumber"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyUpgradeNumberResponse());
    }

    public ApplyUpgradeNumberResponse applyUpgradeNumber(ApplyUpgradeNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyUpgradeNumberWithOptions(request, runtime);
    }

    public Buy400NumberResponse buy400NumberWithOptions(Buy400NumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("GuaranteedPackageLevel", request.guaranteedPackageLevel);
        query.put("MonthlyPrice", request.monthlyPrice);
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RealNameInsId", request.realNameInsId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Buy400Number"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Buy400NumberResponse());
    }

    public Buy400NumberResponse buy400Number(Buy400NumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.buy400NumberWithOptions(request, runtime);
    }

    public BuyNumberResponse buyNumberWithOptions(BuyNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("GuaranteedPackageLevel", request.guaranteedPackageLevel);
        query.put("IsCuteNumber", request.isCuteNumber);
        query.put("LevelId", request.levelId);
        query.put("MonthlyPrice", request.monthlyPrice);
        query.put("NumberArray", request.numberArray);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RealNameInsId", request.realNameInsId);
        query.put("RegionNameCity", request.regionNameCity);
        query.put("RegionNameProvince", request.regionNameProvince);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuyNumber"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuyNumberResponse());
    }

    public BuyNumberResponse buyNumber(BuyNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.buyNumberWithOptions(request, runtime);
    }

    public CheckRamAuthResponse checkRamAuthWithOptions(CheckRamAuthRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckRamAuth"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckRamAuthResponse());
    }

    public CheckRamAuthResponse checkRamAuth(CheckRamAuthRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkRamAuthWithOptions(request, runtime);
    }

    public CountNormalCorpIdentifyResponse countNormalCorpIdentifyWithOptions(CountNormalCorpIdentifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CountNormalCorpIdentify"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CountNormalCorpIdentifyResponse());
    }

    public CountNormalCorpIdentifyResponse countNormalCorpIdentify(CountNormalCorpIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.countNormalCorpIdentifyWithOptions(request, runtime);
    }

    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("Email", request.email);
        query.put("Id", request.id);
        query.put("OwnerId", request.ownerId);
        query.put("PersonName", request.personName);
        query.put("Phone", request.phone);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    public CreateAiccsInstanceResponse createAiccsInstanceWithOptions(CreateAiccsInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountIds", request.accountIds);
        query.put("Id", request.id);
        query.put("InstanceCode", request.instanceCode);
        query.put("InstanceName", request.instanceName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("Remark", request.remark);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("ViewUrl", request.viewUrl);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAiccsInstance"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAiccsInstanceResponse());
    }

    public CreateAiccsInstanceResponse createAiccsInstance(CreateAiccsInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAiccsInstanceWithOptions(request, runtime);
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterDataWithOptions(CreateOuterCallCenterDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOuterCallCenterData"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOuterCallCenterDataResponse());
    }

    public CreateOuterCallCenterDataResponse createOuterCallCenterData(CreateOuterCallCenterDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOuterCallCenterDataWithOptions(request, runtime);
    }

    public Delete400QualificationResponse delete400QualificationWithOptions(Delete400QualificationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderIds", request.orderIds);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Delete400Qualification"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Delete400QualificationResponse());
    }

    public Delete400QualificationResponse delete400Qualification(Delete400QualificationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.delete400QualificationWithOptions(request, runtime);
    }

    public Destory400NumberResponse destory400NumberWithOptions(Destory400NumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RealNameInsId", request.realNameInsId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Destory400Number"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Destory400NumberResponse());
    }

    public Destory400NumberResponse destory400Number(Destory400NumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destory400NumberWithOptions(request, runtime);
    }

    public DestoryNumberResponse destoryNumberWithOptions(DestoryNumberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RealNameInsId", request.realNameInsId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestoryNumber"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestoryNumberResponse());
    }

    public DestoryNumberResponse destoryNumber(DestoryNumberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.destoryNumberWithOptions(request, runtime);
    }

    public DownloadCallCostDetailResponse downloadCallCostDetailWithOptions(DownloadCallCostDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillCycle", request.billCycle);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadCallCostDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadCallCostDetailResponse());
    }

    public DownloadCallCostDetailResponse downloadCallCostDetail(DownloadCallCostDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadCallCostDetailWithOptions(request, runtime);
    }

    public Get400CorpPdfOssUrlResponse get400CorpPdfOssUrlWithOptions(Get400CorpPdfOssUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("ManagerCertEffDate", request.managerCertEffDate);
        query.put("ManagerCertExpDate", request.managerCertExpDate);
        query.put("ManagerCertNumber", request.managerCertNumber);
        query.put("ManagerCertPic", request.managerCertPic);
        query.put("ManagerCertType", request.managerCertType);
        query.put("ManagerMobilePhone", request.managerMobilePhone);
        query.put("ManagerName", request.managerName);
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Get400CorpPdfOssUrl"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Get400CorpPdfOssUrlResponse());
    }

    public Get400CorpPdfOssUrlResponse get400CorpPdfOssUrl(Get400CorpPdfOssUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.get400CorpPdfOssUrlWithOptions(request, runtime);
    }

    public GetHotlineSessionIdResponse getHotlineSessionIdWithOptions(GetHotlineSessionIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("CalledNumber", request.calledNumber);
        query.put("CallingNumber", request.callingNumber);
        query.put("InstanceId", request.instanceId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHotlineSessionId"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHotlineSessionIdResponse());
    }

    public GetHotlineSessionIdResponse getHotlineSessionId(GetHotlineSessionIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHotlineSessionIdWithOptions(request, runtime);
    }

    public GetLast400MangerIdentifyResponse getLast400MangerIdentifyWithOptions(GetLast400MangerIdentifyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLast400MangerIdentify"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLast400MangerIdentifyResponse());
    }

    public GetLast400MangerIdentifyResponse getLast400MangerIdentify(GetLast400MangerIdentifyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLast400MangerIdentifyWithOptions(request, runtime);
    }

    public IsOpenAiccsResponse isOpenAiccsWithOptions(IsOpenAiccsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IsOpenAiccs"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IsOpenAiccsResponse());
    }

    public IsOpenAiccsResponse isOpenAiccs(IsOpenAiccsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.isOpenAiccsWithOptions(request, runtime);
    }

    public OpenAiccsResponse openAiccsWithOptions(OpenAiccsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenAiccs"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenAiccsResponse());
    }

    public OpenAiccsResponse openAiccs(OpenAiccsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openAiccsWithOptions(request, runtime);
    }

    public Query400NumberManagerIdentifyDetailResponse query400NumberManagerIdentifyDetailWithOptions(Query400NumberManagerIdentifyDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query400NumberManagerIdentifyDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Query400NumberManagerIdentifyDetailResponse());
    }

    public Query400NumberManagerIdentifyDetailResponse query400NumberManagerIdentifyDetail(Query400NumberManagerIdentifyDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.query400NumberManagerIdentifyDetailWithOptions(request, runtime);
    }

    public Query400QualificationDetailResponse query400QualificationDetailWithOptions(Query400QualificationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OrderId", request.orderId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query400QualificationDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Query400QualificationDetailResponse());
    }

    public Query400QualificationDetailResponse query400QualificationDetail(Query400QualificationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.query400QualificationDetailWithOptions(request, runtime);
    }

    public Query400QualificationListResponse query400QualificationListWithOptions(Query400QualificationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AuditState", request.auditState);
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query400QualificationList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Query400QualificationListResponse());
    }

    public Query400QualificationListResponse query400QualificationList(Query400QualificationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.query400QualificationListWithOptions(request, runtime);
    }

    public Query400RealNameListResponse query400RealNameListWithOptions(Query400RealNameListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query400RealNameList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Query400RealNameListResponse());
    }

    public Query400RealNameListResponse query400RealNameList(Query400RealNameListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.query400RealNameListWithOptions(request, runtime);
    }

    public Query400SpecsResponse query400SpecsWithOptions(Query400SpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Query400Specs"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new Query400SpecsResponse());
    }

    public Query400SpecsResponse query400Specs(Query400SpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.query400SpecsWithOptions(request, runtime);
    }

    public QueryAccountByNameResponse queryAccountByNameWithOptions(QueryAccountByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountByName"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountByNameResponse());
    }

    public QueryAccountByNameResponse queryAccountByName(QueryAccountByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountByNameWithOptions(request, runtime);
    }

    public QueryAccountListResponse queryAccountListWithOptions(QueryAccountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("AccountName", request.accountName);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAccountList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAccountListResponse());
    }

    public QueryAccountListResponse queryAccountList(QueryAccountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAccountListWithOptions(request, runtime);
    }

    public QueryAiccsInstanceListResponse queryAiccsInstanceListWithOptions(QueryAiccsInstanceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BuyStatus", request.buyStatus);
        query.put("InstanceCode", request.instanceCode);
        query.put("InstanceName", request.instanceName);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiccsInstanceList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiccsInstanceListResponse());
    }

    public QueryAiccsInstanceListResponse queryAiccsInstanceList(QueryAiccsInstanceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiccsInstanceListWithOptions(request, runtime);
    }

    public QueryAiccsInstanceOrderListResponse queryAiccsInstanceOrderListWithOptions(QueryAiccsInstanceOrderListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("InstanceId", request.instanceId);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiccsInstanceOrderList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiccsInstanceOrderListResponse());
    }

    public QueryAiccsInstanceOrderListResponse queryAiccsInstanceOrderList(QueryAiccsInstanceOrderListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiccsInstanceOrderListWithOptions(request, runtime);
    }

    public QueryAiccsInstancesResponse queryAiccsInstancesWithOptions(QueryAiccsInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAiccsInstances"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAiccsInstancesResponse());
    }

    public QueryAiccsInstancesResponse queryAiccsInstances(QueryAiccsInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAiccsInstancesWithOptions(request, runtime);
    }

    public QueryAllAccountListResponse queryAllAccountListWithOptions(QueryAllAccountListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryAllAccountList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryAllAccountListResponse());
    }

    public QueryAllAccountListResponse queryAllAccountList(QueryAllAccountListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAllAccountListWithOptions(request, runtime);
    }

    public QueryCallCostDetailResponse queryCallCostDetailWithOptions(QueryCallCostDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillCycle", request.billCycle);
        query.put("ItemId", request.itemId);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SubjectItemId", request.subjectItemId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallCostDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallCostDetailResponse());
    }

    public QueryCallCostDetailResponse queryCallCostDetail(QueryCallCostDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallCostDetailWithOptions(request, runtime);
    }

    public QueryCallCostListResponse queryCallCostListWithOptions(QueryCallCostListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("BillCycle", request.billCycle);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCallCostList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCallCostListResponse());
    }

    public QueryCallCostListResponse queryCallCostList(QueryCallCostListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCallCostListWithOptions(request, runtime);
    }

    public QueryCorpListBySceneResponse queryCorpListBySceneWithOptions(QueryCorpListBySceneRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SceneId", request.sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCorpListByScene"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCorpListBySceneResponse());
    }

    public QueryCorpListBySceneResponse queryCorpListByScene(QueryCorpListBySceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCorpListBySceneWithOptions(request, runtime);
    }

    public QueryCorpNameListByPageResponse queryCorpNameListByPageWithOptions(QueryCorpNameListByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCorpNameListByPage"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCorpNameListByPageResponse());
    }

    public QueryCorpNameListByPageResponse queryCorpNameListByPage(QueryCorpNameListByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCorpNameListByPageWithOptions(request, runtime);
    }

    public QueryCorpNameListFor400Response queryCorpNameListFor400WithOptions(QueryCorpNameListFor400Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCorpNameListFor400"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCorpNameListFor400Response());
    }

    public QueryCorpNameListFor400Response queryCorpNameListFor400(QueryCorpNameListFor400Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCorpNameListFor400WithOptions(request, runtime);
    }

    public QueryCorpsSpecsResponse queryCorpsSpecsWithOptions(QueryCorpsSpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("QualificationType", request.qualificationType);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCorpsSpecs"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCorpsSpecsResponse());
    }

    public QueryCorpsSpecsResponse queryCorpsSpecs(QueryCorpsSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCorpsSpecsWithOptions(request, runtime);
    }

    public QueryDownloadQualificationsResponse queryDownloadQualificationsWithOptions(QueryDownloadQualificationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FileName", request.fileName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDownloadQualifications"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDownloadQualificationsResponse());
    }

    public QueryDownloadQualificationsResponse queryDownloadQualifications(QueryDownloadQualificationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDownloadQualificationsWithOptions(request, runtime);
    }

    public QueryEntryResponse queryEntryWithOptions(QueryEntryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEntry"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEntryResponse());
    }

    public QueryEntryResponse queryEntry(QueryEntryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEntryWithOptions(request, runtime);
    }

    public QueryOrdered400NumberListResponse queryOrdered400NumberListWithOptions(QueryOrdered400NumberListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("Month", request.month);
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrdered400NumberList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrdered400NumberListResponse());
    }

    public QueryOrdered400NumberListResponse queryOrdered400NumberList(QueryOrdered400NumberListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrdered400NumberListWithOptions(request, runtime);
    }

    public QueryOrderedNumberListResponse queryOrderedNumberListWithOptions(QueryOrderedNumberListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("CorpName", request.corpName);
        query.put("Month", request.month);
        query.put("Number", request.number);
        query.put("OwnerId", request.ownerId);
        query.put("PageNo", request.pageNo);
        query.put("PageSize", request.pageSize);
        query.put("ProdCode", request.prodCode);
        query.put("Province", request.province);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UsageId", request.usageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryOrderedNumberList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrderedNumberListResponse());
    }

    public QueryOrderedNumberListResponse queryOrderedNumberList(QueryOrderedNumberListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOrderedNumberListWithOptions(request, runtime);
    }

    public QueryQualificaitonCandinateResponse queryQualificaitonCandinateWithOptions(QueryQualificaitonCandinateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallType", request.callType);
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SceneId", request.sceneId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQualificaitonCandinate"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQualificaitonCandinateResponse());
    }

    public QueryQualificaitonCandinateResponse queryQualificaitonCandinate(QueryQualificaitonCandinateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificaitonCandinateWithOptions(request, runtime);
    }

    public QueryQualificationAuditDetailResponse queryQualificationAuditDetailWithOptions(QueryQualificationAuditDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQualificationAuditDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQualificationAuditDetailResponse());
    }

    public QueryQualificationAuditDetailResponse queryQualificationAuditDetail(QueryQualificationAuditDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificationAuditDetailWithOptions(request, runtime);
    }

    public QueryQualificationDetailResponse queryQualificationDetailWithOptions(QueryQualificationDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQualificationDetail"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQualificationDetailResponse());
    }

    public QueryQualificationDetailResponse queryQualificationDetail(QueryQualificationDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificationDetailWithOptions(request, runtime);
    }

    public QueryQualificationListResponse queryQualificationListWithOptions(QueryQualificationListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryQualificationList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryQualificationListResponse());
    }

    public QueryQualificationListResponse queryQualificationList(QueryQualificationListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryQualificationListWithOptions(request, runtime);
    }

    public QueryRandomResResponse queryRandomResWithOptions(QueryRandomResRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("IsCuteNumber", request.isCuteNumber);
        query.put("LevelId", request.levelId);
        query.put("NumberCount", request.numberCount);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("Province", request.province);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRandomRes"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRandomResResponse());
    }

    public QueryRandomResResponse queryRandomRes(QueryRandomResRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRandomResWithOptions(request, runtime);
    }

    public QueryRandomResFor400Response queryRandomResFor400WithOptions(QueryRandomResFor400Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("LevelId", request.levelId);
        query.put("NumberCount", request.numberCount);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRandomResFor400"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRandomResFor400Response());
    }

    public QueryRandomResFor400Response queryRandomResFor400(QueryRandomResFor400Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRandomResFor400WithOptions(request, runtime);
    }

    public QueryRealNameInfoByCorpNameResponse queryRealNameInfoByCorpNameWithOptions(QueryRealNameInfoByCorpNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryRealNameInfoByCorpName"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryRealNameInfoByCorpNameResponse());
    }

    public QueryRealNameInfoByCorpNameResponse queryRealNameInfoByCorpName(QueryRealNameInfoByCorpNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryRealNameInfoByCorpNameWithOptions(request, runtime);
    }

    public QuerySceneByUsageResponse querySceneByUsageWithOptions(QuerySceneByUsageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UsageId", request.usageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySceneByUsage"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySceneByUsageResponse());
    }

    public QuerySceneByUsageResponse querySceneByUsage(QuerySceneByUsageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySceneByUsageWithOptions(request, runtime);
    }

    public QueryScenesSpecsResponse queryScenesSpecsWithOptions(QueryScenesSpecsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SceneType", request.sceneType);
        query.put("Type", request.type);
        query.put("UsageId", request.usageId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryScenesSpecs"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryScenesSpecsResponse());
    }

    public QueryScenesSpecsResponse queryScenesSpecs(QueryScenesSpecsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryScenesSpecsWithOptions(request, runtime);
    }

    public QuerySpecRegionByCorpNameResponse querySpecRegionByCorpNameWithOptions(QuerySpecRegionByCorpNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpecRegionByCorpName"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpecRegionByCorpNameResponse());
    }

    public QuerySpecRegionByCorpNameResponse querySpecRegionByCorpName(QuerySpecRegionByCorpNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpecRegionByCorpNameWithOptions(request, runtime);
    }

    public QuerySpecRegionListResponse querySpecRegionListWithOptions(QuerySpecRegionListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CallType", request.callType);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SceneId", request.sceneId);
        query.put("SpecId", request.specId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySpecRegionList"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySpecRegionListResponse());
    }

    public QuerySpecRegionListResponse querySpecRegionList(QuerySpecRegionListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySpecRegionListWithOptions(request, runtime);
    }

    public QueryUpgradeNumberAuditResponse queryUpgradeNumberAuditWithOptions(QueryUpgradeNumberAuditRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("RealNameInsId", request.realNameInsId);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUpgradeNumberAudit"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUpgradeNumberAuditResponse());
    }

    public QueryUpgradeNumberAuditResponse queryUpgradeNumberAudit(QueryUpgradeNumberAuditRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUpgradeNumberAuditWithOptions(request, runtime);
    }

    public QueryUsagesResponse queryUsagesWithOptions(QueryUsagesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("CorpName", request.corpName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("Type", request.type);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryUsages"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryUsagesResponse());
    }

    public QueryUsagesResponse queryUsages(QueryUsagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryUsagesWithOptions(request, runtime);
    }

    public QueryVoiceNumberStockCountResponse queryVoiceNumberStockCountWithOptions(QueryVoiceNumberStockCountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("City", request.city);
        query.put("NumberType", request.numberType);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("Province", request.province);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("SpecIds", request.specIds);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryVoiceNumberStockCount"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryVoiceNumberStockCountResponse());
    }

    public QueryVoiceNumberStockCountResponse queryVoiceNumberStockCount(QueryVoiceNumberStockCountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryVoiceNumberStockCountWithOptions(request, runtime);
    }

    public SetPasswordResponse setPasswordWithOptions(SetPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("NewPassword", request.newPassword);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResetRequired", request.resetRequired);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        query.put("UserName", request.userName);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPassword"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordResponse());
    }

    public SetPasswordResponse setPassword(SetPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPasswordWithOptions(request, runtime);
    }

    public TransferToThirdCallResponse transferToThirdCallWithOptions(TransferToThirdCallRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferToThirdCall"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferToThirdCallResponse());
    }

    public TransferToThirdCallResponse transferToThirdCall(TransferToThirdCallRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.transferToThirdCallWithOptions(request, runtime);
    }

    public UploadFileResponse uploadFileWithOptions(UploadFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFile"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileResponse());
    }

    public UploadFileResponse uploadFile(UploadFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadFileWithOptions(request, runtime);
    }

    public UploadFileToWttResponse uploadFileToWttWithOptions(UploadFileToWttRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        query.put("FileName", request.fileName);
        query.put("OwnerId", request.ownerId);
        query.put("ProdCode", request.prodCode);
        query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        query.put("ResourceOwnerId", request.resourceOwnerId);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadFileToWtt"),
            new TeaPair("version", "2019-07-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadFileToWttResponse());
    }

    public UploadFileToWttResponse uploadFileToWtt(UploadFileToWttRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadFileToWttWithOptions(request, runtime);
    }
}
