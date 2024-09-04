// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baasdis20200509;

import com.aliyun.tea.*;
import com.aliyun.baasdis20200509.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("baasdis", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * @param request CreateEenterpriseDIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEenterpriseDIDResponse
     */
    public CreateEenterpriseDIDResponse createEenterpriseDIDWithOptions(CreateEenterpriseDIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUniqueID)) {
            body.put("OwnerUniqueID", request.ownerUniqueID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEenterpriseDID"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEenterpriseDIDResponse());
    }

    /**
     * @param request CreateEenterpriseDIDRequest
     * @return CreateEenterpriseDIDResponse
     */
    public CreateEenterpriseDIDResponse createEenterpriseDID(CreateEenterpriseDIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEenterpriseDIDWithOptions(request, runtime);
    }

    /**
     * @param request CreatePersonalDIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePersonalDIDResponse
     */
    public CreatePersonalDIDResponse createPersonalDIDWithOptions(CreatePersonalDIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUniqueID)) {
            body.put("OwnerUniqueID", request.ownerUniqueID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePersonalDID"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePersonalDIDResponse());
    }

    /**
     * @param request CreatePersonalDIDRequest
     * @return CreatePersonalDIDResponse
     */
    public CreatePersonalDIDResponse createPersonalDID(CreatePersonalDIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPersonalDIDWithOptions(request, runtime);
    }

    /**
     * @param request CreateTenantDIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTenantDIDResponse
     */
    public CreateTenantDIDResponse createTenantDIDWithOptions(CreateTenantDIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTenantDID"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTenantDIDResponse());
    }

    /**
     * @param request CreateTenantDIDRequest
     * @return CreateTenantDIDResponse
     */
    public CreateTenantDIDResponse createTenantDID(CreateTenantDIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTenantDIDWithOptions(request, runtime);
    }

    /**
     * @param request GetDIDRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDIDResponse
     */
    public GetDIDResponse getDIDWithOptions(GetDIDRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DID)) {
            body.put("DID", request.DID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDID"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDIDResponse());
    }

    /**
     * @param request GetDIDRequest
     * @return GetDIDResponse
     */
    public GetDIDResponse getDID(GetDIDRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDIDWithOptions(request, runtime);
    }

    /**
     * @param request IssueNormalVerifiableVCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return IssueNormalVerifiableVCResponse
     */
    public IssueNormalVerifiableVCResponse issueNormalVerifiableVCWithOptions(IssueNormalVerifiableVCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bareClaimStructBody)) {
            body.put("BareClaimStructBody", request.bareClaimStructBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiration)) {
            body.put("Expiration", request.expiration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuer)) {
            body.put("Issuer", request.issuer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subject)) {
            body.put("Subject", request.subject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IssueNormalVerifiableVC"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IssueNormalVerifiableVCResponse());
    }

    /**
     * @param request IssueNormalVerifiableVCRequest
     * @return IssueNormalVerifiableVCResponse
     */
    public IssueNormalVerifiableVCResponse issueNormalVerifiableVC(IssueNormalVerifiableVCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.issueNormalVerifiableVCWithOptions(request, runtime);
    }

    /**
     * @param request UpdateVCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVCResponse
     */
    public UpdateVCResponse updateVCWithOptions(UpdateVCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.issuerDid)) {
            body.put("IssuerDid", request.issuerDid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VCId)) {
            body.put("VCId", request.VCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VCStatus)) {
            body.put("VCStatus", request.VCStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVC"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVCResponse());
    }

    /**
     * @param request UpdateVCRequest
     * @return UpdateVCResponse
     */
    public UpdateVCResponse updateVC(UpdateVCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVCWithOptions(request, runtime);
    }

    /**
     * @param request VerifyVerifiableClaimRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return VerifyVerifiableClaimResponse
     */
    public VerifyVerifiableClaimResponse verifyVerifiableClaimWithOptions(VerifyVerifiableClaimRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.VCContent)) {
            body.put("VCContent", request.VCContent);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "VerifyVerifiableClaim"),
            new TeaPair("version", "2020-05-09"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new VerifyVerifiableClaimResponse());
    }

    /**
     * @param request VerifyVerifiableClaimRequest
     * @return VerifyVerifiableClaimResponse
     */
    public VerifyVerifiableClaimResponse verifyVerifiableClaim(VerifyVerifiableClaimRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.verifyVerifiableClaimWithOptions(request, runtime);
    }
}
