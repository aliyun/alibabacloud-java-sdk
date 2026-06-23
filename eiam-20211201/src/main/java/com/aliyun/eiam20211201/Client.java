// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201;

import com.aliyun.tea.*;
import com.aliyun.eiam20211201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("eu-central-1", "eiam.eu-central-1.aliyuncs.com"),
            new TeaPair("cn-hongkong", "eiam.cn-hongkong.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "eiam.cn-hangzhou.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "eiam.ap-southeast-5.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eiam.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2", "eiam.ap-northeast-2.aliyuncs.com")
        );
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
     * <p>Adds an application account to a specified user in the current application.</p>
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
     * <p>Adds an application account to a specified user in the current application.</p>
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
     * <p>Adds an application to an authorization rule.</p>
     * 
     * @param request AddApplicationToAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddApplicationToAuthorizationRuleResponse
     */
    public AddApplicationToAuthorizationRuleResponse addApplicationToAuthorizationRuleWithOptions(AddApplicationToAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddApplicationToAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddApplicationToAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an application to an authorization rule.</p>
     * 
     * @param request AddApplicationToAuthorizationRuleRequest
     * @return AddApplicationToAuthorizationRuleResponse
     */
    public AddApplicationToAuthorizationRuleResponse addApplicationToAuthorizationRule(AddApplicationToAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addApplicationToAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds terms to a brand.</p>
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
     * <p>Adds terms to a brand.</p>
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
     * <p>Adds a group to an authorization rule.</p>
     * 
     * @param request AddGroupToAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupToAuthorizationRuleResponse
     */
    public AddGroupToAuthorizationRuleResponse addGroupToAuthorizationRuleWithOptions(AddGroupToAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroupToAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupToAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a group to an authorization rule.</p>
     * 
     * @param request AddGroupToAuthorizationRuleRequest
     * @return AddGroupToAuthorizationRuleResponse
     */
    public AddGroupToAuthorizationRuleResponse addGroupToAuthorizationRule(AddGroupToAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGroupToAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an account to an authorization rule.</p>
     * 
     * @param request AddUserToAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToAuthorizationRuleResponse
     */
    public AddUserToAuthorizationRuleResponse addUserToAuthorizationRuleWithOptions(AddUserToAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUserToAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an account to an authorization rule.</p>
     * 
     * @param request AddUserToAuthorizationRuleRequest
     * @return AddUserToAuthorizationRuleResponse
     */
    public AddUserToAuthorizationRuleResponse addUserToAuthorizationRule(AddUserToAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUserToAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a specified EIAM account to one or more EIAM organizations. If the account already exists in one of the specified organizations, the request succeeds.</p>
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
     * <p>Adds a specified EIAM account to one or more EIAM organizations. If the account already exists in one of the specified organizations, the request succeeds.</p>
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
     * <p>Grants multiple EIAM groups access to an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Grants multiple EIAM groups access to an application.</p>
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
     * <p>Grants access to an application for multiple EIAM organizations in a batch operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Grants access to an application for multiple EIAM organizations in a batch operation.</p>
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
     * <p>Grants permissions to multiple EIAM accounts to access an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Grants permissions to multiple EIAM accounts to access an application.</p>
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
     * <p>Grants a client application permissions for specific scopes on a specified resource server.</p>
     * 
     * @param request AuthorizeResourceServerScopesToClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResourceServerScopesToClientResponse
     */
    public AuthorizeResourceServerScopesToClientResponse authorizeResourceServerScopesToClientWithOptions(AuthorizeResourceServerScopesToClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientApplicationId)) {
            query.put("ClientApplicationId", request.clientApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerApplicationId)) {
            query.put("ResourceServerApplicationId", request.resourceServerApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceServerScopesToClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceServerScopesToClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants a client application permissions for specific scopes on a specified resource server.</p>
     * 
     * @param request AuthorizeResourceServerScopesToClientRequest
     * @return AuthorizeResourceServerScopesToClientResponse
     */
    public AuthorizeResourceServerScopesToClientResponse authorizeResourceServerScopesToClient(AuthorizeResourceServerScopesToClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeResourceServerScopesToClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants a group permissions for specified scopes on a resource server.</p>
     * 
     * @param request AuthorizeResourceServerScopesToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResourceServerScopesToGroupResponse
     */
    public AuthorizeResourceServerScopesToGroupResponse authorizeResourceServerScopesToGroupWithOptions(AuthorizeResourceServerScopesToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceServerScopesToGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceServerScopesToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants a group permissions for specified scopes on a resource server.</p>
     * 
     * @param request AuthorizeResourceServerScopesToGroupRequest
     * @return AuthorizeResourceServerScopesToGroupResponse
     */
    public AuthorizeResourceServerScopesToGroupResponse authorizeResourceServerScopesToGroup(AuthorizeResourceServerScopesToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeResourceServerScopesToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants scope permissions for a specified resource server to an organization.</p>
     * 
     * @param request AuthorizeResourceServerScopesToOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResourceServerScopesToOrganizationalUnitResponse
     */
    public AuthorizeResourceServerScopesToOrganizationalUnitResponse authorizeResourceServerScopesToOrganizationalUnitWithOptions(AuthorizeResourceServerScopesToOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceServerScopesToOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceServerScopesToOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants scope permissions for a specified resource server to an organization.</p>
     * 
     * @param request AuthorizeResourceServerScopesToOrganizationalUnitRequest
     * @return AuthorizeResourceServerScopesToOrganizationalUnitResponse
     */
    public AuthorizeResourceServerScopesToOrganizationalUnitResponse authorizeResourceServerScopesToOrganizationalUnit(AuthorizeResourceServerScopesToOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeResourceServerScopesToOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants scope permissions for a specified resource server to a user account.</p>
     * 
     * @param request AuthorizeResourceServerScopesToUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResourceServerScopesToUserResponse
     */
    public AuthorizeResourceServerScopesToUserResponse authorizeResourceServerScopesToUserWithOptions(AuthorizeResourceServerScopesToUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceServerScopesToUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceServerScopesToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants scope permissions for a specified resource server to a user account.</p>
     * 
     * @param request AuthorizeResourceServerScopesToUserRequest
     * @return AuthorizeResourceServerScopesToUserResponse
     */
    public AuthorizeResourceServerScopesToUserResponse authorizeResourceServerScopesToUser(AuthorizeResourceServerScopesToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeResourceServerScopesToUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a resource server for a client application.</p>
     * 
     * @param request AuthorizeResourceServerToClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeResourceServerToClientResponse
     */
    public AuthorizeResourceServerToClientResponse authorizeResourceServerToClientWithOptions(AuthorizeResourceServerToClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientApplicationId)) {
            query.put("ClientApplicationId", request.clientApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerApplicationId)) {
            query.put("ResourceServerApplicationId", request.resourceServerApplicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeResourceServerToClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeResourceServerToClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Authorizes a resource server for a client application.</p>
     * 
     * @param request AuthorizeResourceServerToClientRequest
     * @return AuthorizeResourceServerToClientResponse
     */
    public AuthorizeResourceServerToClientResponse authorizeResourceServerToClient(AuthorizeResourceServerToClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeResourceServerToClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a third-party logon account.</p>
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
     * <p>Associates a third-party logon account.</p>
     * 
     * @param request BindUserAuthnSourceMappingRequest
     * @return BindUserAuthnSourceMappingResponse
     */
    public BindUserAuthnSourceMappingResponse bindUserAuthnSourceMapping(BindUserAuthnSourceMappingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindUserAuthnSourceMappingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the primary organizational unit for an application is within the synchronization scope.</p>
     * 
     * @param request CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse checkApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrimaryOrganizationalUnitId)) {
            query.put("UserPrimaryOrganizationalUnitId", request.userPrimaryOrganizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckApplicationProvisioningUserPrimaryOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether the primary organizational unit for an application is within the synchronization scope.</p>
     * 
     * @param request CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @return CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public CheckApplicationProvisioningUserPrimaryOrganizationalUnitResponse checkApplicationProvisioningUserPrimaryOrganizationalUnit(CheckApplicationProvisioningUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an instance can be deleted.</p>
     * 
     * @param request CheckInstanceForDeleteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceForDeleteResponse
     */
    public CheckInstanceForDeleteResponse checkInstanceForDeleteWithOptions(CheckInstanceForDeleteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstanceForDelete"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceForDeleteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks whether an instance can be deleted.</p>
     * 
     * @param request CheckInstanceForDeleteRequest
     * @return CheckInstanceForDeleteResponse
     */
    public CheckInstanceForDeleteResponse checkInstanceForDelete(CheckInstanceForDeleteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkInstanceForDeleteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Determines whether an instance has the feature of a specific module.</p>
     * 
     * @param request CheckInstanceModuleStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckInstanceModuleStatusResponse
     */
    public CheckInstanceModuleStatusResponse checkInstanceModuleStatusWithOptions(CheckInstanceModuleStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.featureKey)) {
            query.put("FeatureKey", request.featureKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleKey)) {
            query.put("ModuleKey", request.moduleKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subFeatureKey)) {
            query.put("SubFeatureKey", request.subFeatureKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckInstanceModuleStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckInstanceModuleStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Determines whether an instance has the feature of a specific module.</p>
     * 
     * @param request CheckInstanceModuleStatusRequest
     * @return CheckInstanceModuleStatusResponse
     */
    public CheckInstanceModuleStatusResponse checkInstanceModuleStatus(CheckInstanceModuleStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkInstanceModuleStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must select the required SSO protocol when you create the application. This selection cannot be changed after creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application in the specified EIAM instance.</p>
     * 
     * @param request CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdentityType)) {
            query.put("ApplicationIdentityType", request.applicationIdentityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationOwner)) {
            query.put("ApplicationOwner", request.applicationOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationSourceType)) {
            query.put("ApplicationSourceType", request.applicationSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationTemplateId)) {
            query.put("ApplicationTemplateId", request.applicationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            query.put("CustomFields", request.customFields);
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
     * <p>You must select the required SSO protocol when you create the application. This selection cannot be changed after creation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an application in the specified EIAM instance.</p>
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
     * <p>Creates a client secret for an EIAM application. You can create up to two client secrets for each application.</p>
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
     * <p>Creates a client secret for an EIAM application. You can create up to two client secrets for each application.</p>
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
     * <p>Creates an application federated credential.</p>
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
     * <p>Creates an application federated credential.</p>
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
     * <p>Creates an application role.</p>
     * 
     * @param request CreateApplicationRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationRoleResponse
     */
    public CreateApplicationRoleResponse createApplicationRoleWithOptions(CreateApplicationRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleName)) {
            query.put("ApplicationRoleName", request.applicationRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleValue)) {
            query.put("ApplicationRoleValue", request.applicationRoleValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplicationRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application role.</p>
     * 
     * @param request CreateApplicationRoleRequest
     * @return CreateApplicationRoleResponse
     */
    public CreateApplicationRoleResponse createApplicationRole(CreateApplicationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an application token.</p>
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
     * <p>Creates an application token.</p>
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
     * <p>Creates an authorization resource.</p>
     * 
     * @param request CreateAuthorizationResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorizationResourceResponse
     */
    public CreateAuthorizationResourceResponse createAuthorizationResourceWithOptions(CreateAuthorizationResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceEntityId)) {
            query.put("AuthorizationResourceEntityId", request.authorizationResourceEntityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceEntityType)) {
            query.put("AuthorizationResourceEntityType", request.authorizationResourceEntityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorizationResource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an authorization resource.</p>
     * 
     * @param request CreateAuthorizationResourceRequest
     * @return CreateAuthorizationResourceResponse
     */
    public CreateAuthorizationResourceResponse createAuthorizationResource(CreateAuthorizationResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthorizationResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an authorization rule.</p>
     * 
     * @param request CreateAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorizationRuleResponse
     */
    public CreateAuthorizationRuleResponse createAuthorizationRuleWithOptions(CreateAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceScope)) {
            query.put("AuthorizationResourceScope", request.authorizationResourceScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an authorization rule.</p>
     * 
     * @param request CreateAuthorizationRuleRequest
     * @return CreateAuthorizationRuleResponse
     */
    public CreateAuthorizationRuleResponse createAuthorizationRule(CreateAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a brand.</p>
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
     * <p>Creates a brand.</p>
     * 
     * @param request CreateBrandRequest
     * @return CreateBrandResponse
     */
    public CreateBrandResponse createBrand(CreateBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a client public key for an application. The machine-to-machine (M2M) authorization server uses this public key to verify the assertion included in a token request from an M2M client using the PRIVATE_KEY_JWT method.</p>
     * 
     * @param request CreateClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientPublicKeyResponse
     */
    public CreateClientPublicKeyResponse createClientPublicKeyWithOptions(CreateClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.algorithmType)) {
            query.put("AlgorithmType", request.algorithmType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKey)) {
            query.put("PublicKey", request.publicKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a client public key for an application. The machine-to-machine (M2M) authorization server uses this public key to verify the assertion included in a token request from an M2M client using the PRIVATE_KEY_JWT method.</p>
     * 
     * @param request CreateClientPublicKeyRequest
     * @return CreateClientPublicKeyResponse
     */
    public CreateClientPublicKeyResponse createClientPublicKey(CreateClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, ensure that you understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of IDaaS EIAM.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud account in the specified IDaaS EIAM instance.</p>
     * 
     * @param request CreateCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudAccountResponse
     */
    public CreateCloudAccountResponse createCloudAccountWithOptions(CreateCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountExternalId)) {
            query.put("CloudAccountExternalId", request.cloudAccountExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountName)) {
            query.put("CloudAccountName", request.cloudAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountProviderName)) {
            query.put("CloudAccountProviderName", request.cloudAccountProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountSite)) {
            query.put("CloudAccountSite", request.cloudAccountSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountVendorType)) {
            query.put("CloudAccountVendorType", request.cloudAccountVendorType);
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
            new TeaPair("action", "CreateCloudAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, ensure that you understand the billing methods and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of IDaaS EIAM.</em>*</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud account in the specified IDaaS EIAM instance.</p>
     * 
     * @param request CreateCloudAccountRequest
     * @return CreateCloudAccountResponse
     */
    public CreateCloudAccountResponse createCloudAccount(CreateCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request CreateCloudAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCloudAccountRoleResponse
     */
    public CreateCloudAccountRoleResponse createCloudAccountRoleWithOptions(CreateCloudAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleName)) {
            query.put("CloudAccountRoleName", request.cloudAccountRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleType)) {
            query.put("CloudAccountRoleType", request.cloudAccountRoleType);
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
            new TeaPair("action", "CreateCloudAccountRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCloudAccountRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request CreateCloudAccountRoleRequest
     * @return CreateCloudAccountRoleResponse
     */
    public CreateCloudAccountRoleResponse createCloudAccountRole(CreateCloudAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCloudAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Creates a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a conditional access policy.</p>
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
     * <p>Creates a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a conditional access policy.</p>
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
     * <p>Creates a credential in a specified EIAM instance.</p>
     * 
     * @param request CreateCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredentialWithOptions(CreateCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialContent)) {
            query.put("CredentialContent", request.credentialContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialExternalId)) {
            query.put("CredentialExternalId", request.credentialExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialIdentifier)) {
            query.put("CredentialIdentifier", request.credentialIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialName)) {
            query.put("CredentialName", request.credentialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialScenarioLabel)) {
            query.put("CredentialScenarioLabel", request.credentialScenarioLabel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialSharingScope)) {
            query.put("CredentialSharingScope", request.credentialSharingScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialSubjectId)) {
            query.put("CredentialSubjectId", request.credentialSubjectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialSubjectType)) {
            query.put("CredentialSubjectType", request.credentialSubjectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialType)) {
            query.put("CredentialType", request.credentialType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusiveUserId)) {
            query.put("ExclusiveUserId", request.exclusiveUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a credential in a specified EIAM instance.</p>
     * 
     * @param request CreateCredentialRequest
     * @return CreateCredentialResponse
     */
    public CreateCredentialResponse createCredential(CreateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a credential provider.</p>
     * 
     * @param request CreateCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCredentialProviderResponse
     */
    public CreateCredentialProviderResponse createCredentialProviderWithOptions(CreateCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderConfig)) {
            query.put("CredentialProviderConfig", request.credentialProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderIdentifier)) {
            query.put("CredentialProviderIdentifier", request.credentialProviderIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderName)) {
            query.put("CredentialProviderName", request.credentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderType)) {
            query.put("CredentialProviderType", request.credentialProviderType);
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
            new TeaPair("action", "CreateCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a credential provider.</p>
     * 
     * @param request CreateCredentialProviderRequest
     * @return CreateCredentialProviderResponse
     */
    public CreateCredentialProviderResponse createCredentialProvider(CreateCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an extended field.</p>
     * 
     * @param request CreateCustomFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCustomFieldResponse
     */
    public CreateCustomFieldResponse createCustomFieldWithOptions(CreateCustomFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.defaultValue)) {
            query.put("DefaultValue", request.defaultValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.entityType)) {
            query.put("EntityType", request.entityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldDataConfig)) {
            query.put("FieldDataConfig", request.fieldDataConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldDataType)) {
            query.put("FieldDataType", request.fieldDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldDisplayName)) {
            query.put("FieldDisplayName", request.fieldDisplayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldDisplayType)) {
            query.put("FieldDisplayType", request.fieldDisplayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fieldName)) {
            query.put("FieldName", request.fieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.required)) {
            query.put("Required", request.required);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unique)) {
            query.put("Unique", request.unique);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPermission)) {
            query.put("UserPermission", request.userPermission);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCustomField"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCustomFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an extended field.</p>
     * 
     * @param request CreateCustomFieldRequest
     * @return CreateCustomFieldResponse
     */
    public CreateCustomFieldResponse createCustomField(CreateCustomFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can create custom terms.</p>
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
     * <p>You can create custom terms.</p>
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
     * <p>Creates a custom domain name for an EIAM (Entity and Identity Access Management) instance.</p>
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
     * <p>Creates a custom domain name for an EIAM (Entity and Identity Access Management) instance.</p>
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
     * <p>Create an identity provider.</p>
     * 
     * @param request CreateFederatedCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFederatedCredentialProviderResponse
     */
    public CreateFederatedCredentialProviderResponse createFederatedCredentialProviderWithOptions(CreateFederatedCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudIdPProviderConfig)) {
            query.put("CloudIdPProviderConfig", request.cloudIdPProviderConfig);
        }

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
     * <p>Create an identity provider.</p>
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
     * <p>Creates an identity provider.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.samlConfig)) {
            query.put("SamlConfig", request.samlConfig);
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
     * <p>Creates an identity provider.</p>
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
     * <p>Creates a status check job for an identity provider.</p>
     * 
     * @param request CreateIdentityProviderStatusCheckJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIdentityProviderStatusCheckJobResponse
     */
    public CreateIdentityProviderStatusCheckJobResponse createIdentityProviderStatusCheckJobWithOptions(CreateIdentityProviderStatusCheckJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "CreateIdentityProviderStatusCheckJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIdentityProviderStatusCheckJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a status check job for an identity provider.</p>
     * 
     * @param request CreateIdentityProviderStatusCheckJobRequest
     * @return CreateIdentityProviderStatusCheckJobResponse
     */
    public CreateIdentityProviderStatusCheckJobResponse createIdentityProviderStatusCheckJob(CreateIdentityProviderStatusCheckJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIdentityProviderStatusCheckJobWithOptions(request, runtime);
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
     * <p>Creates a trial License for an instance.</p>
     * 
     * @param request CreateInstanceTrialLicenseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceTrialLicenseResponse
     */
    public CreateInstanceTrialLicenseResponse createInstanceTrialLicenseWithOptions(CreateInstanceTrialLicenseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceTrialLicense"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceTrialLicenseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a trial License for an instance.</p>
     * 
     * @param request CreateInstanceTrialLicenseRequest
     * @return CreateInstanceTrialLicenseResponse
     */
    public CreateInstanceTrialLicenseResponse createInstanceTrialLicense(CreateInstanceTrialLicenseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceTrialLicenseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network access endpoint.</p>
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
     * <p>Creates a network access endpoint.</p>
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
     * <p>Creates a network zone object.</p>
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
     * <p>Creates a network zone object.</p>
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
     * <p>Creates a scope permission for a specified resource server.</p>
     * 
     * @param request CreateResourceServerScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceServerScopeResponse
     */
    public CreateResourceServerScopeResponse createResourceServerScopeWithOptions(CreateResourceServerScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeName)) {
            query.put("ResourceServerScopeName", request.resourceServerScopeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeType)) {
            query.put("ResourceServerScopeType", request.resourceServerScopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeValue)) {
            query.put("ResourceServerScopeValue", request.resourceServerScopeValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceServerScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceServerScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a scope permission for a specified resource server.</p>
     * 
     * @param request CreateResourceServerScopeRequest
     * @return CreateResourceServerScopeResponse
     */
    public CreateResourceServerScopeResponse createResourceServerScope(CreateResourceServerScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceServerScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create an EIAM account in a specific EIAM instance.</p>
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
     * <p>Create an EIAM account in a specific EIAM instance.</p>
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
     * <p>Deletes a federated credential for an application.</p>
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
     * <p>Deletes a federated credential for an application.</p>
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
     * <p>Deletes an application role.</p>
     * 
     * @param request DeleteApplicationRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationRoleResponse
     */
    public DeleteApplicationRoleResponse deleteApplicationRoleWithOptions(DeleteApplicationRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplicationRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application role.</p>
     * 
     * @param request DeleteApplicationRoleRequest
     * @return DeleteApplicationRoleResponse
     */
    public DeleteApplicationRoleResponse deleteApplicationRole(DeleteApplicationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an application token.</p>
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
     * <p>Deletes an application token.</p>
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
     * <p>Deletes an authorized resource.</p>
     * 
     * @param request DeleteAuthorizationResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthorizationResourceResponse
     */
    public DeleteAuthorizationResourceResponse deleteAuthorizationResourceWithOptions(DeleteAuthorizationResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceId)) {
            query.put("AuthorizationResourceId", request.authorizationResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorizationResource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorizationResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authorized resource.</p>
     * 
     * @param request DeleteAuthorizationResourceRequest
     * @return DeleteAuthorizationResourceResponse
     */
    public DeleteAuthorizationResourceResponse deleteAuthorizationResource(DeleteAuthorizationResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthorizationResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authorization rule. The authorization rule can be deleted only when it is in the disabled state.</p>
     * 
     * @param request DeleteAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthorizationRuleResponse
     */
    public DeleteAuthorizationRuleResponse deleteAuthorizationRuleWithOptions(DeleteAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an authorization rule. The authorization rule can be deleted only when it is in the disabled state.</p>
     * 
     * @param request DeleteAuthorizationRuleRequest
     * @return DeleteAuthorizationRuleResponse
     */
    public DeleteAuthorizationRuleResponse deleteAuthorizationRule(DeleteAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Brand</p>
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
     * <p>Delete Brand</p>
     * 
     * @param request DeleteBrandRequest
     * @return DeleteBrandResponse
     */
    public DeleteBrandResponse deleteBrand(DeleteBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the ClientPublicKey for a specified application.</p>
     * 
     * @param request DeleteClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientPublicKeyResponse
     */
    public DeleteClientPublicKeyResponse deleteClientPublicKeyWithOptions(DeleteClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPublicKeyId)) {
            query.put("ClientPublicKeyId", request.clientPublicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the ClientPublicKey for a specified application.</p>
     * 
     * @param request DeleteClientPublicKeyRequest
     * @return DeleteClientPublicKeyResponse
     */
    public DeleteClientPublicKeyResponse deleteClientPublicKey(DeleteClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Alibaba Cloud account resource.</p>
     * 
     * @param request DeleteCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudAccountResponse
     */
    public DeleteCloudAccountResponse deleteCloudAccountWithOptions(DeleteCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Alibaba Cloud account resource.</p>
     * 
     * @param request DeleteCloudAccountRequest
     * @return DeleteCloudAccountResponse
     */
    public DeleteCloudAccountResponse deleteCloudAccount(DeleteCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must disable the cloud role before you delete it. After you delete the role, all related data is also deleted and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cloud role from a specified Alibaba Cloud account.</p>
     * 
     * @param request DeleteCloudAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCloudAccountRoleResponse
     */
    public DeleteCloudAccountRoleResponse deleteCloudAccountRoleWithOptions(DeleteCloudAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleId)) {
            query.put("CloudAccountRoleId", request.cloudAccountRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCloudAccountRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCloudAccountRoleResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must disable the cloud role before you delete it. After you delete the role, all related data is also deleted and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cloud role from a specified Alibaba Cloud account.</p>
     * 
     * @param request DeleteCloudAccountRoleRequest
     * @return DeleteCloudAccountRoleResponse
     */
    public DeleteCloudAccountRoleResponse deleteCloudAccountRole(DeleteCloudAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCloudAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a conditional access policy, make sure that the policy is no longer in use. After the policy is deleted, all configuration data is permanently removed and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a conditional access policy.</p>
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
     * <p>Before you delete a conditional access policy, make sure that the policy is no longer in use. After the policy is deleted, all configuration data is permanently removed and cannot be recovered.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a conditional access policy.</p>
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
     * <p>Deletes a credential resource.</p>
     * 
     * @param request DeleteCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredentialWithOptions(DeleteCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a credential resource.</p>
     * 
     * @param request DeleteCredentialRequest
     * @return DeleteCredentialResponse
     */
    public DeleteCredentialResponse deleteCredential(DeleteCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a credential provider.</p>
     * 
     * @param request DeleteCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCredentialProviderResponse
     */
    public DeleteCredentialProviderResponse deleteCredentialProviderWithOptions(DeleteCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a credential provider.</p>
     * 
     * @param request DeleteCredentialProviderRequest
     * @return DeleteCredentialProviderResponse
     */
    public DeleteCredentialProviderResponse deleteCredentialProvider(DeleteCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an extended character field.</p>
     * 
     * @param request DeleteCustomFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomFieldResponse
     */
    public DeleteCustomFieldResponse deleteCustomFieldWithOptions(DeleteCustomFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldId)) {
            query.put("FieldId", request.fieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomField"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an extended character field.</p>
     * 
     * @param request DeleteCustomFieldRequest
     * @return DeleteCustomFieldResponse
     */
    public DeleteCustomFieldResponse deleteCustomField(DeleteCustomFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom clause.</p>
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
     * <p>Deletes a custom clause.</p>
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
     * <p>Deletes a custom domain name of a specified Employee Identity and Access Management (EIAM) instance. Deletion of the instance initialization domain name or default domain name is rejected.</p>
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
     * <p>Deletes a custom domain name of a specified Employee Identity and Access Management (EIAM) instance. Deletion of the instance initialization domain name or default domain name is rejected.</p>
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
     * <p>Deletes a proxy token for a specified domain name of an EIAM instance. Only proxy tokens in the disabled state can be deleted.</p>
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
     * <p>Deletes a proxy token for a specified domain name of an EIAM instance. Only proxy tokens in the disabled state can be deleted.</p>
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
     * <p>Deletes a federated credential provider.</p>
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
     * <p>Deletes a federated credential provider.</p>
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
     * <p>Make sure that the instance is no longer in use. After an EIAM instance is deleted, all related data is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) instance that you no longer use.</p>
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
     * <p>Make sure that the instance is no longer in use. After an EIAM instance is deleted, all related data is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) instance that you no longer use.</p>
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
     * <p>Deletes a dedicated network access endpoint.</p>
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
     * <p>Deletes a dedicated network access endpoint.</p>
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
     * <p>Deletes a network zone object.</p>
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
     * <p>Deletes a network zone object.</p>
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
     * <p>Deletes information about an organization and forcefully deletes all accounts and sub-organizations in the organization.</p>
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
     * <p>Deletes information about an organization and forcefully deletes all accounts and sub-organizations in the organization.</p>
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
     * <p>Deletes a scope permission from a specified resource server.</p>
     * 
     * @param request DeleteResourceServerScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceServerScopeResponse
     */
    public DeleteResourceServerScopeResponse deleteResourceServerScopeWithOptions(DeleteResourceServerScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceServerScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceServerScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a scope permission from a specified resource server.</p>
     * 
     * @param request DeleteResourceServerScopeRequest
     * @return DeleteResourceServerScopeResponse
     */
    public DeleteResourceServerScopeResponse deleteResourceServerScope(DeleteResourceServerScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceServerScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a specified EIAM user and purges all related information.</p>
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
     * <p>Deletes a specified EIAM user and purges all related information.</p>
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
     * <p>Deletes multiple accounts in a batch.</p>
     * 
     * @param request DeleteUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUsersResponse
     */
    public DeleteUsersResponse deleteUsersWithOptions(DeleteUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DeleteUsers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes multiple accounts in a batch.</p>
     * 
     * @param request DeleteUsersRequest
     * @return DeleteUsersResponse
     */
    public DeleteUsersResponse deleteUsers(DeleteUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified WebAuthn authenticator.</p>
     * 
     * @param request DeleteWebAuthnAuthenticatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWebAuthnAuthenticatorResponse
     */
    public DeleteWebAuthnAuthenticatorResponse deleteWebAuthnAuthenticatorWithOptions(DeleteWebAuthnAuthenticatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticatorId)) {
            query.put("AuthenticatorId", request.authenticatorId);
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
            new TeaPair("action", "DeleteWebAuthnAuthenticator"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWebAuthnAuthenticatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the specified WebAuthn authenticator.</p>
     * 
     * @param request DeleteWebAuthnAuthenticatorRequest
     * @return DeleteWebAuthnAuthenticatorResponse
     */
    public DeleteWebAuthnAuthenticatorResponse deleteWebAuthnAuthenticator(DeleteWebAuthnAuthenticatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWebAuthnAuthenticatorWithOptions(request, runtime);
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
     * <p>Disables a federated credential for an application.</p>
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
     * <p>Disables a federated credential for an application.</p>
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
     * <p>Disables the machine-to-machine (M2M) client feature for an application. This feature enables an application to act as an OAuth client and make calls to access resources.</p>
     * 
     * @param request DisableApplicationM2MClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationM2MClientResponse
     */
    public DisableApplicationM2MClientResponse disableApplicationM2MClientWithOptions(DisableApplicationM2MClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableApplicationM2MClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationM2MClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the machine-to-machine (M2M) client feature for an application. This feature enables an application to act as an OAuth client and make calls to access resources.</p>
     * 
     * @param request DisableApplicationM2MClientRequest
     * @return DisableApplicationM2MClientResponse
     */
    public DisableApplicationM2MClientResponse disableApplicationM2MClient(DisableApplicationM2MClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationM2MClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Disables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Disables the resource server functionality for a specified application.</p>
     * 
     * @param request DisableApplicationResourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableApplicationResourceServerResponse
     */
    public DisableApplicationResourceServerResponse disableApplicationResourceServerWithOptions(DisableApplicationResourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableApplicationResourceServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableApplicationResourceServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the resource server functionality for a specified application.</p>
     * 
     * @param request DisableApplicationResourceServerRequest
     * @return DisableApplicationResourceServerResponse
     */
    public DisableApplicationResourceServerResponse disableApplicationResourceServer(DisableApplicationResourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableApplicationResourceServerWithOptions(request, runtime);
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
     * <b>description</b> :
     * <p>When you change the status of an application from enabled to disabled, all application features, such as single sign-on (SSO) and account synchronization, become unavailable. Be aware of the potential threats associated with this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an application token.</p>
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
     * <b>description</b> :
     * <p>When you change the status of an application from enabled to disabled, all application features, such as single sign-on (SSO) and account synchronization, become unavailable. Be aware of the potential threats associated with this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables an application token.</p>
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
     * <p>Disables an authorization rule.</p>
     * 
     * @param request DisableAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAuthorizationRuleResponse
     */
    public DisableAuthorizationRuleResponse disableAuthorizationRuleWithOptions(DisableAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an authorization rule.</p>
     * 
     * @param request DisableAuthorizationRuleRequest
     * @return DisableAuthorizationRuleResponse
     */
    public DisableAuthorizationRuleResponse disableAuthorizationRule(DisableAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a brand.</p>
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
     * <p>Disables a brand.</p>
     * 
     * @param request DisableBrandRequest
     * @return DisableBrandResponse
     */
    public DisableBrandResponse disableBrand(DisableBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the ClientPublicKey for a specified application.</p>
     * 
     * @param request DisableClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableClientPublicKeyResponse
     */
    public DisableClientPublicKeyResponse disableClientPublicKeyWithOptions(DisableClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPublicKeyId)) {
            query.put("ClientPublicKeyId", request.clientPublicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the ClientPublicKey for a specified application.</p>
     * 
     * @param request DisableClientPublicKeyRequest
     * @return DisableClientPublicKeyResponse
     */
    public DisableClientPublicKeyResponse disableClientPublicKey(DisableClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableClientPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request DisableCloudAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCloudAccountRoleResponse
     */
    public DisableCloudAccountRoleResponse disableCloudAccountRoleWithOptions(DisableCloudAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleId)) {
            query.put("CloudAccountRoleId", request.cloudAccountRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCloudAccountRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCloudAccountRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request DisableCloudAccountRoleRequest
     * @return DisableCloudAccountRoleResponse
     */
    public DisableCloudAccountRoleResponse disableCloudAccountRole(DisableCloudAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCloudAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you change a conditional access policy from the enabled state to the disabled state, the policy no longer intercepts requests. Confirm that you are aware of the security risks that this operation may cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a conditional access policy.</p>
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
     * <p>When you change a conditional access policy from the enabled state to the disabled state, the policy no longer intercepts requests. Confirm that you are aware of the security risks that this operation may cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a conditional access policy.</p>
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
     * <p>Disables a credential resource.</p>
     * 
     * @param request DisableCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCredentialResponse
     */
    public DisableCredentialResponse disableCredentialWithOptions(DisableCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a credential resource.</p>
     * 
     * @param request DisableCredentialRequest
     * @return DisableCredentialResponse
     */
    public DisableCredentialResponse disableCredential(DisableCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a credential provider.</p>
     * 
     * @param request DisableCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCredentialProviderResponse
     */
    public DisableCredentialProviderResponse disableCredentialProviderWithOptions(DisableCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a credential provider.</p>
     * 
     * @param request DisableCredentialProviderRequest
     * @return DisableCredentialProviderResponse
     */
    public DisableCredentialProviderResponse disableCredentialProvider(DisableCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a field.</p>
     * 
     * @param request DisableCustomFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableCustomFieldResponse
     */
    public DisableCustomFieldResponse disableCustomFieldWithOptions(DisableCustomFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldId)) {
            query.put("FieldId", request.fieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableCustomField"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableCustomFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a field.</p>
     * 
     * @param request DisableCustomFieldRequest
     * @return DisableCustomFieldResponse
     */
    public DisableCustomFieldResponse disableCustomField(DisableCustomFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableCustomFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables a custom term.</p>
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
     * <p>Disables a custom term.</p>
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
     * <p>Disables a specified domain proxy token for an EIAM instance. After the token is disabled, domain usage is affected.</p>
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
     * <p>Disables a specified domain proxy token for an EIAM instance. After the token is disabled, domain usage is affected.</p>
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
     * <p>Disables a federated credential provider.</p>
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
     * <p>Disables a federated credential provider.</p>
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
     * <p>Disables the advanced configuration.</p>
     * 
     * @param request DisableIdentityProviderAdvancedAbilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableIdentityProviderAdvancedAbilityResponse
     */
    public DisableIdentityProviderAdvancedAbilityResponse disableIdentityProviderAdvancedAbilityWithOptions(DisableIdentityProviderAdvancedAbilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableIdentityProviderAdvancedAbility"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableIdentityProviderAdvancedAbilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the advanced configuration.</p>
     * 
     * @param request DisableIdentityProviderAdvancedAbilityRequest
     * @return DisableIdentityProviderAdvancedAbilityResponse
     */
    public DisableIdentityProviderAdvancedAbilityResponse disableIdentityProviderAdvancedAbility(DisableIdentityProviderAdvancedAbilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableIdentityProviderAdvancedAbilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you disable an application, all its features, such as single sign-on (SSO) and account synchronization, become unavailable. Before you perform this operation, make sure that you understand the associated risks.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables authentication.</p>
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
     * <b>description</b> :
     * <p>When you disable an application, all its features, such as single sign-on (SSO) and account synchronization, become unavailable. Before you perform this operation, make sure that you understand the associated risks.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables authentication.</p>
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
     * <p>Disables automatic redirect from the initialization domain to the default domain for an EIAM instance. After disabling, accessing the portal via the initialization domain will no longer redirect to the default domain.</p>
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
     * <p>Disables automatic redirect from the initialization domain to the default domain for an EIAM instance. After disabling, accessing the portal via the initialization domain will no longer redirect to the default domain.</p>
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
     * <p>Disables an internal authentication source.</p>
     * 
     * @param request DisableInternalAuthenticationSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableInternalAuthenticationSourceResponse
     */
    public DisableInternalAuthenticationSourceResponse disableInternalAuthenticationSourceWithOptions(DisableInternalAuthenticationSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationSourceId)) {
            query.put("AuthenticationSourceId", request.authenticationSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableInternalAuthenticationSource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableInternalAuthenticationSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an internal authentication source.</p>
     * 
     * @param request DisableInternalAuthenticationSourceRequest
     * @return DisableInternalAuthenticationSourceResponse
     */
    public DisableInternalAuthenticationSourceResponse disableInternalAuthenticationSource(DisableInternalAuthenticationSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableInternalAuthenticationSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the custom subject feature for a specified resource server.</p>
     * 
     * @param request DisableResourceServerCustomSubjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableResourceServerCustomSubjectResponse
     */
    public DisableResourceServerCustomSubjectResponse disableResourceServerCustomSubjectWithOptions(DisableResourceServerCustomSubjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DisableResourceServerCustomSubject"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableResourceServerCustomSubjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the custom subject feature for a specified resource server.</p>
     * 
     * @param request DisableResourceServerCustomSubjectRequest
     * @return DisableResourceServerCustomSubjectResponse
     */
    public DisableResourceServerCustomSubjectResponse disableResourceServerCustomSubject(DisableResourceServerCustomSubjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableResourceServerCustomSubjectWithOptions(request, runtime);
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
     * <p>You can call the EnableApplicationApiInvoke operation to enable Developer API calls for an EIAM application.</p>
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
     * <p>You can call the EnableApplicationApiInvoke operation to enable Developer API calls for an EIAM application.</p>
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
     * <p>Enables the client key of an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Enables the client key of an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Enables an application federated credential.</p>
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
     * <p>Enables an application federated credential.</p>
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
     * <p>Enables the machine-to-machine (M2M) client feature for an application. This allows the application to act as a caller (an OAuth client) to access resources.</p>
     * 
     * @param request EnableApplicationM2MClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationM2MClientResponse
     */
    public EnableApplicationM2MClientResponse enableApplicationM2MClientWithOptions(EnableApplicationM2MClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EnableApplicationM2MClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationM2MClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the machine-to-machine (M2M) client feature for an application. This allows the application to act as a caller (an OAuth client) to access resources.</p>
     * 
     * @param request EnableApplicationM2MClientRequest
     * @return EnableApplicationM2MClientResponse
     */
    public EnableApplicationM2MClientResponse enableApplicationM2MClient(EnableApplicationM2MClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationM2MClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Enables the account synchronization feature for an application in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Enables the ResourceServer feature for a specified application.</p>
     * 
     * @param request EnableApplicationResourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableApplicationResourceServerResponse
     */
    public EnableApplicationResourceServerResponse enableApplicationResourceServerWithOptions(EnableApplicationResourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EnableApplicationResourceServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableApplicationResourceServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the ResourceServer feature for a specified application.</p>
     * 
     * @param request EnableApplicationResourceServerRequest
     * @return EnableApplicationResourceServerResponse
     */
    public EnableApplicationResourceServerResponse enableApplicationResourceServer(EnableApplicationResourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableApplicationResourceServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables single sign-on (SSO) for an EIAM application.</p>
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
     * <p>Enables single sign-on (SSO) for an EIAM application.</p>
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
     * <p>Enables an application token.</p>
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
     * <p>Enables an application token.</p>
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
     * <p>Enables an authorization rule.</p>
     * 
     * @param request EnableAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAuthorizationRuleResponse
     */
    public EnableAuthorizationRuleResponse enableAuthorizationRuleWithOptions(EnableAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an authorization rule.</p>
     * 
     * @param request EnableAuthorizationRuleRequest
     * @return EnableAuthorizationRuleResponse
     */
    public EnableAuthorizationRuleResponse enableAuthorizationRule(EnableAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a brand.</p>
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
     * <p>Enables a brand.</p>
     * 
     * @param request EnableBrandRequest
     * @return EnableBrandResponse
     */
    public EnableBrandResponse enableBrand(EnableBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the specified ClientPublicKey for an application.</p>
     * 
     * @param request EnableClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableClientPublicKeyResponse
     */
    public EnableClientPublicKeyResponse enableClientPublicKeyWithOptions(EnableClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPublicKeyId)) {
            query.put("ClientPublicKeyId", request.clientPublicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the specified ClientPublicKey for an application.</p>
     * 
     * @param request EnableClientPublicKeyRequest
     * @return EnableClientPublicKeyResponse
     */
    public EnableClientPublicKeyResponse enableClientPublicKey(EnableClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableClientPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request EnableCloudAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCloudAccountRoleResponse
     */
    public EnableCloudAccountRoleResponse enableCloudAccountRoleWithOptions(EnableCloudAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleId)) {
            query.put("CloudAccountRoleId", request.cloudAccountRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCloudAccountRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCloudAccountRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a cloud role for a specified Alibaba Cloud account.</p>
     * 
     * @param request EnableCloudAccountRoleRequest
     * @return EnableCloudAccountRoleResponse
     */
    public EnableCloudAccountRoleResponse enableCloudAccountRole(EnableCloudAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCloudAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you change a conditional access policy from enabled to disabled, the policy no longer intercepts requests. Confirm that you are aware of the risks that this operation may cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a conditional access policy.</p>
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
     * <p>When you change a conditional access policy from enabled to disabled, the policy no longer intercepts requests. Confirm that you are aware of the risks that this operation may cause.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a conditional access policy.</p>
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
     * <p>Enables a credential resource.</p>
     * 
     * @param request EnableCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCredentialResponse
     */
    public EnableCredentialResponse enableCredentialWithOptions(EnableCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a credential resource.</p>
     * 
     * @param request EnableCredentialRequest
     * @return EnableCredentialResponse
     */
    public EnableCredentialResponse enableCredential(EnableCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a credential provider.</p>
     * 
     * @param request EnableCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCredentialProviderResponse
     */
    public EnableCredentialProviderResponse enableCredentialProviderWithOptions(EnableCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a credential provider.</p>
     * 
     * @param request EnableCredentialProviderRequest
     * @return EnableCredentialProviderResponse
     */
    public EnableCredentialProviderResponse enableCredentialProvider(EnableCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>*Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of IDaaS EIAM.**.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a field.</p>
     * 
     * @param request EnableCustomFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableCustomFieldResponse
     */
    public EnableCustomFieldResponse enableCustomFieldWithOptions(EnableCustomFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldId)) {
            query.put("FieldId", request.fieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableCustomField"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableCustomFieldResponse());
    }

    /**
     * <b>description</b> :
     * <p>*Before you use this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of IDaaS EIAM.**.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a field.</p>
     * 
     * @param request EnableCustomFieldRequest
     * @return EnableCustomFieldResponse
     */
    public EnableCustomFieldResponse enableCustomField(EnableCustomFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableCustomFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables a custom clause.</p>
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
     * <p>Enables a custom clause.</p>
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
     * <p>Enables a domain proxy token for a specified EIAM instance domain name to verify domain security.</p>
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
     * <p>Enables a domain proxy token for a specified EIAM instance domain name to verify domain security.</p>
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
     * <p>Enables a federated credential provider.</p>
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
     * <p>Enables a federated credential provider.</p>
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
     * <p>Enables advanced configuration.</p>
     * 
     * @param request EnableIdentityProviderAdvancedAbilityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableIdentityProviderAdvancedAbilityResponse
     */
    public EnableIdentityProviderAdvancedAbilityResponse enableIdentityProviderAdvancedAbilityWithOptions(EnableIdentityProviderAdvancedAbilityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EnableIdentityProviderAdvancedAbility"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableIdentityProviderAdvancedAbilityResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables advanced configuration.</p>
     * 
     * @param request EnableIdentityProviderAdvancedAbilityRequest
     * @return EnableIdentityProviderAdvancedAbilityResponse
     */
    public EnableIdentityProviderAdvancedAbilityResponse enableIdentityProviderAdvancedAbility(EnableIdentityProviderAdvancedAbilityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableIdentityProviderAdvancedAbilityWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When a conditional access policy is disabled, it no longer blocks access. Ensure that you understand the potential security threats before you perform this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables authentication.</p>
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
     * <b>description</b> :
     * <p>When a conditional access policy is disabled, it no longer blocks access. Ensure that you understand the potential security threats before you perform this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables authentication.</p>
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
     * <p>Enables automatic redirection from the initialization domain to the default domain for an EIAM instance. After this feature is enabled, accessing the portal through the initialization domain will redirect to the default domain address.</p>
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
     * <p>Enables automatic redirection from the initialization domain to the default domain for an EIAM instance. After this feature is enabled, accessing the portal through the initialization domain will redirect to the default domain address.</p>
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
     * <p>Enables an internal authentication source.</p>
     * 
     * @param request EnableInternalAuthenticationSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableInternalAuthenticationSourceResponse
     */
    public EnableInternalAuthenticationSourceResponse enableInternalAuthenticationSourceWithOptions(EnableInternalAuthenticationSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authenticationSourceId)) {
            query.put("AuthenticationSourceId", request.authenticationSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableInternalAuthenticationSource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableInternalAuthenticationSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an internal authentication source.</p>
     * 
     * @param request EnableInternalAuthenticationSourceRequest
     * @return EnableInternalAuthenticationSourceResponse
     */
    public EnableInternalAuthenticationSourceResponse enableInternalAuthenticationSource(EnableInternalAuthenticationSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInternalAuthenticationSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the custom subject feature for a specified resource server. After this feature is enabled, the subject of an issued access token changes from <clientId> to <clientId>:&lt;client.activeSubjectUrn&gt;. The <code>client.activeSubjectUrn</code> is set in the attribute mapping of the application\&quot;s federated identity provider.</p>
     * 
     * @param request EnableResourceServerCustomSubjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableResourceServerCustomSubjectResponse
     */
    public EnableResourceServerCustomSubjectResponse enableResourceServerCustomSubjectWithOptions(EnableResourceServerCustomSubjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "EnableResourceServerCustomSubject"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableResourceServerCustomSubjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the custom subject feature for a specified resource server. After this feature is enabled, the subject of an issued access token changes from <clientId> to <clientId>:&lt;client.activeSubjectUrn&gt;. The <code>client.activeSubjectUrn</code> is set in the attribute mapping of the application\&quot;s federated identity provider.</p>
     * 
     * @param request EnableResourceServerCustomSubjectRequest
     * @return EnableResourceServerCustomSubjectResponse
     */
    public EnableResourceServerCustomSubjectResponse enableResourceServerCustomSubject(EnableResourceServerCustomSubjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableResourceServerCustomSubjectWithOptions(request, runtime);
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
     * <p>Resolves the metadata for an identity provider.</p>
     * 
     * @param request ExecIdentityProviderMetadataUrlResolutionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecIdentityProviderMetadataUrlResolutionResponse
     */
    public ExecIdentityProviderMetadataUrlResolutionResponse execIdentityProviderMetadataUrlResolutionWithOptions(ExecIdentityProviderMetadataUrlResolutionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAccessEndpointId)) {
            query.put("NetworkAccessEndpointId", request.networkAccessEndpointId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oidcIssuer)) {
            query.put("OidcIssuer", request.oidcIssuer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.samlMetadataUrl)) {
            query.put("SamlMetadataUrl", request.samlMetadataUrl);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecIdentityProviderMetadataUrlResolution"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecIdentityProviderMetadataUrlResolutionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resolves the metadata for an identity provider.</p>
     * 
     * @param request ExecIdentityProviderMetadataUrlResolutionRequest
     * @return ExecIdentityProviderMetadataUrlResolutionResponse
     */
    public ExecIdentityProviderMetadataUrlResolutionResponse execIdentityProviderMetadataUrlResolution(ExecIdentityProviderMetadataUrlResolutionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.execIdentityProviderMetadataUrlResolutionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a download URL for file import results.</p>
     * 
     * @param request GenerateDownloadUrlForSynchronizationJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDownloadUrlForSynchronizationJobResponse
     */
    public GenerateDownloadUrlForSynchronizationJobResponse generateDownloadUrlForSynchronizationJobWithOptions(GenerateDownloadUrlForSynchronizationJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GenerateDownloadUrlForSynchronizationJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateDownloadUrlForSynchronizationJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a download URL for file import results.</p>
     * 
     * @param request GenerateDownloadUrlForSynchronizationJobRequest
     * @return GenerateDownloadUrlForSynchronizationJobResponse
     */
    public GenerateDownloadUrlForSynchronizationJobResponse generateDownloadUrlForSynchronizationJob(GenerateDownloadUrlForSynchronizationJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateDownloadUrlForSynchronizationJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a file import template.</p>
     * 
     * @param request GenerateFileImportTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateFileImportTemplateResponse
     */
    public GenerateFileImportTemplateResponse generateFileImportTemplateWithOptions(GenerateFileImportTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateFileImportTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateFileImportTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a file import template.</p>
     * 
     * @param request GenerateFileImportTemplateRequest
     * @return GenerateFileImportTemplateResponse
     */
    public GenerateFileImportTemplateResponse generateFileImportTemplate(GenerateFileImportTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateFileImportTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain an access token to call a resource server using a specified application as the client.</p>
     * 
     * @param request GenerateOauthTokenRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateOauthTokenResponse
     */
    public GenerateOauthTokenResponse generateOauthTokenWithOptions(GenerateOauthTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.audience)) {
            query.put("Audience", request.audience);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scopeValues)) {
            query.put("ScopeValues", request.scopeValues);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateOauthToken"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateOauthTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtain an access token to call a resource server using a specified application as the client.</p>
     * 
     * @param request GenerateOauthTokenRequest
     * @return GenerateOauthTokenResponse
     */
    public GenerateOauthTokenResponse generateOauthToken(GenerateOauthTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateOauthTokenWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Upload Authentication</p>
     * 
     * @param request GenerateUploadAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateUploadAuthResponse
     */
    public GenerateUploadAuthResponse generateUploadAuthWithOptions(GenerateUploadAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.purpose)) {
            query.put("Purpose", request.purpose);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateUploadAuth"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateUploadAuthResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Upload Authentication</p>
     * 
     * @param request GenerateUploadAuthRequest
     * @return GenerateUploadAuthResponse
     */
    public GenerateUploadAuthResponse generateUploadAuth(GenerateUploadAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateUploadAuthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a WebAuthn authenticator registration URL.</p>
     * 
     * @param request GenerateWebAuthnAuthenticatorRegistrationUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateWebAuthnAuthenticatorRegistrationUrlResponse
     */
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponse generateWebAuthnAuthenticatorRegistrationUrlWithOptions(GenerateWebAuthnAuthenticatorRegistrationUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.domainId)) {
            query.put("DomainId", request.domainId);
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
            new TeaPair("action", "GenerateWebAuthnAuthenticatorRegistrationUrl"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateWebAuthnAuthenticatorRegistrationUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a WebAuthn authenticator registration URL.</p>
     * 
     * @param request GenerateWebAuthnAuthenticatorRegistrationUrlRequest
     * @return GenerateWebAuthnAuthenticatorRegistrationUrlResponse
     */
    public GenerateWebAuthnAuthenticatorRegistrationUrlResponse generateWebAuthnAuthenticatorRegistrationUrl(GenerateWebAuthnAuthenticatorRegistrationUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateWebAuthnAuthenticatorRegistrationUrlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specified EIAM application.</p>
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
     * <p>Retrieves the details of a specified EIAM application.</p>
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
     * <p>Retrieves the advanced configuration of an application.</p>
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
     * <p>Retrieves the advanced configuration of an application.</p>
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
     * <p>Retrieves the federated credential for an application.</p>
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
     * <p>Retrieves the federated credential for an application.</p>
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
     * <p>Retrieves the account synchronization configuration for an Entity Identity and Access Management (EIAM) application.</p>
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
     * <p>Retrieves the account synchronization configuration for an Entity Identity and Access Management (EIAM) application.</p>
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
     * <p>Queries the synchronization configuration of a specified application.</p>
     * 
     * @param request GetApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse getApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(GetApplicationProvisioningUserPrimaryOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetApplicationProvisioningUserPrimaryOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the synchronization configuration of a specified application.</p>
     * 
     * @param request GetApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @return GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public GetApplicationProvisioningUserPrimaryOrganizationalUnitResponse getApplicationProvisioningUserPrimaryOrganizationalUnit(GetApplicationProvisioningUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an application role.</p>
     * 
     * @param request GetApplicationRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationRoleResponse
     */
    public GetApplicationRoleResponse getApplicationRoleWithOptions(GetApplicationRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApplicationRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of an application role.</p>
     * 
     * @param request GetApplicationRoleRequest
     * @return GetApplicationRoleResponse
     */
    public GetApplicationRoleResponse getApplicationRole(GetApplicationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApplicationRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the single sign-on (SSO) configuration for an application in EIAM.</p>
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
     * <p>Retrieves the single sign-on (SSO) configuration for an application in EIAM.</p>
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
     * <p>Retrieves the details of an application template.</p>
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
     * <p>Retrieves the details of an application template.</p>
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
     * <p>Queries information about an authorized resource.</p>
     * 
     * @param request GetAuthorizationResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorizationResourceResponse
     */
    public GetAuthorizationResourceResponse getAuthorizationResourceWithOptions(GetAuthorizationResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceId)) {
            query.put("AuthorizationResourceId", request.authorizationResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationResource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an authorized resource.</p>
     * 
     * @param request GetAuthorizationResourceRequest
     * @return GetAuthorizationResourceResponse
     */
    public GetAuthorizationResourceResponse getAuthorizationResource(GetAuthorizationResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorizationResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about an authorization rule.</p>
     * 
     * @param request GetAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorizationRuleResponse
     */
    public GetAuthorizationRuleResponse getAuthorizationRuleWithOptions(GetAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query information about an authorization rule.</p>
     * 
     * @param request GetAuthorizationRuleRequest
     * @return GetAuthorizationRuleResponse
     */
    public GetAuthorizationRuleResponse getAuthorizationRule(GetAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询授权服务器</p>
     * 
     * @param request GetAuthorizationServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorizationServerResponse
     */
    public GetAuthorizationServerResponse getAuthorizationServerWithOptions(GetAuthorizationServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationServerId)) {
            query.put("AuthorizationServerId", request.authorizationServerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorizationServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorizationServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询授权服务器</p>
     * 
     * @param request GetAuthorizationServerRequest
     * @return GetAuthorizationServerResponse
     */
    public GetAuthorizationServerResponse getAuthorizationServer(GetAuthorizationServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorizationServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Brand Details</p>
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
     * <p>Get Brand Details</p>
     * 
     * @param request GetBrandRequest
     * @return GetBrandResponse
     */
    public GetBrandResponse getBrand(GetBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ClientPublicKey for a specified application.</p>
     * 
     * @param request GetClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientPublicKeyResponse
     */
    public GetClientPublicKeyResponse getClientPublicKeyWithOptions(GetClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPublicKeyId)) {
            query.put("ClientPublicKeyId", request.clientPublicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the ClientPublicKey for a specified application.</p>
     * 
     * @param request GetClientPublicKeyRequest
     * @return GetClientPublicKeyResponse
     */
    public GetClientPublicKeyResponse getClientPublicKey(GetClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientPublicKeyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about resources in an Alibaba Cloud account.</p>
     * 
     * @param request GetCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudAccountResponse
     */
    public GetCloudAccountResponse getCloudAccountWithOptions(GetCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about resources in an Alibaba Cloud account.</p>
     * 
     * @param request GetCloudAccountRequest
     * @return GetCloudAccountResponse
     */
    public GetCloudAccountResponse getCloudAccount(GetCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a cloud role.</p>
     * 
     * @param request GetCloudAccountRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudAccountRoleResponse
     */
    public GetCloudAccountRoleResponse getCloudAccountRoleWithOptions(GetCloudAccountRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleId)) {
            query.put("CloudAccountRoleId", request.cloudAccountRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudAccountRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudAccountRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves information about a cloud role.</p>
     * 
     * @param request GetCloudAccountRoleRequest
     * @return GetCloudAccountRoleResponse
     */
    public GetCloudAccountRoleResponse getCloudAccountRole(GetCloudAccountRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudAccountRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Get a conditional access policy.</p>
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
     * <p>Query a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Get a conditional access policy.</p>
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
     * <p>Retrieves the details of a specific credential.</p>
     * 
     * @param request GetCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredentialWithOptions(GetCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a specific credential.</p>
     * 
     * @param request GetCredentialRequest
     * @return GetCredentialResponse
     */
    public GetCredentialResponse getCredential(GetCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a credential provider.</p>
     * 
     * @param request GetCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCredentialProviderResponse
     */
    public GetCredentialProviderResponse getCredentialProviderWithOptions(GetCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the details of a credential provider.</p>
     * 
     * @param request GetCredentialProviderRequest
     * @return GetCredentialProviderResponse
     */
    public GetCredentialProviderResponse getCredentialProvider(GetCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about an extended field.</p>
     * 
     * @param request GetCustomFieldRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCustomFieldResponse
     */
    public GetCustomFieldResponse getCustomFieldWithOptions(GetCustomFieldRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fieldId)) {
            query.put("FieldId", request.fieldId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCustomField"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCustomFieldResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about an extended field.</p>
     * 
     * @param request GetCustomFieldRequest
     * @return GetCustomFieldResponse
     */
    public GetCustomFieldResponse getCustomField(GetCustomFieldRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCustomFieldWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a custom privacy policy.</p>
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
     * <p>Retrieves a custom privacy policy.</p>
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
     * <p>Retrieves information about a domain name for an EIAM instance.</p>
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
     * <p>Retrieves information about a domain name for an EIAM instance.</p>
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
     * <p>Queries the DNS Challenge record for a specified EIAM domain name. This record is used to verify domain ownership.</p>
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
     * <p>Queries the DNS Challenge record for a specified EIAM domain name. This record is used to verify domain ownership.</p>
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
     * <p>Retrieve a federated credential provider.</p>
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
     * <p>Retrieve a federated credential provider.</p>
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
     * <p>Queries the forgot password policy of a specified EIAM instance.</p>
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
     * <p>Queries the forgot password policy of a specified EIAM instance.</p>
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
     * <p>Retrieves the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Retrieves the information about an account group in Identity as a Service (IDaaS) Employee Identity and Access Management (EIAM).</p>
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
     * <p>Get an identity provider.</p>
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
     * <p>Get an identity provider.</p>
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
     * <p>Retrieves advanced configuration information.</p>
     * 
     * @param request GetIdentityProviderAdvancedConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderAdvancedConfigurationResponse
     */
    public GetIdentityProviderAdvancedConfigurationResponse getIdentityProviderAdvancedConfigurationWithOptions(GetIdentityProviderAdvancedConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetIdentityProviderAdvancedConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderAdvancedConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves advanced configuration information.</p>
     * 
     * @param request GetIdentityProviderAdvancedConfigurationRequest
     * @return GetIdentityProviderAdvancedConfigurationResponse
     */
    public GetIdentityProviderAdvancedConfigurationResponse getIdentityProviderAdvancedConfiguration(GetIdentityProviderAdvancedConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderAdvancedConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an IdP check task.</p>
     * 
     * @param request GetIdentityProviderStatusCheckJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderStatusCheckJobResponse
     */
    public GetIdentityProviderStatusCheckJobResponse getIdentityProviderStatusCheckJobWithOptions(GetIdentityProviderStatusCheckJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderStatusCheckJobId)) {
            query.put("IdentityProviderStatusCheckJobId", request.identityProviderStatusCheckJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIdentityProviderStatusCheckJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderStatusCheckJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves an IdP check task.</p>
     * 
     * @param request GetIdentityProviderStatusCheckJobRequest
     * @return GetIdentityProviderStatusCheckJobResponse
     */
    public GetIdentityProviderStatusCheckJobResponse getIdentityProviderStatusCheckJob(GetIdentityProviderStatusCheckJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderStatusCheckJobWithOptions(request, runtime);
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
     * <p>Retrieve the IdP outbound synchronization configuration.</p>
     * 
     * @param request GetIdentityProviderUdPushConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIdentityProviderUdPushConfigurationResponse
     */
    public GetIdentityProviderUdPushConfigurationResponse getIdentityProviderUdPushConfigurationWithOptions(GetIdentityProviderUdPushConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetIdentityProviderUdPushConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIdentityProviderUdPushConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve the IdP outbound synchronization configuration.</p>
     * 
     * @param request GetIdentityProviderUdPushConfigurationRequest
     * @return GetIdentityProviderUdPushConfigurationResponse
     */
    public GetIdentityProviderUdPushConfigurationResponse getIdentityProviderUdPushConfiguration(GetIdentityProviderUdPushConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIdentityProviderUdPushConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an EIAM instance.</p>
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
     * <p>Queries the details of an EIAM instance.</p>
     * 
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance control items.</p>
     * 
     * @param request GetInstanceControlConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceControlConfigurationResponse
     */
    public GetInstanceControlConfigurationResponse getInstanceControlConfigurationWithOptions(GetInstanceControlConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elementName)) {
            query.put("ElementName", request.elementName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceControlConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceControlConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries instance control items.</p>
     * 
     * @param request GetInstanceControlConfigurationRequest
     * @return GetInstanceControlConfigurationResponse
     */
    public GetInstanceControlConfigurationResponse getInstanceControlConfiguration(GetInstanceControlConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceControlConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the language and time zone information of an instance.</p>
     * 
     * @param request GetInstanceGlobalizationConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceGlobalizationConfigResponse
     */
    public GetInstanceGlobalizationConfigResponse getInstanceGlobalizationConfigWithOptions(GetInstanceGlobalizationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceGlobalizationConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceGlobalizationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the language and time zone information of an instance.</p>
     * 
     * @param request GetInstanceGlobalizationConfigRequest
     * @return GetInstanceGlobalizationConfigResponse
     */
    public GetInstanceGlobalizationConfigResponse getInstanceGlobalizationConfig(GetInstanceGlobalizationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceGlobalizationConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Ensure the instance is not in use before deletion. Deleting an EIAM instance permanently removes all of its associated data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the active license information for an instance.</p>
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
     * <p>Ensure the instance is not in use before deletion. Deleting an EIAM instance permanently removes all of its associated data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the active license information for an instance.</p>
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
     * <p>Retrieves all module information under a first-level module.</p>
     * 
     * @param request GetInstanceModuleInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceModuleInfoResponse
     */
    public GetInstanceModuleInfoResponse getInstanceModuleInfoWithOptions(GetInstanceModuleInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleKey)) {
            query.put("ModuleKey", request.moduleKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceModuleInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceModuleInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves all module information under a first-level module.</p>
     * 
     * @param request GetInstanceModuleInfoRequest
     * @return GetInstanceModuleInfoResponse
     */
    public GetInstanceModuleInfoResponse getInstanceModuleInfo(GetInstanceModuleInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceModuleInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the quota of a single type for an instance.</p>
     * 
     * @param request GetInstanceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceQuotaResponse
     */
    public GetInstanceQuotaResponse getInstanceQuotaWithOptions(GetInstanceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quotaKey)) {
            query.put("QuotaKey", request.quotaKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceQuota"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the quota of a single type for an instance.</p>
     * 
     * @param request GetInstanceQuotaRequest
     * @return GetInstanceQuotaResponse
     */
    public GetInstanceQuotaResponse getInstanceQuota(GetInstanceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the trial status of an instance.</p>
     * 
     * @param request GetInstanceTrialStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceTrialStatusResponse
     */
    public GetInstanceTrialStatusResponse getInstanceTrialStatusWithOptions(GetInstanceTrialStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceTrialStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceTrialStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the trial status of an instance.</p>
     * 
     * @param request GetInstanceTrialStatusRequest
     * @return GetInstanceTrialStatusResponse
     */
    public GetInstanceTrialStatusResponse getInstanceTrialStatus(GetInstanceTrialStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceTrialStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the post-logon redirect application for a brand.</p>
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
     * <p>Sets the post-logon redirect application for a brand.</p>
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
     * <p>Queries the information about a specified network access endpoint.</p>
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
     * <p>Queries the information about a specified network access endpoint.</p>
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
     * <p>Retrieves a network zone object.</p>
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
     * <p>Retrieves a network zone object.</p>
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
     * <p>Retrieves the password complexity policy for a specified EIAM instance.</p>
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
     * <p>Retrieves the password complexity policy for a specified EIAM instance.</p>
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
     * <p>Queries the password expiration policy of a specified EIAM instance.</p>
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
     * <p>Queries the password expiration policy of a specified EIAM instance.</p>
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
     * <p>Queries the password history policy of a specified EIAM instance.</p>
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
     * <p>Queries the password history policy of a specified EIAM instance.</p>
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
     * <p>Queries the password initialization policy of Employee Identity and Access Management (EIAM).</p>
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
     * <p>Queries the password initialization policy of Employee Identity and Access Management (EIAM).</p>
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
     * <p>Retrieves the permission scopes for a specified resource server.</p>
     * 
     * @param request GetResourceServerScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceServerScopeResponse
     */
    public GetResourceServerScopeResponse getResourceServerScopeWithOptions(GetResourceServerScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceServerScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceServerScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the permission scopes for a specified resource server.</p>
     * 
     * @param request GetResourceServerScopeRequest
     * @return GetResourceServerScopeResponse
     */
    public GetResourceServerScopeResponse getResourceServerScope(GetResourceServerScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceServerScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the root organizational unit information of EIAM.</p>
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
     * <p>Queries the root organizational unit information of EIAM.</p>
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
     * <p>Retrieves the service quota.</p>
     * 
     * @param request GetServiceQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceQuotaResponse
     */
    public GetServiceQuotaResponse getServiceQuotaWithOptions(GetServiceQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.quotaType)) {
            query.put("QuotaType", request.quotaType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceQuota"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceQuotaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the service quota.</p>
     * 
     * @param request GetServiceQuotaRequest
     * @return GetServiceQuotaResponse
     */
    public GetServiceQuotaResponse getServiceQuota(GetServiceQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceQuotaWithOptions(request, runtime);
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
     * <p>Retrieves the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
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
     * <p>Retrieves the details of an account in Identity as a Service (IDaaS) Employee IAM (EIAM).</p>
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
     * <p>View the list of invocation events.</p>
     * 
     * @param request ListActionTrackEventTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListActionTrackEventTypesResponse
     */
    public ListActionTrackEventTypesResponse listActionTrackEventTypesWithOptions(ListActionTrackEventTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListActionTrackEventTypes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListActionTrackEventTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View the list of invocation events.</p>
     * 
     * @param request ListActionTrackEventTypesRequest
     * @return ListActionTrackEventTypesResponse
     */
    public ListActionTrackEventTypesResponse listActionTrackEventTypes(ListActionTrackEventTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listActionTrackEventTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of application accounts.</p>
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
     * <p>Returns a paginated list of application accounts.</p>
     * 
     * @param request ListApplicationAccountsRequest
     * @return ListApplicationAccountsResponse
     */
    public ListApplicationAccountsResponse listApplicationAccounts(ListApplicationAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries only applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all accounts that belong to a specified user in an application.</p>
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
     * <b>description</b> :
     * <p>This operation queries only applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all accounts that belong to a specified user in an application.</p>
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
     * <p>Queries all client secrets for an EIAM application. The key data in the response is masked. To obtain an unmasked key, call the ObtainApplicationClientSecret operation.</p>
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
     * <p>Queries all client secrets for an EIAM application. The key data in the response is masked. To obtain an unmasked key, call the ObtainApplicationClientSecret operation.</p>
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
     * <p>Lists the federated credentials for an application.</p>
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
     * <p>Lists the federated credentials for an application.</p>
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
     * <p>Lists the application federated credentials for a specified federated credential provider.</p>
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
     * <p>Lists the application federated credentials for a specified federated credential provider.</p>
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
     * <p>Retrieves a list of application roles using a cursor.</p>
     * 
     * @param request ListApplicationRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationRolesResponse
     */
    public ListApplicationRolesResponse listApplicationRolesWithOptions(ListApplicationRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationRoles"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of application roles using a cursor.</p>
     * 
     * @param request ListApplicationRolesRequest
     * @return ListApplicationRolesResponse
     */
    public ListApplicationRolesResponse listApplicationRoles(ListApplicationRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call the ListApplicationSupportedProvisionProtocolTypes operation to query the account synchronization protocols supported by an application.</p>
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
     * <p>Call the ListApplicationSupportedProvisionProtocolTypes operation to query the account synchronization protocols supported by an application.</p>
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
     * <p>Retrieves a list of application tokens.</p>
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
     * <p>Retrieves a list of application tokens.</p>
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
     * <p>Retrieves a paginated list of EIAM applications.</p>
     * 
     * @param request ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationCreationType)) {
            query.put("ApplicationCreationType", request.applicationCreationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationIdentityType)) {
            query.put("ApplicationIdentityType", request.applicationIdentityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationIds)) {
            query.put("ApplicationIds", request.applicationIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationName)) {
            query.put("ApplicationName", request.applicationName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationType)) {
            query.put("AuthorizationType", request.authorizationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            query.put("CustomFields", request.customFields);
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
     * <p>Retrieves a paginated list of EIAM applications.</p>
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
     * <p>Lists the applications associated with an authorization rule.</p>
     * 
     * @param request ListApplicationsForAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsForAuthorizationRuleResponse
     */
    public ListApplicationsForAuthorizationRuleResponse listApplicationsForAuthorizationRuleWithOptions(ListApplicationsForAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApplicationsForAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApplicationsForAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the applications associated with an authorization rule.</p>
     * 
     * @param request ListApplicationsForAuthorizationRuleRequest
     * @return ListApplicationsForAuthorizationRuleResponse
     */
    public ListApplicationsForAuthorizationRuleResponse listApplicationsForAuthorizationRule(ListApplicationsForAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsForAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of applications that an EIAM group can access.</p>
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
     * <p>Retrieves a list of applications that an EIAM group can access.</p>
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
     * <p>Retrieves application information under a network access endpoint.</p>
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
     * <p>Retrieves application information under a network access endpoint.</p>
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
     * <p>Retrieves the list of applications associated with a network domain.</p>
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
     * <p>Retrieves the list of applications associated with a network domain.</p>
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
     * <p>This operation queries only the applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries a paginated list of applications that an EIAM organization can access. The response includes application IDs. To retrieve detailed information about an application, call the GetApplication operation.</p>
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
     * <p>This operation queries only the applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation queries a paginated list of applications that an EIAM organization can access. The response includes application IDs. To retrieve detailed information about an application, call the GetApplication operation.</p>
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
     * <p>Queries the applications that an EIAM account can access and returns a paginated list of application IDs. To retrieve detailed information about a specific application, call the GetApplication operation.</p>
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
     * <p>Queries the applications that an EIAM account can access and returns a paginated list of application IDs. To retrieve detailed information about a specific application, call the GetApplication operation.</p>
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
     * <p>Queries a list of authorization resource information.</p>
     * 
     * @param request ListAuthorizationResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationResourcesResponse
     */
    public ListAuthorizationResourcesResponse listAuthorizationResourcesWithOptions(ListAuthorizationResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationResources"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of authorization resource information.</p>
     * 
     * @param request ListAuthorizationResourcesRequest
     * @return ListAuthorizationResourcesResponse
     */
    public ListAuthorizationResourcesResponse listAuthorizationResources(ListAuthorizationResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists authorization rules.</p>
     * 
     * @param request ListAuthorizationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationRulesResponse
     */
    public ListAuthorizationRulesResponse listAuthorizationRulesWithOptions(ListAuthorizationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRules"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists authorization rules.</p>
     * 
     * @param request ListAuthorizationRulesRequest
     * @return ListAuthorizationRulesResponse
     */
    public ListAuthorizationRulesResponse listAuthorizationRules(ListAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with an application.</p>
     * 
     * @param request ListAuthorizationRulesForApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationRulesForApplicationResponse
     */
    public ListAuthorizationRulesForApplicationResponse listAuthorizationRulesForApplicationWithOptions(ListAuthorizationRulesForApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRulesForApplication"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesForApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with an application.</p>
     * 
     * @param request ListAuthorizationRulesForApplicationRequest
     * @return ListAuthorizationRulesForApplicationResponse
     */
    public ListAuthorizationRulesForApplicationResponse listAuthorizationRulesForApplication(ListAuthorizationRulesForApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationRulesForApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with a group.</p>
     * 
     * @param request ListAuthorizationRulesForGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationRulesForGroupResponse
     */
    public ListAuthorizationRulesForGroupResponse listAuthorizationRulesForGroupWithOptions(ListAuthorizationRulesForGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRulesForGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesForGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with a group.</p>
     * 
     * @param request ListAuthorizationRulesForGroupRequest
     * @return ListAuthorizationRulesForGroupResponse
     */
    public ListAuthorizationRulesForGroupResponse listAuthorizationRulesForGroup(ListAuthorizationRulesForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationRulesForGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with an account.</p>
     * 
     * @param request ListAuthorizationRulesForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationRulesForUserResponse
     */
    public ListAuthorizationRulesForUserResponse listAuthorizationRulesForUserWithOptions(ListAuthorizationRulesForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRulesForUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the authorization rules associated with an account.</p>
     * 
     * @param request ListAuthorizationRulesForUserRequest
     * @return ListAuthorizationRulesForUserResponse
     */
    public ListAuthorizationRulesForUserResponse listAuthorizationRulesForUser(ListAuthorizationRulesForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationRulesForUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of all authorization servers under an instance.</p>
     * 
     * @param request ListAuthorizationServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationServersResponse
     */
    public ListAuthorizationServersResponse listAuthorizationServersWithOptions(ListAuthorizationServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationServers"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of all authorization servers under an instance.</p>
     * 
     * @param request ListAuthorizationServersRequest
     * @return ListAuthorizationServersResponse
     */
    public ListAuthorizationServersResponse listAuthorizationServers(ListAuthorizationServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a list of brands.</p>
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
     * <p>Retrieves a list of brands.</p>
     * 
     * @param request ListBrandsRequest
     * @return ListBrandsResponse
     */
    public ListBrandsResponse listBrands(ListBrandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrandsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the client public keys for a specified application using a cursor.</p>
     * 
     * @param request ListClientPublicKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientPublicKeysResponse
     */
    public ListClientPublicKeysResponse listClientPublicKeysWithOptions(ListClientPublicKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientPublicKeys"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientPublicKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the client public keys for a specified application using a cursor.</p>
     * 
     * @param request ListClientPublicKeysRequest
     * @return ListClientPublicKeysResponse
     */
    public ListClientPublicKeysResponse listClientPublicKeys(ListClientPublicKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientPublicKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a paginated list of cloud roles.</p>
     * 
     * @param request ListCloudAccountRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAccountRolesResponse
     */
    public ListCloudAccountRolesResponse listCloudAccountRolesWithOptions(ListCloudAccountRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudAccountRoles"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAccountRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a paginated list of cloud roles.</p>
     * 
     * @param request ListCloudAccountRolesRequest
     * @return ListCloudAccountRolesResponse
     */
    public ListCloudAccountRolesResponse listCloudAccountRoles(ListCloudAccountRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAccountRolesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of information about one or more Alibaba Cloud accounts.</p>
     * 
     * @param request ListCloudAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudAccountsResponse
     */
    public ListCloudAccountsResponse listCloudAccountsWithOptions(ListCloudAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudAccounts"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudAccountsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Returns a paginated list of information about one or more Alibaba Cloud accounts.</p>
     * 
     * @param request ListCloudAccountsRequest
     * @return ListCloudAccountsResponse
     */
    public ListCloudAccountsResponse listCloudAccounts(ListCloudAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Query the list of conditional access policies with pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>List conditional access policies.</p>
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
     * <p>Query the list of conditional access policies with pagination.</p>
     * 
     * <b>summary</b> : 
     * <p>List conditional access policies.</p>
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
     * <p>Lists the conditional access policies associated with an application.</p>
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
     * <p>Lists the conditional access policies associated with an application.</p>
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
     * <p>Retrieves the list of conditional access policies associated with a network zone.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of conditional access policies associated with a network zone.</p>
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
     * <p>Retrieves the list of conditional access policies associated with a network zone.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the list of conditional access policies associated with a network zone.</p>
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
     * <p>Retrieves the list of conditional access policies associated with a user.</p>
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
     * <p>Retrieves the list of conditional access policies associated with a user.</p>
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
     * <p>Lists the credential providers.</p>
     * 
     * @param request ListCredentialProvidersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialProvidersResponse
     */
    public ListCredentialProvidersResponse listCredentialProvidersWithOptions(ListCredentialProvidersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderIds)) {
            query.put("CredentialProviderIds", request.credentialProviderIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderTypes)) {
            query.put("CredentialProviderTypes", request.credentialProviderTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentialProviders"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialProvidersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the credential providers.</p>
     * 
     * @param request ListCredentialProvidersRequest
     * @return ListCredentialProvidersResponse
     */
    public ListCredentialProvidersResponse listCredentialProviders(ListCredentialProvidersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCredentialProvidersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentialsWithOptions(ListCredentialsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialExternalIds)) {
            query.put("CredentialExternalIds", request.credentialExternalIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialIds)) {
            query.put("CredentialIds", request.credentialIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialSharingScopes)) {
            query.put("CredentialSharingScopes", request.credentialSharingScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialTypes)) {
            query.put("CredentialTypes", request.credentialTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.statuses)) {
            query.put("Statuses", request.statuses);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCredentials"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCredentialsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of credentials.</p>
     * 
     * @param request ListCredentialsRequest
     * @return ListCredentialsResponse
     */
    public ListCredentialsResponse listCredentials(ListCredentialsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCredentialsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of custom terms.</p>
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
     * <p>Queries the list of custom terms.</p>
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
     * <p>Retrieves the resources of brand-linked instances.</p>
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
     * <p>Retrieves the resources of brand-linked instances.</p>
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
     * <p>Queries a list of domain proxy tokens of an EIAM instance.</p>
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
     * <p>Queries a list of domain proxy tokens of an EIAM instance.</p>
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
     * <p>Queries the domain names of an EIAM instance, including the default domain name and custom domain names.</p>
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
     * <p>Queries the domain names of an EIAM instance, including the default domain name and custom domain names.</p>
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
     * <p>Queries the list of EIAM 2.0 and EIAM 1.0 instances.</p>
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
     * <p>Queries the list of EIAM 2.0 and EIAM 1.0 instances.</p>
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
     * <p>Lists the regions available for EIAM 1.0 and EIAM 2.0.</p>
     * 
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
     * <p>Lists the regions available for EIAM 1.0 and EIAM 2.0.</p>
     * @return ListEiamRegionsResponse
     */
    public ListEiamRegionsResponse listEiamRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEiamRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>View the event list.</p>
     * 
     * @param request ListEventTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEventTypesResponse
     */
    public ListEventTypesResponse listEventTypesWithOptions(ListEventTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListEventTypes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEventTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View the event list.</p>
     * 
     * @param request ListEventTypesRequest
     * @return ListEventTypesResponse
     */
    public ListEventTypesResponse listEventTypes(ListEventTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEventTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists federated identity providers.</p>
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
     * <p>Lists federated identity providers.</p>
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
     * <p>Performs a paged query to list the groups authorized to access an application. The response returns the group IDs. To obtain detailed information for a group, you can call the GetGroup operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Performs a paged query to list the groups authorized to access an application. The response returns the group IDs. To obtain detailed information for a group, you can call the GetGroup operation.</p>
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
     * <p>Lists the groups associated with an authorization rule.</p>
     * 
     * @param request ListGroupsForAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForAuthorizationRuleResponse
     */
    public ListGroupsForAuthorizationRuleResponse listGroupsForAuthorizationRuleWithOptions(ListGroupsForAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsForAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the groups associated with an authorization rule.</p>
     * 
     * @param request ListGroupsForAuthorizationRuleRequest
     * @return ListGroupsForAuthorizationRuleResponse
     */
    public ListGroupsForAuthorizationRuleResponse listGroupsForAuthorizationRule(ListGroupsForAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the scopes authorized for groups on a specified resource server. This operation supports cursor-based pagination.</p>
     * 
     * @param request ListGroupsForResourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForResourceServerResponse
     */
    public ListGroupsForResourceServerResponse listGroupsForResourceServerWithOptions(ListGroupsForResourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForResourceServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupsForResourceServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the scopes authorized for groups on a specified resource server. This operation supports cursor-based pagination.</p>
     * 
     * @param request ListGroupsForResourceServerRequest
     * @return ListGroupsForResourceServerResponse
     */
    public ListGroupsForResourceServerResponse listGroupsForResourceServer(ListGroupsForResourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupsForResourceServerWithOptions(request, runtime);
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
     * <p>Retrieves a list of identity providers.</p>
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
     * <p>Retrieves a list of identity providers.</p>
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
     * <p>Retrieves information about Identity Providers (IdPs) for a network endpoint.</p>
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
     * <p>Retrieves information about Identity Providers (IdPs) for a network endpoint.</p>
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
     * <p>Queries information about one or more Employee Identity and Access Management (EIAM) instances.</p>
     * 
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crossRegionReplication)) {
            query.put("CrossRegionReplication", request.crossRegionReplication);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edition)) {
            query.put("Edition", request.edition);
        }

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
     * <p>Queries information about one or more Employee Identity and Access Management (EIAM) instances.</p>
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
     * <p>Lists the available regions for creating network access endpoints in IDaaS EIAM.</p>
     * 
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
     * <p>Lists the available regions for creating network access endpoints in IDaaS EIAM.</p>
     * @return ListNetworkAccessEndpointAvailableRegionsResponse
     */
    public ListNetworkAccessEndpointAvailableRegionsResponse listNetworkAccessEndpointAvailableRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkAccessEndpointAvailableRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of zones that support the creation of network endpoints in a specified region for IDaaS EIAM.</p>
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
     * <p>Queries the list of zones that support the creation of network endpoints in a specified region for IDaaS EIAM.</p>
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
     * <p>Lists the network endpoints for an IDaaS EIAM instance.</p>
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
     * <p>Lists the network endpoints for an IDaaS EIAM instance.</p>
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
     * <p>Queries the list of access paths under a specified network access endpoint.</p>
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
     * <p>Queries the list of access paths under a specified network access endpoint.</p>
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
     * <p>Queries the list of network zone objects.</p>
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
     * <p>Queries the list of network zone objects.</p>
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
     * <p>Queries all parent organizational units of a specified EIAM organizational unit. The returned organizational units are sorted in hierarchical order from the highest level to the lowest level.</p>
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
     * <p>Queries all parent organizational units of a specified EIAM organizational unit. The returned organizational units are sorted in hierarchical order from the highest level to the lowest level.</p>
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
     * <p>Performs a paged query for EIAM organizational units.</p>
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
     * <p>Performs a paged query for EIAM organizational units.</p>
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
     * <p>Performs a paged query to list the organizations that are granted access to an application. The response returns the IDs of the organizations. To obtain detailed information about a specific organization, call the GetOrganizationalUnit operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Performs a paged query to list the organizations that are granted access to an application. The response returns the IDs of the organizations. To obtain detailed information about a specific organization, call the GetOrganizationalUnit operation.</p>
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
     * <p>Retrieves a cursor-paginated list of scopes that the current resource server has granted to an organization.</p>
     * 
     * @param request ListOrganizationalUnitsForResourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitsForResourceServerResponse
     */
    public ListOrganizationalUnitsForResourceServerResponse listOrganizationalUnitsForResourceServerWithOptions(ListOrganizationalUnitsForResourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnitsForResourceServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrganizationalUnitsForResourceServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a cursor-paginated list of scopes that the current resource server has granted to an organization.</p>
     * 
     * @param request ListOrganizationalUnitsForResourceServerRequest
     * @return ListOrganizationalUnitsForResourceServerResponse
     */
    public ListOrganizationalUnitsForResourceServerResponse listOrganizationalUnitsForResourceServer(ListOrganizationalUnitsForResourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrganizationalUnitsForResourceServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of supported Alibaba Cloud regions.</p>
     * 
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
     * <p>Queries a list of supported Alibaba Cloud regions.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of Scope permissions under a specified ResourceServer using cursor-based pagination.</p>
     * 
     * @param request ListResourceServerScopesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceServerScopesResponse
     */
    public ListResourceServerScopesResponse listResourceServerScopesWithOptions(ListResourceServerScopesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previousToken)) {
            query.put("PreviousToken", request.previousToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeName)) {
            query.put("ResourceServerScopeName", request.resourceServerScopeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeType)) {
            query.put("ResourceServerScopeType", request.resourceServerScopeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeValue)) {
            query.put("ResourceServerScopeValue", request.resourceServerScopeValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceServerScopes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceServerScopesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of Scope permissions under a specified ResourceServer using cursor-based pagination.</p>
     * 
     * @param request ListResourceServerScopesRequest
     * @return ListResourceServerScopesResponse
     */
    public ListResourceServerScopesResponse listResourceServerScopes(ListResourceServerScopesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceServerScopesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the ResourceServer and Scope permissions that are granted to the current user.</p>
     * 
     * @param request ListResourceServersForUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourceServersForUserResponse
     */
    public ListResourceServersForUserResponse listResourceServersForUserWithOptions(ListResourceServersForUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceServersForUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceServersForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Performs a paged query to retrieve the ResourceServer and Scope permissions that are granted to the current user.</p>
     * 
     * @param request ListResourceServersForUserRequest
     * @return ListResourceServersForUserResponse
     */
    public ListResourceServersForUserResponse listResourceServersForUser(ListResourceServersForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceServersForUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following two methods are supported for viewing returned data:</p>
     * <ul>
     * <li>Method 1: When querying the first page, you only need to set MaxResults to limit the number of entries returned. The NextToken in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken value obtained from the previous response as the query credential, and set MaxResults to limit the number of entries returned. If there are no more pages, NextToken is no longer returned. The maximum value of MaxResults is 100.</li>
     * <li>Method 2: Set the number of entries returned per page using PageSize, and set the page number using PageNumber.
     * You can only choose one of the above two methods. When a large number of entries are returned, Method 1 is recommended. If the MaxResults or NextToken parameter is set, the PageSize and PageNumber request parameters become invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the list of synchronization job details.</p>
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
     * <b>description</b> :
     * <p>The following two methods are supported for viewing returned data:</p>
     * <ul>
     * <li>Method 1: When querying the first page, you only need to set MaxResults to limit the number of entries returned. The NextToken in the response serves as the credential for querying subsequent pages. When querying subsequent pages, set the NextToken parameter to the NextToken value obtained from the previous response as the query credential, and set MaxResults to limit the number of entries returned. If there are no more pages, NextToken is no longer returned. The maximum value of MaxResults is 100.</li>
     * <li>Method 2: Set the number of entries returned per page using PageSize, and set the page number using PageNumber.
     * You can only choose one of the above two methods. When a large number of entries are returned, Method 1 is recommended. If the MaxResults or NextToken parameter is set, the PageSize and PageNumber request parameters become invalid.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the list of synchronization job details.</p>
     * 
     * @param request ListSynchronizationJobsRequest
     * @return ListSynchronizationJobsResponse
     */
    public ListSynchronizationJobsResponse listSynchronizationJobs(ListSynchronizationJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSynchronizationJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries only the applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the mappings for third-party logon accounts.</p>
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
     * <b>description</b> :
     * <p>This operation queries only the applications that are directly assigned to an organization. You can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the mappings for third-party logon accounts.</p>
     * 
     * @param request ListUserAuthnSourceMappingsRequest
     * @return ListUserAuthnSourceMappingsResponse
     */
    public ListUserAuthnSourceMappingsResponse listUserAuthnSourceMappings(ListUserAuthnSourceMappingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserAuthnSourceMappingsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API retrieves only applications directly assigned to an organization. Use the <strong>ApplicationIds</strong> parameter to filter applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of EIAM accounts.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
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
     * <b>description</b> :
     * <p>This API retrieves only applications directly assigned to an organization. Use the <strong>ApplicationIds</strong> parameter to filter applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves a paginated list of EIAM accounts.</p>
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
     * <p>Performs a paged query to list the accounts that have been granted access to an application. The response includes account IDs. To retrieve detailed information about an account, call the GetUser operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Performs a paged query to list the accounts that have been granted access to an application. The response includes account IDs. To retrieve detailed information about an account, call the GetUser operation.</p>
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
     * <p>Lists the accounts associated with an authorization rule.</p>
     * 
     * @param request ListUsersForAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForAuthorizationRuleResponse
     */
    public ListUsersForAuthorizationRuleResponse listUsersForAuthorizationRuleWithOptions(ListUsersForAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersForAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the accounts associated with an authorization rule.</p>
     * 
     * @param request ListUsersForAuthorizationRuleRequest
     * @return ListUsersForAuthorizationRuleResponse
     */
    public ListUsersForAuthorizationRuleResponse listUsersForAuthorizationRule(ListUsersForAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the users in a specified EIAM account group.</p>
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
     * <p>Lists the users in a specified EIAM account group.</p>
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
     * <p>List the scope permissions granted by a Resource Server to user accounts using cursor-based pagination.</p>
     * 
     * @param request ListUsersForResourceServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForResourceServerResponse
     */
    public ListUsersForResourceServerResponse listUsersForResourceServerWithOptions(ListUsersForResourceServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForResourceServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersForResourceServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List the scope permissions granted by a Resource Server to user accounts using cursor-based pagination.</p>
     * 
     * @param request ListUsersForResourceServerRequest
     * @return ListUsersForResourceServerResponse
     */
    public ListUsersForResourceServerResponse listUsersForResourceServer(ListUsersForResourceServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersForResourceServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the client secret for an EIAM application. The secret is returned without desensitization. To obtain a desensitized secret, call the ListApplicationClientSecrets operation.</p>
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
     * <p>Obtains the client secret for an EIAM application. The secret is returned without desensitization. To obtain a desensitized secret, call the ListApplicationClientSecrets operation.</p>
     * 
     * @param request ObtainApplicationClientSecretRequest
     * @return ObtainApplicationClientSecretResponse
     */
    public ObtainApplicationClientSecretResponse obtainApplicationClientSecret(ObtainApplicationClientSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainApplicationClientSecretWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you disable an application, all its features, such as single sign-on (SSO) and account synchronization, become unavailable. Ensure that you understand the potential threats of this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token of a specified application.</p>
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
     * <b>description</b> :
     * <p>When you disable an application, all its features, such as single sign-on (SSO) and account synchronization, become unavailable. Ensure that you understand the potential threats of this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the token of a specified application.</p>
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
     * <p>Retrieves a credential containing sensitive information.</p>
     * 
     * @param request ObtainCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainCredentialResponse
     */
    public ObtainCredentialResponse obtainCredentialWithOptions(ObtainCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ObtainCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves a credential containing sensitive information.</p>
     * 
     * @param request ObtainCredentialRequest
     * @return ObtainCredentialResponse
     */
    public ObtainCredentialResponse obtainCredential(ObtainCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the proxy token for a domain name in an EIAM instance.</p>
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
     * <p>Obtains the proxy token for a domain name in an EIAM instance.</p>
     * 
     * @param request ObtainDomainProxyTokenRequest
     * @return ObtainDomainProxyTokenResponse
     */
    public ObtainDomainProxyTokenResponse obtainDomainProxyToken(ObtainDomainProxyTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.obtainDomainProxyTokenWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries only applications that are directly assigned to an organization. When you call this operation, you can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the application account of a specified user from an application.</p>
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
     * <b>description</b> :
     * <p>This operation queries only applications that are directly assigned to an organization. When you call this operation, you can use the <strong>ApplicationIds</strong> parameter to filter the applications.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the application account of a specified user from an application.</p>
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
     * <p>Removes an application from an authorization rule.</p>
     * 
     * @param request RemoveApplicationFromAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveApplicationFromAuthorizationRuleResponse
     */
    public RemoveApplicationFromAuthorizationRuleResponse removeApplicationFromAuthorizationRuleWithOptions(RemoveApplicationFromAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveApplicationFromAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveApplicationFromAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an application from an authorization rule.</p>
     * 
     * @param request RemoveApplicationFromAuthorizationRuleRequest
     * @return RemoveApplicationFromAuthorizationRuleResponse
     */
    public RemoveApplicationFromAuthorizationRuleResponse removeApplicationFromAuthorizationRule(RemoveApplicationFromAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeApplicationFromAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes custom terms associated with a brand.</p>
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
     * <p>Removes custom terms associated with a brand.</p>
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
     * <p>Removes an application from an authorization rule.</p>
     * 
     * @param request RemoveGroupFromAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveGroupFromAuthorizationRuleResponse
     */
    public RemoveGroupFromAuthorizationRuleResponse removeGroupFromAuthorizationRuleWithOptions(RemoveGroupFromAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
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
            new TeaPair("action", "RemoveGroupFromAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveGroupFromAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an application from an authorization rule.</p>
     * 
     * @param request RemoveGroupFromAuthorizationRuleRequest
     * @return RemoveGroupFromAuthorizationRuleResponse
     */
    public RemoveGroupFromAuthorizationRuleResponse removeGroupFromAuthorizationRule(RemoveGroupFromAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeGroupFromAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an account from an authorization rule.</p>
     * 
     * @param request RemoveUserFromAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromAuthorizationRuleResponse
     */
    public RemoveUserFromAuthorizationRuleResponse removeUserFromAuthorizationRuleWithOptions(RemoveUserFromAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
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
            new TeaPair("action", "RemoveUserFromAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUserFromAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes an account from an authorization rule.</p>
     * 
     * @param request RemoveUserFromAuthorizationRuleRequest
     * @return RemoveUserFromAuthorizationRuleResponse
     */
    public RemoveUserFromAuthorizationRuleResponse removeUserFromAuthorizationRule(RemoveUserFromAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUserFromAuthorizationRuleWithOptions(request, runtime);
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
     * <p>Renews a Free Edition instance.</p>
     * 
     * @param request RenewFreeLicenseEndTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewFreeLicenseEndTimeResponse
     */
    public RenewFreeLicenseEndTimeResponse renewFreeLicenseEndTimeWithOptions(RenewFreeLicenseEndTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewFreeLicenseEndTime"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewFreeLicenseEndTimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a Free Edition instance.</p>
     * 
     * @param request RenewFreeLicenseEndTimeRequest
     * @return RenewFreeLicenseEndTimeResponse
     */
    public RenewFreeLicenseEndTimeResponse renewFreeLicenseEndTime(RenewFreeLicenseEndTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewFreeLicenseEndTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes application access from multiple EIAM groups in a batch.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Revokes application access from multiple EIAM groups in a batch.</p>
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
     * <p>Revokes application access from multiple EIAM organizations in a batch operation.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Revokes application access from multiple EIAM organizations in a batch operation.</p>
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
     * <p>Revokes access to an application from multiple EIAM accounts.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
     * <p>Revokes access to an application from multiple EIAM accounts.</p>
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
     * <p>Revokes the authorization for a resource server from a client application.</p>
     * 
     * @param request RevokeResourceServerFromClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourceServerFromClientResponse
     */
    public RevokeResourceServerFromClientResponse revokeResourceServerFromClientWithOptions(RevokeResourceServerFromClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientApplicationId)) {
            query.put("ClientApplicationId", request.clientApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerApplicationId)) {
            query.put("ResourceServerApplicationId", request.resourceServerApplicationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourceServerFromClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourceServerFromClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes the authorization for a resource server from a client application.</p>
     * 
     * @param request RevokeResourceServerFromClientRequest
     * @return RevokeResourceServerFromClientResponse
     */
    public RevokeResourceServerFromClientResponse revokeResourceServerFromClient(RevokeResourceServerFromClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourceServerFromClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes specified scope permissions of a resource server from a client application.</p>
     * 
     * @param request RevokeResourceServerScopesFromClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourceServerScopesFromClientResponse
     */
    public RevokeResourceServerScopesFromClientResponse revokeResourceServerScopesFromClientWithOptions(RevokeResourceServerScopesFromClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientApplicationId)) {
            query.put("ClientApplicationId", request.clientApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerApplicationId)) {
            query.put("ResourceServerApplicationId", request.resourceServerApplicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourceServerScopesFromClient"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourceServerScopesFromClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes specified scope permissions of a resource server from a client application.</p>
     * 
     * @param request RevokeResourceServerScopesFromClientRequest
     * @return RevokeResourceServerScopesFromClientResponse
     */
    public RevokeResourceServerScopesFromClientResponse revokeResourceServerScopesFromClient(RevokeResourceServerScopesFromClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourceServerScopesFromClientWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a resource server\&quot;s scope permissions from a group.</p>
     * 
     * @param request RevokeResourceServerScopesFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourceServerScopesFromGroupResponse
     */
    public RevokeResourceServerScopesFromGroupResponse revokeResourceServerScopesFromGroupWithOptions(RevokeResourceServerScopesFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourceServerScopesFromGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourceServerScopesFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes a resource server\&quot;s scope permissions from a group.</p>
     * 
     * @param request RevokeResourceServerScopesFromGroupRequest
     * @return RevokeResourceServerScopesFromGroupResponse
     */
    public RevokeResourceServerScopesFromGroupResponse revokeResourceServerScopesFromGroup(RevokeResourceServerScopesFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourceServerScopesFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes scope permissions for a resource server from an organization.</p>
     * 
     * @param request RevokeResourceServerScopesFromOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourceServerScopesFromOrganizationalUnitResponse
     */
    public RevokeResourceServerScopesFromOrganizationalUnitResponse revokeResourceServerScopesFromOrganizationalUnitWithOptions(RevokeResourceServerScopesFromOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("OrganizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourceServerScopesFromOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourceServerScopesFromOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes scope permissions for a resource server from an organization.</p>
     * 
     * @param request RevokeResourceServerScopesFromOrganizationalUnitRequest
     * @return RevokeResourceServerScopesFromOrganizationalUnitResponse
     */
    public RevokeResourceServerScopesFromOrganizationalUnitResponse revokeResourceServerScopesFromOrganizationalUnit(RevokeResourceServerScopesFromOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourceServerScopesFromOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes scope permissions for a specified resource server from an account.</p>
     * 
     * @param request RevokeResourceServerScopesFromUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeResourceServerScopesFromUserResponse
     */
    public RevokeResourceServerScopesFromUserResponse revokeResourceServerScopesFromUserWithOptions(RevokeResourceServerScopesFromUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeIds)) {
            query.put("ResourceServerScopeIds", request.resourceServerScopeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeResourceServerScopesFromUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeResourceServerScopesFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes scope permissions for a specified resource server from an account.</p>
     * 
     * @param request RevokeResourceServerScopesFromUserRequest
     * @return RevokeResourceServerScopesFromUserResponse
     */
    public RevokeResourceServerScopesFromUserResponse revokeResourceServerScopesFromUser(RevokeResourceServerScopesFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeResourceServerScopesFromUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and immediately runs a new synchronization task.</p>
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
     * <p>Creates and immediately runs a new synchronization task.</p>
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
     * <p>Sets the account synchronization configuration for an EIAM application.</p>
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
     * <p>Sets the account synchronization configuration for an EIAM application.</p>
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
     * <b>summary</b> : 
     * <p>Sets the primary organizational unit for an application\&quot;s user provisioning.</p>
     * 
     * @param request SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userPrimaryOrganizationalUnitId)) {
            query.put("UserPrimaryOrganizationalUnitId", request.userPrimaryOrganizationalUnitId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationProvisioningUserPrimaryOrganizationalUnit"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the primary organizational unit for an application\&quot;s user provisioning.</p>
     * 
     * @param request SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest
     * @return SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse
     */
    public SetApplicationProvisioningUserPrimaryOrganizationalUnitResponse setApplicationProvisioningUserPrimaryOrganizationalUnit(SetApplicationProvisioningUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationProvisioningUserPrimaryOrganizationalUnitWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the unique identifier for a resource server. This identifier is used as the aud (audience) claim in a JSON Web Token (JWT) to specify the service that is intended to accept the token.</p>
     * 
     * @param request SetApplicationResourceServerIdentifierRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetApplicationResourceServerIdentifierResponse
     */
    public SetApplicationResourceServerIdentifierResponse setApplicationResourceServerIdentifierWithOptions(SetApplicationResourceServerIdentifierRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerIdentifier)) {
            query.put("ResourceServerIdentifier", request.resourceServerIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetApplicationResourceServerIdentifier"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetApplicationResourceServerIdentifierResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the unique identifier for a resource server. This identifier is used as the aud (audience) claim in a JSON Web Token (JWT) to specify the service that is intended to accept the token.</p>
     * 
     * @param request SetApplicationResourceServerIdentifierRequest
     * @return SetApplicationResourceServerIdentifierResponse
     */
    public SetApplicationResourceServerIdentifierResponse setApplicationResourceServerIdentifier(SetApplicationResourceServerIdentifierRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setApplicationResourceServerIdentifierWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In IDaaS, the Application Management feature lets you add applications that use various SSO protocols, such as SAML 2.0 and OpenID Connect (OIDC). However, each application can support only one SSO protocol. The protocol is specified during application creation and cannot be changed afterward. You must configure the SSO parameters according to the protocol that your application uses.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the single sign-on (SSO) properties for an IDaaS application.</p>
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
     * <p>In IDaaS, the Application Management feature lets you add applications that use various SSO protocols, such as SAML 2.0 and OpenID Connect (OIDC). However, each application can support only one SSO protocol. The protocol is specified during application creation and cannot be changed afterward. You must configure the SSO parameters according to the protocol that your application uses.</p>
     * 
     * <b>summary</b> : 
     * <p>Sets the single sign-on (SSO) properties for an IDaaS application.</p>
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
     * <p>Sets the default domain name for a specified EIAM instance.</p>
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
     * <p>Sets the default domain name for a specified EIAM instance.</p>
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
     * <p>Sets the forgot password policy for an EIAM instance.</p>
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
     * <p>Sets the forgot password policy for an EIAM instance.</p>
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
     * <p>Update authentication information</p>
     * 
     * @param request SetIdentityProviderAuthnConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdentityProviderAuthnConfigurationResponse
     */
    public SetIdentityProviderAuthnConfigurationResponse setIdentityProviderAuthnConfigurationWithOptions(SetIdentityProviderAuthnConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCreateUserConfig)) {
            query.put("AutoCreateUserConfig", request.autoCreateUserConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUpdateUserConfig)) {
            query.put("AutoUpdateUserConfig", request.autoUpdateUserConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bindingConfig)) {
            query.put("BindingConfig", request.bindingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ldapAuthnConfig)) {
            query.put("LdapAuthnConfig", request.ldapAuthnConfig);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdentityProviderAuthnConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdentityProviderAuthnConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update authentication information</p>
     * 
     * @param request SetIdentityProviderAuthnConfigurationRequest
     * @return SetIdentityProviderAuthnConfigurationResponse
     */
    public SetIdentityProviderAuthnConfigurationResponse setIdentityProviderAuthnConfiguration(SetIdentityProviderAuthnConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdentityProviderAuthnConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the inbound synchronization configuration for an IdP.</p>
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
     * <p>Sets the inbound synchronization configuration for an IdP.</p>
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
     * <p>Modifies the push configuration for an identity provider (IdP).</p>
     * 
     * @param request SetIdentityProviderUdPushConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetIdentityProviderUdPushConfigurationResponse
     */
    public SetIdentityProviderUdPushConfigurationResponse setIdentityProviderUdPushConfigurationWithOptions(SetIdentityProviderUdPushConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identityProviderId)) {
            query.put("IdentityProviderId", request.identityProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementalCallbackStatus)) {
            query.put("IncrementalCallbackStatus", request.incrementalCallbackStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ldapUdPushConfig)) {
            query.put("LdapUdPushConfig", request.ldapUdPushConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodicSyncConfig)) {
            query.put("PeriodicSyncConfig", request.periodicSyncConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodicSyncStatus)) {
            query.put("PeriodicSyncStatus", request.periodicSyncStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.udSyncScopeConfigs)) {
            query.put("UdSyncScopeConfigs", request.udSyncScopeConfigs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetIdentityProviderUdPushConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetIdentityProviderUdPushConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the push configuration for an identity provider (IdP).</p>
     * 
     * @param request SetIdentityProviderUdPushConfigurationRequest
     * @return SetIdentityProviderUdPushConfigurationResponse
     */
    public SetIdentityProviderUdPushConfigurationResponse setIdentityProviderUdPushConfiguration(SetIdentityProviderUdPushConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setIdentityProviderUdPushConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the control elements of an instance.</p>
     * 
     * @param request SetInstanceControlConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstanceControlConfigurationResponse
     */
    public SetInstanceControlConfigurationResponse setInstanceControlConfigurationWithOptions(SetInstanceControlConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.controlElements)) {
            query.put("ControlElements", request.controlElements);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceControlConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceControlConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the control elements of an instance.</p>
     * 
     * @param request SetInstanceControlConfigurationRequest
     * @return SetInstanceControlConfigurationResponse
     */
    public SetInstanceControlConfigurationResponse setInstanceControlConfiguration(SetInstanceControlConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceControlConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the language and time zone information for an instance.</p>
     * 
     * @param request SetInstanceGlobalizationConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetInstanceGlobalizationConfigResponse
     */
    public SetInstanceGlobalizationConfigResponse setInstanceGlobalizationConfigWithOptions(SetInstanceGlobalizationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZone)) {
            query.put("TimeZone", request.timeZone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetInstanceGlobalizationConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetInstanceGlobalizationConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the language and time zone information for an instance.</p>
     * 
     * @param request SetInstanceGlobalizationConfigRequest
     * @return SetInstanceGlobalizationConfigResponse
     */
    public SetInstanceGlobalizationConfigResponse setInstanceGlobalizationConfig(SetInstanceGlobalizationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setInstanceGlobalizationConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Set login redirect application for brand</p>
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
     * <p>Set login redirect application for brand</p>
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
     * <p>Sets the password complexity policy for a specified EIAM instance.</p>
     * 
     * @param request SetPasswordComplexityConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPasswordComplexityConfigurationResponse
     */
    public SetPasswordComplexityConfigurationResponse setPasswordComplexityConfigurationWithOptions(SetPasswordComplexityConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.disabledWeakPasswordLogin)) {
            query.put("DisabledWeakPasswordLogin", request.disabledWeakPasswordLogin);
        }

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
     * <p>Sets the password complexity policy for a specified EIAM instance.</p>
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
     * <p>Sets the password expiration policy for a specified Enterprise Identity and Access Management (EIAM) instance.</p>
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
     * <p>Sets the password expiration policy for a specified Enterprise Identity and Access Management (EIAM) instance.</p>
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
     * <p>Sets the password history policy for a specified Enterprise Identity and Access Management (EIAM) instance.</p>
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
     * <p>Sets the password history policy for a specified Enterprise Identity and Access Management (EIAM) instance.</p>
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
     * <p>Sets the password initialization policy for a specified EIAM instance.</p>
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
     * <p>Sets the password initialization policy for a specified EIAM instance.</p>
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
     * <p>Sets the specified client public key as the primary key for an application.</p>
     * 
     * @param request SetPrimaryClientPublicKeyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPrimaryClientPublicKeyResponse
     */
    public SetPrimaryClientPublicKeyResponse setPrimaryClientPublicKeyWithOptions(SetPrimaryClientPublicKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientPublicKeyId)) {
            query.put("ClientPublicKeyId", request.clientPublicKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPrimaryClientPublicKey"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPrimaryClientPublicKeyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the specified client public key as the primary key for an application.</p>
     * 
     * @param request SetPrimaryClientPublicKeyRequest
     * @return SetPrimaryClientPublicKeyResponse
     */
    public SetPrimaryClientPublicKeyResponse setPrimaryClientPublicKey(SetPrimaryClientPublicKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPrimaryClientPublicKeyWithOptions(request, runtime);
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
     * <p>Sets the WebAuthn configuration.</p>
     * 
     * @param request SetWebAuthnConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetWebAuthnConfigurationResponse
     */
    public SetWebAuthnConfigurationResponse setWebAuthnConfigurationWithOptions(SetWebAuthnConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aaguids)) {
            query.put("Aaguids", request.aaguids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAaguidVerification)) {
            query.put("EnableAaguidVerification", request.enableAaguidVerification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableMetadataServiceVerification)) {
            query.put("EnableMetadataServiceVerification", request.enableMetadataServiceVerification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableUserSelfRegistration)) {
            query.put("EnableUserSelfRegistration", request.enableUserSelfRegistration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetWebAuthnConfiguration"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetWebAuthnConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the WebAuthn configuration.</p>
     * 
     * @param request SetWebAuthnConfigurationRequest
     * @return SetWebAuthnConfigurationResponse
     */
    public SetWebAuthnConfigurationResponse setWebAuthnConfiguration(SetWebAuthnConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setWebAuthnConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches the TOTP authenticator for a specified user.</p>
     * 
     * @param request UnbindTotpAuthenticatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindTotpAuthenticatorResponse
     */
    public UnbindTotpAuthenticatorResponse unbindTotpAuthenticatorWithOptions(UnbindTotpAuthenticatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UnbindTotpAuthenticator"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindTotpAuthenticatorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches the TOTP authenticator for a specified user.</p>
     * 
     * @param request UnbindTotpAuthenticatorRequest
     * @return UnbindTotpAuthenticatorResponse
     */
    public UnbindTotpAuthenticatorResponse unbindTotpAuthenticator(UnbindTotpAuthenticatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindTotpAuthenticatorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a third-party logon account from a user.</p>
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
     * <p>Unbinds a third-party logon account from a user.</p>
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
     * <p>Updates the advanced configuration of an application.</p>
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
     * <p>Updates the advanced configuration of an application.</p>
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
     * <p>Updates the expiration time of a specified client secret for an application.</p>
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
     * <p>Updates the expiration time of a specified client secret for an application.</p>
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
     * <p>Updates an application\&quot;s federated credential.</p>
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
     * <p>Updates an application\&quot;s federated credential.</p>
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
     * <p>Updates the description of a federated credential for an application.</p>
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
     * <p>Updates the description of a federated credential for an application.</p>
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
     * <p>Updates the basic information for an application.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.applicationOwner)) {
            query.put("ApplicationOwner", request.applicationOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationVisibility)) {
            query.put("ApplicationVisibility", request.applicationVisibility);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            query.put("CustomFields", request.customFields);
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
     * <p>Updates the basic information for an application.</p>
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
     * <p>Updates an application role.</p>
     * 
     * @param request UpdateApplicationRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationRoleResponse
     */
    public UpdateApplicationRoleResponse updateApplicationRoleWithOptions(UpdateApplicationRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleName)) {
            query.put("ApplicationRoleName", request.applicationRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApplicationRole"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates an application role.</p>
     * 
     * @param request UpdateApplicationRoleRequest
     * @return UpdateApplicationRoleResponse
     */
    public UpdateApplicationRoleResponse updateApplicationRole(UpdateApplicationRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an application role.</p>
     * 
     * @param request UpdateApplicationRoleDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApplicationRoleDescriptionResponse
     */
    public UpdateApplicationRoleDescriptionResponse updateApplicationRoleDescriptionWithOptions(UpdateApplicationRoleDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applicationRoleId)) {
            query.put("ApplicationRoleId", request.applicationRoleId);
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
            new TeaPair("action", "UpdateApplicationRoleDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApplicationRoleDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an application role.</p>
     * 
     * @param request UpdateApplicationRoleDescriptionRequest
     * @return UpdateApplicationRoleDescriptionResponse
     */
    public UpdateApplicationRoleDescriptionResponse updateApplicationRoleDescription(UpdateApplicationRoleDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApplicationRoleDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the single sign-on (SSO) parameters for an application template from the marketplace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the SSO parameters for an application template.</p>
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
     * <b>description</b> :
     * <p>Updates the single sign-on (SSO) parameters for an application template from the marketplace.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the SSO parameters for an application template.</p>
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
     * <p>Updates the expiration time of an application token.</p>
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
     * <p>Updates the expiration time of an application token.</p>
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
     * <p>Updates the basic properties of an authorization rule.</p>
     * 
     * @param request UpdateAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleResponse
     */
    public UpdateAuthorizationRuleResponse updateAuthorizationRuleWithOptions(UpdateAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationResourceScope)) {
            query.put("AuthorizationResourceScope", request.authorizationResourceScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleName)) {
            query.put("AuthorizationRuleName", request.authorizationRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRule"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic properties of an authorization rule.</p>
     * 
     * @param request UpdateAuthorizationRuleRequest
     * @return UpdateAuthorizationRuleResponse
     */
    public UpdateAuthorizationRuleResponse updateAuthorizationRule(UpdateAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of the relationship between an authorization rule and an application.</p>
     * 
     * @param request UpdateAuthorizationRuleApplicationAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleApplicationAttachmentResponse
     */
    public UpdateAuthorizationRuleApplicationAttachmentResponse updateAuthorizationRuleApplicationAttachmentWithOptions(UpdateAuthorizationRuleApplicationAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRuleApplicationAttachment"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleApplicationAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the properties of the relationship between an authorization rule and an application.</p>
     * 
     * @param request UpdateAuthorizationRuleApplicationAttachmentRequest
     * @return UpdateAuthorizationRuleApplicationAttachmentResponse
     */
    public UpdateAuthorizationRuleApplicationAttachmentResponse updateAuthorizationRuleApplicationAttachment(UpdateAuthorizationRuleApplicationAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleApplicationAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an authorization rule.</p>
     * 
     * @param request UpdateAuthorizationRuleDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleDescriptionResponse
     */
    public UpdateAuthorizationRuleDescriptionResponse updateAuthorizationRuleDescriptionWithOptions(UpdateAuthorizationRuleDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRuleDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an authorization rule.</p>
     * 
     * @param request UpdateAuthorizationRuleDescriptionRequest
     * @return UpdateAuthorizationRuleDescriptionResponse
     */
    public UpdateAuthorizationRuleDescriptionResponse updateAuthorizationRuleDescription(UpdateAuthorizationRuleDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the relationship properties between an authorization rule and a group.</p>
     * 
     * @param request UpdateAuthorizationRuleGroupAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleGroupAttachmentResponse
     */
    public UpdateAuthorizationRuleGroupAttachmentResponse updateAuthorizationRuleGroupAttachmentWithOptions(UpdateAuthorizationRuleGroupAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRuleGroupAttachment"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleGroupAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the relationship properties between an authorization rule and a group.</p>
     * 
     * @param request UpdateAuthorizationRuleGroupAttachmentRequest
     * @return UpdateAuthorizationRuleGroupAttachmentResponse
     */
    public UpdateAuthorizationRuleGroupAttachmentResponse updateAuthorizationRuleGroupAttachment(UpdateAuthorizationRuleGroupAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleGroupAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the relationship properties between an authorization rule and an account.</p>
     * 
     * @param request UpdateAuthorizationRuleUserAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleUserAttachmentResponse
     */
    public UpdateAuthorizationRuleUserAttachmentResponse updateAuthorizationRuleUserAttachmentWithOptions(UpdateAuthorizationRuleUserAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityPeriod)) {
            query.put("ValidityPeriod", request.validityPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.validityType)) {
            query.put("ValidityType", request.validityType);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRuleUserAttachment"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleUserAttachmentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the relationship properties between an authorization rule and an account.</p>
     * 
     * @param request UpdateAuthorizationRuleUserAttachmentRequest
     * @return UpdateAuthorizationRuleUserAttachmentResponse
     */
    public UpdateAuthorizationRuleUserAttachmentResponse updateAuthorizationRuleUserAttachment(UpdateAuthorizationRuleUserAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleUserAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an authorization server.</p>
     * 
     * @param request UpdateAuthorizationServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationServerResponse
     */
    public UpdateAuthorizationServerResponse updateAuthorizationServerWithOptions(UpdateAuthorizationServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationServerId)) {
            query.put("AuthorizationServerId", request.authorizationServerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizationServerName)) {
            query.put("AuthorizationServerName", request.authorizationServerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuerDomain)) {
            query.put("IssuerDomain", request.issuerDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.issuerMode)) {
            query.put("IssuerMode", request.issuerMode);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationServer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the configuration of an authorization server.</p>
     * 
     * @param request UpdateAuthorizationServerRequest
     * @return UpdateAuthorizationServerResponse
     */
    public UpdateAuthorizationServerResponse updateAuthorizationServer(UpdateAuthorizationServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an authorization server.</p>
     * 
     * @param request UpdateAuthorizationServerDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationServerDescriptionResponse
     */
    public UpdateAuthorizationServerDescriptionResponse updateAuthorizationServerDescriptionWithOptions(UpdateAuthorizationServerDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationServerId)) {
            query.put("AuthorizationServerId", request.authorizationServerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationServerDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationServerDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an authorization server.</p>
     * 
     * @param request UpdateAuthorizationServerDescriptionRequest
     * @return UpdateAuthorizationServerDescriptionResponse
     */
    public UpdateAuthorizationServerDescriptionResponse updateAuthorizationServerDescription(UpdateAuthorizationServerDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationServerDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a brand.</p>
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
     * <p>Modifies a brand.</p>
     * 
     * @param request UpdateBrandRequest
     * @return UpdateBrandResponse
     */
    public UpdateBrandResponse updateBrand(UpdateBrandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBrandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information of an Alibaba Cloud account.</p>
     * 
     * @param request UpdateCloudAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudAccountResponse
     */
    public UpdateCloudAccountResponse updateCloudAccountWithOptions(UpdateCloudAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountName)) {
            query.put("CloudAccountName", request.cloudAccountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCloudAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudAccountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information of an Alibaba Cloud account.</p>
     * 
     * @param request UpdateCloudAccountRequest
     * @return UpdateCloudAccountResponse
     */
    public UpdateCloudAccountResponse updateCloudAccount(UpdateCloudAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an Alibaba Cloud account.</p>
     * 
     * @param request UpdateCloudAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudAccountDescriptionResponse
     */
    public UpdateCloudAccountDescriptionResponse updateCloudAccountDescriptionWithOptions(UpdateCloudAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
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
            new TeaPair("action", "UpdateCloudAccountDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudAccountDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of an Alibaba Cloud account.</p>
     * 
     * @param request UpdateCloudAccountDescriptionRequest
     * @return UpdateCloudAccountDescriptionResponse
     */
    public UpdateCloudAccountDescriptionResponse updateCloudAccountDescription(UpdateCloudAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of a cloud role.</p>
     * 
     * @param request UpdateCloudAccountRoleDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCloudAccountRoleDescriptionResponse
     */
    public UpdateCloudAccountRoleDescriptionResponse updateCloudAccountRoleDescriptionWithOptions(UpdateCloudAccountRoleDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountId)) {
            query.put("CloudAccountId", request.cloudAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleId)) {
            query.put("CloudAccountRoleId", request.cloudAccountRoleId);
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
            new TeaPair("action", "UpdateCloudAccountRoleDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCloudAccountRoleDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the description of a cloud role.</p>
     * 
     * @param request UpdateCloudAccountRoleDescriptionRequest
     * @return UpdateCloudAccountRoleDescriptionResponse
     */
    public UpdateCloudAccountRoleDescriptionResponse updateCloudAccountRoleDescription(UpdateCloudAccountRoleDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCloudAccountRoleDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a conditional access policy.</p>
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
     * <p>Updates a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a conditional access policy.</p>
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
     * <p>Updates the description of a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a conditional access policy.</p>
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
     * <p>Updates the description of a conditional access policy.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the description of a conditional access policy.</p>
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
     * <p>Update basic information for a credential.</p>
     * 
     * @param request UpdateCredentialRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredentialWithOptions(UpdateCredentialRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialContent)) {
            query.put("CredentialContent", request.credentialContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialName)) {
            query.put("CredentialName", request.credentialName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredential"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update basic information for a credential.</p>
     * 
     * @param request UpdateCredentialRequest
     * @return UpdateCredentialResponse
     */
    public UpdateCredentialResponse updateCredential(UpdateCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the description of a credential.</p>
     * 
     * @param request UpdateCredentialDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialDescriptionResponse
     */
    public UpdateCredentialDescriptionResponse updateCredentialDescriptionWithOptions(UpdateCredentialDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialId)) {
            query.put("CredentialId", request.credentialId);
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
            new TeaPair("action", "UpdateCredentialDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the description of a credential.</p>
     * 
     * @param request UpdateCredentialDescriptionRequest
     * @return UpdateCredentialDescriptionResponse
     */
    public UpdateCredentialDescriptionResponse updateCredentialDescription(UpdateCredentialDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a credential provider.</p>
     * 
     * @param request UpdateCredentialProviderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialProviderResponse
     */
    public UpdateCredentialProviderResponse updateCredentialProviderWithOptions(UpdateCredentialProviderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderConfig)) {
            query.put("CredentialProviderConfig", request.credentialProviderConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderName)) {
            query.put("CredentialProviderName", request.credentialProviderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCredentialProvider"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialProviderResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a credential provider.</p>
     * 
     * @param request UpdateCredentialProviderRequest
     * @return UpdateCredentialProviderResponse
     */
    public UpdateCredentialProviderResponse updateCredentialProvider(UpdateCredentialProviderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialProviderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update the description of a credential provider.</p>
     * 
     * @param request UpdateCredentialProviderDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCredentialProviderDescriptionResponse
     */
    public UpdateCredentialProviderDescriptionResponse updateCredentialProviderDescriptionWithOptions(UpdateCredentialProviderDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialProviderId)) {
            query.put("CredentialProviderId", request.credentialProviderId);
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
            new TeaPair("action", "UpdateCredentialProviderDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCredentialProviderDescriptionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update the description of a credential provider.</p>
     * 
     * @param request UpdateCredentialProviderDescriptionRequest
     * @return UpdateCredentialProviderDescriptionResponse
     */
    public UpdateCredentialProviderDescriptionResponse updateCredentialProviderDescription(UpdateCredentialProviderDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCredentialProviderDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a custom privacy policy.</p>
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
     * <p>Updates a custom privacy policy.</p>
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
     * <p>Updates the brand associated with a domain name.</p>
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
     * <p>Updates the brand associated with a domain name.</p>
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
     * <p>Updates the ICP filing number of a domain.</p>
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
     * <p>Updates the ICP filing number of a domain.</p>
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
     * <p>Updates a federated credential provider.</p>
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
     * <p>Updates a federated credential provider.</p>
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
     * <p>Updates the description of a federated credential provider.</p>
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
     * <p>Updates the description of a federated credential provider.</p>
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
     * <p>Updates the basic configuration of an identity provider.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.samlConfig)) {
            query.put("SamlConfig", request.samlConfig);
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
     * <p>Updates the basic configuration of an identity provider.</p>
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
     * <p>Modifies the description of a specified EIAM instance.</p>
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
     * <p>Modifies the description of a specified EIAM instance.</p>
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
     * <p>Modifies the name of a private network access endpoint.</p>
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
     * <p>Modifies the name of a private network access endpoint.</p>
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
     * <p>Updates a network zone object.</p>
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
     * <p>Updates a network zone object.</p>
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
     * <p>Updates the description of a network zone.</p>
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
     * <p>Updates the description of a network zone.</p>
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
     * <p>Updates a scope permission for a specified resource server.</p>
     * 
     * @param request UpdateResourceServerScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateResourceServerScopeResponse
     */
    public UpdateResourceServerScopeResponse updateResourceServerScopeWithOptions(UpdateResourceServerScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.applicationId)) {
            query.put("ApplicationId", request.applicationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeId)) {
            query.put("ResourceServerScopeId", request.resourceServerScopeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceServerScopeName)) {
            query.put("ResourceServerScopeName", request.resourceServerScopeName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateResourceServerScope"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateResourceServerScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a scope permission for a specified resource server.</p>
     * 
     * @param request UpdateResourceServerScopeRequest
     * @return UpdateResourceServerScopeResponse
     */
    public UpdateResourceServerScopeResponse updateResourceServerScope(UpdateResourceServerScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceServerScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the basic information of an EIAM account.</p>
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
     * <p>Updates the basic information of an EIAM account.</p>
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
     * <p>Updates a user\&quot;s description.</p>
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
     * <p>Updates a user\&quot;s description.</p>
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
