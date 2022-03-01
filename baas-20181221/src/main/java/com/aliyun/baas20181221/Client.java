// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221;

import com.aliyun.tea.*;
import com.aliyun.baas20181221.models.*;
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
            new TeaPair("cn-qingdao", "baas.aliyuncs.com"),
            new TeaPair("cn-beijing", "baas.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "baas.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "baas.aliyuncs.com"),
            new TeaPair("cn-shanghai", "baas.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "baas.aliyuncs.com"),
            new TeaPair("cn-hongkong", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-1", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-central-1", "baas.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "baas.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("baas", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AcceptFabricInvitationResponse acceptFabricInvitationWithOptions(AcceptFabricInvitationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAccepted)) {
            body.put("IsAccepted", request.isAccepted);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptFabricInvitation"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptFabricInvitationResponse());
    }

    public AcceptFabricInvitationResponse acceptFabricInvitation(AcceptFabricInvitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptFabricInvitationWithOptions(request, runtime);
    }

    public ApplyAntChainCertificateResponse applyAntChainCertificateWithOptions(ApplyAntChainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadReq)) {
            body.put("UploadReq", request.uploadReq);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAntChainCertificate"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAntChainCertificateResponse());
    }

    public ApplyAntChainCertificateResponse applyAntChainCertificate(ApplyAntChainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAntChainCertificateWithOptions(request, runtime);
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreationWithOptions(ApplyAntChainCertificateWithKeyAutoCreationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            body.put("CommonName", request.commonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.countryName)) {
            body.put("CountryName", request.countryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.localityName)) {
            body.put("LocalityName", request.localityName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationName)) {
            body.put("OrganizationName", request.organizationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationUnitName)) {
            body.put("OrganizationUnitName", request.organizationUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stateOrProvinceName)) {
            body.put("StateOrProvinceName", request.stateOrProvinceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAntChainCertificateWithKeyAutoCreation"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAntChainCertificateWithKeyAutoCreationResponse());
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreation(ApplyAntChainCertificateWithKeyAutoCreationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAntChainCertificateWithKeyAutoCreationWithOptions(request, runtime);
    }

    public ApproveFabricChaincodeDefinitionResponse approveFabricChaincodeDefinitionWithOptions(ApproveFabricChaincodeDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chaincodePackageId)) {
            body.put("ChaincodePackageId", request.chaincodePackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveFabricChaincodeDefinition"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveFabricChaincodeDefinitionResponse());
    }

    public ApproveFabricChaincodeDefinitionResponse approveFabricChaincodeDefinition(ApproveFabricChaincodeDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveFabricChaincodeDefinitionWithOptions(request, runtime);
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest request = new BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneList)) {
            request.phoneListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneList, "PhoneList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneListShrink)) {
            body.put("PhoneList", request.phoneListShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchAddAntChainMiniAppQRCodeAuthorizedUsers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse());
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsers(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomainWithOptions(CheckFabricConsortiumDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            body.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFabricConsortiumDomain"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFabricConsortiumDomainResponse());
    }

    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomain(CheckFabricConsortiumDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkFabricConsortiumDomainWithOptions(request, runtime);
    }

    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomainWithOptions(CheckFabricOrganizationDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            body.put("DomainCode", request.domainCode);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckFabricOrganizationDomain"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckFabricOrganizationDomainResponse());
    }

    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomain(CheckFabricOrganizationDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkFabricOrganizationDomainWithOptions(request, runtime);
    }

    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMemberWithOptions(ConfirmFabricConsortiumMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfirmFabricConsortiumMember"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmFabricConsortiumMemberResponse());
    }

    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMember(ConfirmFabricConsortiumMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmFabricConsortiumMemberWithOptions(request, runtime);
    }

    public CopyAntChainContractProjectResponse copyAntChainContractProjectWithOptions(CopyAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectDescription)) {
            body.put("ProjectDescription", request.projectDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectVersion)) {
            body.put("ProjectVersion", request.projectVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyAntChainContractProject"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyAntChainContractProjectResponse());
    }

    public CopyAntChainContractProjectResponse copyAntChainContractProject(CopyAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyAntChainContractProjectWithOptions(request, runtime);
    }

    public CreateAntChainAccountResponse createAntChainAccountWithOptions(CreateAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPubKey)) {
            body.put("AccountPubKey", request.accountPubKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountRecoverPubKey)) {
            body.put("AccountRecoverPubKey", request.accountRecoverPubKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainAccount"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainAccountResponse());
    }

    public CreateAntChainAccountResponse createAntChainAccount(CreateAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainAccountWithOptions(request, runtime);
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreationWithOptions(CreateAntChainAccountWithKeyPairAutoCreationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoverPassword)) {
            body.put("RecoverPassword", request.recoverPassword);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainAccountWithKeyPairAutoCreation"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainAccountWithKeyPairAutoCreationResponse());
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreation(CreateAntChainAccountWithKeyPairAutoCreationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainAccountWithKeyPairAutoCreationWithOptions(request, runtime);
    }

    public CreateAntChainConsortiumResponse createAntChainConsortiumWithOptions(CreateAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumDescription)) {
            body.put("ConsortiumDescription", request.consortiumDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumName)) {
            body.put("ConsortiumName", request.consortiumName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainConsortium"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainConsortiumResponse());
    }

    public CreateAntChainConsortiumResponse createAntChainConsortium(CreateAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainConsortiumWithOptions(request, runtime);
    }

    public CreateAntChainContractContentResponse createAntChainContractContentWithOptions(CreateAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentName)) {
            body.put("ContentName", request.contentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDirectory)) {
            body.put("IsDirectory", request.isDirectory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentContentId)) {
            body.put("ParentContentId", request.parentContentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainContractContent"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainContractContentResponse());
    }

    public CreateAntChainContractContentResponse createAntChainContractContent(CreateAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainContractContentWithOptions(request, runtime);
    }

    public CreateAntChainContractProjectResponse createAntChainContractProjectWithOptions(CreateAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectDescription)) {
            body.put("ProjectDescription", request.projectDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectVersion)) {
            body.put("ProjectVersion", request.projectVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainContractProject"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainContractProjectResponse());
    }

    public CreateAntChainContractProjectResponse createAntChainContractProject(CreateAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainContractProjectWithOptions(request, runtime);
    }

    public CreateFabricChaincodeResponse createFabricChaincodeWithOptions(CreateFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endorsePolicy)) {
            body.put("EndorsePolicy", request.endorsePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossBucket)) {
            body.put("OssBucket", request.ossBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            body.put("OssUrl", request.ossUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricChaincodeResponse());
    }

    public CreateFabricChaincodeResponse createFabricChaincode(CreateFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChaincodeWithOptions(request, runtime);
    }

    public CreateFabricChaincodePackageResponse createFabricChaincodePackageWithOptions(CreateFabricChaincodePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossUrl)) {
            body.put("OssUrl", request.ossUrl);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricChaincodePackage"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricChaincodePackageResponse());
    }

    public CreateFabricChaincodePackageResponse createFabricChaincodePackage(CreateFabricChaincodePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChaincodePackageWithOptions(request, runtime);
    }

    public CreateFabricChannelResponse createFabricChannelWithOptions(CreateFabricChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelName)) {
            query.put("ChannelName", request.channelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchTimeout)) {
            body.put("BatchTimeout", request.batchTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageCount)) {
            body.put("MaxMessageCount", request.maxMessageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredMaxBytes)) {
            body.put("PreferredMaxBytes", request.preferredMaxBytes);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricChannel"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricChannelResponse());
    }

    public CreateFabricChannelResponse createFabricChannel(CreateFabricChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChannelWithOptions(request, runtime);
    }

    public CreateFabricChannelMemberResponse createFabricChannelMemberWithOptions(CreateFabricChannelMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricChannelMember"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricChannelMemberResponse());
    }

    public CreateFabricChannelMemberResponse createFabricChannelMember(CreateFabricChannelMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChannelMemberWithOptions(request, runtime);
    }

    public CreateFabricConsortiumResponse createFabricConsortiumWithOptions(CreateFabricConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelPolicy)) {
            body.put("ChannelPolicy", request.channelPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumDescription)) {
            body.put("ConsortiumDescription", request.consortiumDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumName)) {
            body.put("ConsortiumName", request.consortiumName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordererType)) {
            body.put("OrdererType", request.ordererType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderersCount)) {
            body.put("OrderersCount", request.orderersCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            body.put("Organization", request.organization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            body.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            body.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peersCount)) {
            body.put("PeersCount", request.peersCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            body.put("SpecName", request.specName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricConsortium"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricConsortiumResponse());
    }

    public CreateFabricConsortiumResponse createFabricConsortium(CreateFabricConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricConsortiumWithOptions(request, runtime);
    }

    public CreateFabricConsortiumMemberResponse createFabricConsortiumMemberWithOptions(CreateFabricConsortiumMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricConsortiumMember"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricConsortiumMemberResponse());
    }

    public CreateFabricConsortiumMemberResponse createFabricConsortiumMember(CreateFabricConsortiumMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricConsortiumMemberWithOptions(request, runtime);
    }

    public CreateFabricOrganizationResponse createFabricOrganizationWithOptions(CreateFabricOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationName)) {
            query.put("OrganizationName", request.organizationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            query.put("SpecName", request.specName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.paymentDuration)) {
            body.put("PaymentDuration", request.paymentDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentDurationUnit)) {
            body.put("PaymentDurationUnit", request.paymentDurationUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peersCount)) {
            body.put("PeersCount", request.peersCount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricOrganization"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricOrganizationResponse());
    }

    public CreateFabricOrganizationResponse createFabricOrganization(CreateFabricOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricOrganizationWithOptions(request, runtime);
    }

    public CreateFabricOrganizationUserResponse createFabricOrganizationUserWithOptions(CreateFabricOrganizationUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attrs)) {
            body.put("Attrs", request.attrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFabricOrganizationUser"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFabricOrganizationUserResponse());
    }

    public CreateFabricOrganizationUserResponse createFabricOrganizationUser(CreateFabricOrganizationUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricOrganizationUserWithOptions(request, runtime);
    }

    public DeleteAntChainConsortiumResponse deleteAntChainConsortiumWithOptions(DeleteAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAntChainConsortium"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAntChainConsortiumResponse());
    }

    public DeleteAntChainConsortiumResponse deleteAntChainConsortium(DeleteAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainConsortiumWithOptions(request, runtime);
    }

    public DeleteAntChainContractContentResponse deleteAntChainContractContentWithOptions(DeleteAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentId)) {
            body.put("ContentId", request.contentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAntChainContractContent"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAntChainContractContentResponse());
    }

    public DeleteAntChainContractContentResponse deleteAntChainContractContent(DeleteAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainContractContentWithOptions(request, runtime);
    }

    public DeleteAntChainContractProjectResponse deleteAntChainContractProjectWithOptions(DeleteAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAntChainContractProject"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAntChainContractProjectResponse());
    }

    public DeleteAntChainContractProjectResponse deleteAntChainContractProject(DeleteAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainContractProjectWithOptions(request, runtime);
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAntChainMiniAppQRCodeAuthorizedUser"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAntChainMiniAppQRCodeAuthorizedUserResponse());
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUser(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(request, runtime);
    }

    public DeleteFabricChaincodeResponse deleteFabricChaincodeWithOptions(DeleteFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFabricChaincodeResponse());
    }

    public DeleteFabricChaincodeResponse deleteFabricChaincode(DeleteFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFabricChaincodeWithOptions(request, runtime);
    }

    public DescribeAntChainAccountsResponse describeAntChainAccountsWithOptions(DescribeAntChainAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

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
            new TeaPair("action", "DescribeAntChainAccounts"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainAccountsResponse());
    }

    public DescribeAntChainAccountsResponse describeAntChainAccounts(DescribeAntChainAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainAccountsWithOptions(request, runtime);
    }

    public DescribeAntChainAccountsV2Response describeAntChainAccountsV2WithOptions(DescribeAntChainAccountsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainAccountsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainAccountsV2Response());
    }

    public DescribeAntChainAccountsV2Response describeAntChainAccountsV2(DescribeAntChainAccountsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainAccountsV2WithOptions(request, runtime);
    }

    public DescribeAntChainBlockResponse describeAntChainBlockWithOptions(DescribeAntChainBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainBlock"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainBlockResponse());
    }

    public DescribeAntChainBlockResponse describeAntChainBlock(DescribeAntChainBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainBlockWithOptions(request, runtime);
    }

    public DescribeAntChainBlockV2Response describeAntChainBlockV2WithOptions(DescribeAntChainBlockV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainBlockV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainBlockV2Response());
    }

    public DescribeAntChainBlockV2Response describeAntChainBlockV2(DescribeAntChainBlockV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainBlockV2WithOptions(request, runtime);
    }

    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplicationsWithOptions(DescribeAntChainCertificateApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainCertificateApplications"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainCertificateApplicationsResponse());
    }

    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplications(DescribeAntChainCertificateApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainCertificateApplicationsWithOptions(request, runtime);
    }

    public DescribeAntChainCertificateApplicationsV2Response describeAntChainCertificateApplicationsV2WithOptions(DescribeAntChainCertificateApplicationsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainCertificateApplicationsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainCertificateApplicationsV2Response());
    }

    public DescribeAntChainCertificateApplicationsV2Response describeAntChainCertificateApplicationsV2(DescribeAntChainCertificateApplicationsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainCertificateApplicationsV2WithOptions(request, runtime);
    }

    public DescribeAntChainConsortiumsResponse describeAntChainConsortiumsWithOptions(DescribeAntChainConsortiumsRequest request, RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainConsortiums"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainConsortiumsResponse());
    }

    public DescribeAntChainConsortiumsResponse describeAntChainConsortiums(DescribeAntChainConsortiumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainConsortiumsWithOptions(request, runtime);
    }

    public DescribeAntChainConsortiumsV2Response describeAntChainConsortiumsV2WithOptions(DescribeAntChainConsortiumsV2Request request, RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainConsortiumsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainConsortiumsV2Response());
    }

    public DescribeAntChainConsortiumsV2Response describeAntChainConsortiumsV2(DescribeAntChainConsortiumsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainConsortiumsV2WithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTreeWithOptions(DescribeAntChainContractProjectContentTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainContractProjectContentTree"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectContentTreeResponse());
    }

    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTree(DescribeAntChainContractProjectContentTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeWithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectContentTreeV2Response describeAntChainContractProjectContentTreeV2WithOptions(DescribeAntChainContractProjectContentTreeV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainContractProjectContentTreeV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectContentTreeV2Response());
    }

    public DescribeAntChainContractProjectContentTreeV2Response describeAntChainContractProjectContentTreeV2(DescribeAntChainContractProjectContentTreeV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeV2WithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectsResponse describeAntChainContractProjectsWithOptions(DescribeAntChainContractProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainContractProjects"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectsResponse());
    }

    public DescribeAntChainContractProjectsResponse describeAntChainContractProjects(DescribeAntChainContractProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectsWithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectsV2Response describeAntChainContractProjectsV2WithOptions(DescribeAntChainContractProjectsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainContractProjectsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectsV2Response());
    }

    public DescribeAntChainContractProjectsV2Response describeAntChainContractProjectsV2(DescribeAntChainContractProjectsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectsV2WithOptions(request, runtime);
    }

    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPathsWithOptions(DescribeAntChainDownloadPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainDownloadPaths"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainDownloadPathsResponse());
    }

    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPaths(DescribeAntChainDownloadPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainDownloadPathsWithOptions(request, runtime);
    }

    public DescribeAntChainDownloadPathsV2Response describeAntChainDownloadPathsV2WithOptions(DescribeAntChainDownloadPathsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainDownloadPathsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainDownloadPathsV2Response());
    }

    public DescribeAntChainDownloadPathsV2Response describeAntChainDownloadPathsV2(DescribeAntChainDownloadPathsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainDownloadPathsV2WithOptions(request, runtime);
    }

    public DescribeAntChainInformationResponse describeAntChainInformationWithOptions(DescribeAntChainInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainInformation"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainInformationResponse());
    }

    public DescribeAntChainInformationResponse describeAntChainInformation(DescribeAntChainInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainInformationWithOptions(request, runtime);
    }

    public DescribeAntChainInformationV2Response describeAntChainInformationV2WithOptions(DescribeAntChainInformationV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainInformationV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainInformationV2Response());
    }

    public DescribeAntChainInformationV2Response describeAntChainInformationV2(DescribeAntChainInformationV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainInformationV2WithOptions(request, runtime);
    }

    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocksWithOptions(DescribeAntChainLatestBlocksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainLatestBlocks"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestBlocksResponse());
    }

    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocks(DescribeAntChainLatestBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestBlocksWithOptions(request, runtime);
    }

    public DescribeAntChainLatestBlocksV2Response describeAntChainLatestBlocksV2WithOptions(DescribeAntChainLatestBlocksV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainLatestBlocksV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestBlocksV2Response());
    }

    public DescribeAntChainLatestBlocksV2Response describeAntChainLatestBlocksV2(DescribeAntChainLatestBlocksV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestBlocksV2WithOptions(request, runtime);
    }

    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigestsWithOptions(DescribeAntChainLatestTransactionDigestsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainLatestTransactionDigests"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestTransactionDigestsResponse());
    }

    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigests(DescribeAntChainLatestTransactionDigestsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsWithOptions(request, runtime);
    }

    public DescribeAntChainLatestTransactionDigestsV2Response describeAntChainLatestTransactionDigestsV2WithOptions(DescribeAntChainLatestTransactionDigestsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainLatestTransactionDigestsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestTransactionDigestsV2Response());
    }

    public DescribeAntChainLatestTransactionDigestsV2Response describeAntChainLatestTransactionDigestsV2(DescribeAntChainLatestTransactionDigestsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsV2WithOptions(request, runtime);
    }

    public DescribeAntChainMembersResponse describeAntChainMembersWithOptions(DescribeAntChainMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainMembers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMembersResponse());
    }

    public DescribeAntChainMembersResponse describeAntChainMembers(DescribeAntChainMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMembersWithOptions(request, runtime);
    }

    public DescribeAntChainMembersV2Response describeAntChainMembersV2WithOptions(DescribeAntChainMembersV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainMembersV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMembersV2Response());
    }

    public DescribeAntChainMembersV2Response describeAntChainMembersV2(DescribeAntChainMembersV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMembersV2WithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAccessLog"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLog(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response describeAntChainMiniAppBrowserQRCodeAccessLogV2WithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAccessLogV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response describeAntChainMiniAppBrowserQRCodeAccessLogV2(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogV2WithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsers(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2WithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2WithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionHash)) {
            body.put("TransactionHash", request.transactionHash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserTransactionQRCode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserTransactionQRCodeResponse());
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCode(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse describeAntChainMiniAppBrowserTransactionQRCodeNewWithOptions(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contractId)) {
            body.put("ContractId", request.contractId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionHash)) {
            body.put("TransactionHash", request.transactionHash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainMiniAppBrowserTransactionQRCodeNew"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse());
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse describeAntChainMiniAppBrowserTransactionQRCodeNew(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserTransactionQRCodeNewWithOptions(request, runtime);
    }

    public DescribeAntChainNodesResponse describeAntChainNodesWithOptions(DescribeAntChainNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainNodes"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainNodesResponse());
    }

    public DescribeAntChainNodesResponse describeAntChainNodes(DescribeAntChainNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainNodesWithOptions(request, runtime);
    }

    public DescribeAntChainNodesV2Response describeAntChainNodesV2WithOptions(DescribeAntChainNodesV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainNodesV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainNodesV2Response());
    }

    public DescribeAntChainNodesV2Response describeAntChainNodesV2(DescribeAntChainNodesV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainNodesV2WithOptions(request, runtime);
    }

    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorizationWithOptions(DescribeAntChainQRCodeAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainQRCodeAuthorization"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainQRCodeAuthorizationResponse());
    }

    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorization(DescribeAntChainQRCodeAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    public DescribeAntChainQRCodeAuthorizationV2Response describeAntChainQRCodeAuthorizationV2WithOptions(DescribeAntChainQRCodeAuthorizationV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainQRCodeAuthorizationV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainQRCodeAuthorizationV2Response());
    }

    public DescribeAntChainQRCodeAuthorizationV2Response describeAntChainQRCodeAuthorizationV2(DescribeAntChainQRCodeAuthorizationV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationV2WithOptions(request, runtime);
    }

    public DescribeAntChainTransactionResponse describeAntChainTransactionWithOptions(DescribeAntChainTransactionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransaction"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionResponse());
    }

    public DescribeAntChainTransactionResponse describeAntChainTransaction(DescribeAntChainTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceiptWithOptions(DescribeAntChainTransactionReceiptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransactionReceipt"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionReceiptResponse());
    }

    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceipt(DescribeAntChainTransactionReceiptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionReceiptWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionReceiptV2Response describeAntChainTransactionReceiptV2WithOptions(DescribeAntChainTransactionReceiptV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransactionReceiptV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionReceiptV2Response());
    }

    public DescribeAntChainTransactionReceiptV2Response describeAntChainTransactionReceiptV2(DescribeAntChainTransactionReceiptV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionReceiptV2WithOptions(request, runtime);
    }

    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatisticsWithOptions(DescribeAntChainTransactionStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            body.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransactionStatistics"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionStatisticsResponse());
    }

    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatistics(DescribeAntChainTransactionStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionStatisticsWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionStatisticsV2Response describeAntChainTransactionStatisticsV2WithOptions(DescribeAntChainTransactionStatisticsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.end)) {
            body.put("End", request.end);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransactionStatisticsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionStatisticsV2Response());
    }

    public DescribeAntChainTransactionStatisticsV2Response describeAntChainTransactionStatisticsV2(DescribeAntChainTransactionStatisticsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionStatisticsV2WithOptions(request, runtime);
    }

    public DescribeAntChainTransactionV2Response describeAntChainTransactionV2WithOptions(DescribeAntChainTransactionV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainTransactionV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionV2Response());
    }

    public DescribeAntChainTransactionV2Response describeAntChainTransactionV2(DescribeAntChainTransactionV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionV2WithOptions(request, runtime);
    }

    public DescribeAntChainsResponse describeAntChainsWithOptions(DescribeAntChainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChains"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainsResponse());
    }

    public DescribeAntChainsResponse describeAntChains(DescribeAntChainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainsWithOptions(request, runtime);
    }

    public DescribeAntChainsV2Response describeAntChainsV2WithOptions(DescribeAntChainsV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

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
            new TeaPair("action", "DescribeAntChainsV2"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainsV2Response());
    }

    public DescribeAntChainsV2Response describeAntChainsV2(DescribeAntChainsV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainsV2WithOptions(request, runtime);
    }

    public DescribeEthereumDeletableResponse describeEthereumDeletableWithOptions(DescribeEthereumDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumDeletable"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumDeletableResponse());
    }

    public DescribeEthereumDeletableResponse describeEthereumDeletable(DescribeEthereumDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEthereumDeletableWithOptions(request, runtime);
    }

    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizationsWithOptions(DescribeFabricCandidateOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricCandidateOrganizations"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricCandidateOrganizationsResponse());
    }

    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizations(DescribeFabricCandidateOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricCandidateOrganizationsWithOptions(request, runtime);
    }

    public DescribeFabricChaincodeDefinitionTaskResponse describeFabricChaincodeDefinitionTaskWithOptions(DescribeFabricChaincodeDefinitionTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChaincodeDefinitionTask"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChaincodeDefinitionTaskResponse());
    }

    public DescribeFabricChaincodeDefinitionTaskResponse describeFabricChaincodeDefinitionTask(DescribeFabricChaincodeDefinitionTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricChaincodeDefinitionTaskWithOptions(request, runtime);
    }

    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicyWithOptions(DescribeFabricChaincodeUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChaincodeUploadPolicy"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChaincodeUploadPolicyResponse());
    }

    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicy(DescribeFabricChaincodeUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricChaincodeUploadPolicyWithOptions(request, runtime);
    }

    public DescribeFabricChannelMembersResponse describeFabricChannelMembersWithOptions(DescribeFabricChannelMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChannelMembers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChannelMembersResponse());
    }

    public DescribeFabricChannelMembersResponse describeFabricChannelMembers(DescribeFabricChannelMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricChannelMembersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatusWithOptions(DescribeFabricConsortiumAdminStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumAdminStatus"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumAdminStatusResponse());
    }

    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatus(DescribeFabricConsortiumAdminStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumAdminStatusWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodesWithOptions(DescribeFabricConsortiumChaincodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumChaincodes"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumChaincodesResponse());
    }

    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodes(DescribeFabricConsortiumChaincodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumChaincodesWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannelsWithOptions(DescribeFabricConsortiumChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumChannels"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumChannelsResponse());
    }

    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannels(DescribeFabricConsortiumChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumChannelsWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumConfig"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumConfigResponse());
    }

    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumConfigWithOptions(runtime);
    }

    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletableWithOptions(DescribeFabricConsortiumDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumDeletable"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumDeletableResponse());
    }

    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletable(DescribeFabricConsortiumDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumDeletableWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApprovalWithOptions(DescribeFabricConsortiumMemberApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumMemberApproval"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumMemberApprovalResponse());
    }

    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApproval(DescribeFabricConsortiumMemberApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumMemberApprovalWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembersWithOptions(DescribeFabricConsortiumMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumMembers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumMembersResponse());
    }

    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembers(DescribeFabricConsortiumMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumMembersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderersWithOptions(DescribeFabricConsortiumOrderersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumOrderers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumOrderersResponse());
    }

    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderers(DescribeFabricConsortiumOrderersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumOrderersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiumSpecs"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumSpecsResponse());
    }

    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumSpecsWithOptions(runtime);
    }

    public DescribeFabricConsortiumsResponse describeFabricConsortiumsWithOptions(DescribeFabricConsortiumsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricConsortiums"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricConsortiumsResponse());
    }

    public DescribeFabricConsortiumsResponse describeFabricConsortiums(DescribeFabricConsortiumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumsWithOptions(request, runtime);
    }

    public DescribeFabricExplorerResponse describeFabricExplorerWithOptions(DescribeFabricExplorerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.exBody)) {
            query.put("ExBody", request.exBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exMethod)) {
            query.put("ExMethod", request.exMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exUrl)) {
            query.put("ExUrl", request.exUrl);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricExplorer"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricExplorerResponse());
    }

    public DescribeFabricExplorerResponse describeFabricExplorer(DescribeFabricExplorerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricExplorerWithOptions(request, runtime);
    }

    public DescribeFabricInvitationCodeResponse describeFabricInvitationCodeWithOptions(DescribeFabricInvitationCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricInvitationCode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricInvitationCodeResponse());
    }

    public DescribeFabricInvitationCodeResponse describeFabricInvitationCode(DescribeFabricInvitationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricInvitationCodeWithOptions(request, runtime);
    }

    public DescribeFabricInviterResponse describeFabricInviterWithOptions(DescribeFabricInviterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricInviter"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricInviterResponse());
    }

    public DescribeFabricInviterResponse describeFabricInviter(DescribeFabricInviterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricInviterWithOptions(request, runtime);
    }

    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogsWithOptions(DescribeFabricOrdererLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordererName)) {
            query.put("OrdererName", request.ordererName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrdererLogs"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrdererLogsResponse());
    }

    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogs(DescribeFabricOrdererLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrdererLogsWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationResponse describeFabricOrganizationWithOptions(DescribeFabricOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganization"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationResponse());
    }

    public DescribeFabricOrganizationResponse describeFabricOrganization(DescribeFabricOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackageWithOptions(DescribeFabricOrganizationChaincodePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationChaincodePackage"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationChaincodePackageResponse());
    }

    public DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackage(DescribeFabricOrganizationChaincodePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationChaincodePackageWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodesWithOptions(DescribeFabricOrganizationChaincodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationChaincodes"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationChaincodesResponse());
    }

    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodes(DescribeFabricOrganizationChaincodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationChaincodesWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationChannelsResponse describeFabricOrganizationChannelsWithOptions(DescribeFabricOrganizationChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationChannels"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationChannelsResponse());
    }

    public DescribeFabricOrganizationChannelsResponse describeFabricOrganizationChannels(DescribeFabricOrganizationChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationChannelsWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletableWithOptions(DescribeFabricOrganizationDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationDeletable"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationDeletableResponse());
    }

    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletable(DescribeFabricOrganizationDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationDeletableWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembersWithOptions(DescribeFabricOrganizationMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationMembers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationMembersResponse());
    }

    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembers(DescribeFabricOrganizationMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationMembersWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeersWithOptions(DescribeFabricOrganizationPeersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationPeers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationPeersResponse());
    }

    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeers(DescribeFabricOrganizationPeersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationPeersWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationSpecs"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationSpecsResponse());
    }

    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationSpecsWithOptions(runtime);
    }

    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsersWithOptions(DescribeFabricOrganizationUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationUsers"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationUsersResponse());
    }

    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsers(DescribeFabricOrganizationUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationUsersWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationsResponse describeFabricOrganizationsWithOptions(DescribeFabricOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizations"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationsResponse());
    }

    public DescribeFabricOrganizationsResponse describeFabricOrganizations(DescribeFabricOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationsWithOptions(request, runtime);
    }

    public DescribeFabricPeerLogsResponse describeFabricPeerLogsWithOptions(DescribeFabricPeerLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peerName)) {
            query.put("PeerName", request.peerName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricPeerLogs"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricPeerLogsResponse());
    }

    public DescribeFabricPeerLogsResponse describeFabricPeerLogs(DescribeFabricPeerLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricPeerLogsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRootDomainResponse describeRootDomainWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRootDomain"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRootDomainResponse());
    }

    public DescribeRootDomainResponse describeRootDomain() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRootDomainWithOptions(runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTasks"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(runtime);
    }

    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDKWithOptions(DownloadFabricOrganizationSDKRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadFabricOrganizationSDK"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadFabricOrganizationSDKResponse());
    }

    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDK(DownloadFabricOrganizationSDKRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadFabricOrganizationSDKWithOptions(request, runtime);
    }

    public FreezeAntChainAccountResponse freezeAntChainAccountWithOptions(FreezeAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FreezeAntChainAccount"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FreezeAntChainAccountResponse());
    }

    public FreezeAntChainAccountResponse freezeAntChainAccount(FreezeAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.freezeAntChainAccountWithOptions(request, runtime);
    }

    public InstallFabricChaincodeResponse installFabricChaincodeWithOptions(InstallFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallFabricChaincodeResponse());
    }

    public InstallFabricChaincodeResponse installFabricChaincode(InstallFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installFabricChaincodeWithOptions(request, runtime);
    }

    public InstallFabricChaincodePackageResponse installFabricChaincodePackageWithOptions(InstallFabricChaincodePackageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodePackageId)) {
            body.put("ChaincodePackageId", request.chaincodePackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallFabricChaincodePackage"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallFabricChaincodePackageResponse());
    }

    public InstallFabricChaincodePackageResponse installFabricChaincodePackage(InstallFabricChaincodePackageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installFabricChaincodePackageWithOptions(request, runtime);
    }

    public InstantiateFabricChaincodeResponse instantiateFabricChaincodeWithOptions(InstantiateFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionConfig)) {
            body.put("CollectionConfig", request.collectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endorsePolicy)) {
            body.put("EndorsePolicy", request.endorsePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstantiateFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstantiateFabricChaincodeResponse());
    }

    public InstantiateFabricChaincodeResponse instantiateFabricChaincode(InstantiateFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.instantiateFabricChaincodeWithOptions(request, runtime);
    }

    public JoinFabricChannelResponse joinFabricChannelWithOptions(JoinFabricChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request._do)) {
            query.put("Do", request._do);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinFabricChannel"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinFabricChannelResponse());
    }

    public JoinFabricChannelResponse joinFabricChannel(JoinFabricChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinFabricChannelWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ResetAntChainCertificateResponse resetAntChainCertificateWithOptions(ResetAntChainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAntChainCertificate"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAntChainCertificateResponse());
    }

    public ResetAntChainCertificateResponse resetAntChainCertificate(ResetAntChainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAntChainCertificateWithOptions(request, runtime);
    }

    public ResetAntChainUserCertificateResponse resetAntChainUserCertificateWithOptions(ResetAntChainUserCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAntChainUserCertificate"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAntChainUserCertificateResponse());
    }

    public ResetAntChainUserCertificateResponse resetAntChainUserCertificate(ResetAntChainUserCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAntChainUserCertificateWithOptions(request, runtime);
    }

    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPasswordWithOptions(ResetFabricOrganizationUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetFabricOrganizationUserPassword"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetFabricOrganizationUserPasswordResponse());
    }

    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPassword(ResetFabricOrganizationUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetFabricOrganizationUserPasswordWithOptions(request, runtime);
    }

    public SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinitionWithOptions(SubmitFabricChaincodeDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodePackageId)) {
            body.put("ChaincodePackageId", request.chaincodePackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeVersion)) {
            body.put("ChaincodeVersion", request.chaincodeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionConfig)) {
            body.put("CollectionConfig", request.collectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endorsePolicy)) {
            body.put("EndorsePolicy", request.endorsePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initRequired)) {
            body.put("InitRequired", request.initRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitFabricChaincodeDefinition"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitFabricChaincodeDefinitionResponse());
    }

    public SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinition(SubmitFabricChaincodeDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitFabricChaincodeDefinitionWithOptions(request, runtime);
    }

    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincodeWithOptions(SynchronizeFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SynchronizeFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeFabricChaincodeResponse());
    }

    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincode(SynchronizeFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.synchronizeFabricChaincodeWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2018-12-21"),
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

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnfreezeAntChainAccountResponse unfreezeAntChainAccountWithOptions(UnfreezeAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnfreezeAntChainAccount"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnfreezeAntChainAccountResponse());
    }

    public UnfreezeAntChainAccountResponse unfreezeAntChainAccount(UnfreezeAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unfreezeAntChainAccountWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2018-12-21"),
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

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateAntChainResponse updateAntChainWithOptions(UpdateAntChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainName)) {
            body.put("AntChainName", request.antChainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChain"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainResponse());
    }

    public UpdateAntChainResponse updateAntChain(UpdateAntChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainWithOptions(request, runtime);
    }

    public UpdateAntChainConsortiumResponse updateAntChainConsortiumWithOptions(UpdateAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumDescription)) {
            body.put("ConsortiumDescription", request.consortiumDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumName)) {
            body.put("ConsortiumName", request.consortiumName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChainConsortium"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainConsortiumResponse());
    }

    public UpdateAntChainConsortiumResponse updateAntChainConsortium(UpdateAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainConsortiumWithOptions(request, runtime);
    }

    public UpdateAntChainContractContentResponse updateAntChainContractContentWithOptions(UpdateAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentId)) {
            body.put("ContentId", request.contentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.contentName)) {
            body.put("ContentName", request.contentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentContentId)) {
            body.put("ParentContentId", request.parentContentId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChainContractContent"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainContractContentResponse());
    }

    public UpdateAntChainContractContentResponse updateAntChainContractContent(UpdateAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainContractContentWithOptions(request, runtime);
    }

    public UpdateAntChainContractProjectResponse updateAntChainContractProjectWithOptions(UpdateAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectDescription)) {
            body.put("ProjectDescription", request.projectDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectVersion)) {
            body.put("ProjectVersion", request.projectVersion);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChainContractProject"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainContractProjectResponse());
    }

    public UpdateAntChainContractProjectResponse updateAntChainContractProject(UpdateAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainContractProjectWithOptions(request, runtime);
    }

    public UpdateAntChainMemberResponse updateAntChainMemberWithOptions(UpdateAntChainMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberId)) {
            body.put("MemberId", request.memberId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memberName)) {
            body.put("MemberName", request.memberName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChainMember"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainMemberResponse());
    }

    public UpdateAntChainMemberResponse updateAntChainMember(UpdateAntChainMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainMemberWithOptions(request, runtime);
    }

    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorizationWithOptions(UpdateAntChainQRCodeAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationType)) {
            body.put("AuthorizationType", request.authorizationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAntChainQRCodeAuthorization"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAntChainQRCodeAuthorizationResponse());
    }

    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorization(UpdateAntChainQRCodeAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    public UpgradeFabricChaincodeResponse upgradeFabricChaincodeWithOptions(UpgradeFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionConfig)) {
            body.put("CollectionConfig", request.collectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endorsePolicy)) {
            body.put("EndorsePolicy", request.endorsePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeFabricChaincode"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeFabricChaincodeResponse());
    }

    public UpgradeFabricChaincodeResponse upgradeFabricChaincode(UpgradeFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeFabricChaincodeWithOptions(request, runtime);
    }

    public UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinitionWithOptions(UpgradeFabricChaincodeDefinitionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chaincodePackageId)) {
            body.put("ChaincodePackageId", request.chaincodePackageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeVersion)) {
            body.put("ChaincodeVersion", request.chaincodeVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionConfig)) {
            body.put("CollectionConfig", request.collectionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endorsePolicy)) {
            body.put("EndorsePolicy", request.endorsePolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initRequired)) {
            body.put("InitRequired", request.initRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeFabricChaincodeDefinition"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeFabricChaincodeDefinitionResponse());
    }

    public UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinition(UpgradeFabricChaincodeDefinitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeFabricChaincodeDefinitionWithOptions(request, runtime);
    }
}
