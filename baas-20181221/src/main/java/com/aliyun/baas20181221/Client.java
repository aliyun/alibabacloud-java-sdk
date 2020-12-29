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
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AcceptFabricInvitation", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new AcceptFabricInvitationResponse());
    }

    public AcceptFabricInvitationResponse acceptFabricInvitation(AcceptFabricInvitationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.acceptFabricInvitationWithOptions(request, runtime);
    }

    public ApplyAntChainCertificateResponse applyAntChainCertificateWithOptions(ApplyAntChainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyAntChainCertificate", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyAntChainCertificateResponse());
    }

    public ApplyAntChainCertificateResponse applyAntChainCertificate(ApplyAntChainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAntChainCertificateWithOptions(request, runtime);
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreationWithOptions(ApplyAntChainCertificateWithKeyAutoCreationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyAntChainCertificateWithKeyAutoCreation", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyAntChainCertificateWithKeyAutoCreationResponse());
    }

    public ApplyAntChainCertificateWithKeyAutoCreationResponse applyAntChainCertificateWithKeyAutoCreation(ApplyAntChainCertificateWithKeyAutoCreationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyAntChainCertificateWithKeyAutoCreationWithOptions(request, runtime);
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest request = new BatchAddAntChainMiniAppQRCodeAuthorizedUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.phoneList)) {
            request.phoneListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.phoneList, "PhoneList", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("BatchAddAntChainMiniAppQRCodeAuthorizedUsers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse());
    }

    public BatchAddAntChainMiniAppQRCodeAuthorizedUsersResponse batchAddAntChainMiniAppQRCodeAuthorizedUsers(BatchAddAntChainMiniAppQRCodeAuthorizedUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddAntChainMiniAppQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomainWithOptions(CheckFabricConsortiumDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckFabricConsortiumDomain", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CheckFabricConsortiumDomainResponse());
    }

    public CheckFabricConsortiumDomainResponse checkFabricConsortiumDomain(CheckFabricConsortiumDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkFabricConsortiumDomainWithOptions(request, runtime);
    }

    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomainWithOptions(CheckFabricOrganizationDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckFabricOrganizationDomain", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CheckFabricOrganizationDomainResponse());
    }

    public CheckFabricOrganizationDomainResponse checkFabricOrganizationDomain(CheckFabricOrganizationDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkFabricOrganizationDomainWithOptions(request, runtime);
    }

    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMemberWithOptions(ConfirmFabricConsortiumMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfirmFabricConsortiumMember", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ConfirmFabricConsortiumMemberResponse());
    }

    public ConfirmFabricConsortiumMemberResponse confirmFabricConsortiumMember(ConfirmFabricConsortiumMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.confirmFabricConsortiumMemberWithOptions(request, runtime);
    }

    public CopyAntChainContractProjectResponse copyAntChainContractProjectWithOptions(CopyAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CopyAntChainContractProject", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CopyAntChainContractProjectResponse());
    }

    public CopyAntChainContractProjectResponse copyAntChainContractProject(CopyAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyAntChainContractProjectWithOptions(request, runtime);
    }

    public CreateAntChainAccountResponse createAntChainAccountWithOptions(CreateAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntChainAccount", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntChainAccountResponse());
    }

    public CreateAntChainAccountResponse createAntChainAccount(CreateAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainAccountWithOptions(request, runtime);
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreationWithOptions(CreateAntChainAccountWithKeyPairAutoCreationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntChainAccountWithKeyPairAutoCreation", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntChainAccountWithKeyPairAutoCreationResponse());
    }

    public CreateAntChainAccountWithKeyPairAutoCreationResponse createAntChainAccountWithKeyPairAutoCreation(CreateAntChainAccountWithKeyPairAutoCreationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainAccountWithKeyPairAutoCreationWithOptions(request, runtime);
    }

    public CreateAntChainConsortiumResponse createAntChainConsortiumWithOptions(CreateAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntChainConsortium", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntChainConsortiumResponse());
    }

    public CreateAntChainConsortiumResponse createAntChainConsortium(CreateAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainConsortiumWithOptions(request, runtime);
    }

    public CreateAntChainContractContentResponse createAntChainContractContentWithOptions(CreateAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntChainContractContent", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntChainContractContentResponse());
    }

    public CreateAntChainContractContentResponse createAntChainContractContent(CreateAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainContractContentWithOptions(request, runtime);
    }

    public CreateAntChainContractProjectResponse createAntChainContractProjectWithOptions(CreateAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAntChainContractProject", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAntChainContractProjectResponse());
    }

    public CreateAntChainContractProjectResponse createAntChainContractProject(CreateAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAntChainContractProjectWithOptions(request, runtime);
    }

    public CreateFabricChaincodeResponse createFabricChaincodeWithOptions(CreateFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricChaincodeResponse());
    }

    public CreateFabricChaincodeResponse createFabricChaincode(CreateFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChaincodeWithOptions(request, runtime);
    }

    public CreateFabricChannelResponse createFabricChannelWithOptions(CreateFabricChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricChannel", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricChannelResponse());
    }

    public CreateFabricChannelResponse createFabricChannel(CreateFabricChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChannelWithOptions(request, runtime);
    }

    public CreateFabricChannelMemberResponse createFabricChannelMemberWithOptions(CreateFabricChannelMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricChannelMember", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricChannelMemberResponse());
    }

    public CreateFabricChannelMemberResponse createFabricChannelMember(CreateFabricChannelMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricChannelMemberWithOptions(request, runtime);
    }

    public CreateFabricConsortiumResponse createFabricConsortiumWithOptions(CreateFabricConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricConsortium", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricConsortiumResponse());
    }

    public CreateFabricConsortiumResponse createFabricConsortium(CreateFabricConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricConsortiumWithOptions(request, runtime);
    }

    public CreateFabricConsortiumMemberResponse createFabricConsortiumMemberWithOptions(CreateFabricConsortiumMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricConsortiumMember", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricConsortiumMemberResponse());
    }

    public CreateFabricConsortiumMemberResponse createFabricConsortiumMember(CreateFabricConsortiumMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricConsortiumMemberWithOptions(request, runtime);
    }

    public CreateFabricOrganizationResponse createFabricOrganizationWithOptions(CreateFabricOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricOrganization", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricOrganizationResponse());
    }

    public CreateFabricOrganizationResponse createFabricOrganization(CreateFabricOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricOrganizationWithOptions(request, runtime);
    }

    public CreateFabricOrganizationUserResponse createFabricOrganizationUserWithOptions(CreateFabricOrganizationUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFabricOrganizationUser", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFabricOrganizationUserResponse());
    }

    public CreateFabricOrganizationUserResponse createFabricOrganizationUser(CreateFabricOrganizationUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFabricOrganizationUserWithOptions(request, runtime);
    }

    public DeleteAntChainConsortiumResponse deleteAntChainConsortiumWithOptions(DeleteAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAntChainConsortium", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAntChainConsortiumResponse());
    }

    public DeleteAntChainConsortiumResponse deleteAntChainConsortium(DeleteAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainConsortiumWithOptions(request, runtime);
    }

    public DeleteAntChainContractContentResponse deleteAntChainContractContentWithOptions(DeleteAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAntChainContractContent", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAntChainContractContentResponse());
    }

    public DeleteAntChainContractContentResponse deleteAntChainContractContent(DeleteAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainContractContentWithOptions(request, runtime);
    }

    public DeleteAntChainContractProjectResponse deleteAntChainContractProjectWithOptions(DeleteAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAntChainContractProject", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAntChainContractProjectResponse());
    }

    public DeleteAntChainContractProjectResponse deleteAntChainContractProject(DeleteAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainContractProjectWithOptions(request, runtime);
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAntChainMiniAppQRCodeAuthorizedUser", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAntChainMiniAppQRCodeAuthorizedUserResponse());
    }

    public DeleteAntChainMiniAppQRCodeAuthorizedUserResponse deleteAntChainMiniAppQRCodeAuthorizedUser(DeleteAntChainMiniAppQRCodeAuthorizedUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAntChainMiniAppQRCodeAuthorizedUserWithOptions(request, runtime);
    }

    public DeleteFabricChaincodeResponse deleteFabricChaincodeWithOptions(DeleteFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFabricChaincodeResponse());
    }

    public DeleteFabricChaincodeResponse deleteFabricChaincode(DeleteFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFabricChaincodeWithOptions(request, runtime);
    }

    public DescribeAntChainAccountsResponse describeAntChainAccountsWithOptions(DescribeAntChainAccountsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainAccounts", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainAccountsResponse());
    }

    public DescribeAntChainAccountsResponse describeAntChainAccounts(DescribeAntChainAccountsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainAccountsWithOptions(request, runtime);
    }

    public DescribeAntChainBlockResponse describeAntChainBlockWithOptions(DescribeAntChainBlockRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainBlock", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainBlockResponse());
    }

    public DescribeAntChainBlockResponse describeAntChainBlock(DescribeAntChainBlockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainBlockWithOptions(request, runtime);
    }

    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplicationsWithOptions(DescribeAntChainCertificateApplicationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainCertificateApplications", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainCertificateApplicationsResponse());
    }

    public DescribeAntChainCertificateApplicationsResponse describeAntChainCertificateApplications(DescribeAntChainCertificateApplicationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainCertificateApplicationsWithOptions(request, runtime);
    }

    public DescribeAntChainConsortiumsResponse describeAntChainConsortiumsWithOptions(DescribeAntChainConsortiumsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainConsortiums", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainConsortiumsResponse());
    }

    public DescribeAntChainConsortiumsResponse describeAntChainConsortiums(DescribeAntChainConsortiumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainConsortiumsWithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTreeWithOptions(DescribeAntChainContractProjectContentTreeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainContractProjectContentTree", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainContractProjectContentTreeResponse());
    }

    public DescribeAntChainContractProjectContentTreeResponse describeAntChainContractProjectContentTree(DescribeAntChainContractProjectContentTreeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeWithOptions(request, runtime);
    }

    public DescribeAntChainContractProjectsResponse describeAntChainContractProjectsWithOptions(DescribeAntChainContractProjectsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainContractProjects", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainContractProjectsResponse());
    }

    public DescribeAntChainContractProjectsResponse describeAntChainContractProjects(DescribeAntChainContractProjectsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainContractProjectsWithOptions(request, runtime);
    }

    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPathsWithOptions(DescribeAntChainDownloadPathsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainDownloadPaths", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainDownloadPathsResponse());
    }

    public DescribeAntChainDownloadPathsResponse describeAntChainDownloadPaths(DescribeAntChainDownloadPathsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainDownloadPathsWithOptions(request, runtime);
    }

    public DescribeAntChainInformationResponse describeAntChainInformationWithOptions(DescribeAntChainInformationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainInformation", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainInformationResponse());
    }

    public DescribeAntChainInformationResponse describeAntChainInformation(DescribeAntChainInformationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainInformationWithOptions(request, runtime);
    }

    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocksWithOptions(DescribeAntChainLatestBlocksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainLatestBlocks", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainLatestBlocksResponse());
    }

    public DescribeAntChainLatestBlocksResponse describeAntChainLatestBlocks(DescribeAntChainLatestBlocksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestBlocksWithOptions(request, runtime);
    }

    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigestsWithOptions(DescribeAntChainLatestTransactionDigestsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainLatestTransactionDigests", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainLatestTransactionDigestsResponse());
    }

    public DescribeAntChainLatestTransactionDigestsResponse describeAntChainLatestTransactionDigests(DescribeAntChainLatestTransactionDigestsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsWithOptions(request, runtime);
    }

    public DescribeAntChainMembersResponse describeAntChainMembersWithOptions(DescribeAntChainMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainMembers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainMembersResponse());
    }

    public DescribeAntChainMembersResponse describeAntChainMembers(DescribeAntChainMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMembersWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainMiniAppBrowserQRCodeAccessLog", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAccessLogResponse describeAntChainMiniAppBrowserQRCodeAccessLog(DescribeAntChainMiniAppBrowserQRCodeAccessLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse());
    }

    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsers(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersWithOptions(request, runtime);
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainMiniAppBrowserTransactionQRCode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainMiniAppBrowserTransactionQRCodeResponse());
    }

    public DescribeAntChainMiniAppBrowserTransactionQRCodeResponse describeAntChainMiniAppBrowserTransactionQRCode(DescribeAntChainMiniAppBrowserTransactionQRCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainMiniAppBrowserTransactionQRCodeWithOptions(request, runtime);
    }

    public DescribeAntChainNodesResponse describeAntChainNodesWithOptions(DescribeAntChainNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainNodes", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainNodesResponse());
    }

    public DescribeAntChainNodesResponse describeAntChainNodes(DescribeAntChainNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainNodesWithOptions(request, runtime);
    }

    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorizationWithOptions(DescribeAntChainQRCodeAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainQRCodeAuthorization", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainQRCodeAuthorizationResponse());
    }

    public DescribeAntChainQRCodeAuthorizationResponse describeAntChainQRCodeAuthorization(DescribeAntChainQRCodeAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    public DescribeAntChainsResponse describeAntChainsWithOptions(DescribeAntChainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChains", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainsResponse());
    }

    public DescribeAntChainsResponse describeAntChains(DescribeAntChainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainsWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionResponse describeAntChainTransactionWithOptions(DescribeAntChainTransactionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainTransaction", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainTransactionResponse());
    }

    public DescribeAntChainTransactionResponse describeAntChainTransaction(DescribeAntChainTransactionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceiptWithOptions(DescribeAntChainTransactionReceiptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainTransactionReceipt", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainTransactionReceiptResponse());
    }

    public DescribeAntChainTransactionReceiptResponse describeAntChainTransactionReceipt(DescribeAntChainTransactionReceiptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionReceiptWithOptions(request, runtime);
    }

    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatisticsWithOptions(DescribeAntChainTransactionStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAntChainTransactionStatistics", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAntChainTransactionStatisticsResponse());
    }

    public DescribeAntChainTransactionStatisticsResponse describeAntChainTransactionStatistics(DescribeAntChainTransactionStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAntChainTransactionStatisticsWithOptions(request, runtime);
    }

    public DescribeEthereumDeletableResponse describeEthereumDeletableWithOptions(DescribeEthereumDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeEthereumDeletable", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeEthereumDeletableResponse());
    }

    public DescribeEthereumDeletableResponse describeEthereumDeletable(DescribeEthereumDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeEthereumDeletableWithOptions(request, runtime);
    }

    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizationsWithOptions(DescribeFabricCandidateOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricCandidateOrganizations", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricCandidateOrganizationsResponse());
    }

    public DescribeFabricCandidateOrganizationsResponse describeFabricCandidateOrganizations(DescribeFabricCandidateOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricCandidateOrganizationsWithOptions(request, runtime);
    }

    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicyWithOptions(DescribeFabricChaincodeUploadPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricChaincodeUploadPolicy", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricChaincodeUploadPolicyResponse());
    }

    public DescribeFabricChaincodeUploadPolicyResponse describeFabricChaincodeUploadPolicy(DescribeFabricChaincodeUploadPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricChaincodeUploadPolicyWithOptions(request, runtime);
    }

    public DescribeFabricChannelMembersResponse describeFabricChannelMembersWithOptions(DescribeFabricChannelMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricChannelMembers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricChannelMembersResponse());
    }

    public DescribeFabricChannelMembersResponse describeFabricChannelMembers(DescribeFabricChannelMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricChannelMembersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatusWithOptions(DescribeFabricConsortiumAdminStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumAdminStatus", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumAdminStatusResponse());
    }

    public DescribeFabricConsortiumAdminStatusResponse describeFabricConsortiumAdminStatus(DescribeFabricConsortiumAdminStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumAdminStatusWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodesWithOptions(DescribeFabricConsortiumChaincodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumChaincodes", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumChaincodesResponse());
    }

    public DescribeFabricConsortiumChaincodesResponse describeFabricConsortiumChaincodes(DescribeFabricConsortiumChaincodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumChaincodesWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannelsWithOptions(DescribeFabricConsortiumChannelsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumChannels", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumChannelsResponse());
    }

    public DescribeFabricConsortiumChannelsResponse describeFabricConsortiumChannels(DescribeFabricConsortiumChannelsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumChannelsWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfigWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumConfig", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumConfigResponse());
    }

    public DescribeFabricConsortiumConfigResponse describeFabricConsortiumConfig() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumConfigWithOptions(runtime);
    }

    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletableWithOptions(DescribeFabricConsortiumDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumDeletable", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumDeletableResponse());
    }

    public DescribeFabricConsortiumDeletableResponse describeFabricConsortiumDeletable(DescribeFabricConsortiumDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumDeletableWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApprovalWithOptions(DescribeFabricConsortiumMemberApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumMemberApproval", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumMemberApprovalResponse());
    }

    public DescribeFabricConsortiumMemberApprovalResponse describeFabricConsortiumMemberApproval(DescribeFabricConsortiumMemberApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumMemberApprovalWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembersWithOptions(DescribeFabricConsortiumMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumMembers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumMembersResponse());
    }

    public DescribeFabricConsortiumMembersResponse describeFabricConsortiumMembers(DescribeFabricConsortiumMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumMembersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderersWithOptions(DescribeFabricConsortiumOrderersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumOrderers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumOrderersResponse());
    }

    public DescribeFabricConsortiumOrderersResponse describeFabricConsortiumOrderers(DescribeFabricConsortiumOrderersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumOrderersWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumsResponse describeFabricConsortiumsWithOptions(DescribeFabricConsortiumsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiums", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumsResponse());
    }

    public DescribeFabricConsortiumsResponse describeFabricConsortiums(DescribeFabricConsortiumsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumsWithOptions(request, runtime);
    }

    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricConsortiumSpecs", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricConsortiumSpecsResponse());
    }

    public DescribeFabricConsortiumSpecsResponse describeFabricConsortiumSpecs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricConsortiumSpecsWithOptions(runtime);
    }

    public DescribeFabricExplorerResponse describeFabricExplorerWithOptions(DescribeFabricExplorerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricExplorer", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricExplorerResponse());
    }

    public DescribeFabricExplorerResponse describeFabricExplorer(DescribeFabricExplorerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricExplorerWithOptions(request, runtime);
    }

    public DescribeFabricInvitationCodeResponse describeFabricInvitationCodeWithOptions(DescribeFabricInvitationCodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricInvitationCode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricInvitationCodeResponse());
    }

    public DescribeFabricInvitationCodeResponse describeFabricInvitationCode(DescribeFabricInvitationCodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricInvitationCodeWithOptions(request, runtime);
    }

    public DescribeFabricInviterResponse describeFabricInviterWithOptions(DescribeFabricInviterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricInviter", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricInviterResponse());
    }

    public DescribeFabricInviterResponse describeFabricInviter(DescribeFabricInviterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricInviterWithOptions(request, runtime);
    }

    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogsWithOptions(DescribeFabricOrdererLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrdererLogs", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrdererLogsResponse());
    }

    public DescribeFabricOrdererLogsResponse describeFabricOrdererLogs(DescribeFabricOrdererLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrdererLogsWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationResponse describeFabricOrganizationWithOptions(DescribeFabricOrganizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganization", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationResponse());
    }

    public DescribeFabricOrganizationResponse describeFabricOrganization(DescribeFabricOrganizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodesWithOptions(DescribeFabricOrganizationChaincodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationChaincodes", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationChaincodesResponse());
    }

    public DescribeFabricOrganizationChaincodesResponse describeFabricOrganizationChaincodes(DescribeFabricOrganizationChaincodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationChaincodesWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletableWithOptions(DescribeFabricOrganizationDeletableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationDeletable", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationDeletableResponse());
    }

    public DescribeFabricOrganizationDeletableResponse describeFabricOrganizationDeletable(DescribeFabricOrganizationDeletableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationDeletableWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembersWithOptions(DescribeFabricOrganizationMembersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationMembers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationMembersResponse());
    }

    public DescribeFabricOrganizationMembersResponse describeFabricOrganizationMembers(DescribeFabricOrganizationMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationMembersWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeersWithOptions(DescribeFabricOrganizationPeersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationPeers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationPeersResponse());
    }

    public DescribeFabricOrganizationPeersResponse describeFabricOrganizationPeers(DescribeFabricOrganizationPeersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationPeersWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationsResponse describeFabricOrganizationsWithOptions(DescribeFabricOrganizationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizations", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationsResponse());
    }

    public DescribeFabricOrganizationsResponse describeFabricOrganizations(DescribeFabricOrganizationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationsWithOptions(request, runtime);
    }

    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationSpecs", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationSpecsResponse());
    }

    public DescribeFabricOrganizationSpecsResponse describeFabricOrganizationSpecs() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationSpecsWithOptions(runtime);
    }

    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsersWithOptions(DescribeFabricOrganizationUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricOrganizationUsers", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricOrganizationUsersResponse());
    }

    public DescribeFabricOrganizationUsersResponse describeFabricOrganizationUsers(DescribeFabricOrganizationUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricOrganizationUsersWithOptions(request, runtime);
    }

    public DescribeFabricPeerLogsResponse describeFabricPeerLogsWithOptions(DescribeFabricPeerLogsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFabricPeerLogs", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFabricPeerLogsResponse());
    }

    public DescribeFabricPeerLogsResponse describeFabricPeerLogs(DescribeFabricPeerLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFabricPeerLogsWithOptions(request, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRegions", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    public DescribeRootDomainResponse describeRootDomainWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeRootDomain", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRootDomainResponse());
    }

    public DescribeRootDomainResponse describeRootDomain() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRootDomainWithOptions(runtime);
    }

    public DescribeTasksResponse describeTasksWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("DescribeTasks", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTasksResponse());
    }

    public DescribeTasksResponse describeTasks() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTasksWithOptions(runtime);
    }

    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDKWithOptions(DownloadFabricOrganizationSDKRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadFabricOrganizationSDK", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadFabricOrganizationSDKResponse());
    }

    public DownloadFabricOrganizationSDKResponse downloadFabricOrganizationSDK(DownloadFabricOrganizationSDKRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadFabricOrganizationSDKWithOptions(request, runtime);
    }

    public FreezeAntChainAccountResponse freezeAntChainAccountWithOptions(FreezeAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FreezeAntChainAccount", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new FreezeAntChainAccountResponse());
    }

    public FreezeAntChainAccountResponse freezeAntChainAccount(FreezeAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.freezeAntChainAccountWithOptions(request, runtime);
    }

    public InstallFabricChaincodeResponse installFabricChaincodeWithOptions(InstallFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstallFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new InstallFabricChaincodeResponse());
    }

    public InstallFabricChaincodeResponse installFabricChaincode(InstallFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.installFabricChaincodeWithOptions(request, runtime);
    }

    public InstantiateFabricChaincodeResponse instantiateFabricChaincodeWithOptions(InstantiateFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InstantiateFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new InstantiateFabricChaincodeResponse());
    }

    public InstantiateFabricChaincodeResponse instantiateFabricChaincode(InstantiateFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.instantiateFabricChaincodeWithOptions(request, runtime);
    }

    public JoinFabricChannelResponse joinFabricChannelWithOptions(JoinFabricChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinFabricChannel", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new JoinFabricChannelResponse());
    }

    public JoinFabricChannelResponse joinFabricChannel(JoinFabricChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinFabricChannelWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTagResources", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public ResetAntChainCertificateResponse resetAntChainCertificateWithOptions(ResetAntChainCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAntChainCertificate", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAntChainCertificateResponse());
    }

    public ResetAntChainCertificateResponse resetAntChainCertificate(ResetAntChainCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAntChainCertificateWithOptions(request, runtime);
    }

    public ResetAntChainUserCertificateResponse resetAntChainUserCertificateWithOptions(ResetAntChainUserCertificateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetAntChainUserCertificate", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ResetAntChainUserCertificateResponse());
    }

    public ResetAntChainUserCertificateResponse resetAntChainUserCertificate(ResetAntChainUserCertificateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetAntChainUserCertificateWithOptions(request, runtime);
    }

    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPasswordWithOptions(ResetFabricOrganizationUserPasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ResetFabricOrganizationUserPassword", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new ResetFabricOrganizationUserPasswordResponse());
    }

    public ResetFabricOrganizationUserPasswordResponse resetFabricOrganizationUserPassword(ResetFabricOrganizationUserPasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetFabricOrganizationUserPasswordWithOptions(request, runtime);
    }

    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincodeWithOptions(SynchronizeFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SynchronizeFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new SynchronizeFabricChaincodeResponse());
    }

    public SynchronizeFabricChaincodeResponse synchronizeFabricChaincode(SynchronizeFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.synchronizeFabricChaincodeWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TagResources", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UnfreezeAntChainAccountResponse unfreezeAntChainAccountWithOptions(UnfreezeAntChainAccountRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UnfreezeAntChainAccount", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UnfreezeAntChainAccountResponse());
    }

    public UnfreezeAntChainAccountResponse unfreezeAntChainAccount(UnfreezeAntChainAccountRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unfreezeAntChainAccountWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UntagResources", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public UpdateAntChainResponse updateAntChainWithOptions(UpdateAntChainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChain", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainResponse());
    }

    public UpdateAntChainResponse updateAntChain(UpdateAntChainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainWithOptions(request, runtime);
    }

    public UpdateAntChainConsortiumResponse updateAntChainConsortiumWithOptions(UpdateAntChainConsortiumRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChainConsortium", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainConsortiumResponse());
    }

    public UpdateAntChainConsortiumResponse updateAntChainConsortium(UpdateAntChainConsortiumRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainConsortiumWithOptions(request, runtime);
    }

    public UpdateAntChainContractContentResponse updateAntChainContractContentWithOptions(UpdateAntChainContractContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChainContractContent", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainContractContentResponse());
    }

    public UpdateAntChainContractContentResponse updateAntChainContractContent(UpdateAntChainContractContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainContractContentWithOptions(request, runtime);
    }

    public UpdateAntChainContractProjectResponse updateAntChainContractProjectWithOptions(UpdateAntChainContractProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChainContractProject", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainContractProjectResponse());
    }

    public UpdateAntChainContractProjectResponse updateAntChainContractProject(UpdateAntChainContractProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainContractProjectWithOptions(request, runtime);
    }

    public UpdateAntChainMemberResponse updateAntChainMemberWithOptions(UpdateAntChainMemberRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChainMember", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainMemberResponse());
    }

    public UpdateAntChainMemberResponse updateAntChainMember(UpdateAntChainMemberRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainMemberWithOptions(request, runtime);
    }

    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorizationWithOptions(UpdateAntChainQRCodeAuthorizationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAntChainQRCodeAuthorization", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAntChainQRCodeAuthorizationResponse());
    }

    public UpdateAntChainQRCodeAuthorizationResponse updateAntChainQRCodeAuthorization(UpdateAntChainQRCodeAuthorizationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAntChainQRCodeAuthorizationWithOptions(request, runtime);
    }

    public UpgradeFabricChaincodeResponse upgradeFabricChaincodeWithOptions(UpgradeFabricChaincodeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpgradeFabricChaincode", "2018-12-21", "HTTPS", "POST", "AK", "json", req, runtime), new UpgradeFabricChaincodeResponse());
    }

    public UpgradeFabricChaincodeResponse upgradeFabricChaincode(UpgradeFabricChaincodeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.upgradeFabricChaincodeWithOptions(request, runtime);
    }
}
