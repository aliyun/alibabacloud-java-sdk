// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901;

import com.aliyun.tea.*;
import com.aliyun.agentidentity20250901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("agentidentity", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request AddSAMLIdentityProviderCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSAMLIdentityProviderCertificateResponse
     */
    public AddSAMLIdentityProviderCertificateResponse addSAMLIdentityProviderCertificateWithOptions(AddSAMLIdentityProviderCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.x509Certificate)) {
            body.put("X509Certificate", request.x509Certificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSAMLIdentityProviderCertificate"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSAMLIdentityProviderCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request AddSAMLIdentityProviderCertificateRequest
     * @return AddSAMLIdentityProviderCertificateResponse
     */
    public AddSAMLIdentityProviderCertificateResponse addSAMLIdentityProviderCertificate(AddSAMLIdentityProviderCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSAMLIdentityProviderCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略集关联网关</p>
     * 
     * @param request AttachPolicySetToGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachPolicySetToGatewayResponse
     */
    public AttachPolicySetToGatewayResponse attachPolicySetToGatewayWithOptions(AttachPolicySetToGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enforcementMode)) {
            body.put("EnforcementMode", request.enforcementMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayArn)) {
            body.put("GatewayArn", request.gatewayArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachPolicySetToGateway"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachPolicySetToGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略集关联网关</p>
     * 
     * @param request AttachPolicySetToGatewayRequest
     * @return AttachPolicySetToGatewayResponse
     */
    public AttachPolicySetToGatewayResponse attachPolicySetToGateway(AttachPolicySetToGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachPolicySetToGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个 API 密钥凭证提供商</p>
     * 
     * @param request CreateAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAPIKeyCredentialProviderResponse
     */
    public CreateAPIKeyCredentialProviderResponse createAPIKeyCredentialProviderWithOptions(CreateAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            body.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个 API 密钥凭证提供商</p>
     * 
     * @param request CreateAPIKeyCredentialProviderRequest
     * @return CreateAPIKeyCredentialProviderResponse
     */
    public CreateAPIKeyCredentialProviderResponse createAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request CreateClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientSecretResponse
     */
    public CreateClientSecretResponse createClientSecretWithOptions(CreateClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientSecret"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request CreateClientSecretRequest
     * @return CreateClientSecretResponse
     */
    public CreateClientSecretResponse createClientSecret(CreateClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建IdentityProvider</p>
     * 
     * @param tmpReq CreateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProviderWithOptions(CreateIdentityProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateIdentityProviderShrinkRequest request = new CreateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedAudience)) {
            request.allowedAudienceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedAudience, "AllowedAudience", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedAudienceShrink)) {
            body.put("AllowedAudience", request.allowedAudienceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryURL)) {
            body.put("DiscoveryURL", request.discoveryURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建IdentityProvider</p>
     * 
     * @param request CreateIdentityProviderRequest
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProvider(CreateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OAuth2 凭证提供商</p>
     * 
     * @param tmpReq CreateOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOAuth2CredentialProviderResponse
     */
    public CreateOAuth2CredentialProviderResponse createOAuth2CredentialProviderWithOptions(CreateOAuth2CredentialProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOAuth2CredentialProviderShrinkRequest request = new CreateOAuth2CredentialProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.OAuth2ProviderConfig)) {
            request.OAuth2ProviderConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.OAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            body.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderVendor)) {
            body.put("CredentialProviderVendor", request.credentialProviderVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2ProviderConfigShrink)) {
            body.put("OAuth2ProviderConfig", request.OAuth2ProviderConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建 OAuth2 凭证提供商</p>
     * 
     * @param request CreateOAuth2CredentialProviderRequest
     * @return CreateOAuth2CredentialProviderResponse
     */
    public CreateOAuth2CredentialProviderResponse createOAuth2CredentialProvider(CreateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个权限策略</p>
     * 
     * @param tmpReq CreatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicyWithOptions(CreatePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePolicyShrinkRequest request = new CreatePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.definition)) {
            request.definitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.definition, "Definition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definitionShrink)) {
            body.put("Definition", request.definitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicy"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个权限策略</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个权限策略集合</p>
     * 
     * @param request CreatePolicySetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePolicySetResponse
     */
    public CreatePolicySetResponse createPolicySetWithOptions(CreatePolicySetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePolicySet"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePolicySetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个权限策略集合</p>
     * 
     * @param request CreatePolicySetRequest
     * @return CreatePolicySetResponse
     */
    public CreatePolicySetResponse createPolicySet(CreatePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicySetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Role</p>
     * 
     * @param request CreateRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Role</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>策略集关联网关</p>
     * 
     * @param request CreateRoleAssignmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleAssignmentResponse
     */
    public CreateRoleAssignmentResponse createRoleAssignmentWithOptions(CreateRoleAssignmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            body.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRoleAssignment"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleAssignmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>策略集关联网关</p>
     * 
     * @param request CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     */
    public CreateRoleAssignmentResponse createRoleAssignment(CreateRoleAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoleAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个凭证库</p>
     * 
     * @param tmpReq CreateTokenVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTokenVaultResponse
     */
    public CreateTokenVaultResponse createTokenVaultWithOptions(CreateTokenVaultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateTokenVaultShrinkRequest request = new CreateTokenVaultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.encryptionConfig)) {
            request.encryptionConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.encryptionConfig, "EncryptionConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionConfigShrink)) {
            body.put("EncryptionConfig", request.encryptionConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTokenVault"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTokenVaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建一个凭证库</p>
     * 
     * @param request CreateTokenVaultRequest
     * @return CreateTokenVaultResponse
     */
    public CreateTokenVaultResponse createTokenVault(CreateTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建UserPool</p>
     * 
     * @param request CreateUserPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserPoolResponse
     */
    public CreateUserPoolResponse createUserPoolWithOptions(CreateUserPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserPool"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建UserPool</p>
     * 
     * @param request CreateUserPoolRequest
     * @return CreateUserPoolResponse
     */
    public CreateUserPoolResponse createUserPool(CreateUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param tmpReq CreateUserPoolClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserPoolClientResponse
     */
    public CreateUserPoolClientResponse createUserPoolClientWithOptions(CreateUserPoolClientRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUserPoolClientShrinkRequest request = new CreateUserPoolClientShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirectURIs)) {
            request.redirectURIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirectURIs, "RedirectURIs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenValidity)) {
            body.put("AccessTokenValidity", request.accessTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enforcePKCE)) {
            body.put("EnforcePKCE", request.enforcePKCE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectURIsShrink)) {
            body.put("RedirectURIs", request.redirectURIsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshTokenValidity)) {
            body.put("RefreshTokenValidity", request.refreshTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretRequired)) {
            body.put("SecretRequired", request.secretRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserPoolClient"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserPoolClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request CreateUserPoolClientRequest
     * @return CreateUserPoolClientResponse
     */
    public CreateUserPoolClientResponse createUserPoolClient(CreateUserPoolClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserPoolClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param tmpReq CreateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentityWithOptions(CreateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkloadIdentityShrinkRequest request = new CreateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedResourceOAuth2ReturnURLsShrink)) {
            body.put("AllowedResourceOAuth2ReturnURLs", request.allowedResourceOAuth2ReturnURLsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createRAMRole)) {
            body.put("CreateRAMRole", request.createRAMRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionBindingEnabled)) {
            body.put("SessionBindingEnabled", request.sessionBindingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceAgentArn)) {
            body.put("SourceAgentArn", request.sourceAgentArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            body.put("SourcePlatform", request.sourcePlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request CreateWorkloadIdentityRequest
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentity(CreateWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个 API 密钥凭证提供商</p>
     * 
     * @param request DeleteAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    public DeleteAPIKeyCredentialProviderResponse deleteAPIKeyCredentialProviderWithOptions(DeleteAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个 API 密钥凭证提供商</p>
     * 
     * @param request DeleteAPIKeyCredentialProviderRequest
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    public DeleteAPIKeyCredentialProviderResponse deleteAPIKeyCredentialProvider(DeleteAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientSecretResponse
     */
    public DeleteClientSecretResponse deleteClientSecretWithOptions(DeleteClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            body.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecretId)) {
            body.put("ClientSecretId", request.clientSecretId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientSecret"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteClientSecretRequest
     * @return DeleteClientSecretResponse
     */
    public DeleteClientSecretResponse deleteClientSecret(DeleteClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProviderWithOptions(DeleteIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除IdentityProvider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除 OAuth2 凭证提供商</p>
     * 
     * @param request DeleteOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOAuth2CredentialProviderResponse
     */
    public DeleteOAuth2CredentialProviderResponse deleteOAuth2CredentialProviderWithOptions(DeleteOAuth2CredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除 OAuth2 凭证提供商</p>
     * 
     * @param request DeleteOAuth2CredentialProviderRequest
     * @return DeleteOAuth2CredentialProviderResponse
     */
    public DeleteOAuth2CredentialProviderResponse deleteOAuth2CredentialProvider(DeleteOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个权限策略</p>
     * 
     * @param request DeletePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicyWithOptions(DeletePolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicy"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个权限策略</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个权限策略集合</p>
     * 
     * @param request DeletePolicySetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePolicySetResponse
     */
    public DeletePolicySetResponse deletePolicySetWithOptions(DeletePolicySetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePolicySet"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePolicySetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个权限策略集合</p>
     * 
     * @param request DeletePolicySetRequest
     * @return DeletePolicySetResponse
     */
    public DeletePolicySetResponse deletePolicySet(DeletePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicySetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除Role</p>
     * 
     * @param request DeleteRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除Role</p>
     * 
     * @param request DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>网关取消关联策略集</p>
     * 
     * @param request DeleteRoleAssignmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleAssignmentResponse
     */
    public DeleteRoleAssignmentResponse deleteRoleAssignmentWithOptions(DeleteRoleAssignmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            body.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRoleAssignment"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleAssignmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>网关取消关联策略集</p>
     * 
     * @param request DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     */
    public DeleteRoleAssignmentResponse deleteRoleAssignment(DeleteRoleAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoleAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteSAMLIdentityProviderCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSAMLIdentityProviderCertificateResponse
     */
    public DeleteSAMLIdentityProviderCertificateResponse deleteSAMLIdentityProviderCertificateWithOptions(DeleteSAMLIdentityProviderCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            body.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSAMLIdentityProviderCertificate"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSAMLIdentityProviderCertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteSAMLIdentityProviderCertificateRequest
     * @return DeleteSAMLIdentityProviderCertificateResponse
     */
    public DeleteSAMLIdentityProviderCertificateResponse deleteSAMLIdentityProviderCertificate(DeleteSAMLIdentityProviderCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSAMLIdentityProviderCertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个指定的凭证库。</p>
     * 
     * @param request DeleteTokenVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTokenVaultResponse
     */
    public DeleteTokenVaultResponse deleteTokenVaultWithOptions(DeleteTokenVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTokenVault"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTokenVaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个指定的凭证库。</p>
     * 
     * @param request DeleteTokenVaultRequest
     * @return DeleteTokenVaultResponse
     */
    public DeleteTokenVaultResponse deleteTokenVault(DeleteTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除User</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除User</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除UserPool</p>
     * 
     * @param request DeleteUserPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPoolResponse
     */
    public DeleteUserPoolResponse deleteUserPoolWithOptions(DeleteUserPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserPool"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除UserPool</p>
     * 
     * @param request DeleteUserPoolRequest
     * @return DeleteUserPoolResponse
     */
    public DeleteUserPoolResponse deleteUserPool(DeleteUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteUserPoolClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPoolClientResponse
     */
    public DeleteUserPoolClientResponse deleteUserPoolClientWithOptions(DeleteUserPoolClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserPoolClient"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPoolClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteUserPoolClientRequest
     * @return DeleteUserPoolClientResponse
     */
    public DeleteUserPoolClientResponse deleteUserPoolClient(DeleteUserPoolClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPoolClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentityWithOptions(DeleteWorkloadIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除WorkloadIdentity</p>
     * 
     * @param request DeleteWorkloadIdentityRequest
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>网关取消关联策略集</p>
     * 
     * @param request DetachPolicySetFromGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachPolicySetFromGatewayResponse
     */
    public DetachPolicySetFromGatewayResponse detachPolicySetFromGatewayWithOptions(DetachPolicySetFromGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayArn)) {
            body.put("GatewayArn", request.gatewayArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachPolicySetFromGateway"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachPolicySetFromGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>网关取消关联策略集</p>
     * 
     * @param request DetachPolicySetFromGatewayRequest
     * @return DetachPolicySetFromGatewayResponse
     */
    public DetachPolicySetFromGatewayResponse detachPolicySetFromGateway(DetachPolicySetFromGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachPolicySetFromGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 API 密钥凭证提供商</p>
     * 
     * @param request GetAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAPIKeyCredentialProviderResponse
     */
    public GetAPIKeyCredentialProviderResponse getAPIKeyCredentialProviderWithOptions(GetAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 API 密钥凭证提供商</p>
     * 
     * @param request GetAPIKeyCredentialProviderRequest
     * @return GetAPIKeyCredentialProviderResponse
     */
    public GetAPIKeyCredentialProviderResponse getAPIKeyCredentialProvider(GetAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询网关策略配置</p>
     * 
     * @param request GetGatewayPolicyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGatewayPolicyConfigResponse
     */
    public GetGatewayPolicyConfigResponse getGatewayPolicyConfigWithOptions(GetGatewayPolicyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayArn)) {
            body.put("GatewayArn", request.gatewayArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGatewayPolicyConfig"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGatewayPolicyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询网关策略配置</p>
     * 
     * @param request GetGatewayPolicyConfigRequest
     * @return GetGatewayPolicyConfigResponse
     */
    public GetGatewayPolicyConfigResponse getGatewayPolicyConfig(GetGatewayPolicyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGatewayPolicyConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProviderWithOptions(GetIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetIdentityProviderRequest
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProvider(GetIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询 OAuth2 凭证提供商</p>
     * 
     * @param request GetOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOAuth2CredentialProviderResponse
     */
    public GetOAuth2CredentialProviderResponse getOAuth2CredentialProviderWithOptions(GetOAuth2CredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询 OAuth2 凭证提供商</p>
     * 
     * @param request GetOAuth2CredentialProviderRequest
     * @return GetOAuth2CredentialProviderResponse
     */
    public GetOAuth2CredentialProviderResponse getOAuth2CredentialProvider(GetOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 权限策略</p>
     * 
     * @param request GetPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicyWithOptions(GetPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicy"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 权限策略</p>
     * 
     * @param request GetPolicyRequest
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 权限策略集合</p>
     * 
     * @param request GetPolicySetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPolicySetResponse
     */
    public GetPolicySetResponse getPolicySetWithOptions(GetPolicySetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPolicySet"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPolicySetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个 权限策略集合</p>
     * 
     * @param request GetPolicySetRequest
     * @return GetPolicySetResponse
     */
    public GetPolicySetResponse getPolicySet(GetPolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicySetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Role</p>
     * 
     * @param request GetRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleResponse
     */
    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Role</p>
     * 
     * @param request GetRoleRequest
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetSAMLIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSAMLIdentityProviderResponse
     */
    public GetSAMLIdentityProviderResponse getSAMLIdentityProviderWithOptions(GetSAMLIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSAMLIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSAMLIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetSAMLIdentityProviderRequest
     * @return GetSAMLIdentityProviderResponse
     */
    public GetSAMLIdentityProviderResponse getSAMLIdentityProvider(GetSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetSAMLServiceProviderInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSAMLServiceProviderInfoResponse
     */
    public GetSAMLServiceProviderInfoResponse getSAMLServiceProviderInfoWithOptions(GetSAMLServiceProviderInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSAMLServiceProviderInfo"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSAMLServiceProviderInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetSAMLServiceProviderInfoRequest
     * @return GetSAMLServiceProviderInfoResponse
     */
    public GetSAMLServiceProviderInfoResponse getSAMLServiceProviderInfo(GetSAMLServiceProviderInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSAMLServiceProviderInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定凭证库的详细配置。</p>
     * 
     * @param request GetTokenVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTokenVaultResponse
     */
    public GetTokenVaultResponse getTokenVaultWithOptions(GetTokenVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTokenVault"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTokenVaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定凭证库的详细配置。</p>
     * 
     * @param request GetTokenVaultRequest
     * @return GetTokenVaultResponse
     */
    public GetTokenVaultResponse getTokenVault(GetTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取UserPool</p>
     * 
     * @param request GetUserPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserPoolResponse
     */
    public GetUserPoolResponse getUserPoolWithOptions(GetUserPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPool"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取UserPool</p>
     * 
     * @param request GetUserPoolRequest
     * @return GetUserPoolResponse
     */
    public GetUserPoolResponse getUserPool(GetUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetUserPoolClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserPoolClientResponse
     */
    public GetUserPoolClientResponse getUserPoolClientWithOptions(GetUserPoolClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPoolClient"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPoolClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetUserPoolClientRequest
     * @return GetUserPoolClientResponse
     */
    public GetUserPoolClientResponse getUserPoolClient(GetUserPoolClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPoolClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWorkloadIdentityResponse
     */
    public GetWorkloadIdentityResponse getWorkloadIdentityWithOptions(GetWorkloadIdentityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request GetWorkloadIdentityRequest
     * @return GetWorkloadIdentityResponse
     */
    public GetWorkloadIdentityResponse getWorkloadIdentity(GetWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 API 密钥凭证提供商</p>
     * 
     * @param request ListAPIKeyCredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAPIKeyCredentialProvidersResponse
     */
    public ListAPIKeyCredentialProvidersResponse listAPIKeyCredentialProvidersWithOptions(ListAPIKeyCredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAPIKeyCredentialProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAPIKeyCredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出 API 密钥凭证提供商</p>
     * 
     * @param request ListAPIKeyCredentialProvidersRequest
     * @return ListAPIKeyCredentialProvidersResponse
     */
    public ListAPIKeyCredentialProvidersResponse listAPIKeyCredentialProviders(ListAPIKeyCredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAPIKeyCredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListClientSecretsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientSecretsResponse
     */
    public ListClientSecretsResponse listClientSecretsWithOptions(ListClientSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientSecrets"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListClientSecretsRequest
     * @return ListClientSecretsResponse
     */
    public ListClientSecretsResponse listClientSecrets(ListClientSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProvidersWithOptions(ListIdentityProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProviders(ListIdentityProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentityProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出 OAuth2 凭证提供商</p>
     * 
     * @param request ListOAuth2CredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOAuth2CredentialProvidersResponse
     */
    public ListOAuth2CredentialProvidersResponse listOAuth2CredentialProvidersWithOptions(ListOAuth2CredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOAuth2CredentialProviders"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOAuth2CredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出 OAuth2 凭证提供商</p>
     * 
     * @param request ListOAuth2CredentialProvidersRequest
     * @return ListOAuth2CredentialProvidersResponse
     */
    public ListOAuth2CredentialProvidersResponse listOAuth2CredentialProviders(ListOAuth2CredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOAuth2CredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出权限策略</p>
     * 
     * @param request ListPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPoliciesWithOptions(ListPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicies"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出权限策略</p>
     * 
     * @param request ListPoliciesRequest
     * @return ListPoliciesResponse
     */
    public ListPoliciesResponse listPolicies(ListPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出网关策略配置</p>
     * 
     * @param request ListPolicySetAttachedGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicySetAttachedGatewaysResponse
     */
    public ListPolicySetAttachedGatewaysResponse listPolicySetAttachedGatewaysWithOptions(ListPolicySetAttachedGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicySetAttachedGateways"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicySetAttachedGatewaysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出网关策略配置</p>
     * 
     * @param request ListPolicySetAttachedGatewaysRequest
     * @return ListPolicySetAttachedGatewaysResponse
     */
    public ListPolicySetAttachedGatewaysResponse listPolicySetAttachedGateways(ListPolicySetAttachedGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicySetAttachedGatewaysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出权限策略集合</p>
     * 
     * @param request ListPolicySetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPolicySetsResponse
     */
    public ListPolicySetsResponse listPolicySetsWithOptions(ListPolicySetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPolicySets"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPolicySetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出权限策略集合</p>
     * 
     * @param request ListPolicySetsRequest
     * @return ListPolicySetsResponse
     */
    public ListPolicySetsResponse listPolicySets(ListPolicySetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPolicySetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出网关策略配置</p>
     * 
     * @param request ListRoleAssignmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoleAssignmentsResponse
     */
    public ListRoleAssignmentsResponse listRoleAssignmentsWithOptions(ListRoleAssignmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalName)) {
            body.put("PrincipalName", request.principalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            body.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoleAssignments"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoleAssignmentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出网关策略配置</p>
     * 
     * @param request ListRoleAssignmentsRequest
     * @return ListRoleAssignmentsResponse
     */
    public ListRoleAssignmentsResponse listRoleAssignments(ListRoleAssignmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRoleAssignmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出Roles</p>
     * 
     * @param request ListRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出Roles</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListSAMLIdentityProviderCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSAMLIdentityProviderCertificatesResponse
     */
    public ListSAMLIdentityProviderCertificatesResponse listSAMLIdentityProviderCertificatesWithOptions(ListSAMLIdentityProviderCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSAMLIdentityProviderCertificates"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSAMLIdentityProviderCertificatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListSAMLIdentityProviderCertificatesRequest
     * @return ListSAMLIdentityProviderCertificatesResponse
     */
    public ListSAMLIdentityProviderCertificatesResponse listSAMLIdentityProviderCertificates(ListSAMLIdentityProviderCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSAMLIdentityProviderCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分页列出账户下所有的 API 密钥凭证</p>
     * 
     * @param request ListTokenVaultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTokenVaultsResponse
     */
    public ListTokenVaultsResponse listTokenVaultsWithOptions(ListTokenVaultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTokenVaults"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTokenVaultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页列出账户下所有的 API 密钥凭证</p>
     * 
     * @param request ListTokenVaultsRequest
     * @return ListTokenVaultsResponse
     */
    public ListTokenVaultsResponse listTokenVaults(ListTokenVaultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTokenVaultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListUserPoolClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPoolClientsResponse
     */
    public ListUserPoolClientsResponse listUserPoolClientsWithOptions(ListUserPoolClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPoolClients"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPoolClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListUserPoolClientsRequest
     * @return ListUserPoolClientsResponse
     */
    public ListUserPoolClientsResponse listUserPoolClients(ListUserPoolClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPoolClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListUserPoolsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPoolsResponse
     */
    public ListUserPoolsResponse listUserPoolsWithOptions(ListUserPoolsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPools"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPoolsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListUserPoolsRequest
     * @return ListUserPoolsResponse
     */
    public ListUserPoolsResponse listUserPools(ListUserPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPoolsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出用户</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出用户</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListWorkloadIdentitiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentitiesWithOptions(ListWorkloadIdentitiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkloadIdentities"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkloadIdentitiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListWorkloadIdentitiesRequest
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentities(ListWorkloadIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkloadIdentitiesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param tmpReq SetSAMLIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSAMLIdentityProviderResponse
     */
    public SetSAMLIdentityProviderResponse setSAMLIdentityProviderWithOptions(SetSAMLIdentityProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSAMLIdentityProviderShrinkRequest request = new SetSAMLIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.x509Certificates)) {
            request.x509CertificatesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.x509Certificates, "X509Certificates", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            body.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JITProvisionStatus)) {
            body.put("JITProvisionStatus", request.JITProvisionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JITUpdateStatus)) {
            body.put("JITUpdateStatus", request.JITUpdateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginURL)) {
            body.put("LoginURL", request.loginURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SAMLBindingType)) {
            body.put("SAMLBindingType", request.SAMLBindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSOStatus)) {
            body.put("SSOStatus", request.SSOStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.x509CertificatesShrink)) {
            body.put("X509Certificates", request.x509CertificatesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSAMLIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSAMLIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建WorkloadIdentity</p>
     * 
     * @param request SetSAMLIdentityProviderRequest
     * @return SetSAMLIdentityProviderResponse
     */
    public SetSAMLIdentityProviderResponse setSAMLIdentityProvider(SetSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个 API 密钥凭证提供商</p>
     * 
     * @param request UpdateAPIKeyCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    public UpdateAPIKeyCredentialProviderResponse updateAPIKeyCredentialProviderWithOptions(UpdateAPIKeyCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.APIKey)) {
            body.put("APIKey", request.APIKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.APIKeyCredentialProviderName)) {
            body.put("APIKeyCredentialProviderName", request.APIKeyCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAPIKeyCredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAPIKeyCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个 API 密钥凭证提供商</p>
     * 
     * @param request UpdateAPIKeyCredentialProviderRequest
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    public UpdateAPIKeyCredentialProviderResponse updateAPIKeyCredentialProvider(UpdateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询网关策略配置</p>
     * 
     * @param request UpdateGatewayPolicyConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGatewayPolicyConfigResponse
     */
    public UpdateGatewayPolicyConfigResponse updateGatewayPolicyConfigWithOptions(UpdateGatewayPolicyConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enforcementMode)) {
            body.put("EnforcementMode", request.enforcementMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayArn)) {
            body.put("GatewayArn", request.gatewayArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gatewayType)) {
            body.put("GatewayType", request.gatewayType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGatewayPolicyConfig"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGatewayPolicyConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询网关策略配置</p>
     * 
     * @param request UpdateGatewayPolicyConfigRequest
     * @return UpdateGatewayPolicyConfigResponse
     */
    public UpdateGatewayPolicyConfigResponse updateGatewayPolicyConfig(UpdateGatewayPolicyConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGatewayPolicyConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param tmpReq UpdateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProviderWithOptions(UpdateIdentityProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateIdentityProviderShrinkRequest request = new UpdateIdentityProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedAudience)) {
            request.allowedAudienceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedAudience, "AllowedAudience", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedAudienceShrink)) {
            body.put("AllowedAudience", request.allowedAudienceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.discoveryURL)) {
            body.put("DiscoveryURL", request.discoveryURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIdentityProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改 OAuth2 凭证提供商</p>
     * 
     * @param tmpReq UpdateOAuth2CredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOAuth2CredentialProviderResponse
     */
    public UpdateOAuth2CredentialProviderResponse updateOAuth2CredentialProviderWithOptions(UpdateOAuth2CredentialProviderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateOAuth2CredentialProviderShrinkRequest request = new UpdateOAuth2CredentialProviderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.OAuth2ProviderConfig)) {
            request.OAuth2ProviderConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.OAuth2ProviderConfig, "OAuth2ProviderConfig", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.callbackURL)) {
            body.put("CallbackURL", request.callbackURL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderVendor)) {
            body.put("CredentialProviderVendor", request.credentialProviderVendor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2CredentialProviderName)) {
            body.put("OAuth2CredentialProviderName", request.OAuth2CredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OAuth2ProviderConfigShrink)) {
            body.put("OAuth2ProviderConfig", request.OAuth2ProviderConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOAuth2CredentialProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOAuth2CredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改 OAuth2 凭证提供商</p>
     * 
     * @param request UpdateOAuth2CredentialProviderRequest
     * @return UpdateOAuth2CredentialProviderResponse
     */
    public UpdateOAuth2CredentialProviderResponse updateOAuth2CredentialProvider(UpdateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个权限策略</p>
     * 
     * @param tmpReq UpdatePolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicyWithOptions(UpdatePolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdatePolicyShrinkRequest request = new UpdatePolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.definition)) {
            request.definitionShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.definition, "Definition", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.definitionShrink)) {
            body.put("Definition", request.definitionShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyName)) {
            body.put("PolicyName", request.policyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicy"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个权限策略</p>
     * 
     * @param request UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个权限策略集合</p>
     * 
     * @param request UpdatePolicySetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePolicySetResponse
     */
    public UpdatePolicySetResponse updatePolicySetWithOptions(UpdatePolicySetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policySetName)) {
            body.put("PolicySetName", request.policySetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePolicySet"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePolicySetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个权限策略集合</p>
     * 
     * @param request UpdatePolicySetRequest
     * @return UpdatePolicySetResponse
     */
    public UpdatePolicySetResponse updatePolicySet(UpdatePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicySetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Role</p>
     * 
     * @param request UpdateRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Role</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新凭证库。</p>
     * 
     * @param request UpdateTokenVaultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTokenVaultResponse
     */
    public UpdateTokenVaultResponse updateTokenVaultWithOptions(UpdateTokenVaultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenVaultName)) {
            body.put("TokenVaultName", request.tokenVaultName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTokenVault"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTokenVaultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新凭证库。</p>
     * 
     * @param request UpdateTokenVaultRequest
     * @return UpdateTokenVaultResponse
     */
    public UpdateTokenVaultResponse updateTokenVault(UpdateTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param request UpdateUserPoolRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPoolResponse
     */
    public UpdateUserPoolResponse updateUserPoolWithOptions(UpdateUserPoolRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPool"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserPoolResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新IdentityProvider</p>
     * 
     * @param request UpdateUserPoolRequest
     * @return UpdateUserPoolResponse
     */
    public UpdateUserPoolResponse updateUserPool(UpdateUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param tmpReq UpdateUserPoolClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPoolClientResponse
     */
    public UpdateUserPoolClientResponse updateUserPoolClientWithOptions(UpdateUserPoolClientRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateUserPoolClientShrinkRequest request = new UpdateUserPoolClientShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.redirectURIs)) {
            request.redirectURIsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.redirectURIs, "RedirectURIs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenValidity)) {
            body.put("AccessTokenValidity", request.accessTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientName)) {
            body.put("ClientName", request.clientName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enforcePKCE)) {
            body.put("EnforcePKCE", request.enforcePKCE);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectURIsShrink)) {
            body.put("RedirectURIs", request.redirectURIsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshTokenValidity)) {
            body.put("RefreshTokenValidity", request.refreshTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretRequired)) {
            body.put("SecretRequired", request.secretRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPoolClient"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserPoolClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request UpdateUserPoolClientRequest
     * @return UpdateUserPoolClientResponse
     */
    public UpdateUserPoolClientResponse updateUserPoolClient(UpdateUserPoolClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserPoolClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param tmpReq UpdateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentityWithOptions(UpdateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkloadIdentityShrinkRequest request = new UpdateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedResourceOAuth2ReturnURLsShrink)) {
            body.put("AllowedResourceOAuth2ReturnURLs", request.allowedResourceOAuth2ReturnURLsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            body.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleArn)) {
            body.put("RoleArn", request.roleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionBindingEnabled)) {
            body.put("SessionBindingEnabled", request.sessionBindingEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadIdentityName)) {
            body.put("WorkloadIdentityName", request.workloadIdentityName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkloadIdentity"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkloadIdentityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用</p>
     * 
     * @param request UpdateWorkloadIdentityRequest
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentity(UpdateWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkloadIdentityWithOptions(request, runtime);
    }
}
