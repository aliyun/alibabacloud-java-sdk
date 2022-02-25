// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ims20190815;

import com.aliyun.tea.*;
import com.aliyun.ims20190815.models.*;
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

    public AddClientIdToOIDCProviderResponse addClientIdToOIDCProviderWithOptions(AddClientIdToOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddClientIdToOIDCProviderResponse addClientIdToOIDCProvider(AddClientIdToOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addClientIdToOIDCProviderWithOptions(request, runtime);
    }

    public AddFingerprintToOIDCProviderResponse addFingerprintToOIDCProviderWithOptions(AddFingerprintToOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fingerprint)) {
            query.put("Fingerprint", request.fingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddFingerprintToOIDCProviderResponse addFingerprintToOIDCProvider(AddFingerprintToOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addFingerprintToOIDCProviderWithOptions(request, runtime);
    }

    public AddUserToGroupResponse addUserToGroupWithOptions(AddUserToGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addUserToGroupWithOptions(request, runtime);
    }

    public BindMFADeviceResponse bindMFADeviceWithOptions(BindMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BindMFADeviceResponse bindMFADevice(BindMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindMFADeviceWithOptions(request, runtime);
    }

    public ChangePasswordResponse changePasswordWithOptions(ChangePasswordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            query.put("NewPassword", request.newPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldPassword)) {
            query.put("OldPassword", request.oldPassword);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ChangePasswordResponse changePassword(ChangePasswordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changePasswordWithOptions(request, runtime);
    }

    public CreateAccessKeyResponse createAccessKeyWithOptions(CreateAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAccessKeyResponse createAccessKey(CreateAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAccessKeyWithOptions(request, runtime);
    }

    public CreateAppSecretResponse createAppSecretWithOptions(CreateAppSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateAppSecretResponse createAppSecret(CreateAppSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppSecretWithOptions(request, runtime);
    }

    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.secretRequired)) {
            query.put("SecretRequired", request.secretRequired);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public CreateLoginProfileResponse createLoginProfileWithOptions(CreateLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateLoginProfileResponse createLoginProfile(CreateLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoginProfileWithOptions(request, runtime);
    }

    public CreateOIDCProviderResponse createOIDCProviderWithOptions(CreateOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.issuerUrl)) {
            query.put("IssuerUrl", request.issuerUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateOIDCProviderResponse createOIDCProvider(CreateOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOIDCProviderWithOptions(request, runtime);
    }

    public CreateSAMLProviderResponse createSAMLProviderWithOptions(CreateSAMLProviderRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateSAMLProviderResponse createSAMLProvider(CreateSAMLProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSAMLProviderWithOptions(request, runtime);
    }

    public CreateUserResponse createUserWithOptions(CreateUserRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    public CreateVirtualMFADeviceResponse createVirtualMFADeviceWithOptions(CreateVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.virtualMFADeviceName)) {
            query.put("VirtualMFADeviceName", request.virtualMFADeviceName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateVirtualMFADeviceResponse createVirtualMFADevice(CreateVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createVirtualMFADeviceWithOptions(request, runtime);
    }

    public DeleteAccessKeyResponse deleteAccessKeyWithOptions(DeleteAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteAccessKeyResponse deleteAccessKey(DeleteAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAccessKeyWithOptions(request, runtime);
    }

    public DeleteAppSecretResponse deleteAppSecretWithOptions(DeleteAppSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecretId)) {
            query.put("AppSecretId", request.appSecretId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteAppSecretResponse deleteAppSecret(DeleteAppSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppSecretWithOptions(request, runtime);
    }

    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteLoginProfileResponse deleteLoginProfileWithOptions(DeleteLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteLoginProfileResponse deleteLoginProfile(DeleteLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLoginProfileWithOptions(request, runtime);
    }

    public DeleteOIDCProviderResponse deleteOIDCProviderWithOptions(DeleteOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteOIDCProviderResponse deleteOIDCProvider(DeleteOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOIDCProviderWithOptions(request, runtime);
    }

    public DeleteSAMLProviderResponse deleteSAMLProviderWithOptions(DeleteSAMLProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteSAMLProviderResponse deleteSAMLProvider(DeleteSAMLProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSAMLProviderWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADeviceWithOptions(DeleteVirtualMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteVirtualMFADeviceResponse deleteVirtualMFADevice(DeleteVirtualMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteVirtualMFADeviceWithOptions(request, runtime);
    }

    public DisableVirtualMFAResponse disableVirtualMFAWithOptions(DisableVirtualMFARequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DisableVirtualMFAResponse disableVirtualMFA(DisableVirtualMFARequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableVirtualMFAWithOptions(request, runtime);
    }

    public GenerateCredentialReportResponse generateCredentialReportWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GenerateCredentialReportResponse generateCredentialReport() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateCredentialReportWithOptions(runtime);
    }

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsedWithOptions(GetAccessKeyLastUsedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userAccessKeyId)) {
            query.put("UserAccessKeyId", request.userAccessKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAccessKeyLastUsedResponse getAccessKeyLastUsed(GetAccessKeyLastUsedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccessKeyLastUsedWithOptions(request, runtime);
    }

    public GetAccountMFAInfoResponse getAccountMFAInfoWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAccountMFAInfoResponse getAccountMFAInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountMFAInfoWithOptions(runtime);
    }

    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReportWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAccountSecurityPracticeReportResponse getAccountSecurityPracticeReport() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountSecurityPracticeReportWithOptions(runtime);
    }

    public GetAccountSummaryResponse getAccountSummaryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAccountSummaryResponse getAccountSummary() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAccountSummaryWithOptions(runtime);
    }

    public GetAppSecretResponse getAppSecretWithOptions(GetAppSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appSecretId)) {
            query.put("AppSecretId", request.appSecretId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAppSecretResponse getAppSecret(GetAppSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppSecretWithOptions(request, runtime);
    }

    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    public GetCredentialReportResponse getCredentialReportWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCredentialReportResponse getCredentialReport() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCredentialReportWithOptions(runtime);
    }

    public GetDefaultDomainResponse getDefaultDomainWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetDefaultDomainResponse getDefaultDomain() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDefaultDomainWithOptions(runtime);
    }

    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGroupWithOptions(request, runtime);
    }

    public GetLoginProfileResponse getLoginProfileWithOptions(GetLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetLoginProfileResponse getLoginProfile(GetLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoginProfileWithOptions(request, runtime);
    }

    public GetOIDCProviderResponse getOIDCProviderWithOptions(GetOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetOIDCProviderResponse getOIDCProvider(GetOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOIDCProviderWithOptions(request, runtime);
    }

    public GetPasswordPolicyResponse getPasswordPolicyWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetPasswordPolicyResponse getPasswordPolicy() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPasswordPolicyWithOptions(runtime);
    }

    public GetSAMLProviderResponse getSAMLProviderWithOptions(GetSAMLProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SAMLProviderName)) {
            query.put("SAMLProviderName", request.SAMLProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSAMLProviderResponse getSAMLProvider(GetSAMLProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSAMLProviderWithOptions(request, runtime);
    }

    public GetSecurityPreferenceResponse getSecurityPreferenceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetSecurityPreferenceResponse getSecurityPreference() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSecurityPreferenceWithOptions(runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetUserMFAInfoResponse getUserMFAInfoWithOptions(GetUserMFAInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUserMFAInfoResponse getUserMFAInfo(GetUserMFAInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserMFAInfoWithOptions(request, runtime);
    }

    public GetUserSsoSettingsResponse getUserSsoSettingsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetUserSsoSettingsResponse getUserSsoSettings() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserSsoSettingsWithOptions(runtime);
    }

    public ListAccessKeysResponse listAccessKeysWithOptions(ListAccessKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAccessKeysResponse listAccessKeys(ListAccessKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAccessKeysWithOptions(request, runtime);
    }

    public ListAppSecretIdsResponse listAppSecretIdsWithOptions(ListAppSecretIdsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListAppSecretIdsResponse listAppSecretIds(ListAppSecretIdsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppSecretIdsWithOptions(request, runtime);
    }

    public ListApplicationsResponse listApplicationsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListApplicationsResponse listApplications() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listApplicationsWithOptions(runtime);
    }

    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    public ListGroupsForUserResponse listGroupsForUserWithOptions(ListGroupsForUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    public ListOIDCProvidersResponse listOIDCProvidersWithOptions(ListOIDCProvidersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListOIDCProvidersResponse listOIDCProviders(ListOIDCProvidersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOIDCProvidersWithOptions(request, runtime);
    }

    public ListPredefinedScopesResponse listPredefinedScopesWithOptions(ListPredefinedScopesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            query.put("AppType", request.appType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPredefinedScopesResponse listPredefinedScopes(ListPredefinedScopesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPredefinedScopesWithOptions(request, runtime);
    }

    public ListSAMLProvidersResponse listSAMLProvidersWithOptions(ListSAMLProvidersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListSAMLProvidersResponse listSAMLProviders(ListSAMLProvidersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSAMLProvidersWithOptions(request, runtime);
    }

    public ListUserBasicInfosResponse listUserBasicInfosWithOptions(ListUserBasicInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUserBasicInfosResponse listUserBasicInfos(ListUserBasicInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserBasicInfosWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListUsersForGroupResponse listUsersForGroupWithOptions(ListUsersForGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUsersForGroupResponse listUsersForGroup(ListUsersForGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersForGroupWithOptions(request, runtime);
    }

    public ListVirtualMFADevicesResponse listVirtualMFADevicesWithOptions(ListVirtualMFADevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxItems)) {
            query.put("MaxItems", request.maxItems);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListVirtualMFADevicesResponse listVirtualMFADevices(ListVirtualMFADevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listVirtualMFADevicesWithOptions(request, runtime);
    }

    public RemoveClientIdFromOIDCProviderResponse removeClientIdFromOIDCProviderWithOptions(RemoveClientIdFromOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("ClientId", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveClientIdFromOIDCProviderResponse removeClientIdFromOIDCProvider(RemoveClientIdFromOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeClientIdFromOIDCProviderWithOptions(request, runtime);
    }

    public RemoveFingerprintFromOIDCProviderResponse removeFingerprintFromOIDCProviderWithOptions(RemoveFingerprintFromOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fingerprint)) {
            query.put("Fingerprint", request.fingerprint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveFingerprintFromOIDCProviderResponse removeFingerprintFromOIDCProvider(RemoveFingerprintFromOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeFingerprintFromOIDCProviderWithOptions(request, runtime);
    }

    public RemoveUserFromGroupResponse removeUserFromGroupWithOptions(RemoveUserFromGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeUserFromGroupWithOptions(request, runtime);
    }

    public SetDefaultDomainResponse setDefaultDomainWithOptions(SetDefaultDomainRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultDomainName)) {
            query.put("DefaultDomainName", request.defaultDomainName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SetDefaultDomainResponse setDefaultDomain(SetDefaultDomainRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDefaultDomainWithOptions(request, runtime);
    }

    public SetPasswordPolicyResponse setPasswordPolicyWithOptions(SetPasswordPolicyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SetPasswordPolicyResponse setPasswordPolicy(SetPasswordPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setPasswordPolicyWithOptions(request, runtime);
    }

    public SetSecurityPreferenceResponse setSecurityPreferenceWithOptions(SetSecurityPreferenceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        if (!com.aliyun.teautil.Common.isUnset(request.enforceMFAForLogin)) {
            query.put("EnforceMFAForLogin", request.enforceMFAForLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginNetworkMasks)) {
            query.put("LoginNetworkMasks", request.loginNetworkMasks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginSessionDuration)) {
            query.put("LoginSessionDuration", request.loginSessionDuration);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SetSecurityPreferenceResponse setSecurityPreference(SetSecurityPreferenceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setSecurityPreferenceWithOptions(request, runtime);
    }

    public SetUserSsoSettingsResponse setUserSsoSettingsWithOptions(SetUserSsoSettingsRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SetUserSsoSettingsResponse setUserSsoSettings(SetUserSsoSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setUserSsoSettingsWithOptions(request, runtime);
    }

    public UnbindMFADeviceResponse unbindMFADeviceWithOptions(UnbindMFADeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userPrincipalName)) {
            query.put("UserPrincipalName", request.userPrincipalName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UnbindMFADeviceResponse unbindMFADevice(UnbindMFADeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindMFADeviceWithOptions(request, runtime);
    }

    public UpdateAccessKeyResponse updateAccessKeyWithOptions(UpdateAccessKeyRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateAccessKeyResponse updateAccessKey(UpdateAccessKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAccessKeyWithOptions(request, runtime);
    }

    public UpdateApplicationResponse updateApplicationWithOptions(UpdateApplicationRequest request, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.newSecretRequired)) {
            query.put("NewSecretRequired", request.newSecretRequired);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateApplicationResponse updateApplication(UpdateApplicationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateApplicationWithOptions(request, runtime);
    }

    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    public UpdateLoginProfileResponse updateLoginProfileWithOptions(UpdateLoginProfileRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateLoginProfileResponse updateLoginProfile(UpdateLoginProfileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLoginProfileWithOptions(request, runtime);
    }

    public UpdateOIDCProviderResponse updateOIDCProviderWithOptions(UpdateOIDCProviderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIds)) {
            query.put("ClientIds", request.clientIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OIDCProviderName)) {
            query.put("OIDCProviderName", request.OIDCProviderName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateOIDCProviderResponse updateOIDCProvider(UpdateOIDCProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOIDCProviderWithOptions(request, runtime);
    }

    public UpdateSAMLProviderResponse updateSAMLProviderWithOptions(UpdateSAMLProviderRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateSAMLProviderResponse updateSAMLProvider(UpdateSAMLProviderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSAMLProviderWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
