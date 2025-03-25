// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308;

import com.aliyun.tea.*;
import com.aliyun.eds_user20210308.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._signatureAlgorithm = "v2";
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eds-user", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>批量设置桌面管理员</p>
     * 
     * @param request BatchSetDesktopManagerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSetDesktopManagerResponse
     */
    public BatchSetDesktopManagerResponse batchSetDesktopManagerWithOptions(BatchSetDesktopManagerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isDesktopManager)) {
            body.put("IsDesktopManager", request.isDesktopManager);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchSetDesktopManager"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDesktopManagerResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new BatchSetDesktopManagerResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>批量设置桌面管理员</p>
     * 
     * @param request BatchSetDesktopManagerRequest
     * @return BatchSetDesktopManagerResponse
     */
    public BatchSetDesktopManagerResponse batchSetDesktopManager(BatchSetDesktopManagerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchSetDesktopManagerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>管理员修改用户密码</p>
     * 
     * @param request ChangeUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeUserPasswordResponse
     */
    public ChangeUserPasswordResponse changeUserPasswordWithOptions(ChangeUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newPassword)) {
            body.put("NewPassword", request.newPassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeUserPassword"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeUserPasswordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ChangeUserPasswordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>管理员修改用户密码</p>
     * 
     * @param request ChangeUserPasswordRequest
     * @return ChangeUserPasswordResponse
     */
    public ChangeUserPasswordResponse changeUserPassword(ChangeUserPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeUserPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a property is associated with one or more convenience users.</p>
     * 
     * @param request CheckUsedPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUsedPropertyResponse
     */
    public CheckUsedPropertyResponse checkUsedPropertyWithOptions(CheckUsedPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            query.put("PropertyId", request.propertyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUsedProperty"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUsedPropertyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckUsedPropertyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a property is associated with one or more convenience users.</p>
     * 
     * @param request CheckUsedPropertyRequest
     * @return CheckUsedPropertyResponse
     */
    public CheckUsedPropertyResponse checkUsedProperty(CheckUsedPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUsedPropertyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call the operation, you can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the existing user properties and their IDs (PropertyId) and values (PropertyValueId).</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a property value is associated with a user.</p>
     * 
     * @param request CheckUsedPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUsedPropertyValueResponse
     */
    public CheckUsedPropertyValueResponse checkUsedPropertyValueWithOptions(CheckUsedPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            query.put("PropertyId", request.propertyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValueId)) {
            query.put("PropertyValueId", request.propertyValueId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckUsedPropertyValue"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUsedPropertyValueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CheckUsedPropertyValueResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call the operation, you can call the <a href="https://help.aliyun.com/document_detail/410890.html">ListProperty</a> operation to query the existing user properties and their IDs (PropertyId) and values (PropertyValueId).</p>
     * 
     * <b>summary</b> : 
     * <p>Checks whether a property value is associated with a user.</p>
     * 
     * @param request CheckUsedPropertyValueRequest
     * @return CheckUsedPropertyValueResponse
     */
    public CheckUsedPropertyValueResponse checkUsedPropertyValue(CheckUsedPropertyValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUsedPropertyValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user property.</p>
     * 
     * @param request CreatePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createPropertyWithOptions(CreatePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyKey)) {
            body.put("PropertyKey", request.propertyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValues)) {
            body.put("PropertyValues", request.propertyValues);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProperty"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePropertyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreatePropertyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates a user property.</p>
     * 
     * @param request CreatePropertyRequest
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPropertyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Convenience users are dedicated Elastic Desktop Service (EDS) user accounts and are suitable for scenarios in which you do not need to connect to enterprise Active Directory (AD) systems. The information about a convenience user includes the username, email address, and mobile number. You must specify the username or email address.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a convenience user.</p>
     * 
     * @param request CreateUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsersWithOptions(CreateUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoLockTime)) {
            query.put("AutoLockTime", request.autoLockTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isLocalAdmin)) {
            query.put("IsLocalAdmin", request.isLocalAdmin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordExpireDays)) {
            query.put("PasswordExpireDays", request.passwordExpireDays);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateUsersResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Convenience users are dedicated Elastic Desktop Service (EDS) user accounts and are suitable for scenarios in which you do not need to connect to enterprise Active Directory (AD) systems. The information about a convenience user includes the username, email address, and mobile number. You must specify the username or email address.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a convenience user.</p>
     * 
     * @param request CreateUsersRequest
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you can call the FilterUsers operation to query the users that are associated with user properties.</p>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a user property from a user.</p>
     * 
     * @param request DeleteUserPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPropertyValueResponse
     */
    public DeleteUserPropertyValueResponse deleteUserPropertyValueWithOptions(DeleteUserPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            body.put("PropertyId", request.propertyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValueId)) {
            body.put("PropertyValueId", request.propertyValueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUserPropertyValue"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPropertyValueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteUserPropertyValueResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, you can call the FilterUsers operation to query the users that are associated with user properties.</p>
     * 
     * <b>summary</b> : 
     * <p>Dissociates a user property from a user.</p>
     * 
     * @param request DeleteUserPropertyValueRequest
     * @return DeleteUserPropertyValueResponse
     */
    public DeleteUserPropertyValueResponse deleteUserPropertyValue(DeleteUserPropertyValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserPropertyValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about virtual multi-factor authentication (MFA) devices that are bound to convenience users.</p>
     * 
     * @param request DescribeMfaDevicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMfaDevicesResponse
     */
    public DescribeMfaDevicesResponse describeMfaDevicesWithOptions(DescribeMfaDevicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumbers)) {
            query.put("SerialNumbers", request.serialNumbers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMfaDevices"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMfaDevicesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeMfaDevicesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about virtual multi-factor authentication (MFA) devices that are bound to convenience users.</p>
     * 
     * @param request DescribeMfaDevicesRequest
     * @return DescribeMfaDevicesResponse
     */
    public DescribeMfaDevicesResponse describeMfaDevices(DescribeMfaDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMfaDevicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An organization is in a tree structure. The root organization ID is in the following format: org-aliyun-wy-org-id.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries organizations.</p>
     * 
     * @param request DescribeOrgsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrgsResponse
     */
    public DescribeOrgsResponse describeOrgsWithOptions(DescribeOrgsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            query.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentOrgId)) {
            query.put("ParentOrgId", request.parentOrgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrgs"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrgsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeOrgsResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>An organization is in a tree structure. The root organization ID is in the following format: org-aliyun-wy-org-id.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries organizations.</p>
     * 
     * @param request DescribeOrgsRequest
     * @return DescribeOrgsResponse
     */
    public DescribeOrgsResponse describeOrgs(DescribeOrgsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrgsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about convenience users. The information of a convenience user includes a username, an email address, and a description.</p>
     * 
     * @param tmpReq DescribeUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsersWithOptions(DescribeUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeUsersShrinkRequest request = new DescribeUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterWithAssignedResource)) {
            request.filterWithAssignedResourceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterWithAssignedResource, "FilterWithAssignedResource", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterWithAssignedResources)) {
            request.filterWithAssignedResourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterWithAssignedResources, "FilterWithAssignedResources", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.showExtras)) {
            request.showExtrasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.showExtras, "ShowExtras", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterWithAssignedResourceShrink)) {
            query.put("FilterWithAssignedResource", request.filterWithAssignedResourceShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeEndUserIds)) {
            body.put("ExcludeEndUserIds", request.excludeEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterWithAssignedResourcesShrink)) {
            body.put("FilterWithAssignedResources", request.filterWithAssignedResourcesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQueryAllSubOrgs)) {
            body.put("IsQueryAllSubOrgs", request.isQueryAllSubOrgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showExtrasShrink)) {
            body.put("ShowExtras", request.showExtrasShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            body.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about convenience users. The information of a convenience user includes a username, an email address, and a description.</p>
     * 
     * @param request DescribeUsersRequest
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsers(DescribeUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Filters convenience users by property.</p>
     * 
     * @param tmpReq FilterUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FilterUsersResponse
     */
    public FilterUsersResponse filterUsersWithOptions(FilterUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FilterUsersShrinkRequest request = new FilterUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderParam)) {
            request.orderParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderParam, "OrderParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeEndUserIds)) {
            query.put("ExcludeEndUserIds", request.excludeEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDesktopCount)) {
            query.put("IncludeDesktopCount", request.includeDesktopCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDesktopGroupCount)) {
            query.put("IncludeDesktopGroupCount", request.includeDesktopGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOrgInfo)) {
            query.put("IncludeOrgInfo", request.includeOrgInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeSupportIdps)) {
            query.put("IncludeSupportIdps", request.includeSupportIdps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isQueryAllSubOrgs)) {
            query.put("IsQueryAllSubOrgs", request.isQueryAllSubOrgs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderParamShrink)) {
            query.put("OrderParam", request.orderParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerType)) {
            query.put("OwnerType", request.ownerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyFilterParam)) {
            query.put("PropertyFilterParam", request.propertyFilterParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyKeyValueFilterParam)) {
            query.put("PropertyKeyValueFilterParam", request.propertyKeyValueFilterParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FilterUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new FilterUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new FilterUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Filters convenience users by property.</p>
     * 
     * @param request FilterUsersRequest
     * @return FilterUsersResponse
     */
    public FilterUsersResponse filterUsers(FilterUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.filterUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about the current logon administrator based on the authorization code.</p>
     * 
     * @param request GetManagerInfoByAuthCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetManagerInfoByAuthCodeResponse
     */
    public GetManagerInfoByAuthCodeResponse getManagerInfoByAuthCodeWithOptions(GetManagerInfoByAuthCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authCode)) {
            query.put("AuthCode", request.authCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagerInfoByAuthCode"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagerInfoByAuthCodeResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetManagerInfoByAuthCodeResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the information about the current logon administrator based on the authorization code.</p>
     * 
     * @param request GetManagerInfoByAuthCodeRequest
     * @return GetManagerInfoByAuthCodeResponse
     */
    public GetManagerInfoByAuthCodeResponse getManagerInfoByAuthCode(GetManagerInfoByAuthCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagerInfoByAuthCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all user properties within an Alibaba Cloud account.</p>
     * 
     * @param request ListPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listPropertyWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProperty"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPropertyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPropertyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries all user properties within an Alibaba Cloud account.</p>
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listProperty() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPropertyWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries property values of a user property.</p>
     * 
     * @param request ListPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPropertyValueResponse
     */
    public ListPropertyValueResponse listPropertyValueWithOptions(ListPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            query.put("PropertyId", request.propertyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPropertyValue"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListPropertyValueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListPropertyValueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries property values of a user property.</p>
     * 
     * @param request ListPropertyValueRequest
     * @return ListPropertyValueResponse
     */
    public ListPropertyValueResponse listPropertyValue(ListPropertyValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPropertyValueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a virtual MFA device is locked, the status of the virtual MFA device changes to LOCKED. The convenience user to which the MFA device is bound cannot log on to the cloud desktop that resides in the workspace with the MFA feature enabled because the identity of the convenience user cannot be verified based on the virtual MFA device. You can call the <a href="https://help.aliyun.com/document_detail/286534.html">UnlockMfaDevice</a> operation to unlock the virtual MFA device.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request LockMfaDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockMfaDeviceResponse
     */
    public LockMfaDeviceResponse lockMfaDeviceWithOptions(LockMfaDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockMfaDevice"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LockMfaDeviceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LockMfaDeviceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>After a virtual MFA device is locked, the status of the virtual MFA device changes to LOCKED. The convenience user to which the MFA device is bound cannot log on to the cloud desktop that resides in the workspace with the MFA feature enabled because the identity of the convenience user cannot be verified based on the virtual MFA device. You can call the <a href="https://help.aliyun.com/document_detail/286534.html">UnlockMfaDevice</a> operation to unlock the virtual MFA device.</p>
     * 
     * <b>summary</b> : 
     * <p>Locks a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request LockMfaDeviceRequest
     * @return LockMfaDeviceResponse
     */
    public LockMfaDeviceResponse lockMfaDevice(LockMfaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockMfaDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Locks one or more convenience users.</p>
     * 
     * @param request LockUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockUsersResponse
     */
    public LockUsersResponse lockUsersWithOptions(LockUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logoutSession)) {
            query.put("LogoutSession", request.logoutSession);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new LockUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new LockUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Locks one or more convenience users.</p>
     * 
     * @param request LockUsersRequest
     * @return LockUsersResponse
     */
    public LockUsersResponse lockUsers(LockUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies user information.</p>
     * 
     * @param request ModifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.email)) {
            query.put("Email", request.email);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.phone)) {
            query.put("Phone", request.phone);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUser"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ModifyUserResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies user information.</p>
     * 
     * @param request ModifyUserRequest
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUser(ModifyUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询edu同步信息</p>
     * 
     * @param request QuerySyncStatusByAliUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySyncStatusByAliUidResponse
     */
    public QuerySyncStatusByAliUidResponse querySyncStatusByAliUidWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QuerySyncStatusByAliUid"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySyncStatusByAliUidResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QuerySyncStatusByAliUidResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>查询edu同步信息</p>
     * @return QuerySyncStatusByAliUidResponse
     */
    public QuerySyncStatusByAliUidResponse querySyncStatusByAliUid() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySyncStatusByAliUidWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you remove a virtual MFA device that is bound to a convenience user, the convenience user can no longer use the virtual MFA device to log on to cloud desktops. Before the convenience user can log on to cloud desktops again, a new virtual MFA device must be bound to the convenience user.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request RemoveMfaDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveMfaDeviceResponse
     */
    public RemoveMfaDeviceResponse removeMfaDeviceWithOptions(RemoveMfaDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveMfaDevice"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMfaDeviceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveMfaDeviceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>If you remove a virtual MFA device that is bound to a convenience user, the convenience user can no longer use the virtual MFA device to log on to cloud desktops. Before the convenience user can log on to cloud desktops again, a new virtual MFA device must be bound to the convenience user.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request RemoveMfaDeviceRequest
     * @return RemoveMfaDeviceResponse
     */
    public RemoveMfaDeviceResponse removeMfaDevice(RemoveMfaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeMfaDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user property.</p>
     * 
     * @param request RemovePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePropertyResponse
     */
    public RemovePropertyResponse removePropertyWithOptions(RemovePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            body.put("PropertyId", request.propertyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveProperty"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePropertyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemovePropertyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a user property.</p>
     * 
     * @param request RemovePropertyRequest
     * @return RemovePropertyResponse
     */
    public RemovePropertyResponse removeProperty(RemovePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes one or more convenience users.</p>
     * 
     * @param request RemoveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RemoveUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Removes one or more convenience users.</p>
     * 
     * @param request RemoveUsersRequest
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsers(RemoveUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password for a convenience user. If you call this operation, a token that is used to reset the password is generated, and the system sends a password reset email that includes the token to the email address of the convenience user.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.notifyType)) {
            body.put("NotifyType", request.notifyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetUserPassword"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ResetUserPasswordResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password for a convenience user. If you call this operation, a token that is used to reset the password is generated, and the system sends a password reset email that includes the token to the email address of the convenience user.</p>
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
     * <p>Associates a user property with a convenience user.</p>
     * 
     * @param request SetUserPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserPropertyValueResponse
     */
    public SetUserPropertyValueResponse setUserPropertyValueWithOptions(SetUserPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            body.put("PropertyId", request.propertyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValueId)) {
            body.put("PropertyValueId", request.propertyValueId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            body.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetUserPropertyValue"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserPropertyValueResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SetUserPropertyValueResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Associates a user property with a convenience user.</p>
     * 
     * @param request SetUserPropertyValueRequest
     * @return SetUserPropertyValueResponse
     */
    public SetUserPropertyValueResponse setUserPropertyValue(SetUserPropertyValueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setUserPropertyValueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从钉钉手动同步老师学生信息</p>
     * 
     * @param request SyncAllEduInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncAllEduInfoResponse
     */
    public SyncAllEduInfoResponse syncAllEduInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncAllEduInfo"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new SyncAllEduInfoResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new SyncAllEduInfoResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>从钉钉手动同步老师学生信息</p>
     * @return SyncAllEduInfoResponse
     */
    public SyncAllEduInfoResponse syncAllEduInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncAllEduInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request UnlockMfaDeviceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockMfaDeviceResponse
     */
    public UnlockMfaDeviceResponse unlockMfaDeviceWithOptions(UnlockMfaDeviceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adDomain)) {
            query.put("AdDomain", request.adDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serialNumber)) {
            query.put("SerialNumber", request.serialNumber);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockMfaDevice"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockMfaDeviceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnlockMfaDeviceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks a virtual multi-factor authentication (MFA) device that is bound to a convenience user.</p>
     * 
     * @param request UnlockMfaDeviceRequest
     * @return UnlockMfaDeviceResponse
     */
    public UnlockMfaDeviceResponse unlockMfaDevice(UnlockMfaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockMfaDeviceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks one or more convenience users.</p>
     * 
     * @param request UnlockUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockUsersResponse
     */
    public UnlockUsersResponse unlockUsersWithOptions(UnlockUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoLockTime)) {
            query.put("AutoLockTime", request.autoLockTime);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockUsers"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockUsersResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnlockUsersResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Unlocks one or more convenience users.</p>
     * 
     * @param request UnlockUsersRequest
     * @return UnlockUsersResponse
     */
    public UnlockUsersResponse unlockUsers(UnlockUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a user property.</p>
     * 
     * @param request UpdatePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updatePropertyWithOptions(UpdatePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            body.put("PropertyId", request.propertyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyKey)) {
            body.put("PropertyKey", request.propertyKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.propertyValues)) {
            body.put("PropertyValues", request.propertyValues);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateProperty"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePropertyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdatePropertyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a user property.</p>
     * 
     * @param request UpdatePropertyRequest
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePropertyWithOptions(request, runtime);
    }
}
