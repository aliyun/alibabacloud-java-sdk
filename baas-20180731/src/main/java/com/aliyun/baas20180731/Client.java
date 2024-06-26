// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731;

import com.aliyun.tea.*;
import com.aliyun.baas20180731.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
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
     * @param request AcceptEthereumInvitationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptEthereumInvitationResponse
     */
    public AcceptEthereumInvitationResponse acceptEthereumInvitationWithOptions(AcceptEthereumInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AcceptEthereumInvitation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptEthereumInvitationResponse());
    }

    /**
     * @param request AcceptEthereumInvitationRequest
     * @return AcceptEthereumInvitationResponse
     */
    public AcceptEthereumInvitationResponse acceptEthereumInvitation(AcceptEthereumInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptEthereumInvitationWithOptions(request, runtime);
    }

    /**
     * @param request AcceptInvitationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AcceptInvitationResponse
     */
    public AcceptInvitationResponse acceptInvitationWithOptions(AcceptInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AcceptInvitation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AcceptInvitationResponse());
    }

    /**
     * @param request AcceptInvitationRequest
     * @return AcceptInvitationResponse
     */
    public AcceptInvitationResponse acceptInvitation(AcceptInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.acceptInvitationWithOptions(request, runtime);
    }

    /**
     * @param request AddAntChainSubnetMemberCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAntChainSubnetMemberCheckResponse
     */
    public AddAntChainSubnetMemberCheckResponse addAntChainSubnetMemberCheckWithOptions(AddAntChainSubnetMemberCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AddAntChainSubnetMemberCheck"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAntChainSubnetMemberCheckResponse());
    }

    /**
     * @param request AddAntChainSubnetMemberCheckRequest
     * @return AddAntChainSubnetMemberCheckResponse
     */
    public AddAntChainSubnetMemberCheckResponse addAntChainSubnetMemberCheck(AddAntChainSubnetMemberCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAntChainSubnetMemberCheckWithOptions(request, runtime);
    }

    /**
     * @param request AddAntChainSubnetNodeCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddAntChainSubnetNodeCheckResponse
     */
    public AddAntChainSubnetNodeCheckResponse addAntChainSubnetNodeCheckWithOptions(AddAntChainSubnetNodeCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "AddAntChainSubnetNodeCheck"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddAntChainSubnetNodeCheckResponse());
    }

    /**
     * @param request AddAntChainSubnetNodeCheckRequest
     * @return AddAntChainSubnetNodeCheckResponse
     */
    public AddAntChainSubnetNodeCheckResponse addAntChainSubnetNodeCheck(AddAntChainSubnetNodeCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addAntChainSubnetNodeCheckWithOptions(request, runtime);
    }

    /**
     * @param request AddEthereumNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddEthereumNodeResponse
     */
    public AddEthereumNodeResponse addEthereumNodeWithOptions(AddEthereumNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalNode)) {
            body.put("ExternalNode", request.externalNode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddEthereumNode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddEthereumNodeResponse());
    }

    /**
     * @param request AddEthereumNodeRequest
     * @return AddEthereumNodeResponse
     */
    public AddEthereumNodeResponse addEthereumNode(AddEthereumNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addEthereumNodeWithOptions(request, runtime);
    }

    /**
     * @param request AddFabricExternalOrganizationToChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFabricExternalOrganizationToChannelResponse
     */
    public AddFabricExternalOrganizationToChannelResponse addFabricExternalOrganizationToChannelWithOptions(AddFabricExternalOrganizationToChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.joinRequest)) {
            body.put("JoinRequest", request.joinRequest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFabricExternalOrganizationToChannel"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFabricExternalOrganizationToChannelResponse());
    }

    /**
     * @param request AddFabricExternalOrganizationToChannelRequest
     * @return AddFabricExternalOrganizationToChannelResponse
     */
    public AddFabricExternalOrganizationToChannelResponse addFabricExternalOrganizationToChannel(AddFabricExternalOrganizationToChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFabricExternalOrganizationToChannelWithOptions(request, runtime);
    }

    /**
     * @param request AddFabricOrganizationToExternalChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFabricOrganizationToExternalChannelResponse
     */
    public AddFabricOrganizationToExternalChannelResponse addFabricOrganizationToExternalChannelWithOptions(AddFabricOrganizationToExternalChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.joinResponse)) {
            body.put("JoinResponse", request.joinResponse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFabricOrganizationToExternalChannel"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFabricOrganizationToExternalChannelResponse());
    }

    /**
     * @param request AddFabricOrganizationToExternalChannelRequest
     * @return AddFabricOrganizationToExternalChannelResponse
     */
    public AddFabricOrganizationToExternalChannelResponse addFabricOrganizationToExternalChannel(AddFabricOrganizationToExternalChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFabricOrganizationToExternalChannelWithOptions(request, runtime);
    }

    /**
     * @param request ApplyAntChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAntChainResponse
     */
    public ApplyAntChainResponse applyAntChainWithOptions(ApplyAntChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadReq)) {
            body.put("UploadReq", request.uploadReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAntChain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAntChainResponse());
    }

    /**
     * @param request ApplyAntChainRequest
     * @return ApplyAntChainResponse
     */
    public ApplyAntChainResponse applyAntChain(ApplyAntChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAntChainWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request ApplyAntChainWithKeyAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAntChainWithKeyAutoCreationResponse
     */
    public ApplyAntChainWithKeyAutoCreationResponse applyAntChainWithKeyAutoCreationWithOptions(ApplyAntChainWithKeyAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ApplyAntChainWithKeyAutoCreation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAntChainWithKeyAutoCreationResponse());
    }

    /**
     * @param request ApplyAntChainWithKeyAutoCreationRequest
     * @return ApplyAntChainWithKeyAutoCreationResponse
     */
    public ApplyAntChainWithKeyAutoCreationResponse applyAntChainWithKeyAutoCreation(ApplyAntChainWithKeyAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAntChainWithKeyAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request ApplyBlockchainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyBlockchainResponse
     */
    public ApplyBlockchainResponse applyBlockchainWithOptions(ApplyBlockchainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.blockchain)) {
            body.put("Blockchain", request.blockchain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadReq)) {
            body.put("UploadReq", request.uploadReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyBlockchain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyBlockchainResponse());
    }

    /**
     * @param request ApplyBlockchainRequest
     * @return ApplyBlockchainResponse
     */
    public ApplyBlockchainResponse applyBlockchain(ApplyBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyBlockchainWithOptions(request, runtime);
    }

    /**
     * @param request ApplyBlockchainWithKeyAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyBlockchainWithKeyAutoCreationResponse
     */
    public ApplyBlockchainWithKeyAutoCreationResponse applyBlockchainWithKeyAutoCreationWithOptions(ApplyBlockchainWithKeyAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            body.put("CommonName", request.commonName);
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
            new TeaPair("action", "ApplyBlockchainWithKeyAutoCreation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyBlockchainWithKeyAutoCreationResponse());
    }

    /**
     * @param request ApplyBlockchainWithKeyAutoCreationRequest
     * @return ApplyBlockchainWithKeyAutoCreationResponse
     */
    public ApplyBlockchainWithKeyAutoCreationResponse applyBlockchainWithKeyAutoCreation(ApplyBlockchainWithKeyAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyBlockchainWithKeyAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request ApplyPublicAntChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyPublicAntChainResponse
     */
    public ApplyPublicAntChainResponse applyPublicAntChainWithOptions(ApplyPublicAntChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadReq)) {
            body.put("UploadReq", request.uploadReq);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyPublicAntChain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyPublicAntChainResponse());
    }

    /**
     * @param request ApplyPublicAntChainRequest
     * @return ApplyPublicAntChainResponse
     */
    public ApplyPublicAntChainResponse applyPublicAntChain(ApplyPublicAntChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyPublicAntChainWithOptions(request, runtime);
    }

    /**
     * @param request ApplyPublicAntChainWithKeyAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyPublicAntChainWithKeyAutoCreationResponse
     */
    public ApplyPublicAntChainWithKeyAutoCreationResponse applyPublicAntChainWithKeyAutoCreationWithOptions(ApplyPublicAntChainWithKeyAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commonName)) {
            body.put("CommonName", request.commonName);
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
            new TeaPair("action", "ApplyPublicAntChainWithKeyAutoCreation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyPublicAntChainWithKeyAutoCreationResponse());
    }

    /**
     * @param request ApplyPublicAntChainWithKeyAutoCreationRequest
     * @return ApplyPublicAntChainWithKeyAutoCreationResponse
     */
    public ApplyPublicAntChainWithKeyAutoCreationResponse applyPublicAntChainWithKeyAutoCreation(ApplyPublicAntChainWithKeyAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyPublicAntChainWithKeyAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request ApproveEthereumInviteeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveEthereumInviteeResponse
     */
    public ApproveEthereumInviteeResponse approveEthereumInviteeWithOptions(ApproveEthereumInviteeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invitee)) {
            body.put("Invitee", request.invitee);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveEthereumInvitee"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveEthereumInviteeResponse());
    }

    /**
     * @param request ApproveEthereumInviteeRequest
     * @return ApproveEthereumInviteeResponse
     */
    public ApproveEthereumInviteeResponse approveEthereumInvitee(ApproveEthereumInviteeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveEthereumInviteeWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request BindFabricManagementChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindFabricManagementChaincodeResponse
     */
    public BindFabricManagementChaincodeResponse bindFabricManagementChaincodeWithOptions(BindFabricManagementChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindFabricManagementChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindFabricManagementChaincodeResponse());
    }

    /**
     * @param request BindFabricManagementChaincodeRequest
     * @return BindFabricManagementChaincodeResponse
     */
    public BindFabricManagementChaincodeResponse bindFabricManagementChaincode(BindFabricManagementChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindFabricManagementChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request CheckConsortiumDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckConsortiumDomainResponse
     */
    public CheckConsortiumDomainResponse checkConsortiumDomainWithOptions(CheckConsortiumDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainCode)) {
            body.put("DomainCode", request.domainCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckConsortiumDomain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckConsortiumDomainResponse());
    }

    /**
     * @param request CheckConsortiumDomainRequest
     * @return CheckConsortiumDomainResponse
     */
    public CheckConsortiumDomainResponse checkConsortiumDomain(CheckConsortiumDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkConsortiumDomainWithOptions(request, runtime);
    }

    /**
     * @param request CheckOrganizationDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckOrganizationDomainResponse
     */
    public CheckOrganizationDomainResponse checkOrganizationDomainWithOptions(CheckOrganizationDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CheckOrganizationDomain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckOrganizationDomainResponse());
    }

    /**
     * @param request CheckOrganizationDomainRequest
     * @return CheckOrganizationDomainResponse
     */
    public CheckOrganizationDomainResponse checkOrganizationDomain(CheckOrganizationDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkOrganizationDomainWithOptions(request, runtime);
    }

    /**
     * @param request ConfirmConsortiumMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfirmConsortiumMemberResponse
     */
    public ConfirmConsortiumMemberResponse confirmConsortiumMemberWithOptions(ConfirmConsortiumMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ConfirmConsortiumMember"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfirmConsortiumMemberResponse());
    }

    /**
     * @param request ConfirmConsortiumMemberRequest
     * @return ConfirmConsortiumMemberResponse
     */
    public ConfirmConsortiumMemberResponse confirmConsortiumMember(ConfirmConsortiumMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.confirmConsortiumMemberWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request CreateAccessTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessTokenResponse
     */
    public CreateAccessTokenResponse createAccessTokenWithOptions(CreateAccessTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenLifetime)) {
            body.put("AccessTokenLifetime", request.accessTokenLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshTokenLifetime)) {
            body.put("RefreshTokenLifetime", request.refreshTokenLifetime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessToken"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessTokenResponse());
    }

    /**
     * @param request CreateAccessTokenRequest
     * @return CreateAccessTokenResponse
     */
    public CreateAccessTokenResponse createAccessToken(CreateAccessTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessTokenWithOptions(request, runtime);
    }

    /**
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreateAccountWithKeyPairAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountWithKeyPairAutoCreationResponse
     */
    public CreateAccountWithKeyPairAutoCreationResponse createAccountWithKeyPairAutoCreationWithOptions(CreateAccountWithKeyPairAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccountWithKeyPairAutoCreation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountWithKeyPairAutoCreationResponse());
    }

    /**
     * @param request CreateAccountWithKeyPairAutoCreationRequest
     * @return CreateAccountWithKeyPairAutoCreationResponse
     */
    public CreateAccountWithKeyPairAutoCreationResponse createAccountWithKeyPairAutoCreation(CreateAccountWithKeyPairAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithKeyPairAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request CreateAntChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAntChainResponse
     */
    public CreateAntChainResponse createAntChainWithOptions(CreateAntChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainName)) {
            body.put("AntChainName", request.antChainName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockchainRegionId)) {
            body.put("BlockchainRegionId", request.blockchainRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherSuit)) {
            body.put("CipherSuit", request.cipherSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveTime)) {
            body.put("LiveTime", request.liveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merkleTreeSuit)) {
            body.put("MerkleTreeSuit", request.merkleTreeSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeNum)) {
            body.put("NodeNum", request.nodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSize)) {
            body.put("ResourceSize", request.resourceSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsAlgo)) {
            body.put("TlsAlgo", request.tlsAlgo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAntChain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAntChainResponse());
    }

    /**
     * @param request CreateAntChainRequest
     * @return CreateAntChainResponse
     */
    public CreateAntChainResponse createAntChain(CreateAntChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAntChainWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request CreateBlockchainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBlockchainResponse
     */
    public CreateBlockchainResponse createBlockchainWithOptions(CreateBlockchainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockchainRegionId)) {
            body.put("BlockchainRegionId", request.blockchainRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockchainType)) {
            body.put("BlockchainType", request.blockchainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherSuit)) {
            body.put("CipherSuit", request.cipherSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveTime)) {
            body.put("LiveTime", request.liveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineNum)) {
            body.put("MachineNum", request.machineNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merkleTreeSuit)) {
            body.put("MerkleTreeSuit", request.merkleTreeSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsAlgo)) {
            body.put("TlsAlgo", request.tlsAlgo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBlockchain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBlockchainResponse());
    }

    /**
     * @param request CreateBlockchainRequest
     * @return CreateBlockchainResponse
     */
    public CreateBlockchainResponse createBlockchain(CreateBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBlockchainWithOptions(request, runtime);
    }

    /**
     * @param request CreateBlockchainApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBlockchainApplicationResponse
     */
    public CreateBlockchainApplicationResponse createBlockchainApplicationWithOptions(CreateBlockchainApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockchainRegionId)) {
            body.put("BlockchainRegionId", request.blockchainRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blockchainType)) {
            body.put("BlockchainType", request.blockchainType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cipherSuit)) {
            body.put("CipherSuit", request.cipherSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveTime)) {
            body.put("LiveTime", request.liveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineNum)) {
            body.put("MachineNum", request.machineNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.merkleTreeSuit)) {
            body.put("MerkleTreeSuit", request.merkleTreeSuit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tlsAlgo)) {
            body.put("TlsAlgo", request.tlsAlgo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBlockchainApplication"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBlockchainApplicationResponse());
    }

    /**
     * @param request CreateBlockchainApplicationRequest
     * @return CreateBlockchainApplicationResponse
     */
    public CreateBlockchainApplicationResponse createBlockchainApplication(CreateBlockchainApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBlockchainApplicationWithOptions(request, runtime);
    }

    /**
     * @param request CreateBlockchainApplyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBlockchainApplyResponse
     */
    public CreateBlockchainApplyResponse createBlockchainApplyWithOptions(CreateBlockchainApplyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.liveTime)) {
            body.put("LiveTime", request.liveTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.machineNum)) {
            body.put("MachineNum", request.machineNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBlockchainApply"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBlockchainApplyResponse());
    }

    /**
     * @param request CreateBlockchainApplyRequest
     * @return CreateBlockchainApplyResponse
     */
    public CreateBlockchainApplyResponse createBlockchainApply(CreateBlockchainApplyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBlockchainApplyWithOptions(request, runtime);
    }

    /**
     * @param request CreateChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChaincodeResponse
     */
    public CreateChaincodeResponse createChaincodeWithOptions(CreateChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChaincodeResponse());
    }

    /**
     * @param request CreateChaincodeRequest
     * @return CreateChaincodeResponse
     */
    public CreateChaincodeResponse createChaincode(CreateChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request CreateChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChannelResponse
     */
    public CreateChannelResponse createChannelWithOptions(CreateChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateChannel"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChannelResponse());
    }

    /**
     * @param request CreateChannelRequest
     * @return CreateChannelResponse
     */
    public CreateChannelResponse createChannel(CreateChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChannelWithOptions(request, runtime);
    }

    /**
     * @param request CreateChannelMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateChannelMemberResponse
     */
    public CreateChannelMemberResponse createChannelMemberWithOptions(CreateChannelMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateChannelMember"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateChannelMemberResponse());
    }

    /**
     * @param request CreateChannelMemberRequest
     * @return CreateChannelMemberResponse
     */
    public CreateChannelMemberResponse createChannelMember(CreateChannelMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createChannelMemberWithOptions(request, runtime);
    }

    /**
     * @param request CreateCloudIntegrationServiceTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudIntegrationServiceTokenResponse
     */
    public CreateCloudIntegrationServiceTokenResponse createCloudIntegrationServiceTokenWithOptions(CreateCloudIntegrationServiceTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            query.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudIntegrationServiceToken"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudIntegrationServiceTokenResponse());
    }

    /**
     * @param request CreateCloudIntegrationServiceTokenRequest
     * @return CreateCloudIntegrationServiceTokenResponse
     */
    public CreateCloudIntegrationServiceTokenResponse createCloudIntegrationServiceToken(CreateCloudIntegrationServiceTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudIntegrationServiceTokenWithOptions(request, runtime);
    }

    /**
     * @param request CreateCloudServiceIntegrationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudServiceIntegrationResponse
     */
    public CreateCloudServiceIntegrationResponse createCloudServiceIntegrationWithOptions(CreateCloudServiceIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudServiceIntegration"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudServiceIntegrationResponse());
    }

    /**
     * @param request CreateCloudServiceIntegrationRequest
     * @return CreateCloudServiceIntegrationResponse
     */
    public CreateCloudServiceIntegrationResponse createCloudServiceIntegration(CreateCloudServiceIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudServiceIntegrationWithOptions(request, runtime);
    }

    /**
     * @param request CreateCloudServiceSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudServiceSessionResponse
     */
    public CreateCloudServiceSessionResponse createCloudServiceSessionWithOptions(CreateCloudServiceSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCloudServiceSession"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudServiceSessionResponse());
    }

    /**
     * @param request CreateCloudServiceSessionRequest
     * @return CreateCloudServiceSessionResponse
     */
    public CreateCloudServiceSessionResponse createCloudServiceSession(CreateCloudServiceSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudServiceSessionWithOptions(request, runtime);
    }

    /**
     * @param request CreateConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsortiumResponse
     */
    public CreateConsortiumResponse createConsortiumWithOptions(CreateConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelPolicy)) {
            body.put("ChannelPolicy", request.channelPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            body.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorVersion)) {
            body.put("MajorVersion", request.majorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
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

        if (!com.aliyun.teautil.Common.isUnset(request.peersCount)) {
            body.put("PeersCount", request.peersCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
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
            new TeaPair("action", "CreateConsortium"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsortiumResponse());
    }

    /**
     * @param request CreateConsortiumRequest
     * @return CreateConsortiumResponse
     */
    public CreateConsortiumResponse createConsortium(CreateConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request CreateConsortiumMemberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConsortiumMemberResponse
     */
    public CreateConsortiumMemberResponse createConsortiumMemberWithOptions(CreateConsortiumMemberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateConsortiumMember"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConsortiumMemberResponse());
    }

    /**
     * @param request CreateConsortiumMemberRequest
     * @return CreateConsortiumMemberResponse
     */
    public CreateConsortiumMemberResponse createConsortiumMember(CreateConsortiumMemberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConsortiumMemberWithOptions(request, runtime);
    }

    /**
     * @param request CreateEcosphereRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEcosphereResponse
     */
    public CreateEcosphereResponse createEcosphereWithOptions(CreateEcosphereRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelPolicy)) {
            body.put("ChannelPolicy", request.channelPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consortiumName)) {
            body.put("ConsortiumName", request.consortiumName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            body.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorVersion)) {
            body.put("MajorVersion", request.majorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ordererDomain)) {
            body.put("OrdererDomain", request.ordererDomain);
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

        if (!com.aliyun.teautil.Common.isUnset(request.peersCount)) {
            body.put("PeersCount", request.peersCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            body.put("PricingCycle", request.pricingCycle);
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
            new TeaPair("action", "CreateEcosphere"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEcosphereResponse());
    }

    /**
     * @param request CreateEcosphereRequest
     * @return CreateEcosphereResponse
     */
    public CreateEcosphereResponse createEcosphere(CreateEcosphereRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEcosphereWithOptions(request, runtime);
    }

    /**
     * @param request CreateEthereumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEthereumResponse
     */
    public CreateEthereumResponse createEthereumWithOptions(CreateEthereumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consensus)) {
            body.put("Consensus", request.consensus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.difficulty)) {
            body.put("Difficulty", request.difficulty);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gas)) {
            body.put("Gas", request.gas);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            body.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.node)) {
            body.put("Node", request.node);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            body.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEthereum"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEthereumResponse());
    }

    /**
     * @param request CreateEthereumRequest
     * @return CreateEthereumResponse
     */
    public CreateEthereumResponse createEthereum(CreateEthereumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEthereumWithOptions(request, runtime);
    }

    /**
     * @param request CreateEthereumInvitationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEthereumInvitationResponse
     */
    public CreateEthereumInvitationResponse createEthereumInvitationWithOptions(CreateEthereumInvitationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEthereumInvitation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEthereumInvitationResponse());
    }

    /**
     * @param request CreateEthereumInvitationRequest
     * @return CreateEthereumInvitationResponse
     */
    public CreateEthereumInvitationResponse createEthereumInvitation(CreateEthereumInvitationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEthereumInvitationWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("action", "CreateFabricChaincodePackage"),
            new TeaPair("version", "2018-07-31"),
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
     * @param request CreateFabricChaincodePackageRequest
     * @return CreateFabricChaincodePackageResponse
     */
    public CreateFabricChaincodePackageResponse createFabricChaincodePackage(CreateFabricChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFabricChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request CreateOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrganizationResponse
     */
    public CreateOrganizationResponse createOrganizationWithOptions(CreateOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            query.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.peersCount)) {
            query.put("PeersCount", request.peersCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            query.put("SpecName", request.specName);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.majorVersion)) {
            body.put("MajorVersion", request.majorVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrganization"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrganizationResponse());
    }

    /**
     * @param request CreateOrganizationRequest
     * @return CreateOrganizationResponse
     */
    public CreateOrganizationResponse createOrganization(CreateOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationWithOptions(request, runtime);
    }

    /**
     * @param request CreateOrganizationUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrganizationUserResponse
     */
    public CreateOrganizationUserResponse createOrganizationUserWithOptions(CreateOrganizationUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateOrganizationUser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrganizationUserResponse());
    }

    /**
     * @param request CreateOrganizationUserRequest
     * @return CreateOrganizationUserResponse
     */
    public CreateOrganizationUserResponse createOrganizationUser(CreateOrganizationUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationUserWithOptions(request, runtime);
    }

    /**
     * @param request CreateOwnAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOwnAccountResponse
     */
    public CreateOwnAccountResponse createOwnAccountWithOptions(CreateOwnAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identity)) {
            body.put("Identity", request.identity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            body.put("PublicKey", request.publicKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryKey)) {
            body.put("RecoveryKey", request.recoveryKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOwnAccount"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOwnAccountResponse());
    }

    /**
     * @param request CreateOwnAccountRequest
     * @return CreateOwnAccountResponse
     */
    public CreateOwnAccountResponse createOwnAccount(CreateOwnAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOwnAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreatePublicAccountWithKeyPairAutoCreationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicAccountWithKeyPairAutoCreationResponse
     */
    public CreatePublicAccountWithKeyPairAutoCreationResponse createPublicAccountWithKeyPairAutoCreationWithOptions(CreatePublicAccountWithKeyPairAutoCreationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
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
            new TeaPair("action", "CreatePublicAccountWithKeyPairAutoCreation"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicAccountWithKeyPairAutoCreationResponse());
    }

    /**
     * @param request CreatePublicAccountWithKeyPairAutoCreationRequest
     * @return CreatePublicAccountWithKeyPairAutoCreationResponse
     */
    public CreatePublicAccountWithKeyPairAutoCreationResponse createPublicAccountWithKeyPairAutoCreation(CreatePublicAccountWithKeyPairAutoCreationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublicAccountWithKeyPairAutoCreationWithOptions(request, runtime);
    }

    /**
     * @param request CreatePublicAntChainAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublicAntChainAccountResponse
     */
    public CreatePublicAntChainAccountResponse createPublicAntChainAccountWithOptions(CreatePublicAntChainAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublicAntChainAccount"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublicAntChainAccountResponse());
    }

    /**
     * @param request CreatePublicAntChainAccountRequest
     * @return CreatePublicAntChainAccountResponse
     */
    public CreatePublicAntChainAccountResponse createPublicAntChainAccount(CreatePublicAntChainAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublicAntChainAccountWithOptions(request, runtime);
    }

    /**
     * @param request CreateSmartContractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSmartContractJobResponse
     */
    public CreateSmartContractJobResponse createSmartContractJobWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSmartContractJob"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSmartContractJobResponse());
    }

    /**
     * @return CreateSmartContractJobResponse
     */
    public CreateSmartContractJobResponse createSmartContractJob() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSmartContractJobWithOptions(runtime);
    }

    /**
     * @param request CreateTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTriggerWithOptions(CreateTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTrigger"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTriggerResponse());
    }

    /**
     * @param request CreateTriggerRequest
     * @return CreateTriggerResponse
     */
    public CreateTriggerResponse createTrigger(CreateTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTriggerWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DeleteChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteChaincodeResponse
     */
    public DeleteChaincodeResponse deleteChaincodeWithOptions(DeleteChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteChaincodeResponse());
    }

    /**
     * @param request DeleteChaincodeRequest
     * @return DeleteChaincodeResponse
     */
    public DeleteChaincodeResponse deleteChaincode(DeleteChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request DeleteGovernanceTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGovernanceTaskResponse
     */
    public DeleteGovernanceTaskResponse deleteGovernanceTaskWithOptions(DeleteGovernanceTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGovernanceTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGovernanceTaskResponse());
    }

    /**
     * @param request DeleteGovernanceTaskRequest
     * @return DeleteGovernanceTaskResponse
     */
    public DeleteGovernanceTaskResponse deleteGovernanceTask(DeleteGovernanceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGovernanceTaskWithOptions(request, runtime);
    }

    /**
     * @param request DeleteTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTriggerWithOptions(DeleteTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTrigger"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTriggerResponse());
    }

    /**
     * @param request DeleteTriggerRequest
     * @return DeleteTriggerResponse
     */
    public DeleteTriggerResponse deleteTrigger(DeleteTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTriggerWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainAccountsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainAccountsNewResponse
     */
    public DescribeAntChainAccountsNewResponse describeAntChainAccountsNewWithOptions(DescribeAntChainAccountsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainAccountsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainAccountsNewResponse());
    }

    /**
     * @param request DescribeAntChainAccountsNewRequest
     * @return DescribeAntChainAccountsNewResponse
     */
    public DescribeAntChainAccountsNewResponse describeAntChainAccountsNew(DescribeAntChainAccountsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainAccountsNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainApplicationsResponse
     */
    public DescribeAntChainApplicationsResponse describeAntChainApplicationsWithOptions(DescribeAntChainApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
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
            new TeaPair("action", "DescribeAntChainApplications"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainApplicationsResponse());
    }

    /**
     * @param request DescribeAntChainApplicationsRequest
     * @return DescribeAntChainApplicationsResponse
     */
    public DescribeAntChainApplicationsResponse describeAntChainApplications(DescribeAntChainApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainApplicationsWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainBlockNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainBlockNewResponse
     */
    public DescribeAntChainBlockNewResponse describeAntChainBlockNewWithOptions(DescribeAntChainBlockNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainBlockNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainBlockNewResponse());
    }

    /**
     * @param request DescribeAntChainBlockNewRequest
     * @return DescribeAntChainBlockNewResponse
     */
    public DescribeAntChainBlockNewResponse describeAntChainBlockNew(DescribeAntChainBlockNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainBlockNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainCertificateApplicationsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainCertificateApplicationsNewResponse
     */
    public DescribeAntChainCertificateApplicationsNewResponse describeAntChainCertificateApplicationsNewWithOptions(DescribeAntChainCertificateApplicationsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainCertificateApplicationsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainCertificateApplicationsNewResponse());
    }

    /**
     * @param request DescribeAntChainCertificateApplicationsNewRequest
     * @return DescribeAntChainCertificateApplicationsNewResponse
     */
    public DescribeAntChainCertificateApplicationsNewResponse describeAntChainCertificateApplicationsNew(DescribeAntChainCertificateApplicationsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainCertificateApplicationsNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainConfigOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainConfigOptionsResponse
     */
    public DescribeAntChainConfigOptionsResponse describeAntChainConfigOptionsWithOptions(DescribeAntChainConfigOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainConfigOptions"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainConfigOptionsResponse());
    }

    /**
     * @param request DescribeAntChainConfigOptionsRequest
     * @return DescribeAntChainConfigOptionsResponse
     */
    public DescribeAntChainConfigOptionsResponse describeAntChainConfigOptions(DescribeAntChainConfigOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainConfigOptionsWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainConsortiumsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainConsortiumsNewResponse
     */
    public DescribeAntChainConsortiumsNewResponse describeAntChainConsortiumsNewWithOptions(DescribeAntChainConsortiumsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainConsortiumsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainConsortiumsNewResponse());
    }

    /**
     * @param request DescribeAntChainConsortiumsNewRequest
     * @return DescribeAntChainConsortiumsNewResponse
     */
    public DescribeAntChainConsortiumsNewResponse describeAntChainConsortiumsNew(DescribeAntChainConsortiumsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainConsortiumsNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainContractProjectContentTreeNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectContentTreeNewResponse
     */
    public DescribeAntChainContractProjectContentTreeNewResponse describeAntChainContractProjectContentTreeNewWithOptions(DescribeAntChainContractProjectContentTreeNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainContractProjectContentTreeNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectContentTreeNewResponse());
    }

    /**
     * @param request DescribeAntChainContractProjectContentTreeNewRequest
     * @return DescribeAntChainContractProjectContentTreeNewResponse
     */
    public DescribeAntChainContractProjectContentTreeNewResponse describeAntChainContractProjectContentTreeNew(DescribeAntChainContractProjectContentTreeNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectContentTreeNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainContractProjectsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainContractProjectsNewResponse
     */
    public DescribeAntChainContractProjectsNewResponse describeAntChainContractProjectsNewWithOptions(DescribeAntChainContractProjectsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainContractProjectsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainContractProjectsNewResponse());
    }

    /**
     * @param request DescribeAntChainContractProjectsNewRequest
     * @return DescribeAntChainContractProjectsNewResponse
     */
    public DescribeAntChainContractProjectsNewResponse describeAntChainContractProjectsNew(DescribeAntChainContractProjectsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainContractProjectsNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainDownloadPathsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainDownloadPathsNewResponse
     */
    public DescribeAntChainDownloadPathsNewResponse describeAntChainDownloadPathsNewWithOptions(DescribeAntChainDownloadPathsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainDownloadPathsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainDownloadPathsNewResponse());
    }

    /**
     * @param request DescribeAntChainDownloadPathsNewRequest
     * @return DescribeAntChainDownloadPathsNewResponse
     */
    public DescribeAntChainDownloadPathsNewResponse describeAntChainDownloadPathsNew(DescribeAntChainDownloadPathsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainDownloadPathsNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainInformationNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainInformationNewResponse
     */
    public DescribeAntChainInformationNewResponse describeAntChainInformationNewWithOptions(DescribeAntChainInformationNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainInformationNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainInformationNewResponse());
    }

    /**
     * @param request DescribeAntChainInformationNewRequest
     * @return DescribeAntChainInformationNewResponse
     */
    public DescribeAntChainInformationNewResponse describeAntChainInformationNew(DescribeAntChainInformationNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainInformationNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainLatestBlocksNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestBlocksNewResponse
     */
    public DescribeAntChainLatestBlocksNewResponse describeAntChainLatestBlocksNewWithOptions(DescribeAntChainLatestBlocksNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainLatestBlocksNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestBlocksNewResponse());
    }

    /**
     * @param request DescribeAntChainLatestBlocksNewRequest
     * @return DescribeAntChainLatestBlocksNewResponse
     */
    public DescribeAntChainLatestBlocksNewResponse describeAntChainLatestBlocksNew(DescribeAntChainLatestBlocksNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestBlocksNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainLatestTransactionDigestsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainLatestTransactionDigestsNewResponse
     */
    public DescribeAntChainLatestTransactionDigestsNewResponse describeAntChainLatestTransactionDigestsNewWithOptions(DescribeAntChainLatestTransactionDigestsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainLatestTransactionDigestsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainLatestTransactionDigestsNewResponse());
    }

    /**
     * @param request DescribeAntChainLatestTransactionDigestsNewRequest
     * @return DescribeAntChainLatestTransactionDigestsNewResponse
     */
    public DescribeAntChainLatestTransactionDigestsNewResponse describeAntChainLatestTransactionDigestsNew(DescribeAntChainLatestTransactionDigestsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainLatestTransactionDigestsNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainMembersNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMembersNewResponse
     */
    public DescribeAntChainMembersNewResponse describeAntChainMembersNewWithOptions(DescribeAntChainMembersNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainMembersNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMembersNewResponse());
    }

    /**
     * @param request DescribeAntChainMembersNewRequest
     * @return DescribeAntChainMembersNewResponse
     */
    public DescribeAntChainMembersNewResponse describeAntChainMembersNew(DescribeAntChainMembersNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMembersNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse describeAntChainMiniAppBrowserQRCodeAccessLogNewWithOptions(DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAccessLogNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse());
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest
     * @return DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAccessLogNewResponse describeAntChainMiniAppBrowserQRCodeAccessLogNew(DescribeAntChainMiniAppBrowserQRCodeAccessLogNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAccessLogNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewWithOptions(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse());
    }

    /**
     * @param request DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest
     * @return DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse
     */
    public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewResponse describeAntChainMiniAppBrowserQRCodeAuthorizedUsersNew(DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainMiniAppBrowserQRCodeAuthorizedUsersNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainNodesNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainNodesNewResponse
     */
    public DescribeAntChainNodesNewResponse describeAntChainNodesNewWithOptions(DescribeAntChainNodesNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainNodesNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainNodesNewResponse());
    }

    /**
     * @param request DescribeAntChainNodesNewRequest
     * @return DescribeAntChainNodesNewResponse
     */
    public DescribeAntChainNodesNewResponse describeAntChainNodesNew(DescribeAntChainNodesNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainNodesNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainQRCodeAuthorizationNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainQRCodeAuthorizationNewResponse
     */
    public DescribeAntChainQRCodeAuthorizationNewResponse describeAntChainQRCodeAuthorizationNewWithOptions(DescribeAntChainQRCodeAuthorizationNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainQRCodeAuthorizationNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainQRCodeAuthorizationNewResponse());
    }

    /**
     * @param request DescribeAntChainQRCodeAuthorizationNewRequest
     * @return DescribeAntChainQRCodeAuthorizationNewResponse
     */
    public DescribeAntChainQRCodeAuthorizationNewResponse describeAntChainQRCodeAuthorizationNew(DescribeAntChainQRCodeAuthorizationNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainQRCodeAuthorizationNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainRegionNamesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainRegionNamesResponse
     */
    public DescribeAntChainRegionNamesResponse describeAntChainRegionNamesWithOptions(DescribeAntChainRegionNamesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            body.put("Locale", request.locale);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainRegionNames"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainRegionNamesResponse());
    }

    /**
     * @param request DescribeAntChainRegionNamesRequest
     * @return DescribeAntChainRegionNamesResponse
     */
    public DescribeAntChainRegionNamesResponse describeAntChainRegionNames(DescribeAntChainRegionNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainRegionNamesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainRegionsForSaleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainRegionsForSaleResponse
     */
    public DescribeAntChainRegionsForSaleResponse describeAntChainRegionsForSaleWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainRegionsForSale"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainRegionsForSaleResponse());
    }

    /**
     * @return DescribeAntChainRegionsForSaleResponse
     */
    public DescribeAntChainRegionsForSaleResponse describeAntChainRegionsForSale() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainRegionsForSaleWithOptions(runtime);
    }

    /**
     * @param request DescribeAntChainResourceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainResourceTypesResponse
     */
    public DescribeAntChainResourceTypesResponse describeAntChainResourceTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntChainResourceTypes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainResourceTypesResponse());
    }

    /**
     * @return DescribeAntChainResourceTypesResponse
     */
    public DescribeAntChainResourceTypesResponse describeAntChainResourceTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainResourceTypesWithOptions(runtime);
    }

    /**
     * @param request DescribeAntChainRestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainRestResponse
     */
    public DescribeAntChainRestResponse describeAntChainRestWithOptions(DescribeAntChainRestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainRest"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainRestResponse());
    }

    /**
     * @param request DescribeAntChainRestRequest
     * @return DescribeAntChainRestResponse
     */
    public DescribeAntChainRestResponse describeAntChainRest(DescribeAntChainRestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainRestWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainSubnetListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainSubnetListResponse
     */
    public DescribeAntChainSubnetListResponse describeAntChainSubnetListWithOptions(DescribeAntChainSubnetListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainSubnetList"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainSubnetListResponse());
    }

    /**
     * @param request DescribeAntChainSubnetListRequest
     * @return DescribeAntChainSubnetListResponse
     */
    public DescribeAntChainSubnetListResponse describeAntChainSubnetList(DescribeAntChainSubnetListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainSubnetListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainSubnetMemberListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainSubnetMemberListResponse
     */
    public DescribeAntChainSubnetMemberListResponse describeAntChainSubnetMemberListWithOptions(DescribeAntChainSubnetMemberListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainSubnetMemberList"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainSubnetMemberListResponse());
    }

    /**
     * @param request DescribeAntChainSubnetMemberListRequest
     * @return DescribeAntChainSubnetMemberListResponse
     */
    public DescribeAntChainSubnetMemberListResponse describeAntChainSubnetMemberList(DescribeAntChainSubnetMemberListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainSubnetMemberListWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainSubnetNodeListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainSubnetNodeListResponse
     */
    public DescribeAntChainSubnetNodeListResponse describeAntChainSubnetNodeListWithOptions(DescribeAntChainSubnetNodeListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainSubnetNodeList"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainSubnetNodeListResponse());
    }

    /**
     * @param request DescribeAntChainSubnetNodeListRequest
     * @return DescribeAntChainSubnetNodeListResponse
     */
    public DescribeAntChainSubnetNodeListResponse describeAntChainSubnetNodeList(DescribeAntChainSubnetNodeListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainSubnetNodeListWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainTransactionNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionNewResponse
     */
    public DescribeAntChainTransactionNewResponse describeAntChainTransactionNewWithOptions(DescribeAntChainTransactionNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainTransactionNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionNewResponse());
    }

    /**
     * @param request DescribeAntChainTransactionNewRequest
     * @return DescribeAntChainTransactionNewResponse
     */
    public DescribeAntChainTransactionNewResponse describeAntChainTransactionNew(DescribeAntChainTransactionNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntChainTransactionReceiptNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionReceiptNewResponse
     */
    public DescribeAntChainTransactionReceiptNewResponse describeAntChainTransactionReceiptNewWithOptions(DescribeAntChainTransactionReceiptNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainTransactionReceiptNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionReceiptNewResponse());
    }

    /**
     * @param request DescribeAntChainTransactionReceiptNewRequest
     * @return DescribeAntChainTransactionReceiptNewResponse
     */
    public DescribeAntChainTransactionReceiptNewResponse describeAntChainTransactionReceiptNew(DescribeAntChainTransactionReceiptNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionReceiptNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainTransactionStatisticsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainTransactionStatisticsNewResponse
     */
    public DescribeAntChainTransactionStatisticsNewResponse describeAntChainTransactionStatisticsNewWithOptions(DescribeAntChainTransactionStatisticsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainTransactionStatisticsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainTransactionStatisticsNewResponse());
    }

    /**
     * @param request DescribeAntChainTransactionStatisticsNewRequest
     * @return DescribeAntChainTransactionStatisticsNewResponse
     */
    public DescribeAntChainTransactionStatisticsNewResponse describeAntChainTransactionStatisticsNew(DescribeAntChainTransactionStatisticsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainTransactionStatisticsNewWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeAntChainsNewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntChainsNewResponse
     */
    public DescribeAntChainsNewResponse describeAntChainsNewWithOptions(DescribeAntChainsNewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeAntChainsNew"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntChainsNewResponse());
    }

    /**
     * @param request DescribeAntChainsNewRequest
     * @return DescribeAntChainsNewResponse
     */
    public DescribeAntChainsNewResponse describeAntChainsNew(DescribeAntChainsNewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntChainsNewWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAntRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAntRegionsResponse
     */
    public DescribeAntRegionsResponse describeAntRegionsWithOptions(DescribeAntRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locale)) {
            body.put("Locale", request.locale);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAntRegions"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAntRegionsResponse());
    }

    /**
     * @param request DescribeAntRegionsRequest
     * @return DescribeAntRegionsResponse
     */
    public DescribeAntRegionsResponse describeAntRegions(DescribeAntRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAntRegionsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeAppliesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppliesResponse
     */
    public DescribeAppliesResponse describeAppliesWithOptions(DescribeAppliesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
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
            new TeaPair("action", "DescribeApplies"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppliesResponse());
    }

    /**
     * @param request DescribeAppliesRequest
     * @return DescribeAppliesResponse
     */
    public DescribeAppliesResponse describeApplies(DescribeAppliesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppliesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBcSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBcSchemaResponse
     */
    public DescribeBcSchemaResponse describeBcSchemaWithOptions(DescribeBcSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBcSchema"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBcSchemaResponse());
    }

    /**
     * @param request DescribeBcSchemaRequest
     * @return DescribeBcSchemaResponse
     */
    public DescribeBcSchemaResponse describeBcSchema(DescribeBcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBcSchemaWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockResponse
     */
    public DescribeBlockResponse describeBlockWithOptions(DescribeBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlock"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockResponse());
    }

    /**
     * @param request DescribeBlockRequest
     * @return DescribeBlockResponse
     */
    public DescribeBlockResponse describeBlock(DescribeBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainApplicationResponse
     */
    public DescribeBlockchainApplicationResponse describeBlockchainApplicationWithOptions(DescribeBlockchainApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
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
            new TeaPair("action", "DescribeBlockchainApplication"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainApplicationResponse());
    }

    /**
     * @param request DescribeBlockchainApplicationRequest
     * @return DescribeBlockchainApplicationResponse
     */
    public DescribeBlockchainApplicationResponse describeBlockchainApplication(DescribeBlockchainApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainApplicationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainConfigOptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainConfigOptionResponse
     */
    public DescribeBlockchainConfigOptionResponse describeBlockchainConfigOptionWithOptions(DescribeBlockchainConfigOptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainConfigOption"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainConfigOptionResponse());
    }

    /**
     * @param request DescribeBlockchainConfigOptionRequest
     * @return DescribeBlockchainConfigOptionResponse
     */
    public DescribeBlockchainConfigOptionResponse describeBlockchainConfigOption(DescribeBlockchainConfigOptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainConfigOptionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainCreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainCreateTaskResponse
     */
    public DescribeBlockchainCreateTaskResponse describeBlockchainCreateTaskWithOptions(DescribeBlockchainCreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainCreateTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainCreateTaskResponse());
    }

    /**
     * @param request DescribeBlockchainCreateTaskRequest
     * @return DescribeBlockchainCreateTaskResponse
     */
    public DescribeBlockchainCreateTaskResponse describeBlockchainCreateTask(DescribeBlockchainCreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainCreateTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainCreationConfigOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainCreationConfigOptionsResponse
     */
    public DescribeBlockchainCreationConfigOptionsResponse describeBlockchainCreationConfigOptionsWithOptions(DescribeBlockchainCreationConfigOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainCreationConfigOptions"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainCreationConfigOptionsResponse());
    }

    /**
     * @param request DescribeBlockchainCreationConfigOptionsRequest
     * @return DescribeBlockchainCreationConfigOptionsResponse
     */
    public DescribeBlockchainCreationConfigOptionsResponse describeBlockchainCreationConfigOptions(DescribeBlockchainCreationConfigOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainCreationConfigOptionsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainInfoResponse
     */
    public DescribeBlockchainInfoResponse describeBlockchainInfoWithOptions(DescribeBlockchainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainInfo"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainInfoResponse());
    }

    /**
     * @param request DescribeBlockchainInfoRequest
     * @return DescribeBlockchainInfoResponse
     */
    public DescribeBlockchainInfoResponse describeBlockchainInfo(DescribeBlockchainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainSchemaResponse
     */
    public DescribeBlockchainSchemaResponse describeBlockchainSchemaWithOptions(DescribeBlockchainSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainSchema"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainSchemaResponse());
    }

    /**
     * @param request DescribeBlockchainSchemaRequest
     * @return DescribeBlockchainSchemaResponse
     */
    public DescribeBlockchainSchemaResponse describeBlockchainSchema(DescribeBlockchainSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainSchemaWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainSchemaDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainSchemaDetailResponse
     */
    public DescribeBlockchainSchemaDetailResponse describeBlockchainSchemaDetailWithOptions(DescribeBlockchainSchemaDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainSchemaDetail"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainSchemaDetailResponse());
    }

    /**
     * @param request DescribeBlockchainSchemaDetailRequest
     * @return DescribeBlockchainSchemaDetailResponse
     */
    public DescribeBlockchainSchemaDetailResponse describeBlockchainSchemaDetail(DescribeBlockchainSchemaDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainSchemaDetailWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainSchemaFileOSSPropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainSchemaFileOSSPropertiesResponse
     */
    public DescribeBlockchainSchemaFileOSSPropertiesResponse describeBlockchainSchemaFileOSSPropertiesWithOptions(DescribeBlockchainSchemaFileOSSPropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainSchemaFileOSSProperties"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainSchemaFileOSSPropertiesResponse());
    }

    /**
     * @param request DescribeBlockchainSchemaFileOSSPropertiesRequest
     * @return DescribeBlockchainSchemaFileOSSPropertiesResponse
     */
    public DescribeBlockchainSchemaFileOSSPropertiesResponse describeBlockchainSchemaFileOSSProperties(DescribeBlockchainSchemaFileOSSPropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainSchemaFileOSSPropertiesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeBlockchainSchemaTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBlockchainSchemaTemplatesResponse
     */
    public DescribeBlockchainSchemaTemplatesResponse describeBlockchainSchemaTemplatesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlockchainSchemaTemplates"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlockchainSchemaTemplatesResponse());
    }

    /**
     * @return DescribeBlockchainSchemaTemplatesResponse
     */
    public DescribeBlockchainSchemaTemplatesResponse describeBlockchainSchemaTemplates() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBlockchainSchemaTemplatesWithOptions(runtime);
    }

    /**
     * @param request DescribeCSIGatewayEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCSIGatewayEndpointResponse
     */
    public DescribeCSIGatewayEndpointResponse describeCSIGatewayEndpointWithOptions(DescribeCSIGatewayEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCSIGatewayEndpoint"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCSIGatewayEndpointResponse());
    }

    /**
     * @param request DescribeCSIGatewayEndpointRequest
     * @return DescribeCSIGatewayEndpointResponse
     */
    public DescribeCSIGatewayEndpointResponse describeCSIGatewayEndpoint(DescribeCSIGatewayEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCSIGatewayEndpointWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCandidateOrganizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCandidateOrganizationsResponse
     */
    public DescribeCandidateOrganizationsResponse describeCandidateOrganizationsWithOptions(DescribeCandidateOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCandidateOrganizations"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCandidateOrganizationsResponse());
    }

    /**
     * @param request DescribeCandidateOrganizationsRequest
     * @return DescribeCandidateOrganizationsResponse
     */
    public DescribeCandidateOrganizationsResponse describeCandidateOrganizations(DescribeCandidateOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCandidateOrganizationsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChaincodeCollectionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChaincodeCollectionConfigResponse
     */
    public DescribeChaincodeCollectionConfigResponse describeChaincodeCollectionConfigWithOptions(DescribeChaincodeCollectionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            body.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChaincodeCollectionConfig"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChaincodeCollectionConfigResponse());
    }

    /**
     * @param request DescribeChaincodeCollectionConfigRequest
     * @return DescribeChaincodeCollectionConfigResponse
     */
    public DescribeChaincodeCollectionConfigResponse describeChaincodeCollectionConfig(DescribeChaincodeCollectionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChaincodeCollectionConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChaincodeDefinitionTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChaincodeDefinitionTaskResponse
     */
    public DescribeChaincodeDefinitionTaskResponse describeChaincodeDefinitionTaskWithOptions(DescribeChaincodeDefinitionTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeChaincodeDefinitionTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChaincodeDefinitionTaskResponse());
    }

    /**
     * @param request DescribeChaincodeDefinitionTaskRequest
     * @return DescribeChaincodeDefinitionTaskResponse
     */
    public DescribeChaincodeDefinitionTaskResponse describeChaincodeDefinitionTask(DescribeChaincodeDefinitionTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChaincodeDefinitionTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChaincodeUploadPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChaincodeUploadPolicyResponse
     */
    public DescribeChaincodeUploadPolicyResponse describeChaincodeUploadPolicyWithOptions(DescribeChaincodeUploadPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChaincodeUploadPolicy"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChaincodeUploadPolicyResponse());
    }

    /**
     * @param request DescribeChaincodeUploadPolicyRequest
     * @return DescribeChaincodeUploadPolicyResponse
     */
    public DescribeChaincodeUploadPolicyResponse describeChaincodeUploadPolicy(DescribeChaincodeUploadPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChaincodeUploadPolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChannelChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelChaincodesResponse
     */
    public DescribeChannelChaincodesResponse describeChannelChaincodesWithOptions(DescribeChannelChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelChaincodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelChaincodesResponse());
    }

    /**
     * @param request DescribeChannelChaincodesRequest
     * @return DescribeChannelChaincodesResponse
     */
    public DescribeChannelChaincodesResponse describeChannelChaincodes(DescribeChannelChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelChaincodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChannelMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelMembersResponse
     */
    public DescribeChannelMembersResponse describeChannelMembersWithOptions(DescribeChannelMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelMembers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelMembersResponse());
    }

    /**
     * @param request DescribeChannelMembersRequest
     * @return DescribeChannelMembersResponse
     */
    public DescribeChannelMembersResponse describeChannelMembers(DescribeChannelMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeChannelTriggersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeChannelTriggersResponse
     */
    public DescribeChannelTriggersResponse describeChannelTriggersWithOptions(DescribeChannelTriggersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeChannelTriggers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeChannelTriggersResponse());
    }

    /**
     * @param request DescribeChannelTriggersRequest
     * @return DescribeChannelTriggersResponse
     */
    public DescribeChannelTriggersResponse describeChannelTriggers(DescribeChannelTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeChannelTriggersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCloudIntegrationServiceTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudIntegrationServiceTokenResponse
     */
    public DescribeCloudIntegrationServiceTokenResponse describeCloudIntegrationServiceTokenWithOptions(DescribeCloudIntegrationServiceTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.service)) {
            body.put("Service", request.service);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudIntegrationServiceToken"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudIntegrationServiceTokenResponse());
    }

    /**
     * @param request DescribeCloudIntegrationServiceTokenRequest
     * @return DescribeCloudIntegrationServiceTokenResponse
     */
    public DescribeCloudIntegrationServiceTokenResponse describeCloudIntegrationServiceToken(DescribeCloudIntegrationServiceTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudIntegrationServiceTokenWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCloudServiceOrganizationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudServiceOrganizationStatusResponse
     */
    public DescribeCloudServiceOrganizationStatusResponse describeCloudServiceOrganizationStatusWithOptions(DescribeCloudServiceOrganizationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudServiceOrganizationStatus"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudServiceOrganizationStatusResponse());
    }

    /**
     * @param request DescribeCloudServiceOrganizationStatusRequest
     * @return DescribeCloudServiceOrganizationStatusResponse
     */
    public DescribeCloudServiceOrganizationStatusResponse describeCloudServiceOrganizationStatus(DescribeCloudServiceOrganizationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudServiceOrganizationStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeCloudServiceTypeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudServiceTypeStatusResponse
     */
    public DescribeCloudServiceTypeStatusResponse describeCloudServiceTypeStatusWithOptions(DescribeCloudServiceTypeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            body.put("ServiceType", request.serviceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudServiceTypeStatus"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudServiceTypeStatusResponse());
    }

    /**
     * @param request DescribeCloudServiceTypeStatusRequest
     * @return DescribeCloudServiceTypeStatusResponse
     */
    public DescribeCloudServiceTypeStatusResponse describeCloudServiceTypeStatus(DescribeCloudServiceTypeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudServiceTypeStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumAdminStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumAdminStatusResponse
     */
    public DescribeConsortiumAdminStatusResponse describeConsortiumAdminStatusWithOptions(DescribeConsortiumAdminStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsortiumAdminStatus"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumAdminStatusResponse());
    }

    /**
     * @param request DescribeConsortiumAdminStatusRequest
     * @return DescribeConsortiumAdminStatusResponse
     */
    public DescribeConsortiumAdminStatusResponse describeConsortiumAdminStatus(DescribeConsortiumAdminStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumAdminStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumChaincodesResponse
     */
    public DescribeConsortiumChaincodesResponse describeConsortiumChaincodesWithOptions(DescribeConsortiumChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumChaincodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumChaincodesResponse());
    }

    /**
     * @param request DescribeConsortiumChaincodesRequest
     * @return DescribeConsortiumChaincodesResponse
     */
    public DescribeConsortiumChaincodesResponse describeConsortiumChaincodes(DescribeConsortiumChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumChaincodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumChannelsResponse
     */
    public DescribeConsortiumChannelsResponse describeConsortiumChannelsWithOptions(DescribeConsortiumChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumChannels"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumChannelsResponse());
    }

    /**
     * @param request DescribeConsortiumChannelsRequest
     * @return DescribeConsortiumChannelsResponse
     */
    public DescribeConsortiumChannelsResponse describeConsortiumChannels(DescribeConsortiumChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumConfigResponse
     */
    public DescribeConsortiumConfigResponse describeConsortiumConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsortiumConfig"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumConfigResponse());
    }

    /**
     * @return DescribeConsortiumConfigResponse
     */
    public DescribeConsortiumConfigResponse describeConsortiumConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumConfigWithOptions(runtime);
    }

    /**
     * @param request DescribeConsortiumDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumDeletableResponse
     */
    public DescribeConsortiumDeletableResponse describeConsortiumDeletableWithOptions(DescribeConsortiumDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumDeletable"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumDeletableResponse());
    }

    /**
     * @param request DescribeConsortiumDeletableRequest
     * @return DescribeConsortiumDeletableResponse
     */
    public DescribeConsortiumDeletableResponse describeConsortiumDeletable(DescribeConsortiumDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumDeletableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumMemberApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumMemberApprovalResponse
     */
    public DescribeConsortiumMemberApprovalResponse describeConsortiumMemberApprovalWithOptions(DescribeConsortiumMemberApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumMemberApproval"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumMemberApprovalResponse());
    }

    /**
     * @param request DescribeConsortiumMemberApprovalRequest
     * @return DescribeConsortiumMemberApprovalResponse
     */
    public DescribeConsortiumMemberApprovalResponse describeConsortiumMemberApproval(DescribeConsortiumMemberApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumMemberApprovalWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumMembersResponse
     */
    public DescribeConsortiumMembersResponse describeConsortiumMembersWithOptions(DescribeConsortiumMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumMembers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumMembersResponse());
    }

    /**
     * @param request DescribeConsortiumMembersRequest
     * @return DescribeConsortiumMembersResponse
     */
    public DescribeConsortiumMembersResponse describeConsortiumMembers(DescribeConsortiumMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumOrderersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumOrderersResponse
     */
    public DescribeConsortiumOrderersResponse describeConsortiumOrderersWithOptions(DescribeConsortiumOrderersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiumOrderers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumOrderersResponse());
    }

    /**
     * @param request DescribeConsortiumOrderersRequest
     * @return DescribeConsortiumOrderersResponse
     */
    public DescribeConsortiumOrderersResponse describeConsortiumOrderers(DescribeConsortiumOrderersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumOrderersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeConsortiumSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumSpecsResponse
     */
    public DescribeConsortiumSpecsResponse describeConsortiumSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeConsortiumSpecs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumSpecsResponse());
    }

    /**
     * @return DescribeConsortiumSpecsResponse
     */
    public DescribeConsortiumSpecsResponse describeConsortiumSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumSpecsWithOptions(runtime);
    }

    /**
     * @param request DescribeConsortiumsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeConsortiumsResponse
     */
    public DescribeConsortiumsResponse describeConsortiumsWithOptions(DescribeConsortiumsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeConsortiums"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeConsortiumsResponse());
    }

    /**
     * @param request DescribeConsortiumsRequest
     * @return DescribeConsortiumsResponse
     */
    public DescribeConsortiumsResponse describeConsortiums(DescribeConsortiumsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeConsortiumsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDownloadPathsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadPathsResponse
     */
    public DescribeDownloadPathsResponse describeDownloadPathsWithOptions(DescribeDownloadPathsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadPaths"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadPathsResponse());
    }

    /**
     * @param request DescribeDownloadPathsRequest
     * @return DescribeDownloadPathsResponse
     */
    public DescribeDownloadPathsResponse describeDownloadPaths(DescribeDownloadPathsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadPathsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDownloadPathsOfContractChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadPathsOfContractChainResponse
     */
    public DescribeDownloadPathsOfContractChainResponse describeDownloadPathsOfContractChainWithOptions(DescribeDownloadPathsOfContractChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadPathsOfContractChain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadPathsOfContractChainResponse());
    }

    /**
     * @param request DescribeDownloadPathsOfContractChainRequest
     * @return DescribeDownloadPathsOfContractChainResponse
     */
    public DescribeDownloadPathsOfContractChainResponse describeDownloadPathsOfContractChain(DescribeDownloadPathsOfContractChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadPathsOfContractChainWithOptions(request, runtime);
    }

    /**
     * @param request DescribeDownloadPathsOfNotaryChainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadPathsOfNotaryChainResponse
     */
    public DescribeDownloadPathsOfNotaryChainResponse describeDownloadPathsOfNotaryChainWithOptions(DescribeDownloadPathsOfNotaryChainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadPathsOfNotaryChain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadPathsOfNotaryChainResponse());
    }

    /**
     * @param request DescribeDownloadPathsOfNotaryChainRequest
     * @return DescribeDownloadPathsOfNotaryChainResponse
     */
    public DescribeDownloadPathsOfNotaryChainResponse describeDownloadPathsOfNotaryChain(DescribeDownloadPathsOfNotaryChainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadPathsOfNotaryChainWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEcosphereSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEcosphereSpecsResponse
     */
    public DescribeEcosphereSpecsResponse describeEcosphereSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEcosphereSpecs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEcosphereSpecsResponse());
    }

    /**
     * @return DescribeEcosphereSpecsResponse
     */
    public DescribeEcosphereSpecsResponse describeEcosphereSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEcosphereSpecsWithOptions(runtime);
    }

    /**
     * @param request DescribeEthereumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumResponse
     */
    public DescribeEthereumResponse describeEthereumWithOptions(DescribeEthereumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereum"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumResponse());
    }

    /**
     * @param request DescribeEthereumRequest
     * @return DescribeEthereumResponse
     */
    public DescribeEthereumResponse describeEthereum(DescribeEthereumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumClientUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumClientUsersResponse
     */
    public DescribeEthereumClientUsersResponse describeEthereumClientUsersWithOptions(DescribeEthereumClientUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumClientUsers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumClientUsersResponse());
    }

    /**
     * @param request DescribeEthereumClientUsersRequest
     * @return DescribeEthereumClientUsersResponse
     */
    public DescribeEthereumClientUsersResponse describeEthereumClientUsers(DescribeEthereumClientUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumClientUsersWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeEthereumInvitaionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumInvitaionResponse
     */
    public DescribeEthereumInvitaionResponse describeEthereumInvitaionWithOptions(DescribeEthereumInvitaionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            body.put("Token", request.token);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumInvitaion"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumInvitaionResponse());
    }

    /**
     * @param request DescribeEthereumInvitaionRequest
     * @return DescribeEthereumInvitaionResponse
     */
    public DescribeEthereumInvitaionResponse describeEthereumInvitaion(DescribeEthereumInvitaionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumInvitaionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumInviteeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumInviteeResponse
     */
    public DescribeEthereumInviteeResponse describeEthereumInviteeWithOptions(DescribeEthereumInviteeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumInvitee"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumInviteeResponse());
    }

    /**
     * @param request DescribeEthereumInviteeRequest
     * @return DescribeEthereumInviteeResponse
     */
    public DescribeEthereumInviteeResponse describeEthereumInvitee(DescribeEthereumInviteeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumInviteeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumNodeResponse
     */
    public DescribeEthereumNodeResponse describeEthereumNodeWithOptions(DescribeEthereumNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumNode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumNodeResponse());
    }

    /**
     * @param request DescribeEthereumNodeRequest
     * @return DescribeEthereumNodeResponse
     */
    public DescribeEthereumNodeResponse describeEthereumNode(DescribeEthereumNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumNodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumNodeConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumNodeConfigurationResponse
     */
    public DescribeEthereumNodeConfigurationResponse describeEthereumNodeConfigurationWithOptions(DescribeEthereumNodeConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumNodeConfiguration"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumNodeConfigurationResponse());
    }

    /**
     * @param request DescribeEthereumNodeConfigurationRequest
     * @return DescribeEthereumNodeConfigurationResponse
     */
    public DescribeEthereumNodeConfigurationResponse describeEthereumNodeConfiguration(DescribeEthereumNodeConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumNodeConfigurationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumNodeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumNodeInfoResponse
     */
    public DescribeEthereumNodeInfoResponse describeEthereumNodeInfoWithOptions(DescribeEthereumNodeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumNodeInfo"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumNodeInfoResponse());
    }

    /**
     * @param request DescribeEthereumNodeInfoRequest
     * @return DescribeEthereumNodeInfoResponse
     */
    public DescribeEthereumNodeInfoResponse describeEthereumNodeInfo(DescribeEthereumNodeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumNodeInfoWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumNodeLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumNodeLogsResponse
     */
    public DescribeEthereumNodeLogsResponse describeEthereumNodeLogsWithOptions(DescribeEthereumNodeLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            body.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.target)) {
            body.put("Target", request.target);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumNodeLogs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumNodeLogsResponse());
    }

    /**
     * @param request DescribeEthereumNodeLogsRequest
     * @return DescribeEthereumNodeLogsResponse
     */
    public DescribeEthereumNodeLogsResponse describeEthereumNodeLogs(DescribeEthereumNodeLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumNodeLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeEthereumNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumNodesResponse
     */
    public DescribeEthereumNodesResponse describeEthereumNodesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereumNodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumNodesResponse());
    }

    /**
     * @return DescribeEthereumNodesResponse
     */
    public DescribeEthereumNodesResponse describeEthereumNodes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumNodesWithOptions(runtime);
    }

    /**
     * @param request DescribeEthereumsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEthereumsResponse
     */
    public DescribeEthereumsResponse describeEthereumsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEthereums"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEthereumsResponse());
    }

    /**
     * @return DescribeEthereumsResponse
     */
    public DescribeEthereumsResponse describeEthereums() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEthereumsWithOptions(runtime);
    }

    /**
     * @param request DescribeExplorerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExplorerResponse
     */
    public DescribeExplorerResponse describeExplorerWithOptions(DescribeExplorerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeExplorer"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExplorerResponse());
    }

    /**
     * @param request DescribeExplorerRequest
     * @return DescribeExplorerResponse
     */
    public DescribeExplorerResponse describeExplorer(DescribeExplorerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExplorerWithOptions(request, runtime);
    }

    /**
     * @param request DescribeExplorerURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExplorerURLResponse
     */
    public DescribeExplorerURLResponse describeExplorerURLWithOptions(DescribeExplorerURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExplorerURL"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExplorerURLResponse());
    }

    /**
     * @param request DescribeExplorerURLRequest
     * @return DescribeExplorerURLResponse
     */
    public DescribeExplorerURLResponse describeExplorerURL(DescribeExplorerURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExplorerURLWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChaincodeEndorsePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChaincodeEndorsePolicyResponse
     */
    public DescribeFabricChaincodeEndorsePolicyResponse describeFabricChaincodeEndorsePolicyWithOptions(DescribeFabricChaincodeEndorsePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeName)) {
            body.put("ChaincodeName", request.chaincodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChaincodeEndorsePolicy"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChaincodeEndorsePolicyResponse());
    }

    /**
     * @param request DescribeFabricChaincodeEndorsePolicyRequest
     * @return DescribeFabricChaincodeEndorsePolicyResponse
     */
    public DescribeFabricChaincodeEndorsePolicyResponse describeFabricChaincodeEndorsePolicy(DescribeFabricChaincodeEndorsePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChaincodeEndorsePolicyWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChaincodeLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChaincodeLogsResponse
     */
    public DescribeFabricChaincodeLogsResponse describeFabricChaincodeLogsWithOptions(DescribeFabricChaincodeLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chaincodeId)) {
            query.put("ChaincodeId", request.chaincodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lines)) {
            query.put("Lines", request.lines);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
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
            new TeaPair("action", "DescribeFabricChaincodeLogs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChaincodeLogsResponse());
    }

    /**
     * @param request DescribeFabricChaincodeLogsRequest
     * @return DescribeFabricChaincodeLogsResponse
     */
    public DescribeFabricChaincodeLogsResponse describeFabricChaincodeLogs(DescribeFabricChaincodeLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChaincodeLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChannelConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChannelConfigResponse
     */
    public DescribeFabricChannelConfigResponse describeFabricChannelConfigWithOptions(DescribeFabricChannelConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChannelConfig"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChannelConfigResponse());
    }

    /**
     * @param request DescribeFabricChannelConfigRequest
     * @return DescribeFabricChannelConfigResponse
     */
    public DescribeFabricChannelConfigResponse describeFabricChannelConfig(DescribeFabricChannelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChannelConfigWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChannelOrdererRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChannelOrdererResponse
     */
    public DescribeFabricChannelOrdererResponse describeFabricChannelOrdererWithOptions(DescribeFabricChannelOrdererRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChannelOrderer"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChannelOrdererResponse());
    }

    /**
     * @param request DescribeFabricChannelOrdererRequest
     * @return DescribeFabricChannelOrdererResponse
     */
    public DescribeFabricChannelOrdererResponse describeFabricChannelOrderer(DescribeFabricChannelOrdererRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChannelOrdererWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricChannelOrganizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricChannelOrganizationsResponse
     */
    public DescribeFabricChannelOrganizationsResponse describeFabricChannelOrganizationsWithOptions(DescribeFabricChannelOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricChannelOrganizations"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricChannelOrganizationsResponse());
    }

    /**
     * @param request DescribeFabricChannelOrganizationsRequest
     * @return DescribeFabricChannelOrganizationsResponse
     */
    public DescribeFabricChannelOrganizationsResponse describeFabricChannelOrganizations(DescribeFabricChannelOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricChannelOrganizationsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricJoinRequestRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricJoinRequestResponse
     */
    public DescribeFabricJoinRequestResponse describeFabricJoinRequestWithOptions(DescribeFabricJoinRequestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricJoinRequest"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricJoinRequestResponse());
    }

    /**
     * @param request DescribeFabricJoinRequestRequest
     * @return DescribeFabricJoinRequestResponse
     */
    public DescribeFabricJoinRequestResponse describeFabricJoinRequest(DescribeFabricJoinRequestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricJoinRequestWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricJoinResponseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricJoinResponseResponse
     */
    public DescribeFabricJoinResponseResponse describeFabricJoinResponseWithOptions(DescribeFabricJoinResponseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricJoinResponse"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricJoinResponseResponse());
    }

    /**
     * @param request DescribeFabricJoinResponseRequest
     * @return DescribeFabricJoinResponseResponse
     */
    public DescribeFabricJoinResponseResponse describeFabricJoinResponse(DescribeFabricJoinResponseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricJoinResponseWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricManagementChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricManagementChaincodesResponse
     */
    public DescribeFabricManagementChaincodesResponse describeFabricManagementChaincodesWithOptions(DescribeFabricManagementChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricManagementChaincodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricManagementChaincodesResponse());
    }

    /**
     * @param request DescribeFabricManagementChaincodesRequest
     * @return DescribeFabricManagementChaincodesResponse
     */
    public DescribeFabricManagementChaincodesResponse describeFabricManagementChaincodes(DescribeFabricManagementChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricManagementChaincodesWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeFabricOrganizationChaincodePackageRequest
     * @return DescribeFabricOrganizationChaincodePackageResponse
     */
    public DescribeFabricOrganizationChaincodePackageResponse describeFabricOrganizationChaincodePackage(DescribeFabricOrganizationChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricOrganizationEgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricOrganizationEgressResponse
     */
    public DescribeFabricOrganizationEgressResponse describeFabricOrganizationEgressWithOptions(DescribeFabricOrganizationEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricOrganizationEgress"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricOrganizationEgressResponse());
    }

    /**
     * @param request DescribeFabricOrganizationEgressRequest
     * @return DescribeFabricOrganizationEgressResponse
     */
    public DescribeFabricOrganizationEgressResponse describeFabricOrganizationEgress(DescribeFabricOrganizationEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricOrganizationEgressWithOptions(request, runtime);
    }

    /**
     * @param request DescribeFabricPeerChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFabricPeerChannelsResponse
     */
    public DescribeFabricPeerChannelsResponse describeFabricPeerChannelsWithOptions(DescribeFabricPeerChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFabricPeerChannels"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFabricPeerChannelsResponse());
    }

    /**
     * @param request DescribeFabricPeerChannelsRequest
     * @return DescribeFabricPeerChannelsResponse
     */
    public DescribeFabricPeerChannelsResponse describeFabricPeerChannels(DescribeFabricPeerChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFabricPeerChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeGovernanceTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGovernanceTaskResponse
     */
    public DescribeGovernanceTaskResponse describeGovernanceTaskWithOptions(DescribeGovernanceTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGovernanceTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGovernanceTaskResponse());
    }

    /**
     * @param request DescribeGovernanceTaskRequest
     * @return DescribeGovernanceTaskResponse
     */
    public DescribeGovernanceTaskResponse describeGovernanceTask(DescribeGovernanceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGovernanceTaskWithOptions(request, runtime);
    }

    /**
     * @param request DescribeGovernanceTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGovernanceTasksResponse
     */
    public DescribeGovernanceTasksResponse describeGovernanceTasksWithOptions(DescribeGovernanceTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGovernanceTasks"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGovernanceTasksResponse());
    }

    /**
     * @param request DescribeGovernanceTasksRequest
     * @return DescribeGovernanceTasksResponse
     */
    public DescribeGovernanceTasksResponse describeGovernanceTasks(DescribeGovernanceTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGovernanceTasksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInvitationCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvitationCodeResponse
     */
    public DescribeInvitationCodeResponse describeInvitationCodeWithOptions(DescribeInvitationCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvitationCode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvitationCodeResponse());
    }

    /**
     * @param request DescribeInvitationCodeRequest
     * @return DescribeInvitationCodeResponse
     */
    public DescribeInvitationCodeResponse describeInvitationCode(DescribeInvitationCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvitationCodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeInvitationListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInvitationListResponse
     */
    public DescribeInvitationListResponse describeInvitationListWithOptions(DescribeInvitationListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInvitationList"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInvitationListResponse());
    }

    /**
     * @param request DescribeInvitationListRequest
     * @return DescribeInvitationListResponse
     */
    public DescribeInvitationListResponse describeInvitationList(DescribeInvitationListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInvitationListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request DescribeInviterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInviterResponse
     */
    public DescribeInviterResponse describeInviterWithOptions(DescribeInviterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInviter"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInviterResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request DescribeInviterRequest
     * @return DescribeInviterResponse
     */
    public DescribeInviterResponse describeInviter(DescribeInviterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInviterWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLatest15BlocksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatest15BlocksResponse
     */
    public DescribeLatest15BlocksResponse describeLatest15BlocksWithOptions(DescribeLatest15BlocksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatest15Blocks"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatest15BlocksResponse());
    }

    /**
     * @param request DescribeLatest15BlocksRequest
     * @return DescribeLatest15BlocksResponse
     */
    public DescribeLatest15BlocksResponse describeLatest15Blocks(DescribeLatest15BlocksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLatest15BlocksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLatest15TransDigestsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatest15TransDigestsResponse
     */
    public DescribeLatest15TransDigestsResponse describeLatest15TransDigestsWithOptions(DescribeLatest15TransDigestsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatest15TransDigests"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatest15TransDigestsResponse());
    }

    /**
     * @param request DescribeLatest15TransDigestsRequest
     * @return DescribeLatest15TransDigestsResponse
     */
    public DescribeLatest15TransDigestsResponse describeLatest15TransDigests(DescribeLatest15TransDigestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLatest15TransDigestsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLatestBlocksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatestBlocksResponse
     */
    public DescribeLatestBlocksResponse describeLatestBlocksWithOptions(DescribeLatestBlocksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatestBlocks"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatestBlocksResponse());
    }

    /**
     * @param request DescribeLatestBlocksRequest
     * @return DescribeLatestBlocksResponse
     */
    public DescribeLatestBlocksResponse describeLatestBlocks(DescribeLatestBlocksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLatestBlocksWithOptions(request, runtime);
    }

    /**
     * @param request DescribeLatestTransactionDigestsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLatestTransactionDigestsResponse
     */
    public DescribeLatestTransactionDigestsResponse describeLatestTransactionDigestsWithOptions(DescribeLatestTransactionDigestsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLatestTransactionDigests"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLatestTransactionDigestsResponse());
    }

    /**
     * @param request DescribeLatestTransactionDigestsRequest
     * @return DescribeLatestTransactionDigestsResponse
     */
    public DescribeLatestTransactionDigestsResponse describeLatestTransactionDigests(DescribeLatestTransactionDigestsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLatestTransactionDigestsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMemberRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMemberRoleResponse
     */
    public DescribeMemberRoleResponse describeMemberRoleWithOptions(DescribeMemberRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMemberRole"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMemberRoleResponse());
    }

    /**
     * @param request DescribeMemberRoleRequest
     * @return DescribeMemberRoleResponse
     */
    public DescribeMemberRoleResponse describeMemberRole(DescribeMemberRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMemberRoleWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMembersResponse
     */
    public DescribeMembersResponse describeMembersWithOptions(DescribeMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMembers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMembersResponse());
    }

    /**
     * @param request DescribeMembersRequest
     * @return DescribeMembersResponse
     */
    public DescribeMembersResponse describeMembers(DescribeMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMetricResponse
     */
    public DescribeMetricResponse describeMetricWithOptions(DescribeMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            query.put("Bizid", request.bizid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innerIp)) {
            body.put("InnerIp", request.innerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeArea)) {
            body.put("TimeArea", request.timeArea);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetric"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetricResponse());
    }

    /**
     * @param request DescribeMetricRequest
     * @return DescribeMetricResponse
     */
    public DescribeMetricResponse describeMetric(DescribeMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMetricWithOptions(request, runtime);
    }

    /**
     * @param request DescribeMyBlockchainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMyBlockchainsResponse
     */
    public DescribeMyBlockchainsResponse describeMyBlockchainsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMyBlockchains"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMyBlockchainsResponse());
    }

    /**
     * @return DescribeMyBlockchainsResponse
     */
    public DescribeMyBlockchainsResponse describeMyBlockchains() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMyBlockchainsWithOptions(runtime);
    }

    /**
     * @param request DescribeMyBlockchanInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMyBlockchanInfosResponse
     */
    public DescribeMyBlockchanInfosResponse describeMyBlockchanInfosWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMyBlockchanInfos"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMyBlockchanInfosResponse());
    }

    /**
     * @return DescribeMyBlockchanInfosResponse
     */
    public DescribeMyBlockchanInfosResponse describeMyBlockchanInfos() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMyBlockchanInfosWithOptions(runtime);
    }

    /**
     * @param request DescribeMySuccessAppliesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMySuccessAppliesResponse
     */
    public DescribeMySuccessAppliesResponse describeMySuccessAppliesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMySuccessApplies"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMySuccessAppliesResponse());
    }

    /**
     * @return DescribeMySuccessAppliesResponse
     */
    public DescribeMySuccessAppliesResponse describeMySuccessApplies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMySuccessAppliesWithOptions(runtime);
    }

    /**
     * @param request DescribeMySuccessfulApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMySuccessfulApplicationResponse
     */
    public DescribeMySuccessfulApplicationResponse describeMySuccessfulApplicationWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMySuccessfulApplication"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMySuccessfulApplicationResponse());
    }

    /**
     * @return DescribeMySuccessfulApplicationResponse
     */
    public DescribeMySuccessfulApplicationResponse describeMySuccessfulApplication() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMySuccessfulApplicationWithOptions(runtime);
    }

    /**
     * @param request DescribeNetstatURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetstatURLResponse
     */
    public DescribeNetstatURLResponse describeNetstatURLWithOptions(DescribeNetstatURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetstatURL"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetstatURLResponse());
    }

    /**
     * @param request DescribeNetstatURLRequest
     * @return DescribeNetstatURLResponse
     */
    public DescribeNetstatURLResponse describeNetstatURL(DescribeNetstatURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetstatURLWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrdererLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrdererLogsResponse
     */
    public DescribeOrdererLogsResponse describeOrdererLogsWithOptions(DescribeOrdererLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrdererLogs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrdererLogsResponse());
    }

    /**
     * @param request DescribeOrdererLogsRequest
     * @return DescribeOrdererLogsResponse
     */
    public DescribeOrdererLogsResponse describeOrdererLogs(DescribeOrdererLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrdererLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationResponse
     */
    public DescribeOrganizationResponse describeOrganizationWithOptions(DescribeOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganization"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationResponse());
    }

    /**
     * @param request DescribeOrganizationRequest
     * @return DescribeOrganizationResponse
     */
    public DescribeOrganizationResponse describeOrganization(DescribeOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationChaincodesResponse
     */
    public DescribeOrganizationChaincodesResponse describeOrganizationChaincodesWithOptions(DescribeOrganizationChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationChaincodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationChaincodesResponse());
    }

    /**
     * @param request DescribeOrganizationChaincodesRequest
     * @return DescribeOrganizationChaincodesResponse
     */
    public DescribeOrganizationChaincodesResponse describeOrganizationChaincodes(DescribeOrganizationChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationChaincodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request DescribeOrganizationChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationChannelsResponse
     */
    public DescribeOrganizationChannelsResponse describeOrganizationChannelsWithOptions(DescribeOrganizationChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationChannels"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationChannelsResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request DescribeOrganizationChannelsRequest
     * @return DescribeOrganizationChannelsResponse
     */
    public DescribeOrganizationChannelsResponse describeOrganizationChannels(DescribeOrganizationChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationChannelsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationDeletableResponse
     */
    public DescribeOrganizationDeletableResponse describeOrganizationDeletableWithOptions(DescribeOrganizationDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationDeletable"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationDeletableResponse());
    }

    /**
     * @param request DescribeOrganizationDeletableRequest
     * @return DescribeOrganizationDeletableResponse
     */
    public DescribeOrganizationDeletableResponse describeOrganizationDeletable(DescribeOrganizationDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationDeletableWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationMembersResponse
     */
    public DescribeOrganizationMembersResponse describeOrganizationMembersWithOptions(DescribeOrganizationMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationMembers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationMembersResponse());
    }

    /**
     * @param request DescribeOrganizationMembersRequest
     * @return DescribeOrganizationMembersResponse
     */
    public DescribeOrganizationMembersResponse describeOrganizationMembers(DescribeOrganizationMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationMembersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationPeersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationPeersResponse
     */
    public DescribeOrganizationPeersResponse describeOrganizationPeersWithOptions(DescribeOrganizationPeersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationPeers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationPeersResponse());
    }

    /**
     * @param request DescribeOrganizationPeersRequest
     * @return DescribeOrganizationPeersResponse
     */
    public DescribeOrganizationPeersResponse describeOrganizationPeers(DescribeOrganizationPeersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationPeersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationSpecsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationSpecsResponse
     */
    public DescribeOrganizationSpecsResponse describeOrganizationSpecsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrganizationSpecs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationSpecsResponse());
    }

    /**
     * @return DescribeOrganizationSpecsResponse
     */
    public DescribeOrganizationSpecsResponse describeOrganizationSpecs() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationSpecsWithOptions(runtime);
    }

    /**
     * @param request DescribeOrganizationTriggersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationTriggersResponse
     */
    public DescribeOrganizationTriggersResponse describeOrganizationTriggersWithOptions(DescribeOrganizationTriggersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrganizationTriggers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationTriggersResponse());
    }

    /**
     * @param request DescribeOrganizationTriggersRequest
     * @return DescribeOrganizationTriggersResponse
     */
    public DescribeOrganizationTriggersResponse describeOrganizationTriggers(DescribeOrganizationTriggersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationTriggersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationUserCertsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationUserCertsResponse
     */
    public DescribeOrganizationUserCertsResponse describeOrganizationUserCertsWithOptions(DescribeOrganizationUserCertsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrganizationUserCerts"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationUserCertsResponse());
    }

    /**
     * @param request DescribeOrganizationUserCertsRequest
     * @return DescribeOrganizationUserCertsResponse
     */
    public DescribeOrganizationUserCertsResponse describeOrganizationUserCerts(DescribeOrganizationUserCertsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationUserCertsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationUsersResponse
     */
    public DescribeOrganizationUsersResponse describeOrganizationUsersWithOptions(DescribeOrganizationUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizationUsers"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationUsersResponse());
    }

    /**
     * @param request DescribeOrganizationUsersRequest
     * @return DescribeOrganizationUsersResponse
     */
    public DescribeOrganizationUsersResponse describeOrganizationUsers(DescribeOrganizationUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationUsersWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrganizationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrganizationsResponse
     */
    public DescribeOrganizationsResponse describeOrganizationsWithOptions(DescribeOrganizationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrganizations"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrganizationsResponse());
    }

    /**
     * @param request DescribeOrganizationsRequest
     * @return DescribeOrganizationsResponse
     */
    public DescribeOrganizationsResponse describeOrganizations(DescribeOrganizationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrganizationsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOrgnaizationChaincodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrgnaizationChaincodesResponse
     */
    public DescribeOrgnaizationChaincodesResponse describeOrgnaizationChaincodesWithOptions(DescribeOrgnaizationChaincodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribeOrgnaizationChaincodes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrgnaizationChaincodesResponse());
    }

    /**
     * @param request DescribeOrgnaizationChaincodesRequest
     * @return DescribeOrgnaizationChaincodesResponse
     */
    public DescribeOrgnaizationChaincodesResponse describeOrgnaizationChaincodes(DescribeOrgnaizationChaincodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrgnaizationChaincodesWithOptions(request, runtime);
    }

    /**
     * @param request DescribeOssPropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOssPropertiesResponse
     */
    public DescribeOssPropertiesResponse describeOssPropertiesWithOptions(DescribeOssPropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOssProperties"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOssPropertiesResponse());
    }

    /**
     * @param request DescribeOssPropertiesRequest
     * @return DescribeOssPropertiesResponse
     */
    public DescribeOssPropertiesResponse describeOssProperties(DescribeOssPropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOssPropertiesWithOptions(request, runtime);
    }

    /**
     * @param request DescribePeerLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePeerLogsResponse
     */
    public DescribePeerLogsResponse describePeerLogsWithOptions(DescribePeerLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DescribePeerLogs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePeerLogsResponse());
    }

    /**
     * @param request DescribePeerLogsRequest
     * @return DescribePeerLogsResponse
     */
    public DescribePeerLogsResponse describePeerLogs(DescribePeerLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePeerLogsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePublicAntChainContractProjectContentTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePublicAntChainContractProjectContentTreeResponse
     */
    public DescribePublicAntChainContractProjectContentTreeResponse describePublicAntChainContractProjectContentTreeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublicAntChainContractProjectContentTree"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublicAntChainContractProjectContentTreeResponse());
    }

    /**
     * @return DescribePublicAntChainContractProjectContentTreeResponse
     */
    public DescribePublicAntChainContractProjectContentTreeResponse describePublicAntChainContractProjectContentTree() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePublicAntChainContractProjectContentTreeWithOptions(runtime);
    }

    /**
     * @param request DescribePublicAntChainDownloadPathsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePublicAntChainDownloadPathsResponse
     */
    public DescribePublicAntChainDownloadPathsResponse describePublicAntChainDownloadPathsWithOptions(DescribePublicAntChainDownloadPathsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublicAntChainDownloadPaths"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublicAntChainDownloadPathsResponse());
    }

    /**
     * @param request DescribePublicAntChainDownloadPathsRequest
     * @return DescribePublicAntChainDownloadPathsResponse
     */
    public DescribePublicAntChainDownloadPathsResponse describePublicAntChainDownloadPaths(DescribePublicAntChainDownloadPathsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePublicAntChainDownloadPathsWithOptions(request, runtime);
    }

    /**
     * @param request DescribePublicCloudIDEEnvConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePublicCloudIDEEnvConfigsResponse
     */
    public DescribePublicCloudIDEEnvConfigsResponse describePublicCloudIDEEnvConfigsWithOptions(DescribePublicCloudIDEEnvConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePublicCloudIDEEnvConfigs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePublicCloudIDEEnvConfigsResponse());
    }

    /**
     * @param request DescribePublicCloudIDEEnvConfigsRequest
     * @return DescribePublicCloudIDEEnvConfigsResponse
     */
    public DescribePublicCloudIDEEnvConfigsResponse describePublicCloudIDEEnvConfigs(DescribePublicCloudIDEEnvConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePublicCloudIDEEnvConfigsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeQRCodeAccessLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQRCodeAccessLogResponse
     */
    public DescribeQRCodeAccessLogResponse describeQRCodeAccessLogWithOptions(DescribeQRCodeAccessLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQRCodeAccessLog"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQRCodeAccessLogResponse());
    }

    /**
     * @param request DescribeQRCodeAccessLogRequest
     * @return DescribeQRCodeAccessLogResponse
     */
    public DescribeQRCodeAccessLogResponse describeQRCodeAccessLog(DescribeQRCodeAccessLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQRCodeAccessLogWithOptions(request, runtime);
    }

    /**
     * @param request DescribeQRCodeAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeQRCodeAuthorityResponse
     */
    public DescribeQRCodeAuthorityResponse describeQRCodeAuthorityWithOptions(DescribeQRCodeAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeQRCodeAuthority"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeQRCodeAuthorityResponse());
    }

    /**
     * @param request DescribeQRCodeAuthorityRequest
     * @return DescribeQRCodeAuthorityResponse
     */
    public DescribeQRCodeAuthorityResponse describeQRCodeAuthority(DescribeQRCodeAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeQRCodeAuthorityWithOptions(request, runtime);
    }

    /**
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2018-07-31"),
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
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(runtime);
    }

    /**
     * @param request DescribeResourceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceTypeResponse
     */
    public DescribeResourceTypeResponse describeResourceTypeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceType"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceTypeResponse());
    }

    /**
     * @return DescribeResourceTypeResponse
     */
    public DescribeResourceTypeResponse describeResourceType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypeWithOptions(runtime);
    }

    /**
     * @param request DescribeResourceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceTypesResponse
     */
    public DescribeResourceTypesResponse describeResourceTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceTypes"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceTypesResponse());
    }

    /**
     * @return DescribeResourceTypesResponse
     */
    public DescribeResourceTypesResponse describeResourceTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTypesWithOptions(runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeSchemaDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSchemaDetailResponse
     */
    public DescribeSchemaDetailResponse describeSchemaDetailWithOptions(DescribeSchemaDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchemaDetail"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSchemaDetailResponse());
    }

    /**
     * @param request DescribeSchemaDetailRequest
     * @return DescribeSchemaDetailResponse
     */
    public DescribeSchemaDetailResponse describeSchemaDetail(DescribeSchemaDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSchemaDetailWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSmartContractJobStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartContractJobStatusResponse
     */
    public DescribeSmartContractJobStatusResponse describeSmartContractJobStatusWithOptions(DescribeSmartContractJobStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartContractJobStatus"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartContractJobStatusResponse());
    }

    /**
     * @param request DescribeSmartContractJobStatusRequest
     * @return DescribeSmartContractJobStatusResponse
     */
    public DescribeSmartContractJobStatusResponse describeSmartContractJobStatus(DescribeSmartContractJobStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartContractJobStatusWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSmartContractJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartContractJobsResponse
     */
    public DescribeSmartContractJobsResponse describeSmartContractJobsWithOptions(DescribeSmartContractJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartContractJobs"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartContractJobsResponse());
    }

    /**
     * @param request DescribeSmartContractJobsRequest
     * @return DescribeSmartContractJobsResponse
     */
    public DescribeSmartContractJobsResponse describeSmartContractJobs(DescribeSmartContractJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartContractJobsWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSmartContractJobsByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartContractJobsByNameResponse
     */
    public DescribeSmartContractJobsByNameResponse describeSmartContractJobsByNameWithOptions(DescribeSmartContractJobsByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            body.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.start)) {
            body.put("Start", request.start);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartContractJobsByName"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartContractJobsByNameResponse());
    }

    /**
     * @param request DescribeSmartContractJobsByNameRequest
     * @return DescribeSmartContractJobsByNameResponse
     */
    public DescribeSmartContractJobsByNameResponse describeSmartContractJobsByName(DescribeSmartContractJobsByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartContractJobsByNameWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSmartContractResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartContractResultResponse
     */
    public DescribeSmartContractResultResponse describeSmartContractResultWithOptions(DescribeSmartContractResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartContractResult"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartContractResultResponse());
    }

    /**
     * @param request DescribeSmartContractResultRequest
     * @return DescribeSmartContractResultResponse
     */
    public DescribeSmartContractResultResponse describeSmartContractResult(DescribeSmartContractResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartContractResultWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSmartContractResultContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSmartContractResultContentResponse
     */
    public DescribeSmartContractResultContentResponse describeSmartContractResultContentWithOptions(DescribeSmartContractResultContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSmartContractResultContent"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSmartContractResultContentResponse());
    }

    /**
     * @param request DescribeSmartContractResultContentRequest
     * @return DescribeSmartContractResultContentResponse
     */
    public DescribeSmartContractResultContentResponse describeSmartContractResultContent(DescribeSmartContractResultContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSmartContractResultContentWithOptions(request, runtime);
    }

    /**
     * @param request DescribeSubscribeCloudServiceIntegrationStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSubscribeCloudServiceIntegrationStateResponse
     */
    public DescribeSubscribeCloudServiceIntegrationStateResponse describeSubscribeCloudServiceIntegrationStateWithOptions(DescribeSubscribeCloudServiceIntegrationStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSubscribeCloudServiceIntegrationState"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSubscribeCloudServiceIntegrationStateResponse());
    }

    /**
     * @param request DescribeSubscribeCloudServiceIntegrationStateRequest
     * @return DescribeSubscribeCloudServiceIntegrationStateResponse
     */
    public DescribeSubscribeCloudServiceIntegrationStateResponse describeSubscribeCloudServiceIntegrationState(DescribeSubscribeCloudServiceIntegrationStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSubscribeCloudServiceIntegrationStateWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request DescribeTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplatesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTemplates"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTemplatesResponse());
    }

    /**
     * @return DescribeTemplatesResponse
     */
    public DescribeTemplatesResponse describeTemplates() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTemplatesWithOptions(runtime);
    }

    /**
     * @param request DescribeTransactionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransactionResponse
     */
    public DescribeTransactionResponse describeTransactionWithOptions(DescribeTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransaction"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransactionResponse());
    }

    /**
     * @param request DescribeTransactionRequest
     * @return DescribeTransactionResponse
     */
    public DescribeTransactionResponse describeTransaction(DescribeTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransactionWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTransactionFor2CBrowserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransactionFor2CBrowserResponse
     */
    public DescribeTransactionFor2CBrowserResponse describeTransactionFor2CBrowserWithOptions(DescribeTransactionFor2CBrowserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayAuthCode)) {
            body.put("AlipayAuthCode", request.alipayAuthCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransactionFor2CBrowser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransactionFor2CBrowserResponse());
    }

    /**
     * @param request DescribeTransactionFor2CBrowserRequest
     * @return DescribeTransactionFor2CBrowserResponse
     */
    public DescribeTransactionFor2CBrowserResponse describeTransactionFor2CBrowser(DescribeTransactionFor2CBrowserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransactionFor2CBrowserWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTransactionQRCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransactionQRCodeResponse
     */
    public DescribeTransactionQRCodeResponse describeTransactionQRCodeWithOptions(DescribeTransactionQRCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransactionQRCode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransactionQRCodeResponse());
    }

    /**
     * @param request DescribeTransactionQRCodeRequest
     * @return DescribeTransactionQRCodeResponse
     */
    public DescribeTransactionQRCodeResponse describeTransactionQRCode(DescribeTransactionQRCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransactionQRCodeWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTransactionReceiptFor2CBrowserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTransactionReceiptFor2CBrowserResponse
     */
    public DescribeTransactionReceiptFor2CBrowserResponse describeTransactionReceiptFor2CBrowserWithOptions(DescribeTransactionReceiptFor2CBrowserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alipayAuthCode)) {
            body.put("AlipayAuthCode", request.alipayAuthCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTransactionReceiptFor2CBrowser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTransactionReceiptFor2CBrowserResponse());
    }

    /**
     * @param request DescribeTransactionReceiptFor2CBrowserRequest
     * @return DescribeTransactionReceiptFor2CBrowserResponse
     */
    public DescribeTransactionReceiptFor2CBrowserResponse describeTransactionReceiptFor2CBrowser(DescribeTransactionReceiptFor2CBrowserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTransactionReceiptFor2CBrowserWithOptions(request, runtime);
    }

    /**
     * @param request DescribeTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTriggerResponse
     */
    public DescribeTriggerResponse describeTriggerWithOptions(DescribeTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            query.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTrigger"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTriggerResponse());
    }

    /**
     * @param request DescribeTriggerRequest
     * @return DescribeTriggerResponse
     */
    public DescribeTriggerResponse describeTrigger(DescribeTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTriggerWithOptions(request, runtime);
    }

    /**
     * @param request DestroyConsortiumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DestroyConsortiumResponse
     */
    public DestroyConsortiumResponse destroyConsortiumWithOptions(DestroyConsortiumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.consortiumId)) {
            body.put("ConsortiumId", request.consortiumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyConsortium"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyConsortiumResponse());
    }

    /**
     * @param request DestroyConsortiumRequest
     * @return DestroyConsortiumResponse
     */
    public DestroyConsortiumResponse destroyConsortium(DestroyConsortiumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyConsortiumWithOptions(request, runtime);
    }

    /**
     * @param request DestroyEthereumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DestroyEthereumResponse
     */
    public DestroyEthereumResponse destroyEthereumWithOptions(DestroyEthereumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyEthereum"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyEthereumResponse());
    }

    /**
     * @param request DestroyEthereumRequest
     * @return DestroyEthereumResponse
     */
    public DestroyEthereumResponse destroyEthereum(DestroyEthereumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyEthereumWithOptions(request, runtime);
    }

    /**
     * @param request DestroyOrganizationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DestroyOrganizationResponse
     */
    public DestroyOrganizationResponse destroyOrganizationWithOptions(DestroyOrganizationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DestroyOrganization"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DestroyOrganizationResponse());
    }

    /**
     * @param request DestroyOrganizationRequest
     * @return DestroyOrganizationResponse
     */
    public DestroyOrganizationResponse destroyOrganization(DestroyOrganizationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.destroyOrganizationWithOptions(request, runtime);
    }

    /**
     * @param request DownloadAllRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadAllResponse
     */
    public DownloadAllResponse downloadAllWithOptions(DownloadAllRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadAll"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadAllResponse());
    }

    /**
     * @param request DownloadAllRequest
     * @return DownloadAllResponse
     */
    public DownloadAllResponse downloadAll(DownloadAllRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadAllWithOptions(request, runtime);
    }

    /**
     * @param request DownloadBizviewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadBizviewResponse
     */
    public DownloadBizviewResponse downloadBizviewWithOptions(DownloadBizviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadBizview"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadBizviewResponse());
    }

    /**
     * @param request DownloadBizviewRequest
     * @return DownloadBizviewResponse
     */
    public DownloadBizviewResponse downloadBizview(DownloadBizviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadBizviewWithOptions(request, runtime);
    }

    /**
     * @param request DownloadFabricChannelSDKRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadFabricChannelSDKResponse
     */
    public DownloadFabricChannelSDKResponse downloadFabricChannelSDKWithOptions(DownloadFabricChannelSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            query.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadFabricChannelSDK"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadFabricChannelSDKResponse());
    }

    /**
     * @param request DownloadFabricChannelSDKRequest
     * @return DownloadFabricChannelSDKResponse
     */
    public DownloadFabricChannelSDKResponse downloadFabricChannelSDK(DownloadFabricChannelSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadFabricChannelSDKWithOptions(request, runtime);
    }

    /**
     * @param request DownloadOrganizationSDKRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadOrganizationSDKResponse
     */
    public DownloadOrganizationSDKResponse downloadOrganizationSDKWithOptions(DownloadOrganizationSDKRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DownloadOrganizationSDK"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadOrganizationSDKResponse());
    }

    /**
     * @param request DownloadOrganizationSDKRequest
     * @return DownloadOrganizationSDKResponse
     */
    public DownloadOrganizationSDKResponse downloadOrganizationSDK(DownloadOrganizationSDKRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadOrganizationSDKWithOptions(request, runtime);
    }

    /**
     * @param request DownloadSDK2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSDK2Response
     */
    public DownloadSDK2Response downloadSDK2WithOptions(DownloadSDK2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSDK2"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSDK2Response());
    }

    /**
     * @param request DownloadSDK2Request
     * @return DownloadSDK2Response
     */
    public DownloadSDK2Response downloadSDK2(DownloadSDK2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSDK2WithOptions(request, runtime);
    }

    /**
     * @param request DownloadSdkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSdkResponse
     */
    public DownloadSdkResponse downloadSdkWithOptions(DownloadSdkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSdk"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSdkResponse());
    }

    /**
     * @param request DownloadSdkRequest
     * @return DownloadSdkResponse
     */
    public DownloadSdkResponse downloadSdk(DownloadSdkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSdkWithOptions(request, runtime);
    }

    /**
     * @param request DownloadSignedDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSignedDataResponse
     */
    public DownloadSignedDataResponse downloadSignedDataWithOptions(DownloadSignedDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSignedData"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSignedDataResponse());
    }

    /**
     * @param request DownloadSignedDataRequest
     * @return DownloadSignedDataResponse
     */
    public DownloadSignedDataResponse downloadSignedData(DownloadSignedDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSignedDataWithOptions(request, runtime);
    }

    /**
     * @param request DuplicateAntChainContractProjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DuplicateAntChainContractProjectResponse
     */
    public DuplicateAntChainContractProjectResponse duplicateAntChainContractProjectWithOptions(DuplicateAntChainContractProjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            body.put("ProjectId", request.projectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectVersion)) {
            body.put("ProjectVersion", request.projectVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DuplicateAntChainContractProject"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DuplicateAntChainContractProjectResponse());
    }

    /**
     * @param request DuplicateAntChainContractProjectRequest
     * @return DuplicateAntChainContractProjectResponse
     */
    public DuplicateAntChainContractProjectResponse duplicateAntChainContractProject(DuplicateAntChainContractProjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.duplicateAntChainContractProjectWithOptions(request, runtime);
    }

    /**
     * @param request FreezeAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FreezeAccountResponse
     */
    public FreezeAccountResponse freezeAccountWithOptions(FreezeAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FreezeAccount"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FreezeAccountResponse());
    }

    /**
     * @param request FreezeAccountRequest
     * @return FreezeAccountResponse
     */
    public FreezeAccountResponse freezeAccount(FreezeAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.freezeAccountWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request GetAppliesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppliesResponse
     */
    public GetAppliesResponse getAppliesWithOptions(GetAppliesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
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
            new TeaPair("action", "GetApplies"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppliesResponse());
    }

    /**
     * @param request GetAppliesRequest
     * @return GetAppliesResponse
     */
    public GetAppliesResponse getApplies(GetAppliesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppliesWithOptions(request, runtime);
    }

    /**
     * @param request GetBcSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBcSchemaResponse
     */
    public GetBcSchemaResponse getBcSchemaWithOptions(GetBcSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBcSchema"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBcSchemaResponse());
    }

    /**
     * @param request GetBcSchemaRequest
     * @return GetBcSchemaResponse
     */
    public GetBcSchemaResponse getBcSchema(GetBcSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBcSchemaWithOptions(request, runtime);
    }

    /**
     * @param request GetBlockchainCreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBlockchainCreateTaskResponse
     */
    public GetBlockchainCreateTaskResponse getBlockchainCreateTaskWithOptions(GetBlockchainCreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.current)) {
            body.put("Current", request.current);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlockchainCreateTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlockchainCreateTaskResponse());
    }

    /**
     * @param request GetBlockchainCreateTaskRequest
     * @return GetBlockchainCreateTaskResponse
     */
    public GetBlockchainCreateTaskResponse getBlockchainCreateTask(GetBlockchainCreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBlockchainCreateTaskWithOptions(request, runtime);
    }

    /**
     * @param request GetBlockchainInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBlockchainInfoResponse
     */
    public GetBlockchainInfoResponse getBlockchainInfoWithOptions(GetBlockchainInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlockchainInfo"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlockchainInfoResponse());
    }

    /**
     * @param request GetBlockchainInfoRequest
     * @return GetBlockchainInfoResponse
     */
    public GetBlockchainInfoResponse getBlockchainInfo(GetBlockchainInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBlockchainInfoWithOptions(request, runtime);
    }

    /**
     * @param request GetMyBlockchainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMyBlockchainsResponse
     */
    public GetMyBlockchainsResponse getMyBlockchainsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMyBlockchains"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMyBlockchainsResponse());
    }

    /**
     * @return GetMyBlockchainsResponse
     */
    public GetMyBlockchainsResponse getMyBlockchains() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMyBlockchainsWithOptions(runtime);
    }

    /**
     * @param request GetMySuccessAppliesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMySuccessAppliesResponse
     */
    public GetMySuccessAppliesResponse getMySuccessAppliesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMySuccessApplies"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMySuccessAppliesResponse());
    }

    /**
     * @return GetMySuccessAppliesResponse
     */
    public GetMySuccessAppliesResponse getMySuccessApplies() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMySuccessAppliesWithOptions(runtime);
    }

    /**
     * @param request GetOssPropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssPropertiesResponse
     */
    public GetOssPropertiesResponse getOssPropertiesWithOptions(GetOssPropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssProperties"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssPropertiesResponse());
    }

    /**
     * @param request GetOssPropertiesRequest
     * @return GetOssPropertiesResponse
     */
    public GetOssPropertiesResponse getOssProperties(GetOssPropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssPropertiesWithOptions(request, runtime);
    }

    /**
     * @param request GetTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTemplatesResponse
     */
    public GetTemplatesResponse getTemplatesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTemplates"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTemplatesResponse());
    }

    /**
     * @return GetTemplatesResponse
     */
    public GetTemplatesResponse getTemplates() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTemplatesWithOptions(runtime);
    }

    /**
     * @param request InstallChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallChaincodeResponse
     */
    public InstallChaincodeResponse installChaincodeWithOptions(InstallChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "InstallChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallChaincodeResponse());
    }

    /**
     * @param request InstallChaincodeRequest
     * @return InstallChaincodeResponse
     */
    public InstallChaincodeResponse installChaincode(InstallChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installChaincodeWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request InstallFabricChaincodePackageRequest
     * @return InstallFabricChaincodePackageResponse
     */
    public InstallFabricChaincodePackageResponse installFabricChaincodePackage(InstallFabricChaincodePackageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installFabricChaincodePackageWithOptions(request, runtime);
    }

    /**
     * @param request InstantiateChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstantiateChaincodeResponse
     */
    public InstantiateChaincodeResponse instantiateChaincodeWithOptions(InstantiateChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "InstantiateChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstantiateChaincodeResponse());
    }

    /**
     * @param request InstantiateChaincodeRequest
     * @return InstantiateChaincodeResponse
     */
    public InstantiateChaincodeResponse instantiateChaincode(InstantiateChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.instantiateChaincodeWithOptions(request, runtime);
    }

    /**
     * @param request InviteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InviteUserResponse
     */
    public InviteUserResponse inviteUserWithOptions(InviteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userEmail)) {
            body.put("UserEmail", request.userEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InviteUser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InviteUserResponse());
    }

    /**
     * @param request InviteUserRequest
     * @return InviteUserResponse
     */
    public InviteUserResponse inviteUser(InviteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inviteUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request JoinChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinChannelResponse
     */
    public JoinChannelResponse joinChannelWithOptions(JoinChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "JoinChannel"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinChannelResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * @param request JoinChannelRequest
     * @return JoinChannelResponse
     */
    public JoinChannelResponse joinChannel(JoinChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinChannelWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request ModifyTriggerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTriggerResponse
     */
    public ModifyTriggerResponse modifyTriggerWithOptions(ModifyTriggerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.options)) {
            body.put("Options", request.options);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            body.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTrigger"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTriggerResponse());
    }

    /**
     * @param request ModifyTriggerRequest
     * @return ModifyTriggerResponse
     */
    public ModifyTriggerResponse modifyTrigger(ModifyTriggerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTriggerWithOptions(request, runtime);
    }

    /**
     * @param request OperateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateUserResponse
     */
    public OperateUserResponse operateUserWithOptions(OperateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateUser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateUserResponse());
    }

    /**
     * @param request OperateUserRequest
     * @return OperateUserResponse
     */
    public OperateUserResponse operateUser(OperateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateUserWithOptions(request, runtime);
    }

    /**
     * @param request ProcessCloudIDEContractTransactionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessCloudIDEContractTransactionResponse
     */
    public ProcessCloudIDEContractTransactionResponse processCloudIDEContractTransactionWithOptions(ProcessCloudIDEContractTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.antChainId)) {
            body.put("AntChainId", request.antChainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transaction)) {
            body.put("Transaction", request.transaction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessCloudIDEContractTransaction"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessCloudIDEContractTransactionResponse());
    }

    /**
     * @param request ProcessCloudIDEContractTransactionRequest
     * @return ProcessCloudIDEContractTransactionResponse
     */
    public ProcessCloudIDEContractTransactionResponse processCloudIDEContractTransaction(ProcessCloudIDEContractTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processCloudIDEContractTransactionWithOptions(request, runtime);
    }

    /**
     * @param request ProcessPublicCloudIDEContractTransactionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProcessPublicCloudIDEContractTransactionResponse
     */
    public ProcessPublicCloudIDEContractTransactionResponse processPublicCloudIDEContractTransactionWithOptions(ProcessPublicCloudIDEContractTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transaction)) {
            body.put("Transaction", request.transaction);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProcessPublicCloudIDEContractTransaction"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProcessPublicCloudIDEContractTransactionResponse());
    }

    /**
     * @param request ProcessPublicCloudIDEContractTransactionRequest
     * @return ProcessPublicCloudIDEContractTransactionResponse
     */
    public ProcessPublicCloudIDEContractTransactionResponse processPublicCloudIDEContractTransaction(ProcessPublicCloudIDEContractTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.processPublicCloudIDEContractTransactionWithOptions(request, runtime);
    }

    /**
     * @param request QueryBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryBlockResponse
     */
    public QueryBlockResponse queryBlockWithOptions(QueryBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.height)) {
            body.put("Height", request.height);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryBlock"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryBlockResponse());
    }

    /**
     * @param request QueryBlockRequest
     * @return QueryBlockResponse
     */
    public QueryBlockResponse queryBlock(QueryBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryBlockWithOptions(request, runtime);
    }

    /**
     * @param request QueryConsortiumDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryConsortiumDeletableResponse
     */
    public QueryConsortiumDeletableResponse queryConsortiumDeletableWithOptions(QueryConsortiumDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryConsortiumDeletable"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryConsortiumDeletableResponse());
    }

    /**
     * @param request QueryConsortiumDeletableRequest
     * @return QueryConsortiumDeletableResponse
     */
    public QueryConsortiumDeletableResponse queryConsortiumDeletable(QueryConsortiumDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryConsortiumDeletableWithOptions(request, runtime);
    }

    /**
     * @param request QueryEthereumDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryEthereumDeletableResponse
     */
    public QueryEthereumDeletableResponse queryEthereumDeletableWithOptions(QueryEthereumDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryEthereumDeletable"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryEthereumDeletableResponse());
    }

    /**
     * @param request QueryEthereumDeletableRequest
     * @return QueryEthereumDeletableResponse
     */
    public QueryEthereumDeletableResponse queryEthereumDeletable(QueryEthereumDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryEthereumDeletableWithOptions(request, runtime);
    }

    /**
     * @param request QueryMetricRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryMetricResponse
     */
    public QueryMetricResponse queryMetricWithOptions(QueryMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            query.put("Bizid", request.bizid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.innerIp)) {
            body.put("InnerIp", request.innerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metric)) {
            body.put("Metric", request.metric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            body.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeArea)) {
            body.put("TimeArea", request.timeArea);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryMetric"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryMetricResponse());
    }

    /**
     * @param request QueryMetricRequest
     * @return QueryMetricResponse
     */
    public QueryMetricResponse queryMetric(QueryMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMetricWithOptions(request, runtime);
    }

    /**
     * @param request QueryOrganizationDeletableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryOrganizationDeletableResponse
     */
    public QueryOrganizationDeletableResponse queryOrganizationDeletableWithOptions(QueryOrganizationDeletableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "QueryOrganizationDeletable"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryOrganizationDeletableResponse());
    }

    /**
     * @param request QueryOrganizationDeletableRequest
     * @return QueryOrganizationDeletableResponse
     */
    public QueryOrganizationDeletableResponse queryOrganizationDeletable(QueryOrganizationDeletableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryOrganizationDeletableWithOptions(request, runtime);
    }

    /**
     * @param request QueryTransactionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryTransactionResponse
     */
    public QueryTransactionResponse queryTransactionWithOptions(QueryTransactionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hash)) {
            body.put("Hash", request.hash);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryTransaction"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryTransactionResponse());
    }

    /**
     * @param request QueryTransactionRequest
     * @return QueryTransactionResponse
     */
    public QueryTransactionResponse queryTransaction(QueryTransactionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryTransactionWithOptions(request, runtime);
    }

    /**
     * @param request RejectUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RejectUserResponse
     */
    public RejectUserResponse rejectUserWithOptions(RejectUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RejectUser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RejectUserResponse());
    }

    /**
     * @param request RejectUserRequest
     * @return RejectUserResponse
     */
    public RejectUserResponse rejectUser(RejectUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rejectUserWithOptions(request, runtime);
    }

    /**
     * @param request RenameBlockchainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameBlockchainResponse
     */
    public RenameBlockchainResponse renameBlockchainWithOptions(RenameBlockchainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newName)) {
            body.put("NewName", request.newName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameBlockchain"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameBlockchainResponse());
    }

    /**
     * @param request RenameBlockchainRequest
     * @return RenameBlockchainResponse
     */
    public RenameBlockchainResponse renameBlockchain(RenameBlockchainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renameBlockchainWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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

        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAntChainUserCertificate"),
            new TeaPair("version", "2018-07-31"),
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
     * @param request ResetCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetCertificateResponse
     */
    public ResetCertificateResponse resetCertificateWithOptions(ResetCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetCertificate"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetCertificateResponse());
    }

    /**
     * @param request ResetCertificateRequest
     * @return ResetCertificateResponse
     */
    public ResetCertificateResponse resetCertificate(ResetCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ResetOrganizationUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetOrganizationUserPasswordResponse
     */
    public ResetOrganizationUserPasswordResponse resetOrganizationUserPasswordWithOptions(ResetOrganizationUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ResetOrganizationUserPassword"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetOrganizationUserPasswordResponse());
    }

    /**
     * @param request ResetOrganizationUserPasswordRequest
     * @return ResetOrganizationUserPasswordResponse
     */
    public ResetOrganizationUserPasswordResponse resetOrganizationUserPassword(ResetOrganizationUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetOrganizationUserPasswordWithOptions(request, runtime);
    }

    /**
     * @param request ResetPublicAntChainCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetPublicAntChainCertificateResponse
     */
    public ResetPublicAntChainCertificateResponse resetPublicAntChainCertificateWithOptions(ResetPublicAntChainCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetPublicAntChainCertificate"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetPublicAntChainCertificateResponse());
    }

    /**
     * @param request ResetPublicAntChainCertificateRequest
     * @return ResetPublicAntChainCertificateResponse
     */
    public ResetPublicAntChainCertificateResponse resetPublicAntChainCertificate(ResetPublicAntChainCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetPublicAntChainCertificateWithOptions(request, runtime);
    }

    /**
     * @param request ResetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserResponse
     */
    public ResetUserResponse resetUserWithOptions(ResetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operation)) {
            body.put("Operation", request.operation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUser"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserResponse());
    }

    /**
     * @param request ResetUserRequest
     * @return ResetUserResponse
     */
    public ResetUserResponse resetUser(ResetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserWithOptions(request, runtime);
    }

    /**
     * @param request SchemaDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SchemaDetailResponse
     */
    public SchemaDetailResponse schemaDetailWithOptions(SchemaDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SchemaDetail"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SchemaDetailResponse());
    }

    /**
     * @param request SchemaDetailRequest
     * @return SchemaDetailResponse
     */
    public SchemaDetailResponse schemaDetail(SchemaDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.schemaDetailWithOptions(request, runtime);
    }

    /**
     * @param request StartSmartContractJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSmartContractJobResponse
     */
    public StartSmartContractJobResponse startSmartContractJobWithOptions(StartSmartContractJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            body.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOpt)) {
            body.put("SourceOpt", request.sourceOpt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSmartContractJob"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSmartContractJobResponse());
    }

    /**
     * @param request StartSmartContractJobRequest
     * @return StartSmartContractJobResponse
     */
    public StartSmartContractJobResponse startSmartContractJob(StartSmartContractJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSmartContractJobWithOptions(request, runtime);
    }

    /**
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request SubmitFabricChaincodeDefinitionRequest
     * @return SubmitFabricChaincodeDefinitionResponse
     */
    public SubmitFabricChaincodeDefinitionResponse submitFabricChaincodeDefinition(SubmitFabricChaincodeDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitFabricChaincodeDefinitionWithOptions(request, runtime);
    }

    /**
     * @param request SyncFabricChaincodeStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncFabricChaincodeStatusResponse
     */
    public SyncFabricChaincodeStatusResponse syncFabricChaincodeStatusWithOptions(SyncFabricChaincodeStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SyncFabricChaincodeStatus"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncFabricChaincodeStatusResponse());
    }

    /**
     * @param request SyncFabricChaincodeStatusRequest
     * @return SyncFabricChaincodeStatusResponse
     */
    public SyncFabricChaincodeStatusResponse syncFabricChaincodeStatus(SyncFabricChaincodeStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncFabricChaincodeStatusWithOptions(request, runtime);
    }

    /**
     * @param request SynchronizeChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SynchronizeChaincodeResponse
     */
    public SynchronizeChaincodeResponse synchronizeChaincodeWithOptions(SynchronizeChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "SynchronizeChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SynchronizeChaincodeResponse());
    }

    /**
     * @param request SynchronizeChaincodeRequest
     * @return SynchronizeChaincodeResponse
     */
    public SynchronizeChaincodeResponse synchronizeChaincode(SynchronizeChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.synchronizeChaincodeWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request UnfreezeAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnfreezeAccountResponse
     */
    public UnfreezeAccountResponse unfreezeAccountWithOptions(UnfreezeAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            body.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnfreezeAccount"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnfreezeAccountResponse());
    }

    /**
     * @param request UnfreezeAccountRequest
     * @return UnfreezeAccountResponse
     */
    public UnfreezeAccountResponse unfreezeAccount(UnfreezeAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unfreezeAccountWithOptions(request, runtime);
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
            new TeaPair("version", "2018-07-31"),
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
     * @param request UpdateBlockchainSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBlockchainSchemaResponse
     */
    public UpdateBlockchainSchemaResponse updateBlockchainSchemaWithOptions(UpdateBlockchainSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryConfigs)) {
            body.put("CategoryConfigs", request.categoryConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBlockchainSchema"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBlockchainSchemaResponse());
    }

    /**
     * @param request UpdateBlockchainSchemaRequest
     * @return UpdateBlockchainSchemaResponse
     */
    public UpdateBlockchainSchemaResponse updateBlockchainSchema(UpdateBlockchainSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBlockchainSchemaWithOptions(request, runtime);
    }

    /**
     * @param request UpdateChannelConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateChannelConfigResponse
     */
    public UpdateChannelConfigResponse updateChannelConfigWithOptions(UpdateChannelConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchTimeout)) {
            body.put("BatchTimeout", request.batchTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxMessageCount)) {
            body.put("MaxMessageCount", request.maxMessageCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredMaxBytes)) {
            body.put("PreferredMaxBytes", request.preferredMaxBytes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateChannelConfig"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateChannelConfigResponse());
    }

    /**
     * @param request UpdateChannelConfigRequest
     * @return UpdateChannelConfigResponse
     */
    public UpdateChannelConfigResponse updateChannelConfig(UpdateChannelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateChannelConfigWithOptions(request, runtime);
    }

    /**
     * @param request UpdateEthereumRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEthereumResponse
     */
    public UpdateEthereumResponse updateEthereumWithOptions(UpdateEthereumRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ethereumId)) {
            body.put("EthereumId", request.ethereumId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEthereum"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEthereumResponse());
    }

    /**
     * @param request UpdateEthereumRequest
     * @return UpdateEthereumResponse
     */
    public UpdateEthereumResponse updateEthereum(UpdateEthereumRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEthereumWithOptions(request, runtime);
    }

    /**
     * @param request UpdateEthereumClientUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEthereumClientUserPasswordResponse
     */
    public UpdateEthereumClientUserPasswordResponse updateEthereumClientUserPasswordWithOptions(UpdateEthereumClientUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
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
            new TeaPair("action", "UpdateEthereumClientUserPassword"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEthereumClientUserPasswordResponse());
    }

    /**
     * @param request UpdateEthereumClientUserPasswordRequest
     * @return UpdateEthereumClientUserPasswordResponse
     */
    public UpdateEthereumClientUserPasswordResponse updateEthereumClientUserPassword(UpdateEthereumClientUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEthereumClientUserPasswordWithOptions(request, runtime);
    }

    /**
     * @param request UpdateEthereumNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEthereumNodeResponse
     */
    public UpdateEthereumNodeResponse updateEthereumNodeWithOptions(UpdateEthereumNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            body.put("NodeName", request.nodeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEthereumNode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEthereumNodeResponse());
    }

    /**
     * @param request UpdateEthereumNodeRequest
     * @return UpdateEthereumNodeResponse
     */
    public UpdateEthereumNodeResponse updateEthereumNode(UpdateEthereumNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEthereumNodeWithOptions(request, runtime);
    }

    /**
     * @param request UpdateEthereumNodeConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEthereumNodeConfigurationResponse
     */
    public UpdateEthereumNodeConfigurationResponse updateEthereumNodeConfigurationWithOptions(UpdateEthereumNodeConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IP)) {
            body.put("IP", request.IP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePub)) {
            body.put("NodePub", request.nodePub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.p2pPort)) {
            body.put("P2pPort", request.p2pPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.raftPort)) {
            body.put("RaftPort", request.raftPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rpcPort)) {
            body.put("RpcPort", request.rpcPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TMPort)) {
            body.put("TMPort", request.TMPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.TMPub)) {
            body.put("TMPub", request.TMPub);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.WSPort)) {
            body.put("WSPort", request.WSPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEthereumNodeConfiguration"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEthereumNodeConfigurationResponse());
    }

    /**
     * @param request UpdateEthereumNodeConfigurationRequest
     * @return UpdateEthereumNodeConfigurationResponse
     */
    public UpdateEthereumNodeConfigurationResponse updateEthereumNodeConfiguration(UpdateEthereumNodeConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEthereumNodeConfigurationWithOptions(request, runtime);
    }

    /**
     * @param request UpdateGovernanceTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGovernanceTaskResponse
     */
    public UpdateGovernanceTaskResponse updateGovernanceTaskWithOptions(UpdateGovernanceTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.channelId)) {
            body.put("ChannelId", request.channelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskAction)) {
            body.put("TaskAction", request.taskAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGovernanceTask"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGovernanceTaskResponse());
    }

    /**
     * @param request UpdateGovernanceTaskRequest
     * @return UpdateGovernanceTaskResponse
     */
    public UpdateGovernanceTaskResponse updateGovernanceTask(UpdateGovernanceTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGovernanceTaskWithOptions(request, runtime);
    }

    /**
     * @param request UpdateMemberRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMemberRoleResponse
     */
    public UpdateMemberRoleResponse updateMemberRoleWithOptions(UpdateMemberRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bid)) {
            body.put("Bid", request.bid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            body.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMemberRole"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMemberRoleResponse());
    }

    /**
     * @param request UpdateMemberRoleRequest
     * @return UpdateMemberRoleResponse
     */
    public UpdateMemberRoleResponse updateMemberRole(UpdateMemberRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMemberRoleWithOptions(request, runtime);
    }

    /**
     * @param request UpdateQRCodeAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQRCodeAuthorityResponse
     */
    public UpdateQRCodeAuthorityResponse updateQRCodeAuthorityWithOptions(UpdateQRCodeAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorized)) {
            body.put("Authorized", request.authorized);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQRCodeAuthority"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQRCodeAuthorityResponse());
    }

    /**
     * @param request UpdateQRCodeAuthorityRequest
     * @return UpdateQRCodeAuthorityResponse
     */
    public UpdateQRCodeAuthorityResponse updateQRCodeAuthority(UpdateQRCodeAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQRCodeAuthorityWithOptions(request, runtime);
    }

    /**
     * @param request UpdateSchemaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSchemaResponse
     */
    public UpdateSchemaResponse updateSchemaWithOptions(UpdateSchemaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizid)) {
            body.put("Bizid", request.bizid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.categoryConfigs)) {
            body.put("CategoryConfigs", request.categoryConfigs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaId)) {
            body.put("SchemaId", request.schemaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            body.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSchema"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSchemaResponse());
    }

    /**
     * @param request UpdateSchemaRequest
     * @return UpdateSchemaResponse
     */
    public UpdateSchemaResponse updateSchema(UpdateSchemaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSchemaWithOptions(request, runtime);
    }

    /**
     * @param request UpgradeChaincodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeChaincodeResponse
     */
    public UpgradeChaincodeResponse upgradeChaincodeWithOptions(UpgradeChaincodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UpgradeChaincode"),
            new TeaPair("version", "2018-07-31"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeChaincodeResponse());
    }

    /**
     * @param request UpgradeChaincodeRequest
     * @return UpgradeChaincodeResponse
     */
    public UpgradeChaincodeResponse upgradeChaincode(UpgradeChaincodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeChaincodeWithOptions(request, runtime);
    }

    /**
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

        if (!com.aliyun.teautil.Common.isUnset(request.organizationId)) {
            body.put("OrganizationId", request.organizationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeFabricChaincodeDefinition"),
            new TeaPair("version", "2018-07-31"),
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
     * @param request UpgradeFabricChaincodeDefinitionRequest
     * @return UpgradeFabricChaincodeDefinitionResponse
     */
    public UpgradeFabricChaincodeDefinitionResponse upgradeFabricChaincodeDefinition(UpgradeFabricChaincodeDefinitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeFabricChaincodeDefinitionWithOptions(request, runtime);
    }
}
