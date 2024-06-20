// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221;

import com.aliyun.tea.*;
import com.aliyun.baas20181221.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @param request AcceptFabricInvitationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptFabricInvitationResponse
     */
    public AcceptFabricInvitationResponse acceptFabricInvitationWithOptions(AcceptFabricInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAccepted)) {
            body.put("IsAccepted", request.isAccepted);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request AcceptFabricInvitationRequest
     * @return AcceptFabricInvitationResponse
     */
    public AcceptFabricInvitationResponse acceptFabricInvitation(AcceptFabricInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptFabricInvitationWithOptions(request, runtime);
    }

    /**
     * @param request ApplyAntChainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAntChainCertificateResponse
     */
    public ApplyAntChainCertificateResponse applyAntChainCertificateWithOptions(ApplyAntChainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadReq)) {
            body.put("UploadReq", request.uploadReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ApplyAntChainCertificateRequest
     * @return ApplyAntChainCertificateResponse
     */
    public ApplyAntChainCertificateResponse applyAntChainCertificate(ApplyAntChainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAntChainCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ApplyAntChainCertificateWithKeyAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAntChainCertificateWithKeyAutoCreationResponse
     */
    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreationWithOptions(ApplyAntChainCertificateWithKeyAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ApplyAntChainCertificateWithKeyAutoCreationRequest
     * @return ApplyAntChainCertificateWithKeyAutoCreationResponse
     */
    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreation(ApplyAntChainCertificateWithKeyAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAntChainCertificateWithKeyAutoCreationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ApproveFabricChaincodeDefinition</p>
     * 
     * @param request ApproveFabricChaincodeDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveFabricChaincodeDefinitionResponse
     */
    public ApproveFabricChaincodeDefinitionResponse approveFabricChaincodeDefinitionWithOptions(ApproveFabricChaincodeDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>ApproveFabricChaincodeDefinition</p>
     * 
     * @param request ApproveFabricChaincodeDefinitionRequest
     * @return ApproveFabricChaincodeDefinitionResponse
     */
    public ApproveFabricChaincodeDefinitionResponse approveFabricChaincodeDefinition(ApproveFabricChaincodeDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveFabricChaincodeDefinitionWithOptions(request, runtime);
    }

    /**
     * @param tmpReq BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse
     */
    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest
     * @return BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse
     */
    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsers(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    /**
     * @param request CheckFabricConsortiumDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckFabricConsortiumDomainResponse
     */
    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomainWithOptions(CheckFabricConsortiumDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            body.put("DomainCode", request.domainCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CheckFabricConsortiumDomainRequest
     * @return CheckFabricConsortiumDomainResponse
     */
    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomain(CheckFabricConsortiumDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFabricConsortiumDomainWithOptions(request, runtime);
    }

    /**
     * @param request CheckFabricOrganizationDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckFabricOrganizationDomainResponse
     */
    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomainWithOptions(CheckFabricOrganizationDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            body.put("DomainCode", request.domainCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CheckFabricOrganizationDomainRequest
     * @return CheckFabricOrganizationDomainResponse
     */
    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomain(CheckFabricOrganizationDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkFabricOrganizationDomainWithOptions(request, runtime);
    }

    /**
     * @param request ConfirmFabricConsortiumMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmFabricConsortiumMemberResponse
     */
    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMemberWithOptions(ConfirmFabricConsortiumMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ConfirmFabricConsortiumMemberRequest
     * @return ConfirmFabricConsortiumMemberResponse
     */
    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMember(ConfirmFabricConsortiumMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmFabricConsortiumMemberWithOptions(request, runtime);
    }

    /**
     * @param request CopyAntChainContractProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyAntChainContractProjectResponse
     */
    public CopyAntChainContractProjectResponse copyAntChainContractProjectWithOptions(CopyAntChainContractProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CopyAntChainContractProjectRequest
     * @return CopyAntChainContractProjectResponse
     */
    public CopyAntChainContractProjectResponse copyAntChainContractProject(CopyAntChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyAntChainContractProjectWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainAccountResponse
     */
    public CreateAntChainAccountResponse createAntChainAccountWithOptions(CreateAntChainAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateAntChainAccountRequest
     * @return CreateAntChainAccountResponse
     */
    public CreateAntChainAccountResponse createAntChainAccount(CreateAntChainAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainAccountWithKeyPairAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainAccountWithKeyPairAutoCreationResponse
     */
    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreationWithOptions(CreateAntChainAccountWithKeyPairAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateAntChainAccountWithKeyPairAutoCreationRequest
     * @return CreateAntChainAccountWithKeyPairAutoCreationResponse
     */
    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreation(CreateAntChainAccountWithKeyPairAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainAccountWithKeyPairAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainConsortiumResponse
     */
    public CreateAntChainConsortiumResponse createAntChainConsortiumWithOptions(CreateAntChainConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumDescription)) {
            body.put("ConsortiumDescription", request.consortiumDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumName)) {
            body.put("ConsortiumName", request.consortiumName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateAntChainConsortiumRequest
     * @return CreateAntChainConsortiumResponse
     */
    public CreateAntChainConsortiumResponse createAntChainConsortium(CreateAntChainConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainContractContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainContractContentResponse
     */
    public CreateAntChainContractContentResponse createAntChainContractContentWithOptions(CreateAntChainContractContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateAntChainContractContentRequest
     * @return CreateAntChainContractContentResponse
     */
    public CreateAntChainContractContentResponse createAntChainContractContent(CreateAntChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainContractContentWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainContractProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainContractProjectResponse
     */
    public CreateAntChainContractProjectResponse createAntChainContractProjectWithOptions(CreateAntChainContractProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateAntChainContractProjectRequest
     * @return CreateAntChainContractProjectResponse
     */
    public CreateAntChainContractProjectResponse createAntChainContractProject(CreateAntChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainContractProjectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建MyChain托管账户</p>
     * 
     * @param request CreateAntChainKmsAccountNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainKmsAccountNewResponse
     */
    public CreateAntChainKmsAccountNewResponse createAntChainKmsAccountNewWithOptions(CreateAntChainKmsAccountNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChainKmsAccountNew"),
            new TeaPair("version", "2018-12-21"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainKmsAccountNewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建MyChain托管账户</p>
     * 
     * @param request CreateAntChainKmsAccountNewRequest
     * @return CreateAntChainKmsAccountNewResponse
     */
    public CreateAntChainKmsAccountNewResponse createAntChainKmsAccountNew(CreateAntChainKmsAccountNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainKmsAccountNewWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricChaincodeResponse
     */
    public CreateFabricChaincodeResponse createFabricChaincodeWithOptions(CreateFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricChaincodeRequest
     * @return CreateFabricChaincodeResponse
     */
    public CreateFabricChaincodeResponse createFabricChaincode(CreateFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricChaincodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>CreateFabricChaincodePackage</p>
     * 
     * @param request CreateFabricChaincodePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricChaincodePackageResponse
     */
    public CreateFabricChaincodePackageResponse createFabricChaincodePackageWithOptions(CreateFabricChaincodePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>CreateFabricChaincodePackage</p>
     * 
     * @param request CreateFabricChaincodePackageRequest
     * @return CreateFabricChaincodePackageResponse
     */
    public CreateFabricChaincodePackageResponse createFabricChaincodePackage(CreateFabricChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricChannelResponse
     */
    public CreateFabricChannelResponse createFabricChannelWithOptions(CreateFabricChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricChannelRequest
     * @return CreateFabricChannelResponse
     */
    public CreateFabricChannelResponse createFabricChannel(CreateFabricChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricChannelWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricChannelMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricChannelMemberResponse
     */
    public CreateFabricChannelMemberResponse createFabricChannelMemberWithOptions(CreateFabricChannelMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organization)) {
            query.put("Organization", request.organization);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricChannelMemberRequest
     * @return CreateFabricChannelMemberResponse
     */
    public CreateFabricChannelMemberResponse createFabricChannelMember(CreateFabricChannelMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricChannelMemberWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricConsortiumResponse
     */
    public CreateFabricConsortiumResponse createFabricConsortiumWithOptions(CreateFabricConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricConsortiumRequest
     * @return CreateFabricConsortiumResponse
     */
    public CreateFabricConsortiumResponse createFabricConsortium(CreateFabricConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricConsortiumMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricConsortiumMemberResponse
     */
    public CreateFabricConsortiumMemberResponse createFabricConsortiumMemberWithOptions(CreateFabricConsortiumMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricConsortiumMemberRequest
     * @return CreateFabricConsortiumMemberResponse
     */
    public CreateFabricConsortiumMemberResponse createFabricConsortiumMember(CreateFabricConsortiumMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricConsortiumMemberWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricOrganizationResponse
     */
    public CreateFabricOrganizationResponse createFabricOrganizationWithOptions(CreateFabricOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricOrganizationRequest
     * @return CreateFabricOrganizationResponse
     */
    public CreateFabricOrganizationResponse createFabricOrganization(CreateFabricOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricOrganizationWithOptions(request, runtime);
    }

    /**
     * @param request CreateFabricOrganizationUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFabricOrganizationUserResponse
     */
    public CreateFabricOrganizationUserResponse createFabricOrganizationUserWithOptions(CreateFabricOrganizationUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request CreateFabricOrganizationUserRequest
     * @return CreateFabricOrganizationUserResponse
     */
    public CreateFabricOrganizationUserResponse createFabricOrganizationUser(CreateFabricOrganizationUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricOrganizationUserWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAntChainConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAntChainConsortiumResponse
     */
    public DeleteAntChainConsortiumResponse deleteAntChainConsortiumWithOptions(DeleteAntChainConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteAntChainConsortiumRequest
     * @return DeleteAntChainConsortiumResponse
     */
    public DeleteAntChainConsortiumResponse deleteAntChainConsortium(DeleteAntChainConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAntChainConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAntChainContractContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAntChainContractContentResponse
     */
    public DeleteAntChainContractContentResponse deleteAntChainContractContentWithOptions(DeleteAntChainContractContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.contentId)) {
            body.put("ContentId", request.contentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteAntChainContractContentRequest
     * @return DeleteAntChainContractContentResponse
     */
    public DeleteAntChainContractContentResponse deleteAntChainContractContent(DeleteAntChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAntChainContractContentWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAntChainContractProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAntChainContractProjectResponse
     */
    public DeleteAntChainContractProjectResponse deleteAntChainContractProjectWithOptions(DeleteAntChainContractProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteAntChainContractProjectRequest
     * @return DeleteAntChainContractProjectResponse
     */
    public DeleteAntChainContractProjectResponse deleteAntChainContractProject(DeleteAntChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAntChainContractProjectWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAntChainMiniAppQRCodeAuthorizedUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAntChainMiniAppQRCodeAuthorizedUserResponse
     */
    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            body.put("Phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteAntChainMiniAppQRCodeAuthorizedUserRequest
     * @return DeleteAntChainMiniAppQRCodeAuthorizedUserResponse
     */
    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUser(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(request, runtime);
    }

    /**
     * @param request DeleteFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFabricChaincodeResponse
     */
    public DeleteFabricChaincodeResponse deleteFabricChaincodeWithOptions(DeleteFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DeleteFabricChaincodeRequest
     * @return DeleteFabricChaincodeResponse
     */
    public DeleteFabricChaincodeResponse deleteFabricChaincode(DeleteFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFabricChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainAccountsResponse
     */
    public DescribeAntChainAccountsResponse describeAntChainAccountsWithOptions(DescribeAntChainAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainAccountsRequest
     * @return DescribeAntChainAccountsResponse
     */
    public DescribeAntChainAccountsResponse describeAntChainAccounts(DescribeAntChainAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainAccountsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainAccountsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainAccountsV2Response
     */
    public DescribeAntChainAccountsV2Response describeAntChainAccountsV2WithOptions(DescribeAntChainAccountsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainAccountsV2Request
     * @return DescribeAntChainAccountsV2Response
     */
    public DescribeAntChainAccountsV2Response describeAntChainAccountsV2(DescribeAntChainAccountsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainAccountsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainBlockResponse
     */
    public DescribeAntChainBlockResponse describeAntChainBlockWithOptions(DescribeAntChainBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainBlockRequest
     * @return DescribeAntChainBlockResponse
     */
    public DescribeAntChainBlockResponse describeAntChainBlock(DescribeAntChainBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainBlockWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainBlockV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainBlockV2Response
     */
    public DescribeAntChainBlockV2Response describeAntChainBlockV2WithOptions(DescribeAntChainBlockV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainBlockV2Request
     * @return DescribeAntChainBlockV2Response
     */
    public DescribeAntChainBlockV2Response describeAntChainBlockV2(DescribeAntChainBlockV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainBlockV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainCertificateApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainCertificateApplicationsResponse
     */
    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplicationsWithOptions(DescribeAntChainCertificateApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainCertificateApplicationsRequest
     * @return DescribeAntChainCertificateApplicationsResponse
     */
    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplications(DescribeAntChainCertificateApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainCertificateApplicationsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainCertificateApplicationsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainCertificateApplicationsV2Response
     */
    public DescribeAntChainCertificateApplicationsV2Response describeAntChainCertificateApplicationsV2WithOptions(DescribeAntChainCertificateApplicationsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainCertificateApplicationsV2Request
     * @return DescribeAntChainCertificateApplicationsV2Response
     */
    public DescribeAntChainCertificateApplicationsV2Response describeAntChainCertificateApplicationsV2(DescribeAntChainCertificateApplicationsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainCertificateApplicationsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainConsortiumsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainConsortiumsResponse
     */
    public DescribeAntChainConsortiumsResponse describeAntChainConsortiumsWithOptions(DescribeAntChainConsortiumsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainConsortiumsRequest
     * @return DescribeAntChainConsortiumsResponse
     */
    public DescribeAntChainConsortiumsResponse describeAntChainConsortiums(DescribeAntChainConsortiumsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainConsortiumsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainConsortiumsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainConsortiumsV2Response
     */
    public DescribeAntChainConsortiumsV2Response describeAntChainConsortiumsV2WithOptions(DescribeAntChainConsortiumsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainConsortiumsV2Request
     * @return DescribeAntChainConsortiumsV2Response
     */
    public DescribeAntChainConsortiumsV2Response describeAntChainConsortiumsV2(DescribeAntChainConsortiumsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainConsortiumsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainContractProjectContentTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectContentTreeResponse
     */
    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTreeWithOptions(DescribeAntChainContractProjectContentTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainContractProjectContentTreeRequest
     * @return DescribeAntChainContractProjectContentTreeResponse
     */
    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTree(DescribeAntChainContractProjectContentTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainContractProjectContentTreeV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectContentTreeV2Response
     */
    public DescribeAntChainContractProjectContentTreeV2Response describeAntChainContractProjectContentTreeV2WithOptions(DescribeAntChainContractProjectContentTreeV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainContractProjectContentTreeV2Request
     * @return DescribeAntChainContractProjectContentTreeV2Response
     */
    public DescribeAntChainContractProjectContentTreeV2Response describeAntChainContractProjectContentTreeV2(DescribeAntChainContractProjectContentTreeV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainContractProjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectsResponse
     */
    public DescribeAntChainContractProjectsResponse describeAntChainContractProjectsWithOptions(DescribeAntChainContractProjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainContractProjectsRequest
     * @return DescribeAntChainContractProjectsResponse
     */
    public DescribeAntChainContractProjectsResponse describeAntChainContractProjects(DescribeAntChainContractProjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainContractProjectsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectsV2Response
     */
    public DescribeAntChainContractProjectsV2Response describeAntChainContractProjectsV2WithOptions(DescribeAntChainContractProjectsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainContractProjectsV2Request
     * @return DescribeAntChainContractProjectsV2Response
     */
    public DescribeAntChainContractProjectsV2Response describeAntChainContractProjectsV2(DescribeAntChainContractProjectsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainDownloadPathsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainDownloadPathsResponse
     */
    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPathsWithOptions(DescribeAntChainDownloadPathsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainDownloadPathsRequest
     * @return DescribeAntChainDownloadPathsResponse
     */
    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPaths(DescribeAntChainDownloadPathsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainDownloadPathsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainDownloadPathsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainDownloadPathsV2Response
     */
    public DescribeAntChainDownloadPathsV2Response describeAntChainDownloadPathsV2WithOptions(DescribeAntChainDownloadPathsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainDownloadPathsV2Request
     * @return DescribeAntChainDownloadPathsV2Response
     */
    public DescribeAntChainDownloadPathsV2Response describeAntChainDownloadPathsV2(DescribeAntChainDownloadPathsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainDownloadPathsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainInformationResponse
     */
    public DescribeAntChainInformationResponse describeAntChainInformationWithOptions(DescribeAntChainInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainInformationRequest
     * @return DescribeAntChainInformationResponse
     */
    public DescribeAntChainInformationResponse describeAntChainInformation(DescribeAntChainInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainInformationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainInformationV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainInformationV2Response
     */
    public DescribeAntChainInformationV2Response describeAntChainInformationV2WithOptions(DescribeAntChainInformationV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainInformationV2Request
     * @return DescribeAntChainInformationV2Response
     */
    public DescribeAntChainInformationV2Response describeAntChainInformationV2(DescribeAntChainInformationV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainInformationV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainLatestBlocksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestBlocksResponse
     */
    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocksWithOptions(DescribeAntChainLatestBlocksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainLatestBlocksRequest
     * @return DescribeAntChainLatestBlocksResponse
     */
    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocks(DescribeAntChainLatestBlocksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestBlocksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainLatestBlocksV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestBlocksV2Response
     */
    public DescribeAntChainLatestBlocksV2Response describeAntChainLatestBlocksV2WithOptions(DescribeAntChainLatestBlocksV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainLatestBlocksV2Request
     * @return DescribeAntChainLatestBlocksV2Response
     */
    public DescribeAntChainLatestBlocksV2Response describeAntChainLatestBlocksV2(DescribeAntChainLatestBlocksV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestBlocksV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainLatestTransactionDigestsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestTransactionDigestsResponse
     */
    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigestsWithOptions(DescribeAntChainLatestTransactionDigestsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainLatestTransactionDigestsRequest
     * @return DescribeAntChainLatestTransactionDigestsResponse
     */
    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigests(DescribeAntChainLatestTransactionDigestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainLatestTransactionDigestsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestTransactionDigestsV2Response
     */
    public DescribeAntChainLatestTransactionDigestsV2Response describeAntChainLatestTransactionDigestsV2WithOptions(DescribeAntChainLatestTransactionDigestsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainLatestTransactionDigestsV2Request
     * @return DescribeAntChainLatestTransactionDigestsV2Response
     */
    public DescribeAntChainLatestTransactionDigestsV2Response describeAntChainLatestTransactionDigestsV2(DescribeAntChainLatestTransactionDigestsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMembersResponse
     */
    public DescribeAntChainMembersResponse describeAntChainMembersWithOptions(DescribeAntChainMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMembersRequest
     * @return DescribeAntChainMembersResponse
     */
    public DescribeAntChainMembersResponse describeAntChainMembers(DescribeAntChainMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMembersV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMembersV2Response
     */
    public DescribeAntChainMembersV2Response describeAntChainMembersV2WithOptions(DescribeAntChainMembersV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMembersV2Request
     * @return DescribeAntChainMembersV2Response
     */
    public DescribeAntChainMembersV2Response describeAntChainMembersV2(DescribeAntChainMembersV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMembersV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLog(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response describeAntChainMiniAppBrowserQRCodeAccessLogV2WithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Response describeAntChainMiniAppBrowserQRCodeAccessLogV2(DescribeAntChainMiniAppBrowserQRCodeAccessLogV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsers(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2WithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Response describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserTransactionQRCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserTransactionQRCodeResponse
     */
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transactionHash)) {
            body.put("TransactionHash", request.transactionHash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserTransactionQRCodeRequest
     * @return DescribeAntChainMiniAppBrowserTransactionQRCodeResponse
     */
    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCode(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse
     */
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse describeAntChainMiniAppBrowserTransactionQRCodeNewWithOptions(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest
     * @return DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse
     */
    public DescribeAntChainMiniAppBrowserTransactionQRCodeNewResponse describeAntChainMiniAppBrowserTransactionQRCodeNew(DescribeAntChainMiniAppBrowserTransactionQRCodeNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserTransactionQRCodeNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainNodesResponse
     */
    public DescribeAntChainNodesResponse describeAntChainNodesWithOptions(DescribeAntChainNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainNodesRequest
     * @return DescribeAntChainNodesResponse
     */
    public DescribeAntChainNodesResponse describeAntChainNodes(DescribeAntChainNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainNodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainNodesV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainNodesV2Response
     */
    public DescribeAntChainNodesV2Response describeAntChainNodesV2WithOptions(DescribeAntChainNodesV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainNodesV2Request
     * @return DescribeAntChainNodesV2Response
     */
    public DescribeAntChainNodesV2Response describeAntChainNodesV2(DescribeAntChainNodesV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainNodesV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainQRCodeAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainQRCodeAuthorizationResponse
     */
    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorizationWithOptions(DescribeAntChainQRCodeAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainQRCodeAuthorizationRequest
     * @return DescribeAntChainQRCodeAuthorizationResponse
     */
    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorization(DescribeAntChainQRCodeAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainQRCodeAuthorizationV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainQRCodeAuthorizationV2Response
     */
    public DescribeAntChainQRCodeAuthorizationV2Response describeAntChainQRCodeAuthorizationV2WithOptions(DescribeAntChainQRCodeAuthorizationV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.QRCodeType)) {
            body.put("QRCodeType", request.QRCodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainQRCodeAuthorizationV2Request
     * @return DescribeAntChainQRCodeAuthorizationV2Response
     */
    public DescribeAntChainQRCodeAuthorizationV2Response describeAntChainQRCodeAuthorizationV2(DescribeAntChainQRCodeAuthorizationV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionResponse
     */
    public DescribeAntChainTransactionResponse describeAntChainTransactionWithOptions(DescribeAntChainTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionRequest
     * @return DescribeAntChainTransactionResponse
     */
    public DescribeAntChainTransactionResponse describeAntChainTransaction(DescribeAntChainTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionReceiptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionReceiptResponse
     */
    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceiptWithOptions(DescribeAntChainTransactionReceiptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionReceiptRequest
     * @return DescribeAntChainTransactionReceiptResponse
     */
    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceipt(DescribeAntChainTransactionReceiptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionReceiptWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionReceiptV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionReceiptV2Response
     */
    public DescribeAntChainTransactionReceiptV2Response describeAntChainTransactionReceiptV2WithOptions(DescribeAntChainTransactionReceiptV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionReceiptV2Request
     * @return DescribeAntChainTransactionReceiptV2Response
     */
    public DescribeAntChainTransactionReceiptV2Response describeAntChainTransactionReceiptV2(DescribeAntChainTransactionReceiptV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionReceiptV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionStatisticsResponse
     */
    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatisticsWithOptions(DescribeAntChainTransactionStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionStatisticsRequest
     * @return DescribeAntChainTransactionStatisticsResponse
     */
    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatistics(DescribeAntChainTransactionStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionStatisticsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionStatisticsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionStatisticsV2Response
     */
    public DescribeAntChainTransactionStatisticsV2Response describeAntChainTransactionStatisticsV2WithOptions(DescribeAntChainTransactionStatisticsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionStatisticsV2Request
     * @return DescribeAntChainTransactionStatisticsV2Response
     */
    public DescribeAntChainTransactionStatisticsV2Response describeAntChainTransactionStatisticsV2(DescribeAntChainTransactionStatisticsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionStatisticsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionV2Response
     */
    public DescribeAntChainTransactionV2Response describeAntChainTransactionV2WithOptions(DescribeAntChainTransactionV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainTransactionV2Request
     * @return DescribeAntChainTransactionV2Response
     */
    public DescribeAntChainTransactionV2Response describeAntChainTransactionV2(DescribeAntChainTransactionV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainsResponse
     */
    public DescribeAntChainsResponse describeAntChainsWithOptions(DescribeAntChainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainsRequest
     * @return DescribeAntChainsResponse
     */
    public DescribeAntChainsResponse describeAntChains(DescribeAntChainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainsV2Response
     */
    public DescribeAntChainsV2Response describeAntChainsV2WithOptions(DescribeAntChainsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeAntChainsV2Request
     * @return DescribeAntChainsV2Response
     */
    public DescribeAntChainsV2Response describeAntChainsV2(DescribeAntChainsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainsV2WithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumDeletableResponse
     */
    public DescribeEthereumDeletableResponse describeEthereumDeletableWithOptions(DescribeEthereumDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeEthereumDeletableRequest
     * @return DescribeEthereumDeletableResponse
     */
    public DescribeEthereumDeletableResponse describeEthereumDeletable(DescribeEthereumDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumDeletableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricCandidateOrganizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricCandidateOrganizationsResponse
     */
    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizationsWithOptions(DescribeFabricCandidateOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricCandidateOrganizationsRequest
     * @return DescribeFabricCandidateOrganizationsResponse
     */
    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizations(DescribeFabricCandidateOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricCandidateOrganizationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeFabricChaincodeDefinitionTask</p>
     * 
     * @param request DescribeFabricChaincodeDefinitionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChaincodeDefinitionTaskResponse
     */
    public DescribeFabricChaincodeDefinitionTaskResponse describeFabricChaincodeDefinitionTaskWithOptions(DescribeFabricChaincodeDefinitionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>DescribeFabricChaincodeDefinitionTask</p>
     * 
     * @param request DescribeFabricChaincodeDefinitionTaskRequest
     * @return DescribeFabricChaincodeDefinitionTaskResponse
     */
    public DescribeFabricChaincodeDefinitionTaskResponse describeFabricChaincodeDefinitionTask(DescribeFabricChaincodeDefinitionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChaincodeDefinitionTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChaincodeUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChaincodeUploadPolicyResponse
     */
    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicyWithOptions(DescribeFabricChaincodeUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricChaincodeUploadPolicyRequest
     * @return DescribeFabricChaincodeUploadPolicyResponse
     */
    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicy(DescribeFabricChaincodeUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChaincodeUploadPolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChannelMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChannelMembersResponse
     */
    public DescribeFabricChannelMembersResponse describeFabricChannelMembersWithOptions(DescribeFabricChannelMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricChannelMembersRequest
     * @return DescribeFabricChannelMembersResponse
     */
    public DescribeFabricChannelMembersResponse describeFabricChannelMembers(DescribeFabricChannelMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChannelMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumAdminStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumAdminStatusResponse
     */
    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatusWithOptions(DescribeFabricConsortiumAdminStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumAdminStatusRequest
     * @return DescribeFabricConsortiumAdminStatusResponse
     */
    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatus(DescribeFabricConsortiumAdminStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumAdminStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumChaincodesResponse
     */
    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodesWithOptions(DescribeFabricConsortiumChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumChaincodesRequest
     * @return DescribeFabricConsortiumChaincodesResponse
     */
    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodes(DescribeFabricConsortiumChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumChaincodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumChannelsResponse
     */
    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannelsWithOptions(DescribeFabricConsortiumChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumChannelsRequest
     * @return DescribeFabricConsortiumChannelsResponse
     */
    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannels(DescribeFabricConsortiumChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumConfigResponse
     */
    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeFabricConsortiumConfigResponse
     */
    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumConfigWithOptions(runtime);
    }

    /**
     * @param request DescribeFabricConsortiumDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumDeletableResponse
     */
    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletableWithOptions(DescribeFabricConsortiumDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumDeletableRequest
     * @return DescribeFabricConsortiumDeletableResponse
     */
    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletable(DescribeFabricConsortiumDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumDeletableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumMemberApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumMemberApprovalResponse
     */
    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApprovalWithOptions(DescribeFabricConsortiumMemberApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            query.put("ConsortiumId", request.consortiumId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumMemberApprovalRequest
     * @return DescribeFabricConsortiumMemberApprovalResponse
     */
    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApproval(DescribeFabricConsortiumMemberApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumMemberApprovalWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumMembersResponse
     */
    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembersWithOptions(DescribeFabricConsortiumMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumMembersRequest
     * @return DescribeFabricConsortiumMembersResponse
     */
    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembers(DescribeFabricConsortiumMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumOrderersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumOrderersResponse
     */
    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderersWithOptions(DescribeFabricConsortiumOrderersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumOrderersRequest
     * @return DescribeFabricConsortiumOrderersResponse
     */
    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderers(DescribeFabricConsortiumOrderersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumOrderersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricConsortiumSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumSpecsResponse
     */
    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeFabricConsortiumSpecsResponse
     */
    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumSpecsWithOptions(runtime);
    }

    /**
     * @param request DescribeFabricConsortiumsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricConsortiumsResponse
     */
    public DescribeFabricConsortiumsResponse describeFabricConsortiumsWithOptions(DescribeFabricConsortiumsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricConsortiumsRequest
     * @return DescribeFabricConsortiumsResponse
     */
    public DescribeFabricConsortiumsResponse describeFabricConsortiums(DescribeFabricConsortiumsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricConsortiumsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricExplorerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricExplorerResponse
     */
    public DescribeFabricExplorerResponse describeFabricExplorerWithOptions(DescribeFabricExplorerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricExplorerRequest
     * @return DescribeFabricExplorerResponse
     */
    public DescribeFabricExplorerResponse describeFabricExplorer(DescribeFabricExplorerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricExplorerWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricInvitationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricInvitationCodeResponse
     */
    public DescribeFabricInvitationCodeResponse describeFabricInvitationCodeWithOptions(DescribeFabricInvitationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricInvitationCodeRequest
     * @return DescribeFabricInvitationCodeResponse
     */
    public DescribeFabricInvitationCodeResponse describeFabricInvitationCode(DescribeFabricInvitationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricInvitationCodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricInviterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricInviterResponse
     */
    public DescribeFabricInviterResponse describeFabricInviterWithOptions(DescribeFabricInviterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricInviterRequest
     * @return DescribeFabricInviterResponse
     */
    public DescribeFabricInviterResponse describeFabricInviter(DescribeFabricInviterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricInviterWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrdererLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrdererLogsResponse
     */
    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogsWithOptions(DescribeFabricOrdererLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrdererLogsRequest
     * @return DescribeFabricOrdererLogsResponse
     */
    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogs(DescribeFabricOrdererLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrdererLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationResponse
     */
    public DescribeFabricOrganizationResponse describeFabricOrganizationWithOptions(DescribeFabricOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationRequest
     * @return DescribeFabricOrganizationResponse
     */
    public DescribeFabricOrganizationResponse describeFabricOrganization(DescribeFabricOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DescribeFabricOrganizationChaincodePackage</p>
     * 
     * @param request DescribeFabricOrganizationChaincodePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationChaincodePackageResponse
     */
    public DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackageWithOptions(DescribeFabricOrganizationChaincodePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>DescribeFabricOrganizationChaincodePackage</p>
     * 
     * @param request DescribeFabricOrganizationChaincodePackageRequest
     * @return DescribeFabricOrganizationChaincodePackageResponse
     */
    public DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackage(DescribeFabricOrganizationChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationChaincodesResponse
     */
    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodesWithOptions(DescribeFabricOrganizationChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationChaincodesRequest
     * @return DescribeFabricOrganizationChaincodesResponse
     */
    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodes(DescribeFabricOrganizationChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationChaincodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationChannelsResponse
     */
    public DescribeFabricOrganizationChannelsResponse describeFabricOrganizationChannelsWithOptions(DescribeFabricOrganizationChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationChannelsRequest
     * @return DescribeFabricOrganizationChannelsResponse
     */
    public DescribeFabricOrganizationChannelsResponse describeFabricOrganizationChannels(DescribeFabricOrganizationChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationDeletableResponse
     */
    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletableWithOptions(DescribeFabricOrganizationDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationDeletableRequest
     * @return DescribeFabricOrganizationDeletableResponse
     */
    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletable(DescribeFabricOrganizationDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationDeletableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationMembersResponse
     */
    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembersWithOptions(DescribeFabricOrganizationMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationMembersRequest
     * @return DescribeFabricOrganizationMembersResponse
     */
    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembers(DescribeFabricOrganizationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationPeersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationPeersResponse
     */
    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeersWithOptions(DescribeFabricOrganizationPeersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationPeersRequest
     * @return DescribeFabricOrganizationPeersResponse
     */
    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeers(DescribeFabricOrganizationPeersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationPeersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationSpecsResponse
     */
    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeFabricOrganizationSpecsResponse
     */
    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationSpecsWithOptions(runtime);
    }

    /**
     * @param request DescribeFabricOrganizationUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationUsersResponse
     */
    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsersWithOptions(DescribeFabricOrganizationUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationUsersRequest
     * @return DescribeFabricOrganizationUsersResponse
     */
    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsers(DescribeFabricOrganizationUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationUsersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationsResponse
     */
    public DescribeFabricOrganizationsResponse describeFabricOrganizationsWithOptions(DescribeFabricOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricOrganizationsRequest
     * @return DescribeFabricOrganizationsResponse
     */
    public DescribeFabricOrganizationsResponse describeFabricOrganizations(DescribeFabricOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricPeerLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricPeerLogsResponse
     */
    public DescribeFabricPeerLogsResponse describeFabricPeerLogsWithOptions(DescribeFabricPeerLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeFabricPeerLogsRequest
     * @return DescribeFabricPeerLogsResponse
     */
    public DescribeFabricPeerLogsResponse describeFabricPeerLogs(DescribeFabricPeerLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricPeerLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRootDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRootDomainResponse
     */
    public DescribeRootDomainResponse describeRootDomainWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeRootDomainResponse
     */
    public DescribeRootDomainResponse describeRootDomain() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRootDomainWithOptions(runtime);
    }

    /**
     * @param request DescribeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasksWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @return DescribeTasksResponse
     */
    public DescribeTasksResponse describeTasks() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTasksWithOptions(runtime);
    }

    /**
     * @param request DownloadFabricOrganizationSDKRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadFabricOrganizationSDKResponse
     */
    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDKWithOptions(DownloadFabricOrganizationSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request DownloadFabricOrganizationSDKRequest
     * @return DownloadFabricOrganizationSDKResponse
     */
    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDK(DownloadFabricOrganizationSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadFabricOrganizationSDKWithOptions(request, runtime);
    }

    /**
     * @param request FreezeAntChainAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FreezeAntChainAccountResponse
     */
    public FreezeAntChainAccountResponse freezeAntChainAccountWithOptions(FreezeAntChainAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request FreezeAntChainAccountRequest
     * @return FreezeAntChainAccountResponse
     */
    public FreezeAntChainAccountResponse freezeAntChainAccount(FreezeAntChainAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.freezeAntChainAccountWithOptions(request, runtime);
    }

    /**
     * @param request InstallFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallFabricChaincodeResponse
     */
    public InstallFabricChaincodeResponse installFabricChaincodeWithOptions(InstallFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request InstallFabricChaincodeRequest
     * @return InstallFabricChaincodeResponse
     */
    public InstallFabricChaincodeResponse installFabricChaincode(InstallFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installFabricChaincodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>InstallFabricChaincodePackage</p>
     * 
     * @param request InstallFabricChaincodePackageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallFabricChaincodePackageResponse
     */
    public InstallFabricChaincodePackageResponse installFabricChaincodePackageWithOptions(InstallFabricChaincodePackageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>InstallFabricChaincodePackage</p>
     * 
     * @param request InstallFabricChaincodePackageRequest
     * @return InstallFabricChaincodePackageResponse
     */
    public InstallFabricChaincodePackageResponse installFabricChaincodePackage(InstallFabricChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installFabricChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request InstantiateFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstantiateFabricChaincodeResponse
     */
    public InstantiateFabricChaincodeResponse instantiateFabricChaincodeWithOptions(InstantiateFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request InstantiateFabricChaincodeRequest
     * @return InstantiateFabricChaincodeResponse
     */
    public InstantiateFabricChaincodeResponse instantiateFabricChaincode(InstantiateFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.instantiateFabricChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request JoinFabricChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinFabricChannelResponse
     */
    public JoinFabricChannelResponse joinFabricChannelWithOptions(JoinFabricChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request JoinFabricChannelRequest
     * @return JoinFabricChannelResponse
     */
    public JoinFabricChannelResponse joinFabricChannel(JoinFabricChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinFabricChannelWithOptions(request, runtime);
    }

    /**
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request ResetAntChainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAntChainCertificateResponse
     */
    public ResetAntChainCertificateResponse resetAntChainCertificateWithOptions(ResetAntChainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ResetAntChainCertificateRequest
     * @return ResetAntChainCertificateResponse
     */
    public ResetAntChainCertificateResponse resetAntChainCertificate(ResetAntChainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAntChainCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ResetAntChainUserCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAntChainUserCertificateResponse
     */
    public ResetAntChainUserCertificateResponse resetAntChainUserCertificateWithOptions(ResetAntChainUserCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ResetAntChainUserCertificateRequest
     * @return ResetAntChainUserCertificateResponse
     */
    public ResetAntChainUserCertificateResponse resetAntChainUserCertificate(ResetAntChainUserCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAntChainUserCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ResetFabricOrganizationUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetFabricOrganizationUserPasswordResponse
     */
    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPasswordWithOptions(ResetFabricOrganizationUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request ResetFabricOrganizationUserPasswordRequest
     * @return ResetFabricOrganizationUserPasswordResponse
     */
    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPassword(ResetFabricOrganizationUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetFabricOrganizationUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>SubmitFabricChaincodeDefinition</p>
     * 
     * @param request SubmitFabricChaincodeDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitFabricChaincodeDefinitionResponse
     */
    public SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinitionWithOptions(SubmitFabricChaincodeDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>SubmitFabricChaincodeDefinition</p>
     * 
     * @param request SubmitFabricChaincodeDefinitionRequest
     * @return SubmitFabricChaincodeDefinitionResponse
     */
    public SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinition(SubmitFabricChaincodeDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFabricChaincodeDefinitionWithOptions(request, runtime);
    }

    /**
     * @param request SynchronizeFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeFabricChaincodeResponse
     */
    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincodeWithOptions(SynchronizeFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request SynchronizeFabricChaincodeRequest
     * @return SynchronizeFabricChaincodeResponse
     */
    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincode(SynchronizeFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeFabricChaincodeWithOptions(request, runtime);
    }

    /**
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

    /**
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request UnfreezeAntChainAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnfreezeAntChainAccountResponse
     */
    public UnfreezeAntChainAccountResponse unfreezeAntChainAccountWithOptions(UnfreezeAntChainAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UnfreezeAntChainAccountRequest
     * @return UnfreezeAntChainAccountResponse
     */
    public UnfreezeAntChainAccountResponse unfreezeAntChainAccount(UnfreezeAntChainAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unfreezeAntChainAccountWithOptions(request, runtime);
    }

    /**
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

    /**
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainResponse
     */
    public UpdateAntChainResponse updateAntChainWithOptions(UpdateAntChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.antChainName)) {
            body.put("AntChainName", request.antChainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainRequest
     * @return UpdateAntChainResponse
     */
    public UpdateAntChainResponse updateAntChain(UpdateAntChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainConsortiumResponse
     */
    public UpdateAntChainConsortiumResponse updateAntChainConsortiumWithOptions(UpdateAntChainConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainConsortiumRequest
     * @return UpdateAntChainConsortiumResponse
     */
    public UpdateAntChainConsortiumResponse updateAntChainConsortium(UpdateAntChainConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainContractContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainContractContentResponse
     */
    public UpdateAntChainContractContentResponse updateAntChainContractContentWithOptions(UpdateAntChainContractContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainContractContentRequest
     * @return UpdateAntChainContractContentResponse
     */
    public UpdateAntChainContractContentResponse updateAntChainContractContent(UpdateAntChainContractContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainContractContentWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainContractProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainContractProjectResponse
     */
    public UpdateAntChainContractProjectResponse updateAntChainContractProjectWithOptions(UpdateAntChainContractProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainContractProjectRequest
     * @return UpdateAntChainContractProjectResponse
     */
    public UpdateAntChainContractProjectResponse updateAntChainContractProject(UpdateAntChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainContractProjectWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainMemberResponse
     */
    public UpdateAntChainMemberResponse updateAntChainMemberWithOptions(UpdateAntChainMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainMemberRequest
     * @return UpdateAntChainMemberResponse
     */
    public UpdateAntChainMemberResponse updateAntChainMember(UpdateAntChainMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainMemberWithOptions(request, runtime);
    }

    /**
     * @param request UpdateAntChainQRCodeAuthorizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAntChainQRCodeAuthorizationResponse
     */
    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorizationWithOptions(UpdateAntChainQRCodeAuthorizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @param request UpdateAntChainQRCodeAuthorizationRequest
     * @return UpdateAntChainQRCodeAuthorizationResponse
     */
    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorization(UpdateAntChainQRCodeAuthorizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request UpgradeFabricChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeFabricChaincodeResponse
     */
    public UpgradeFabricChaincodeResponse upgradeFabricChaincodeWithOptions(UpgradeFabricChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request UpgradeFabricChaincodeRequest
     * @return UpgradeFabricChaincodeResponse
     */
    public UpgradeFabricChaincodeResponse upgradeFabricChaincode(UpgradeFabricChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFabricChaincodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>UpgradeFabricChaincodeDefinition</p>
     * 
     * @param request UpgradeFabricChaincodeDefinitionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeFabricChaincodeDefinitionResponse
     */
    public UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinitionWithOptions(UpgradeFabricChaincodeDefinitionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * <b>summary</b> : 
     * <p>UpgradeFabricChaincodeDefinition</p>
     * 
     * @param request UpgradeFabricChaincodeDefinitionRequest
     * @return UpgradeFabricChaincodeDefinitionResponse
     */
    public UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinition(UpgradeFabricChaincodeDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFabricChaincodeDefinitionWithOptions(request, runtime);
    }
}
