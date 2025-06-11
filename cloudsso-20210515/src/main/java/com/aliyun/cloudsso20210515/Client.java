// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515;

import com.aliyun.tea.*;
import com.aliyun.cloudsso20210515.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cloudsso", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>You can add up to two SAML signing certificates.
     * This topic provides an example on how to add a SAML signing certificate to the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a Security Assertion Markup Language (SAML) signing certificate.</p>
     * 
     * @param request AddExternalSAMLIdPCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddExternalSAMLIdPCertificateResponse
     */
    public AddExternalSAMLIdPCertificateResponse addExternalSAMLIdPCertificateWithOptions(AddExternalSAMLIdPCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.x509Certificate)) {
            query.put("X509Certificate", request.x509Certificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddExternalSAMLIdPCertificate"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddExternalSAMLIdPCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can add up to two SAML signing certificates.
     * This topic provides an example on how to add a SAML signing certificate to the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a Security Assertion Markup Language (SAML) signing certificate.</p>
     * 
     * @param request AddExternalSAMLIdPCertificateRequest
     * @return AddExternalSAMLIdPCertificateResponse
     */
    public AddExternalSAMLIdPCertificateResponse addExternalSAMLIdPCertificate(AddExternalSAMLIdPCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addExternalSAMLIdPCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the system policy <code>AliyunECSFullAccess</code> to the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a policy to an access configuration.</p>
     * 
     * @param request AddPermissionPolicyToAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddPermissionPolicyToAccessConfigurationResponse
     */
    public AddPermissionPolicyToAccessConfigurationResponse addPermissionPolicyToAccessConfigurationWithOptions(AddPermissionPolicyToAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inlinePolicyDocument)) {
            query.put("InlinePolicyDocument", request.inlinePolicyDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionPolicyName)) {
            query.put("PermissionPolicyName", request.permissionPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionPolicyType)) {
            query.put("PermissionPolicyType", request.permissionPolicyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddPermissionPolicyToAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddPermissionPolicyToAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the system policy <code>AliyunECSFullAccess</code> to the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a policy to an access configuration.</p>
     * 
     * @param request AddPermissionPolicyToAccessConfigurationRequest
     * @return AddPermissionPolicyToAccessConfigurationResponse
     */
    public AddPermissionPolicyToAccessConfigurationResponse addPermissionPolicyToAccessConfiguration(AddPermissionPolicyToAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addPermissionPolicyToAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot add a user to a group that is synchronized by using SCIM.
     * This topic provides an example on how to add the user <code>u-00q8wbq42wiltcrk****</code> to the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a group.</p>
     * 
     * @param request AddUserToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToGroupResponse
     */
    public AddUserToGroupResponse addUserToGroupWithOptions(AddUserToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot add a user to a group that is synchronized by using SCIM.
     * This topic provides an example on how to add the user <code>u-00q8wbq42wiltcrk****</code> to the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds a user to a group.</p>
     * 
     * @param request AddUserToGroupRequest
     * @return AddUserToGroupResponse
     */
    public AddUserToGroupResponse addUserToGroup(AddUserToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If single sign-on (SSO) logon is disabled, you can clear the configurations of a SAML IdP. If SSO logon is enabled, you cannot clear the configurations.
     * This topic provides an example on how to clear the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears the configurations of a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request ClearExternalSAMLIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ClearExternalSAMLIdentityProviderResponse
     */
    public ClearExternalSAMLIdentityProviderResponse clearExternalSAMLIdentityProviderWithOptions(ClearExternalSAMLIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ClearExternalSAMLIdentityProvider"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ClearExternalSAMLIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>If single sign-on (SSO) logon is disabled, you can clear the configurations of a SAML IdP. If SSO logon is enabled, you cannot clear the configurations.
     * This topic provides an example on how to clear the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Clears the configurations of a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request ClearExternalSAMLIdentityProviderRequest
     * @return ClearExternalSAMLIdentityProviderResponse
     */
    public ClearExternalSAMLIdentityProviderResponse clearExternalSAMLIdentityProvider(ClearExternalSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.clearExternalSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * For more information about how to assign permissions on an account in your resource directory, see <a href="https://help.aliyun.com/document_detail/266726.html">Overview of multi-account authorization</a>.
     * This topic provides an example on how to assign access permissions on the account <code>114240524784****</code> in your resource directory to the CloudSSO user <code>u-00q8wbq42wiltcrk****</code> by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>. After the call is successful, the CloudSSO user can access resources within the account in the resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns access permissions on an account in your resource directory to a user or a group by using an access configuration.</p>
     * 
     * @param request CreateAccessAssignmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessAssignmentResponse
     */
    public CreateAccessAssignmentResponse createAccessAssignmentWithOptions(CreateAccessAssignmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessAssignment"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessAssignmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * For more information about how to assign permissions on an account in your resource directory, see <a href="https://help.aliyun.com/document_detail/266726.html">Overview of multi-account authorization</a>.
     * This topic provides an example on how to assign access permissions on the account <code>114240524784****</code> in your resource directory to the CloudSSO user <code>u-00q8wbq42wiltcrk****</code> by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>. After the call is successful, the CloudSSO user can access resources within the account in the resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Assigns access permissions on an account in your resource directory to a user or a group by using an access configuration.</p>
     * 
     * @param request CreateAccessAssignmentRequest
     * @return CreateAccessAssignmentResponse
     */
    public CreateAccessAssignmentResponse createAccessAssignment(CreateAccessAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about access configurations, see <a href="https://help.aliyun.com/document_detail/266737.html">Overview of access configurations</a>.
     * This topic provides an example on how to create an access configuration named <code>ECS-Admin</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access configuration.</p>
     * 
     * @param request CreateAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccessConfigurationResponse
     */
    public CreateAccessConfigurationResponse createAccessConfigurationWithOptions(CreateAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationName)) {
            query.put("AccessConfigurationName", request.accessConfigurationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relayState)) {
            query.put("RelayState", request.relayState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionDuration)) {
            query.put("SessionDuration", request.sessionDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information about access configurations, see <a href="https://help.aliyun.com/document_detail/266737.html">Overview of access configurations</a>.
     * This topic provides an example on how to create an access configuration named <code>ECS-Admin</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an access configuration.</p>
     * 
     * @param request CreateAccessConfigurationRequest
     * @return CreateAccessConfigurationResponse
     */
    public CreateAccessConfigurationResponse createAccessConfiguration(CreateAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Operation description</h3>
     * <p>A directory is a CloudSSO instance. Before you can use CloudSSO, you must create a directory. The directory is used to manage all CloudSSO resources.
     * To create a directory, you must select a region. Alibaba Cloud stores data in the directory only in the region that you select. However, you can deploy Alibaba Cloud resources including Elastic Compute Service (ECS) instances and ApsaraDB RDS instances in other regions. You can also use your cloud account for logons and access the Alibaba Cloud resources in other regions. You can select a region to create a directory based on your security compliance requirements and the geographic location of specific users. If you do not have strict security compliance requirements, we recommend that you select a region that is the closest to the geographical location of the specific users. This way, access to cloud resources is accelerated. You can create the CloudSSO directory in the China (Shanghai), China (Hong Kong), US (Silicon Valley), or Germany (Frankfurt) region.
     * This topic provides an example on how to create a directory named <code>example</code> in the China (Shanghai) region.</p>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>You can create only one directory for a management account.</li>
     * <li>If you want to change the region of a directory, you must delete the directory and then create a directory in a different region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory.</p>
     * 
     * @param request CreateDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectoryWithOptions(CreateDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryName)) {
            query.put("DirectoryName", request.directoryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDirectory"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Operation description</h3>
     * <p>A directory is a CloudSSO instance. Before you can use CloudSSO, you must create a directory. The directory is used to manage all CloudSSO resources.
     * To create a directory, you must select a region. Alibaba Cloud stores data in the directory only in the region that you select. However, you can deploy Alibaba Cloud resources including Elastic Compute Service (ECS) instances and ApsaraDB RDS instances in other regions. You can also use your cloud account for logons and access the Alibaba Cloud resources in other regions. You can select a region to create a directory based on your security compliance requirements and the geographic location of specific users. If you do not have strict security compliance requirements, we recommend that you select a region that is the closest to the geographical location of the specific users. This way, access to cloud resources is accelerated. You can create the CloudSSO directory in the China (Shanghai), China (Hong Kong), US (Silicon Valley), or Germany (Frankfurt) region.
     * This topic provides an example on how to create a directory named <code>example</code> in the China (Shanghai) region.</p>
     * <h3><a href="#"></a>Limits</h3>
     * <ul>
     * <li>You can create only one directory for a management account.</li>
     * <li>If you want to change the region of a directory, you must delete the directory and then create a directory in a different region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a directory.</p>
     * 
     * @param request CreateDirectoryRequest
     * @return CreateDirectoryResponse
     */
    public CreateDirectoryResponse createDirectory(CreateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a group named <code>TestGroup</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to create a group named <code>TestGroup</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>SCIM credentials are required for SCIM synchronization. You can create up to two SCIM credentials.
     * This topic provides an example on how to create a SCIM credential within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request CreateSCIMServerCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSCIMServerCredentialResponse
     */
    public CreateSCIMServerCredentialResponse createSCIMServerCredentialWithOptions(CreateSCIMServerCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSCIMServerCredential"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSCIMServerCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>SCIM credentials are required for SCIM synchronization. You can create up to two SCIM credentials.
     * This topic provides an example on how to create a SCIM credential within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request CreateSCIMServerCredentialRequest
     * @return CreateSCIMServerCredentialResponse
     */
    public CreateSCIMServerCredentialResponse createSCIMServerCredential(CreateSCIMServerCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSCIMServerCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a user named <code>Alice</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user.</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.firstName)) {
            query.put("FirstName", request.firstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lastName)) {
            query.put("LastName", request.lastName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>This topic provides an example on how to create a user named <code>Alice</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a user.</p>
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
     * <p>You can create a RAM user provisioning for a member in your resource directory to create a RAM user that has the same username as a CloudSSO user. This way, the CloudSSO user can access the resources of the member as the RAM user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request CreateUserProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserProvisioningResponse
     */
    public CreateUserProvisioningResponse createUserProvisioningWithOptions(CreateUserProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletionStrategy)) {
            query.put("DeletionStrategy", request.deletionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationStrategy)) {
            query.put("DuplicationStrategy", request.duplicationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserProvisioning"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserProvisioningResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create a RAM user provisioning for a member in your resource directory to create a RAM user that has the same username as a CloudSSO user. This way, the CloudSSO user can access the resources of the member as the RAM user.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request CreateUserProvisioningRequest
     * @return CreateUserProvisioningResponse
     */
    public CreateUserProvisioningResponse createUserProvisioning(CreateUserProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to remove the access permissions on the account <code>114240524784****</code> in the resource directory from the CloudSSO user <code>u-00q8wbq42wiltcrk****</code>. The access permissions are assigned by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes the access permissions on an account in a resource directory.</p>
     * 
     * @param request DeleteAccessAssignmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessAssignmentResponse
     */
    public DeleteAccessAssignmentResponse deleteAccessAssignmentWithOptions(DeleteAccessAssignmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deprovisionStrategy)) {
            query.put("DeprovisionStrategy", request.deprovisionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessAssignment"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessAssignmentResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to remove the access permissions on the account <code>114240524784****</code> in the resource directory from the CloudSSO user <code>u-00q8wbq42wiltcrk****</code>. The access permissions are assigned by using the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes the access permissions on an account in a resource directory.</p>
     * 
     * @param request DeleteAccessAssignmentRequest
     * @return DeleteAccessAssignmentResponse
     */
    public DeleteAccessAssignmentResponse deleteAccessAssignment(DeleteAccessAssignmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessAssignmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The access configuration that you want to delete is de-provisioned from the accounts in your resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/338352.html">DeprovisionAccessConfiguration</a>.</p>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>This topic provides an example on how to delete the access configuration whose ID is <code>ac-001j9mcm3k7335bc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access configuration.</p>
     * 
     * @param request DeleteAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccessConfigurationResponse
     */
    public DeleteAccessConfigurationResponse deleteAccessConfigurationWithOptions(DeleteAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceRemovePermissionPolicies)) {
            query.put("ForceRemovePermissionPolicies", request.forceRemovePermissionPolicies);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The access configuration that you want to delete is de-provisioned from the accounts in your resource directory. For more information, see <a href="https://help.aliyun.com/document_detail/338352.html">DeprovisionAccessConfiguration</a>.</p>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>This topic provides an example on how to delete the access configuration whose ID is <code>ac-001j9mcm3k7335bc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an access configuration.</p>
     * 
     * @param request DeleteAccessConfigurationRequest
     * @return DeleteAccessConfigurationResponse
     */
    public DeleteAccessConfigurationResponse deleteAccessConfiguration(DeleteAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>No resources are contained in the directory that you want to delete.</p>
     * <ul>
     * <li>Access permissions on the accounts in your resource directory are removed from all users and groups. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Users are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341671.html">DeleteUser</a>.</li>
     * <li>Groups are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341821.html">DeleteGroup</a>.</li>
     * <li>Access configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/336907.html">DeleteAccessConfiguration</a>.</li>
     * <li>System for Cross-domain Identity Management (SCIM) credentials are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341842.html">DeleteSCIMServerCredential</a>.</li>
     * <li>Single sign-on (SSO) logon configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341573.html">ClearExternalSAMLIdentityProvider</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>This topic provides an example on how to delete a directory whose ID is <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a directory.</p>
     * 
     * @param request DeleteDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectoryWithOptions(DeleteDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDirectory"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>No resources are contained in the directory that you want to delete.</p>
     * <ul>
     * <li>Access permissions on the accounts in your resource directory are removed from all users and groups. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Users are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341671.html">DeleteUser</a>.</li>
     * <li>Groups are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341821.html">DeleteGroup</a>.</li>
     * <li>Access configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/336907.html">DeleteAccessConfiguration</a>.</li>
     * <li>System for Cross-domain Identity Management (SCIM) credentials are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341842.html">DeleteSCIMServerCredential</a>.</li>
     * <li>Single sign-on (SSO) logon configurations are deleted. For more information, see <a href="https://help.aliyun.com/document_detail/341573.html">ClearExternalSAMLIdentityProvider</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>This topic provides an example on how to delete a directory whose ID is <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a directory.</p>
     * 
     * @param request DeleteDirectoryRequest
     * @return DeleteDirectoryResponse
     */
    public DeleteDirectoryResponse deleteDirectory(DeleteDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The group that you want to delete is not associated with the following resources. If the group is associated with the resources, the deletion fails.</p>
     * <ul>
     * <li>Users: You must remove users from the group. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the group. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a group that is synchronized by using SCIM.
     * This topic provides an example on how to delete the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * 
     * @param request DeleteGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The group that you want to delete is not associated with the following resources. If the group is associated with the resources, the deletion fails.</p>
     * <ul>
     * <li>Users: You must remove users from the group. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the group. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Operation description</h3>
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a group that is synchronized by using SCIM.
     * This topic provides an example on how to delete the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * 
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to unbind the MFA device whose ID is <code>mfa-00ujhet8pycljj7j****</code> from the user whose ID is <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a multi-factor authentication (MFA) device from a user.</p>
     * 
     * @param request DeleteMFADeviceForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMFADeviceForUserResponse
     */
    public DeleteMFADeviceForUserResponse deleteMFADeviceForUserWithOptions(DeleteMFADeviceForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MFADeviceId)) {
            query.put("MFADeviceId", request.MFADeviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMFADeviceForUser"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMFADeviceForUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to unbind the MFA device whose ID is <code>mfa-00ujhet8pycljj7j****</code> from the user whose ID is <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbinds a multi-factor authentication (MFA) device from a user.</p>
     * 
     * @param request DeleteMFADeviceForUserRequest
     * @return DeleteMFADeviceForUserResponse
     */
    public DeleteMFADeviceForUserResponse deleteMFADeviceForUser(DeleteMFADeviceForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMFADeviceForUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a SCIM credential is deleted, the synchronization task that uses the SCIM credential fails.
     * This topic provides an example on how to delete the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request DeleteSCIMServerCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSCIMServerCredentialResponse
     */
    public DeleteSCIMServerCredentialResponse deleteSCIMServerCredentialWithOptions(DeleteSCIMServerCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSCIMServerCredential"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSCIMServerCredentialResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a SCIM credential is deleted, the synchronization task that uses the SCIM credential fails.
     * This topic provides an example on how to delete the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request DeleteSCIMServerCredentialRequest
     * @return DeleteSCIMServerCredentialResponse
     */
    public DeleteSCIMServerCredentialResponse deleteSCIMServerCredential(DeleteSCIMServerCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSCIMServerCredentialWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you delete a user, make sure that the user is not associated with the following resources. Otherwise, the deletion fails.</p>
     * <ul>
     * <li>Multi-factor authentication (MFA) devices: You must delete the MFA devices bound to the user. For more information, see <a href="https://help.aliyun.com/document_detail/341675.html">DeleteMFADeviceForUser</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the user. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Groups: You must remove the user from groups. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a user that is synchronized by using SCIM.
     * This topic provides an example on how to delete the user whose ID is <code>u-00q8wbq42wiltcrk****</code>.</p>
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
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2021-05-15"),
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
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>Before you delete a user, make sure that the user is not associated with the following resources. Otherwise, the deletion fails.</p>
     * <ul>
     * <li>Multi-factor authentication (MFA) devices: You must delete the MFA devices bound to the user. For more information, see <a href="https://help.aliyun.com/document_detail/341675.html">DeleteMFADeviceForUser</a>.</li>
     * <li>Access permissions: You must remove the access permissions on the accounts in your resource directory from the user. For more information, see <a href="https://help.aliyun.com/document_detail/338350.html">DeleteAccessAssignment</a>.</li>
     * <li>Groups: You must remove the user from groups. For more information, see <a href="https://help.aliyun.com/document_detail/335116.html">RemoveUserFromGroup</a>.</li>
     * </ul>
     * <h3><a href="#"></a>Precautions</h3>
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot delete a user that is synchronized by using SCIM.
     * This topic provides an example on how to delete the user whose ID is <code>u-00q8wbq42wiltcrk****</code>.</p>
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
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request DeleteUserProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserProvisioningResponse
     */
    public DeleteUserProvisioningResponse deleteUserProvisioningWithOptions(DeleteUserProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletionStrategy)) {
            query.put("DeletionStrategy", request.deletionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserProvisioning"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserProvisioningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request DeleteUserProvisioningRequest
     * @return DeleteUserProvisioningResponse
     */
    public DeleteUserProvisioningResponse deleteUserProvisioning(DeleteUserProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) user provisioning event.</p>
     * 
     * @param request DeleteUserProvisioningEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserProvisioningEventResponse
     */
    public DeleteUserProvisioningEventResponse deleteUserProvisioningEventWithOptions(DeleteUserProvisioningEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserProvisioningEvent"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserProvisioningEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Resource Access Management (RAM) user provisioning event.</p>
     * 
     * @param request DeleteUserProvisioningEventRequest
     * @return DeleteUserProvisioningEventResponse
     */
    public DeleteUserProvisioningEventResponse deleteUserProvisioningEvent(DeleteUserProvisioningEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserProvisioningEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to de-provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> from the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>De-provisions an access configuration from an account in your resource directory.</p>
     * 
     * @param request DeprovisionAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeprovisionAccessConfigurationResponse
     */
    public DeprovisionAccessConfigurationResponse deprovisionAccessConfigurationWithOptions(DeprovisionAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeprovisionAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeprovisionAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to de-provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> from the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>De-provisions an access configuration from an account in your resource directory.</p>
     * 
     * @param request DeprovisionAccessConfigurationRequest
     * @return DeprovisionAccessConfigurationResponse
     */
    public DeprovisionAccessConfigurationResponse deprovisionAccessConfiguration(DeprovisionAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deprovisionAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the delegated administrator account of CloudSSO.</p>
     * 
     * @param request DisableDelegateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDelegateAccountResponse
     */
    public DisableDelegateAccountResponse disableDelegateAccountWithOptions(DisableDelegateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDelegateAccount"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDelegateAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the delegated administrator account of CloudSSO.</p>
     * 
     * @param request DisableDelegateAccountRequest
     * @return DisableDelegateAccountResponse
     */
    public DisableDelegateAccountResponse disableDelegateAccount(DisableDelegateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDelegateAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If your CloudSSO has no directory, you can disable CloudSSO based on your business requirements. After you disable CloudSSO, you can enable it at any time.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables CloudSSO.</p>
     * 
     * @param request DisableServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableServiceResponse
     */
    public DisableServiceResponse disableServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableService"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>If your CloudSSO has no directory, you can disable CloudSSO based on your business requirements. After you disable CloudSSO, you can enable it at any time.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables CloudSSO.</p>
     * @return DisableServiceResponse
     */
    public DisableServiceResponse disableService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use the management account of a resource directory to specify a member of the resource directory as the delegated administrator account of CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/208117.html">Add a delegated administrator account</a>.
     * After the delegated administrator account of CloudSSO is specified, you can call this operation to enable the delegated administrator account of CloudSSO to manage CloudSSO resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the delegated administrator account of CloudSSO.</p>
     * 
     * @param request EnableDelegateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDelegateAccountResponse
     */
    public EnableDelegateAccountResponse enableDelegateAccountWithOptions(EnableDelegateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountId)) {
            query.put("AccountId", request.accountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDelegateAccount"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDelegateAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use the management account of a resource directory to specify a member of the resource directory as the delegated administrator account of CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/208117.html">Add a delegated administrator account</a>.
     * After the delegated administrator account of CloudSSO is specified, you can call this operation to enable the delegated administrator account of CloudSSO to manage CloudSSO resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables the delegated administrator account of CloudSSO.</p>
     * 
     * @param request EnableDelegateAccountRequest
     * @return EnableDelegateAccountResponse
     */
    public EnableDelegateAccountResponse enableDelegateAccount(EnableDelegateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDelegateAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if your account belongs to the management account that is used to enable a resource directory and has the permissions to enable CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/262819.html">Enable CloudSSO</a>.
     * If you call this operation, you agree to the <a href="https://www.alibabacloud.com/help/doc-detail/42416.htm">Alibaba Cloud International Website Product Terms of Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables CloudSSO.</p>
     * 
     * @param request EnableServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableServiceResponse
     */
    public EnableServiceResponse enableServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableService"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation only if your account belongs to the management account that is used to enable a resource directory and has the permissions to enable CloudSSO. For more information, see <a href="https://help.aliyun.com/document_detail/262819.html">Enable CloudSSO</a>.
     * If you call this operation, you agree to the <a href="https://www.alibabacloud.com/help/doc-detail/42416.htm">Alibaba Cloud International Website Product Terms of Service</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables CloudSSO.</p>
     * @return EnableServiceResponse
     */
    public EnableServiceResponse enableService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the access configuration whose ID is <code>ac-00ccule7tadaijxc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an access configuration.</p>
     * 
     * @param request GetAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccessConfigurationResponse
     */
    public GetAccessConfigurationResponse getAccessConfigurationWithOptions(GetAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the access configuration whose ID is <code>ac-00ccule7tadaijxc****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an access configuration.</p>
     * 
     * @param request GetAccessConfigurationRequest
     * @return GetAccessConfigurationResponse
     */
    public GetAccessConfigurationResponse getAccessConfiguration(GetAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the directory whose ID is <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a directory.</p>
     * 
     * @param request GetDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectoryResponse
     */
    public GetDirectoryResponse getDirectoryWithOptions(GetDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectory"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the directory whose ID is <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a directory.</p>
     * 
     * @param request GetDirectoryRequest
     * @return GetDirectoryResponse
     */
    public GetDirectoryResponse getDirectory(GetDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an identity provider (IdP).
     * This topic provides an example on how to query information about the SP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a Security Assertion Markup Language (SAML) service provider (SP).</p>
     * 
     * @param request GetDirectorySAMLServiceProviderInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectorySAMLServiceProviderInfoResponse
     */
    public GetDirectorySAMLServiceProviderInfoResponse getDirectorySAMLServiceProviderInfoWithOptions(GetDirectorySAMLServiceProviderInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectorySAMLServiceProviderInfo"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectorySAMLServiceProviderInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is an SP, and the identity management system of an enterprise is an identity provider (IdP).
     * This topic provides an example on how to query information about the SP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a Security Assertion Markup Language (SAML) service provider (SP).</p>
     * 
     * @param request GetDirectorySAMLServiceProviderInfoRequest
     * @return GetDirectorySAMLServiceProviderInfoResponse
     */
    public GetDirectorySAMLServiceProviderInfoResponse getDirectorySAMLServiceProviderInfo(GetDirectorySAMLServiceProviderInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectorySAMLServiceProviderInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of a directory whose ID is <code>d-00fc2p61****</code>. The statistics include the number of users, quota for users, number of groups, quota for groups, number of access configurations, quota for access configurations, number of access permissions that are assigned, number of system policies that can be configured for an access configuration, number of System for Cross-domain Identity Management (SCIM) credentials, number of asynchronous tasks, status of single sign-on (SSO) logon, and status of SCIM synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of a directory.</p>
     * 
     * @param request GetDirectoryStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDirectoryStatisticsResponse
     */
    public GetDirectoryStatisticsResponse getDirectoryStatisticsWithOptions(GetDirectoryStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDirectoryStatistics"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDirectoryStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of a directory whose ID is <code>d-00fc2p61****</code>. The statistics include the number of users, quota for users, number of groups, quota for groups, number of access configurations, quota for access configurations, number of access permissions that are assigned, number of system policies that can be configured for an access configuration, number of System for Cross-domain Identity Management (SCIM) credentials, number of asynchronous tasks, status of single sign-on (SSO) logon, and status of SCIM synchronization.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of a directory.</p>
     * 
     * @param request GetDirectoryStatisticsRequest
     * @return GetDirectoryStatisticsResponse
     */
    public GetDirectoryStatisticsResponse getDirectoryStatistics(GetDirectoryStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDirectoryStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request GetExternalSAMLIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetExternalSAMLIdentityProviderResponse
     */
    public GetExternalSAMLIdentityProviderResponse getExternalSAMLIdentityProviderWithOptions(GetExternalSAMLIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetExternalSAMLIdentityProvider"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetExternalSAMLIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the configurations of the SAML IdP within the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request GetExternalSAMLIdentityProviderRequest
     * @return GetExternalSAMLIdentityProviderResponse
     */
    public GetExternalSAMLIdentityProviderResponse getExternalSAMLIdentityProvider(GetExternalSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getExternalSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the group <code>g-00jqzghi2n3o5hkh****</code> in the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a group.</p>
     * 
     * @param request GetGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the group <code>g-00jqzghi2n3o5hkh****</code> in the directory <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a group.</p>
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
     * <p>Queries the logon preference of CloudSSO users.</p>
     * 
     * @param request GetLoginPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginPreferenceResponse
     */
    public GetLoginPreferenceResponse getLoginPreferenceWithOptions(GetLoginPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginPreference"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>summary</b> : 
     * <p>Queries the logon preference of CloudSSO users.</p>
     * 
     * @param request GetLoginPreferenceRequest
     * @return GetLoginPreferenceResponse
     */
    public GetLoginPreferenceResponse getLoginPreference(GetLoginPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can query the MFA setting for the users.
     * This topic provides an example on how to query the MFA setting of all CloudSSO users that belong to the directory named <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request GetMFAAuthenticationSettingInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMFAAuthenticationSettingInfoResponse
     */
    public GetMFAAuthenticationSettingInfoResponse getMFAAuthenticationSettingInfoWithOptions(GetMFAAuthenticationSettingInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMFAAuthenticationSettingInfo"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMFAAuthenticationSettingInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can query the MFA setting for the users.
     * This topic provides an example on how to query the MFA setting of all CloudSSO users that belong to the directory named <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request GetMFAAuthenticationSettingInfoRequest
     * @return GetMFAAuthenticationSettingInfoResponse
     */
    public GetMFAAuthenticationSettingInfoResponse getMFAAuthenticationSettingInfo(GetMFAAuthenticationSettingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMFAAuthenticationSettingInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is no longer maintained and updated. You can call the <a href="https://help.aliyun.com/document_detail/611286.html">GetMFAAuthenticationSettingInfo</a> operation to query more detailed information.
     * This topic provides an example on how to query the MFA setting of the users that belong to the directory named <code>d-00fc2p61****</code>. The returned result shows that MFA is enabled for all the users.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request GetMFAAuthenticationSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMFAAuthenticationSettingsResponse
     */
    public GetMFAAuthenticationSettingsResponse getMFAAuthenticationSettingsWithOptions(GetMFAAuthenticationSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMFAAuthenticationSettings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMFAAuthenticationSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> This operation is no longer maintained and updated. You can call the <a href="https://help.aliyun.com/document_detail/611286.html">GetMFAAuthenticationSettingInfo</a> operation to query more detailed information.
     * This topic provides an example on how to query the MFA setting of the users that belong to the directory named <code>d-00fc2p61****</code>. The returned result shows that MFA is enabled for all the users.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request GetMFAAuthenticationSettingsRequest
     * @return GetMFAAuthenticationSettingsResponse
     */
    public GetMFAAuthenticationSettingsResponse getMFAAuthenticationSettings(GetMFAAuthenticationSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMFAAuthenticationSettingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to check whether MFA is enabled for users in the directory whose ID is <code>d-00fc2p61****</code>. The returned result shows that MFA is in the Enabled state.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether multi-factor authentication (MFA) is enabled for users.</p>
     * 
     * @param request GetMFAAuthenticationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMFAAuthenticationStatusResponse
     */
    public GetMFAAuthenticationStatusResponse getMFAAuthenticationStatusWithOptions(GetMFAAuthenticationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMFAAuthenticationStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMFAAuthenticationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to check whether MFA is enabled for users in the directory whose ID is <code>d-00fc2p61****</code>. The returned result shows that MFA is in the Enabled state.</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether multi-factor authentication (MFA) is enabled for users.</p>
     * 
     * @param request GetMFAAuthenticationStatusRequest
     * @return GetMFAAuthenticationStatusResponse
     */
    public GetMFAAuthenticationStatusResponse getMFAAuthenticationStatus(GetMFAAuthenticationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMFAAuthenticationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password policy of CloudSSO users.</p>
     * 
     * @param request GetPasswordPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordPolicyResponse
     */
    public GetPasswordPolicyResponse getPasswordPolicyWithOptions(GetPasswordPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordPolicy"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>Queries the password policy of CloudSSO users.</p>
     * 
     * @param request GetPasswordPolicyRequest
     * @return GetPasswordPolicyResponse
     */
    public GetPasswordPolicyResponse getPasswordPolicy(GetPasswordPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the status of SCIM synchronization within the directory <code>d-00fc2p61****</code>. The returned result shows that SCIM synchronization is in the Enabled state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of System for Cross-domain Identity Management (SCIM) synchronization.</p>
     * 
     * @param request GetSCIMSynchronizationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSCIMSynchronizationStatusResponse
     */
    public GetSCIMSynchronizationStatusResponse getSCIMSynchronizationStatusWithOptions(GetSCIMSynchronizationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSCIMSynchronizationStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSCIMSynchronizationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the status of SCIM synchronization within the directory <code>d-00fc2p61****</code>. The returned result shows that SCIM synchronization is in the Enabled state.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of System for Cross-domain Identity Management (SCIM) synchronization.</p>
     * 
     * @param request GetSCIMSynchronizationStatusRequest
     * @return GetSCIMSynchronizationStatusResponse
     */
    public GetSCIMSynchronizationStatusResponse getSCIMSynchronizationStatus(GetSCIMSynchronizationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSCIMSynchronizationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of CloudSSO.</p>
     * 
     * @param request GetServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceStatusResponse
     */
    public GetServiceStatusResponse getServiceStatusWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of CloudSSO.</p>
     * @return GetServiceStatusResponse
     */
    public GetServiceStatusResponse getServiceStatus() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceStatusWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an asynchronous task.</p>
     * 
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about an asynchronous task.</p>
     * 
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the GetTaskStatus operation to query the status of an asynchronous task. If you want to query more information about an asynchronous task, call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation.
     * This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous task.</p>
     * 
     * @param request GetTaskStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatusWithOptions(GetTaskStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the GetTaskStatus operation to query the status of an asynchronous task. If you want to query more information about an asynchronous task, call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation.
     * This topic provides an example on how to query the information about the task whose ID is <code>t-shfqw1u1edszvxw5****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of an asynchronous task.</p>
     * 
     * @param request GetTaskStatusRequest
     * @return GetTaskStatusResponse
     */
    public GetTaskStatusResponse getTaskStatus(GetTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query information about the user whose ID is <code>u-00q8wbq42wiltcrk****</code> in the <code>d-00fc2p61****</code> directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a user.</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>This topic provides an example on how to query information about the user whose ID is <code>u-00q8wbq42wiltcrk****</code> in the <code>d-00fc2p61****</code> directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about a user.</p>
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
     * <p>Queries the ID of a user in a resource directory by using the ExternalId parameter.</p>
     * 
     * @param tmpReq GetUserIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserIdResponse
     */
    public GetUserIdResponse getUserIdWithOptions(GetUserIdRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetUserIdShrinkRequest request = new GetUserIdShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.externalId)) {
            request.externalIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.externalId, "ExternalId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalIdShrink)) {
            query.put("ExternalId", request.externalIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserId"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of a user in a resource directory by using the ExternalId parameter.</p>
     * 
     * @param request GetUserIdRequest
     * @return GetUserIdResponse
     */
    public GetUserIdResponse getUserId(GetUserIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA setting of the user named <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that MFA is enabled for the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of a single user.</p>
     * 
     * @param request GetUserMFAAuthenticationSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserMFAAuthenticationSettingsResponse
     */
    public GetUserMFAAuthenticationSettingsResponse getUserMFAAuthenticationSettingsWithOptions(GetUserMFAAuthenticationSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserMFAAuthenticationSettings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserMFAAuthenticationSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA setting of the user named <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that MFA is enabled for the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) setting of a single user.</p>
     * 
     * @param request GetUserMFAAuthenticationSettingsRequest
     * @return GetUserMFAAuthenticationSettingsResponse
     */
    public GetUserMFAAuthenticationSettingsResponse getUserMFAAuthenticationSettings(GetUserMFAAuthenticationSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserMFAAuthenticationSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserProvisioningResponse
     */
    public GetUserProvisioningResponse getUserProvisioningWithOptions(GetUserProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserProvisioning"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserProvisioningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningRequest
     * @return GetUserProvisioningResponse
     */
    public GetUserProvisioningResponse getUserProvisioning(GetUserProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configurations of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserProvisioningConfigurationResponse
     */
    public GetUserProvisioningConfigurationResponse getUserProvisioningConfigurationWithOptions(GetUserProvisioningConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserProvisioningConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserProvisioningConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the global configurations of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningConfigurationRequest
     * @return GetUserProvisioningConfigurationResponse
     */
    public GetUserProvisioningConfigurationResponse getUserProvisioningConfiguration(GetUserProvisioningConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserProvisioningConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserProvisioningEventResponse
     */
    public GetUserProvisioningEventResponse getUserProvisioningEventWithOptions(GetUserProvisioningEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserProvisioningEvent"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserProvisioningEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningEventRequest
     * @return GetUserProvisioningEventResponse
     */
    public GetUserProvisioningEventResponse getUserProvisioningEvent(GetUserProvisioningEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserProvisioningEventWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics of Resource Access Management (RAM) user provisioning events that are created for the member in a resource directory.</p>
     * 
     * @param request GetUserProvisioningRdAccountStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserProvisioningRdAccountStatisticsResponse
     */
    public GetUserProvisioningRdAccountStatisticsResponse getUserProvisioningRdAccountStatisticsWithOptions(GetUserProvisioningRdAccountStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdMemberId)) {
            query.put("RdMemberId", request.rdMemberId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserProvisioningRdAccountStatistics"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserProvisioningRdAccountStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries statistics of Resource Access Management (RAM) user provisioning events that are created for the member in a resource directory.</p>
     * 
     * @param request GetUserProvisioningRdAccountStatisticsRequest
     * @return GetUserProvisioningRdAccountStatisticsResponse
     */
    public GetUserProvisioningRdAccountStatisticsResponse getUserProvisioningRdAccountStatistics(GetUserProvisioningRdAccountStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserProvisioningRdAccountStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserProvisioningStatisticsResponse
     */
    public GetUserProvisioningStatisticsResponse getUserProvisioningStatisticsWithOptions(GetUserProvisioningStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserProvisioningStatistics"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserProvisioningStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request GetUserProvisioningStatisticsRequest
     * @return GetUserProvisioningStatisticsResponse
     */
    public GetUserProvisioningStatisticsResponse getUserProvisioningStatistics(GetUserProvisioningStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserProvisioningStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the assigned access permissions on the account <code>114240524784****</code> in your resource directory. The returned result shows that access permissions on the account in your resource directory is assigned to one user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access permissions that are assigned.</p>
     * 
     * @param request ListAccessAssignmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessAssignmentsResponse
     */
    public ListAccessAssignmentsResponse listAccessAssignmentsWithOptions(ListAccessAssignmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessAssignments"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessAssignmentsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the assigned access permissions on the account <code>114240524784****</code> in your resource directory. The returned result shows that access permissions on the account in your resource directory is assigned to one user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access permissions that are assigned.</p>
     * 
     * @param request ListAccessAssignmentsRequest
     * @return ListAccessAssignmentsResponse
     */
    public ListAccessAssignmentsResponse listAccessAssignments(ListAccessAssignmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessAssignmentsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the accounts for which the access permission <code>ac-00ccule7tadaijxc****</code> is provisioned. The returned result shows that the access configuration is provisioned for two accounts in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access configurations that are provisioned.</p>
     * 
     * @param request ListAccessConfigurationProvisioningsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessConfigurationProvisioningsResponse
     */
    public ListAccessConfigurationProvisioningsResponse listAccessConfigurationProvisioningsWithOptions(ListAccessConfigurationProvisioningsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisioningStatus)) {
            query.put("ProvisioningStatus", request.provisioningStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessConfigurationProvisionings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessConfigurationProvisioningsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the accounts for which the access permission <code>ac-00ccule7tadaijxc****</code> is provisioned. The returned result shows that the access configuration is provisioned for two accounts in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the access configurations that are provisioned.</p>
     * 
     * @param request ListAccessConfigurationProvisioningsRequest
     * @return ListAccessConfigurationProvisioningsResponse
     */
    public ListAccessConfigurationProvisioningsResponse listAccessConfigurationProvisionings(ListAccessConfigurationProvisioningsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessConfigurationProvisioningsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the access configurations within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains the <code>VPC-Admin</code> and <code>ECS-Admin</code> access configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access configurations.</p>
     * 
     * @param request ListAccessConfigurationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAccessConfigurationsResponse
     */
    public ListAccessConfigurationsResponse listAccessConfigurationsWithOptions(ListAccessConfigurationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusNotifications)) {
            query.put("StatusNotifications", request.statusNotifications);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAccessConfigurations"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAccessConfigurationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the access configurations within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains the <code>VPC-Admin</code> and <code>ECS-Admin</code> access configurations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries access configurations.</p>
     * 
     * @param request ListAccessConfigurationsRequest
     * @return ListAccessConfigurationsResponse
     */
    public ListAccessConfigurationsResponse listAccessConfigurations(ListAccessConfigurationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAccessConfigurationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the directories within your Alibaba Cloud account. The returned result shows that only one directory with the ID <code>d-00fc2p61****</code> is created within your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries directories.</p>
     * 
     * @param request ListDirectoriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDirectoriesResponse
     */
    public ListDirectoriesResponse listDirectoriesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDirectories"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDirectoriesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the directories within your Alibaba Cloud account. The returned result shows that only one directory with the ID <code>d-00fc2p61****</code> is created within your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries directories.</p>
     * @return ListDirectoriesResponse
     */
    public ListDirectoriesResponse listDirectories() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDirectoriesWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SAML signing certificates within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains one SAML signing certificate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Security Assertion Markup Language (SAML) signing certificates.</p>
     * 
     * @param request ListExternalSAMLIdPCertificatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExternalSAMLIdPCertificatesResponse
     */
    public ListExternalSAMLIdPCertificatesResponse listExternalSAMLIdPCertificatesWithOptions(ListExternalSAMLIdPCertificatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListExternalSAMLIdPCertificates"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExternalSAMLIdPCertificatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SAML signing certificates within the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains one SAML signing certificate.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Security Assertion Markup Language (SAML) signing certificates.</p>
     * 
     * @param request ListExternalSAMLIdPCertificatesRequest
     * @return ListExternalSAMLIdPCertificatesResponse
     */
    public ListExternalSAMLIdPCertificatesResponse listExternalSAMLIdPCertificates(ListExternalSAMLIdPCertificatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExternalSAMLIdPCertificatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the users in the group <code>g-00jqzghi2n3o5hkh****</code>. The returned result shows that the group contains the user <code>Alice</code> and the user <code>user1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the users in a group.</p>
     * 
     * @param request ListGroupMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupMembersResponse
     */
    public ListGroupMembersResponse listGroupMembersWithOptions(ListGroupMembersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupMembers"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupMembersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the users in the group <code>g-00jqzghi2n3o5hkh****</code>. The returned result shows that the group contains the user <code>Alice</code> and the user <code>user1</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the users in a group.</p>
     * 
     * @param request ListGroupMembersRequest
     * @return ListGroupMembersResponse
     */
    public ListGroupMembersResponse listGroupMembers(ListGroupMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupMembersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups in the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains three groups. The groups <code>group1</code> and <code>group2</code> are synchronized from an external identity provider (IdP). The group <code>TestGroup</code> is manually created in CloudSSO.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries groups.</p>
     * 
     * @param request ListGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionType)) {
            query.put("ProvisionType", request.provisionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups in the directory <code>d-00fc2p61****</code>. The returned result shows that the directory contains three groups. The groups <code>group1</code> and <code>group2</code> are synchronized from an external identity provider (IdP). The group <code>TestGroup</code> is manually created in CloudSSO.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries groups.</p>
     * 
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups to which the user <code>u-00q8wbq42wiltcrk****</code> is added. The returned result shows that the user is added to both the <code>TestGroup</code> and the <code>group1</code> groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the groups to which a user is added.</p>
     * 
     * @param request ListJoinedGroupsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJoinedGroupsForUserResponse
     */
    public ListJoinedGroupsForUserResponse listJoinedGroupsForUserWithOptions(ListJoinedGroupsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJoinedGroupsForUser"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJoinedGroupsForUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the groups to which the user <code>u-00q8wbq42wiltcrk****</code> is added. The returned result shows that the user is added to both the <code>TestGroup</code> and the <code>group1</code> groups.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the groups to which a user is added.</p>
     * 
     * @param request ListJoinedGroupsForUserRequest
     * @return ListJoinedGroupsForUserResponse
     */
    public ListJoinedGroupsForUserResponse listJoinedGroupsForUser(ListJoinedGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJoinedGroupsForUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA devices that are bound to the user <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that the MFA device named <code>Alice-MFA1</code> is bound to the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) devices that are bound to a user. Up to two MFA devices can be bound to a user.</p>
     * 
     * @param request ListMFADevicesForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListMFADevicesForUserResponse
     */
    public ListMFADevicesForUserResponse listMFADevicesForUserWithOptions(ListMFADevicesForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMFADevicesForUser"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMFADevicesForUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the MFA devices that are bound to the user <code>u-00q8wbq42wiltcrk****</code>. The returned result shows that the MFA device named <code>Alice-MFA1</code> is bound to the user.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the multi-factor authentication (MFA) devices that are bound to a user. Up to two MFA devices can be bound to a user.</p>
     * 
     * @param request ListMFADevicesForUserRequest
     * @return ListMFADevicesForUserResponse
     */
    public ListMFADevicesForUserResponse listMFADevicesForUser(ListMFADevicesForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listMFADevicesForUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the policies that are created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>. The returned result shows that the access configuration contains one system policy and one inline policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the policies that are created for an access configuration.</p>
     * 
     * @param request ListPermissionPoliciesInAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionPoliciesInAccessConfigurationResponse
     */
    public ListPermissionPoliciesInAccessConfigurationResponse listPermissionPoliciesInAccessConfigurationWithOptions(ListPermissionPoliciesInAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionPolicyType)) {
            query.put("PermissionPolicyType", request.permissionPolicyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissionPoliciesInAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionPoliciesInAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the policies that are created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>. The returned result shows that the access configuration contains one system policy and one inline policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the policies that are created for an access configuration.</p>
     * 
     * @param request ListPermissionPoliciesInAccessConfigurationRequest
     * @return ListPermissionPoliciesInAccessConfigurationResponse
     */
    public ListPermissionPoliciesInAccessConfigurationResponse listPermissionPoliciesInAccessConfiguration(ListPermissionPoliciesInAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPermissionPoliciesInAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SCIM credentials within the <code>d-00fc2p61****</code> directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Cross-domain Identity Management (SCIM) credentials.</p>
     * 
     * @param request ListSCIMServerCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSCIMServerCredentialsResponse
     */
    public ListSCIMServerCredentialsResponse listSCIMServerCredentialsWithOptions(ListSCIMServerCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSCIMServerCredentials"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSCIMServerCredentialsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the SCIM credentials within the <code>d-00fc2p61****</code> directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries Cross-domain Identity Management (SCIM) credentials.</p>
     * 
     * @param request ListSCIMServerCredentialsRequest
     * @return ListSCIMServerCredentialsResponse
     */
    public ListSCIMServerCredentialsResponse listSCIMServerCredentials(ListSCIMServerCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSCIMServerCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation queries the tasks within the previous 24 hours. This operation allows you to query the tasks within a maximum of 7 days. You can specify the start time of the query by using <code>Filter</code>.
     * This topic provides an example on how to query the tasks within the previous 24 hours.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries asynchronous tasks.</p>
     * 
     * @param request ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>By default, this operation queries the tasks within the previous 24 hours. This operation allows you to query the tasks within a maximum of 7 days. You can specify the start time of the query by using <code>Filter</code>.
     * This topic provides an example on how to query the tasks within the previous 24 hours.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries asynchronous tasks.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Resource Access Management (RAM) user provisioning events.</p>
     * 
     * @param request ListUserProvisioningEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserProvisioningEventsResponse
     */
    public ListUserProvisioningEventsResponse listUserProvisioningEventsWithOptions(ListUserProvisioningEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserProvisioningEvents"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserProvisioningEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Resource Access Management (RAM) user provisioning events.</p>
     * 
     * @param request ListUserProvisioningEventsRequest
     * @return ListUserProvisioningEventsResponse
     */
    public ListUserProvisioningEventsResponse listUserProvisioningEvents(ListUserProvisioningEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserProvisioningEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Resource Access Management (RAM) user provisionings.</p>
     * 
     * @param request ListUserProvisioningsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserProvisioningsResponse
     */
    public ListUserProvisioningsResponse listUserProvisioningsWithOptions(ListUserProvisioningsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalId)) {
            query.put("PrincipalId", request.principalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalType)) {
            query.put("PrincipalType", request.principalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserProvisionings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserProvisioningsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Resource Access Management (RAM) user provisionings.</p>
     * 
     * @param request ListUserProvisioningsRequest
     * @return ListUserProvisioningsResponse
     */
    public ListUserProvisioningsResponse listUserProvisionings(ListUserProvisioningsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserProvisioningsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query users in the <code>d-00fc2p61****</code> directory. The returned result shows that the directory contains two users. The user <code>AliceLee</code> is synchronized from an external identity provider (IdP). The user <code>user1</code> is manually created within CloudSSO.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries users.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionType)) {
            query.put("ProvisionType", request.provisionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            query.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>This topic provides an example on how to query users in the <code>d-00fc2p61****</code> directory. The returned result shows that the directory contains two users. The user <code>AliceLee</code> is synchronized from an external identity provider (IdP). The user <code>user1</code> is manually created within CloudSSO.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries users.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> for the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Provisions an access configuration for an account in your resource directory.</p>
     * 
     * @param request ProvisionAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ProvisionAccessConfigurationResponse
     */
    public ProvisionAccessConfigurationResponse provisionAccessConfigurationWithOptions(ProvisionAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ProvisionAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ProvisionAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, an asynchronous task is automatically created. You can call the <a href="https://help.aliyun.com/document_detail/340670.html">GetTask</a> operation to query the progress of the task based on the value of the <code>TaskId</code> response parameter.
     * This topic provides an example on how to provision the access configuration <code>ac-00jhtfl8thteu6uj****</code> for the account <code>114240524784****</code> in your resource directory.</p>
     * 
     * <b>summary</b> : 
     * <p>Provisions an access configuration for an account in your resource directory.</p>
     * 
     * @param request ProvisionAccessConfigurationRequest
     * @return ProvisionAccessConfigurationResponse
     */
    public ProvisionAccessConfigurationResponse provisionAccessConfiguration(ProvisionAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.provisionAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to remove the SAML signing certificate whose ID is <code>idp-c-00dt9gnl7fmjaw9c****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Security Assertion Markup Language (SAML) signing certificate.</p>
     * 
     * @param request RemoveExternalSAMLIdPCertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveExternalSAMLIdPCertificateResponse
     */
    public RemoveExternalSAMLIdPCertificateResponse removeExternalSAMLIdPCertificateWithOptions(RemoveExternalSAMLIdPCertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.certificateId)) {
            query.put("CertificateId", request.certificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveExternalSAMLIdPCertificate"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveExternalSAMLIdPCertificateResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to remove the SAML signing certificate whose ID is <code>idp-c-00dt9gnl7fmjaw9c****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a Security Assertion Markup Language (SAML) signing certificate.</p>
     * 
     * @param request RemoveExternalSAMLIdPCertificateRequest
     * @return RemoveExternalSAMLIdPCertificateResponse
     */
    public RemoveExternalSAMLIdPCertificateResponse removeExternalSAMLIdPCertificate(RemoveExternalSAMLIdPCertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeExternalSAMLIdPCertificateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you remove an inline policy from an access configuration, the policy cannot be restored.
     * This topic provides an example on how to remove the system policy <code>AliyunECSFullAccess</code> from the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a policy from an access configuration.</p>
     * 
     * @param request RemovePermissionPolicyFromAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePermissionPolicyFromAccessConfigurationResponse
     */
    public RemovePermissionPolicyFromAccessConfigurationResponse removePermissionPolicyFromAccessConfigurationWithOptions(RemovePermissionPolicyFromAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionPolicyName)) {
            query.put("PermissionPolicyName", request.permissionPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionPolicyType)) {
            query.put("PermissionPolicyType", request.permissionPolicyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePermissionPolicyFromAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePermissionPolicyFromAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you remove an inline policy from an access configuration, the policy cannot be restored.
     * This topic provides an example on how to remove the system policy <code>AliyunECSFullAccess</code> from the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a policy from an access configuration.</p>
     * 
     * @param request RemovePermissionPolicyFromAccessConfigurationRequest
     * @return RemovePermissionPolicyFromAccessConfigurationResponse
     */
    public RemovePermissionPolicyFromAccessConfigurationResponse removePermissionPolicyFromAccessConfiguration(RemovePermissionPolicyFromAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePermissionPolicyFromAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot remove a user from a group that is synchronized by using SCIM.
     * This topic provides an example on how to remove the user <code>u-00q8wbq42wiltcrk****</code> from the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a user from a group.</p>
     * 
     * @param request RemoveUserFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromGroupResponse
     */
    public RemoveUserFromGroupResponse removeUserFromGroupWithOptions(RemoveUserFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot remove a user from a group that is synchronized by using SCIM.
     * This topic provides an example on how to remove the user <code>u-00q8wbq42wiltcrk****</code> from the group <code>g-00jqzghi2n3o5hkh****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a user from a group.</p>
     * 
     * @param request RemoveUserFromGroupRequest
     * @return RemoveUserFromGroupResponse
     */
    public RemoveUserFromGroupResponse removeUserFromGroup(RemoveUserFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a user forgets the password, the password expires, or the password poses security risks, a CloudSSO administrator can reset the password for the user.</p>
     * <blockquote>
     * <p> After you enable single sign-on (SSO) logon, the password of a user cannot be reset.
     * This topic provides an example on how to reset the password of the user <code>u-00q8wbq42wiltcrk****</code>. The new password is automatically generated by the system.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a user.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.generateRandomPassword)) {
            query.put("GenerateRandomPassword", request.generateRandomPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requirePasswordResetForNextLogin)) {
            query.put("RequirePasswordResetForNextLogin", request.requirePasswordResetForNextLogin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserPassword"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>If a user forgets the password, the password expires, or the password poses security risks, a CloudSSO administrator can reset the password for the user.</p>
     * <blockquote>
     * <p> After you enable single sign-on (SSO) logon, the password of a user cannot be reset.
     * This topic provides an example on how to reset the password of the user <code>u-00q8wbq42wiltcrk****</code>. The new password is automatically generated by the system.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a user.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPassword(ResetUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a Resource Access Management (RAM) user provisioning event.</p>
     * 
     * @param request RetryUserProvisioningEventRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryUserProvisioningEventResponse
     */
    public RetryUserProvisioningEventResponse retryUserProvisioningEventWithOptions(RetryUserProvisioningEventRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duplicationStrategy)) {
            query.put("DuplicationStrategy", request.duplicationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventId)) {
            query.put("EventId", request.eventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryUserProvisioningEvent"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryUserProvisioningEventResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retries a Resource Access Management (RAM) user provisioning event.</p>
     * 
     * @param request RetryUserProvisioningEventRequest
     * @return RetryUserProvisioningEventResponse
     */
    public RetryUserProvisioningEventResponse retryUserProvisioningEvent(RetryUserProvisioningEventRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryUserProvisioningEventWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is a service provider (SP), and the identity management system of an enterprise is an IdP.
     * You can use one of the following methods to configure a SAML IdP. You can obtain the required metadata file or parameter values from your IdP.</p>
     * <ul>
     * <li>Use the metadata file: You can specify the <code>EncodedMetadataDocument</code> parameter to upload the metadata file.</li>
     * <li>Manually configure the IdP: You can manually specify the following parameters for your IdP: <code>EntityId</code>, <code>LoginUrl</code>, <code>WantRequestSigned</code>, and <code>X509Certificate</code>.
     * If you have configured a SAML IdP, the existing configurations are replaced after you call this operation.</li>
     * <li>If the IdP is configured by using the metadata file, all existing configurations are replaced with new configurations.</li>
     * <li>If the IdP is manually configured, the original parameter values that are different from the new parameter values are replaced.<blockquote>
     * <p> If SSO logon is enabled, new configurations immediately take effect. Take note of the impacts on the production environment.
     * This topic provides an example on how to configure an IdP by using the metadata file within the directory <code>d-00fc2p61****</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request SetExternalSAMLIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetExternalSAMLIdentityProviderResponse
     */
    public SetExternalSAMLIdentityProviderResponse setExternalSAMLIdentityProviderWithOptions(SetExternalSAMLIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bindingType)) {
            query.put("BindingType", request.bindingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodedMetadataDocument)) {
            query.put("EncodedMetadataDocument", request.encodedMetadataDocument);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityId)) {
            query.put("EntityId", request.entityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginUrl)) {
            query.put("LoginUrl", request.loginUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSOStatus)) {
            query.put("SSOStatus", request.SSOStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wantRequestSigned)) {
            query.put("WantRequestSigned", request.wantRequestSigned);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.x509Certificate)) {
            query.put("X509Certificate", request.x509Certificate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetExternalSAMLIdentityProvider"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetExternalSAMLIdentityProviderResponse());
    }

    /**
     * <b>description</b> :
     * <p>During SAML 2.0-based single sign-on (SSO) logon, CloudSSO is a service provider (SP), and the identity management system of an enterprise is an IdP.
     * You can use one of the following methods to configure a SAML IdP. You can obtain the required metadata file or parameter values from your IdP.</p>
     * <ul>
     * <li>Use the metadata file: You can specify the <code>EncodedMetadataDocument</code> parameter to upload the metadata file.</li>
     * <li>Manually configure the IdP: You can manually specify the following parameters for your IdP: <code>EntityId</code>, <code>LoginUrl</code>, <code>WantRequestSigned</code>, and <code>X509Certificate</code>.
     * If you have configured a SAML IdP, the existing configurations are replaced after you call this operation.</li>
     * <li>If the IdP is configured by using the metadata file, all existing configurations are replaced with new configurations.</li>
     * <li>If the IdP is manually configured, the original parameter values that are different from the new parameter values are replaced.<blockquote>
     * <p> If SSO logon is enabled, new configurations immediately take effect. Take note of the impacts on the production environment.
     * This topic provides an example on how to configure an IdP by using the metadata file within the directory <code>d-00fc2p61****</code>.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures a Security Assertion Markup Language (SAML) identity provider (IdP).</p>
     * 
     * @param request SetExternalSAMLIdentityProviderRequest
     * @return SetExternalSAMLIdentityProviderResponse
     */
    public SetExternalSAMLIdentityProviderResponse setExternalSAMLIdentityProvider(SetExternalSAMLIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setExternalSAMLIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the logon preference of CloudSSO users.</p>
     * 
     * @param request SetLoginPreferenceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoginPreferenceResponse
     */
    public SetLoginPreferenceResponse setLoginPreferenceWithOptions(SetLoginPreferenceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowUserToGetCredentials)) {
            query.put("AllowUserToGetCredentials", request.allowUserToGetCredentials);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginNetworkMasks)) {
            query.put("LoginNetworkMasks", request.loginNetworkMasks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoginPreference"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoginPreferenceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the logon preference of CloudSSO users.</p>
     * 
     * @param request SetLoginPreferenceRequest
     * @return SetLoginPreferenceResponse
     */
    public SetLoginPreferenceResponse setLoginPreference(SetLoginPreferenceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoginPreferenceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a CloudSSO administrator enables username-password logon for users, CloudSSO automatically enables MFA to improve security. The administrator can call this operation to enable or disable MFA based on the business requirements.
     * This topic provides an example on how to enable MFA for users.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables multi-factor authentication (MFA) for users in a directory.</p>
     * 
     * @param request SetMFAAuthenticationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetMFAAuthenticationStatusResponse
     */
    public SetMFAAuthenticationStatusResponse setMFAAuthenticationStatusWithOptions(SetMFAAuthenticationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MFAAuthenticationStatus)) {
            query.put("MFAAuthenticationStatus", request.MFAAuthenticationStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetMFAAuthenticationStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetMFAAuthenticationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>If a CloudSSO administrator enables username-password logon for users, CloudSSO automatically enables MFA to improve security. The administrator can call this operation to enable or disable MFA based on the business requirements.
     * This topic provides an example on how to enable MFA for users.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables multi-factor authentication (MFA) for users in a directory.</p>
     * 
     * @param request SetMFAAuthenticationStatusRequest
     * @return SetMFAAuthenticationStatusResponse
     */
    public SetMFAAuthenticationStatusResponse setMFAAuthenticationStatus(SetMFAAuthenticationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setMFAAuthenticationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password policy for CloudSSO users.</p>
     * 
     * @param request SetPasswordPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordPolicyResponse
     */
    public SetPasswordPolicyResponse setPasswordPolicyWithOptions(SetPasswordPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxLoginAttempts)) {
            query.put("MaxLoginAttempts", request.maxLoginAttempts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPasswordAge)) {
            query.put("MaxPasswordAge", request.maxPasswordAge);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPasswordDifferentChars)) {
            query.put("MinPasswordDifferentChars", request.minPasswordDifferentChars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPasswordLength)) {
            query.put("MinPasswordLength", request.minPasswordLength);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordNotContainUsername)) {
            query.put("PasswordNotContainUsername", request.passwordNotContainUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordReusePrevention)) {
            query.put("PasswordReusePrevention", request.passwordReusePrevention);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordPolicy"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>Configures a password policy for CloudSSO users.</p>
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
     * <p>You can synchronize users or groups from an external identity provider (IdP) that supports SCIM 2.0 to CloudSSO only after SCIM synchronization is enabled. If you disable SCIM synchronization, you can no longer synchronize users or groups to CloudSSO. The following list describes the impacts after SCIM synchronization is enabled or disabled:</p>
     * <ul>
     * <li>After you enable SCIM synchronization, you cannot modify or delete the users or groups that are synchronized to CloudSSO by using SCIM. In addition, you cannot add users to or remove users from the groups. However, you can change the passwords of the users and enable or disable the logon of the users.</li>
     * <li>After you disable SCIM synchronization, you can modify and delete the users and groups that are synchronized to CloudSSO by using SCIM. You can also add users to or remove users from the groups.
     * This topic provides an example on how to enable SCIM synchronization within the directory <code>d-00fc2p61****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables System for Cross-domain Identity Management (SCIM) synchronization.</p>
     * 
     * @param request SetSCIMSynchronizationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSCIMSynchronizationStatusResponse
     */
    public SetSCIMSynchronizationStatusResponse setSCIMSynchronizationStatusWithOptions(SetSCIMSynchronizationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SCIMSynchronizationStatus)) {
            query.put("SCIMSynchronizationStatus", request.SCIMSynchronizationStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSCIMSynchronizationStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSCIMSynchronizationStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can synchronize users or groups from an external identity provider (IdP) that supports SCIM 2.0 to CloudSSO only after SCIM synchronization is enabled. If you disable SCIM synchronization, you can no longer synchronize users or groups to CloudSSO. The following list describes the impacts after SCIM synchronization is enabled or disabled:</p>
     * <ul>
     * <li>After you enable SCIM synchronization, you cannot modify or delete the users or groups that are synchronized to CloudSSO by using SCIM. In addition, you cannot add users to or remove users from the groups. However, you can change the passwords of the users and enable or disable the logon of the users.</li>
     * <li>After you disable SCIM synchronization, you can modify and delete the users and groups that are synchronized to CloudSSO by using SCIM. You can also add users to or remove users from the groups.
     * This topic provides an example on how to enable SCIM synchronization within the directory <code>d-00fc2p61****</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables System for Cross-domain Identity Management (SCIM) synchronization.</p>
     * 
     * @param request SetSCIMSynchronizationStatusRequest
     * @return SetSCIMSynchronizationStatusResponse
     */
    public SetSCIMSynchronizationStatusResponse setSCIMSynchronizationStatus(SetSCIMSynchronizationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSCIMSynchronizationStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify the <code>Description</code>, <code>SessionDuration</code>, and <code>RelayState</code> parameters for an access configuration.
     * This topic provides an example on how to change the initial web page in the access configuration <code>ac-00jhtfl8thteu6uj****</code> to <code>https://cloudsso.console.aliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about an access configuration.</p>
     * 
     * @param request UpdateAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAccessConfigurationResponse
     */
    public UpdateAccessConfigurationResponse updateAccessConfigurationWithOptions(UpdateAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newRelayState)) {
            query.put("NewRelayState", request.newRelayState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSessionDuration)) {
            query.put("NewSessionDuration", request.newSessionDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can modify the <code>Description</code>, <code>SessionDuration</code>, and <code>RelayState</code> parameters for an access configuration.
     * This topic provides an example on how to change the initial web page in the access configuration <code>ac-00jhtfl8thteu6uj****</code> to <code>https://cloudsso.console.aliyun.com</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about an access configuration.</p>
     * 
     * @param request UpdateAccessConfigurationRequest
     * @return UpdateAccessConfigurationResponse
     */
    public UpdateAccessConfigurationResponse updateAccessConfiguration(UpdateAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you change the name of a directory, the URL that is used to log on to the CloudSSO user portal is changed. You must notify the CloudSSO users of the correct URL.
     * This topic provides an example on how to change the name of a directory to <code>new-example</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the name of a directory.</p>
     * 
     * @param request UpdateDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectoryWithOptions(UpdateDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDirectoryName)) {
            query.put("NewDirectoryName", request.newDirectoryName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDirectory"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you change the name of a directory, the URL that is used to log on to the CloudSSO user portal is changed. You must notify the CloudSSO users of the correct URL.
     * This topic provides an example on how to change the name of a directory to <code>new-example</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the name of a directory.</p>
     * 
     * @param request UpdateDirectoryRequest
     * @return UpdateDirectoryResponse
     */
    public UpdateDirectoryResponse updateDirectory(UpdateDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify <code>GroupName</code> and <code>Description</code> for a group.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify information about a group that is synchronized by using SCIM.
     * This topic provides an example on how to modify the name of the group <code>g-00jqzghi2n3o5hkh****</code> to <code>NewTestGroup</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a group.</p>
     * 
     * @param request UpdateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newGroupName)) {
            query.put("NewGroupName", request.newGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-05-15"),
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
     * <b>description</b> :
     * <p>You can modify <code>GroupName</code> and <code>Description</code> for a group.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify information about a group that is synchronized by using SCIM.
     * This topic provides an example on how to modify the name of the group <code>g-00jqzghi2n3o5hkh****</code> to <code>NewTestGroup</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a group.</p>
     * 
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an inline policy that is created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an inline policy that is created for an access configuration.</p>
     * 
     * @param request UpdateInlinePolicyForAccessConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInlinePolicyForAccessConfigurationResponse
     */
    public UpdateInlinePolicyForAccessConfigurationResponse updateInlinePolicyForAccessConfigurationWithOptions(UpdateInlinePolicyForAccessConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessConfigurationId)) {
            query.put("AccessConfigurationId", request.accessConfigurationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inlinePolicyName)) {
            query.put("InlinePolicyName", request.inlinePolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newInlinePolicyDocument)) {
            query.put("NewInlinePolicyDocument", request.newInlinePolicyDocument);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInlinePolicyForAccessConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInlinePolicyForAccessConfigurationResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to modify an inline policy that is created for the access configuration <code>ac-00jhtfl8thteu6uj****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an inline policy that is created for an access configuration.</p>
     * 
     * @param request UpdateInlinePolicyForAccessConfigurationRequest
     * @return UpdateInlinePolicyForAccessConfigurationResponse
     */
    public UpdateInlinePolicyForAccessConfigurationResponse updateInlinePolicyForAccessConfiguration(UpdateInlinePolicyForAccessConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInlinePolicyForAccessConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
     * This topic provides an example on how to enable MFA for all CloudSSO users that belong to the directory named <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request UpdateMFAAuthenticationSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateMFAAuthenticationSettingsResponse
     */
    public UpdateMFAAuthenticationSettingsResponse updateMFAAuthenticationSettingsWithOptions(UpdateMFAAuthenticationSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MFAAuthenticationSettings)) {
            query.put("MFAAuthenticationSettings", request.MFAAuthenticationSettings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationForRiskLogin)) {
            query.put("OperationForRiskLogin", request.operationForRiskLogin);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMFAAuthenticationSettings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMFAAuthenticationSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you enable username-password logon for CloudSSO users, you can also configure MFA for the users.
     * This topic provides an example on how to enable MFA for all CloudSSO users that belong to the directory named <code>d-00fc2p61****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the multi-factor authentication (MFA) setting of all users.</p>
     * 
     * @param request UpdateMFAAuthenticationSettingsRequest
     * @return UpdateMFAAuthenticationSettingsResponse
     */
    public UpdateMFAAuthenticationSettingsResponse updateMFAAuthenticationSettings(UpdateMFAAuthenticationSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateMFAAuthenticationSettingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>. After the SCIM credential is disabled, the synchronization task that uses the SCIM credential fails. You can call this operation again to enable the SCIM credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request UpdateSCIMServerCredentialStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSCIMServerCredentialStatusResponse
     */
    public UpdateSCIMServerCredentialStatusResponse updateSCIMServerCredentialStatusWithOptions(UpdateSCIMServerCredentialStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newStatus)) {
            query.put("NewStatus", request.newStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSCIMServerCredentialStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSCIMServerCredentialStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable the SCIM credential whose ID is <code>scimcred-004whl0kvfwcypbi****</code>. After the SCIM credential is disabled, the synchronization task that uses the SCIM credential fails. You can call this operation again to enable the SCIM credential.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a System for Cross-domain Identity Management (SCIM) credential.</p>
     * 
     * @param request UpdateSCIMServerCredentialStatusRequest
     * @return UpdateSCIMServerCredentialStatusResponse
     */
    public UpdateSCIMServerCredentialStatusResponse updateSCIMServerCredentialStatus(UpdateSCIMServerCredentialStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSCIMServerCredentialStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can modify <code>FirstName</code>, <code>LastName</code>, <code>DisplayName</code>, <code>Email</code>, and <code>Description</code> for a user. You cannot modify <code>UserName</code> for a user.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify information about a user that is synchronized by using SCIM.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a user.</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDisplayName)) {
            query.put("NewDisplayName", request.newDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newEmail)) {
            query.put("NewEmail", request.newEmail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newFirstName)) {
            query.put("NewFirstName", request.newFirstName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newLastName)) {
            query.put("NewLastName", request.newLastName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2021-05-15"),
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
     * <p>You can modify <code>FirstName</code>, <code>LastName</code>, <code>DisplayName</code>, <code>Email</code>, and <code>Description</code> for a user. You cannot modify <code>UserName</code> for a user.</p>
     * <blockquote>
     * <p> If System for Cross-domain Identity Management (SCIM) synchronization is enabled, you cannot modify information about a user that is synchronized by using SCIM.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a user.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you call the <a href="https://help.aliyun.com/document_detail/450134.html">UpdateMFAAuthenticationSettings</a> operation to set the MFAAuthenticationSettings parameter to <code>Byuser</code>, user-specific settings are applied. Then, you must call the UpdateUserMFAAuthenticationSettings operation to configure MFA for each user.
     * By default, the MFAAuthenticationSettings parameter is set to <code>Enabled</code> for a new user.
     * This topic provides an example on how to enable MFA for the user named <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the multi-factor authentication (MFA) setting of a single user.</p>
     * 
     * @param request UpdateUserMFAAuthenticationSettingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserMFAAuthenticationSettingsResponse
     */
    public UpdateUserMFAAuthenticationSettingsResponse updateUserMFAAuthenticationSettingsWithOptions(UpdateUserMFAAuthenticationSettingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMFAAuthenticationSettings)) {
            query.put("UserMFAAuthenticationSettings", request.userMFAAuthenticationSettings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserMFAAuthenticationSettings"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserMFAAuthenticationSettingsResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you call the <a href="https://help.aliyun.com/document_detail/450134.html">UpdateMFAAuthenticationSettings</a> operation to set the MFAAuthenticationSettings parameter to <code>Byuser</code>, user-specific settings are applied. Then, you must call the UpdateUserMFAAuthenticationSettings operation to configure MFA for each user.
     * By default, the MFAAuthenticationSettings parameter is set to <code>Enabled</code> for a new user.
     * This topic provides an example on how to enable MFA for the user named <code>u-00q8wbq42wiltcrk****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the multi-factor authentication (MFA) setting of a single user.</p>
     * 
     * @param request UpdateUserMFAAuthenticationSettingsRequest
     * @return UpdateUserMFAAuthenticationSettingsResponse
     */
    public UpdateUserMFAAuthenticationSettingsResponse updateUserMFAAuthenticationSettings(UpdateUserMFAAuthenticationSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserMFAAuthenticationSettingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request UpdateUserProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserProvisioningResponse
     */
    public UpdateUserProvisioningResponse updateUserProvisioningWithOptions(UpdateUserProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDeletionStrategy)) {
            query.put("NewDeletionStrategy", request.newDeletionStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDescription)) {
            query.put("NewDescription", request.newDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDuplicationStrategy)) {
            query.put("NewDuplicationStrategy", request.newDuplicationStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userProvisioningId)) {
            query.put("UserProvisioningId", request.userProvisioningId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserProvisioning"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserProvisioningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request UpdateUserProvisioningRequest
     * @return UpdateUserProvisioningResponse
     */
    public UpdateUserProvisioningResponse updateUserProvisioning(UpdateUserProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the global configurations of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request UpdateUserProvisioningConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserProvisioningConfigurationResponse
     */
    public UpdateUserProvisioningConfigurationResponse updateUserProvisioningConfigurationWithOptions(UpdateUserProvisioningConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newDefaultLandingPage)) {
            query.put("NewDefaultLandingPage", request.newDefaultLandingPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSessionDuration)) {
            query.put("NewSessionDuration", request.newSessionDuration);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserProvisioningConfiguration"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserProvisioningConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the global configurations of a Resource Access Management (RAM) user provisioning.</p>
     * 
     * @param request UpdateUserProvisioningConfigurationRequest
     * @return UpdateUserProvisioningConfigurationResponse
     */
    public UpdateUserProvisioningConfigurationResponse updateUserProvisioningConfiguration(UpdateUserProvisioningConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserProvisioningConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the status of the user whose ID is <code>u-00q8wbq42wiltcrk****</code> to Disabled. Users in the Disabled state cannot log on to the CloudSSO user portal.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a user.</p>
     * 
     * @param request UpdateUserStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserStatusResponse
     */
    public UpdateUserStatusResponse updateUserStatusWithOptions(UpdateUserStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.directoryId)) {
            query.put("DirectoryId", request.directoryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newStatus)) {
            query.put("NewStatus", request.newStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserStatus"),
            new TeaPair("version", "2021-05-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the status of the user whose ID is <code>u-00q8wbq42wiltcrk****</code> to Disabled. Users in the Disabled state cannot log on to the CloudSSO user portal.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the status of a user.</p>
     * 
     * @param request UpdateUserStatusRequest
     * @return UpdateUserStatusResponse
     */
    public UpdateUserStatusResponse updateUserStatus(UpdateUserStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserStatusWithOptions(request, runtime);
    }
}
