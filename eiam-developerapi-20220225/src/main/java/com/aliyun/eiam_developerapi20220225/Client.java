// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225;

import com.aliyun.tea.*;
import com.aliyun.eiam_developerapi20220225.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eiam-developerapi", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>将账户加入多个组织</p>
     * 
     * @param request AddUserToOrganizationalUnitsRequest
     * @param headers AddUserToOrganizationalUnitsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUserToOrganizationalUnitsResponse
     */
    public AddUserToOrganizationalUnitsResponse addUserToOrganizationalUnitsWithOptions(String instanceId, String applicationId, String userId, AddUserToOrganizationalUnitsRequest request, AddUserToOrganizationalUnitsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            body.put("organizationalUnitIds", request.organizationalUnitIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUserToOrganizationalUnits"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/addUserToOrganizationalUnits"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new AddUserToOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将账户加入多个组织</p>
     * 
     * @param request AddUserToOrganizationalUnitsRequest
     * @return AddUserToOrganizationalUnitsResponse
     */
    public AddUserToOrganizationalUnitsResponse addUserToOrganizationalUnits(String instanceId, String applicationId, String userId, AddUserToOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddUserToOrganizationalUnitsHeaders headers = new AddUserToOrganizationalUnitsHeaders();
        return this.addUserToOrganizationalUnitsWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple Employee Identity and Access Management (EIAM) accounts to an EIAM group. If the accounts are already added to the specified group, no update is performed.</p>
     * 
     * @param request AddUsersToGroupRequest
     * @param headers AddUsersToGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroupWithOptions(String instanceId, String applicationId, String groupId, AddUsersToGroupRequest request, AddUsersToGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUsersToGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/actions/addUsersToGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new AddUsersToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds multiple Employee Identity and Access Management (EIAM) accounts to an EIAM group. If the accounts are already added to the specified group, no update is performed.</p>
     * 
     * @param request AddUsersToGroupRequest
     * @return AddUsersToGroupResponse
     */
    public AddUsersToGroupResponse addUsersToGroup(String instanceId, String applicationId, String groupId, AddUsersToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        AddUsersToGroupHeaders headers = new AddUsersToGroupHeaders();
        return this.addUsersToGroupWithOptions(instanceId, applicationId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @param headers CreateGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(String instanceId, String applicationId, CreateGroupRequest request, CreateGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupExternalId)) {
            body.put("groupExternalId", request.groupExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new CreateGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a group.</p>
     * 
     * @param request CreateGroupRequest
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(String instanceId, String applicationId, CreateGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateGroupHeaders headers = new CreateGroupHeaders();
        return this.createGroupWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an organizational unit.</p>
     * 
     * @param request CreateOrganizationalUnitRequest
     * @param headers CreateOrganizationalUnitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnitWithOptions(String instanceId, String applicationId, CreateOrganizationalUnitRequest request, CreateOrganizationalUnitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitExternalId)) {
            body.put("organizationalUnitExternalId", request.organizationalUnitExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            body.put("organizationalUnitName", request.organizationalUnitName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("parentId", request.parentId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new CreateOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an organizational unit.</p>
     * 
     * @param request CreateOrganizationalUnitRequest
     * @return CreateOrganizationalUnitResponse
     */
    public CreateOrganizationalUnitResponse createOrganizationalUnit(String instanceId, String applicationId, CreateOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateOrganizationalUnitHeaders headers = new CreateOrganizationalUnitHeaders();
        return this.createOrganizationalUnitWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Employee Identity and Access Management (EIAM) account in an organizational unit.</p>
     * 
     * @param request CreateUserRequest
     * @param headers CreateUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUserResponse
     */
    public CreateUserResponse createUserWithOptions(String instanceId, String applicationId, CreateUserRequest request, CreateUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            body.put("customFields", request.customFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            body.put("emailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInitializationConfig)) {
            body.put("passwordInitializationConfig", request.passwordInitializationConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("phoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            body.put("phoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            body.put("phoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryOrganizationalUnitId)) {
            body.put("primaryOrganizationalUnitId", request.primaryOrganizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            body.put("userExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new CreateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an Employee Identity and Access Management (EIAM) account in an organizational unit.</p>
     * 
     * @param request CreateUserRequest
     * @return CreateUserResponse
     */
    public CreateUserResponse createUser(String instanceId, String applicationId, CreateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        CreateUserHeaders headers = new CreateUserHeaders();
        return this.createUserWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * 
     * @param headers DeleteGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroupWithOptions(String instanceId, String applicationId, String groupId, DeleteGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DeleteGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a group.</p>
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(String instanceId, String applicationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteGroupHeaders headers = new DeleteGroupHeaders();
        return this.deleteGroupWithOptions(instanceId, applicationId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an organizational unit.</p>
     * 
     * @param headers DeleteOrganizationalUnitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, DeleteOrganizationalUnitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DeleteOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an organizational unit.</p>
     * @return DeleteOrganizationalUnitResponse
     */
    public DeleteOrganizationalUnitResponse deleteOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteOrganizationalUnitHeaders headers = new DeleteOrganizationalUnitHeaders();
        return this.deleteOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param headers DeleteUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(String instanceId, String applicationId, String userId, DeleteUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + ""),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DeleteUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Employee Identity and Access Management (EIAM) account.</p>
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(String instanceId, String applicationId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DeleteUserHeaders headers = new DeleteUserHeaders();
        return this.deleteUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param headers DisableUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUserWithOptions(String instanceId, String applicationId, String userId, DisableUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/disable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new DisableUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an Employee Identity and Access Management (EIAM) account.</p>
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUser(String instanceId, String applicationId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        DisableUserHeaders headers = new DisableUserHeaders();
        return this.disableUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param headers EnableUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUserWithOptions(String instanceId, String applicationId, String userId, EnableUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/enable"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new EnableUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables an Employee Identity and Access Management (EIAM) account.</p>
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUser(String instanceId, String applicationId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        EnableUserHeaders headers = new EnableUserHeaders();
        return this.enableUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a device code.</p>
     * 
     * @param request GenerateDeviceCodeRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateDeviceCodeResponse
     */
    public GenerateDeviceCodeResponse generateDeviceCodeWithOptions(String instanceId, String applicationId, GenerateDeviceCodeRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateDeviceCode"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/oauth2/device/code"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GenerateDeviceCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Generates a device code.</p>
     * 
     * @param request GenerateDeviceCodeRequest
     * @return GenerateDeviceCodeResponse
     */
    public GenerateDeviceCodeResponse generateDeviceCode(String instanceId, String applicationId, GenerateDeviceCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateDeviceCodeWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The following authorization types are supported: authorization code, device code, refresh token, and client credentials.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a token for accessing an application in an instance.</p>
     * 
     * @param request GenerateTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateTokenResponse
     */
    public GenerateTokenResponse generateTokenWithOptions(String instanceId, String applicationId, GenerateTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            query.put("client_secret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            query.put("code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeVerifier)) {
            query.put("code_verifier", request.codeVerifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deviceCode)) {
            query.put("device_code", request.deviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exclusiveTag)) {
            query.put("exclusive_tag", request.exclusiveTag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            query.put("grant_type", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redirectUri)) {
            query.put("redirect_uri", request.redirectUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refreshToken)) {
            query.put("refresh_token", request.refreshToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            query.put("scope", request.scope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("username", request.username);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateToken"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/oauth2/token"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GenerateTokenResponse());
    }

    /**
     * <b>description</b> :
     * <p>The following authorization types are supported: authorization code, device code, refresh token, and client credentials.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a token for accessing an application in an instance.</p>
     * 
     * @param request GenerateTokenRequest
     * @return GenerateTokenResponse
     */
    public GenerateTokenResponse generateToken(String instanceId, String applicationId, GenerateTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.generateTokenWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can go to the Applications page in the IDaaS console to set the synchronization scope. After an application is created, the application has the permission to call this operation by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the synchronization scope of an application in an instance.</p>
     * 
     * @param headers GetApplicationProvisioningScopeHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApplicationProvisioningScopeResponse
     */
    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScopeWithOptions(String instanceId, String applicationId, GetApplicationProvisioningScopeHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApplicationProvisioningScope"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/provisioningScope"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetApplicationProvisioningScopeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can go to the Applications page in the IDaaS console to set the synchronization scope. After an application is created, the application has the permission to call this operation by default.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the synchronization scope of an application in an instance.</p>
     * @return GetApplicationProvisioningScopeResponse
     */
    public GetApplicationProvisioningScopeResponse getApplicationProvisioningScope(String instanceId, String applicationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetApplicationProvisioningScopeHeaders headers = new GetApplicationProvisioningScopeHeaders();
        return this.getApplicationProvisioningScopeWithOptions(instanceId, applicationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a group.</p>
     * 
     * @param headers GetGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroupWithOptions(String instanceId, String applicationId, String groupId, GetGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a group.</p>
     * @return GetGroupResponse
     */
    public GetGroupResponse getGroup(String instanceId, String applicationId, String groupId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetGroupHeaders headers = new GetGroupHeaders();
        return this.getGroupWithOptions(instanceId, applicationId, groupId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an organizational unit.</p>
     * 
     * @param headers GetOrganizationalUnitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationalUnitResponse
     */
    public GetOrganizationalUnitResponse getOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, GetOrganizationalUnitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of an organizational unit.</p>
     * @return GetOrganizationalUnitResponse
     */
    public GetOrganizationalUnitResponse getOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOrganizationalUnitHeaders headers = new GetOrganizationalUnitHeaders();
        return this.getOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ID of an organizational unit based on the external ID</p>
     * 
     * @param request GetOrganizationalUnitIdByExternalIdRequest
     * @param headers GetOrganizationalUnitIdByExternalIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrganizationalUnitIdByExternalIdResponse
     */
    public GetOrganizationalUnitIdByExternalIdResponse getOrganizationalUnitIdByExternalIdWithOptions(String instanceId, String applicationId, GetOrganizationalUnitIdByExternalIdRequest request, GetOrganizationalUnitIdByExternalIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitExternalId)) {
            body.put("organizationalUnitExternalId", request.organizationalUnitExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitSourceId)) {
            body.put("organizationalUnitSourceId", request.organizationalUnitSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitSourceType)) {
            body.put("organizationalUnitSourceType", request.organizationalUnitSourceType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrganizationalUnitIdByExternalId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits/_/actions/getOrganizationalUnitIdByExternalId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetOrganizationalUnitIdByExternalIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the ID of an organizational unit based on the external ID</p>
     * 
     * @param request GetOrganizationalUnitIdByExternalIdRequest
     * @return GetOrganizationalUnitIdByExternalIdResponse
     */
    public GetOrganizationalUnitIdByExternalIdResponse getOrganizationalUnitIdByExternalId(String instanceId, String applicationId, GetOrganizationalUnitIdByExternalIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetOrganizationalUnitIdByExternalIdHeaders headers = new GetOrganizationalUnitIdByExternalIdHeaders();
        return this.getOrganizationalUnitIdByExternalIdWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param headers GetUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(String instanceId, String applicationId, String userId, GetUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + ""),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an Employee Identity and Access Management (EIAM) account.</p>
     * @return GetUserResponse
     */
    public GetUserResponse getUser(String instanceId, String applicationId, String userId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserHeaders headers = new GetUserHeaders();
        return this.getUserWithOptions(instanceId, applicationId, userId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account by email address.</p>
     * 
     * @param request GetUserIdByEmailRequest
     * @param headers GetUserIdByEmailHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserIdByEmailResponse
     */
    public GetUserIdByEmailResponse getUserIdByEmailWithOptions(String instanceId, String applicationId, GetUserIdByEmailRequest request, GetUserIdByEmailHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserIdByEmail"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/_/actions/getUserIdByEmail"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserIdByEmailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account by email address.</p>
     * 
     * @param request GetUserIdByEmailRequest
     * @return GetUserIdByEmailResponse
     */
    public GetUserIdByEmailResponse getUserIdByEmail(String instanceId, String applicationId, GetUserIdByEmailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserIdByEmailHeaders headers = new GetUserIdByEmailHeaders();
        return this.getUserIdByEmailWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the mobile number.</p>
     * 
     * @param request GetUserIdByPhoneNumberRequest
     * @param headers GetUserIdByPhoneNumberHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserIdByPhoneNumberResponse
     */
    public GetUserIdByPhoneNumberResponse getUserIdByPhoneNumberWithOptions(String instanceId, String applicationId, GetUserIdByPhoneNumberRequest request, GetUserIdByPhoneNumberHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("phoneNumber", request.phoneNumber);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserIdByPhoneNumber"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/_/actions/getUserIdByPhoneNumber"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserIdByPhoneNumberResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the mobile number.</p>
     * 
     * @param request GetUserIdByPhoneNumberRequest
     * @return GetUserIdByPhoneNumberResponse
     */
    public GetUserIdByPhoneNumberResponse getUserIdByPhoneNumber(String instanceId, String applicationId, GetUserIdByPhoneNumberRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserIdByPhoneNumberHeaders headers = new GetUserIdByPhoneNumberHeaders();
        return this.getUserIdByPhoneNumberWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the external ID.</p>
     * 
     * @param request GetUserIdByUserExternalIdRequest
     * @param headers GetUserIdByUserExternalIdHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserIdByUserExternalIdResponse
     */
    public GetUserIdByUserExternalIdResponse getUserIdByUserExternalIdWithOptions(String instanceId, String applicationId, GetUserIdByUserExternalIdRequest request, GetUserIdByUserExternalIdHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userExternalId)) {
            body.put("userExternalId", request.userExternalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceId)) {
            body.put("userSourceId", request.userSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userSourceType)) {
            body.put("userSourceType", request.userSourceType);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserIdByUserExternalId"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/_/actions/getUserIdByExternalId"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserIdByUserExternalIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the external ID.</p>
     * 
     * @param request GetUserIdByUserExternalIdRequest
     * @return GetUserIdByUserExternalIdResponse
     */
    public GetUserIdByUserExternalIdResponse getUserIdByUserExternalId(String instanceId, String applicationId, GetUserIdByUserExternalIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserIdByUserExternalIdHeaders headers = new GetUserIdByUserExternalIdHeaders();
        return this.getUserIdByUserExternalIdWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the username.</p>
     * 
     * @param request GetUserIdByUsernameRequest
     * @param headers GetUserIdByUsernameHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserIdByUsernameResponse
     */
    public GetUserIdByUsernameResponse getUserIdByUsernameWithOptions(String instanceId, String applicationId, GetUserIdByUsernameRequest request, GetUserIdByUsernameHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserIdByUsername"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/_/actions/getUserIdByUsername"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserIdByUsernameResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the ID of an Employee Identity and Access Management (EIAM) account based on the username.</p>
     * 
     * @param request GetUserIdByUsernameRequest
     * @return GetUserIdByUsernameResponse
     */
    public GetUserIdByUsernameResponse getUserIdByUsername(String instanceId, String applicationId, GetUserIdByUsernameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserIdByUsernameHeaders headers = new GetUserIdByUsernameHeaders();
        return this.getUserIdByUsernameWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a user by using the user token.</p>
     * 
     * @param headers GetUserInfoHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfoWithOptions(String instanceId, String applicationId, GetUserInfoHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserInfo"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/oauth2/userinfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new GetUserInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of a user by using the user token.</p>
     * @return GetUserInfoResponse
     */
    public GetUserInfoResponse getUserInfo(String instanceId, String applicationId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        GetUserInfoHeaders headers = new GetUserInfoHeaders();
        return this.getUserInfoWithOptions(instanceId, applicationId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Employee Identity and Access Management (EIAM) groups by page.</p>
     * 
     * @param request ListGroupsRequest
     * @param headers ListGroupsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroupsWithOptions(String instanceId, String applicationId, ListGroupsRequest request, ListGroupsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupNameStartWith)) {
            query.put("groupNameStartWith", request.groupNameStartWith);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroups"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about Employee Identity and Access Management (EIAM) groups by page.</p>
     * 
     * @param request ListGroupsRequest
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(String instanceId, String applicationId, ListGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListGroupsHeaders headers = new ListGroupsHeaders();
        return this.listGroupsWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取账户关联组列表</p>
     * 
     * @param request ListGroupsForUserRequest
     * @param headers ListGroupsForUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUserWithOptions(String instanceId, String applicationId, String userId, ListGroupsForUserRequest request, ListGroupsForUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupsForUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/listGroupsForUser"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListGroupsForUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取账户关联组列表</p>
     * 
     * @param request ListGroupsForUserRequest
     * @return ListGroupsForUserResponse
     */
    public ListGroupsForUserResponse listGroupsForUser(String instanceId, String applicationId, String userId, ListGroupsForUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListGroupsForUserHeaders headers = new ListGroupsForUserHeaders();
        return this.listGroupsForUserWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of all the parent organizational units of an organizational unit.</p>
     * 
     * @param headers ListOrganizationalUnitParentIdsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitParentIdsResponse
     */
    public ListOrganizationalUnitParentIdsResponse listOrganizationalUnitParentIdsWithOptions(String instanceId, String applicationId, String organizationalUnitId, ListOrganizationalUnitParentIdsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnitParentIds"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId) + "/parentIds"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListOrganizationalUnitParentIdsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of all the parent organizational units of an organizational unit.</p>
     * @return ListOrganizationalUnitParentIdsResponse
     */
    public ListOrganizationalUnitParentIdsResponse listOrganizationalUnitParentIds(String instanceId, String applicationId, String organizationalUnitId) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListOrganizationalUnitParentIdsHeaders headers = new ListOrganizationalUnitParentIdsHeaders();
        return this.listOrganizationalUnitParentIdsWithOptions(instanceId, applicationId, organizationalUnitId, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of Employee Identity and Access Management (EIAM) organizational units by page.</p>
     * 
     * @param request ListOrganizationalUnitsRequest
     * @param headers ListOrganizationalUnitsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnitsWithOptions(String instanceId, String applicationId, ListOrganizationalUnitsRequest request, ListOrganizationalUnitsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("parentId", request.parentId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrganizationalUnits"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of Employee Identity and Access Management (EIAM) organizational units by page.</p>
     * 
     * @param request ListOrganizationalUnitsRequest
     * @return ListOrganizationalUnitsResponse
     */
    public ListOrganizationalUnitsResponse listOrganizationalUnits(String instanceId, String applicationId, ListOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListOrganizationalUnitsHeaders headers = new ListOrganizationalUnitsHeaders();
        return this.listOrganizationalUnitsWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of Employee Identity and Access Management (EIAM) accounts by page.</p>
     * 
     * @param request ListUsersRequest
     * @param headers ListUsersHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(String instanceId, String applicationId, ListUsersRequest request, ListUsersHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            query.put("organizationalUnitId", request.organizationalUnitId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("pageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("pageSize", request.pageSize);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of Employee Identity and Access Management (EIAM) accounts by page.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(String instanceId, String applicationId, ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListUsersHeaders headers = new ListUsersHeaders();
        return this.listUsersWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries accounts in an Employee Identity and Access Management (EIAM) group.</p>
     * 
     * @param request ListUsersForGroupRequest
     * @param headers ListUsersForGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroupWithOptions(String instanceId, String applicationId, String groupId, ListUsersForGroupRequest request, ListUsersForGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("maxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("nextToken", request.nextToken);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersForGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/actions/listUsersForGroup"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ListUsersForGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries accounts in an Employee Identity and Access Management (EIAM) group.</p>
     * 
     * @param request ListUsersForGroupRequest
     * @return ListUsersForGroupResponse
     */
    public ListUsersForGroupResponse listUsersForGroup(String instanceId, String applicationId, String groupId, ListUsersForGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ListUsersForGroupHeaders headers = new ListUsersForGroupHeaders();
        return this.listUsersForGroupWithOptions(instanceId, applicationId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取云角色（CloudAccountRole）的临时访问凭证</p>
     * 
     * @param request ObtainCloudAccountRoleAccessCredentialRequest
     * @param headers ObtainCloudAccountRoleAccessCredentialHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainCloudAccountRoleAccessCredentialResponse
     */
    public ObtainCloudAccountRoleAccessCredentialResponse obtainCloudAccountRoleAccessCredentialWithOptions(String instanceId, ObtainCloudAccountRoleAccessCredentialRequest request, ObtainCloudAccountRoleAccessCredentialHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudAccountRoleExternalId)) {
            query.put("cloudAccountRoleExternalId", request.cloudAccountRoleExternalId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainCloudAccountRoleAccessCredential"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/cloudAccountRoles/_/actions/obtainAccessCredential"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ObtainCloudAccountRoleAccessCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取云角色（CloudAccountRole）的临时访问凭证</p>
     * 
     * @param request ObtainCloudAccountRoleAccessCredentialRequest
     * @return ObtainCloudAccountRoleAccessCredentialResponse
     */
    public ObtainCloudAccountRoleAccessCredentialResponse obtainCloudAccountRoleAccessCredential(String instanceId, ObtainCloudAccountRoleAccessCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ObtainCloudAccountRoleAccessCredentialHeaders headers = new ObtainCloudAccountRoleAccessCredentialHeaders();
        return this.obtainCloudAccountRoleAccessCredentialWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取凭据明文。</p>
     * 
     * @param request ObtainCredentialRequest
     * @param headers ObtainCredentialHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return ObtainCredentialResponse
     */
    public ObtainCredentialResponse obtainCredentialWithOptions(String instanceId, ObtainCredentialRequest request, ObtainCredentialHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.credentialIdentifier)) {
            query.put("credentialIdentifier", request.credentialIdentifier);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ObtainCredential"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/credentials/_/actions/obtain"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new ObtainCredentialResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取凭据明文。</p>
     * 
     * @param request ObtainCredentialRequest
     * @return ObtainCredentialResponse
     */
    public ObtainCredentialResponse obtainCredential(String instanceId, ObtainCredentialRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        ObtainCredentialHeaders headers = new ObtainCredentialHeaders();
        return this.obtainCredentialWithOptions(instanceId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about an Employee Identity and Access Management (EIAM) group.</p>
     * 
     * @param request PatchGroupRequest
     * @param headers PatchGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PatchGroupResponse
     */
    public PatchGroupResponse patchGroupWithOptions(String instanceId, String applicationId, String groupId, PatchGroupRequest request, PatchGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("groupName", request.groupName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new PatchGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies information about an Employee Identity and Access Management (EIAM) group.</p>
     * 
     * @param request PatchGroupRequest
     * @return PatchGroupResponse
     */
    public PatchGroupResponse patchGroup(String instanceId, String applicationId, String groupId, PatchGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PatchGroupHeaders headers = new PatchGroupHeaders();
        return this.patchGroupWithOptions(instanceId, applicationId, groupId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an EIAM organizational unit.</p>
     * 
     * @param request PatchOrganizationalUnitRequest
     * @param headers PatchOrganizationalUnitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PatchOrganizationalUnitResponse
     */
    public PatchOrganizationalUnitResponse patchOrganizationalUnitWithOptions(String instanceId, String applicationId, String organizationalUnitId, PatchOrganizationalUnitRequest request, PatchOrganizationalUnitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitName)) {
            body.put("organizationalUnitName", request.organizationalUnitName);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/organizationalUnits/" + com.aliyun.openapiutil.Client.getEncodeParam(organizationalUnitId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new PatchOrganizationalUnitResponse());
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an EIAM organizational unit.</p>
     * 
     * @param request PatchOrganizationalUnitRequest
     * @return PatchOrganizationalUnitResponse
     */
    public PatchOrganizationalUnitResponse patchOrganizationalUnit(String instanceId, String applicationId, String organizationalUnitId, PatchOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PatchOrganizationalUnitHeaders headers = new PatchOrganizationalUnitHeaders();
        return this.patchOrganizationalUnitWithOptions(instanceId, applicationId, organizationalUnitId, request, headers, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param request PatchUserRequest
     * @param headers PatchUserHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return PatchUserResponse
     */
    public PatchUserResponse patchUserWithOptions(String instanceId, String applicationId, String userId, PatchUserRequest request, PatchUserHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customFields)) {
            body.put("customFields", request.customFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.displayName)) {
            body.put("displayName", request.displayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            body.put("email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emailVerified)) {
            body.put("emailVerified", request.emailVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumber)) {
            body.put("phoneNumber", request.phoneNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneNumberVerified)) {
            body.put("phoneNumberVerified", request.phoneNumberVerified);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phoneRegion)) {
            body.put("phoneRegion", request.phoneRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            body.put("username", request.username);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PatchUser"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + ""),
            new TeaPair("method", "PATCH"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new PatchUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>The operation conforms to the HTTP PATCH request method. The value of a parameter is modified only if the parameter is specified in the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an Employee Identity and Access Management (EIAM) account.</p>
     * 
     * @param request PatchUserRequest
     * @return PatchUserResponse
     */
    public PatchUserResponse patchUser(String instanceId, String applicationId, String userId, PatchUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        PatchUserHeaders headers = new PatchUserHeaders();
        return this.patchUserWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将账户从多个组织移除【不支持移除主组织】</p>
     * 
     * @param request RemoveUserFromOrganizationalUnitsRequest
     * @param headers RemoveUserFromOrganizationalUnitsHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    public RemoveUserFromOrganizationalUnitsResponse removeUserFromOrganizationalUnitsWithOptions(String instanceId, String applicationId, String userId, RemoveUserFromOrganizationalUnitsRequest request, RemoveUserFromOrganizationalUnitsHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitIds)) {
            body.put("organizationalUnitIds", request.organizationalUnitIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUserFromOrganizationalUnits"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/removeUserFromOrganizationalUnits"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new RemoveUserFromOrganizationalUnitsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将账户从多个组织移除【不支持移除主组织】</p>
     * 
     * @param request RemoveUserFromOrganizationalUnitsRequest
     * @return RemoveUserFromOrganizationalUnitsResponse
     */
    public RemoveUserFromOrganizationalUnitsResponse removeUserFromOrganizationalUnits(String instanceId, String applicationId, String userId, RemoveUserFromOrganizationalUnitsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveUserFromOrganizationalUnitsHeaders headers = new RemoveUserFromOrganizationalUnitsHeaders();
        return this.removeUserFromOrganizationalUnitsWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes multiple Employee Identity and Access Management (EIAM) accounts from an EIAM group. If an account does not belong to the group, the removal succeeds by default.</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @param headers RemoveUsersFromGroupHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroupWithOptions(String instanceId, String applicationId, String groupId, RemoveUsersFromGroupRequest request, RemoveUsersFromGroupHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            body.put("userIds", request.userIds);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsersFromGroup"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/groups/" + com.aliyun.openapiutil.Client.getEncodeParam(groupId) + "/actions/removeUsersFromGroup"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new RemoveUsersFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes multiple Employee Identity and Access Management (EIAM) accounts from an EIAM group. If an account does not belong to the group, the removal succeeds by default.</p>
     * 
     * @param request RemoveUsersFromGroupRequest
     * @return RemoveUsersFromGroupResponse
     */
    public RemoveUsersFromGroupResponse removeUsersFromGroup(String instanceId, String applicationId, String groupId, RemoveUsersFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        RemoveUsersFromGroupHeaders headers = new RemoveUsersFromGroupHeaders();
        return this.removeUsersFromGroupWithOptions(instanceId, applicationId, groupId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes an access token or refresh token.</p>
     * 
     * @param request RevokeTokenRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTokenResponse
     */
    public RevokeTokenResponse revokeTokenWithOptions(String instanceId, String applicationId, RevokeTokenRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientId)) {
            query.put("client_id", request.clientId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientSecret)) {
            query.put("client_secret", request.clientSecret);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.token)) {
            query.put("token", request.token);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tokenTypeHint)) {
            query.put("token_type_hint", request.tokenTypeHint);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeToken"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/oauth2/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new RevokeTokenResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes an access token or refresh token.</p>
     * 
     * @param request RevokeTokenRequest
     * @return RevokeTokenResponse
     */
    public RevokeTokenResponse revokeToken(String instanceId, String applicationId, RevokeTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeTokenWithOptions(instanceId, applicationId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将指定组织设置为账户主组织，移除旧主组织，加入新主组织。</p>
     * 
     * @param request SetUserPrimaryOrganizationalUnitRequest
     * @param headers SetUserPrimaryOrganizationalUnitHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    public SetUserPrimaryOrganizationalUnitResponse setUserPrimaryOrganizationalUnitWithOptions(String instanceId, String applicationId, String userId, SetUserPrimaryOrganizationalUnitRequest request, SetUserPrimaryOrganizationalUnitHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.organizationalUnitId)) {
            body.put("organizationalUnitId", request.organizationalUnitId);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserPrimaryOrganizationalUnit"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/setUserPrimaryOrganizationalUnit"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new SetUserPrimaryOrganizationalUnitResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将指定组织设置为账户主组织，移除旧主组织，加入新主组织。</p>
     * 
     * @param request SetUserPrimaryOrganizationalUnitRequest
     * @return SetUserPrimaryOrganizationalUnitResponse
     */
    public SetUserPrimaryOrganizationalUnitResponse setUserPrimaryOrganizationalUnit(String instanceId, String applicationId, String userId, SetUserPrimaryOrganizationalUnitRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        SetUserPrimaryOrganizationalUnitHeaders headers = new SetUserPrimaryOrganizationalUnitHeaders();
        return this.setUserPrimaryOrganizationalUnitWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新账户密码</p>
     * 
     * @param request UpdateUserPasswordRequest
     * @param headers UpdateUserPasswordHeaders
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserPasswordResponse
     */
    public UpdateUserPasswordResponse updateUserPasswordWithOptions(String instanceId, String applicationId, String userId, UpdateUserPasswordRequest request, UpdateUserPasswordHeaders headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("password", request.password);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.authorization)) {
            realHeaders.put("Authorization", com.aliyun.teautil.Common.toJSONString(headers.authorization));
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUserPassword"),
            new TeaPair("version", "2022-02-25"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/v2/" + com.aliyun.openapiutil.Client.getEncodeParam(instanceId) + "/" + com.aliyun.openapiutil.Client.getEncodeParam(applicationId) + "/users/" + com.aliyun.openapiutil.Client.getEncodeParam(userId) + "/actions/updateUserPassword"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "Anonymous"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.doROARequest(params.action, params.version, params.protocol, params.method, params.authType, params.pathname, params.bodyType, req, runtime), new UpdateUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新账户密码</p>
     * 
     * @param request UpdateUserPasswordRequest
     * @return UpdateUserPasswordResponse
     */
    public UpdateUserPasswordResponse updateUserPassword(String instanceId, String applicationId, String userId, UpdateUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        UpdateUserPasswordHeaders headers = new UpdateUserPasswordHeaders();
        return this.updateUserPasswordWithOptions(instanceId, applicationId, userId, request, headers, runtime);
    }
}
