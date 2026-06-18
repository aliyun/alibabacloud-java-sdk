// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308;

import com.aliyun.tea.*;
import com.aliyun.eds_user20210308.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "eds-user.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "eds-user.ap-southeast-1.aliyuncs.com")
        );
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
     * <b>description</b> :
     * <p>A convenience account with local administrator permissions can install software or modify certain system settings on the cloud computer.</p>
     * 
     * <b>summary</b> : 
     * <p>Add or remove local administrator permissions on a cloud computer for a convenience account.</p>
     * 
     * @param request BatchSetDesktopManagerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchSetDesktopManagerResponse
     */
    public BatchSetDesktopManagerResponse batchSetDesktopManagerWithOptions(BatchSetDesktopManagerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchSetDesktopManagerResponse());
    }

    /**
     * <b>description</b> :
     * <p>A convenience account with local administrator permissions can install software or modify certain system settings on the cloud computer.</p>
     * 
     * <b>summary</b> : 
     * <p>Add or remove local administrator permissions on a cloud computer for a convenience account.</p>
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
     * <p>When the administrator activates the mode, you can use this API to modify the user logon password.</p>
     * 
     * @param request ChangeUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeUserPasswordResponse
     */
    public ChangeUserPasswordResponse changeUserPasswordWithOptions(ChangeUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>When the administrator activates the mode, you can use this API to modify the user logon password.</p>
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
     * <p>Query the number of convenience accounts associated with a specified custom property.</p>
     * 
     * @param request CheckUsedPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUsedPropertyResponse
     */
    public CheckUsedPropertyResponse checkUsedPropertyWithOptions(CheckUsedPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUsedPropertyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the number of convenience accounts associated with a specified custom property.</p>
     * 
     * @param request CheckUsedPropertyRequest
     * @return CheckUsedPropertyResponse
     */
    public CheckUsedPropertyResponse checkUsedProperty(CheckUsedPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkUsedPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the number of convenience accounts associated with a specified custom attribute value.</p>
     * 
     * @param request CheckUsedPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckUsedPropertyValueResponse
     */
    public CheckUsedPropertyValueResponse checkUsedPropertyValueWithOptions(CheckUsedPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckUsedPropertyValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the number of convenience accounts associated with a specified custom attribute value.</p>
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
     * <p>Create a group.</p>
     * 
     * @param request CreateGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentGroupId)) {
            query.put("ParentGroupId", request.parentGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroup"),
            new TeaPair("version", "2021-03-08"),
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
     * <p>Create a group.</p>
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
     * <p>Create an organization.</p>
     * 
     * @param request CreateOrgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrgResponse
     */
    public CreateOrgResponse createOrgWithOptions(CreateOrgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
            new TeaPair("action", "CreateOrg"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create an organization.</p>
     * 
     * @param request CreateOrgRequest
     * @return CreateOrgResponse
     */
    public CreateOrgResponse createOrg(CreateOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrgWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create up to 10 different properties under one Alibaba Cloud account. Each property includes a property name (PropertyKey) and multiple attribute values (PropertyValue).  </li>
     * <li>You can add up to 50 different attribute values to a single property.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a user attribute.</p>
     * 
     * @param request CreatePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createPropertyWithOptions(CreatePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePropertyResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can create up to 10 different properties under one Alibaba Cloud account. Each property includes a property name (PropertyKey) and multiple attribute values (PropertyValue).  </li>
     * <li>You can add up to 50 different attribute values to a single property.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a user attribute.</p>
     * 
     * @param request CreatePropertyRequest
     * @return CreatePropertyResponse
     */
    public CreatePropertyResponse createProperty(CreatePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroupWithOptions(CreateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableAliyunResourceGroup)) {
            query.put("EnableAliyunResourceGroup", request.enableAliyunResourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isResourceGroupWithOfficeSite)) {
            query.put("IsResourceGroupWithOfficeSite", request.isResourceGroupWithOfficeSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceClassification)) {
            query.put("ResourceClassification", request.resourceClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateResourceGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateResourceGroupRequest
     * @return CreateResourceGroupResponse
     */
    public CreateResourceGroupResponse createResourceGroup(CreateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require a username, and either an email or a phone number.
     * &lt;props=&quot;intl&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require both a username and an email.</p>
     * 
     * <b>summary</b> : 
     * <p>Easily create accounts for your end users.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>&lt;props=&quot;china&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require a username, and either an email or a phone number.
     * &lt;props=&quot;intl&quot;&gt;
     * A convenience account is a dedicated account system in Wuying Workspace for simple use cases that do not require enterprise AD integration. Accounts require both a username and an email.</p>
     * 
     * <b>summary</b> : 
     * <p>Easily create accounts for your end users.</p>
     * 
     * @param request CreateUsersRequest
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroupWithOptions(DeleteResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteResourceGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a resource group.</p>
     * 
     * @param request DeleteResourceGroupRequest
     * @return DeleteResourceGroupResponse
     */
    public DeleteResourceGroupResponse deleteResourceGroup(DeleteResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detach a user from a user attribute.</p>
     * 
     * @param request DeleteUserPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserPropertyValueResponse
     */
    public DeleteUserPropertyValueResponse deleteUserPropertyValueWithOptions(DeleteUserPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserPropertyValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detach a user from a user attribute.</p>
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
     * <p>Query group members.</p>
     * 
     * @param request DescribeGroupUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupUserResponse
     */
    public DescribeGroupUserResponse describeGroupUserWithOptions(DescribeGroupUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
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

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroupUser"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query group members.</p>
     * 
     * @param request DescribeGroupUserRequest
     * @return DescribeGroupUserResponse
     */
    public DescribeGroupUserResponse describeGroupUser(DescribeGroupUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query user groups.</p>
     * 
     * @param request DescribeGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroupsWithOptions(DescribeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeAttachedLoginPolicyGroups)) {
            query.put("ExcludeAttachedLoginPolicyGroups", request.excludeAttachedLoginPolicyGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idpId)) {
            query.put("IdpId", request.idpId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loginPolicyId)) {
            query.put("LoginPolicyId", request.loginPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solutionId)) {
            query.put("SolutionId", request.solutionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transferFileNeedApproval)) {
            query.put("TransferFileNeedApproval", request.transferFileNeedApproval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeGroups"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query user groups.</p>
     * 
     * @param request DescribeGroupsRequest
     * @return DescribeGroupsResponse
     */
    public DescribeGroupsResponse describeGroups(DescribeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists virtual MFA devices bound to directory accounts.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            query.put("EndUserIds", request.endUserIds);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMfaDevicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Lists virtual MFA devices bound to directory accounts.</p>
     * 
     * @param request DescribeMfaDevicesRequest
     * @return DescribeMfaDevicesResponse
     */
    public DescribeMfaDevicesResponse describeMfaDevices(DescribeMfaDevicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMfaDevicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Find subordinate organizations.</p>
     * 
     * @param request DescribeOrgByLayerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrgByLayerResponse
     */
    public DescribeOrgByLayerResponse describeOrgByLayerWithOptions(DescribeOrgByLayerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            body.put("OrgName", request.orgName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentOrgId)) {
            body.put("ParentOrgId", request.parentOrgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOrgByLayer"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrgByLayerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Find subordinate organizations.</p>
     * 
     * @param request DescribeOrgByLayerRequest
     * @return DescribeOrgByLayerResponse
     */
    public DescribeOrgByLayerResponse describeOrgByLayer(DescribeOrgByLayerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOrgByLayerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Organizations are arranged in a tree-like structure. The root organization ID is org-aliyun-wy-org-id.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of organizations.</p>
     * 
     * @param tmpReq DescribeOrgsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOrgsResponse
     */
    public DescribeOrgsResponse describeOrgsWithOptions(DescribeOrgsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeOrgsShrinkRequest request = new DescribeOrgsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.showExtras)) {
            request.showExtrasShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.showExtras, "ShowExtras", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeOrgIds)) {
            query.put("IncludeOrgIds", request.includeOrgIds);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.showExtrasShrink)) {
            query.put("ShowExtras", request.showExtrasShrink);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOrgsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Organizations are arranged in a tree-like structure. The root organization ID is org-aliyun-wy-org-id.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of organizations.</p>
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
     * <p>View resource groups.</p>
     * 
     * @param request DescribeResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceGroupsResponse
     */
    public DescribeResourceGroupsResponse describeResourceGroupsWithOptions(DescribeResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunResourceGroupIds)) {
            query.put("AliyunResourceGroupIds", request.aliyunResourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needContainResourceGroupWithOfficeSite)) {
            query.put("NeedContainResourceGroupWithOfficeSite", request.needContainResourceGroupWithOfficeSite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceClassification)) {
            query.put("ResourceClassification", request.resourceClassification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceGroups"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>View resource groups.</p>
     * 
     * @param request DescribeResourceGroupsRequest
     * @return DescribeResourceGroupsResponse
     */
    public DescribeResourceGroupsResponse describeResourceGroups(DescribeResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query user basic information</p>
     * 
     * @param request DescribeUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserResponse
     */
    public DescribeUserResponse describeUserWithOptions(DescribeUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requireExtraAttributes)) {
            query.put("RequireExtraAttributes", request.requireExtraAttributes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUser"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query user basic information</p>
     * 
     * @param request DescribeUserRequest
     * @return DescribeUserResponse
     */
    public DescribeUserResponse describeUser(DescribeUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves directory account information, including the username, email address, and display name.</p>
     * 
     * @param tmpReq DescribeUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUsersResponse
     */
    public DescribeUsersResponse describeUsersWithOptions(DescribeUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeUsersShrinkRequest request = new DescribeUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterMap)) {
            request.filterMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterMap, "FilterMap", "json");
        }

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
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterMapShrink)) {
            query.put("FilterMap", request.filterMapShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeGroupId)) {
            body.put("ExcludeGroupId", request.excludeGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterWithAssignedResourceShrink)) {
            body.put("FilterWithAssignedResource", request.filterWithAssignedResourceShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves directory account information, including the username, email address, and display name.</p>
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
     * <p>Filter account information by user attribute.</p>
     * 
     * @param tmpReq FilterUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FilterUsersResponse
     */
    public FilterUsersResponse filterUsersWithOptions(FilterUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        FilterUsersShrinkRequest request = new FilterUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterMap)) {
            request.filterMapShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterMap, "FilterMap", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderParam)) {
            request.orderParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderParam, "OrderParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeEndUserIds)) {
            query.put("ExcludeEndUserIds", request.excludeEndUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterMapShrink)) {
            query.put("FilterMap", request.filterMapShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDesktopCount)) {
            query.put("IncludeDesktopCount", request.includeDesktopCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDesktopGroupCount)) {
            query.put("IncludeDesktopGroupCount", request.includeDesktopGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeEndUserIds)) {
            query.put("IncludeEndUserIds", request.includeEndUserIds);
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

        if (!com.aliyun.teautil.Common.isUnset(request.showExtras)) {
            query.put("ShowExtras", request.showExtras);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new FilterUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Filter account information by user attribute.</p>
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagerInfoByAuthCodeResponse());
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
     * <p>Initialize the organization ID.</p>
     * 
     * @param request InitTenantAliasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitTenantAliasResponse
     */
    public InitTenantAliasResponse initTenantAliasWithOptions(InitTenantAliasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitTenantAlias"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitTenantAliasResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initialize the organization ID.</p>
     * 
     * @param request InitTenantAliasRequest
     * @return InitTenantAliasResponse
     */
    public InitTenantAliasResponse initTenantAlias(InitTenantAliasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initTenantAliasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of existing user attributes under the current account.</p>
     * 
     * @param request ListPropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listPropertyWithOptions(ListPropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPropertyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of existing user attributes under the current account.</p>
     * 
     * @param request ListPropertyRequest
     * @return ListPropertyResponse
     */
    public ListPropertyResponse listProperty(ListPropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of attribute values for a specific user attribute.</p>
     * 
     * @param request ListPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPropertyValueResponse
     */
    public ListPropertyValueResponse listPropertyValueWithOptions(ListPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPropertyValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the list of attribute values for a specific user attribute.</p>
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
     * <p>After locking, the status of the virtual MFA device changes to LOCKED. When the associated convenience account attempts to log on to a WUYING Terminal through an office network with MFA enabled, authentication will fail due to the locked MFA device, preventing successful logon. You can invoke <a href="~~UnlockMfaDevice~~">UnlockMfaDevice</a> to unlock it.</p>
     * 
     * <b>summary</b> : 
     * <p>Lock the virtual MFA device attached to a convenience account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockMfaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>After locking, the status of the virtual MFA device changes to LOCKED. When the associated convenience account attempts to log on to a WUYING Terminal through an office network with MFA enabled, authentication will fail due to the locked MFA device, preventing successful logon. You can invoke <a href="~~UnlockMfaDevice~~">UnlockMfaDevice</a> to unlock it.</p>
     * 
     * <b>summary</b> : 
     * <p>Lock the virtual MFA device attached to a convenience account.</p>
     * 
     * @param request LockMfaDeviceRequest
     * @return LockMfaDeviceResponse
     */
    public LockMfaDeviceResponse lockMfaDevice(LockMfaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockMfaDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot sign in to Wuying clients, and therefore cannot access any Wuying cloud resources.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> operation to check the lock status of convenience accounts. The <code>Status</code> value in the response is 0 for unlocked accounts and 9 for locked accounts.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Locks one or more convenience accounts. Locked convenience accounts cannot be used to sign in to Wuying clients.</p>
     * 
     * @param request LockUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockUsersResponse
     */
    public LockUsersResponse lockUsersWithOptions(LockUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>For security purposes, you can lock convenience accounts. Locked convenience users cannot sign in to Wuying clients, and therefore cannot access any Wuying cloud resources.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> operation to check the lock status of convenience accounts. The <code>Status</code> value in the response is 0 for unlocked accounts and 9 for locked accounts.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Locks one or more convenience accounts. Locked convenience accounts cannot be used to sign in to Wuying clients.</p>
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
     * <p>Modify the name and description of a group.</p>
     * 
     * @param request ModifyGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyGroupResponse
     */
    public ModifyGroupResponse modifyGroupWithOptions(ModifyGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newGroupName)) {
            query.put("NewGroupName", request.newGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the name and description of a group.</p>
     * 
     * @param request ModifyGroupRequest
     * @return ModifyGroupResponse
     */
    public ModifyGroupResponse modifyGroup(ModifyGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify an organization.</p>
     * 
     * @param request ModifyOrgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyOrgResponse
     */
    public ModifyOrgResponse modifyOrgWithOptions(ModifyOrgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            query.put("OrgId", request.orgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgName)) {
            query.put("OrgName", request.orgName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyOrg"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify an organization.</p>
     * 
     * @param request ModifyOrgRequest
     * @return ModifyOrgResponse
     */
    public ModifyOrgResponse modifyOrg(ModifyOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyOrgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the contact information of a convenience account.</p>
     * 
     * @param request ModifyUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserResponse
     */
    public ModifyUserResponse modifyUserWithOptions(ModifyUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the contact information of a convenience account.</p>
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
     * <p>Shift organization.</p>
     * 
     * @param request MoveOrgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveOrgResponse
     */
    public MoveOrgResponse moveOrgWithOptions(MoveOrgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newParentOrgId)) {
            body.put("NewParentOrgId", request.newParentOrgId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveOrg"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Shift organization.</p>
     * 
     * @param request MoveOrgRequest
     * @return MoveOrgResponse
     */
    public MoveOrgResponse moveOrg(MoveOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveOrgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Shift users to the target organization architecture.</p>
     * 
     * @param request MoveUserOrgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveUserOrgResponse
     */
    public MoveUserOrgResponse moveUserOrgWithOptions(MoveUserOrgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveUserOrg"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveUserOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Shift users to the target organization architecture.</p>
     * 
     * @param request MoveUserOrgRequest
     * @return MoveUserOrgResponse
     */
    public MoveUserOrgResponse moveUserOrg(MoveUserOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveUserOrgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the user synchronization status.</p>
     * 
     * @param request QuerySyncStatusByAliUidRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QuerySyncStatusByAliUidResponse
     */
    public QuerySyncStatusByAliUidResponse querySyncStatusByAliUidWithOptions(QuerySyncStatusByAliUidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new QuerySyncStatusByAliUidResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the user synchronization status.</p>
     * 
     * @param request QuerySyncStatusByAliUidRequest
     * @return QuerySyncStatusByAliUidResponse
     */
    public QuerySyncStatusByAliUidResponse querySyncStatusByAliUid(QuerySyncStatusByAliUidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.querySyncStatusByAliUidWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a group. Supports batch operations.</p>
     * 
     * @param request RemoveGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveGroupResponse
     */
    public RemoveGroupResponse removeGroupWithOptions(RemoveGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupIds)) {
            query.put("GroupIds", request.groupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a group. Supports batch operations.</p>
     * 
     * @param request RemoveGroupRequest
     * @return RemoveGroupResponse
     */
    public RemoveGroupResponse removeGroup(RemoveGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deleting the virtual MFA device attached to a convenience account unbinds the MFA device, which is equivalent to resetting or disabling it. The corresponding convenience account must reattach a new virtual MFA device when logging on to a WUYING Terminal.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete the virtual MFA device attached to a convenience account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveMfaDeviceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deleting the virtual MFA device attached to a convenience account unbinds the MFA device, which is equivalent to resetting or disabling it. The corresponding convenience account must reattach a new virtual MFA device when logging on to a WUYING Terminal.</p>
     * 
     * <b>summary</b> : 
     * <p>Delete the virtual MFA device attached to a convenience account.</p>
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
     * <p>Remove an organization.</p>
     * 
     * @param request RemoveOrgRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveOrgResponse
     */
    public RemoveOrgResponse removeOrgWithOptions(RemoveOrgRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orgId)) {
            body.put("OrgId", request.orgId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveOrg"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveOrgResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove an organization.</p>
     * 
     * @param request RemoveOrgRequest
     * @return RemoveOrgResponse
     */
    public RemoveOrgResponse removeOrg(RemoveOrgRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeOrgWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a set of user attributes.</p>
     * 
     * @param request RemovePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePropertyResponse
     */
    public RemovePropertyResponse removePropertyWithOptions(RemovePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.propertyId)) {
            body.put("PropertyId", request.propertyId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePropertyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete a set of user attributes.</p>
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
     * <p>Delete one or more convenience accounts.</p>
     * 
     * @param request RemoveUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveUsersResponse
     */
    public RemoveUsersResponse removeUsersWithOptions(RemoveUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete one or more convenience accounts.</p>
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
     * <p>Reset the password of a convenience account, including generating a password reset token and sending a password reset email to the mailbox of the convenience account.</p>
     * 
     * @param request ResetUserPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetUserPasswordResponse
     */
    public ResetUserPasswordResponse resetUserPasswordWithOptions(ResetUserPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetUserPasswordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reset the password of a convenience account, including generating a password reset token and sending a password reset email to the mailbox of the convenience account.</p>
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
     * <p>Associate a user attribute with a specific user.</p>
     * 
     * @param request SetUserPropertyValueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetUserPropertyValueResponse
     */
    public SetUserPropertyValueResponse setUserPropertyValueWithOptions(SetUserPropertyValueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetUserPropertyValueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associate a user attribute with a specific user.</p>
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
     * <p>Synchronize all education information.</p>
     * 
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncAllEduInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronize all education information.</p>
     * @return SyncAllEduInfoResponse
     */
    public SyncAllEduInfoResponse syncAllEduInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncAllEduInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将资源转移到资源组中</p>
     * 
     * @param request TransferResourcesIntoGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferResourcesIntoGroupResponse
     */
    public TransferResourcesIntoGroupResponse transferResourcesIntoGroupWithOptions(TransferResourcesIntoGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferResourcesIntoGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferResourcesIntoGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将资源转移到资源组中</p>
     * 
     * @param request TransferResourcesIntoGroupRequest
     * @return TransferResourcesIntoGroupResponse
     */
    public TransferResourcesIntoGroupResponse transferResourcesIntoGroup(TransferResourcesIntoGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferResourcesIntoGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将资源从资源组中转出</p>
     * 
     * @param request TransferResourcesOutofGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TransferResourcesOutofGroupResponse
     */
    public TransferResourcesOutofGroupResponse transferResourcesOutofGroupWithOptions(TransferResourcesOutofGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resources)) {
            query.put("Resources", request.resources);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceGroupId)) {
            query.put("TargetResourceGroupId", request.targetResourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TransferResourcesOutofGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TransferResourcesOutofGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>将资源从资源组中转出</p>
     * 
     * @param request TransferResourcesOutofGroupRequest
     * @return TransferResourcesOutofGroupResponse
     */
    public TransferResourcesOutofGroupResponse transferResourcesOutofGroup(TransferResourcesOutofGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.transferResourcesOutofGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unlock the virtual MFA device attached to a convenience account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockMfaDeviceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unlock the virtual MFA device attached to a convenience account.</p>
     * 
     * @param request UnlockMfaDeviceRequest
     * @return UnlockMfaDeviceResponse
     */
    public UnlockMfaDeviceResponse unlockMfaDevice(UnlockMfaDeviceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockMfaDeviceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Locked convenience accounts cannot log on to WUYING Terminal and therefore cannot access any WUYING cloud resources. To allow a convenience account to log on to WUYING Terminal, you must first unlock it.  </p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the value of <code>Status</code> in the returned data is 0, the convenience account is not locked. If the value of <code>Status</code> is 9, the convenience account is locked.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unlock one or more convenience accounts. After being unlocked, the convenience accounts can log on to WUYING Terminal.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockUsersResponse());
    }

    /**
     * <b>description</b> :
     * <p>Locked convenience accounts cannot log on to WUYING Terminal and therefore cannot access any WUYING cloud resources. To allow a convenience account to log on to WUYING Terminal, you must first unlock it.  </p>
     * <blockquote>
     * <p>You can invoke <a href="https://help.aliyun.com/document_detail/283609.html">DescribeUsers</a> to query convenience account information. If the value of <code>Status</code> in the returned data is 0, the convenience account is not locked. If the value of <code>Status</code> is 9, the convenience account is locked.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Unlock one or more convenience accounts. After being unlocked, the convenience accounts can log on to WUYING Terminal.</p>
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
     * <p>Modify User Attributes.</p>
     * 
     * @param request UpdatePropertyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updatePropertyWithOptions(UpdatePropertyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            query.put("BusinessChannel", request.businessChannel);
        }

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
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePropertyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify User Attributes.</p>
     * 
     * @param request UpdatePropertyRequest
     * @return UpdatePropertyResponse
     */
    public UpdatePropertyResponse updateProperty(UpdatePropertyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updatePropertyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Add users to a group in batch.</p>
     * 
     * @param request UserBatchJoinGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UserBatchJoinGroupResponse
     */
    public UserBatchJoinGroupResponse userBatchJoinGroupWithOptions(UserBatchJoinGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserBatchJoinGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserBatchJoinGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Add users to a group in batch.</p>
     * 
     * @param request UserBatchJoinGroupRequest
     * @return UserBatchJoinGroupResponse
     */
    public UserBatchJoinGroupResponse userBatchJoinGroup(UserBatchJoinGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.userBatchJoinGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Remove users from a group in batch.</p>
     * 
     * @param request UserBatchQuitGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UserBatchQuitGroupResponse
     */
    public UserBatchQuitGroupResponse userBatchQuitGroupWithOptions(UserBatchQuitGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessChannel)) {
            body.put("BusinessChannel", request.businessChannel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserIds)) {
            body.put("EndUserIds", request.endUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UserBatchQuitGroup"),
            new TeaPair("version", "2021-03-08"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UserBatchQuitGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Remove users from a group in batch.</p>
     * 
     * @param request UserBatchQuitGroupRequest
     * @return UserBatchQuitGroupResponse
     */
    public UserBatchQuitGroupResponse userBatchQuitGroup(UserBatchQuitGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.userBatchQuitGroupWithOptions(request, runtime);
    }
}
