// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815;

import com.aliyun.tea.*;
import com.aliyun.ims20190815.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ims", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Adds a client ID to an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request AddClientIdToOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddClientIdToOIDCProviderResponse
     */
    public AddClientIdToOIDCProviderResponse addClientIdToOIDCProviderWithOptions(AddClientIdToOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddClientIdToOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddClientIdToOIDCProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a client ID to an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request AddClientIdToOIDCProviderRequest
     * @return AddClientIdToOIDCProviderResponse
     */
    public AddClientIdToOIDCProviderResponse addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addClientIdToOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to add the fingerprint <code>902ef2deeb3c5b13ea4c3d5193629309e231****</code> to the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a fingerprint to an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request AddFingerprintToOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddFingerprintToOIDCProviderResponse
     */
    public AddFingerprintToOIDCProviderResponse addFingerprintToOIDCProviderWithOptions(AddFingerprintToOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fingerprint)) {
            query.put("Fingerprint", request.fingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddFingerprintToOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddFingerprintToOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to add the fingerprint <code>902ef2deeb3c5b13ea4c3d5193629309e231****</code> to the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a fingerprint to an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request AddFingerprintToOIDCProviderRequest
     * @return AddFingerprintToOIDCProviderResponse
     */
    public AddFingerprintToOIDCProviderResponse addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addFingerprintToOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将RAM用户添加到指定的用户组</p>
     * 
     * @param request AddUserToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToGroupResponse
     */
    public AddUserToGroupResponse addUserToGroupWithOptions(AddUserToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将RAM用户添加到指定的用户组</p>
     * 
     * @param request AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a multi-factor authentication (MFA) device to a RAM user.</p>
     * 
     * @param request BindMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindMFADeviceResponse
     */
    public BindMFADeviceResponse bindMFADeviceWithOptions(BindMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationCode1)) {
            query.put("AuthenticationCode1", request.authenticationCode1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authenticationCode2)) {
            query.put("AuthenticationCode2", request.authenticationCode2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindMFADevice"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindMFADeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a multi-factor authentication (MFA) device to a RAM user.</p>
     * 
     * @param request BindMFADeviceRequest
     * @return BindMFADeviceResponse
     */
    public BindMFADeviceResponse bindMFADevice(BindMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for RAM users. Before you call this operation, make sure that <code>AllowUserToChangePassword</code> in <a href="https://help.aliyun.com/document_detail/43765.html">SetSecurityPreference</a> is set to <code>True</code>. The value True indicates that RAM users can change their passwords.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>修改RAM用户的登录密码</p>
     * 
     * @param request ChangePasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangePasswordResponse
     */
    public ChangePasswordResponse changePasswordWithOptions(ChangePasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            query.put("NewPassword", request.newPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldPassword)) {
            query.put("OldPassword", request.oldPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangePassword"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangePasswordResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is available only for RAM users. Before you call this operation, make sure that <code>AllowUserToChangePassword</code> in <a href="https://help.aliyun.com/document_detail/43765.html">SetSecurityPreference</a> is set to <code>True</code>. The value True indicates that RAM users can change their passwords.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>修改RAM用户的登录密码</p>
     * 
     * @param request ChangePasswordRequest
     * @return ChangePasswordResponse
     */
    public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changePasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建主账号或RAM用户访问密钥</p>
     * 
     * @param request CreateAccessKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessKeyResponse
     */
    public CreateAccessKeyResponse createAccessKeyWithOptions(CreateAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessKey"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建主账号或RAM用户访问密钥</p>
     * 
     * @param request CreateAccessKeyRequest
     * @return CreateAccessKeyResponse
     */
    public CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application secret for the specified application.</p>
     * 
     * @param request CreateAppSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppSecretResponse
     */
    public CreateAppSecretResponse createAppSecretWithOptions(CreateAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppSecret"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application secret for the specified application.</p>
     * 
     * @param request CreateAppSecretRequest
     * @return CreateAppSecretResponse
     */
    public CreateAppSecretResponse createAppSecret(CreateAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param request CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessTokenValidity)) {
            query.put("AccessTokenValidity", request.accessTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isMultiTenant)) {
            query.put("IsMultiTenant", request.isMultiTenant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.predefinedScopes)) {
            query.put("PredefinedScopes", request.predefinedScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUris)) {
            query.put("RedirectUris", request.redirectUris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshTokenValidity)) {
            query.put("RefreshTokenValidity", request.refreshTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requiredScopes)) {
            query.put("RequiredScopes", request.requiredScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretRequired)) {
            query.put("SecretRequired", request.secretRequired);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application.</p>
     * 
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a RAM user group.</p>
     * 
     * @param request CreateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a RAM user group.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启指定RAM用户的控制台登录</p>
     * 
     * @param request CreateLoginProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoginProfileResponse
     */
    public CreateLoginProfileResponse createLoginProfileWithOptions(CreateLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.MFABindRequired)) {
            query.put("MFABindRequired", request.MFABindRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordResetRequired)) {
            query.put("PasswordResetRequired", request.passwordResetRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoginProfile"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoginProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启指定RAM用户的控制台登录</p>
     * 
     * @param request CreateLoginProfileRequest
     * @return CreateLoginProfileResponse
     */
    public CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoginProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the information such as the URL of the issuer, the fingerprints of HTTPS certificates, and the client IDs are obtained from an external (IdP, such as Google G Suite or Okta.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>You can create a maximum of 100 OIDC IdPs in an Alibaba Cloud account.</li>
     * <li>You can add a maximum of 20 client IDs to an OIDC IdP.</li>
     * <li>You can add a maximum of five fingerprints to an OIDC IdP.</li>
     * </ul>
     * <h3></h3>
     * <p>This topic provides an example on how to create an IdP named <code>TestOIDCProvider</code> to configure a trust relationship between the external IdP and Alibaba Cloud.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an OpenID Connect (OIDC) identity provider (IdP) to configure a trust relationship between Alibaba Cloud and an external IdP. This topic provides an example on how to create an IdP named TestOIDCProvider to configure a trust relationship between the external IdP Okta and Alibaba Cloud.</p>
     * 
     * @param request CreateOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOIDCProviderResponse
     */
    public CreateOIDCProviderResponse createOIDCProviderWithOptions(CreateOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("ClientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fingerprints)) {
            query.put("Fingerprints", request.fingerprints);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuanceLimitTime)) {
            query.put("IssuanceLimitTime", request.issuanceLimitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuerUrl)) {
            query.put("IssuerUrl", request.issuerUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>Before you call this operation, make sure that the information such as the URL of the issuer, the fingerprints of HTTPS certificates, and the client IDs are obtained from an external (IdP, such as Google G Suite or Okta.</p>
     * <h3>Limits</h3>
     * <ul>
     * <li>You can create a maximum of 100 OIDC IdPs in an Alibaba Cloud account.</li>
     * <li>You can add a maximum of 20 client IDs to an OIDC IdP.</li>
     * <li>You can add a maximum of five fingerprints to an OIDC IdP.</li>
     * </ul>
     * <h3></h3>
     * <p>This topic provides an example on how to create an IdP named <code>TestOIDCProvider</code> to configure a trust relationship between the external IdP and Alibaba Cloud.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an OpenID Connect (OIDC) identity provider (IdP) to configure a trust relationship between Alibaba Cloud and an external IdP. This topic provides an example on how to create an IdP named TestOIDCProvider to configure a trust relationship between the external IdP Okta and Alibaba Cloud.</p>
     * 
     * @param request CreateOIDCProviderRequest
     * @return CreateOIDCProviderResponse
     */
    public CreateOIDCProviderResponse createOIDCProvider(CreateOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建角色SSO身份提供商</p>
     * 
     * @param request CreateSAMLProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSAMLProviderResponse
     */
    public CreateSAMLProviderResponse createSAMLProviderWithOptions(CreateSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodedSAMLMetadataDocument)) {
            query.put("EncodedSAMLMetadataDocument", request.encodedSAMLMetadataDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSAMLProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSAMLProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建角色SSO身份提供商</p>
     * 
     * @param request CreateSAMLProviderRequest
     * @return CreateSAMLProviderResponse
     */
    public CreateSAMLProviderResponse createSAMLProvider(CreateSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSAMLProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a RAM user named <code>test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a RAM user.</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comments)) {
            query.put("Comments", request.comments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobilePhone)) {
            query.put("MobilePhone", request.mobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2019-08-15"),
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
     * <p>This topic provides an example on how to create a RAM user named <code>test</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a RAM user.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建多因素认证设备</p>
     * 
     * @param request CreateVirtualMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVirtualMFADeviceResponse
     */
    public CreateVirtualMFADeviceResponse createVirtualMFADeviceWithOptions(CreateVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.virtualMFADeviceName)) {
            query.put("VirtualMFADeviceName", request.virtualMFADeviceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVirtualMFADevice"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVirtualMFADeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建多因素认证设备</p>
     * 
     * @param request CreateVirtualMFADeviceRequest
     * @return CreateVirtualMFADeviceResponse
     */
    public CreateVirtualMFADeviceResponse createVirtualMFADevice(CreateVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVirtualMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的访问密钥</p>
     * 
     * @param request DeleteAccessKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessKeyResponse
     */
    public DeleteAccessKeyResponse deleteAccessKeyWithOptions(DeleteAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessKey"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除用户的访问密钥</p>
     * 
     * @param request DeleteAccessKeyRequest
     * @return DeleteAccessKeyResponse
     */
    public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the application secret for the specified application.</p>
     * 
     * @param request DeleteAppSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppSecretResponse
     */
    public DeleteAppSecretResponse deleteAppSecretWithOptions(DeleteAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecretId)) {
            query.put("AppSecretId", request.appSecretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppSecret"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the application secret for the specified application.</p>
     * 
     * @param request DeleteAppSecretRequest
     * @return DeleteAppSecretResponse
     */
    public DeleteAppSecretResponse deleteAppSecret(DeleteAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
     * 
     * @param request DeleteApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application.</p>
     * 
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>删除指定的用户组</p>
     * 
     * @param request DeleteGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a RAM user group, make sure that no policies are attached to the group and no RAM users are included in the group.</p>
     * 
     * <b>summary</b> : 
     * <p>删除指定的用户组</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>关闭指定RAM用户的控制台登录</p>
     * 
     * @param request DeleteLoginProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoginProfileResponse
     */
    public DeleteLoginProfileResponse deleteLoginProfileWithOptions(DeleteLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoginProfile"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoginProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>关闭指定RAM用户的控制台登录</p>
     * 
     * @param request DeleteLoginProfileRequest
     * @return DeleteLoginProfileResponse
     */
    public DeleteLoginProfileResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoginProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request DeleteOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOIDCProviderResponse
     */
    public DeleteOIDCProviderResponse deleteOIDCProviderWithOptions(DeleteOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request DeleteOIDCProviderRequest
     * @return DeleteOIDCProviderResponse
     */
    public DeleteOIDCProviderResponse deleteOIDCProvider(DeleteOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的角色SSO身份提供商</p>
     * 
     * @param request DeleteSAMLProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSAMLProviderResponse
     */
    public DeleteSAMLProviderResponse deleteSAMLProviderWithOptions(DeleteSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSAMLProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSAMLProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定的角色SSO身份提供商</p>
     * 
     * @param request DeleteSAMLProviderRequest
     * @return DeleteSAMLProviderResponse
     */
    public DeleteSAMLProviderResponse deleteSAMLProvider(DeleteSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSAMLProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除RAM用户</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2019-08-15"),
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
     * <p>删除RAM用户</p>
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
     * <p>删除多因素认证设备</p>
     * 
     * @param request DeleteVirtualMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVirtualMFADeviceResponse
     */
    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVirtualMFADevice"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVirtualMFADeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除多因素认证设备</p>
     * 
     * @param request DeleteVirtualMFADeviceRequest
     * @return DeleteVirtualMFADeviceResponse
     */
    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑并删除多因素认证设备</p>
     * 
     * @param request DisableVirtualMFARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableVirtualMFAResponse
     */
    public DisableVirtualMFAResponse disableVirtualMFAWithOptions(DisableVirtualMFARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableVirtualMFA"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableVirtualMFAResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑并删除多因素认证设备</p>
     * 
     * @param request DisableVirtualMFARequest
     * @return DisableVirtualMFAResponse
     */
    public DisableVirtualMFAResponse disableVirtualMFA(DisableVirtualMFARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableVirtualMFAWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a user credential report.</p>
     * 
     * @param request GenerateCredentialReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateCredentialReportResponse
     */
    public GenerateCredentialReportResponse generateCredentialReportWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCredentialReport"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCredentialReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a user credential report.</p>
     * @return GenerateCredentialReportResponse
     */
    public GenerateCredentialReportResponse generateCredentialReport() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCredentialReportWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the time when an AccessKey pair was used for the last time.</p>
     * 
     * @param request GetAccessKeyLastUsedRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessKeyLastUsedResponse
     */
    public GetAccessKeyLastUsedResponse getAccessKeyLastUsedWithOptions(GetAccessKeyLastUsedRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessKeyLastUsed"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessKeyLastUsedResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the time when an AccessKey pair was used for the last time.</p>
     * 
     * @param request GetAccessKeyLastUsedRequest
     * @return GetAccessKeyLastUsedResponse
     */
    public GetAccessKeyLastUsedResponse getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessKeyLastUsedWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号多因素认证设备信息</p>
     * 
     * @param request GetAccountMFAInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountMFAInfoResponse
     */
    public GetAccountMFAInfoResponse getAccountMFAInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountMFAInfo"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountMFAInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号多因素认证设备信息</p>
     * @return GetAccountMFAInfoResponse
     */
    public GetAccountMFAInfoResponse getAccountMFAInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountMFAInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云账号的安全报告</p>
     * 
     * @param request GetAccountSecurityPracticeReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountSecurityPracticeReportResponse
     */
    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReportWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountSecurityPracticeReport"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountSecurityPracticeReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询阿里云账号的安全报告</p>
     * @return GetAccountSecurityPracticeReportResponse
     */
    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReport() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountSecurityPracticeReportWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号概览信息</p>
     * 
     * @param request GetAccountSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountSummaryResponse
     */
    public GetAccountSummaryResponse getAccountSummaryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountSummary"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号概览信息</p>
     * @return GetAccountSummaryResponse
     */
    public GetAccountSummaryResponse getAccountSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountSummaryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application secret.</p>
     * 
     * @param request GetAppSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppSecretResponse
     */
    public GetAppSecretResponse getAppSecretWithOptions(GetAppSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecretId)) {
            query.put("AppSecretId", request.appSecretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppSecret"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an application secret.</p>
     * 
     * @param request GetAppSecretRequest
     * @return GetAppSecretResponse
     */
    public GetAppSecretResponse getAppSecret(GetAppSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of an application named <code>472457090344041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration information about an application.</p>
     * 
     * @param request GetApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of an application named <code>472457090344041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration information about an application.</p>
     * 
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user credential reports of an Alibaba Cloud account.</p>
     * 
     * @param request GetCredentialReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialReportResponse
     */
    public GetCredentialReportResponse getCredentialReportWithOptions(GetCredentialReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredentialReport"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialReportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user credential reports of an Alibaba Cloud account.</p>
     * 
     * @param request GetCredentialReportRequest
     * @return GetCredentialReportResponse
     */
    public GetCredentialReportResponse getCredentialReport(GetCredentialReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default domain name of an Alibaba Cloud account.</p>
     * 
     * @param request GetDefaultDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDefaultDomainResponse
     */
    public GetDefaultDomainResponse getDefaultDomainWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDefaultDomain"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDefaultDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the default domain name of an Alibaba Cloud account.</p>
     * @return GetDefaultDomainResponse
     */
    public GetDefaultDomainResponse getDefaultDomain() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDefaultDomainWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Resource Access Management (RAM) user group.</p>
     * 
     * @param request GetGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Resource Access Management (RAM) user group.</p>
     * 
     * @param request GetGroupRequest
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the console logon settings of a RAM user.</p>
     * 
     * @param request GetLoginProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginProfileResponse
     */
    public GetLoginProfileResponse getLoginProfileWithOptions(GetLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginProfile"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the console logon settings of a RAM user.</p>
     * 
     * @param request GetLoginProfileRequest
     * @return GetLoginProfileResponse
     */
    public GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query the information about an OpenID Connect (OIDC) identity provider (IdP) named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an OIDC IdP.</p>
     * 
     * @param request GetOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOIDCProviderResponse
     */
    public GetOIDCProviderResponse getOIDCProviderWithOptions(GetOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query the information about an OpenID Connect (OIDC) identity provider (IdP) named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an OIDC IdP.</p>
     * 
     * @param request GetOIDCProviderRequest
     * @return GetOIDCProviderResponse
     */
    public GetOIDCProviderResponse getOIDCProvider(GetOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the password policy for RAM users.</p>
     * 
     * @param request GetPasswordPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordPolicyResponse
     */
    public GetPasswordPolicyResponse getPasswordPolicyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordPolicy"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPasswordPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of the password policy for RAM users.</p>
     * @return GetPasswordPolicyResponse
     */
    public GetPasswordPolicyResponse getPasswordPolicy() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordPolicyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an identity provider (IdP) for role-based single sign-on (SSO).</p>
     * 
     * @param request GetSAMLProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSAMLProviderResponse
     */
    public GetSAMLProviderResponse getSAMLProviderWithOptions(GetSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSAMLProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSAMLProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an identity provider (IdP) for role-based single sign-on (SSO).</p>
     * 
     * @param request GetSAMLProviderRequest
     * @return GetSAMLProviderResponse
     */
    public GetSAMLProviderResponse getSAMLProvider(GetSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSAMLProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security preferences for RAM users.</p>
     * 
     * @param request GetSecurityPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSecurityPreferenceResponse
     */
    public GetSecurityPreferenceResponse getSecurityPreferenceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSecurityPreference"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSecurityPreferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security preferences for RAM users.</p>
     * @return GetSecurityPreferenceResponse
     */
    public GetSecurityPreferenceResponse getSecurityPreference() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSecurityPreferenceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the information about a RAM user named <code>test@example.onaliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a RAM user.</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2019-08-15"),
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
     * <p>This topic provides an example to show how to query the information about a RAM user named <code>test@example.onaliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a RAM user.</p>
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
     * <p>查询RAM用户多因素认证设备信息</p>
     * 
     * @param request GetUserMFAInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserMFAInfoResponse
     */
    public GetUserMFAInfoResponse getUserMFAInfoWithOptions(GetUserMFAInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserMFAInfo"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserMFAInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询RAM用户多因素认证设备信息</p>
     * 
     * @param request GetUserMFAInfoRequest
     * @return GetUserMFAInfoResponse
     */
    public GetUserMFAInfoResponse getUserMFAInfo(GetUserMFAInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserMFAInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户SSO身份提供商信息</p>
     * 
     * @param request GetUserSsoSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserSsoSettingsResponse
     */
    public GetUserSsoSettingsResponse getUserSsoSettingsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserSsoSettings"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserSsoSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户SSO身份提供商信息</p>
     * @return GetUserSsoSettingsResponse
     */
    public GetUserSsoSettingsResponse getUserSsoSettings() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserSsoSettingsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户安全认证的信息</p>
     * 
     * @param request GetVerificationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVerificationInfoResponse
     */
    public GetVerificationInfoResponse getVerificationInfoWithOptions(GetVerificationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVerificationInfo"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVerificationInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户安全认证的信息</p>
     * 
     * @param request GetVerificationInfoRequest
     * @return GetVerificationInfoResponse
     */
    public GetVerificationInfoResponse getVerificationInfo(GetVerificationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVerificationInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号或RAM用户访问密钥列表</p>
     * 
     * @param request ListAccessKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessKeysResponse
     */
    public ListAccessKeysResponse listAccessKeysWithOptions(ListAccessKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessKeys"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询主账号或RAM用户访问密钥列表</p>
     * 
     * @param request ListAccessKeysRequest
     * @return ListAccessKeysResponse
     */
    public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the secret IDs of an application.</p>
     * 
     * @param request ListAppSecretIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppSecretIdsResponse
     */
    public ListAppSecretIdsResponse listAppSecretIdsWithOptions(ListAppSecretIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppSecretIds"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppSecretIdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the secret IDs of an application.</p>
     * 
     * @param request ListAppSecretIdsRequest
     * @return ListAppSecretIdsResponse
     */
    public ListAppSecretIdsResponse listAppSecretIds(ListAppSecretIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppSecretIdsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the applications within the current account. The returned result shows that only one application named <code>myapp</code> belongs to the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the created applications.</p>
     * 
     * @param request ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the applications within the current account. The returned result shows that only one application named <code>myapp</code> belongs to the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the created applications.</p>
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries RAM user groups.</p>
     * 
     * @param request ListGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries RAM user groups.</p>
     * 
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the RAM user groups to which a RAM user belongs.</p>
     * 
     * @param request ListGroupsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUserWithOptions(ListGroupsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForUser"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the RAM user groups to which a RAM user belongs.</p>
     * 
     * @param request ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query all OpenID Connect (OIDC) identity providers (IdPs) within your Alibaba Cloud account. The response shows that your Alibaba Cloud account has only one OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries OIDC IdPs.</p>
     * 
     * @param request ListOIDCProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOIDCProvidersResponse
     */
    public ListOIDCProvidersResponse listOIDCProvidersWithOptions(ListOIDCProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOIDCProviders"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOIDCProvidersResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to query all OpenID Connect (OIDC) identity providers (IdPs) within your Alibaba Cloud account. The response shows that your Alibaba Cloud account has only one OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries OIDC IdPs.</p>
     * 
     * @param request ListOIDCProvidersRequest
     * @return ListOIDCProvidersResponse
     */
    public ListOIDCProvidersResponse listOIDCProviders(ListOIDCProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOIDCProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries predefined application permissions.</p>
     * 
     * @param request ListPredefinedScopesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPredefinedScopesResponse
     */
    public ListPredefinedScopesResponse listPredefinedScopesWithOptions(ListPredefinedScopesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPredefinedScopes"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPredefinedScopesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries predefined application permissions.</p>
     * 
     * @param request ListPredefinedScopesRequest
     * @return ListPredefinedScopesResponse
     */
    public ListPredefinedScopesResponse listPredefinedScopes(ListPredefinedScopesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPredefinedScopesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色SSO身份提供商列表</p>
     * 
     * @param request ListSAMLProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSAMLProvidersResponse
     */
    public ListSAMLProvidersResponse listSAMLProvidersWithOptions(ListSAMLProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSAMLProviders"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSAMLProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询角色SSO身份提供商列表</p>
     * 
     * @param request ListSAMLProvidersRequest
     * @return ListSAMLProvidersResponse
     */
    public ListSAMLProvidersResponse listSAMLProviders(ListSAMLProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSAMLProvidersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>You must specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N.Key</code></li>
     * <li><code>Tag.N.Key</code> and <code>Tag.N.Value</code></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added resources.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrincipalName)) {
            query.put("ResourcePrincipalName", request.resourcePrincipalName);
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
            new TeaPair("version", "2019-08-15"),
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
     * <b>description</b> :
     * <h3></h3>
     * <p>You must specify at least one of the following parameters or parameter pairs in a request to determine a query object:</p>
     * <ul>
     * <li><code>ResourceId.N</code></li>
     * <li><code>Tag.N.Key</code></li>
     * <li><code>Tag.N.Key</code> and <code>Tag.N.Value</code></li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the tags that are added resources.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the following API operations to query the information about all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about all RAM users.</p>
     * 
     * @param request ListUserBasicInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserBasicInfosResponse
     */
    public ListUserBasicInfosResponse listUserBasicInfosWithOptions(ListUserBasicInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserBasicInfos"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserBasicInfosResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the following API operations to query the information about all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the basic information about all RAM users.</p>
     * 
     * @param request ListUserBasicInfosRequest
     * @return ListUserBasicInfosResponse
     */
    public ListUserBasicInfosResponse listUserBasicInfos(ListUserBasicInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserBasicInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>You can call the following API operations to query the details of all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all RAM users.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2019-08-15"),
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
     * <h3><a href="#"></a></h3>
     * <p>You can call the following API operations to query the details of all RAM users:</p>
     * <ul>
     * <li>ListUsers: queries the details of all RAM users.</li>
     * <li>ListUserBasicInfos: queries the basic information about all RAM users. The basic information includes only the logon names (<code>UserPrincipalName</code>), display names (<code>DisplayName</code>), and user IDs (<code>UserId</code>).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all RAM users.</p>
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
     * <p>Queries Resource Access Management (RAM) users in a RAM user group.</p>
     * 
     * @param request ListUsersForGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroupWithOptions(ListUsersForGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersForGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Resource Access Management (RAM) users in a RAM user group.</p>
     * 
     * @param request ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroup(ListUsersForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries multi-factor authentication (MFA) devices.</p>
     * 
     * @param request ListVirtualMFADevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVirtualMFADevicesResponse
     */
    public ListVirtualMFADevicesResponse listVirtualMFADevicesWithOptions(ListVirtualMFADevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVirtualMFADevices"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVirtualMFADevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries multi-factor authentication (MFA) devices.</p>
     * 
     * @param request ListVirtualMFADevicesRequest
     * @return ListVirtualMFADevicesResponse
     */
    public ListVirtualMFADevicesResponse listVirtualMFADevices(ListVirtualMFADevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVirtualMFADevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the client ID <code>498469743454717****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a client ID from an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request RemoveClientIdFromOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveClientIdFromOIDCProviderResponse
     */
    public RemoveClientIdFromOIDCProviderResponse removeClientIdFromOIDCProviderWithOptions(RemoveClientIdFromOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveClientIdFromOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveClientIdFromOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the client ID <code>498469743454717****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a client ID from an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request RemoveClientIdFromOIDCProviderRequest
     * @return RemoveClientIdFromOIDCProviderResponse
     */
    public RemoveClientIdFromOIDCProviderResponse removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeClientIdFromOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the fingerprint <code>6938fd4d98bab03faadb97b34396831e3780****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a fingerprint from an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request RemoveFingerprintFromOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveFingerprintFromOIDCProviderResponse
     */
    public RemoveFingerprintFromOIDCProviderResponse removeFingerprintFromOIDCProviderWithOptions(RemoveFingerprintFromOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fingerprint)) {
            query.put("Fingerprint", request.fingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveFingerprintFromOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveFingerprintFromOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to remove the fingerprint <code>6938fd4d98bab03faadb97b34396831e3780****</code> from the OIDC IdP named <code>TestOIDCProvider</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a fingerprint from an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request RemoveFingerprintFromOIDCProviderRequest
     * @return RemoveFingerprintFromOIDCProviderResponse
     */
    public RemoveFingerprintFromOIDCProviderResponse removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeFingerprintFromOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将RAM用户从用户组中移除</p>
     * 
     * @param request RemoveUserFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromGroupResponse
     */
    public RemoveUserFromGroupResponse removeUserFromGroupWithOptions(RemoveUserFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将RAM用户从用户组中移除</p>
     * 
     * @param request RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the default domain name.</p>
     * 
     * @param request SetDefaultDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultDomainResponse
     */
    public SetDefaultDomainResponse setDefaultDomainWithOptions(SetDefaultDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultDomainName)) {
            query.put("DefaultDomainName", request.defaultDomainName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultDomain"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the default domain name.</p>
     * 
     * @param request SetDefaultDomainRequest
     * @return SetDefaultDomainResponse
     */
    public SetDefaultDomainResponse setDefaultDomain(SetDefaultDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the password policy for RAM users.</p>
     * 
     * @param request SetPasswordPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordPolicyResponse
     */
    public SetPasswordPolicyResponse setPasswordPolicyWithOptions(SetPasswordPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hardExpire)) {
            query.put("HardExpire", request.hardExpire);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLoginAttemps)) {
            query.put("MaxLoginAttemps", request.maxLoginAttemps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPasswordAge)) {
            query.put("MaxPasswordAge", request.maxPasswordAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minimumPasswordDifferentCharacter)) {
            query.put("MinimumPasswordDifferentCharacter", request.minimumPasswordDifferentCharacter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minimumPasswordLength)) {
            query.put("MinimumPasswordLength", request.minimumPasswordLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordNotContainUserName)) {
            query.put("PasswordNotContainUserName", request.passwordNotContainUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordReusePrevention)) {
            query.put("PasswordReusePrevention", request.passwordReusePrevention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireLowercaseCharacters)) {
            query.put("RequireLowercaseCharacters", request.requireLowercaseCharacters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireNumbers)) {
            query.put("RequireNumbers", request.requireNumbers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireSymbols)) {
            query.put("RequireSymbols", request.requireSymbols);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireUppercaseCharacters)) {
            query.put("RequireUppercaseCharacters", request.requireUppercaseCharacters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordPolicy"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the password policy for RAM users.</p>
     * 
     * @param request SetPasswordPolicyRequest
     * @return SetPasswordPolicyResponse
     */
    public SetPasswordPolicyResponse setPasswordPolicy(SetPasswordPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to enable multi-factor authentication (MFA) only for RAM users who initiated unusual logons.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures security preferences for a RAM user.</p>
     * 
     * @param tmpReq SetSecurityPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSecurityPreferenceResponse
     */
    public SetSecurityPreferenceResponse setSecurityPreferenceWithOptions(SetSecurityPreferenceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetSecurityPreferenceShrinkRequest request = new SetSecurityPreferenceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.verificationTypes)) {
            request.verificationTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.verificationTypes, "VerificationTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowUserToChangePassword)) {
            query.put("AllowUserToChangePassword", request.allowUserToChangePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowUserToManageAccessKeys)) {
            query.put("AllowUserToManageAccessKeys", request.allowUserToManageAccessKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowUserToManageMFADevices)) {
            query.put("AllowUserToManageMFADevices", request.allowUserToManageMFADevices);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allowUserToManagePersonalDingTalk)) {
            query.put("AllowUserToManagePersonalDingTalk", request.allowUserToManagePersonalDingTalk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSaveMFATicket)) {
            query.put("EnableSaveMFATicket", request.enableSaveMFATicket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginNetworkMasks)) {
            query.put("LoginNetworkMasks", request.loginNetworkMasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginSessionDuration)) {
            query.put("LoginSessionDuration", request.loginSessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MFAOperationForLogin)) {
            query.put("MFAOperationForLogin", request.MFAOperationForLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationForRiskLogin)) {
            query.put("OperationForRiskLogin", request.operationForRiskLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationTypesShrink)) {
            query.put("VerificationTypes", request.verificationTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSecurityPreference"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSecurityPreferenceResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to enable multi-factor authentication (MFA) only for RAM users who initiated unusual logons.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures security preferences for a RAM user.</p>
     * 
     * @param request SetSecurityPreferenceRequest
     * @return SetSecurityPreferenceResponse
     */
    public SetSecurityPreferenceResponse setSecurityPreference(SetSecurityPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSecurityPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户SSO身份提供商信息</p>
     * 
     * @param request SetUserSsoSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserSsoSettingsResponse
     */
    public SetUserSsoSettingsResponse setUserSsoSettingsWithOptions(SetUserSsoSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auxiliaryDomain)) {
            query.put("AuxiliaryDomain", request.auxiliaryDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataDocument)) {
            query.put("MetadataDocument", request.metadataDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoEnabled)) {
            query.put("SsoEnabled", request.ssoEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserSsoSettings"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserSsoSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>设置用户SSO身份提供商信息</p>
     * 
     * @param request SetUserSsoSettingsRequest
     * @return SetUserSsoSettingsResponse
     */
    public SetUserSsoSettingsResponse setUserSsoSettings(SetUserSsoSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserSsoSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrincipalName)) {
            query.put("ResourcePrincipalName", request.resourcePrincipalName);
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
            new TeaPair("version", "2019-08-15"),
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
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为RAM用户解绑多因素认证设备</p>
     * 
     * @param request UnbindMFADeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindMFADeviceResponse
     */
    public UnbindMFADeviceResponse unbindMFADeviceWithOptions(UnbindMFADeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindMFADevice"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindMFADeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为RAM用户解绑多因素认证设备</p>
     * 
     * @param request UnbindMFADeviceRequest
     * @return UnbindMFADeviceResponse
     */
    public UnbindMFADeviceResponse unbindMFADevice(UnbindMFADeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindMFADeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from a resource.</p>
     * 
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePrincipalName)) {
            query.put("ResourcePrincipalName", request.resourcePrincipalName);
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
            new TeaPair("version", "2019-08-15"),
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
     * <b>summary</b> : 
     * <p>Removes tags from a resource.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改访问密钥状态</p>
     * 
     * @param request UpdateAccessKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccessKeyResponse
     */
    public UpdateAccessKeyResponse updateAccessKeyWithOptions(UpdateAccessKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccessKey"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccessKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改访问密钥状态</p>
     * 
     * @param request UpdateAccessKeyRequest
     * @return UpdateAccessKeyResponse
     */
    public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccessKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a specified application.</p>
     * 
     * @param request UpdateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplicationWithOptions(UpdateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newAccessTokenValidity)) {
            query.put("NewAccessTokenValidity", request.newAccessTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newIsMultiTenant)) {
            query.put("NewIsMultiTenant", request.newIsMultiTenant);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPredefinedScopes)) {
            query.put("NewPredefinedScopes", request.newPredefinedScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRedirectUris)) {
            query.put("NewRedirectUris", request.newRedirectUris);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRefreshTokenValidity)) {
            query.put("NewRefreshTokenValidity", request.newRefreshTokenValidity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRequiredScopes)) {
            query.put("NewRequiredScopes", request.newRequiredScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSecretRequired)) {
            query.put("NewSecretRequired", request.newSecretRequired);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplication"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a specified application.</p>
     * 
     * @param request UpdateApplicationRequest
     * @return UpdateApplicationResponse
     */
    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a RAM user group.</p>
     * 
     * @param request UpdateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newComments)) {
            query.put("NewComments", request.newComments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newGroupName)) {
            query.put("NewGroupName", request.newGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information of a RAM user group.</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改RAM用户的控制台登录信息</p>
     * 
     * @param request UpdateLoginProfileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoginProfileResponse
     */
    public UpdateLoginProfileResponse updateLoginProfileWithOptions(UpdateLoginProfileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.MFABindRequired)) {
            query.put("MFABindRequired", request.MFABindRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordResetRequired)) {
            query.put("PasswordResetRequired", request.passwordResetRequired);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoginProfile"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoginProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改RAM用户的控制台登录信息</p>
     * 
     * @param request UpdateLoginProfileRequest
     * @return UpdateLoginProfileResponse
     */
    public UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoginProfileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to change the description of the OIDC IdP named <code>TestOIDCProvider</code> to <code>This is a new OIDC Provider.</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description and client IDs of an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request UpdateOIDCProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOIDCProviderResponse
     */
    public UpdateOIDCProviderResponse updateOIDCProviderWithOptions(UpdateOIDCProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("ClientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuanceLimitTime)) {
            query.put("IssuanceLimitTime", request.issuanceLimitTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOIDCProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOIDCProviderResponse());
    }

    /**
     * <b>description</b> :
     * <h3></h3>
     * <p>This topic provides an example on how to change the description of the OIDC IdP named <code>TestOIDCProvider</code> to <code>This is a new OIDC Provider.</code></p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description and client IDs of an OpenID Connect (OIDC) identity provider (IdP).</p>
     * 
     * @param request UpdateOIDCProviderRequest
     * @return UpdateOIDCProviderResponse
     */
    public UpdateOIDCProviderResponse updateOIDCProvider(UpdateOIDCProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOIDCProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the description of an IdP named <code>test-provider</code> to <code>This is a new provider.</code></p>
     * 
     * <b>summary</b> : 
     * <p>修改角色SSO身份提供商信息</p>
     * 
     * @param request UpdateSAMLProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSAMLProviderResponse
     */
    public UpdateSAMLProviderResponse updateSAMLProviderWithOptions(UpdateSAMLProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEncodedSAMLMetadataDocument)) {
            query.put("NewEncodedSAMLMetadataDocument", request.newEncodedSAMLMetadataDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSAMLProvider"),
            new TeaPair("version", "2019-08-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSAMLProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the description of an IdP named <code>test-provider</code> to <code>This is a new provider.</code></p>
     * 
     * <b>summary</b> : 
     * <p>修改角色SSO身份提供商信息</p>
     * 
     * @param request UpdateSAMLProviderRequest
     * @return UpdateSAMLProviderResponse
     */
    public UpdateSAMLProviderResponse updateSAMLProvider(UpdateSAMLProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSAMLProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to modify the name of a RAM user from <code>test@example.onaliyun.com</code> to <code>new@example.onaliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a RAM user.</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newComments)) {
            query.put("NewComments", request.newComments);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEmail)) {
            query.put("NewEmail", request.newEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newMobilePhone)) {
            query.put("NewMobilePhone", request.newMobilePhone);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newUserPrincipalName)) {
            query.put("NewUserPrincipalName", request.newUserPrincipalName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2019-08-15"),
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
     * <p>This topic provides an example to show how to modify the name of a RAM user from <code>test@example.onaliyun.com</code> to <code>new@example.onaliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a RAM user.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
