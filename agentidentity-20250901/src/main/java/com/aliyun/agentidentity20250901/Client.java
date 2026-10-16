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
     * <b>description</b> :
     * <p>Attaches a policy set to a target gateway.
     * The attachment relationship is 1:1. A gateway can have only one policy set attached at a time. If you attach a policy set multiple times, the latest attachment takes effect. You can specify the policy enforcement mode by using the EnforcementMode parameter. Valid values: ENFORCE (blocks non-compliant requests) and LOG_ONLY (records non-compliant requests but allows them, which is commonly used for canary release observation).</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a policy set to a gateway.</p>
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
     * <b>description</b> :
     * <p>Attaches a policy set to a target gateway.
     * The attachment relationship is 1:1. A gateway can have only one policy set attached at a time. If you attach a policy set multiple times, the latest attachment takes effect. You can specify the policy enforcement mode by using the EnforcementMode parameter. Valid values: ENFORCE (blocks non-compliant requests) and LOG_ONLY (records non-compliant requests but allows them, which is commonly used for canary release observation).</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches a policy set to a gateway.</p>
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
     * <p>Creates an API key credential provider.</p>
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
     * <p>Creates an API key credential provider.</p>
     * 
     * @param request CreateAPIKeyCredentialProviderRequest
     * @return CreateAPIKeyCredentialProviderResponse
     */
    public CreateAPIKeyCredentialProviderResponse createAPIKeyCredentialProvider(CreateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The response includes the plaintext client secret (ClientSecretValue). For security reasons, the plaintext secret is returned only once upon creation and cannot be retrieved later. Store it securely.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workload identity.</p>
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
     * <b>description</b> :
     * <p>The response includes the plaintext client secret (ClientSecretValue). For security reasons, the plaintext secret is returned only once upon creation and cannot be retrieved later. Store it securely.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workload identity.</p>
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
     * <p>Creates an OAuth 2.0 credential provider.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.OAuthType)) {
            body.put("OAuthType", request.OAuthType);
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
     * <p>Creates an OAuth 2.0 credential provider.</p>
     * 
     * @param request CreateOAuth2CredentialProviderRequest
     * @return CreateOAuth2CredentialProviderResponse
     */
    public CreateOAuth2CredentialProviderResponse createOAuth2CredentialProvider(CreateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the CreatePolicy operation to add a policy to an existing policy set. The policy defines specific control rules, such as throttling thresholds, admission conditions, and allow or block actions, through the Definition field. After a policy set is mounted to a gateway, requests on the gateway are evaluated and controlled based on the merged results of all policies in the policy set.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access policy.</p>
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
     * <b>description</b> :
     * <p>Calls the CreatePolicy operation to add a policy to an existing policy set. The policy defines specific control rules, such as throttling thresholds, admission conditions, and allow or block actions, through the Definition field. After a policy set is mounted to a gateway, requests on the gateway are evaluated and controlled based on the merged results of all policies in the policy set.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access policy.</p>
     * 
     * @param request CreatePolicyRequest
     * @return CreatePolicyResponse
     */
    public CreatePolicyResponse createPolicy(CreatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls CreatePolicySet to create a policy set in the current account. A policy set is a container for a group of policies. After a policy set is mounted to a gateway, all policies in the set evaluate requests to the gateway as a whole.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access policy set.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePlatform)) {
            body.put("SourcePlatform", request.sourcePlatform);
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
     * <b>description</b> :
     * <p>Calls CreatePolicySet to create a policy set in the current account. A policy set is a container for a group of policies. After a policy set is mounted to a gateway, all policies in the set evaluate requests to the gateway as a whole.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access policy set.</p>
     * 
     * @param request CreatePolicySetRequest
     * @return CreatePolicySetResponse
     */
    public CreatePolicySetResponse createPolicySet(CreatePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPolicySetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Users in a user pool can be allocated roles to enable quick authorization. Administrators can specify permissions for roles in an access policy.
     * When a user pool is created, the platform automatically provisions a default role, and newly created users are automatically allocated this default role. This operation creates a custom role of the Manual type, which must be explicitly allocated to users by calling CreateRoleAssignment.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a role.</p>
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
     * <b>description</b> :
     * <p>Users in a user pool can be allocated roles to enable quick authorization. Administrators can specify permissions for roles in an access policy.
     * When a user pool is created, the platform automatically provisions a default role, and newly created users are automatically allocated this default role. This operation creates a custom role of the Manual type, which must be explicitly allocated to users by calling CreateRoleAssignment.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a role.</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Users must be assigned roles to complete authorization. When a user is created through JIT, a default role is automatically assigned. Administrators can use this operation to assign additional custom roles to users.
     * PrincipalType currently supports only User. A single identity can have multiple role assignments.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a policy set with a gateway.</p>
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
     * <b>description</b> :
     * <p>Users must be assigned roles to complete authorization. When a user is created through JIT, a default role is automatically assigned. Administrators can use this operation to assign additional custom roles to users.
     * PrincipalType currently supports only User. A single identity can have multiple role assignments.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a policy set with a gateway.</p>
     * 
     * @param request CreateRoleAssignmentRequest
     * @return CreateRoleAssignmentResponse
     */
    public CreateRoleAssignmentResponse createRoleAssignment(CreateRoleAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRoleAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the CreateTokenVault operation to create a token vault within the current Alibaba Cloud account. A token vault is a container used by the AgentIdentity service to securely store sensitive credentials such as OAuth2 tokens and API keys. Each token is encrypted when it is written to the vault.
     * You can specify the encryption configuration when you create the vault. By default, a service-managed key (SERVICE_MANAGED_KEY) is used. For greater control over the key, you can use a customer-managed Key Management Service (KMS) key (CUSTOMER_MANAGED_KEY). To use a customer-managed key, specify the Alibaba Cloud Resource Name (ARN) of the KMS key and use the RoleArn parameter to authorize the AgentIdentity service to access the KMS key.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a token vault.</p>
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
     * <b>description</b> :
     * <p>Calls the CreateTokenVault operation to create a token vault within the current Alibaba Cloud account. A token vault is a container used by the AgentIdentity service to securely store sensitive credentials such as OAuth2 tokens and API keys. Each token is encrypted when it is written to the vault.
     * You can specify the encryption configuration when you create the vault. By default, a service-managed key (SERVICE_MANAGED_KEY) is used. For greater control over the key, you can use a customer-managed Key Management Service (KMS) key (CUSTOMER_MANAGED_KEY). To use a customer-managed key, specify the Alibaba Cloud Resource Name (ARN) of the KMS key and use the RoleArn parameter to authorize the AgentIdentity service to access the KMS key.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a token vault.</p>
     * 
     * @param request CreateTokenVaultRequest
     * @return CreateTokenVaultResponse
     */
    public CreateTokenVaultResponse createTokenVault(CreateTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a user in a specified user pool. The type of the created user is Manual, and the default status is Enabled. The username must be unique within the user pool and can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length. The email address must be unique within the user pool. After the user is created, you can call the SetUserPassword operation to set a logon password for the user and call the CreateRoleAssignment operation to assign a role to the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user in a user pool.</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

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
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a user in a specified user pool. The type of the created user is Manual, and the default status is Enabled. The username must be unique within the user pool and can contain letters, digits, underscores (_), periods (.), and hyphens (-), and must be 3 to 128 characters in length. The email address must be unique within the user pool. After the user is created, you can call the SetUserPassword operation to set a logon password for the user and call the CreateRoleAssignment operation to assign a role to the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user in a user pool.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A user pool is a secure and isolated user folder designed by the Agent Identity platform for the AI agent ecosystem. You can create multiple user pools under a single Alibaba Cloud account for the independent user identity management of different AI agents. When you create a user pool, you only need to specify the name (UserPoolName). The description is optional. After the user pool is created, the platform automatically generates a default role for the user pool. Users subsequently created through SAML SSO just-in-time (JIT) synchronization are automatically allocated this default role.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user pool.</p>
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
     * <b>description</b> :
     * <p>A user pool is a secure and isolated user folder designed by the Agent Identity platform for the AI agent ecosystem. You can create multiple user pools under a single Alibaba Cloud account for the independent user identity management of different AI agents. When you create a user pool, you only need to specify the name (UserPoolName). The description is optional. After the user pool is created, the platform automatically generates a default role for the user pool. Users subsequently created through SAML SSO just-in-time (JIT) synchronization are automatically allocated this default role.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user pool.</p>
     * 
     * @param request CreateUserPoolRequest
     * @return CreateUserPoolResponse
     */
    public CreateUserPoolResponse createUserPool(CreateUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A client represents an application that is integrated with a user pool. When you create a client, you must specify the client name and redirect URIs. You can configure whether an application secret is required, whether to enforce Proof Key for Code Exchange (PKCE), the access token validity period, and the refresh token validity period. The application scopes are generated by the platform by default. If SecretRequired is set to true, you must call CreateClientSecret to create a client secret.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a WorkloadIdentity.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scopes)) {
            request.scopesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scopes, "Scopes", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.scopesShrink)) {
            body.put("Scopes", request.scopesShrink);
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
     * <b>description</b> :
     * <p>A client represents an application that is integrated with a user pool. When you create a client, you must specify the client name and redirect URIs. You can configure whether an application secret is required, whether to enforce Proof Key for Code Exchange (PKCE), the access token validity period, and the refresh token validity period. The application scopes are generated by the platform by default. If SecretRequired is set to true, you must call CreateClientSecret to create a client secret.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a WorkloadIdentity.</p>
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
     * <p>Create a workload identity for an AI Agent to uniquely identify it.</p>
     * 
     * @param tmpReq CreateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWorkloadIdentityResponse
     */
    public CreateWorkloadIdentityResponse createWorkloadIdentityWithOptions(CreateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateWorkloadIdentityShrinkRequest request = new CreateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedConsentCallbackURLs)) {
            request.allowedConsentCallbackURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedConsentCallbackURLs, "AllowedConsentCallbackURLs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedConsentCallbackURLsShrink)) {
            body.put("AllowedConsentCallbackURLs", request.allowedConsentCallbackURLsShrink);
        }

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
     * <p>Create a workload identity for an AI Agent to uniquely identify it.</p>
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
     * <p>Deletes a specified API key credential provider.</p>
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
     * <p>Deletes a specified API key credential provider.</p>
     * 
     * @param request DeleteAPIKeyCredentialProviderRequest
     * @return DeleteAPIKeyCredentialProviderResponse
     */
    public DeleteAPIKeyCredentialProviderResponse deleteAPIKeyCredentialProvider(DeleteAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a specified client secret by client ID and key ID. The secret becomes invalid immediately after deletion, and all OAuth authentication flows that use this secret will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an identity provider.</p>
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
     * <b>description</b> :
     * <p>Deletes a specified client secret by client ID and key ID. The secret becomes invalid immediately after deletion, and all OAuth authentication flows that use this secret will fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an identity provider.</p>
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
     * <p>Deletes a specified identity provider.</p>
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
     * <p>Deletes a specified identity provider.</p>
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
     * <p>Deletes a specified OAuth 2.0 credential provider.</p>
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
     * <p>Deletes a specified OAuth 2.0 credential provider.</p>
     * 
     * @param request DeleteOAuth2CredentialProviderRequest
     * @return DeleteOAuth2CredentialProviderResponse
     */
    public DeleteOAuth2CredentialProviderResponse deleteOAuth2CredentialProvider(DeleteOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls DeletePolicy to remove a policy from a specified policy set. The policy becomes invalid immediately after deletion, and gateways that depend on the policy set do not need to be remounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access policy.</p>
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
     * <b>description</b> :
     * <p>Calls DeletePolicy to remove a policy from a specified policy set. The policy becomes invalid immediately after deletion, and gateways that depend on the policy set do not need to be remounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access policy.</p>
     * 
     * @param request DeletePolicyRequest
     * @return DeletePolicyResponse
     */
    public DeletePolicyResponse deletePolicy(DeletePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls DeletePolicySet to delete a policy set that is no longer in use.
     * Before deleting the policy set, ensure that it is unmounted from all gateways (you can query this by calling ListPolicySetAttachedGateways) and contains no policies. Otherwise, the deletion fails.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access policy set.</p>
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
     * <b>description</b> :
     * <p>Calls DeletePolicySet to delete a policy set that is no longer in use.
     * Before deleting the policy set, ensure that it is unmounted from all gateways (you can query this by calling ListPolicySetAttachedGateways) and contains no policies. Otherwise, the deletion fails.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access policy set.</p>
     * 
     * @param request DeletePolicySetRequest
     * @return DeletePolicySetResponse
     */
    public DeletePolicySetResponse deletePolicySet(DeletePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePolicySetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before deletion, the system checks whether the role has any bound users. If role assignments exist, the deletion is rejected. You must call DeleteRoleAssignment to remove the assignments before deleting the role. Default roles (Type=Default) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a role.</p>
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
     * <b>description</b> :
     * <p>Before deletion, the system checks whether the role has any bound users. If role assignments exist, the deletion is rejected. You must call DeleteRoleAssignment to remove the assignments before deleting the role. Default roles (Type=Default) cannot be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a role.</p>
     * 
     * @param request DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Removes the role assignment relationship between an identity and a role.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a policy set from a gateway.</p>
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
     * <b>description</b> :
     * <p>Removes the role assignment relationship between an identity and a role.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a policy set from a gateway.</p>
     * 
     * @param request DeleteRoleAssignmentRequest
     * @return DeleteRoleAssignmentResponse
     */
    public DeleteRoleAssignmentResponse deleteRoleAssignment(DeleteRoleAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRoleAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Cleans up expired or unused certificates after certificate rotation is complete. Before deleting the certificate, ensure that it is no longer used for SAML assertion signature verification. Otherwise, SSO logon may fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workload identity.</p>
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
     * <b>description</b> :
     * <p>Cleans up expired or unused certificates after certificate rotation is complete. Before deleting the certificate, ensure that it is no longer used for SAML assertion signature verification. Otherwise, SSO logon may fail.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a workload identity.</p>
     * 
     * @param request DeleteSAMLIdentityProviderCertificateRequest
     * @return DeleteSAMLIdentityProviderCertificateResponse
     */
    public DeleteSAMLIdentityProviderCertificateResponse deleteSAMLIdentityProviderCertificate(DeleteSAMLIdentityProviderCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSAMLIdentityProviderCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call DeleteTokenVault to delete a token vault that is no longer in use.
     * Before deletion, ensure that the token vault is not referenced by any credential provider. Otherwise, the deletion may cause credentials that depend on the token vault to become unavailable. This operation cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified token vault.</p>
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
     * <b>description</b> :
     * <p>Call DeleteTokenVault to delete a token vault that is no longer in use.
     * Before deletion, ensure that the token vault is not referenced by any credential provider. Otherwise, the deletion may cause credentials that depend on the token vault to become unavailable. This operation cannot be undone.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified token vault.</p>
     * 
     * @param request DeleteTokenVaultRequest
     * @return DeleteTokenVaultResponse
     */
    public DeleteTokenVaultResponse deleteTokenVault(DeleteTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deleting a user forcibly clears all role assignments of the user in the user pool. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
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
     * <b>description</b> :
     * <p>Deleting a user forcibly clears all role assignments of the user in the user pool. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user.</p>
     * 
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before deleting a user pool, you must clean up all resources in the user pool, including all users, roles, clients, SAML IdPs, and role assignments. Calls to this operation are rejected if the resources are not cleaned up. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user pool.</p>
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
     * <b>description</b> :
     * <p>Before deleting a user pool, you must clean up all resources in the user pool, including all users, roles, clients, SAML IdPs, and role assignments. Calls to this operation are rejected if the resources are not cleaned up. This operation is irreversible. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a user pool.</p>
     * 
     * @param request DeleteUserPoolRequest
     * @return DeleteUserPoolResponse
     */
    public DeleteUserPoolResponse deleteUserPool(DeleteUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deleting a client also removes all its associated client secrets. After deletion, the client can no longer be used for OAuth authentication and authorization flows. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a WorkloadIdentity.</p>
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
     * <b>description</b> :
     * <p>Deleting a client also removes all its associated client secrets. After deletion, the client can no longer be used for OAuth authentication and authorization flows. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a WorkloadIdentity.</p>
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
     * <p>Deletes a specified workload identity.</p>
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
     * <p>Deletes a specified workload identity.</p>
     * 
     * @param request DeleteWorkloadIdentityRequest
     * @return DeleteWorkloadIdentityResponse
     */
    public DeleteWorkloadIdentityResponse deleteWorkloadIdentity(DeleteWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWorkloadIdentityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Detaches a policy set from a gateway. After the policy set is detached, requests on the gateway are no longer governed by the policies in the policy set.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches a policy set from a gateway.</p>
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
     * <b>description</b> :
     * <p>Detaches a policy set from a gateway. After the policy set is detached, requests on the gateway are no longer governed by the policies in the policy set.</p>
     * 
     * <b>summary</b> : 
     * <p>Detaches a policy set from a gateway.</p>
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
     * <p>Retrieves the details of a specified API key credential provider.</p>
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
     * <p>Retrieves the details of a specified API key credential provider.</p>
     * 
     * @param request GetAPIKeyCredentialProviderRequest
     * @return GetAPIKeyCredentialProviderResponse
     */
    public GetAPIKeyCredentialProviderResponse getAPIKeyCredentialProvider(GetAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the GetGatewayPolicyConfig operation to query the currently effective policy configuration of a gateway, including the ARN of the mounted policy set and the enforcement mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the gateway policy configuration.</p>
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
     * <b>description</b> :
     * <p>Calls the GetGatewayPolicyConfig operation to query the currently effective policy configuration of a gateway, including the ARN of the mounted policy set and the enforcement mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the gateway policy configuration.</p>
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
     * <b>description</b> :
     * <p>目标用户池需已配置指定类型的身份源。本接口使用已保存的身份源配置，无需传入钉钉或飞书应用密钥。
     * 同步范围支持 AllAuthorized 和 SelectedDepartments。未显式配置范围时默认为 AllAuthorized，表示第三方应用授权可见范围内的全部用户。SelectedDepartments 包含选中部门及其全部后代部门；人员有任一当前所属部门命中展开集合，即命中同步范围。
     * 本接口不修改范围、不创建人员同步任务。查询可能触发后台统计；EstimateStatus 表示范围统计状态，不是人员同步任务状态。统计结果可能复用缓存，也可能来自同一范围最近一次同步结果；跨部门重复用户可能重复计数，不应视为实时、精确去重人数。
     * 对应身份源未配置时返回 EntityNotExists.IdpConfiguration；目录权限或通讯录可见范围不足时，返回 DingTalkApiPermissionDenied 或 FeishuApiPermissionDenied，不会将权限问题当作部门不存在。</p>
     * 
     * <b>summary</b> : 
     * <p>查询身份源同步范围与统计（已选部门有效性 + 展开部门数/预计人数）</p>
     * 
     * @param request GetIdentityProviderSyncScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderSyncScopeResponse
     */
    public GetIdentityProviderSyncScopeResponse getIdentityProviderSyncScopeWithOptions(GetIdentityProviderSyncScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            body.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderSyncScope"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderSyncScopeResponse());
    }

    /**
     * <b>description</b> :
     * <p>目标用户池需已配置指定类型的身份源。本接口使用已保存的身份源配置，无需传入钉钉或飞书应用密钥。
     * 同步范围支持 AllAuthorized 和 SelectedDepartments。未显式配置范围时默认为 AllAuthorized，表示第三方应用授权可见范围内的全部用户。SelectedDepartments 包含选中部门及其全部后代部门；人员有任一当前所属部门命中展开集合，即命中同步范围。
     * 本接口不修改范围、不创建人员同步任务。查询可能触发后台统计；EstimateStatus 表示范围统计状态，不是人员同步任务状态。统计结果可能复用缓存，也可能来自同一范围最近一次同步结果；跨部门重复用户可能重复计数，不应视为实时、精确去重人数。
     * 对应身份源未配置时返回 EntityNotExists.IdpConfiguration；目录权限或通讯录可见范围不足时，返回 DingTalkApiPermissionDenied 或 FeishuApiPermissionDenied，不会将权限问题当作部门不存在。</p>
     * 
     * <b>summary</b> : 
     * <p>查询身份源同步范围与统计（已选部门有效性 + 展开部门数/预计人数）</p>
     * 
     * @param request GetIdentityProviderSyncScopeRequest
     * @return GetIdentityProviderSyncScopeResponse
     */
    public GetIdentityProviderSyncScopeResponse getIdentityProviderSyncScope(GetIdentityProviderSyncScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderSyncScopeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the logon configuration and password policy of a specified user pool. The logon configuration includes preference settings such as whether to enable password logon. The password policy includes rules for password complexity, length limits, and logon failure lockouts. The password policy is read-only and does not support custom modifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the logon-related configurations of a user pool.</p>
     * 
     * @param request GetLoginPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginPreferenceResponse
     */
    public GetLoginPreferenceResponse getLoginPreferenceWithOptions(GetLoginPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginPreference"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginPreferenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves the logon configuration and password policy of a specified user pool. The logon configuration includes preference settings such as whether to enable password logon. The password policy includes rules for password complexity, length limits, and logon failure lockouts. The password policy is read-only and does not support custom modifications.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the logon-related configurations of a user pool.</p>
     * 
     * @param request GetLoginPreferenceRequest
     * @return GetLoginPreferenceResponse
     */
    public GetLoginPreferenceResponse getLoginPreference(GetLoginPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified OAuth 2.0 credential provider.</p>
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
     * <p>Retrieves the details of a specified OAuth 2.0 credential provider.</p>
     * 
     * @param request GetOAuth2CredentialProviderRequest
     * @return GetOAuth2CredentialProviderResponse
     */
    public GetOAuth2CredentialProviderResponse getOAuth2CredentialProvider(GetOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls GetPolicy to retrieve the complete configuration of a single policy, including its definition, associated policy set, and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an access policy.</p>
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
     * <b>description</b> :
     * <p>Calls GetPolicy to retrieve the complete configuration of a single policy, including its definition, associated policy set, and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an access policy.</p>
     * 
     * @param request GetPolicyRequest
     * @return GetPolicyResponse
     */
    public GetPolicyResponse getPolicy(GetPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls GetPolicySet to query the complete configuration of a single policy set, including the ARN, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an access policy set.</p>
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
     * <b>description</b> :
     * <p>Calls GetPolicySet to query the complete configuration of a single policy set, including the ARN, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries an access policy set.</p>
     * 
     * @param request GetPolicySetRequest
     * @return GetPolicySetResponse
     */
    public GetPolicySetResponse getPolicySet(GetPolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPolicySetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the complete information about a specified role, including the role ID, name, description, type (Default or Manual), and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a role.</p>
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
     * <b>description</b> :
     * <p>Returns the complete information about a specified role, including the role ID, name, description, type (Default or Manual), and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a role.</p>
     * 
     * @param request GetRoleRequest
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration of the SAML IdP, including the EntityId, logon URL, X509 certificate list, and the enabling status of SSO and JIT synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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
     * <b>description</b> :
     * <p>Returns the complete configuration of the SAML IdP, including the EntityId, logon URL, X509 certificate list, and the enabling status of SSO and JIT synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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
     * <b>description</b> :
     * <p>Queries the SSO configuration of a specific type of identity provider in a specified user pool. Returns information such as the enabling status, synchronization callback status, and metadata of the IdP. For security reasons, sensitive fields such as appSecret, encryptKey, and verificationToken are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the specified identity provider.</p>
     * 
     * @param request GetSpecificIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSpecificIdentityProviderResponse
     */
    public GetSpecificIdentityProviderResponse getSpecificIdentityProviderWithOptions(GetSpecificIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            body.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSpecificIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSpecificIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the SSO configuration of a specific type of identity provider in a specified user pool. Returns information such as the enabling status, synchronization callback status, and metadata of the IdP. For security reasons, sensitive fields such as appSecret, encryptKey, and verificationToken are not returned in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the specified identity provider.</p>
     * 
     * @param request GetSpecificIdentityProviderRequest
     * @return GetSpecificIdentityProviderResponse
     */
    public GetSpecificIdentityProviderResponse getSpecificIdentityProvider(GetSpecificIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSpecificIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls GetTokenVault to retrieve the complete configuration of a single token vault, including the encryption method, associated RAM role ARN, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration of a specified token vault.</p>
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
     * <b>description</b> :
     * <p>Calls GetTokenVault to retrieve the complete configuration of a single token vault, including the encryption method, associated RAM role ARN, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the detailed configuration of a specified token vault.</p>
     * 
     * @param request GetTokenVaultRequest
     * @return GetTokenVaultResponse
     */
    public GetTokenVaultResponse getTokenVault(GetTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the complete information of a specified user, including the user ID, username, display name, description, and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a user.</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolId)) {
            body.put("UserPoolId", request.userPoolId);
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
     * <b>description</b> :
     * <p>Returns the complete information of a specified user, including the user ID, username, display name, description, and creation and update times.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a user.</p>
     * 
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration information of a specified user pool, including the user pool ID, name, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a user pool.</p>
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
     * <b>description</b> :
     * <p>Returns the complete configuration information of a specified user pool, including the user pool ID, name, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a user pool.</p>
     * 
     * @param request GetUserPoolRequest
     * @return GetUserPoolResponse
     */
    public GetUserPoolResponse getUserPool(GetUserPoolRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPoolWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the complete configuration information of a client, including the client ID, name, redirect URIs, token validity periods, SecretRequired and EnforcePKCE settings, and default client scopes.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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
     * <b>description</b> :
     * <p>Returns the complete configuration information of a client, including the client ID, name, redirect URIs, token validity periods, SecretRequired and EnforcePKCE settings, and default client scopes.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param request GetUserPoolClientRequest
     * @return GetUserPoolClientResponse
     */
    public GetUserPoolClientResponse getUserPoolClient(GetUserPoolClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPoolClientWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution details of a single synchronization task in a specified user pool, including the task status, start and end times, synchronization result statistics (the number of created, updated, deleted, and unchanged users), and error messages.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a synchronization task in a user pool.</p>
     * 
     * @param request GetUserPoolSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserPoolSyncJobResponse
     */
    public GetUserPoolSyncJobResponse getUserPoolSyncJobWithOptions(GetUserPoolSyncJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            body.put("SynchronizationJobId", request.synchronizationJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserPoolSyncJob"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserPoolSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the execution details of a single synchronization task in a specified user pool, including the task status, start and end times, synchronization result statistics (the number of created, updated, deleted, and unchanged users), and error messages.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the details of a synchronization task in a user pool.</p>
     * 
     * @param request GetUserPoolSyncJobRequest
     * @return GetUserPoolSyncJobResponse
     */
    public GetUserPoolSyncJobResponse getUserPoolSyncJob(GetUserPoolSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserPoolSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed configuration of a workload identity by name.</p>
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
     * <p>Queries the detailed configuration of a workload identity by name.</p>
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
     * <p>Lists all API key credential providers in the account.</p>
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
     * <p>Lists all API key credential providers in the account.</p>
     * 
     * @param request ListAPIKeyCredentialProvidersRequest
     * @return ListAPIKeyCredentialProvidersResponse
     */
    public ListAPIKeyCredentialProvidersResponse listAPIKeyCredentialProviders(ListAPIKeyCredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAPIKeyCredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns summary information about all secrets of a client, including the client key ID and creation time. For security reasons, the plaintext secret (ClientSecretValue) is not returned in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all secrets of a client, including the client key ID and creation time. For security reasons, the plaintext secret (ClientSecretValue) is not returned in the list.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
     * 
     * @param request ListClientSecretsRequest
     * @return ListClientSecretsResponse
     */
    public ListClientSecretsResponse listClientSecrets(ListClientSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientSecretsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>用户池需已配置相应身份源，且应用具有目标部门的通讯录访问权限。本接口使用已保存的身份源配置，无需传入应用密钥。
     * 本接口仅返回指定父部门的直属子部门，不包含父部门本身，不递归返回整棵部门树。未传父部门时，钉钉默认查询根部门1下的直属子部门，飞书默认查询根部门0下的直属子部门。部门浏览受应用授权可见范围限制，不受当前保存的同步范围限制。
     * 本接口不修改同步范围，不触发人员同步。</p>
     * 
     * <b>summary</b> : 
     * <p>查询身份源部门树（按层懒加载，供控制台勾选同步范围）</p>
     * 
     * @param request ListIdentityProviderDepartmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProviderDepartmentsResponse
     */
    public ListIdentityProviderDepartmentsResponse listIdentityProviderDepartmentsWithOptions(ListIdentityProviderDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            body.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentDepartmentId)) {
            body.put("ParentDepartmentId", request.parentDepartmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviderDepartments"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProviderDepartmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>用户池需已配置相应身份源，且应用具有目标部门的通讯录访问权限。本接口使用已保存的身份源配置，无需传入应用密钥。
     * 本接口仅返回指定父部门的直属子部门，不包含父部门本身，不递归返回整棵部门树。未传父部门时，钉钉默认查询根部门1下的直属子部门，飞书默认查询根部门0下的直属子部门。部门浏览受应用授权可见范围限制，不受当前保存的同步范围限制。
     * 本接口不修改同步范围，不触发人员同步。</p>
     * 
     * <b>summary</b> : 
     * <p>查询身份源部门树（按层懒加载，供控制台勾选同步范围）</p>
     * 
     * @param request ListIdentityProviderDepartmentsRequest
     * @return ListIdentityProviderDepartmentsResponse
     */
    public ListIdentityProviderDepartmentsResponse listIdentityProviderDepartments(ListIdentityProviderDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentityProviderDepartmentsWithOptions(request, runtime);
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
     * <p>Lists all OAuth 2.0 credential providers in the account.</p>
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
     * <p>Lists all OAuth 2.0 credential providers in the account.</p>
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
     * <b>description</b> :
     * <p>Calls ListPolicySetAttachedGateways to query the gateways to which a specific policy set is currently attached. Call this operation before deleting a policy set to verify that no residual attachments exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists gateway policy configurations.</p>
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
     * <b>description</b> :
     * <p>Calls ListPolicySetAttachedGateways to query the gateways to which a specific policy set is currently attached. Call this operation before deleting a policy set to verify that no residual attachments exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists gateway policy configurations.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all roles in a user pool, including the default role Default and custom roles Manual. The information includes the role ID, name, description, creation time, update time, and role type.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists roles.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all roles in a user pool, including the default role Default and custom roles Manual. The information includes the role ID, name, description, creation time, update time, and role type.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists roles.</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns a list of all X.509 certificates under the SAML IdP configuration of the user pool to help administrators manage the certificate lifecycle and perform certificate rotation.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * <b>description</b> :
     * <p>Returns a list of all X.509 certificates under the SAML IdP configuration of the user pool to help administrators manage the certificate lifecycle and perform certificate rotation.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all clients in a user pool, including the client ID, name, redirect URIs, creation time, and configurations such as PKCE, client secret, and token validity periods.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all clients in a user pool, including the client ID, name, redirect URIs, creation time, and configurations such as PKCE, client secret, and token validity periods.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * @param request ListUserPoolSyncJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPoolSyncJobsResponse
     */
    public ListUserPoolSyncJobsResponse listUserPoolSyncJobsWithOptions(ListUserPoolSyncJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListUserPoolSyncJobs"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPoolSyncJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列出IdentityProvider</p>
     * 
     * @param request ListUserPoolSyncJobsRequest
     * @return ListUserPoolSyncJobsResponse
     */
    public ListUserPoolSyncJobsResponse listUserPoolSyncJobs(ListUserPoolSyncJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPoolSyncJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns summary information about all user pools within the current account, including the user pool ID, name, description, and creation and update times. Supports pagination by using NextToken.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
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
     * <b>description</b> :
     * <p>Returns summary information about all user pools within the current account, including the user pool ID, name, description, and creation and update times. Supports pagination by using NextToken.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists identity providers.</p>
     * 
     * @param request ListUserPoolsRequest
     * @return ListUserPoolsResponse
     */
    public ListUserPoolsResponse listUserPools(ListUserPoolsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPoolsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Returns the summary information of all users in a user pool, including the user ID, username, display name, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists users.</p>
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
     * <b>description</b> :
     * <p>Returns the summary information of all users in a user pool, including the user ID, username, display name, description, creation time, and update time.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists users.</p>
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
     * <p>Lists workload identities with pagination.</p>
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
     * <p>Lists workload identities with pagination.</p>
     * 
     * @param request ListWorkloadIdentitiesRequest
     * @return ListWorkloadIdentitiesResponse
     */
    public ListWorkloadIdentitiesResponse listWorkloadIdentities(ListWorkloadIdentitiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkloadIdentitiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates and immediately executes a user synchronization task in a specified user pool. The system pulls user data from the specified identity provider and synchronizes the data to the user pool. The task runs asynchronously. The operation completes after the task ID is returned. You can call GetUserPoolSyncJob to query the execution progress and results. Only one synchronization task can run in a user pool at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a user synchronization task in a user pool.</p>
     * 
     * @param request RunUserPoolSyncJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunUserPoolSyncJobResponse
     */
    public RunUserPoolSyncJobResponse runUserPoolSyncJobWithOptions(RunUserPoolSyncJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            body.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxSyncUsers)) {
            body.put("MaxSyncUsers", request.maxSyncUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunUserPoolSyncJob"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunUserPoolSyncJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates and immediately executes a user synchronization task in a specified user pool. The system pulls user data from the specified identity provider and synchronizes the data to the user pool. The task runs asynchronously. The operation completes after the task ID is returned. You can call GetUserPoolSyncJob to query the execution progress and results. Only one synchronization task can run in a user pool at a time.</p>
     * 
     * <b>summary</b> : 
     * <p>Triggers a user synchronization task in a user pool.</p>
     * 
     * @param request RunUserPoolSyncJobRequest
     * @return RunUserPoolSyncJobResponse
     */
    public RunUserPoolSyncJobResponse runUserPoolSyncJob(RunUserPoolSyncJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runUserPoolSyncJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation sets or updates the core configurations of a SAML identity provider (IdP), including the IdP identifier (EntityId), logon URL (LoginURL), X.509 certificates, single sign-on (SSO) status, and Just-In-Time (JIT) user provisioning and update settings. If you specify X509Certificates, all existing certificates in the user pool are replaced. To append certificates while retaining the existing ones, use AddSAMLIdentityProviderCertificate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workload identity.</p>
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
     * <b>description</b> :
     * <p>This operation sets or updates the core configurations of a SAML identity provider (IdP), including the IdP identifier (EntityId), logon URL (LoginURL), X.509 certificates, single sign-on (SSO) status, and Just-In-Time (JIT) user provisioning and update settings. If you specify X509Certificates, all existing certificates in the user pool are replaced. To append certificates while retaining the existing ones, use AddSAMLIdentityProviderCertificate.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a workload identity.</p>
     * 
     * @param request SetSAMLIdentityProviderRequest
     * @return SetSAMLIdentityProviderResponse
     */
    public SetSAMLIdentityProviderResponse setSAMLIdentityProvider(SetSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Configures a specific type of identity provider for a specified user pool. This operation is used to configure SSO logon and address book synchronization for non-SAML IdPs such as DingTalk. A user pool does not support enabling multiple identity providers at the same time. You must disable other enabled IdPs before enabling a new IdP.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the SSO settings for a specified type of identity provider in a user pool.</p>
     * 
     * @param request SetSpecificIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSpecificIdentityProviderResponse
     */
    public SetSpecificIdentityProviderResponse setSpecificIdentityProviderWithOptions(SetSpecificIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.IDPMetadata)) {
            body.put("IDPMetadata", request.IDPMetadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            body.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSOStatus)) {
            body.put("SSOStatus", request.SSOStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSpecificIdentityProvider"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSpecificIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>Configures a specific type of identity provider for a specified user pool. This operation is used to configure SSO logon and address book synchronization for non-SAML IdPs such as DingTalk. A user pool does not support enabling multiple identity providers at the same time. You must disable other enabled IdPs before enabling a new IdP.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the SSO settings for a specified type of identity provider in a user pool.</p>
     * 
     * @param request SetSpecificIdentityProviderRequest
     * @return SetSpecificIdentityProviderResponse
     */
    public SetSpecificIdentityProviderResponse setSpecificIdentityProvider(SetSpecificIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSpecificIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Sets or resets the logon password for a user in a specified user pool. Two methods are supported: specifying a password (Password) or generating a random password (GenerateRandomPassword). The two methods are mutually exclusive, and you must select exactly one. If you specify a password, it must meet the password policy requirements: a minimum length of 8 characters, containing at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters, and it must not contain the username. Passwords are managed independently of the user creation process and are not passed through CreateUser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon password of a user.</p>
     * 
     * @param request SetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserPasswordResponse
     */
    public SetUserPasswordResponse setUserPasswordWithOptions(SetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.generateRandomPassword)) {
            body.put("GenerateRandomPassword", request.generateRandomPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

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
            new TeaPair("action", "SetUserPassword"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>Sets or resets the logon password for a user in a specified user pool. Two methods are supported: specifying a password (Password) or generating a random password (GenerateRandomPassword). The two methods are mutually exclusive, and you must select exactly one. If you specify a password, it must meet the password policy requirements: a minimum length of 8 characters, containing at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters, and it must not contain the username. Passwords are managed independently of the user creation process and are not passed through CreateUser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the logon password of a user.</p>
     * 
     * @param request SetUserPasswordRequest
     * @return SetUserPasswordResponse
     */
    public SetUserPasswordResponse setUserPassword(SetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an existing API key credential provider.</p>
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
     * <p>Updates an existing API key credential provider.</p>
     * 
     * @param request UpdateAPIKeyCredentialProviderRequest
     * @return UpdateAPIKeyCredentialProviderResponse
     */
    public UpdateAPIKeyCredentialProviderResponse updateAPIKeyCredentialProvider(UpdateAPIKeyCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAPIKeyCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdateGatewayPolicyConfig to adjust the policy enforcement mode on a gateway. Common usage: Use LOG_ONLY for observation and verification during the initial rollout of a policy. After confirming that everything is correct, switch the gateway to ENFORCE to enforce interception. This operation does not modify the attached policy set itself. To replace the policy set, call AttachPolicySetToGateway.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the gateway policy configuration.</p>
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
     * <b>description</b> :
     * <p>Calls UpdateGatewayPolicyConfig to adjust the policy enforcement mode on a gateway. Common usage: Use LOG_ONLY for observation and verification during the initial rollout of a policy. After confirming that everything is correct, switch the gateway to ENFORCE to enforce interception. This operation does not modify the attached policy set itself. To replace the policy set, call AttachPolicySetToGateway.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the gateway policy configuration.</p>
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
     * <p>Updates the specified identity provider.</p>
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
     * <p>Updates the specified identity provider.</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProvider(UpdateIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the logon configuration of a specified user pool. Currently, only logon preferences, such as whether password logon is enabled, can be updated. The password policy cannot be modified. Specify only the fields to be updated. Unspecified fields remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the logon configuration of a user pool.</p>
     * 
     * @param tmpReq UpdateLoginPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoginPreferenceResponse
     */
    public UpdateLoginPreferenceResponse updateLoginPreferenceWithOptions(UpdateLoginPreferenceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLoginPreferenceShrinkRequest request = new UpdateLoginPreferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedPostLogoutRedirectUris)) {
            request.allowedPostLogoutRedirectUrisShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedPostLogoutRedirectUris, "AllowedPostLogoutRedirectUris", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.loginPreference)) {
            request.loginPreferenceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.loginPreference, "LoginPreference", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedPostLogoutRedirectUrisShrink)) {
            query.put("AllowedPostLogoutRedirectUris", request.allowedPostLogoutRedirectUrisShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPreferenceShrink)) {
            query.put("LoginPreference", request.loginPreferenceShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPoolName)) {
            body.put("UserPoolName", request.userPoolName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoginPreference"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoginPreferenceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the logon configuration of a specified user pool. Currently, only logon preferences, such as whether password logon is enabled, can be updated. The password policy cannot be modified. Specify only the fields to be updated. Unspecified fields remain unchanged.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the logon configuration of a user pool.</p>
     * 
     * @param request UpdateLoginPreferenceRequest
     * @return UpdateLoginPreferenceResponse
     */
    public UpdateLoginPreferenceResponse updateLoginPreference(UpdateLoginPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoginPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an existing OAuth 2.0 credential provider.</p>
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
     * <p>Updates the configuration of an existing OAuth 2.0 credential provider.</p>
     * 
     * @param request UpdateOAuth2CredentialProviderRequest
     * @return UpdateOAuth2CredentialProviderResponse
     */
    public UpdateOAuth2CredentialProviderResponse updateOAuth2CredentialProvider(UpdateOAuth2CredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOAuth2CredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls the UpdatePolicy operation to update the description and definition of an existing policy. The updated definition takes effect immediately for all gateways to which the policy set is mounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access policy.</p>
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
     * <b>description</b> :
     * <p>Calls the UpdatePolicy operation to update the description and definition of an existing policy. The updated definition takes effect immediately for all gateways to which the policy set is mounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access policy.</p>
     * 
     * @param request UpdatePolicyRequest
     * @return UpdatePolicyResponse
     */
    public UpdatePolicyResponse updatePolicy(UpdatePolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Calls UpdatePolicySet to update the description of an existing policy set. To modify specific policies in the policy set, use UpdatePolicy. To change the mount relationship, use AttachPolicySetToGateway or DetachPolicySetFromGateway.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access policy set.</p>
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
     * <b>description</b> :
     * <p>Calls UpdatePolicySet to update the description of an existing policy set. To modify specific policies in the policy set, use UpdatePolicy. To change the mount relationship, use AttachPolicySetToGateway or DetachPolicySetFromGateway.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates an access policy set.</p>
     * 
     * @param request UpdatePolicySetRequest
     * @return UpdatePolicySetResponse
     */
    public UpdatePolicySetResponse updatePolicySet(UpdatePolicySetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePolicySetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the Description field of a role. The RoleName field serves as a unique identifier and cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a role.</p>
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
     * <b>description</b> :
     * <p>Updates the Description field of a role. The RoleName field serves as a unique identifier and cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a role.</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the description and role configuration of an existing token vault. Note: The encryption configuration (KeyType or KmsKeyArn) of a token vault cannot be changed after it is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a token vault.</p>
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
     * <b>description</b> :
     * <p>Updates the description and role configuration of an existing token vault. Note: The encryption configuration (KeyType or KmsKeyArn) of a token vault cannot be changed after it is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a token vault.</p>
     * 
     * @param request UpdateTokenVaultRequest
     * @return UpdateTokenVaultResponse
     */
    public UpdateTokenVaultResponse updateTokenVault(UpdateTokenVaultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTokenVaultWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the attribute information of a user in a specified user pool. Specify only the fields that you want to update. Unspecified fields remain unchanged. UserName is the user identifier and cannot be modified. You can update the display name, description, email address, and status. Email addresses must be unique within the user pool.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a user in a user pool.</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

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
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2025-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the attribute information of a user in a specified user pool. Specify only the fields that you want to update. Unspecified fields remain unchanged. UserName is the user identifier and cannot be modified. You can update the display name, description, email address, and status. Email addresses must be unique within the user pool.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a user in a user pool.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>Updates the callback URLs (RedirectURIs), whether an application secret is required (SecretRequired), whether Proof Key for Code Exchange (PKCE) is enforced (EnforcePKCE), and the validity periods of the access token and refresh token. The client name (ClientName) serves as a unique identifier and cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scopes)) {
            request.scopesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scopes, "Scopes", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.scopesShrink)) {
            body.put("Scopes", request.scopesShrink);
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
     * <b>description</b> :
     * <p>Updates the callback URLs (RedirectURIs), whether an application secret is required (SecretRequired), whether Proof Key for Code Exchange (PKCE) is enforced (EnforcePKCE), and the validity periods of the access token and refresh token. The client name (ClientName) serves as a unique identifier and cannot be modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application.</p>
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
     * <p>Updates the specified workload identity.</p>
     * 
     * @param tmpReq UpdateWorkloadIdentityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentityWithOptions(UpdateWorkloadIdentityRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateWorkloadIdentityShrinkRequest request = new UpdateWorkloadIdentityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedConsentCallbackURLs)) {
            request.allowedConsentCallbackURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedConsentCallbackURLs, "AllowedConsentCallbackURLs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.allowedResourceOAuth2ReturnURLs)) {
            request.allowedResourceOAuth2ReturnURLsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.allowedResourceOAuth2ReturnURLs, "AllowedResourceOAuth2ReturnURLs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowedConsentCallbackURLsShrink)) {
            body.put("AllowedConsentCallbackURLs", request.allowedConsentCallbackURLsShrink);
        }

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
     * <p>Updates the specified workload identity.</p>
     * 
     * @param request UpdateWorkloadIdentityRequest
     * @return UpdateWorkloadIdentityResponse
     */
    public UpdateWorkloadIdentityResponse updateWorkloadIdentity(UpdateWorkloadIdentityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWorkloadIdentityWithOptions(request, runtime);
    }
}
