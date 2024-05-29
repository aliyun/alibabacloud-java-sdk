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
     * @summary Adds an Employee Identity and Access Management (EIAM) account to multiple EIAM organizations of Identity as a Service (IDaaS). If the account already exists in the organizational unit, the system directly returns a success response.
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
     * @summary Adds an Employee Identity and Access Management (EIAM) account to multiple EIAM organizations of Identity as a Service (IDaaS). If the account already exists in the organizational unit, the system directly returns a success response.
     *
     * @param request AddUserToOrganizationalUnitsRequest
     * @return AddUserToOrganizationalUnitsResponse
     */
    public AddUserToOrganizationalUnitsResponse addUserToOrganizationalUnits(AddUserToOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * @summary Adds Employee Identity and Access Management (EIAM) accounts to an EIAM group of Identity as a Service (IDaaS).
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
     * @summary Adds Employee Identity and Access Management (EIAM) accounts to an EIAM group of Identity as a Service (IDaaS).
     *
     * @param request AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroup(AddUsersToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersToGroupWithOptions(request, runtime);
    }

    /**
     * @summary Grants the permissions to access an application to multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Grants the permissions to access an application to multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request AuthorizeApplicationToGroupsRequest
     * @return AuthorizeApplicationToGroupsResponse
     */
    public AuthorizeApplicationToGroupsResponse authorizeApplicationToGroups(AuthorizeApplicationToGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) organizations at a time.
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
     * @summary Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) organizations at a time.
     *
     * @param request AuthorizeApplicationToOrganizationalUnitsRequest
     * @return AuthorizeApplicationToOrganizationalUnitsResponse
     */
    public AuthorizeApplicationToOrganizationalUnitsResponse authorizeApplicationToOrganizationalUnits(AuthorizeApplicationToOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * @summary Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) accounts at a time.
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
     * @summary Grants the access permissions on an application to multiple Employee Identity and Access Management (EIAM) accounts at a time.
     *
     * @param request AuthorizeApplicationToUsersRequest
     * @return AuthorizeApplicationToUsersResponse
     */
    public AuthorizeApplicationToUsersResponse authorizeApplicationToUsers(AuthorizeApplicationToUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeApplicationToUsersWithOptions(request, runtime);
    }

    /**
     * @summary Adds an application to an Enterprise Identity Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @description IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.
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
     * @summary Adds an application to an Enterprise Identity Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @description IDaaS EIAM supports the following two standard single sign-on (SSO) protocols for adding applications: SAML 2.0 and OIDC. You can select an SSO protocol based on your business requirements when you add an application. You cannot change the SSO protocol that you selected after the application is added.
     *
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Creates a client key for an Employee Identity and Access Management (EIAM) application. An EIAM application can have up to two client keys.
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
     * @summary Creates a client key for an Employee Identity and Access Management (EIAM) application. An EIAM application can have up to two client keys.
     *
     * @param request CreateApplicationClientSecretRequest
     * @return CreateApplicationClientSecretResponse
     */
    public CreateApplicationClientSecretResponse createApplicationClientSecret(CreateApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * @summary 创建域名。
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
     * @summary 创建域名。
     *
     * @param request CreateDomainRequest
     * @return CreateDomainResponse
     */
    public CreateDomainResponse createDomain(CreateDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainWithOptions(request, runtime);
    }

    /**
     * @summary 创建域名代理Token。
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
     * @summary 创建域名代理Token。
     *
     * @param request CreateDomainProxyTokenRequest
     * @return CreateDomainProxyTokenResponse
     */
    public CreateDomainProxyTokenResponse createDomainProxyToken(CreateDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * @summary Creates an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Creates an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates an instance based on which all capabilities of Identity as a Service (IDaaS) Enterprise Identity and Access Management (EIAM) are provided.
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
     * @summary Creates an instance based on which all capabilities of Identity as a Service (IDaaS) Enterprise Identity and Access Management (EIAM) are provided.
     *
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 创建一个专属网络端点。
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
     * @summary 创建一个专属网络端点。
     *
     * @param request CreateNetworkAccessEndpointRequest
     * @return CreateNetworkAccessEndpointResponse
     */
    public CreateNetworkAccessEndpointResponse createNetworkAccessEndpoint(CreateNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * @summary Creates an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Creates an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request CreateOrganizationalUnitRequest
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnit(CreateOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Creates an account in an Identity as a Service (IDaaS) Enterprise Identity Access Management (EIAM) instance.
     *
     * @param request CreateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(CreateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary Creates an account in an Identity as a Service (IDaaS) Enterprise Identity Access Management (EIAM) instance.
     *
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an Employee Identity and Access Management (EIAM) application.
     *
     * @description Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.
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
     * @summary Deletes an Employee Identity and Access Management (EIAM) application.
     *
     * @description Make sure that the EIAM application that you want to delete is not used before you delete the EIAM application. After you delete the EIAM application, all configurations are deleted and cannot be restored.
     *
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a client key for an Employee Identity and Access Management (EIAM) application.
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
     * @summary Deletes a client key for an Employee Identity and Access Management (EIAM) application.
     *
     * @param request DeleteApplicationClientSecretRequest
     * @return DeleteApplicationClientSecretResponse
     */
    public DeleteApplicationClientSecretResponse deleteApplicationClientSecret(DeleteApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * @summary 删除域名。
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
     * @summary 删除域名。
     *
     * @param request DeleteDomainRequest
     * @return DeleteDomainResponse
     */
    public DeleteDomainResponse deleteDomain(DeleteDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainWithOptions(request, runtime);
    }

    /**
     * @summary 删除指定域名代理Token，删除之前请保证代理Token处于禁用状态。
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
     * @summary 删除指定域名代理Token，删除之前请保证代理Token处于禁用状态。
     *
     * @param request DeleteDomainProxyTokenRequest
     * @return DeleteDomainProxyTokenResponse
     */
    public DeleteDomainProxyTokenResponse deleteDomainProxyToken(DeleteDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Deletes the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request DeleteGroupRequest
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS) that you do not need.
     *
     * @description Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.
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
     * @summary Deletes an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS) that you do not need.
     *
     * @description Make sure that the instance to be deleted is no longer used. If the instance is deleted, all data related to the instance will be deleted.
     *
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 删除一个专属网络端点。
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
     * @summary 删除一个专属网络端点。
     *
     * @param request DeleteNetworkAccessEndpointRequest
     * @return DeleteNetworkAccessEndpointResponse
     */
    public DeleteNetworkAccessEndpointResponse deleteNetworkAccessEndpoint(DeleteNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the organization has EIAM accounts or child organizations, the delete operation fails.
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
     * @summary Deletes an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the organization has EIAM accounts or child organizations, the delete operation fails.
     *
     * @param request DeleteOrganizationalUnitRequest
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnit(DeleteOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The information related to the account is cleared.
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
     * @summary Deletes an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The information related to the account is cleared.
     *
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * @summary Disables an enabled Employee Identity and Access Management (EIAM) application. All features of the EIAM application cannot be used if you disable the EIAM application.
     *
     * @description All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.
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
     * @summary Disables an enabled Employee Identity and Access Management (EIAM) application. All features of the EIAM application cannot be used if you disable the EIAM application.
     *
     * @description All features of the EIAM application cannot be used if you disable the EIAM application, such as single sign-on (SSO) and account synchronization. Make sure that you acknowledge the risks of the delete operation.
     *
     * @param request DisableApplicationRequest
     * @return DisableApplicationResponse
     */
    public DisableApplicationResponse disableApplication(DisableApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Disables the Developer API feature for an Employee Identity and Access Management (EIAM) application.
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
     * @summary Disables the Developer API feature for an Employee Identity and Access Management (EIAM) application.
     *
     * @param request DisableApplicationApiInvokeRequest
     * @return DisableApplicationApiInvokeResponse
     */
    public DisableApplicationApiInvokeResponse disableApplicationApiInvoke(DisableApplicationApiInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationApiInvokeWithOptions(request, runtime);
    }

    /**
     * @summary Disables a client key of an Employee Identity and Access Management (EIAM) application.
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
     * @summary Disables a client key of an Employee Identity and Access Management (EIAM) application.
     *
     * @param request DisableApplicationClientSecretRequest
     * @return DisableApplicationClientSecretResponse
     */
    public DisableApplicationClientSecretResponse disableApplicationClientSecret(DisableApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * @summary Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request DisableApplicationProvisioningRequest
     * @return DisableApplicationProvisioningResponse
     */
    public DisableApplicationProvisioningResponse disableApplicationProvisioning(DisableApplicationProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationProvisioningWithOptions(request, runtime);
    }

    /**
     * @summary 禁用应用SSO能力
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
     * @summary 禁用应用SSO能力
     *
     * @param request DisableApplicationSsoRequest
     * @return DisableApplicationSsoResponse
     */
    public DisableApplicationSsoResponse disableApplicationSso(DisableApplicationSsoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationSsoWithOptions(request, runtime);
    }

    /**
     * @summary 禁用指定域名代理Token。
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
     * @summary 禁用指定域名代理Token。
     *
     * @param request DisableDomainProxyTokenRequest
     * @return DisableDomainProxyTokenResponse
     */
    public DisableDomainProxyTokenResponse disableDomainProxyToken(DisableDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * @summary 关闭初始化域名自动跳转。
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
     * @summary 关闭初始化域名自动跳转。
     *
     * @param request DisableInitDomainAutoRedirectRequest
     * @return DisableInitDomainAutoRedirectResponse
     */
    public DisableInitDomainAutoRedirectResponse disableInitDomainAutoRedirect(DisableInitDomainAutoRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInitDomainAutoRedirectWithOptions(request, runtime);
    }

    /**
     * @summary Disables an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account. If the account is disabled, a success message is returned.
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
     * @summary Disables an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account. If the account is disabled, a success message is returned.
     *
     * @param request DisableUserRequest
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUser(DisableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableUserWithOptions(request, runtime);
    }

    /**
     * @summary Enables a disabled Employee Identity and Access Management (EIAM) application.
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
     * @summary Enables a disabled Employee Identity and Access Management (EIAM) application.
     *
     * @param request EnableApplicationRequest
     * @return EnableApplicationResponse
     */
    public EnableApplicationResponse enableApplication(EnableApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Enables the Developer API feature for an Employee Identity and Access Management (EIAM) application.
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
     * @summary Enables the Developer API feature for an Employee Identity and Access Management (EIAM) application.
     *
     * @param request EnableApplicationApiInvokeRequest
     * @return EnableApplicationApiInvokeResponse
     */
    public EnableApplicationApiInvokeResponse enableApplicationApiInvoke(EnableApplicationApiInvokeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationApiInvokeWithOptions(request, runtime);
    }

    /**
     * @summary Enables the client key of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Enables the client key of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request EnableApplicationClientSecretRequest
     * @return EnableApplicationClientSecretResponse
     */
    public EnableApplicationClientSecretResponse enableApplicationClientSecret(EnableApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * @summary Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request EnableApplicationProvisioningRequest
     * @return EnableApplicationProvisioningResponse
     */
    public EnableApplicationProvisioningResponse enableApplicationProvisioning(EnableApplicationProvisioningRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationProvisioningWithOptions(request, runtime);
    }

    /**
     * @summary 启用应用SSO能力
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
     * @summary 启用应用SSO能力
     *
     * @param request EnableApplicationSsoRequest
     * @return EnableApplicationSsoResponse
     */
    public EnableApplicationSsoResponse enableApplicationSso(EnableApplicationSsoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationSsoWithOptions(request, runtime);
    }

    /**
     * @summary 启用指定域名代理Token。
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
     * @summary 启用指定域名代理Token。
     *
     * @param request EnableDomainProxyTokenRequest
     * @return EnableDomainProxyTokenResponse
     */
    public EnableDomainProxyTokenResponse enableDomainProxyToken(EnableDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * @summary 开启初始化域名自动跳转。开启后，访问初始化域名将会自动跳转至默认域名。
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
     * @summary 开启初始化域名自动跳转。开启后，访问初始化域名将会自动跳转至默认域名。
     *
     * @param request EnableInitDomainAutoRedirectRequest
     * @return EnableInitDomainAutoRedirectResponse
     */
    public EnableInitDomainAutoRedirectResponse enableInitDomainAutoRedirect(EnableInitDomainAutoRedirectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInitDomainAutoRedirectWithOptions(request, runtime);
    }

    /**
     * @summary Enables an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).
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
     * @summary Enables an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).
     *
     * @param request EnableUserRequest
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUser(EnableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableUserWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an Employee Identity and Access Management (EIAM) application.
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
     * @summary Queries the details of an Employee Identity and Access Management (EIAM) application.
     *
     * @param request GetApplicationRequest
     * @return GetApplicationResponse
     */
    public GetApplicationResponse getApplication(GetApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the permissions of the Developer API feature for an Employee Identity and Access Management (EIAM) application.
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
     * @summary Queries the permissions of the Developer API feature for an Employee Identity and Access Management (EIAM) application.
     *
     * @param request GetApplicationGrantScopeRequest
     * @return GetApplicationGrantScopeResponse
     */
    public GetApplicationGrantScopeResponse getApplicationGrantScope(GetApplicationGrantScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationGrantScopeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configuration of the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Queries the configuration of the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request GetApplicationProvisioningConfigRequest
     * @return GetApplicationProvisioningConfigResponse
     */
    public GetApplicationProvisioningConfigResponse getApplicationProvisioningConfig(GetApplicationProvisioningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationProvisioningConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.
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
     * @summary Queries the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.
     *
     * @param request GetApplicationProvisioningScopeRequest
     * @return GetApplicationProvisioningScopeResponse
     */
    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScope(GetApplicationProvisioningScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationProvisioningScopeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Queries the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request GetApplicationSsoConfigRequest
     * @return GetApplicationSsoConfigResponse
     */
    public GetApplicationSsoConfigResponse getApplicationSsoConfig(GetApplicationSsoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationSsoConfigWithOptions(request, runtime);
    }

    /**
     * @summary 查询一个域名的详细信息。
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
     * @summary 查询一个域名的详细信息。
     *
     * @param request GetDomainRequest
     * @return GetDomainResponse
     */
    public GetDomainResponse getDomain(GetDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainWithOptions(request, runtime);
    }

    /**
     * @summary 查看域名的DNS Challenge记录。
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
     * @summary 查看域名的DNS Challenge记录。
     *
     * @param request GetDomainDnsChallengeRequest
     * @return GetDomainDnsChallengeResponse
     */
    public GetDomainDnsChallengeResponse getDomainDnsChallenge(GetDomainDnsChallengeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDomainDnsChallengeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the forgot password configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the forgot password configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetForgetPasswordConfigurationRequest
     * @return GetForgetPasswordConfigurationResponse
     */
    public GetForgetPasswordConfigurationResponse getForgetPasswordConfiguration(GetForgetPasswordConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getForgetPasswordConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Queries the information of an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request GetGroupRequest
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(GetGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the information of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 查询一个专属网络端点的详细信息。
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
     * @summary 查询一个专属网络端点的详细信息。
     *
     * @param request GetNetworkAccessEndpointRequest
     * @return GetNetworkAccessEndpointResponse
     */
    public GetNetworkAccessEndpointResponse getNetworkAccessEndpoint(GetNetworkAccessEndpointRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkAccessEndpointWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about an organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Queries the information about an organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request GetOrganizationalUnitRequest
     * @return GetOrganizationalUnitResponse
     */
    public GetOrganizationalUnitResponse getOrganizationalUnit(GetOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Queries the password complexity configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the password complexity configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetPasswordComplexityConfigurationRequest
     * @return GetPasswordComplexityConfigurationResponse
     */
    public GetPasswordComplexityConfigurationResponse getPasswordComplexityConfiguration(GetPasswordComplexityConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordComplexityConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the password expiration configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the password expiration configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetPasswordExpirationConfigurationRequest
     * @return GetPasswordExpirationConfigurationResponse
     */
    public GetPasswordExpirationConfigurationResponse getPasswordExpirationConfiguration(GetPasswordExpirationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordExpirationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the password history configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the password history configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetPasswordHistoryConfigurationRequest
     * @return GetPasswordHistoryConfigurationResponse
     */
    public GetPasswordHistoryConfigurationResponse getPasswordHistoryConfiguration(GetPasswordHistoryConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordHistoryConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the password initialization configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Queries the password initialization configurations of an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request GetPasswordInitializationConfigurationRequest
     * @return GetPasswordInitializationConfigurationResponse
     */
    public GetPasswordInitializationConfigurationResponse getPasswordInitializationConfiguration(GetPasswordInitializationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPasswordInitializationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about the root organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Queries the information about the root organizational unit in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request GetRootOrganizationalUnitRequest
     * @return GetRootOrganizationalUnitResponse
     */
    public GetRootOrganizationalUnitResponse getRootOrganizationalUnit(GetRootOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRootOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Queries the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * @summary Queries all client keys of an Employee Identity and Access Management (EIAM) application. The returned key secret is not masked. If you want to query the key secret that is masked, call the ObtainApplicationClientSecret operation.
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
     * @summary Queries all client keys of an Employee Identity and Access Management (EIAM) application. The returned key secret is not masked. If you want to query the key secret that is masked, call the ObtainApplicationClientSecret operation.
     *
     * @param request ListApplicationClientSecretsRequest
     * @return ListApplicationClientSecretsResponse
     */
    public ListApplicationClientSecretsResponse listApplicationClientSecrets(ListApplicationClientSecretsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationClientSecretsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about one or multiple Employee Identity and Access Management (EIAM) applications by page.
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
     * @summary Queries the information about one or multiple Employee Identity and Access Management (EIAM) applications by page.
     *
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the applications that an Employee Identity and Access Management (EIAM) organization can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.
     *
     * @description You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the **ApplicationIds** parameter when you call this operation.
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
     * @summary Queries the applications that an Employee Identity and Access Management (EIAM) organization can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.
     *
     * @description You can only query the permissions that are directly granted to the EIAM organization by calling the ListApplicationsForOrganizationalUnit operation. You can filter applications by configuring the **ApplicationIds** parameter when you call this operation.
     *
     * @param request ListApplicationsForOrganizationalUnitRequest
     * @return ListApplicationsForOrganizationalUnitResponse
     */
    public ListApplicationsForOrganizationalUnitResponse listApplicationsForOrganizationalUnit(ListApplicationsForOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Queries the applications that an Employee Identity and Access Management (EIAM) account can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.
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
     * @summary Queries the applications that an Employee Identity and Access Management (EIAM) account can access. The return result includes the IDs of the applications. If you want to obtain the details of the applications, call the GetApplication operation.
     *
     * @param request ListApplicationsForUserRequest
     * @return ListApplicationsForUserResponse
     */
    public ListApplicationsForUserResponse listApplicationsForUser(ListApplicationsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForUserWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询域名代理Token信息。
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
     * @summary 列表查询域名代理Token信息。
     *
     * @param request ListDomainProxyTokensRequest
     * @return ListDomainProxyTokensResponse
     */
    public ListDomainProxyTokensResponse listDomainProxyTokens(ListDomainProxyTokensRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainProxyTokensWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询域名记录。
     *
     * @param request ListDomainsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomainsWithOptions(ListDomainsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary 列表查询域名记录。
     *
     * @param request ListDomainsRequest
     * @return ListDomainsResponse
     */
    public ListDomainsResponse listDomains(ListDomainsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDomainsWithOptions(request, runtime);
    }

    /**
     * @summary 查询EIAM2.0/EIAM1.0实例列表
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
     * @summary 查询EIAM2.0/EIAM1.0实例列表
     *
     * @param request ListEiamInstancesRequest
     * @return ListEiamInstancesResponse
     */
    public ListEiamInstancesResponse listEiamInstances(ListEiamInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEiamInstancesWithOptions(request, runtime);
    }

    /**
     * @summary 查询EIAM2.0/EIAM1.0地域列表
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
     * @summary 查询EIAM2.0/EIAM1.0地域列表
     *
     * @return ListEiamRegionsResponse
     */
    public ListEiamRegionsResponse listEiamRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEiamRegionsWithOptions(runtime);
    }

    /**
     * @summary Queries a list of account groups in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Queries a list of account groups in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of account groups to which the permissions to access an application are granted. The returned results contain the group IDs. You can call the GetGroup operation to query the information about an account group based on the group ID.
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
     * @summary Queries a list of account groups to which the permissions to access an application are granted. The returned results contain the group IDs. You can call the GetGroup operation to query the information about an account group based on the group ID.
     *
     * @param request ListGroupsForApplicationRequest
     * @return ListGroupsForApplicationResponse
     */
    public ListGroupsForApplicationResponse listGroupsForApplication(ListGroupsForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of account groups to which an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) belongs.
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
     * @summary Queries a list of account groups to which an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) belongs.
     *
     * @param request ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUser(ListGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForUserWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of one or more Enterprise Identity and Access Management (EIAM) instances of Identity as a Service (IDaaS).
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
     * @summary Queries the information of one or more Enterprise Identity and Access Management (EIAM) instances of Identity as a Service (IDaaS).
     *
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * @summary 获取支持专属端点的region列表
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
     * @summary 获取支持专属端点的region列表
     *
     * @return ListNetworkAccessEndpointAvailableRegionsResponse
     */
    public ListNetworkAccessEndpointAvailableRegionsResponse listNetworkAccessEndpointAvailableRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointAvailableRegionsWithOptions(runtime);
    }

    /**
     * @summary 获取支持NAE的可用区列表
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
     * @summary 获取支持NAE的可用区列表
     *
     * @param request ListNetworkAccessEndpointAvailableZonesRequest
     * @return ListNetworkAccessEndpointAvailableZonesResponse
     */
    public ListNetworkAccessEndpointAvailableZonesResponse listNetworkAccessEndpointAvailableZones(ListNetworkAccessEndpointAvailableZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointAvailableZonesWithOptions(request, runtime);
    }

    /**
     * @summary 列表查询专属网络端点。
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
     * @summary 列表查询专属网络端点。
     *
     * @param request ListNetworkAccessEndpointsRequest
     * @return ListNetworkAccessEndpointsResponse
     */
    public ListNetworkAccessEndpointsResponse listNetworkAccessEndpoints(ListNetworkAccessEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointsWithOptions(request, runtime);
    }

    /**
     * @summary 列表某个网络访问端点下的访问路径。
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
     * @summary 列表某个网络访问端点下的访问路径。
     *
     * @param request ListNetworkAccessPathsRequest
     * @return ListNetworkAccessPathsResponse
     */
    public ListNetworkAccessPathsResponse listNetworkAccessPaths(ListNetworkAccessPathsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessPathsWithOptions(request, runtime);
    }

    /**
     * @summary 查询组织的所有父级路径
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
     * @summary 查询组织的所有父级路径
     *
     * @param request ListOrganizationalUnitParentsRequest
     * @return ListOrganizationalUnitParentsResponse
     */
    public ListOrganizationalUnitParentsResponse listOrganizationalUnitParents(ListOrganizationalUnitParentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitParentsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about organizational units in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.
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
     * @summary Queries the information about organizational units in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.
     *
     * @param request ListOrganizationalUnitsRequest
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnits(ListOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the organizations that are allowed to access an Employee Identity and Access Management (EIAM) application by page. The return result includes the IDs of the organizations. If you want to obtain the details of the organizations, call the GetOrganizationalUnit operation.
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
     * @summary Queries the organizations that are allowed to access an Employee Identity and Access Management (EIAM) application by page. The return result includes the IDs of the organizations. If you want to obtain the details of the organizations, call the GetOrganizationalUnit operation.
     *
     * @param request ListOrganizationalUnitsForApplicationRequest
     * @return ListOrganizationalUnitsForApplicationResponse
     */
    public ListOrganizationalUnitsForApplicationResponse listOrganizationalUnitsForApplication(ListOrganizationalUnitsForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitsForApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the supported Alibaba Cloud regions.
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
     * @summary Queries the supported Alibaba Cloud regions.
     *
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * @summary Queries the details of accounts in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.
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
     * @summary Queries the details of accounts in Identity as a Service (IDaaS) Employee IAM (EIAM) by page.
     *
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the accounts that are allowed to access an Employee Identity and Access Management (EIAM) application. The return results include the IDs of the accounts. If you need to obtain the details of the accounts, call the GetUser operation.
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
     * @summary Queries the accounts that are allowed to access an Employee Identity and Access Management (EIAM) application. The return results include the IDs of the accounts. If you need to obtain the details of the accounts, call the GetUser operation.
     *
     * @param request ListUsersForApplicationRequest
     * @return ListUsersForApplicationResponse
     */
    public ListUsersForApplicationResponse listUsersForApplication(ListUsersForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForApplicationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of accounts in an Employee Identity and Access Management (EIAM) group of Identity as a Service (IDaaS).
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
     * @summary Queries the information of accounts in an Employee Identity and Access Management (EIAM) group of Identity as a Service (IDaaS).
     *
     * @param request ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroup(ListUsersForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries a client key of an Employee Identity and Access Management (EIAM) application. The returned key secret is masked. If you want to query the key secret that is not masked, call the ListApplicationClientSecrets operation.
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
     * @summary Queries a client key of an Employee Identity and Access Management (EIAM) application. The returned key secret is masked. If you want to query the key secret that is not masked, call the ListApplicationClientSecrets operation.
     *
     * @param request ObtainApplicationClientSecretRequest
     * @return ObtainApplicationClientSecretResponse
     */
    public ObtainApplicationClientSecretResponse obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * @summary 查看指定域名安全代理Token。
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
     * @summary 查看指定域名安全代理Token。
     *
     * @param request ObtainDomainProxyTokenRequest
     * @return ObtainDomainProxyTokenResponse
     */
    public ObtainDomainProxyTokenResponse obtainDomainProxyToken(ObtainDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * @summary Removes an Employee Identity and Access Management (EIAM) account from multiple EIAM organizations of Identity as a Service (IDaaS). You cannot remove an account from a primary organization.
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
     * @summary Removes an Employee Identity and Access Management (EIAM) account from multiple EIAM organizations of Identity as a Service (IDaaS). You cannot remove an account from a primary organization.
     *
     * @param request RemoveUserFromOrganizationalUnitsRequest
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    public RemoveUserFromOrganizationalUnitsResponse removeUserFromOrganizationalUnits(RemoveUserFromOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * @summary Removes Employee Identity and Access Management (EIAM) accounts from an EIAM group of Identity as a Service (IDaaS).
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
     * @summary Removes Employee Identity and Access Management (EIAM) accounts from an EIAM group of Identity as a Service (IDaaS).
     *
     * @param request RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroup(RemoveUsersFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersFromGroupWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the permissions to access an application from multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
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
     * @summary Revokes the permissions to access an application from multiple account groups at a time in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).
     *
     * @param request RevokeApplicationFromGroupsRequest
     * @return RevokeApplicationFromGroupsResponse
     */
    public RevokeApplicationFromGroupsResponse revokeApplicationFromGroups(RevokeApplicationFromGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) organizations at a time.
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
     * @summary Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) organizations at a time.
     *
     * @param request RevokeApplicationFromOrganizationalUnitsRequest
     * @return RevokeApplicationFromOrganizationalUnitsResponse
     */
    public RevokeApplicationFromOrganizationalUnitsResponse revokeApplicationFromOrganizationalUnits(RevokeApplicationFromOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromOrganizationalUnitsWithOptions(request, runtime);
    }

    /**
     * @summary Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) accounts at a time.
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
     * @summary Revokes the permissions to access an application from multiple Employee Identity and Access Management (EIAM) accounts at a time.
     *
     * @param request RevokeApplicationFromUsersRequest
     * @return RevokeApplicationFromUsersResponse
     */
    public RevokeApplicationFromUsersResponse revokeApplicationFromUsers(RevokeApplicationFromUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeApplicationFromUsersWithOptions(request, runtime);
    }

    /**
     * @summary Configures the permissions of the Developer API feature of an Employee Identity and Access Management (EIAM) application.
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
     * @summary Configures the permissions of the Developer API feature of an Employee Identity and Access Management (EIAM) application.
     *
     * @param request SetApplicationGrantScopeRequest
     * @return SetApplicationGrantScopeResponse
     */
    public SetApplicationGrantScopeResponse setApplicationGrantScope(SetApplicationGrantScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationGrantScopeWithOptions(request, runtime);
    }

    /**
     * @summary Configures the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
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
     * @summary Configures the account synchronization feature for an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @param request SetApplicationProvisioningConfigRequest
     * @return SetApplicationProvisioningConfigResponse
     */
    public SetApplicationProvisioningConfigResponse setApplicationProvisioningConfig(SetApplicationProvisioningConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationProvisioningConfigWithOptions(request, runtime);
    }

    /**
     * @summary Sets the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.
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
     * @summary Sets the account synchronization scope of applications in Identity as a Service (IDaaS) Employee IAM (EIAM). This scope is the same as the scope within which developers can call the DeveloperAPI to query and manage accounts.
     *
     * @param request SetApplicationProvisioningScopeRequest
     * @return SetApplicationProvisioningScopeResponse
     */
    public SetApplicationProvisioningScopeResponse setApplicationProvisioningScope(SetApplicationProvisioningScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationProvisioningScopeWithOptions(request, runtime);
    }

    /**
     * @summary Specifies the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @description In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.
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
     * @summary Specifies the single sign-on (SSO) configuration attributes of an application in Identity as a Service (IDaaS) Employee IAM (EIAM).
     *
     * @description In IDaaS EIAM, the application management feature supports multiple SSO protocols for applications, including SAML 2.0 and OIDC protocols. Each application supports only one protocol, and the protocol cannot be changed after the application is created. You can specify the SSO configuration attributes of an application based on the supported SSO protocol.
     *
     * @param request SetApplicationSsoConfigRequest
     * @return SetApplicationSsoConfigResponse
     */
    public SetApplicationSsoConfigResponse setApplicationSsoConfig(SetApplicationSsoConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationSsoConfigWithOptions(request, runtime);
    }

    /**
     * @summary 设置默认域名。
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
     * @summary 设置默认域名。
     *
     * @param request SetDefaultDomainRequest
     * @return SetDefaultDomainResponse
     */
    public SetDefaultDomainResponse setDefaultDomain(SetDefaultDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultDomainWithOptions(request, runtime);
    }

    /**
     * @summary Configures a forgot password policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Configures a forgot password policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetForgetPasswordConfigurationRequest
     * @return SetForgetPasswordConfigurationResponse
     */
    public SetForgetPasswordConfigurationResponse setForgetPasswordConfiguration(SetForgetPasswordConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setForgetPasswordConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Configures a password complexity policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Configures a password complexity policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetPasswordComplexityConfigurationRequest
     * @return SetPasswordComplexityConfigurationResponse
     */
    public SetPasswordComplexityConfigurationResponse setPasswordComplexityConfiguration(SetPasswordComplexityConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordComplexityConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Configures a password expiration policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetPasswordExpirationConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordExpirationConfigurationResponse
     */
    public SetPasswordExpirationConfigurationResponse setPasswordExpirationConfigurationWithOptions(SetPasswordExpirationConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
     * @summary Configures a password expiration policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetPasswordExpirationConfigurationRequest
     * @return SetPasswordExpirationConfigurationResponse
     */
    public SetPasswordExpirationConfigurationResponse setPasswordExpirationConfiguration(SetPasswordExpirationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordExpirationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Configures a password history policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Configures a password history policy for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetPasswordHistoryConfigurationRequest
     * @return SetPasswordHistoryConfigurationResponse
     */
    public SetPasswordHistoryConfigurationResponse setPasswordHistoryConfiguration(SetPasswordHistoryConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordHistoryConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Sets the password initialization configurations for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Sets the password initialization configurations for an Employee Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request SetPasswordInitializationConfigurationRequest
     * @return SetPasswordInitializationConfigurationResponse
     */
    public SetPasswordInitializationConfigurationResponse setPasswordInitializationConfiguration(SetPasswordInitializationConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPasswordInitializationConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Updates the primary organizational unit to which an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account belongs. This account will be removed from the previous primary organizational unit and added to the new primary organization.
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
     * @summary Updates the primary organizational unit to which an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account belongs. This account will be removed from the previous primary organizational unit and added to the new primary organization.
     *
     * @param request SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    public SetUserPrimaryOrganizationalUnitResponse setUserPrimaryOrganizationalUnit(SetUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserPrimaryOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Unlocks an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) that is locked.
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
     * @summary Unlocks an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS) that is locked.
     *
     * @param request UnlockUserRequest
     * @return UnlockUserResponse
     */
    public UnlockUserResponse unlockUser(UnlockUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockUserWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the authorization type of an Employee Identity and Access Management (EIAM) application.
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
     * @summary Modifies the authorization type of an Employee Identity and Access Management (EIAM) application.
     *
     * @param request UpdateApplicationAuthorizationTypeRequest
     * @return UpdateApplicationAuthorizationTypeResponse
     */
    public UpdateApplicationAuthorizationTypeResponse updateApplicationAuthorizationType(UpdateApplicationAuthorizationTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationAuthorizationTypeWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of an Employee Identity and Access Management (EIAM) application.
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
     * @summary Modifies the description of an Employee Identity and Access Management (EIAM) application.
     *
     * @param request UpdateApplicationDescriptionRequest
     * @return UpdateApplicationDescriptionResponse
     */
    public UpdateApplicationDescriptionResponse updateApplicationDescription(UpdateApplicationDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the information is empty, the information is not updated by default.
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
     * @summary Updates the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). If the information is empty, the information is not updated by default.
     *
     * @param request UpdateGroupRequest
     * @return UpdateGroupResponse
     */
    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    /**
     * @summary Updates the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account group.
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
     * @summary Updates the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account group.
     *
     * @param request UpdateGroupDescriptionRequest
     * @return UpdateGroupDescriptionResponse
     */
    public UpdateGroupDescriptionResponse updateGroupDescription(UpdateGroupDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
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
     * @summary Modifies the description of an Enterprise Identity and Access Management (EIAM) instance of Identity as a Service (IDaaS).
     *
     * @param request UpdateInstanceDescriptionRequest
     * @return UpdateInstanceDescriptionResponse
     */
    public UpdateInstanceDescriptionResponse updateInstanceDescription(UpdateInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary 更新一个专属网络端点的名称。
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
     * @summary 更新一个专属网络端点的名称。
     *
     * @param request UpdateNetworkAccessEndpointNameRequest
     * @return UpdateNetworkAccessEndpointNameResponse
     */
    public UpdateNetworkAccessEndpointNameResponse updateNetworkAccessEndpointName(UpdateNetworkAccessEndpointNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNetworkAccessEndpointNameWithOptions(request, runtime);
    }

    /**
     * @summary Updates the basic information about an Employee Identity and Access Management (EIAM) organization. The basic information about the organization is not updated by default if no parameter is specified.
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
     * @summary Updates the basic information about an Employee Identity and Access Management (EIAM) organization. The basic information about the organization is not updated by default if no parameter is specified.
     *
     * @param request UpdateOrganizationalUnitRequest
     * @return UpdateOrganizationalUnitResponse
     */
    public UpdateOrganizationalUnitResponse updateOrganizationalUnit(UpdateOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of an Employee Identity and Access Management (EIAM) organization.
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
     * @summary Modifies the description of an Employee Identity and Access Management (EIAM) organization.
     *
     * @param request UpdateOrganizationalUnitDescriptionRequest
     * @return UpdateOrganizationalUnitDescriptionResponse
     */
    public UpdateOrganizationalUnitDescriptionResponse updateOrganizationalUnitDescription(UpdateOrganizationalUnitDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Updates the parent organization ID of an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). In this case, the organization is moved from a parent node to a new node.
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
     * @summary Updates the parent organization ID of an organization in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM). In this case, the organization is moved from a parent node to a new node.
     *
     * @param request UpdateOrganizationalUnitParentIdRequest
     * @return UpdateOrganizationalUnitParentIdResponse
     */
    public UpdateOrganizationalUnitParentIdResponse updateOrganizationalUnitParentId(UpdateOrganizationalUnitParentIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateOrganizationalUnitParentIdWithOptions(request, runtime);
    }

    /**
     * @summary Updates the basic information about an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).
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
     * @summary Updates the basic information about an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS).
     *
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account.
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
     * @summary Modifies the description of an Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM) account.
     *
     * @param request UpdateUserDescriptionRequest
     * @return UpdateUserDescriptionResponse
     */
    public UpdateUserDescriptionResponse updateUserDescription(UpdateUserDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Updates the password information of an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The password must meet the requirements of the password policies that are configured in the IDaaS console.
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
     * @summary Updates the password information of an Employee Identity and Access Management (EIAM) account of Identity as a Service (IDaaS). The password must meet the requirements of the password policies that are configured in the IDaaS console.
     *
     * @param request UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    public UpdateUserPasswordResponse updateUserPassword(UpdateUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserPasswordWithOptions(request, runtime);
    }
}
