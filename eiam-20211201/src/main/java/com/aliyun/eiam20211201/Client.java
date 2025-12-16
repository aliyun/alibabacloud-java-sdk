// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201;

import com.aliyun.tea.*;
import com.aliyun.eiam20211201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eiam", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>在当前应用下给指定员工添加一个应用账号</p>
     * 
     * @param request AddApplicationAccountToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddApplicationAccountToUserResponse
     */
    public AddApplicationAccountToUserResponse addApplicationAccountToUserWithOptions(AddApplicationAccountToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationUsername)) {
            query.put("ApplicationUsername", request.applicationUsername);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddApplicationAccountToUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddApplicationAccountToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>在当前应用下给指定员工添加一个应用账号</p>
     * 
     * @param request AddApplicationAccountToUserRequest
     * @return AddApplicationAccountToUserResponse
     */
    public AddApplicationAccountToUserResponse addApplicationAccountToUser(AddApplicationAccountToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApplicationAccountToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加条款到品牌</p>
     * 
     * @param request AddCustomPrivacyPoliciesToBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddCustomPrivacyPoliciesToBrandResponse
     */
    public AddCustomPrivacyPoliciesToBrandResponse addCustomPrivacyPoliciesToBrandWithOptions(AddCustomPrivacyPoliciesToBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyIds)) {
            query.put("CustomPrivacyPolicyIds", request.customPrivacyPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddCustomPrivacyPoliciesToBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddCustomPrivacyPoliciesToBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加条款到品牌</p>
     * 
     * @param request AddCustomPrivacyPoliciesToBrandRequest
     * @return AddCustomPrivacyPoliciesToBrandResponse
     */
    public AddCustomPrivacyPoliciesToBrandResponse addCustomPrivacyPoliciesToBrand(AddCustomPrivacyPoliciesToBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addCustomPrivacyPoliciesToBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an Employee Identity and Access Management (EIAM) account to multiple EIAM organizations of Identity as a Service (IDaaS). If the account already exists in the organizational unit, the system directly returns a success response.</p>
     * 
     * @param request AddUserToOrganizationalUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToOrganizationalUnitsResponse
     */
    public AddUserToOrganizationalUnitsResponse addUserToOrganizationalUnitsWithOptions(AddUserToOrganizationalUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToOrganizationalUnits"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an Employee Identity and Access Management (EIAM) account to multiple EIAM organizations of Identity as a Service (IDaaS). If the account already exists in the organizational unit, the system directly returns a success response.</p>
     * 
     * @param request AddUserToOrganizationalUnitsRequest
     * @return AddUserToOrganizationalUnitsResponse
     */
    public AddUserToOrganizationalUnitsResponse addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds Employee Identity and Access Management (EIAM) accounts to an EIAM group of Identity as a Service (IDaaS).</p>
     * 
     * @param request AddUsersToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroupWithOptions(AddUsersToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUsersToGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUsersToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds Employee Identity and Access Management (EIAM) accounts to an EIAM group of Identity as a Service (IDaaS).</p>
     * 
     * @param request AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroup(AddUsersToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the permissions to access an application to multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request AuthorizeApplicationToGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeApplicationToGroupsResponse
     */
    public AuthorizeApplicationToGroupsResponse authorizeApplicationToGroupsWithOptions(AuthorizeApplicationToGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeApplicationToGroups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeApplicationToGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the permissions to access an application to multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request AuthorizeApplicationToGroupsRequest
     * @return AuthorizeApplicationToGroupsResponse
     */
    public AuthorizeApplicationToGroupsResponse authorizeApplicationToGroups(AuthorizeApplicationToGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) organizations at a time.</p>
     * 
     * @param request AuthorizeApplicationToOrganizationalUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeApplicationToOrganizationalUnitsResponse
     */
    public AuthorizeApplicationToOrganizationalUnitsResponse authorizeApplicationToOrganizationalUnitsWithOptions(AuthorizeApplicationToOrganizationalUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeApplicationToOrganizationalUnits"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeApplicationToOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) organizations at a time.</p>
     * 
     * @param request AuthorizeApplicationToOrganizationalUnitsRequest
     * @return AuthorizeApplicationToOrganizationalUnitsResponse
     */
    public AuthorizeApplicationToOrganizationalUnitsResponse authorizeApplicationToOrganizationalUnits(AuthorizeApplicationToOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) accounts at a time.</p>
     * 
     * @param request AuthorizeApplicationToUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeApplicationToUsersResponse
     */
    public AuthorizeApplicationToUsersResponse authorizeApplicationToUsersWithOptions(AuthorizeApplicationToUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeApplicationToUsers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeApplicationToUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) accounts at a time.</p>
     * 
     * @param request AuthorizeApplicationToUsersRequest
     * @return AuthorizeApplicationToUsersResponse
     */
    public AuthorizeApplicationToUsersResponse authorizeApplicationToUsers(AuthorizeApplicationToUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>绑定三方登录账户</p>
     * 
     * @param request BindUserAuthnSourceMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindUserAuthnSourceMappingResponse
     */
    public BindUserAuthnSourceMappingResponse bindUserAuthnSourceMappingWithOptions(BindUserAuthnSourceMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            query.put("UserExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindUserAuthnSourceMapping"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindUserAuthnSourceMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>绑定三方登录账户</p>
     * 
     * @param request BindUserAuthnSourceMappingRequest
     * @return BindUserAuthnSourceMappingResponse
     */
    public BindUserAuthnSourceMappingResponse bindUserAuthnSourceMapping(BindUserAuthnSourceMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindUserAuthnSourceMappingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an application to an Enterprise Identity Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationSourceType)) {
            query.put("ApplicationSourceType", request.applicationSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTemplateId)) {
            query.put("ApplicationTemplateId", request.applicationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoType)) {
            query.put("SsoType", request.ssoType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an application to an Enterprise Identity Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
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
     * <p>Creates a client key for an Employee Identity and Access Management (EIAM) application. An EIAM application can have up to two client keys.</p>
     * 
     * @param request CreateApplicationClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationClientSecretResponse
     */
    public CreateApplicationClientSecretResponse createApplicationClientSecretWithOptions(CreateApplicationClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("ExpirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationClientSecret"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a client key for an Employee Identity and Access Management (EIAM) application. An EIAM application can have up to two client keys.</p>
     * 
     * @param request CreateApplicationClientSecretRequest
     * @return CreateApplicationClientSecretResponse
     */
    public CreateApplicationClientSecretResponse createApplicationClientSecret(CreateApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用联邦凭证</p>
     * 
     * @param request CreateApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationFederatedCredentialResponse
     */
    public CreateApplicationFederatedCredentialResponse createApplicationFederatedCredentialWithOptions(CreateApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialName)) {
            query.put("ApplicationFederatedCredentialName", request.applicationFederatedCredentialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialType)) {
            query.put("ApplicationFederatedCredentialType", request.applicationFederatedCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeMappings)) {
            query.put("AttributeMappings", request.attributeMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCondition)) {
            query.put("VerificationCondition", request.verificationCondition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用联邦凭证</p>
     * 
     * @param request CreateApplicationFederatedCredentialRequest
     * @return CreateApplicationFederatedCredentialResponse
     */
    public CreateApplicationFederatedCredentialResponse createApplicationFederatedCredential(CreateApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用Token</p>
     * 
     * @param request CreateApplicationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationTokenResponse
     */
    public CreateApplicationTokenResponse createApplicationTokenWithOptions(CreateApplicationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenType)) {
            query.put("ApplicationTokenType", request.applicationTokenType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("ExpirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用Token</p>
     * 
     * @param request CreateApplicationTokenRequest
     * @return CreateApplicationTokenResponse
     */
    public CreateApplicationTokenResponse createApplicationToken(CreateApplicationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建品牌</p>
     * 
     * @param request CreateBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBrandResponse
     */
    public CreateBrandResponse createBrandWithOptions(CreateBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandName)) {
            query.put("BrandName", request.brandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建品牌</p>
     * 
     * @param request CreateBrandRequest
     * @return CreateBrandResponse
     */
    public CreateBrandResponse createBrand(CreateBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Create Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Create Conditional Access Policy</p>
     * 
     * @param request CreateConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateConditionalAccessPolicyResponse
     */
    public CreateConditionalAccessPolicyResponse createConditionalAccessPolicyWithOptions(CreateConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyName)) {
            query.put("ConditionalAccessPolicyName", request.conditionalAccessPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyType)) {
            query.put("ConditionalAccessPolicyType", request.conditionalAccessPolicyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionsConfig)) {
            query.put("ConditionsConfig", request.conditionsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decisionConfig)) {
            query.put("DecisionConfig", request.decisionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decisionType)) {
            query.put("DecisionType", request.decisionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluateAt)) {
            query.put("EvaluateAt", request.evaluateAt);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Create Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Create Conditional Access Policy</p>
     * 
     * @param request CreateConditionalAccessPolicyRequest
     * @return CreateConditionalAccessPolicyResponse
     */
    public CreateConditionalAccessPolicyResponse createConditionalAccessPolicy(CreateConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义条款</p>
     * 
     * @param request CreateCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomPrivacyPolicyResponse
     */
    public CreateCustomPrivacyPolicyResponse createCustomPrivacyPolicyWithOptions(CreateCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyContents)) {
            query.put("CustomPrivacyPolicyContents", request.customPrivacyPolicyContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyName)) {
            query.put("CustomPrivacyPolicyName", request.customPrivacyPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLanguageCode)) {
            query.put("DefaultLanguageCode", request.defaultLanguageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConsentType)) {
            query.put("UserConsentType", request.userConsentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建自定义条款</p>
     * 
     * @param request CreateCustomPrivacyPolicyRequest
     * @return CreateCustomPrivacyPolicyResponse
     */
    public CreateCustomPrivacyPolicyResponse createCustomPrivacyPolicy(CreateCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain name for an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request CreateDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomainWithOptions(CreateDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filing)) {
            query.put("Filing", request.filing);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomain"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom domain name for an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request CreateDomainProxyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDomainProxyTokenResponse
     */
    public CreateDomainProxyTokenResponse createDomainProxyTokenWithOptions(CreateDomainProxyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDomainProxyToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDomainProxyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request CreateDomainProxyTokenRequest
     * @return CreateDomainProxyTokenResponse
     */
    public CreateDomainProxyTokenResponse createDomainProxyToken(CreateDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建联邦凭证提供方</p>
     * 
     * @param request CreateFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFederatedCredentialProviderResponse
     */
    public CreateFederatedCredentialProviderResponse createFederatedCredentialProviderWithOptions(CreateFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderName)) {
            query.put("FederatedCredentialProviderName", request.federatedCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderType)) {
            query.put("FederatedCredentialProviderType", request.federatedCredentialProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcProviderConfig)) {
            query.put("OidcProviderConfig", request.oidcProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkcs7ProviderConfig)) {
            query.put("Pkcs7ProviderConfig", request.pkcs7ProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateCaProviderConfig)) {
            query.put("PrivateCaProviderConfig", request.privateCaProviderConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建联邦凭证提供方</p>
     * 
     * @param request CreateFederatedCredentialProviderRequest
     * @return CreateFederatedCredentialProviderResponse
     */
    public CreateFederatedCredentialProviderResponse createFederatedCredentialProvider(CreateFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.groupExternalId)) {
            query.put("GroupExternalId", request.groupExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Creates an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Create Identity Provider</p>
     * 
     * @param request CreateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderResponse
     */
    public CreateIdentityProviderResponse createIdentityProviderWithOptions(CreateIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authnConfig)) {
            query.put("AuthnConfig", request.authnConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateUserConfig)) {
            query.put("AutoCreateUserConfig", request.autoCreateUserConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUpdateUserConfig)) {
            query.put("AutoUpdateUserConfig", request.autoUpdateUserConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingConfig)) {
            query.put("BindingConfig", request.bindingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingtalkAppConfig)) {
            query.put("DingtalkAppConfig", request.dingtalkAppConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            query.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderType)) {
            query.put("IdentityProviderType", request.identityProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.larkConfig)) {
            query.put("LarkConfig", request.larkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ldapConfig)) {
            query.put("LdapConfig", request.ldapConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcConfig)) {
            query.put("OidcConfig", request.oidcConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udPullConfig)) {
            query.put("UdPullConfig", request.udPullConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udPushConfig)) {
            query.put("UdPushConfig", request.udPushConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weComConfig)) {
            query.put("WeComConfig", request.weComConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIdentityProvider"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Create Identity Provider</p>
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
     * <p>Creates an instance based on which all capabilities of Identity as a Service (IDaaS) Enterprise Identity and Access Management (EIAM) are provided.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an instance based on which all capabilities of Identity as a Service (IDaaS) Enterprise Identity and Access Management (EIAM) are provided.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dedicated endpoint.</p>
     * 
     * @param request CreateNetworkAccessEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkAccessEndpointResponse
     */
    public CreateNetworkAccessEndpointResponse createNetworkAccessEndpointWithOptions(CreateNetworkAccessEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointName)) {
            query.put("NetworkAccessEndpointName", request.networkAccessEndpointName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            query.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegionId)) {
            query.put("VpcRegionId", request.vpcRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkAccessEndpoint"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkAccessEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a dedicated endpoint.</p>
     * 
     * @param request CreateNetworkAccessEndpointRequest
     * @return CreateNetworkAccessEndpointResponse
     */
    public CreateNetworkAccessEndpointResponse createNetworkAccessEndpoint(CreateNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建网络区域对象</p>
     * 
     * @param request CreateNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkZoneResponse
     */
    public CreateNetworkZoneResponse createNetworkZoneWithOptions(CreateNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4Cidrs)) {
            query.put("Ipv4Cidrs", request.ipv4Cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6Cidrs)) {
            query.put("Ipv6Cidrs", request.ipv6Cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneName)) {
            query.put("NetworkZoneName", request.networkZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneType)) {
            query.put("NetworkZoneType", request.networkZoneType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建网络区域对象</p>
     * 
     * @param request CreateNetworkZoneRequest
     * @return CreateNetworkZoneResponse
     */
    public CreateNetworkZoneResponse createNetworkZone(CreateNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request CreateOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnitWithOptions(CreateOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitExternalId)) {
            query.put("OrganizationalUnitExternalId", request.organizationalUnitExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            query.put("OrganizationalUnitName", request.organizationalUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request CreateOrganizationalUnitRequest
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnit(CreateOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an account in an Identity as a Service (IDaaS) Enterprise Identity Access Management (EIAM) instance.</p>
     * 
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            query.put("CustomFields", request.customFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            query.put("EmailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitializationConfig)) {
            query.put("PasswordInitializationConfig", request.passwordInitializationConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            query.put("PhoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            query.put("PhoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryOrganizationalUnitId)) {
            query.put("PrimaryOrganizationalUnitId", request.primaryOrganizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            query.put("UserExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>summary</b> : 
     * <p>Creates an account in an Identity as a Service (IDaaS) Enterprise Identity Access Management (EIAM) instance.</p>
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
     * <p>Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DeleteApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>description</b> :
     * <p>Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client key for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DeleteApplicationClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationClientSecretResponse
     */
    public DeleteApplicationClientSecretResponse deleteApplicationClientSecretWithOptions(DeleteApplicationClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationClientSecret"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a client key for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DeleteApplicationClientSecretRequest
     * @return DeleteApplicationClientSecretResponse
     */
    public DeleteApplicationClientSecretResponse deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用联邦凭证</p>
     * 
     * @param request DeleteApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationFederatedCredentialResponse
     */
    public DeleteApplicationFederatedCredentialResponse deleteApplicationFederatedCredentialWithOptions(DeleteApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除应用联邦凭证</p>
     * 
     * @param request DeleteApplicationFederatedCredentialRequest
     * @return DeleteApplicationFederatedCredentialResponse
     */
    public DeleteApplicationFederatedCredentialResponse deleteApplicationFederatedCredential(DeleteApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除ApplicationToken</p>
     * 
     * @param request DeleteApplicationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationTokenResponse
     */
    public DeleteApplicationTokenResponse deleteApplicationTokenWithOptions(DeleteApplicationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenId)) {
            query.put("ApplicationTokenId", request.applicationTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除ApplicationToken</p>
     * 
     * @param request DeleteApplicationTokenRequest
     * @return DeleteApplicationTokenResponse
     */
    public DeleteApplicationTokenResponse deleteApplicationToken(DeleteApplicationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除品牌</p>
     * 
     * @param request DeleteBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBrandResponse
     */
    public DeleteBrandResponse deleteBrandWithOptions(DeleteBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除品牌</p>
     * 
     * @param request DeleteBrandRequest
     * @return DeleteBrandResponse
     */
    public DeleteBrandResponse deleteBrand(DeleteBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When deleting a specified conditional access policy, please ensure that the policy is no longer in use. After deletion, all configuration data will be removed and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Conditional Access Policy</p>
     * 
     * @param request DeleteConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteConditionalAccessPolicyResponse
     */
    public DeleteConditionalAccessPolicyResponse deleteConditionalAccessPolicyWithOptions(DeleteConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>When deleting a specified conditional access policy, please ensure that the policy is no longer in use. After deletion, all configuration data will be removed and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete Conditional Access Policy</p>
     * 
     * @param request DeleteConditionalAccessPolicyRequest
     * @return DeleteConditionalAccessPolicyResponse
     */
    public DeleteConditionalAccessPolicyResponse deleteConditionalAccessPolicy(DeleteConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义条款</p>
     * 
     * @param request DeleteCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomPrivacyPolicyResponse
     */
    public DeleteCustomPrivacyPolicyResponse deleteCustomPrivacyPolicyWithOptions(DeleteCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyId)) {
            query.put("CustomPrivacyPolicyId", request.customPrivacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除自定义条款</p>
     * 
     * @param request DeleteCustomPrivacyPolicyRequest
     * @return DeleteCustomPrivacyPolicyResponse
     */
    public DeleteCustomPrivacyPolicyResponse deleteCustomPrivacyPolicy(DeleteCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name of an Employee Identity and Access Management (EIAM) instance. You cannot delete the initial domain name and default domain name of the instance.</p>
     * 
     * @param request DeleteDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomainWithOptions(DeleteDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomain"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom domain name of an Employee Identity and Access Management (EIAM) instance. You cannot delete the initial domain name and default domain name of the instance.</p>
     * 
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. Only the proxy tokens in the disabled state can be deleted.</p>
     * 
     * @param request DeleteDomainProxyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDomainProxyTokenResponse
     */
    public DeleteDomainProxyTokenResponse deleteDomainProxyTokenWithOptions(DeleteDomainProxyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainProxyTokenId)) {
            query.put("DomainProxyTokenId", request.domainProxyTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDomainProxyToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDomainProxyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. Only the proxy tokens in the disabled state can be deleted.</p>
     * 
     * @param request DeleteDomainProxyTokenRequest
     * @return DeleteDomainProxyTokenResponse
     */
    public DeleteDomainProxyTokenResponse deleteDomainProxyToken(DeleteDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除联邦凭证提供方</p>
     * 
     * @param request DeleteFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFederatedCredentialProviderResponse
     */
    public DeleteFederatedCredentialProviderResponse deleteFederatedCredentialProviderWithOptions(DeleteFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除联邦凭证提供方</p>
     * 
     * @param request DeleteFederatedCredentialProviderRequest
     * @return DeleteFederatedCredentialProviderResponse
     */
    public DeleteFederatedCredentialProviderResponse deleteFederatedCredentialProvider(DeleteFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request DeleteGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>summary</b> : 
     * <p>Deletes the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Delete identity provider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProviderWithOptions(DeleteIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIdentityProvider"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Delete identity provider</p>
     * 
     * @param request DeleteIdentityProviderRequest
     * @return DeleteIdentityProviderResponse
     */
    public DeleteIdentityProviderResponse deleteIdentityProvider(DeleteIdentityProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIdentityProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS) that you do not need.</p>
     * 
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS) that you do not need.</p>
     * 
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a network endpoint of a specific type.</p>
     * 
     * @param request DeleteNetworkAccessEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkAccessEndpointResponse
     */
    public DeleteNetworkAccessEndpointResponse deleteNetworkAccessEndpointWithOptions(DeleteNetworkAccessEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkAccessEndpoint"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkAccessEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a network endpoint of a specific type.</p>
     * 
     * @param request DeleteNetworkAccessEndpointRequest
     * @return DeleteNetworkAccessEndpointResponse
     */
    public DeleteNetworkAccessEndpointResponse deleteNetworkAccessEndpoint(DeleteNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除网络区域对象</p>
     * 
     * @param request DeleteNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkZoneResponse
     */
    public DeleteNetworkZoneResponse deleteNetworkZoneWithOptions(DeleteNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除网络区域对象</p>
     * 
     * @param request DeleteNetworkZoneRequest
     * @return DeleteNetworkZoneResponse
     */
    public DeleteNetworkZoneResponse deleteNetworkZone(DeleteNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the organization has EIAM accounts or child organizations, the delete operation fails.</p>
     * 
     * @param request DeleteOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnitWithOptions(DeleteOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the organization has EIAM accounts or child organizations, the delete operation fails.</p>
     * 
     * @param request DeleteOrganizationalUnitRequest
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete organizational unit information, forcibly deleting all accounts and sub-organizations beneath it</p>
     * 
     * @param request DeleteOrganizationalUnitChildrenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOrganizationalUnitChildrenResponse
     */
    public DeleteOrganizationalUnitChildrenResponse deleteOrganizationalUnitChildrenWithOptions(DeleteOrganizationalUnitChildrenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOrganizationalUnitChildren"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteOrganizationalUnitChildrenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete organizational unit information, forcibly deleting all accounts and sub-organizations beneath it</p>
     * 
     * @param request DeleteOrganizationalUnitChildrenRequest
     * @return DeleteOrganizationalUnitChildrenResponse
     */
    public DeleteOrganizationalUnitChildrenResponse deleteOrganizationalUnitChildren(DeleteOrganizationalUnitChildrenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOrganizationalUnitChildrenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The information related to the account is cleared.</p>
     * 
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Deletes an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The information related to the account is cleared.</p>
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
     * <p>All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an enabled Employee Identity and Access Management (EIAM) application. All features of the EIAM application cannot be used if you disable the EIAM application.</p>
     * 
     * @param request DisableApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationResponse
     */
    public DisableApplicationResponse disableApplicationWithOptions(DisableApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationResponse());
    }

    /**
     * <b>description</b> :
     * <p>All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an enabled Employee Identity and Access Management (EIAM) application. All features of the EIAM application cannot be used if you disable the EIAM application.</p>
     * 
     * @param request DisableApplicationRequest
     * @return DisableApplicationResponse
     */
    public DisableApplicationResponse disableApplication(DisableApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DisableApplicationApiInvokeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationApiInvokeResponse
     */
    public DisableApplicationApiInvokeResponse disableApplicationApiInvokeWithOptions(DisableApplicationApiInvokeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationApiInvoke"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationApiInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DisableApplicationApiInvokeRequest
     * @return DisableApplicationApiInvokeResponse
     */
    public DisableApplicationApiInvokeResponse disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationApiInvokeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a client key of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DisableApplicationClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationClientSecretResponse
     */
    public DisableApplicationClientSecretResponse disableApplicationClientSecretWithOptions(DisableApplicationClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationClientSecret"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a client key of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request DisableApplicationClientSecretRequest
     * @return DisableApplicationClientSecretResponse
     */
    public DisableApplicationClientSecretResponse disableApplicationClientSecret(DisableApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用应用联邦凭证</p>
     * 
     * @param request DisableApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationFederatedCredentialResponse
     */
    public DisableApplicationFederatedCredentialResponse disableApplicationFederatedCredentialWithOptions(DisableApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用应用联邦凭证</p>
     * 
     * @param request DisableApplicationFederatedCredentialRequest
     * @return DisableApplicationFederatedCredentialResponse
     */
    public DisableApplicationFederatedCredentialResponse disableApplicationFederatedCredential(DisableApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request DisableApplicationProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationProvisioningResponse
     */
    public DisableApplicationProvisioningResponse disableApplicationProvisioningWithOptions(DisableApplicationProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationProvisioning"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationProvisioningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request DisableApplicationProvisioningRequest
     * @return DisableApplicationProvisioningResponse
     */
    public DisableApplicationProvisioningResponse disableApplicationProvisioning(DisableApplicationProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the single sign-on (SSO) feature for an Employee Identity and Access Management (EIAM) application. This way, employees cannot log on to the application by using SSO.</p>
     * 
     * @param request DisableApplicationSsoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationSsoResponse
     */
    public DisableApplicationSsoResponse disableApplicationSsoWithOptions(DisableApplicationSsoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationSso"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationSsoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the single sign-on (SSO) feature for an Employee Identity and Access Management (EIAM) application. This way, employees cannot log on to the application by using SSO.</p>
     * 
     * @param request DisableApplicationSsoRequest
     * @return DisableApplicationSsoResponse
     */
    public DisableApplicationSsoResponse disableApplicationSso(DisableApplicationSsoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationSsoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用应用Token</p>
     * 
     * @param request DisableApplicationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationTokenResponse
     */
    public DisableApplicationTokenResponse disableApplicationTokenWithOptions(DisableApplicationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenId)) {
            query.put("ApplicationTokenId", request.applicationTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableApplicationToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用应用Token</p>
     * 
     * @param request DisableApplicationTokenRequest
     * @return DisableApplicationTokenResponse
     */
    public DisableApplicationTokenResponse disableApplicationToken(DisableApplicationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用品牌</p>
     * 
     * @param request DisableBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableBrandResponse
     */
    public DisableBrandResponse disableBrandWithOptions(DisableBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用品牌</p>
     * 
     * @param request DisableBrandRequest
     * @return DisableBrandResponse
     */
    public DisableBrandResponse disableBrand(DisableBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When changing a conditional access policy from an enabled state to a disabled state, the policy will no longer intercept. Please confirm that you are aware of the potential risks associated with this action.</p>
     * 
     * <b>summary</b> : 
     * <p>Disable Conditional Access Policy</p>
     * 
     * @param request DisableConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableConditionalAccessPolicyResponse
     */
    public DisableConditionalAccessPolicyResponse disableConditionalAccessPolicyWithOptions(DisableConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>When changing a conditional access policy from an enabled state to a disabled state, the policy will no longer intercept. Please confirm that you are aware of the potential risks associated with this action.</p>
     * 
     * <b>summary</b> : 
     * <p>Disable Conditional Access Policy</p>
     * 
     * @param request DisableConditionalAccessPolicyRequest
     * @return DisableConditionalAccessPolicyResponse
     */
    public DisableConditionalAccessPolicyResponse disableConditionalAccessPolicy(DisableConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用自定义条款</p>
     * 
     * @param request DisableCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCustomPrivacyPolicyResponse
     */
    public DisableCustomPrivacyPolicyResponse disableCustomPrivacyPolicyWithOptions(DisableCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyId)) {
            query.put("CustomPrivacyPolicyId", request.customPrivacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用自定义条款</p>
     * 
     * @param request DisableCustomPrivacyPolicyRequest
     * @return DisableCustomPrivacyPolicyResponse
     */
    public DisableCustomPrivacyPolicyResponse disableCustomPrivacyPolicy(DisableCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. After the proxy token is disabled, the domain name may not be used as expected.</p>
     * 
     * @param request DisableDomainProxyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDomainProxyTokenResponse
     */
    public DisableDomainProxyTokenResponse disableDomainProxyTokenWithOptions(DisableDomainProxyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainProxyTokenId)) {
            query.put("DomainProxyTokenId", request.domainProxyTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDomainProxyToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDomainProxyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. After the proxy token is disabled, the domain name may not be used as expected.</p>
     * 
     * @param request DisableDomainProxyTokenRequest
     * @return DisableDomainProxyTokenResponse
     */
    public DisableDomainProxyTokenResponse disableDomainProxyToken(DisableDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用联邦凭证提供方</p>
     * 
     * @param request DisableFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableFederatedCredentialProviderResponse
     */
    public DisableFederatedCredentialProviderResponse disableFederatedCredentialProviderWithOptions(DisableFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用联邦凭证提供方</p>
     * 
     * @param request DisableFederatedCredentialProviderRequest
     * @return DisableFederatedCredentialProviderResponse
     */
    public DisableFederatedCredentialProviderResponse disableFederatedCredentialProvider(DisableFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>禁用认证</p>
     * 
     * @param request DisableIdentityProviderAuthnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableIdentityProviderAuthnResponse
     */
    public DisableIdentityProviderAuthnResponse disableIdentityProviderAuthnWithOptions(DisableIdentityProviderAuthnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableIdentityProviderAuthn"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableIdentityProviderAuthnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>禁用认证</p>
     * 
     * @param request DisableIdentityProviderAuthnRequest
     * @return DisableIdentityProviderAuthnResponse
     */
    public DisableIdentityProviderAuthnResponse disableIdentityProviderAuthn(DisableIdentityProviderAuthnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableIdentityProviderAuthnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disable identity provider synchronization</p>
     * 
     * @param request DisableIdentityProviderUdPullRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableIdentityProviderUdPullResponse
     */
    public DisableIdentityProviderUdPullResponse disableIdentityProviderUdPullWithOptions(DisableIdentityProviderUdPullRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableIdentityProviderUdPull"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableIdentityProviderUdPullResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disable identity provider synchronization</p>
     * 
     * @param request DisableIdentityProviderUdPullRequest
     * @return DisableIdentityProviderUdPullResponse
     */
    public DisableIdentityProviderUdPullResponse disableIdentityProviderUdPull(DisableIdentityProviderUdPullRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableIdentityProviderUdPullWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the feature of automatically redirecting the initial domain name to the default domain name for an Employee Identity and Access Management (EIAM) instance. After the feature is disabled, users who visit the portal page by using the initial domain name are not redirected to the default domain name.</p>
     * 
     * @param request DisableInitDomainAutoRedirectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInitDomainAutoRedirectResponse
     */
    public DisableInitDomainAutoRedirectResponse disableInitDomainAutoRedirectWithOptions(DisableInitDomainAutoRedirectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInitDomainAutoRedirect"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInitDomainAutoRedirectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the feature of automatically redirecting the initial domain name to the default domain name for an Employee Identity and Access Management (EIAM) instance. After the feature is disabled, users who visit the portal page by using the initial domain name are not redirected to the default domain name.</p>
     * 
     * @param request DisableInitDomainAutoRedirectRequest
     * @return DisableInitDomainAutoRedirectResponse
     */
    public DisableInitDomainAutoRedirectResponse disableInitDomainAutoRedirect(DisableInitDomainAutoRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInitDomainAutoRedirectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account. If the account is disabled, a success message is returned.</p>
     * 
     * @param request DisableUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUserWithOptions(DisableUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account. If the account is disabled, a success message is returned.</p>
     * 
     * @param request DisableUserRequest
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUser(DisableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a disabled Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationResponse
     */
    public EnableApplicationResponse enableApplicationWithOptions(EnableApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a disabled Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationRequest
     * @return EnableApplicationResponse
     */
    public EnableApplicationResponse enableApplication(EnableApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationApiInvokeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationApiInvokeResponse
     */
    public EnableApplicationApiInvokeResponse enableApplicationApiInvokeWithOptions(EnableApplicationApiInvokeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationApiInvoke"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationApiInvokeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationApiInvokeRequest
     * @return EnableApplicationApiInvokeResponse
     */
    public EnableApplicationApiInvokeResponse enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationApiInvokeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the client key of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request EnableApplicationClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationClientSecretResponse
     */
    public EnableApplicationClientSecretResponse enableApplicationClientSecretWithOptions(EnableApplicationClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationClientSecret"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the client key of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request EnableApplicationClientSecretRequest
     * @return EnableApplicationClientSecretResponse
     */
    public EnableApplicationClientSecretResponse enableApplicationClientSecret(EnableApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用应用联邦凭证</p>
     * 
     * @param request EnableApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationFederatedCredentialResponse
     */
    public EnableApplicationFederatedCredentialResponse enableApplicationFederatedCredentialWithOptions(EnableApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用应用联邦凭证</p>
     * 
     * @param request EnableApplicationFederatedCredentialRequest
     * @return EnableApplicationFederatedCredentialResponse
     */
    public EnableApplicationFederatedCredentialResponse enableApplicationFederatedCredential(EnableApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request EnableApplicationProvisioningRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationProvisioningResponse
     */
    public EnableApplicationProvisioningResponse enableApplicationProvisioningWithOptions(EnableApplicationProvisioningRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationProvisioning"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationProvisioningResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request EnableApplicationProvisioningRequest
     * @return EnableApplicationProvisioningResponse
     */
    public EnableApplicationProvisioningResponse enableApplicationProvisioning(EnableApplicationProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationProvisioningWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the single sign-on (SSO) feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationSsoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationSsoResponse
     */
    public EnableApplicationSsoResponse enableApplicationSsoWithOptions(EnableApplicationSsoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationSso"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationSsoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the single sign-on (SSO) feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request EnableApplicationSsoRequest
     * @return EnableApplicationSsoResponse
     */
    public EnableApplicationSsoResponse enableApplicationSso(EnableApplicationSsoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationSsoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用应用Token</p>
     * 
     * @param request EnableApplicationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationTokenResponse
     */
    public EnableApplicationTokenResponse enableApplicationTokenWithOptions(EnableApplicationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenId)) {
            query.put("ApplicationTokenId", request.applicationTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableApplicationToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用应用Token</p>
     * 
     * @param request EnableApplicationTokenRequest
     * @return EnableApplicationTokenResponse
     */
    public EnableApplicationTokenResponse enableApplicationToken(EnableApplicationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用品牌</p>
     * 
     * @param request EnableBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableBrandResponse
     */
    public EnableBrandResponse enableBrandWithOptions(EnableBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用品牌</p>
     * 
     * @param request EnableBrandRequest
     * @return EnableBrandResponse
     */
    public EnableBrandResponse enableBrand(EnableBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When changing the status of a conditional access policy from enabled to disabled, the policy will no longer intercept. Please confirm that you are aware of the potential risks associated with this action.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable Conditional Access Policy</p>
     * 
     * @param request EnableConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableConditionalAccessPolicyResponse
     */
    public EnableConditionalAccessPolicyResponse enableConditionalAccessPolicyWithOptions(EnableConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>When changing the status of a conditional access policy from enabled to disabled, the policy will no longer intercept. Please confirm that you are aware of the potential risks associated with this action.</p>
     * 
     * <b>summary</b> : 
     * <p>Enable Conditional Access Policy</p>
     * 
     * @param request EnableConditionalAccessPolicyRequest
     * @return EnableConditionalAccessPolicyResponse
     */
    public EnableConditionalAccessPolicyResponse enableConditionalAccessPolicy(EnableConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用自定义条款</p>
     * 
     * @param request EnableCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCustomPrivacyPolicyResponse
     */
    public EnableCustomPrivacyPolicyResponse enableCustomPrivacyPolicyWithOptions(EnableCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyId)) {
            query.put("CustomPrivacyPolicyId", request.customPrivacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用自定义条款</p>
     * 
     * @param request EnableCustomPrivacyPolicyRequest
     * @return EnableCustomPrivacyPolicyResponse
     */
    public EnableCustomPrivacyPolicyResponse enableCustomPrivacyPolicy(EnableCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. The proxy token is used to verify the security of the domain name.</p>
     * 
     * @param request EnableDomainProxyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDomainProxyTokenResponse
     */
    public EnableDomainProxyTokenResponse enableDomainProxyTokenWithOptions(EnableDomainProxyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainProxyTokenId)) {
            query.put("DomainProxyTokenId", request.domainProxyTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDomainProxyToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDomainProxyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a proxy token for a domain name of an Employee Identity and Access Management (EIAM) instance. The proxy token is used to verify the security of the domain name.</p>
     * 
     * @param request EnableDomainProxyTokenRequest
     * @return EnableDomainProxyTokenResponse
     */
    public EnableDomainProxyTokenResponse enableDomainProxyToken(EnableDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用联邦凭证提供方</p>
     * 
     * @param request EnableFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableFederatedCredentialProviderResponse
     */
    public EnableFederatedCredentialProviderResponse enableFederatedCredentialProviderWithOptions(EnableFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用联邦凭证提供方</p>
     * 
     * @param request EnableFederatedCredentialProviderRequest
     * @return EnableFederatedCredentialProviderResponse
     */
    public EnableFederatedCredentialProviderResponse enableFederatedCredentialProvider(EnableFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用认证</p>
     * 
     * @param request EnableIdentityProviderAuthnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableIdentityProviderAuthnResponse
     */
    public EnableIdentityProviderAuthnResponse enableIdentityProviderAuthnWithOptions(EnableIdentityProviderAuthnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableIdentityProviderAuthn"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableIdentityProviderAuthnResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>启用认证</p>
     * 
     * @param request EnableIdentityProviderAuthnRequest
     * @return EnableIdentityProviderAuthnResponse
     */
    public EnableIdentityProviderAuthnResponse enableIdentityProviderAuthn(EnableIdentityProviderAuthnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableIdentityProviderAuthnWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enable identity provider synchronization.</p>
     * 
     * @param request EnableIdentityProviderUdPullRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableIdentityProviderUdPullResponse
     */
    public EnableIdentityProviderUdPullResponse enableIdentityProviderUdPullWithOptions(EnableIdentityProviderUdPullRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableIdentityProviderUdPull"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableIdentityProviderUdPullResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enable identity provider synchronization.</p>
     * 
     * @param request EnableIdentityProviderUdPullRequest
     * @return EnableIdentityProviderUdPullResponse
     */
    public EnableIdentityProviderUdPullResponse enableIdentityProviderUdPull(EnableIdentityProviderUdPullRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableIdentityProviderUdPullWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the feature of automatically redirecting the initial domain name to the default domain name for an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request EnableInitDomainAutoRedirectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInitDomainAutoRedirectResponse
     */
    public EnableInitDomainAutoRedirectResponse enableInitDomainAutoRedirectWithOptions(EnableInitDomainAutoRedirectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInitDomainAutoRedirect"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInitDomainAutoRedirectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the feature of automatically redirecting the initial domain name to the default domain name for an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request EnableInitDomainAutoRedirectRequest
     * @return EnableInitDomainAutoRedirectResponse
     */
    public EnableInitDomainAutoRedirectResponse enableInitDomainAutoRedirect(EnableInitDomainAutoRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInitDomainAutoRedirectWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).</p>
     * 
     * @param request EnableUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUserWithOptions(EnableUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).</p>
     * 
     * @param request EnableUserRequest
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUser(EnableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request GetApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplicationWithOptions(GetApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplication"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>summary</b> : 
     * <p>Queries the details of an Employee Identity and Access Management (EIAM) application.</p>
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
     * <p>获取应用高阶配置</p>
     * 
     * @param request GetApplicationAdvancedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationAdvancedConfigResponse
     */
    public GetApplicationAdvancedConfigResponse getApplicationAdvancedConfigWithOptions(GetApplicationAdvancedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationAdvancedConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationAdvancedConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用高阶配置</p>
     * 
     * @param request GetApplicationAdvancedConfigRequest
     * @return GetApplicationAdvancedConfigResponse
     */
    public GetApplicationAdvancedConfigResponse getApplicationAdvancedConfig(GetApplicationAdvancedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationAdvancedConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用联邦凭证</p>
     * 
     * @param request GetApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationFederatedCredentialResponse
     */
    public GetApplicationFederatedCredentialResponse getApplicationFederatedCredentialWithOptions(GetApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用联邦凭证</p>
     * 
     * @param request GetApplicationFederatedCredentialRequest
     * @return GetApplicationFederatedCredentialResponse
     */
    public GetApplicationFederatedCredentialResponse getApplicationFederatedCredential(GetApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permissions of the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request GetApplicationGrantScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationGrantScopeResponse
     */
    public GetApplicationGrantScopeResponse getApplicationGrantScopeWithOptions(GetApplicationGrantScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationGrantScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationGrantScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permissions of the Developer API feature for an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request GetApplicationGrantScopeRequest
     * @return GetApplicationGrantScopeResponse
     */
    public GetApplicationGrantScopeResponse getApplicationGrantScope(GetApplicationGrantScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationGrantScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request GetApplicationProvisioningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationProvisioningConfigResponse
     */
    public GetApplicationProvisioningConfigResponse getApplicationProvisioningConfigWithOptions(GetApplicationProvisioningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationProvisioningConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationProvisioningConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration of the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request GetApplicationProvisioningConfigRequest
     * @return GetApplicationProvisioningConfigResponse
     */
    public GetApplicationProvisioningConfigResponse getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationProvisioningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.</p>
     * 
     * @param request GetApplicationProvisioningScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationProvisioningScopeResponse
     */
    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScopeWithOptions(GetApplicationProvisioningScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationProvisioningScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationProvisioningScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.</p>
     * 
     * @param request GetApplicationProvisioningScopeRequest
     * @return GetApplicationProvisioningScopeResponse
     */
    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationProvisioningScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetApplicationSsoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationSsoConfigResponse
     */
    public GetApplicationSsoConfigResponse getApplicationSsoConfigWithOptions(GetApplicationSsoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationSsoConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationSsoConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetApplicationSsoConfigRequest
     * @return GetApplicationSsoConfigResponse
     */
    public GetApplicationSsoConfigResponse getApplicationSsoConfig(GetApplicationSsoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationSsoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用模板信息</p>
     * 
     * @param request GetApplicationTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationTemplateResponse
     */
    public GetApplicationTemplateResponse getApplicationTemplateWithOptions(GetApplicationTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationTemplateId)) {
            query.put("ApplicationTemplateId", request.applicationTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用模板信息</p>
     * 
     * @param request GetApplicationTemplateRequest
     * @return GetApplicationTemplateResponse
     */
    public GetApplicationTemplateResponse getApplicationTemplate(GetApplicationTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌详情</p>
     * 
     * @param request GetBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBrandResponse
     */
    public GetBrandResponse getBrandWithOptions(GetBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌详情</p>
     * 
     * @param request GetBrandRequest
     * @return GetBrandResponse
     */
    public GetBrandResponse getBrand(GetBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Get Conditional Access Policy</p>
     * 
     * @param request GetConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConditionalAccessPolicyResponse
     */
    public GetConditionalAccessPolicyResponse getConditionalAccessPolicyWithOptions(GetConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Query Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Get Conditional Access Policy</p>
     * 
     * @param request GetConditionalAccessPolicyRequest
     * @return GetConditionalAccessPolicyResponse
     */
    public GetConditionalAccessPolicyResponse getConditionalAccessPolicy(GetConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义条款</p>
     * 
     * @param request GetCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomPrivacyPolicyResponse
     */
    public GetCustomPrivacyPolicyResponse getCustomPrivacyPolicyWithOptions(GetCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyId)) {
            query.put("CustomPrivacyPolicyId", request.customPrivacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取自定义条款</p>
     * 
     * @param request GetCustomPrivacyPolicyRequest
     * @return GetCustomPrivacyPolicyResponse
     */
    public GetCustomPrivacyPolicyResponse getCustomPrivacyPolicy(GetCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request GetDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomainWithOptions(GetDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomain"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain name system (DNS) challenge records of a domain name of an Employee Identity and Access Management (EIAM) instance. The generated records are used to verify the ownership of the domain name.</p>
     * 
     * @param request GetDomainDnsChallengeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDomainDnsChallengeResponse
     */
    public GetDomainDnsChallengeResponse getDomainDnsChallengeWithOptions(GetDomainDnsChallengeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domain)) {
            query.put("Domain", request.domain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDomainDnsChallenge"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDomainDnsChallengeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the domain name system (DNS) challenge records of a domain name of an Employee Identity and Access Management (EIAM) instance. The generated records are used to verify the ownership of the domain name.</p>
     * 
     * @param request GetDomainDnsChallengeRequest
     * @return GetDomainDnsChallengeResponse
     */
    public GetDomainDnsChallengeResponse getDomainDnsChallenge(GetDomainDnsChallengeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainDnsChallengeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取联邦凭证提供方</p>
     * 
     * @param request GetFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFederatedCredentialProviderResponse
     */
    public GetFederatedCredentialProviderResponse getFederatedCredentialProviderWithOptions(GetFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取联邦凭证提供方</p>
     * 
     * @param request GetFederatedCredentialProviderRequest
     * @return GetFederatedCredentialProviderResponse
     */
    public GetFederatedCredentialProviderResponse getFederatedCredentialProvider(GetFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the forgot password configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetForgetPasswordConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetForgetPasswordConfigurationResponse
     */
    public GetForgetPasswordConfigurationResponse getForgetPasswordConfigurationWithOptions(GetForgetPasswordConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetForgetPasswordConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetForgetPasswordConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the forgot password configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetForgetPasswordConfigurationRequest
     * @return GetForgetPasswordConfigurationResponse
     */
    public GetForgetPasswordConfigurationResponse getForgetPasswordConfiguration(GetForgetPasswordConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getForgetPasswordConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request GetGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(GetGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Get identity provider</p>
     * 
     * @param request GetIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderResponse
     */
    public GetIdentityProviderResponse getIdentityProviderWithOptions(GetIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProvider"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Get identity provider</p>
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
     * <p>Get IdP Inbound Synchronization Configuration Information</p>
     * 
     * @param request GetIdentityProviderUdPullConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderUdPullConfigurationResponse
     */
    public GetIdentityProviderUdPullConfigurationResponse getIdentityProviderUdPullConfigurationWithOptions(GetIdentityProviderUdPullConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderUdPullConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderUdPullConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get IdP Inbound Synchronization Configuration Information</p>
     * 
     * @param request GetIdentityProviderUdPullConfigurationRequest
     * @return GetIdentityProviderUdPullConfigurationResponse
     */
    public GetIdentityProviderUdPullConfigurationResponse getIdentityProviderUdPullConfiguration(GetIdentityProviderUdPullConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderUdPullConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that your current instance is no longer in use. When the EIAM instance is deleted, all related data will be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the currently effective License information of the instance</p>
     * 
     * @param request GetInstanceLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceLicenseResponse
     */
    public GetInstanceLicenseResponse getInstanceLicenseWithOptions(GetInstanceLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceLicense"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceLicenseResponse());
    }

    /**
     * <b>description</b> :
     * <p>Please ensure that your current instance is no longer in use. When the EIAM instance is deleted, all related data will be deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Query the currently effective License information of the instance</p>
     * 
     * @param request GetInstanceLicenseRequest
     * @return GetInstanceLicenseResponse
     */
    public GetInstanceLicenseResponse getInstanceLicense(GetInstanceLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌登录后跳转应用</p>
     * 
     * @param request GetLoginRedirectApplicationForBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoginRedirectApplicationForBrandResponse
     */
    public GetLoginRedirectApplicationForBrandResponse getLoginRedirectApplicationForBrandWithOptions(GetLoginRedirectApplicationForBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoginRedirectApplicationForBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoginRedirectApplicationForBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌登录后跳转应用</p>
     * 
     * @param request GetLoginRedirectApplicationForBrandRequest
     * @return GetLoginRedirectApplicationForBrandResponse
     */
    public GetLoginRedirectApplicationForBrandResponse getLoginRedirectApplicationForBrand(GetLoginRedirectApplicationForBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoginRedirectApplicationForBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Network Endpoint Information</p>
     * 
     * @param request GetNetworkAccessEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkAccessEndpointResponse
     */
    public GetNetworkAccessEndpointResponse getNetworkAccessEndpointWithOptions(GetNetworkAccessEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkAccessEndpoint"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkAccessEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Network Endpoint Information</p>
     * 
     * @param request GetNetworkAccessEndpointRequest
     * @return GetNetworkAccessEndpointResponse
     */
    public GetNetworkAccessEndpointResponse getNetworkAccessEndpoint(GetNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络区域对象</p>
     * 
     * @param request GetNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkZoneResponse
     */
    public GetNetworkZoneResponse getNetworkZoneWithOptions(GetNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络区域对象</p>
     * 
     * @param request GetNetworkZoneRequest
     * @return GetNetworkZoneResponse
     */
    public GetNetworkZoneResponse getNetworkZone(GetNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationalUnitResponse
     */
    public GetOrganizationalUnitResponse getOrganizationalUnitWithOptions(GetOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetOrganizationalUnitRequest
     * @return GetOrganizationalUnitResponse
     */
    public GetOrganizationalUnitResponse getOrganizationalUnit(GetOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password complexity configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordComplexityConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordComplexityConfigurationResponse
     */
    public GetPasswordComplexityConfigurationResponse getPasswordComplexityConfigurationWithOptions(GetPasswordComplexityConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordComplexityConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPasswordComplexityConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password complexity configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordComplexityConfigurationRequest
     * @return GetPasswordComplexityConfigurationResponse
     */
    public GetPasswordComplexityConfigurationResponse getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordComplexityConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password expiration configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordExpirationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordExpirationConfigurationResponse
     */
    public GetPasswordExpirationConfigurationResponse getPasswordExpirationConfigurationWithOptions(GetPasswordExpirationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordExpirationConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPasswordExpirationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password expiration configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordExpirationConfigurationRequest
     * @return GetPasswordExpirationConfigurationResponse
     */
    public GetPasswordExpirationConfigurationResponse getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordExpirationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password history configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordHistoryConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordHistoryConfigurationResponse
     */
    public GetPasswordHistoryConfigurationResponse getPasswordHistoryConfigurationWithOptions(GetPasswordHistoryConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordHistoryConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPasswordHistoryConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password history configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordHistoryConfigurationRequest
     * @return GetPasswordHistoryConfigurationResponse
     */
    public GetPasswordHistoryConfigurationResponse getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordHistoryConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password initialization configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordInitializationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPasswordInitializationConfigurationResponse
     */
    public GetPasswordInitializationConfigurationResponse getPasswordInitializationConfigurationWithOptions(GetPasswordInitializationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPasswordInitializationConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPasswordInitializationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the password initialization configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request GetPasswordInitializationConfigurationRequest
     * @return GetPasswordInitializationConfigurationResponse
     */
    public GetPasswordInitializationConfigurationResponse getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordInitializationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the root organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetRootOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRootOrganizationalUnitResponse
     */
    public GetRootOrganizationalUnitResponse getRootOrganizationalUnitWithOptions(GetRootOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRootOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRootOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the root organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetRootOrganizationalUnitRequest
     * @return GetRootOrganizationalUnitResponse
     */
    public GetRootOrganizationalUnitResponse getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRootOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about a single synchronization job.</p>
     * 
     * @param request GetSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSynchronizationJobResponse
     */
    public GetSynchronizationJobResponse getSynchronizationJobWithOptions(GetSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationJobId)) {
            query.put("SynchronizationJobId", request.synchronizationJobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSynchronizationJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about a single synchronization job.</p>
     * 
     * @param request GetSynchronizationJobRequest
     * @return GetSynchronizationJobResponse
     */
    public GetSynchronizationJobResponse getSynchronizationJob(GetSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
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
     * <p>分页查询应用下的应用账户列表</p>
     * 
     * @param request ListApplicationAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationAccountsResponse
     */
    public ListApplicationAccountsResponse listApplicationAccountsWithOptions(ListApplicationAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationAccounts"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分页查询应用下的应用账户列表</p>
     * 
     * @param request ListApplicationAccountsRequest
     * @return ListApplicationAccountsResponse
     */
    public ListApplicationAccountsResponse listApplicationAccounts(ListApplicationAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前应用下指定用户的所有账号</p>
     * 
     * @param request ListApplicationAccountsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationAccountsForUserResponse
     */
    public ListApplicationAccountsForUserResponse listApplicationAccountsForUserWithOptions(ListApplicationAccountsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationAccountsForUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationAccountsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询当前应用下指定用户的所有账号</p>
     * 
     * @param request ListApplicationAccountsForUserRequest
     * @return ListApplicationAccountsForUserResponse
     */
    public ListApplicationAccountsForUserResponse listApplicationAccountsForUser(ListApplicationAccountsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationAccountsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all client keys of an Employee Identity and Access Management (EIAM) application. The returned key secret is not masked. If you want to query the key secret that is masked, call the ObtainApplicationClientSecret operation.</p>
     * 
     * @param request ListApplicationClientSecretsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationClientSecretsResponse
     */
    public ListApplicationClientSecretsResponse listApplicationClientSecretsWithOptions(ListApplicationClientSecretsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationClientSecrets"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationClientSecretsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all client keys of an Employee Identity and Access Management (EIAM) application. The returned key secret is not masked. If you want to query the key secret that is masked, call the ObtainApplicationClientSecret operation.</p>
     * 
     * @param request ListApplicationClientSecretsRequest
     * @return ListApplicationClientSecretsResponse
     */
    public ListApplicationClientSecretsResponse listApplicationClientSecrets(ListApplicationClientSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationClientSecretsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用联邦凭证列表</p>
     * 
     * @param request ListApplicationFederatedCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationFederatedCredentialsResponse
     */
    public ListApplicationFederatedCredentialsResponse listApplicationFederatedCredentialsWithOptions(ListApplicationFederatedCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialType)) {
            query.put("ApplicationFederatedCredentialType", request.applicationFederatedCredentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationFederatedCredentials"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationFederatedCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询应用联邦凭证列表</p>
     * 
     * @param request ListApplicationFederatedCredentialsRequest
     * @return ListApplicationFederatedCredentialsResponse
     */
    public ListApplicationFederatedCredentialsResponse listApplicationFederatedCredentials(ListApplicationFederatedCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationFederatedCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据联邦凭证提供方查询应用联邦凭证列表</p>
     * 
     * @param request ListApplicationFederatedCredentialsForProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationFederatedCredentialsForProviderResponse
     */
    public ListApplicationFederatedCredentialsForProviderResponse listApplicationFederatedCredentialsForProviderWithOptions(ListApplicationFederatedCredentialsForProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationFederatedCredentialsForProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationFederatedCredentialsForProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据联邦凭证提供方查询应用联邦凭证列表</p>
     * 
     * @param request ListApplicationFederatedCredentialsForProviderRequest
     * @return ListApplicationFederatedCredentialsForProviderResponse
     */
    public ListApplicationFederatedCredentialsForProviderResponse listApplicationFederatedCredentialsForProvider(ListApplicationFederatedCredentialsForProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationFederatedCredentialsForProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>应用支持账户同步类型列表</p>
     * 
     * @param request ListApplicationSupportedProvisionProtocolTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationSupportedProvisionProtocolTypesResponse
     */
    public ListApplicationSupportedProvisionProtocolTypesResponse listApplicationSupportedProvisionProtocolTypesWithOptions(ListApplicationSupportedProvisionProtocolTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationSupportedProvisionProtocolTypes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationSupportedProvisionProtocolTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>应用支持账户同步类型列表</p>
     * 
     * @param request ListApplicationSupportedProvisionProtocolTypesRequest
     * @return ListApplicationSupportedProvisionProtocolTypesResponse
     */
    public ListApplicationSupportedProvisionProtocolTypesResponse listApplicationSupportedProvisionProtocolTypes(ListApplicationSupportedProvisionProtocolTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationSupportedProvisionProtocolTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用Token</p>
     * 
     * @param request ListApplicationTokensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationTokensResponse
     */
    public ListApplicationTokensResponse listApplicationTokensWithOptions(ListApplicationTokensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenType)) {
            query.put("ApplicationTokenType", request.applicationTokenType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationTokens"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationTokensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建应用Token</p>
     * 
     * @param request ListApplicationTokensRequest
     * @return ListApplicationTokensResponse
     */
    public ListApplicationTokensResponse listApplicationTokens(ListApplicationTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationTokensWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or multiple Employee Identity and Access Management (EIAM) applications by page.</p>
     * 
     * @param request ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationType)) {
            query.put("AuthorizationType", request.authorizationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.m2MClientStatus)) {
            query.put("M2MClientStatus", request.m2MClientStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerStatus)) {
            query.put("ResourceServerStatus", request.resourceServerStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ssoType)) {
            query.put("SsoType", request.ssoType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>summary</b> : 
     * <p>Queries the information about one or multiple Employee Identity and Access Management (EIAM) applications by page.</p>
     * 
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个EIAM组可访问的应用列表</p>
     * 
     * @param request ListApplicationsForGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForGroupResponse
     */
    public ListApplicationsForGroupResponse listApplicationsForGroupWithOptions(ListApplicationsForGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询一个EIAM组可访问的应用列表</p>
     * 
     * @param request ListApplicationsForGroupRequest
     * @return ListApplicationsForGroupResponse
     */
    public ListApplicationsForGroupResponse listApplicationsForGroup(ListApplicationsForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络访问端点下的App信息。</p>
     * 
     * @param request ListApplicationsForNetworkAccessEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForNetworkAccessEndpointResponse
     */
    public ListApplicationsForNetworkAccessEndpointResponse listApplicationsForNetworkAccessEndpointWithOptions(ListApplicationsForNetworkAccessEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForNetworkAccessEndpoint"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForNetworkAccessEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络访问端点下的App信息。</p>
     * 
     * @param request ListApplicationsForNetworkAccessEndpointRequest
     * @return ListApplicationsForNetworkAccessEndpointResponse
     */
    public ListApplicationsForNetworkAccessEndpointResponse listApplicationsForNetworkAccessEndpoint(ListApplicationsForNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取NetworkZone关联的应用列表</p>
     * 
     * @param request ListApplicationsForNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForNetworkZoneResponse
     */
    public ListApplicationsForNetworkZoneResponse listApplicationsForNetworkZoneWithOptions(ListApplicationsForNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForNetworkZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取NetworkZone关联的应用列表</p>
     * 
     * @param request ListApplicationsForNetworkZoneRequest
     * @return ListApplicationsForNetworkZoneResponse
     */
    public ListApplicationsForNetworkZoneResponse listApplicationsForNetworkZone(ListApplicationsForNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the <strong>ApplicationIds</strong> parameter when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications that an Employee Identity and Access Management (EIAM) organization can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.</p>
     * 
     * @param request ListApplicationsForOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForOrganizationalUnitResponse
     */
    public ListApplicationsForOrganizationalUnitResponse listApplicationsForOrganizationalUnitWithOptions(ListApplicationsForOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForOrganizationalUnitResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the <strong>ApplicationIds</strong> parameter when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications that an Employee Identity and Access Management (EIAM) organization can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.</p>
     * 
     * @param request ListApplicationsForOrganizationalUnitRequest
     * @return ListApplicationsForOrganizationalUnitResponse
     */
    public ListApplicationsForOrganizationalUnitResponse listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications that an Employee Identity and Access Management (EIAM) account can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.</p>
     * 
     * @param request ListApplicationsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForUserResponse
     */
    public ListApplicationsForUserResponse listApplicationsForUserWithOptions(ListApplicationsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryMode)) {
            query.put("QueryMode", request.queryMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applications that an Employee Identity and Access Management (EIAM) account can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.</p>
     * 
     * @param request ListApplicationsForUserRequest
     * @return ListApplicationsForUserResponse
     */
    public ListApplicationsForUserResponse listApplicationsForUser(ListApplicationsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌列表</p>
     * 
     * @param request ListBrandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBrandsResponse
     */
    public ListBrandsResponse listBrandsWithOptions(ListBrandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBrands"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBrandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌列表</p>
     * 
     * @param request ListBrandsRequest
     * @return ListBrandsResponse
     */
    public ListBrandsResponse listBrands(ListBrandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrandsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Paginated query for the list of conditional access policies</p>
     * 
     * <b>summary</b> : 
     * <p>List of Conditional Access Policies</p>
     * 
     * @param request ListConditionalAccessPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConditionalAccessPoliciesResponse
     */
    public ListConditionalAccessPoliciesResponse listConditionalAccessPoliciesWithOptions(ListConditionalAccessPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConditionalAccessPolicies"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConditionalAccessPoliciesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Paginated query for the list of conditional access policies</p>
     * 
     * <b>summary</b> : 
     * <p>List of Conditional Access Policies</p>
     * 
     * @param request ListConditionalAccessPoliciesRequest
     * @return ListConditionalAccessPoliciesResponse
     */
    public ListConditionalAccessPoliciesResponse listConditionalAccessPolicies(ListConditionalAccessPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConditionalAccessPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用关联的条件访问策略列表</p>
     * 
     * @param request ListConditionalAccessPoliciesForApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConditionalAccessPoliciesForApplicationResponse
     */
    public ListConditionalAccessPoliciesForApplicationResponse listConditionalAccessPoliciesForApplicationWithOptions(ListConditionalAccessPoliciesForApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConditionalAccessPoliciesForApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConditionalAccessPoliciesForApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取应用关联的条件访问策略列表</p>
     * 
     * @param request ListConditionalAccessPoliciesForApplicationRequest
     * @return ListConditionalAccessPoliciesForApplicationResponse
     */
    public ListConditionalAccessPoliciesForApplicationResponse listConditionalAccessPoliciesForApplication(ListConditionalAccessPoliciesForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConditionalAccessPoliciesForApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>List Conditional Access Policies Associated with Network Zones</p>
     * 
     * <b>summary</b> : 
     * <p>List Conditional Access Policies Associated with Network Areas</p>
     * 
     * @param request ListConditionalAccessPoliciesForNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConditionalAccessPoliciesForNetworkZoneResponse
     */
    public ListConditionalAccessPoliciesForNetworkZoneResponse listConditionalAccessPoliciesForNetworkZoneWithOptions(ListConditionalAccessPoliciesForNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConditionalAccessPoliciesForNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConditionalAccessPoliciesForNetworkZoneResponse());
    }

    /**
     * <b>description</b> :
     * <p>List Conditional Access Policies Associated with Network Zones</p>
     * 
     * <b>summary</b> : 
     * <p>List Conditional Access Policies Associated with Network Areas</p>
     * 
     * @param request ListConditionalAccessPoliciesForNetworkZoneRequest
     * @return ListConditionalAccessPoliciesForNetworkZoneResponse
     */
    public ListConditionalAccessPoliciesForNetworkZoneResponse listConditionalAccessPoliciesForNetworkZone(ListConditionalAccessPoliciesForNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConditionalAccessPoliciesForNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户关联的条件访问策略列表</p>
     * 
     * @param request ListConditionalAccessPoliciesForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConditionalAccessPoliciesForUserResponse
     */
    public ListConditionalAccessPoliciesForUserResponse listConditionalAccessPoliciesForUserWithOptions(ListConditionalAccessPoliciesForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConditionalAccessPoliciesForUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConditionalAccessPoliciesForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取用户关联的条件访问策略列表</p>
     * 
     * @param request ListConditionalAccessPoliciesForUserRequest
     * @return ListConditionalAccessPoliciesForUserResponse
     */
    public ListConditionalAccessPoliciesForUserResponse listConditionalAccessPoliciesForUser(ListConditionalAccessPoliciesForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConditionalAccessPoliciesForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>自定义条款列表查询。</p>
     * 
     * @param request ListCustomPrivacyPoliciesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomPrivacyPoliciesResponse
     */
    public ListCustomPrivacyPoliciesResponse listCustomPrivacyPoliciesWithOptions(ListCustomPrivacyPoliciesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyNameStartsWith)) {
            query.put("CustomPrivacyPolicyNameStartsWith", request.customPrivacyPolicyNameStartsWith);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomPrivacyPolicies"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomPrivacyPoliciesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>自定义条款列表查询。</p>
     * 
     * @param request ListCustomPrivacyPoliciesRequest
     * @return ListCustomPrivacyPoliciesResponse
     */
    public ListCustomPrivacyPoliciesResponse listCustomPrivacyPolicies(ListCustomPrivacyPoliciesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomPrivacyPoliciesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌关联资源的资源</p>
     * 
     * @param request ListCustomPrivacyPoliciesForBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomPrivacyPoliciesForBrandResponse
     */
    public ListCustomPrivacyPoliciesForBrandResponse listCustomPrivacyPoliciesForBrandWithOptions(ListCustomPrivacyPoliciesForBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomPrivacyPoliciesForBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomPrivacyPoliciesForBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取品牌关联资源的资源</p>
     * 
     * @param request ListCustomPrivacyPoliciesForBrandRequest
     * @return ListCustomPrivacyPoliciesForBrandResponse
     */
    public ListCustomPrivacyPoliciesForBrandResponse listCustomPrivacyPoliciesForBrand(ListCustomPrivacyPoliciesForBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomPrivacyPoliciesForBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the proxy tokens of a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request ListDomainProxyTokensRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainProxyTokensResponse
     */
    public ListDomainProxyTokensResponse listDomainProxyTokensWithOptions(ListDomainProxyTokensRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomainProxyTokens"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainProxyTokensResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the proxy tokens of a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request ListDomainProxyTokensRequest
     * @return ListDomainProxyTokensResponse
     */
    public ListDomainProxyTokensResponse listDomainProxyTokens(ListDomainProxyTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainProxyTokensWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names of an Employee Identity and Access Management (EIAM) instance. The list contains the initial domain name and custom domain names.</p>
     * 
     * @param request ListDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDomains"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDomainsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of domain names of an Employee Identity and Access Management (EIAM) instance. The list contains the initial domain name and custom domain names.</p>
     * 
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Employee Identity and Access Management (EIAM) V1.0 instances or EIAM V2.0 instances.</p>
     * 
     * @param request ListEiamInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEiamInstancesResponse
     */
    public ListEiamInstancesResponse listEiamInstancesWithOptions(ListEiamInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceRegionId)) {
            query.put("InstanceRegionId", request.instanceRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEiamInstances"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEiamInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Employee Identity and Access Management (EIAM) V1.0 instances or EIAM V2.0 instances.</p>
     * 
     * @param request ListEiamInstancesRequest
     * @return ListEiamInstancesResponse
     */
    public ListEiamInstancesResponse listEiamInstances(ListEiamInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEiamInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions in which Employee Identity and Access Management (EIAM) V1.0 instances or EIAM V2.0 instances reside.</p>
     * 
     * @param request ListEiamRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEiamRegionsResponse
     */
    public ListEiamRegionsResponse listEiamRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEiamRegions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEiamRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the regions in which Employee Identity and Access Management (EIAM) V1.0 instances or EIAM V2.0 instances reside.</p>
     * @return ListEiamRegionsResponse
     */
    public ListEiamRegionsResponse listEiamRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEiamRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询联邦凭证提供方列表</p>
     * 
     * @param request ListFederatedCredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFederatedCredentialProvidersResponse
     */
    public ListFederatedCredentialProvidersResponse listFederatedCredentialProvidersWithOptions(ListFederatedCredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderName)) {
            query.put("FederatedCredentialProviderName", request.federatedCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderType)) {
            query.put("FederatedCredentialProviderType", request.federatedCredentialProviderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFederatedCredentialProviders"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFederatedCredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询联邦凭证提供方列表</p>
     * 
     * @param request ListFederatedCredentialProvidersRequest
     * @return ListFederatedCredentialProvidersResponse
     */
    public ListFederatedCredentialProvidersResponse listFederatedCredentialProviders(ListFederatedCredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFederatedCredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of account groups in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request ListGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(ListGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupExternalId)) {
            query.put("GroupExternalId", request.groupExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupNameStartsWith)) {
            query.put("GroupNameStartsWith", request.groupNameStartsWith);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries a list of account groups in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Queries a list of account groups to which the permissions to access an application are granted. The returned results contain the group IDs. You can call the GetGroup operation to query the information about an account group based on the group ID.</p>
     * 
     * @param request ListGroupsForApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForApplicationResponse
     */
    public ListGroupsForApplicationResponse listGroupsForApplicationWithOptions(ListGroupsForApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsForApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of account groups to which the permissions to access an application are granted. The returned results contain the group IDs. You can call the GetGroup operation to query the information about an account group based on the group ID.</p>
     * 
     * @param request ListGroupsForApplicationRequest
     * @return ListGroupsForApplicationResponse
     */
    public ListGroupsForApplicationResponse listGroupsForApplication(ListGroupsForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of account groups to which an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) belongs.</p>
     * 
     * @param request ListGroupsForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUserWithOptions(ListGroupsForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForUser"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries a list of account groups to which an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) belongs.</p>
     * 
     * @param request ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of identity providers.</p>
     * 
     * @param request ListIdentityProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersResponse
     */
    public ListIdentityProvidersResponse listIdentityProvidersWithOptions(ListIdentityProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProviders"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Query the list of identity providers.</p>
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
     * <p>获取网络端点下的IdP信息。</p>
     * 
     * @param request ListIdentityProvidersForNetworkAccessEndpointRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIdentityProvidersForNetworkAccessEndpointResponse
     */
    public ListIdentityProvidersForNetworkAccessEndpointResponse listIdentityProvidersForNetworkAccessEndpointWithOptions(ListIdentityProvidersForNetworkAccessEndpointRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIdentityProvidersForNetworkAccessEndpoint"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIdentityProvidersForNetworkAccessEndpointResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取网络端点下的IdP信息。</p>
     * 
     * @param request ListIdentityProvidersForNetworkAccessEndpointRequest
     * @return ListIdentityProvidersForNetworkAccessEndpointResponse
     */
    public ListIdentityProvidersForNetworkAccessEndpointResponse listIdentityProvidersForNetworkAccessEndpoint(ListIdentityProvidersForNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIdentityProvidersForNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of one or more Enterprise Identity and Access Management (EIAM) instances of Identity as a Service (IDaaS).</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of one or more Enterprise Identity and Access Management (EIAM) instances of Identity as a Service (IDaaS).</p>
     * 
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get a list of regions that support network access endpoints.</p>
     * 
     * @param request ListNetworkAccessEndpointAvailableRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkAccessEndpointAvailableRegionsResponse
     */
    public ListNetworkAccessEndpointAvailableRegionsResponse listNetworkAccessEndpointAvailableRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkAccessEndpointAvailableRegions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkAccessEndpointAvailableRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get a list of regions that support network access endpoints.</p>
     * @return ListNetworkAccessEndpointAvailableRegionsResponse
     */
    public ListNetworkAccessEndpointAvailableRegionsResponse listNetworkAccessEndpointAvailableRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointAvailableRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持NAE的可用区列表</p>
     * 
     * @param request ListNetworkAccessEndpointAvailableZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkAccessEndpointAvailableZonesResponse
     */
    public ListNetworkAccessEndpointAvailableZonesResponse listNetworkAccessEndpointAvailableZonesWithOptions(ListNetworkAccessEndpointAvailableZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.naeRegionId)) {
            query.put("NaeRegionId", request.naeRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkAccessEndpointAvailableZones"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkAccessEndpointAvailableZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取支持NAE的可用区列表</p>
     * 
     * @param request ListNetworkAccessEndpointAvailableZonesRequest
     * @return ListNetworkAccessEndpointAvailableZonesResponse
     */
    public ListNetworkAccessEndpointAvailableZonesResponse listNetworkAccessEndpointAvailableZones(ListNetworkAccessEndpointAvailableZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointAvailableZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询专属网络端点。</p>
     * 
     * @param request ListNetworkAccessEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkAccessEndpointsResponse
     */
    public ListNetworkAccessEndpointsResponse listNetworkAccessEndpointsWithOptions(ListNetworkAccessEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointStatus)) {
            query.put("NetworkAccessEndpointStatus", request.networkAccessEndpointStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointType)) {
            query.put("NetworkAccessEndpointType", request.networkAccessEndpointType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcRegionId)) {
            query.put("VpcRegionId", request.vpcRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkAccessEndpoints"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkAccessEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>列表查询专属网络端点。</p>
     * 
     * @param request ListNetworkAccessEndpointsRequest
     * @return ListNetworkAccessEndpointsResponse
     */
    public ListNetworkAccessEndpointsResponse listNetworkAccessEndpoints(ListNetworkAccessEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List the access paths under a certain network access endpoint.</p>
     * 
     * @param request ListNetworkAccessPathsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkAccessPathsResponse
     */
    public ListNetworkAccessPathsResponse listNetworkAccessPathsWithOptions(ListNetworkAccessPathsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkAccessPaths"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkAccessPathsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List the access paths under a certain network access endpoint.</p>
     * 
     * @param request ListNetworkAccessPathsRequest
     * @return ListNetworkAccessPathsResponse
     */
    public ListNetworkAccessPathsResponse listNetworkAccessPaths(ListNetworkAccessPathsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessPathsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>网络区域对象列表</p>
     * 
     * @param request ListNetworkZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkZonesResponse
     */
    public ListNetworkZonesResponse listNetworkZonesWithOptions(ListNetworkZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneIds)) {
            query.put("NetworkZoneIds", request.networkZoneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkZones"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>网络区域对象列表</p>
     * 
     * @param request ListNetworkZonesRequest
     * @return ListNetworkZonesResponse
     */
    public ListNetworkZonesResponse listNetworkZones(ListNetworkZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all parent organizations of an Employee Identity and Access Management (EIAM) organization.</p>
     * 
     * @param request ListOrganizationalUnitParentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitParentsResponse
     */
    public ListOrganizationalUnitParentsResponse listOrganizationalUnitParentsWithOptions(ListOrganizationalUnitParentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnitParents"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitParentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all parent organizations of an Employee Identity and Access Management (EIAM) organization.</p>
     * 
     * @param request ListOrganizationalUnitParentsRequest
     * @return ListOrganizationalUnitParentsResponse
     */
    public ListOrganizationalUnitParentsResponse listOrganizationalUnitParents(ListOrganizationalUnitParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitParentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about organizational units in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.</p>
     * 
     * @param request ListOrganizationalUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnitsWithOptions(ListOrganizationalUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            query.put("OrganizationalUnitName", request.organizationalUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitNameStartsWith)) {
            query.put("OrganizationalUnitNameStartsWith", request.organizationalUnitNameStartsWith);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnits"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about organizational units in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.</p>
     * 
     * @param request ListOrganizationalUnitsRequest
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnits(ListOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the organizations that are allowed to access an Employee Identity and Access Management (EIAM) application by page. The return result includes the IDs of the organizations. If you want to obtain the details of the organizations, call the GetOrganizationalUnit operation.</p>
     * 
     * @param request ListOrganizationalUnitsForApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitsForApplicationResponse
     */
    public ListOrganizationalUnitsForApplicationResponse listOrganizationalUnitsForApplicationWithOptions(ListOrganizationalUnitsForApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnitsForApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitsForApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the organizations that are allowed to access an Employee Identity and Access Management (EIAM) application by page. The return result includes the IDs of the organizations. If you want to obtain the details of the organizations, call the GetOrganizationalUnit operation.</p>
     * 
     * @param request ListOrganizationalUnitsForApplicationRequest
     * @return ListOrganizationalUnitsForApplicationResponse
     */
    public ListOrganizationalUnitsForApplicationResponse listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitsForApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the supported Alibaba Cloud regions.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the supported Alibaba Cloud regions.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询同步任务</p>
     * 
     * @param request ListSynchronizationJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSynchronizationJobsResponse
     */
    public ListSynchronizationJobsResponse listSynchronizationJobsWithOptions(ListSynchronizationJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetIds)) {
            query.put("TargetIds", request.targetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSynchronizationJobs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSynchronizationJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询同步任务</p>
     * 
     * @param request ListSynchronizationJobsRequest
     * @return ListSynchronizationJobsResponse
     */
    public ListSynchronizationJobsResponse listSynchronizationJobs(ListSynchronizationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSynchronizationJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询三方登录账户绑定关系</p>
     * 
     * @param request ListUserAuthnSourceMappingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserAuthnSourceMappingsResponse
     */
    public ListUserAuthnSourceMappingsResponse listUserAuthnSourceMappingsWithOptions(ListUserAuthnSourceMappingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            query.put("UserExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserAuthnSourceMappings"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserAuthnSourceMappingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询三方登录账户绑定关系</p>
     * 
     * @param request ListUserAuthnSourceMappingsRequest
     * @return ListUserAuthnSourceMappingsResponse
     */
    public ListUserAuthnSourceMappingsResponse listUserAuthnSourceMappings(ListUserAuthnSourceMappingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserAuthnSourceMappingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of accounts in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.displayNameStartsWith)) {
            query.put("DisplayNameStartsWith", request.displayNameStartsWith);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            query.put("PhoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            query.put("UserExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceId)) {
            query.put("UserSourceId", request.userSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceType)) {
            query.put("UserSourceType", request.userSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usernameStartsWith)) {
            query.put("UsernameStartsWith", request.usernameStartsWith);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries the details of accounts in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.</p>
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
     * <p>Queries the accounts that are allowed to access an Employee Identity and Access Management (EIAM) application. The return results include the IDs of the accounts. If you need to obtain the details of the accounts, call the GetUser operation.</p>
     * 
     * @param request ListUsersForApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForApplicationResponse
     */
    public ListUsersForApplicationResponse listUsersForApplicationWithOptions(ListUsersForApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersForApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts that are allowed to access an Employee Identity and Access Management (EIAM) application. The return results include the IDs of the accounts. If you need to obtain the details of the accounts, call the GetUser operation.</p>
     * 
     * @param request ListUsersForApplicationRequest
     * @return ListUsersForApplicationResponse
     */
    public ListUsersForApplicationResponse listUsersForApplication(ListUsersForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of accounts in an Employee Identity and Access Management (EIAM) group of Identity as a Service (IDaaS).</p>
     * 
     * @param request ListUsersForGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroupWithOptions(ListUsersForGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForGroup"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Queries the information of accounts in an Employee Identity and Access Management (EIAM) group of Identity as a Service (IDaaS).</p>
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
     * <p>Queries a client key of an Employee Identity and Access Management (EIAM) application. The returned key secret is masked. If you want to query the key secret that is not masked, call the ListApplicationClientSecrets operation.</p>
     * 
     * @param request ObtainApplicationClientSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainApplicationClientSecretResponse
     */
    public ObtainApplicationClientSecretResponse obtainApplicationClientSecretWithOptions(ObtainApplicationClientSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainApplicationClientSecret"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ObtainApplicationClientSecretResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a client key of an Employee Identity and Access Management (EIAM) application. The returned key secret is masked. If you want to query the key secret that is not masked, call the ListApplicationClientSecrets operation.</p>
     * 
     * @param request ObtainApplicationClientSecretRequest
     * @return ObtainApplicationClientSecretResponse
     */
    public ObtainApplicationClientSecretResponse obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定应用Token</p>
     * 
     * @param request ObtainApplicationTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainApplicationTokenResponse
     */
    public ObtainApplicationTokenResponse obtainApplicationTokenWithOptions(ObtainApplicationTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenId)) {
            query.put("ApplicationTokenId", request.applicationTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainApplicationToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ObtainApplicationTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定应用Token</p>
     * 
     * @param request ObtainApplicationTokenRequest
     * @return ObtainApplicationTokenResponse
     */
    public ObtainApplicationTokenResponse obtainApplicationToken(ObtainApplicationTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainApplicationTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a proxy token of a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request ObtainDomainProxyTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainDomainProxyTokenResponse
     */
    public ObtainDomainProxyTokenResponse obtainDomainProxyTokenWithOptions(ObtainDomainProxyTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainProxyTokenId)) {
            query.put("DomainProxyTokenId", request.domainProxyTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainDomainProxyToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ObtainDomainProxyTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a proxy token of a domain name of an Employee Identity and Access Management (EIAM) instance.</p>
     * 
     * @param request ObtainDomainProxyTokenRequest
     * @return ObtainDomainProxyTokenResponse
     */
    public ObtainDomainProxyTokenResponse obtainDomainProxyToken(ObtainDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个当前应用下的指定员工的应用账号</p>
     * 
     * @param request RemoveApplicationAccountFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApplicationAccountFromUserResponse
     */
    public RemoveApplicationAccountFromUserResponse removeApplicationAccountFromUserWithOptions(RemoveApplicationAccountFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationAccountId)) {
            query.put("ApplicationAccountId", request.applicationAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApplicationAccountFromUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApplicationAccountFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除一个当前应用下的指定员工的应用账号</p>
     * 
     * @param request RemoveApplicationAccountFromUserRequest
     * @return RemoveApplicationAccountFromUserResponse
     */
    public RemoveApplicationAccountFromUserResponse removeApplicationAccountFromUser(RemoveApplicationAccountFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApplicationAccountFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除品牌关联条款</p>
     * 
     * @param request RemoveCustomPrivacyPoliciesFromBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveCustomPrivacyPoliciesFromBrandResponse
     */
    public RemoveCustomPrivacyPoliciesFromBrandResponse removeCustomPrivacyPoliciesFromBrandWithOptions(RemoveCustomPrivacyPoliciesFromBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyIds)) {
            query.put("CustomPrivacyPolicyIds", request.customPrivacyPolicyIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveCustomPrivacyPoliciesFromBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveCustomPrivacyPoliciesFromBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除品牌关联条款</p>
     * 
     * @param request RemoveCustomPrivacyPoliciesFromBrandRequest
     * @return RemoveCustomPrivacyPoliciesFromBrandResponse
     */
    public RemoveCustomPrivacyPoliciesFromBrandResponse removeCustomPrivacyPoliciesFromBrand(RemoveCustomPrivacyPoliciesFromBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeCustomPrivacyPoliciesFromBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an Employee Identity and Access Management (EIAM) account from multiple EIAM organizations of Identity as a Service (IDaaS). You cannot remove an account from a primary organization.</p>
     * 
     * @param request RemoveUserFromOrganizationalUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    public RemoveUserFromOrganizationalUnitsResponse removeUserFromOrganizationalUnitsWithOptions(RemoveUserFromOrganizationalUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromOrganizationalUnits"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an Employee Identity and Access Management (EIAM) account from multiple EIAM organizations of Identity as a Service (IDaaS). You cannot remove an account from a primary organization.</p>
     * 
     * @param request RemoveUserFromOrganizationalUnitsRequest
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    public RemoveUserFromOrganizationalUnitsResponse removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes Employee Identity and Access Management (EIAM) accounts from an EIAM group of Identity as a Service (IDaaS).</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroupWithOptions(RemoveUsersFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsersFromGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes Employee Identity and Access Management (EIAM) accounts from an EIAM group of Identity as a Service (IDaaS).</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroup(RemoveUsersFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request RevokeApplicationFromGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeApplicationFromGroupsResponse
     */
    public RevokeApplicationFromGroupsResponse revokeApplicationFromGroupsWithOptions(RevokeApplicationFromGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeApplicationFromGroups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeApplicationFromGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request RevokeApplicationFromGroupsRequest
     * @return RevokeApplicationFromGroupsResponse
     */
    public RevokeApplicationFromGroupsResponse revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) organizations at a time.</p>
     * 
     * @param request RevokeApplicationFromOrganizationalUnitsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeApplicationFromOrganizationalUnitsResponse
     */
    public RevokeApplicationFromOrganizationalUnitsResponse revokeApplicationFromOrganizationalUnitsWithOptions(RevokeApplicationFromOrganizationalUnitsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeApplicationFromOrganizationalUnits"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeApplicationFromOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) organizations at a time.</p>
     * 
     * @param request RevokeApplicationFromOrganizationalUnitsRequest
     * @return RevokeApplicationFromOrganizationalUnitsResponse
     */
    public RevokeApplicationFromOrganizationalUnitsResponse revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) accounts at a time.</p>
     * 
     * @param request RevokeApplicationFromUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeApplicationFromUsersResponse
     */
    public RevokeApplicationFromUsersResponse revokeApplicationFromUsersWithOptions(RevokeApplicationFromUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeApplicationFromUsers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeApplicationFromUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) accounts at a time.</p>
     * 
     * @param request RevokeApplicationFromUsersRequest
     * @return RevokeApplicationFromUsersResponse
     */
    public RevokeApplicationFromUsersResponse revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a synchronization job and immediately runs the job.</p>
     * 
     * @param request RunSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunSynchronizationJobResponse
     */
    public RunSynchronizationJobResponse runSynchronizationJobWithOptions(RunSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitialization)) {
            query.put("PasswordInitialization", request.passwordInitialization);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.synchronizationScopeConfig)) {
            query.put("SynchronizationScopeConfig", request.synchronizationScopeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetId)) {
            query.put("TargetId", request.targetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdentityTypes)) {
            query.put("UserIdentityTypes", request.userIdentityTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunSynchronizationJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a synchronization job and immediately runs the job.</p>
     * 
     * @param request RunSynchronizationJobRequest
     * @return RunSynchronizationJobResponse
     */
    public RunSynchronizationJobResponse runSynchronizationJob(RunSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the permissions of the Developer API feature of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request SetApplicationGrantScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationGrantScopeResponse
     */
    public SetApplicationGrantScopeResponse setApplicationGrantScopeWithOptions(SetApplicationGrantScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantScopes)) {
            query.put("GrantScopes", request.grantScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationGrantScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationGrantScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the permissions of the Developer API feature of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request SetApplicationGrantScopeRequest
     * @return SetApplicationGrantScopeResponse
     */
    public SetApplicationGrantScopeResponse setApplicationGrantScope(SetApplicationGrantScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationGrantScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request SetApplicationProvisioningConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationProvisioningConfigResponse
     */
    public SetApplicationProvisioningConfigResponse setApplicationProvisioningConfigWithOptions(SetApplicationProvisioningConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.callbackProvisioningConfig)) {
            query.put("CallbackProvisioningConfig", request.callbackProvisioningConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionPassword)) {
            query.put("ProvisionPassword", request.provisionPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.provisionProtocolType)) {
            query.put("ProvisionProtocolType", request.provisionProtocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scimProvisioningConfig)) {
            query.put("ScimProvisioningConfig", request.scimProvisioningConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationProvisioningConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationProvisioningConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
     * 
     * @param request SetApplicationProvisioningConfigRequest
     * @return SetApplicationProvisioningConfigResponse
     */
    public SetApplicationProvisioningConfigResponse setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationProvisioningConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.</p>
     * 
     * @param request SetApplicationProvisioningScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationProvisioningScopeResponse
     */
    public SetApplicationProvisioningScopeResponse setApplicationProvisioningScopeWithOptions(SetApplicationProvisioningScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            query.put("OrganizationalUnitIds", request.organizationalUnitIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationProvisioningScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationProvisioningScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.</p>
     * 
     * @param request SetApplicationProvisioningScopeRequest
     * @return SetApplicationProvisioningScopeResponse
     */
    public SetApplicationProvisioningScopeResponse setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationProvisioningScopeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Specifies the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request SetApplicationSsoConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationSsoConfigResponse
     */
    public SetApplicationSsoConfigResponse setApplicationSsoConfigWithOptions(SetApplicationSsoConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initLoginType)) {
            query.put("InitLoginType", request.initLoginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.initLoginUrl)) {
            query.put("InitLoginUrl", request.initLoginUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcSsoConfig)) {
            query.put("OidcSsoConfig", request.oidcSsoConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samlSsoConfig)) {
            query.put("SamlSsoConfig", request.samlSsoConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationSsoConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationSsoConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.</p>
     * 
     * <b>summary</b> : 
     * <p>Specifies the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
     * 
     * @param request SetApplicationSsoConfigRequest
     * @return SetApplicationSsoConfigResponse
     */
    public SetApplicationSsoConfigResponse setApplicationSsoConfig(SetApplicationSsoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationSsoConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a domain name of an Employee Identity and Access Management (EIAM) instance as the default domain name.</p>
     * 
     * @param request SetDefaultDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultDomainResponse
     */
    public SetDefaultDomainResponse setDefaultDomainWithOptions(SetDefaultDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultDomain"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Sets a domain name of an Employee Identity and Access Management (EIAM) instance as the default domain name.</p>
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
     * <p>Configures a forgot password policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetForgetPasswordConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetForgetPasswordConfigurationResponse
     */
    public SetForgetPasswordConfigurationResponse setForgetPasswordConfigurationWithOptions(SetForgetPasswordConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationChannels)) {
            query.put("AuthenticationChannels", request.authenticationChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forgetPasswordStatus)) {
            query.put("ForgetPasswordStatus", request.forgetPasswordStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetForgetPasswordConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetForgetPasswordConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a forgot password policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetForgetPasswordConfigurationRequest
     * @return SetForgetPasswordConfigurationResponse
     */
    public SetForgetPasswordConfigurationResponse setForgetPasswordConfiguration(SetForgetPasswordConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setForgetPasswordConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update IdP synchronization configuration.</p>
     * 
     * @param request SetIdentityProviderUdPullConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdentityProviderUdPullConfigurationResponse
     */
    public SetIdentityProviderUdPullConfigurationResponse setIdentityProviderUdPullConfigurationWithOptions(SetIdentityProviderUdPullConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupSyncStatus)) {
            query.put("GroupSyncStatus", request.groupSyncStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementalCallbackStatus)) {
            query.put("IncrementalCallbackStatus", request.incrementalCallbackStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ldapUdPullConfig)) {
            query.put("LdapUdPullConfig", request.ldapUdPullConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodicSyncConfig)) {
            query.put("PeriodicSyncConfig", request.periodicSyncConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodicSyncStatus)) {
            query.put("PeriodicSyncStatus", request.periodicSyncStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pullProtectedRule)) {
            query.put("PullProtectedRule", request.pullProtectedRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udSyncScopeConfig)) {
            query.put("UdSyncScopeConfig", request.udSyncScopeConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdentityProviderUdPullConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdentityProviderUdPullConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update IdP synchronization configuration.</p>
     * 
     * @param request SetIdentityProviderUdPullConfigurationRequest
     * @return SetIdentityProviderUdPullConfigurationResponse
     */
    public SetIdentityProviderUdPullConfigurationResponse setIdentityProviderUdPullConfiguration(SetIdentityProviderUdPullConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdentityProviderUdPullConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为品牌设置登录后跳转应用</p>
     * 
     * @param request SetLoginRedirectApplicationForBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoginRedirectApplicationForBrandResponse
     */
    public SetLoginRedirectApplicationForBrandResponse setLoginRedirectApplicationForBrandWithOptions(SetLoginRedirectApplicationForBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoginRedirectApplicationForBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoginRedirectApplicationForBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>为品牌设置登录后跳转应用</p>
     * 
     * @param request SetLoginRedirectApplicationForBrandRequest
     * @return SetLoginRedirectApplicationForBrandResponse
     */
    public SetLoginRedirectApplicationForBrandResponse setLoginRedirectApplicationForBrand(SetLoginRedirectApplicationForBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoginRedirectApplicationForBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password complexity policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordComplexityConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordComplexityConfigurationResponse
     */
    public SetPasswordComplexityConfigurationResponse setPasswordComplexityConfigurationWithOptions(SetPasswordComplexityConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordComplexityRules)) {
            query.put("PasswordComplexityRules", request.passwordComplexityRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordMinLength)) {
            query.put("PasswordMinLength", request.passwordMinLength);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordComplexityConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordComplexityConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password complexity policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordComplexityConfigurationRequest
     * @return SetPasswordComplexityConfigurationResponse
     */
    public SetPasswordComplexityConfigurationResponse setPasswordComplexityConfiguration(SetPasswordComplexityConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordComplexityConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password expiration policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordExpirationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordExpirationConfigurationResponse
     */
    public SetPasswordExpirationConfigurationResponse setPasswordExpirationConfigurationWithOptions(SetPasswordExpirationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.effectiveAuthenticationSourceIds)) {
            query.put("EffectiveAuthenticationSourceIds", request.effectiveAuthenticationSourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpirationAction)) {
            query.put("PasswordExpirationAction", request.passwordExpirationAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpirationNotificationChannels)) {
            query.put("PasswordExpirationNotificationChannels", request.passwordExpirationNotificationChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpirationNotificationDuration)) {
            query.put("PasswordExpirationNotificationDuration", request.passwordExpirationNotificationDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpirationNotificationStatus)) {
            query.put("PasswordExpirationNotificationStatus", request.passwordExpirationNotificationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpirationStatus)) {
            query.put("PasswordExpirationStatus", request.passwordExpirationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordForcedUpdateDuration)) {
            query.put("PasswordForcedUpdateDuration", request.passwordForcedUpdateDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordValidMaxDay)) {
            query.put("PasswordValidMaxDay", request.passwordValidMaxDay);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordExpirationConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordExpirationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password expiration policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordExpirationConfigurationRequest
     * @return SetPasswordExpirationConfigurationResponse
     */
    public SetPasswordExpirationConfigurationResponse setPasswordExpirationConfiguration(SetPasswordExpirationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordExpirationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password history policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordHistoryConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordHistoryConfigurationResponse
     */
    public SetPasswordHistoryConfigurationResponse setPasswordHistoryConfigurationWithOptions(SetPasswordHistoryConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordHistoryMaxRetention)) {
            query.put("PasswordHistoryMaxRetention", request.passwordHistoryMaxRetention);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordHistoryStatus)) {
            query.put("PasswordHistoryStatus", request.passwordHistoryStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordHistoryConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordHistoryConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures a password history policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordHistoryConfigurationRequest
     * @return SetPasswordHistoryConfigurationResponse
     */
    public SetPasswordHistoryConfigurationResponse setPasswordHistoryConfiguration(SetPasswordHistoryConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordHistoryConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the password initialization configurations for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordInitializationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordInitializationConfigurationResponse
     */
    public SetPasswordInitializationConfigurationResponse setPasswordInitializationConfigurationWithOptions(SetPasswordInitializationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordForcedUpdateStatus)) {
            query.put("PasswordForcedUpdateStatus", request.passwordForcedUpdateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitializationNotificationChannels)) {
            query.put("PasswordInitializationNotificationChannels", request.passwordInitializationNotificationChannels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitializationStatus)) {
            query.put("PasswordInitializationStatus", request.passwordInitializationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitializationType)) {
            query.put("PasswordInitializationType", request.passwordInitializationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPasswordInitializationConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPasswordInitializationConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the password initialization configurations for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request SetPasswordInitializationConfigurationRequest
     * @return SetPasswordInitializationConfigurationResponse
     */
    public SetPasswordInitializationConfigurationResponse setPasswordInitializationConfiguration(SetPasswordInitializationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordInitializationConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the primary organizational unit to which an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account belongs. This account will be removed from the previous primary organizational unit and added to the new primary organization.</p>
     * 
     * @param request SetUserPrimaryOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    public SetUserPrimaryOrganizationalUnitResponse setUserPrimaryOrganizationalUnitWithOptions(SetUserPrimaryOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserPrimaryOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserPrimaryOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the primary organizational unit to which an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account belongs. This account will be removed from the previous primary organizational unit and added to the new primary organization.</p>
     * 
     * @param request SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    public SetUserPrimaryOrganizationalUnitResponse setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserPrimaryOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解绑三方登录账户</p>
     * 
     * @param request UnbindUserAuthnSourceMappingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindUserAuthnSourceMappingResponse
     */
    public UnbindUserAuthnSourceMappingResponse unbindUserAuthnSourceMappingWithOptions(UnbindUserAuthnSourceMappingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            query.put("UserExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindUserAuthnSourceMapping"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindUserAuthnSourceMappingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解绑三方登录账户</p>
     * 
     * @param request UnbindUserAuthnSourceMappingRequest
     * @return UnbindUserAuthnSourceMappingResponse
     */
    public UnbindUserAuthnSourceMappingResponse unbindUserAuthnSourceMapping(UnbindUserAuthnSourceMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindUserAuthnSourceMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) that is locked.</p>
     * 
     * @param request UnlockUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockUserResponse
     */
    public UnlockUserResponse unlockUserWithOptions(UnlockUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) that is locked.</p>
     * 
     * @param request UnlockUserRequest
     * @return UnlockUserResponse
     */
    public UnlockUserResponse unlockUser(UnlockUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用高阶配置</p>
     * 
     * @param request UpdateApplicationAdvancedConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationAdvancedConfigResponse
     */
    public UpdateApplicationAdvancedConfigResponse updateApplicationAdvancedConfigWithOptions(UpdateApplicationAdvancedConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scimServerAdvancedConfig)) {
            query.put("ScimServerAdvancedConfig", request.scimServerAdvancedConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationAdvancedConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationAdvancedConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改应用高阶配置</p>
     * 
     * @param request UpdateApplicationAdvancedConfigRequest
     * @return UpdateApplicationAdvancedConfigResponse
     */
    public UpdateApplicationAdvancedConfigResponse updateApplicationAdvancedConfig(UpdateApplicationAdvancedConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationAdvancedConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the authorization type of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request UpdateApplicationAuthorizationTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationAuthorizationTypeResponse
     */
    public UpdateApplicationAuthorizationTypeResponse updateApplicationAuthorizationTypeWithOptions(UpdateApplicationAuthorizationTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationType)) {
            query.put("AuthorizationType", request.authorizationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationAuthorizationType"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationAuthorizationTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the authorization type of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request UpdateApplicationAuthorizationTypeRequest
     * @return UpdateApplicationAuthorizationTypeResponse
     */
    public UpdateApplicationAuthorizationTypeResponse updateApplicationAuthorizationType(UpdateApplicationAuthorizationTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationAuthorizationTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用的指定ClientSecret的到期时间</p>
     * 
     * @param request UpdateApplicationClientSecretExpirationTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationClientSecretExpirationTimeResponse
     */
    public UpdateApplicationClientSecretExpirationTimeResponse updateApplicationClientSecretExpirationTimeWithOptions(UpdateApplicationClientSecretExpirationTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("ExpirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secretId)) {
            query.put("SecretId", request.secretId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationClientSecretExpirationTime"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationClientSecretExpirationTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用的指定ClientSecret的到期时间</p>
     * 
     * @param request UpdateApplicationClientSecretExpirationTimeRequest
     * @return UpdateApplicationClientSecretExpirationTimeResponse
     */
    public UpdateApplicationClientSecretExpirationTimeResponse updateApplicationClientSecretExpirationTime(UpdateApplicationClientSecretExpirationTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationClientSecretExpirationTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request UpdateApplicationDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationDescriptionResponse
     */
    public UpdateApplicationDescriptionResponse updateApplicationDescriptionWithOptions(UpdateApplicationDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Employee Identity and Access Management (EIAM) application.</p>
     * 
     * @param request UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    public UpdateApplicationDescriptionResponse updateApplicationDescription(UpdateApplicationDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用联邦凭证</p>
     * 
     * @param request UpdateApplicationFederatedCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationFederatedCredentialResponse
     */
    public UpdateApplicationFederatedCredentialResponse updateApplicationFederatedCredentialWithOptions(UpdateApplicationFederatedCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.attributeMappings)) {
            query.put("AttributeMappings", request.attributeMappings);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.verificationCondition)) {
            query.put("VerificationCondition", request.verificationCondition);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationFederatedCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationFederatedCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用联邦凭证</p>
     * 
     * @param request UpdateApplicationFederatedCredentialRequest
     * @return UpdateApplicationFederatedCredentialResponse
     */
    public UpdateApplicationFederatedCredentialResponse updateApplicationFederatedCredential(UpdateApplicationFederatedCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationFederatedCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用联邦凭证描述</p>
     * 
     * @param request UpdateApplicationFederatedCredentialDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationFederatedCredentialDescriptionResponse
     */
    public UpdateApplicationFederatedCredentialDescriptionResponse updateApplicationFederatedCredentialDescriptionWithOptions(UpdateApplicationFederatedCredentialDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationFederatedCredentialId)) {
            query.put("ApplicationFederatedCredentialId", request.applicationFederatedCredentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationFederatedCredentialDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationFederatedCredentialDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用联邦凭证描述</p>
     * 
     * @param request UpdateApplicationFederatedCredentialDescriptionRequest
     * @return UpdateApplicationFederatedCredentialDescriptionResponse
     */
    public UpdateApplicationFederatedCredentialDescriptionResponse updateApplicationFederatedCredentialDescription(UpdateApplicationFederatedCredentialDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationFederatedCredentialDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用基本信息</p>
     * 
     * @param request UpdateApplicationInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationInfoResponse
     */
    public UpdateApplicationInfoResponse updateApplicationInfoWithOptions(UpdateApplicationInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationVisibility)) {
            query.put("ApplicationVisibility", request.applicationVisibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新应用基本信息</p>
     * 
     * @param request UpdateApplicationInfoRequest
     * @return UpdateApplicationInfoResponse
     */
    public UpdateApplicationInfoResponse updateApplicationInfo(UpdateApplicationInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新模板应用的SSO参数</p>
     * 
     * @param request UpdateApplicationSsoFormParamsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationSsoFormParamsResponse
     */
    public UpdateApplicationSsoFormParamsResponse updateApplicationSsoFormParamsWithOptions(UpdateApplicationSsoFormParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTemplateParams)) {
            query.put("ApplicationTemplateParams", request.applicationTemplateParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationSsoFormParams"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationSsoFormParamsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新模板应用的SSO参数</p>
     * 
     * @param request UpdateApplicationSsoFormParamsRequest
     * @return UpdateApplicationSsoFormParamsResponse
     */
    public UpdateApplicationSsoFormParamsResponse updateApplicationSsoFormParams(UpdateApplicationSsoFormParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationSsoFormParamsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新ApplicationToken过期时间</p>
     * 
     * @param request UpdateApplicationTokenExpirationTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationTokenExpirationTimeResponse
     */
    public UpdateApplicationTokenExpirationTimeResponse updateApplicationTokenExpirationTimeWithOptions(UpdateApplicationTokenExpirationTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTokenId)) {
            query.put("ApplicationTokenId", request.applicationTokenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationTime)) {
            query.put("ExpirationTime", request.expirationTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationTokenExpirationTime"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationTokenExpirationTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新ApplicationToken过期时间</p>
     * 
     * @param request UpdateApplicationTokenExpirationTimeRequest
     * @return UpdateApplicationTokenExpirationTimeResponse
     */
    public UpdateApplicationTokenExpirationTimeResponse updateApplicationTokenExpirationTime(UpdateApplicationTokenExpirationTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationTokenExpirationTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改品牌</p>
     * 
     * @param request UpdateBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBrandResponse
     */
    public UpdateBrandResponse updateBrandWithOptions(UpdateBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.brandName)) {
            query.put("BrandName", request.brandName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改品牌</p>
     * 
     * @param request UpdateBrandRequest
     * @return UpdateBrandResponse
     */
    public UpdateBrandResponse updateBrand(UpdateBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBrandWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Update Conditional Access Policy</p>
     * 
     * @param request UpdateConditionalAccessPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConditionalAccessPolicyResponse
     */
    public UpdateConditionalAccessPolicyResponse updateConditionalAccessPolicyWithOptions(UpdateConditionalAccessPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyName)) {
            query.put("ConditionalAccessPolicyName", request.conditionalAccessPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionsConfig)) {
            query.put("ConditionsConfig", request.conditionsConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decisionConfig)) {
            query.put("DecisionConfig", request.decisionConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.decisionType)) {
            query.put("DecisionType", request.decisionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConditionalAccessPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConditionalAccessPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update Conditional Access Policy</p>
     * 
     * <b>summary</b> : 
     * <p>Update Conditional Access Policy</p>
     * 
     * @param request UpdateConditionalAccessPolicyRequest
     * @return UpdateConditionalAccessPolicyResponse
     */
    public UpdateConditionalAccessPolicyResponse updateConditionalAccessPolicy(UpdateConditionalAccessPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConditionalAccessPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Update Conditional Access Policy Description</p>
     * 
     * <b>summary</b> : 
     * <p>Update Conditional Access Policy Description</p>
     * 
     * @param request UpdateConditionalAccessPolicyDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConditionalAccessPolicyDescriptionResponse
     */
    public UpdateConditionalAccessPolicyDescriptionResponse updateConditionalAccessPolicyDescriptionWithOptions(UpdateConditionalAccessPolicyDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conditionalAccessPolicyId)) {
            query.put("ConditionalAccessPolicyId", request.conditionalAccessPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConditionalAccessPolicyDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConditionalAccessPolicyDescriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>Update Conditional Access Policy Description</p>
     * 
     * <b>summary</b> : 
     * <p>Update Conditional Access Policy Description</p>
     * 
     * @param request UpdateConditionalAccessPolicyDescriptionRequest
     * @return UpdateConditionalAccessPolicyDescriptionResponse
     */
    public UpdateConditionalAccessPolicyDescriptionResponse updateConditionalAccessPolicyDescription(UpdateConditionalAccessPolicyDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConditionalAccessPolicyDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义条款</p>
     * 
     * @param request UpdateCustomPrivacyPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCustomPrivacyPolicyResponse
     */
    public UpdateCustomPrivacyPolicyResponse updateCustomPrivacyPolicyWithOptions(UpdateCustomPrivacyPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyContents)) {
            query.put("CustomPrivacyPolicyContents", request.customPrivacyPolicyContents);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyId)) {
            query.put("CustomPrivacyPolicyId", request.customPrivacyPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customPrivacyPolicyName)) {
            query.put("CustomPrivacyPolicyName", request.customPrivacyPolicyName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultLanguageCode)) {
            query.put("DefaultLanguageCode", request.defaultLanguageCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userConsentType)) {
            query.put("UserConsentType", request.userConsentType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCustomPrivacyPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCustomPrivacyPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新自定义条款</p>
     * 
     * @param request UpdateCustomPrivacyPolicyRequest
     * @return UpdateCustomPrivacyPolicyResponse
     */
    public UpdateCustomPrivacyPolicyResponse updateCustomPrivacyPolicy(UpdateCustomPrivacyPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCustomPrivacyPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名关联的品牌。</p>
     * 
     * @param request UpdateDomainBrandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainBrandResponse
     */
    public UpdateDomainBrandResponse updateDomainBrandWithOptions(UpdateDomainBrandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.brandId)) {
            query.put("BrandId", request.brandId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainBrand"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainBrandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改域名关联的品牌。</p>
     * 
     * @param request UpdateDomainBrandRequest
     * @return UpdateDomainBrandResponse
     */
    public UpdateDomainBrandResponse updateDomainBrand(UpdateDomainBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新域名备案号。</p>
     * 
     * @param request UpdateDomainIcpNumberRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDomainIcpNumberResponse
     */
    public UpdateDomainIcpNumberResponse updateDomainIcpNumberWithOptions(UpdateDomainIcpNumberRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.icpNumber)) {
            query.put("IcpNumber", request.icpNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDomainIcpNumber"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDomainIcpNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新域名备案号。</p>
     * 
     * @param request UpdateDomainIcpNumberRequest
     * @return UpdateDomainIcpNumberResponse
     */
    public UpdateDomainIcpNumberResponse updateDomainIcpNumber(UpdateDomainIcpNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDomainIcpNumberWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新联邦凭证提供方</p>
     * 
     * @param request UpdateFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFederatedCredentialProviderResponse
     */
    public UpdateFederatedCredentialProviderResponse updateFederatedCredentialProviderWithOptions(UpdateFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderName)) {
            query.put("FederatedCredentialProviderName", request.federatedCredentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcProviderConfig)) {
            query.put("OidcProviderConfig", request.oidcProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pkcs7ProviderConfig)) {
            query.put("Pkcs7ProviderConfig", request.pkcs7ProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateCaProviderConfig)) {
            query.put("PrivateCaProviderConfig", request.privateCaProviderConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFederatedCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFederatedCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新联邦凭证提供方</p>
     * 
     * @param request UpdateFederatedCredentialProviderRequest
     * @return UpdateFederatedCredentialProviderResponse
     */
    public UpdateFederatedCredentialProviderResponse updateFederatedCredentialProvider(UpdateFederatedCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFederatedCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新联邦凭证提供方描述</p>
     * 
     * @param request UpdateFederatedCredentialProviderDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFederatedCredentialProviderDescriptionResponse
     */
    public UpdateFederatedCredentialProviderDescriptionResponse updateFederatedCredentialProviderDescriptionWithOptions(UpdateFederatedCredentialProviderDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.federatedCredentialProviderId)) {
            query.put("FederatedCredentialProviderId", request.federatedCredentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFederatedCredentialProviderDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFederatedCredentialProviderDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新联邦凭证提供方描述</p>
     * 
     * @param request UpdateFederatedCredentialProviderDescriptionRequest
     * @return UpdateFederatedCredentialProviderDescriptionResponse
     */
    public UpdateFederatedCredentialProviderDescriptionResponse updateFederatedCredentialProviderDescription(UpdateFederatedCredentialProviderDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateFederatedCredentialProviderDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the information is empty, the information is not updated by default.</p>
     * 
     * @param request UpdateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupExternalId)) {
            query.put("GroupExternalId", request.groupExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroup"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>Updates the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the information is empty, the information is not updated by default.</p>
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
     * <p>Updates the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account group.</p>
     * 
     * @param request UpdateGroupDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupDescriptionResponse
     */
    public UpdateGroupDescriptionResponse updateGroupDescriptionWithOptions(UpdateGroupDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account group.</p>
     * 
     * @param request UpdateGroupDescriptionRequest
     * @return UpdateGroupDescriptionResponse
     */
    public UpdateGroupDescriptionResponse updateGroupDescription(UpdateGroupDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新idp基础配置</p>
     * 
     * @param request UpdateIdentityProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIdentityProviderResponse
     */
    public UpdateIdentityProviderResponse updateIdentityProviderWithOptions(UpdateIdentityProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dingtalkAppConfig)) {
            query.put("DingtalkAppConfig", request.dingtalkAppConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderName)) {
            query.put("IdentityProviderName", request.identityProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.larkConfig)) {
            query.put("LarkConfig", request.larkConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ldapConfig)) {
            query.put("LdapConfig", request.ldapConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logoUrl)) {
            query.put("LogoUrl", request.logoUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcConfig)) {
            query.put("OidcConfig", request.oidcConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.weComConfig)) {
            query.put("WeComConfig", request.weComConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIdentityProvider"),
            new TeaPair("version", "2021-12-01"),
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
     * <p>更新idp基础配置</p>
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
     * <p>Modifies the description of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request UpdateInstanceDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceDescriptionResponse
     */
    public UpdateInstanceDescriptionResponse updateInstanceDescriptionWithOptions(UpdateInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).</p>
     * 
     * @param request UpdateInstanceDescriptionRequest
     * @return UpdateInstanceDescriptionResponse
     */
    public UpdateInstanceDescriptionResponse updateInstanceDescription(UpdateInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个专属网络端点的名称。</p>
     * 
     * @param request UpdateNetworkAccessEndpointNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkAccessEndpointNameResponse
     */
    public UpdateNetworkAccessEndpointNameResponse updateNetworkAccessEndpointNameWithOptions(UpdateNetworkAccessEndpointNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointName)) {
            query.put("NetworkAccessEndpointName", request.networkAccessEndpointName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetworkAccessEndpointName"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkAccessEndpointNameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新一个专属网络端点的名称。</p>
     * 
     * @param request UpdateNetworkAccessEndpointNameRequest
     * @return UpdateNetworkAccessEndpointNameResponse
     */
    public UpdateNetworkAccessEndpointNameResponse updateNetworkAccessEndpointName(UpdateNetworkAccessEndpointNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkAccessEndpointNameWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络区域对象</p>
     * 
     * @param request UpdateNetworkZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkZoneResponse
     */
    public UpdateNetworkZoneResponse updateNetworkZoneWithOptions(UpdateNetworkZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv4Cidrs)) {
            query.put("Ipv4Cidrs", request.ipv4Cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipv6Cidrs)) {
            query.put("Ipv6Cidrs", request.ipv6Cidrs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneName)) {
            query.put("NetworkZoneName", request.networkZoneName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetworkZone"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络区域对象</p>
     * 
     * @param request UpdateNetworkZoneRequest
     * @return UpdateNetworkZoneResponse
     */
    public UpdateNetworkZoneResponse updateNetworkZone(UpdateNetworkZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络区域对象描述</p>
     * 
     * @param request UpdateNetworkZoneDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNetworkZoneDescriptionResponse
     */
    public UpdateNetworkZoneDescriptionResponse updateNetworkZoneDescriptionWithOptions(UpdateNetworkZoneDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkZoneId)) {
            query.put("NetworkZoneId", request.networkZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNetworkZoneDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNetworkZoneDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新网络区域对象描述</p>
     * 
     * @param request UpdateNetworkZoneDescriptionRequest
     * @return UpdateNetworkZoneDescriptionResponse
     */
    public UpdateNetworkZoneDescriptionResponse updateNetworkZoneDescription(UpdateNetworkZoneDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkZoneDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about an Employee Identity and Access Management (EIAM) organization. The basic information about the organization is not updated by default if no parameter is specified.</p>
     * 
     * @param request UpdateOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationalUnitResponse
     */
    public UpdateOrganizationalUnitResponse updateOrganizationalUnitWithOptions(UpdateOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            query.put("OrganizationalUnitName", request.organizationalUnitName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about an Employee Identity and Access Management (EIAM) organization. The basic information about the organization is not updated by default if no parameter is specified.</p>
     * 
     * @param request UpdateOrganizationalUnitRequest
     * @return UpdateOrganizationalUnitResponse
     */
    public UpdateOrganizationalUnitResponse updateOrganizationalUnit(UpdateOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Employee Identity and Access Management (EIAM) organization.</p>
     * 
     * @param request UpdateOrganizationalUnitDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationalUnitDescriptionResponse
     */
    public UpdateOrganizationalUnitDescriptionResponse updateOrganizationalUnitDescriptionWithOptions(UpdateOrganizationalUnitDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganizationalUnitDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationalUnitDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Employee Identity and Access Management (EIAM) organization.</p>
     * 
     * @param request UpdateOrganizationalUnitDescriptionRequest
     * @return UpdateOrganizationalUnitDescriptionResponse
     */
    public UpdateOrganizationalUnitDescriptionResponse updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the parent organization ID of an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). In this case, the organization is moved from a parent node to a new node.</p>
     * 
     * @param request UpdateOrganizationalUnitParentIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateOrganizationalUnitParentIdResponse
     */
    public UpdateOrganizationalUnitParentIdResponse updateOrganizationalUnitParentIdWithOptions(UpdateOrganizationalUnitParentIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateOrganizationalUnitParentId"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateOrganizationalUnitParentIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the parent organization ID of an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). In this case, the organization is moved from a parent node to a new node.</p>
     * 
     * @param request UpdateOrganizationalUnitParentIdRequest
     * @return UpdateOrganizationalUnitParentIdResponse
     */
    public UpdateOrganizationalUnitParentIdResponse updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitParentIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information about an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            query.put("CustomFields", request.customFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            query.put("DisplayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            query.put("EmailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            query.put("PhoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            query.put("PhoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            query.put("PhoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2021-12-01"),
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
     * <b>summary</b> : 
     * <p>Updates the basic information about an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).</p>
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
     * <p>Modifies the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param request UpdateUserDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserDescriptionResponse
     */
    public UpdateUserDescriptionResponse updateUserDescriptionWithOptions(UpdateUserDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param request UpdateUserDescriptionRequest
     * @return UpdateUserDescriptionResponse
     */
    public UpdateUserDescriptionResponse updateUserDescription(UpdateUserDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the password information of an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The password must meet the requirements of the password policies that are configured in the IDaaS console.</p>
     * 
     * @param request UpdateUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPasswordResponse
     */
    public UpdateUserPasswordResponse updateUserPasswordWithOptions(UpdateUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordForcedUpdateStatus)) {
            query.put("PasswordForcedUpdateStatus", request.passwordForcedUpdateStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNotificationChannels)) {
            query.put("UserNotificationChannels", request.userNotificationChannels);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPassword"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the password information of an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The password must meet the requirements of the password policies that are configured in the IDaaS console.</p>
     * 
     * @param request UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserPasswordWithOptions(request, runtime);
    }
}
