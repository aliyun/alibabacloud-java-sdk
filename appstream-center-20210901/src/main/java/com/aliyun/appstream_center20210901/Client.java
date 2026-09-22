// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901;

import com.aliyun.tea.*;
import com.aliyun.appstream_center20210901.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("appstream-center", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Sets the execution time for an OTA upgrade.</p>
     * 
     * @param request ApproveOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveOtaTaskResponse
     */
    public ApproveOtaTaskResponse approveOtaTaskWithOptions(ApproveOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaType)) {
            body.put("OtaType", request.otaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveOtaTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets the execution time for an OTA upgrade.</p>
     * 
     * @param request ApproveOtaTaskRequest
     * @return ApproveOtaTaskResponse
     */
    public ApproveOtaTaskResponse approveOtaTask(ApproveOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns secondary private IP addresses to a development host.</p>
     * 
     * @param request AssignWuyingServerPrivateAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignWuyingServerPrivateAddressesResponse
     */
    public AssignWuyingServerPrivateAddressesResponse assignWuyingServerPrivateAddressesWithOptions(AssignWuyingServerPrivateAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.secondaryPrivateIpAddressCount)) {
            body.put("SecondaryPrivateIpAddressCount", request.secondaryPrivateIpAddressCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignWuyingServerPrivateAddresses"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignWuyingServerPrivateAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns secondary private IP addresses to a development host.</p>
     * 
     * @param request AssignWuyingServerPrivateAddressesRequest
     * @return AssignWuyingServerPrivateAddressesResponse
     */
    public AssignWuyingServerPrivateAddressesResponse assignWuyingServerPrivateAddresses(AssignWuyingServerPrivateAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignWuyingServerPrivateAddressesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you change assigned users, the selected users receive notification emails. Changes typically take about 2 minutes to take effect on the client.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes assigned users for a delivery group. Only users added as assigned users can access cloud applications.</p>
     * 
     * @param tmpReq AuthorizeInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeInstanceGroupResponse
     */
    public AuthorizeInstanceGroupResponse authorizeInstanceGroupWithOptions(AuthorizeInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuthorizeInstanceGroupShrinkRequest request = new AuthorizeInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userMeta)) {
            request.userMetaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userMeta, "UserMeta", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserGroupIds)) {
            bodyFlat.put("AuthorizeUserGroupIds", request.authorizeUserGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserIds)) {
            bodyFlat.put("AuthorizeUserIds", request.authorizeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.avatarId)) {
            body.put("AvatarId", request.avatarId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserGroupIds)) {
            bodyFlat.put("UnAuthorizeUserGroupIds", request.unAuthorizeUserGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserIds)) {
            bodyFlat.put("UnAuthorizeUserIds", request.unAuthorizeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMetaShrink)) {
            body.put("UserMeta", request.userMetaShrink);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you change assigned users, the selected users receive notification emails. Changes typically take about 2 minutes to take effect on the client.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes assigned users for a delivery group. Only users added as assigned users can access cloud applications.</p>
     * 
     * @param request AuthorizeInstanceGroupRequest
     * @return AuthorizeInstanceGroupResponse
     */
    public AuthorizeInstanceGroupResponse authorizeInstanceGroup(AuthorizeInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation manages user authorization for a delivery group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization of other applications in the delivery group. To authorize users for an entire delivery group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>the application specified by AppId is deployed in the image used by the delivery group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The delivery group <strong>has not been added to a delivery group set that is in effect</strong>. A delivery group that has been added to a set cannot be authorized individually. You must authorize it through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the delivery group belongs is an Active Directory (AD) workspace, <strong>you must specify UserMeta</strong>, with <code>UserMeta.Type</code> set to <code>ad</code> and <code>UserMeta.AdDomain</code> matching the AD domain bound to the workspace.</li>
     * <li>If the delivery group has been authorized through user groups and mixed authorization of users and user groups is not supported, you cannot authorize by user. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified.</strong> You can also specify both. If both are empty, this invocation does not change any authorization.</li>
     * <li>When adding authorizations, the sum of the currently authorized users for the application and the users to be added cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorizations is not subject to quota limits.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications in the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or unauthorized.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users receive a notification email. It typically takes about 2 minutes for the change to take effect on the client.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes authorized users for a specified application deployed in a delivery group. Only authorized users can access the application.</p>
     * 
     * @param tmpReq AuthorizeUsersForAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeUsersForAppResponse
     */
    public AuthorizeUsersForAppResponse authorizeUsersForAppWithOptions(AuthorizeUsersForAppRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AuthorizeUsersForAppShrinkRequest request = new AuthorizeUsersForAppShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userMeta)) {
            request.userMetaShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userMeta, "UserMeta", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authorizeUserIds)) {
            body.put("AuthorizeUserIds", request.authorizeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unAuthorizeUserIds)) {
            body.put("UnAuthorizeUserIds", request.unAuthorizeUserIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userMetaShrink)) {
            body.put("UserMeta", request.userMetaShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeUsersForApp"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeUsersForAppResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation manages user authorization for a delivery group at the application level. The authorization result applies only to the application specified by AppId and does not affect the authorization of other applications in the delivery group. To authorize users for an entire delivery group, call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>the application specified by AppId is deployed in the image used by the delivery group</strong>. Otherwise, the error code <code>InvalidAppId.NotFound</code> is returned.</li>
     * <li>The delivery group <strong>has not been added to a delivery group set that is in effect</strong>. A delivery group that has been added to a set cannot be authorized individually. You must authorize it through the set. Otherwise, the error code <code>InvalidAppInstanceGroup.AuthorizeBlockedBySet</code> is returned.</li>
     * <li>If the workspace to which the delivery group belongs is an Active Directory (AD) workspace, <strong>you must specify UserMeta</strong>, with <code>UserMeta.Type</code> set to <code>ad</code> and <code>UserMeta.AdDomain</code> matching the AD domain bound to the workspace.</li>
     * <li>If the delivery group has been authorized through user groups and mixed authorization of users and user groups is not supported, you cannot authorize by user. Otherwise, the error code <code>AuthAppInstanceGroup.MixNotSupported</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>At least one of AuthorizeUserIds and UnAuthorizeUserIds must be specified.</strong> You can also specify both. If both are empty, this invocation does not change any authorization.</li>
     * <li>When adding authorizations, the sum of the currently authorized users for the application and the users to be added cannot exceed the authorized user quota for the application. If the quota is exceeded, the error code <code>ExceedAppAuthUserQuota</code> is returned. Removing authorizations is not subject to quota limits.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications in the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the usernames of the users to be authorized or unauthorized.</li>
     * <li>Call this operation to complete the authorization change.<blockquote>
     * <p>After the authorization is changed, the selected users receive a notification email. It typically takes about 2 minutes for the change to take effect on the client.</p>
     * </blockquote>
     * </li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Adds or removes authorized users for a specified application deployed in a delivery group. Only authorized users can access the application.</p>
     * 
     * @param request AuthorizeUsersForAppRequest
     * @return AuthorizeUsersForAppResponse
     */
    public AuthorizeUsersForAppResponse authorizeUsersForApp(AuthorizeUsersForAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeUsersForAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can batch create model templates under a model provider template in the Wuying Agent Management Center. Multiple models can be added at a time, and one of them can be specified as the default model. Existing models are automatically skipped and not created again.
     * Before using this operation, make sure you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates LLM templates in batches.</p>
     * 
     * @param request BatchCreateLlmTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateLlmTemplatesResponse
     */
    public BatchCreateLlmTemplatesResponse batchCreateLlmTemplatesWithOptions(BatchCreateLlmTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmTemplateItems)) {
            body.put("LlmTemplateItems", request.llmTemplateItems);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            body.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            body.put("ProviderTemplateId", request.providerTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateLlmTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateLlmTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can batch create model templates under a model provider template in the Wuying Agent Management Center. Multiple models can be added at a time, and one of them can be specified as the default model. Existing models are automatically skipped and not created again.
     * Before using this operation, make sure you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates LLM templates in batches.</p>
     * 
     * @param request BatchCreateLlmTemplatesRequest
     * @return BatchCreateLlmTemplatesResponse
     */
    public BatchCreateLlmTemplatesResponse batchCreateLlmTemplates(BatchCreateLlmTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchCreateLlmTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resources that belong to agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. The model group serves as the inference engine for agents within the resource group to execute tasks.
     * When an agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the agent runtime setting.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the model group for a resource group.</p>
     * 
     * @param request ConfigResourceGroupModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigResourceGroupModelTemplateResponse
     */
    public ConfigResourceGroupModelTemplateResponse configResourceGroupModelTemplateWithOptions(ConfigResourceGroupModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            body.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigResourceGroupModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigResourceGroupModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can assign a model group to the resources that belong to agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. The model group serves as the inference engine for agents within the resource group to execute tasks.
     * When an agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the agent runtime setting.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the model group for a resource group.</p>
     * 
     * @param request ConfigResourceGroupModelTemplateRequest
     * @return ConfigResourceGroupModelTemplateResponse
     */
    public ConfigResourceGroupModelTemplateResponse configResourceGroupModelTemplate(ConfigResourceGroupModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configResourceGroupModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure third-party channels for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended Agent communication methods beyond the AgentIM channel.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a third-party channel for Agent runtime.</p>
     * 
     * @param request ConfigRuntimeChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigRuntimeChannelResponse
     */
    public ConfigRuntimeChannelResponse configRuntimeChannelWithOptions(ConfigRuntimeChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            body.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            body.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configMode)) {
            body.put("ConfigMode", request.configMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeIds)) {
            body.put("RuntimeIds", request.runtimeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigRuntimeChannel"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigRuntimeChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can configure third-party channels for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. These channels serve as extended Agent communication methods beyond the AgentIM channel.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures a third-party channel for Agent runtime.</p>
     * 
     * @param request ConfigRuntimeChannelRequest
     * @return ConfigRuntimeChannelResponse
     */
    public ConfigRuntimeChannelResponse configRuntimeChannel(ConfigRuntimeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configRuntimeChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. The model groups serve as inference engines for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures model groups for Agent runtime resources.</p>
     * 
     * @param request ConfigRuntimeModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigRuntimeModelTemplateResponse
     */
    public ConfigRuntimeModelTemplateResponse configRuntimeModelTemplateWithOptions(ConfigRuntimeModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            body.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeIds)) {
            body.put("RuntimeIds", request.runtimeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigRuntimeModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigRuntimeModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. The model groups serve as inference engines for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures model groups for Agent runtime resources.</p>
     * 
     * @param request ConfigRuntimeModelTemplateRequest
     * @return ConfigRuntimeModelTemplateResponse
     */
    public ConfigRuntimeModelTemplateResponse configRuntimeModelTemplate(ConfigRuntimeModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configRuntimeModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING CloudApp.
     * A delivery group is a logical grouping for delivering cloud applications to end users. It includes the underlying cloud application resources, images that contain cloud applications, resource management policies, and user allocation settings. For details, see <a href="https://help.aliyun.com/document_detail/426046.html">Publish a delivery group</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery group.</p>
     * 
     * @param tmpReq CreateAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAppInstanceGroupResponse
     */
    public CreateAppInstanceGroupResponse createAppInstanceGroupWithOptions(CreateAppInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAppInstanceGroupShrinkRequest request = new CreateAppInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.runtimePolicy)) {
            request.runtimePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.runtimePolicy, "RuntimePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userDefinePolicy)) {
            request.userDefinePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userDefinePolicy, "UserDefinePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoPolicy)) {
            request.videoPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoPolicy, "VideoPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.userDefinePolicyShrink)) {
            query.put("UserDefinePolicy", request.userDefinePolicyShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            body.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            body.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appPackageType)) {
            body.put("AppPackageType", request.appPackageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appPolicyId)) {
            body.put("AppPolicyId", request.appPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authMode)) {
            body.put("AuthMode", request.authMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeResourceMode)) {
            body.put("ChargeResourceMode", request.chargeResourceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            body.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenAppId)) {
            body.put("PreOpenAppId", request.preOpenAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimePolicyShrink)) {
            body.put("RuntimePolicy", request.runtimePolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            body.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            body.put("SessionTimeout", request.sessionTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPayType)) {
            body.put("SubPayType", request.subPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            body.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPolicyShrink)) {
            body.put("VideoPolicy", request.videoPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAppInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING CloudApp.
     * A delivery group is a logical grouping for delivering cloud applications to end users. It includes the underlying cloud application resources, images that contain cloud applications, resource management policies, and user allocation settings. For details, see <a href="https://help.aliyun.com/document_detail/426046.html">Publish a delivery group</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery group.</p>
     * 
     * @param request CreateAppInstanceGroupRequest
     * @return CreateAppInstanceGroupResponse
     */
    public CreateAppInstanceGroupResponse createAppInstanceGroup(CreateAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Prepare an available office network, image, and instance type in the target business region. Make sure that the account has the required browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. Set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and must match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot both be non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>Set <code>SubPayType</code> to <code>mau</code> explicitly. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>Do not specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful response does not indicate that the browser resources are ready.</strong> After creation, query the browser group status and confirm that the group is connectable before use.
     * This operation creates a new cloud browser group. You do not need to create a delivery group in advance.</p>
     * <h2>Example description</h2>
     * <p>The example values of fields are provided to demonstrate how to specify the fields. Replace resource identifiers with actual values under your account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field does not need to be specified. Omit the corresponding parameter when you call the operation. Do not pass the character <code>-</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud browser group that is billed by monthly active users (MAU).</p>
     * 
     * @param tmpReq CreateBrowserInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBrowserInstanceGroupResponse
     */
    public CreateBrowserInstanceGroupResponse createBrowserInstanceGroupWithOptions(CreateBrowserInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateBrowserInstanceGroupShrinkRequest request = new CreateBrowserInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.browserConfig)) {
            request.browserConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.browserConfig, "BrowserConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policy)) {
            request.policyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policy, "Policy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timers)) {
            request.timersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timers, "Timers", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.userInfo)) {
            request.userInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.userInfo, "UserInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.users)) {
            request.usersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.users, "Users", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appPackageType)) {
            body.put("AppPackageType", request.appPackageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authNotificationEnabled)) {
            body.put("AuthNotificationEnabled", request.authNotificationEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserConfigShrink)) {
            body.put("BrowserConfig", request.browserConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeResourceMode)) {
            body.put("ChargeResourceMode", request.chargeResourceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudBrowserName)) {
            body.put("CloudBrowserName", request.cloudBrowserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAmount)) {
            body.put("MaxAmount", request.maxAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            body.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyShrink)) {
            body.put("Policy", request.policyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            body.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPayType)) {
            body.put("SubPayType", request.subPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            body.put("Tag", request.tagShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timersShrink)) {
            body.put("Timers", request.timersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            body.put("UserGroupIds", request.userGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userInfoShrink)) {
            body.put("UserInfo", request.userInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usersShrink)) {
            body.put("Users", request.usersShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBrowserInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBrowserInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Prepare an available office network, image, and instance type in the target business region. Make sure that the account has the required browser configurations and resource quotas.</li>
     * <li>Specify <code>CloudBrowserName</code> and <code>BizRegionId</code>. Set <code>OsType</code> to <code>Windows</code>.</li>
     * <li>Authorized users must be created in advance and must match the account type. Authorized user groups must belong to the current account and match the account type of the office network.</li>
     * <li><strong><code>Users</code> and <code>UserGroupIds</code> cannot both be non-empty.</strong></li>
     * </ul>
     * <h2>MAU billing parameters</h2>
     * <ul>
     * <li>Set <code>ChargeType</code> to <code>PostPaid</code>.</li>
     * <li><strong>Set <code>SubPayType</code> to <code>mau</code> explicitly. Omitting this field does not enable MAU billing.</strong></li>
     * <li>Set <code>ChargeResourceMode</code> to <code>AppInstance</code>.</li>
     * <li>Do not specify <code>Period</code>, <code>PeriodUnit</code>, <code>AppPackageType</code>, <code>AutoPay</code>, <code>AutoRenew</code>, or <code>NodePool</code>.</li>
     * </ul>
     * <h2>Post-call processing</h2>
     * <p><strong>A successful response does not indicate that the browser resources are ready.</strong> After creation, query the browser group status and confirm that the group is connectable before use.
     * This operation creates a new cloud browser group. You do not need to create a delivery group in advance.</p>
     * <h2>Example description</h2>
     * <p>The example values of fields are provided to demonstrate how to specify the fields. Replace resource identifiers with actual values under your account. Capacity examples do not represent default values or upper limits.
     * An example value of <code>-</code> indicates that the field does not need to be specified. Omit the corresponding parameter when you call the operation. Do not pass the character <code>-</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a cloud browser group that is billed by monthly active users (MAU).</p>
     * 
     * @param request CreateBrowserInstanceGroupRequest
     * @return CreateBrowserInstanceGroupResponse
     */
    public CreateBrowserInstanceGroupResponse createBrowserInstanceGroup(CreateBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom image from a deployed WUYING instance. You can use the custom image to quickly create more WUYING instances with the same configurations, without having to repeatedly configure the instance environment each time.</p>
     * 
     * @param request CreateImageByInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageByInstanceResponse
     */
    public CreateImageByInstanceResponse createImageByInstanceWithOptions(CreateImageByInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("TagList", request.tagList);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoCleanUserdata)) {
            body.put("AutoCleanUserdata", request.autoCleanUserdata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.copyProfile)) {
            body.put("CopyProfile", request.copyProfile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            body.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subInstanceId)) {
            body.put("SubInstanceId", request.subInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageByInstance"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageByInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom image from a deployed WUYING instance. You can use the custom image to quickly create more WUYING instances with the same configurations, without having to repeatedly configure the instance environment each time.</p>
     * 
     * @param request CreateImageByInstanceRequest
     * @return CreateImageByInstanceResponse
     */
    public CreateImageByInstanceResponse createImageByInstance(CreateImageByInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageByInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new image from a debug delivery group.</p>
     * 
     * @param request CreateImageFromAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageFromAppInstanceGroupResponse
     */
    public CreateImageFromAppInstanceGroupResponse createImageFromAppInstanceGroupWithOptions(CreateImageFromAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageName)) {
            body.put("AppCenterImageName", request.appCenterImageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImageFromAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageFromAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new image from a debug delivery group.</p>
     * 
     * @param request CreateImageFromAppInstanceGroupRequest
     * @return CreateImageFromAppInstanceGroupResponse
     */
    public CreateImageFromAppInstanceGroupResponse createImageFromAppInstanceGroup(CreateImageFromAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageFromAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create a model provider template under Model Templates in the WUYING Agent Management Center. This template is used to configure connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that an Agent can invoke. After model creation, the model provider template is automatically associated with the specified model template.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before you invoke this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model provider template for model creation.</p>
     * 
     * @param request CreateModelProviderTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelProviderTemplateResponse
     */
    public CreateModelProviderTemplateResponse createModelProviderTemplateWithOptions(CreateModelProviderTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWuyingProxy)) {
            query.put("EnableWuyingProxy", request.enableWuyingProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            query.put("ProviderName", request.providerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerType)) {
            query.put("ProviderType", request.providerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelProviderTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelProviderTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create a model provider template under Model Templates in the WUYING Agent Management Center. This template is used to configure connection information and keys for model services (such as Alibaba Cloud Bailian, Token Plan, and Moonshot) that an Agent can invoke. After model creation, the model provider template is automatically associated with the specified model template.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before you invoke this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model provider template for model creation.</p>
     * 
     * @param request CreateModelProviderTemplateRequest
     * @return CreateModelProviderTemplateResponse
     */
    public CreateModelProviderTemplateResponse createModelProviderTemplate(CreateModelProviderTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelProviderTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can create a model group in the Wuying Agent Management Center to manage the model providers and model scope that an Agent can invoke. After model creation, you can attach the model group to a cloud computer as the inference engine configuration for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before invoking this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model template.</p>
     * 
     * @param request CreateModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateModelTemplateResponse
     */
    public CreateModelTemplateResponse createModelTemplateWithOptions(CreateModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refScope)) {
            query.put("RefScope", request.refScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can create a model group in the Wuying Agent Management Center to manage the model providers and model scope that an Agent can invoke. After model creation, you can attach the model group to a cloud computer as the inference engine configuration for Agent task execution.
     * Make sure that you are familiar with the operations and usage of the Wuying Agent Management Center before invoking this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a model template.</p>
     * 
     * @param request CreateModelTemplateRequest
     * @return CreateModelTemplateResponse
     */
    public CreateModelTemplateResponse createModelTemplate(CreateModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>A project corresponds to the resource configuration module in the CloudFlow console.</li>
     * <li>When the ContentId input parameter has multiple versions, this API <notice>uses the default version</notice> and bindss it at the same time.</li>
     * <li>This operation succeeds only when the default version of the Content is in an available state.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more workstations.</p>
     * 
     * @param request CreateWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWuyingServerResponse
     */
    public CreateWuyingServerResponse createWuyingServerWithOptions(CreateWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            body.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            body.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            bodyFlat.put("DataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erdmaEnabled)) {
            body.put("ErdmaEnabled", request.erdmaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuDriverVersion)) {
            body.put("GpuDriverVersion", request.gpuDriverVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            body.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idempotenceToken)) {
            body.put("IdempotenceToken", request.idempotenceToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPrice)) {
            body.put("MaxPrice", request.maxPrice);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkStrategyType)) {
            body.put("NetworkStrategyType", request.networkStrategyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            body.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.savingPlanId)) {
            body.put("SavingPlanId", request.savingPlanId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverInstanceType)) {
            body.put("ServerInstanceType", request.serverInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverPortRange)) {
            body.put("ServerPortRange", request.serverPortRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subPayType)) {
            body.put("SubPayType", request.subPayType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskCategory)) {
            body.put("SystemDiskCategory", request.systemDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskPerformanceLevel)) {
            body.put("SystemDiskPerformanceLevel", request.systemDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            body.put("SystemDiskSize", request.systemDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIds)) {
            body.put("VSwitchIds", request.vSwitchIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodePoolId)) {
            body.put("VirtualNodePoolId", request.virtualNodePoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerName)) {
            body.put("WuyingServerName", request.wuyingServerName);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWuyingServerResponse());
    }

    /**
     * <b>description</b> :
     * <ol>
     * <li>A project corresponds to the resource configuration module in the CloudFlow console.</li>
     * <li>When the ContentId input parameter has multiple versions, this API <notice>uses the default version</notice> and bindss it at the same time.</li>
     * <li>This operation succeeds only when the default version of the Content is in an available state.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates one or more workstations.</p>
     * 
     * @param request CreateWuyingServerRequest
     * @return CreateWuyingServerResponse
     */
    public CreateWuyingServerResponse createWuyingServer(CreateWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not support deleting delivery groups that use subscription resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a pay-as-you-go delivery group of the resource-based type.</p>
     * 
     * @param request DeleteAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstanceGroupResponse
     */
    public DeleteAppInstanceGroupResponse deleteAppInstanceGroupWithOptions(DeleteAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation does not support deleting delivery groups that use subscription resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes a pay-as-you-go delivery group of the resource-based type.</p>
     * 
     * @param request DeleteAppInstanceGroupRequest
     * @return DeleteAppInstanceGroupResponse
     */
    public DeleteAppInstanceGroupResponse deleteAppInstanceGroup(DeleteAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only instances in the initializing or idle state can be deleted. This operation is available only to specific customers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application instance.</p>
     * 
     * @param request DeleteAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAppInstancesResponse
     */
    public DeleteAppInstancesResponse deleteAppInstancesWithOptions(DeleteAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceIds)) {
            body.put("AppInstanceIds", request.appInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAppInstances"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAppInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only instances in the initializing or idle state can be deleted. This operation is available only to specific customers.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specified application instance.</p>
     * 
     * @param request DeleteAppInstancesRequest
     * @return DeleteAppInstancesResponse
     */
    public DeleteAppInstancesResponse deleteAppInstances(DeleteAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete only custom images that belong to your account.</li>
     * <li>For images associated with WUYING Cloud Computer Pool, WUYING Cloud Application, or WUYING Workspace product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING Cloud Desktop template references an image, the template is also deleted when the image is deleted.</li>
     * <li>For images that span multiple regions, deleting the image removes the image from all regions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom WUYING image.</p>
     * 
     * @param request DeleteImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li>You can delete only custom images that belong to your account.</li>
     * <li>For images associated with WUYING Cloud Computer Pool, WUYING Cloud Application, or WUYING Workspace product lines, ensure that no WUYING instances are using the image before you delete it.</li>
     * <li>If a WUYING Cloud Desktop template references an image, the template is also deleted when the image is deleted.</li>
     * <li>For images that span multiple regions, deleting the image removes the image from all regions.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a custom WUYING image.</p>
     * 
     * @param request DeleteImageRequest
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model template that has been created under a model service provider template in the WUYING Agent Management Center. Before deletion, ensure that the model is not the default model of an associated model group. Otherwise, the deletion fails. After deletion, the model configurations of associated cloud computers are automatically refreshed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an LLM template.</p>
     * 
     * @param request DeleteLlmTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLlmTemplateResponse
     */
    public DeleteLlmTemplateResponse deleteLlmTemplateWithOptions(DeleteLlmTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.llmTemplateId)) {
            query.put("LlmTemplateId", request.llmTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLlmTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLlmTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model template that has been created under a model service provider template in the WUYING Agent Management Center. Before deletion, ensure that the model is not the default model of an associated model group. Otherwise, the deletion fails. After deletion, the model configurations of associated cloud computers are automatically refreshed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an LLM template.</p>
     * 
     * @param request DeleteLlmTemplateRequest
     * @return DeleteLlmTemplateResponse
     */
    public DeleteLlmTemplateResponse deleteLlmTemplate(DeleteLlmTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLlmTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model provider template that has been created under model templates in the WUYING Agent Management Center. Before deletion, ensure that the model provider is not the provider of the default model and is not a system preset type provider (such as WUYING credit package). After deletion, the associated models and key configurations are also removed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model provider template.</p>
     * 
     * @param request DeleteModelProviderTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelProviderTemplateResponse
     */
    public DeleteModelProviderTemplateResponse deleteModelProviderTemplateWithOptions(DeleteModelProviderTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            query.put("ProviderTemplateId", request.providerTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelProviderTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelProviderTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model provider template that has been created under model templates in the WUYING Agent Management Center. Before deletion, ensure that the model provider is not the provider of the default model and is not a system preset type provider (such as WUYING credit package). After deletion, the associated models and key configurations are also removed.
     * Before using this operation, make sure you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model provider template.</p>
     * 
     * @param request DeleteModelProviderTemplateRequest
     * @return DeleteModelProviderTemplateResponse
     */
    public DeleteModelProviderTemplateResponse deleteModelProviderTemplate(DeleteModelProviderTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelProviderTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model group that has been created in the WUYING Agent Management Center. Before deletion, ensure that the template has not been authorized to any resource. Otherwise, the deletion fails. After deletion, the model providers and models under the model group are also removed.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model template.</p>
     * 
     * @param request DeleteModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteModelTemplateResponse
     */
    public DeleteModelTemplateResponse deleteModelTemplateWithOptions(DeleteModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete a model group that has been created in the WUYING Agent Management Center. Before deletion, ensure that the template has not been authorized to any resource. Otherwise, the deletion fails. After deletion, the model providers and models under the model group are also removed.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a model template.</p>
     * 
     * @param request DeleteModelTemplateRequest
     * @return DeleteModelTemplateResponse
     */
    public DeleteModelTemplateResponse deleteModelTemplate(DeleteModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * @param request DeleteWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWuyingServerResponse
     */
    public DeleteWuyingServerResponse deleteWuyingServerWithOptions(DeleteWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWuyingServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a cloud graphics workstation.</p>
     * 
     * @param request DeleteWuyingServerRequest
     * @return DeleteWuyingServerResponse
     */
    public DeleteWuyingServerResponse deleteWuyingServer(DeleteWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures SLS log delivery.</p>
     * 
     * @param request DeliverToUserSlsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeliverToUserSlsResponse
     */
    public DeliverToUserSlsResponse deliverToUserSlsWithOptions(DeliverToUserSlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryScopes)) {
            bodyFlat.put("DeliveryScopes", request.deliveryScopes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.existedProjectName)) {
            body.put("ExistedProjectName", request.existedProjectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logStoreName)) {
            body.put("LogStoreName", request.logStoreName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectName)) {
            body.put("ProjectName", request.projectName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsRegionId)) {
            body.put("SlsRegionId", request.slsRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ttl)) {
            body.put("Ttl", request.ttl);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeliverToUserSls"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeliverToUserSlsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures SLS log delivery.</p>
     * 
     * @param request DeliverToUserSlsRequest
     * @return DeliverToUserSlsResponse
     */
    public DeliverToUserSlsResponse deliverToUserSls(DeliverToUserSlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deliverToUserSlsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a development host.</p>
     * 
     * @param request DescribeWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWuyingServerResponse
     */
    public DescribeWuyingServerResponse describeWuyingServerWithOptions(DescribeWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWuyingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a development host.</p>
     * 
     * @param request DescribeWuyingServerRequest
     * @return DescribeWuyingServerResponse
     */
    public DescribeWuyingServerResponse describeWuyingServer(DescribeWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic IP Address (EIP) information of a Wuying workspace.</p>
     * 
     * @param request DescribeWuyingServerEipInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWuyingServerEipInfoResponse
     */
    public DescribeWuyingServerEipInfoResponse describeWuyingServerEipInfoWithOptions(DescribeWuyingServerEipInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            body.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWuyingServerEipInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWuyingServerEipInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic IP Address (EIP) information of a Wuying workspace.</p>
     * 
     * @param request DescribeWuyingServerEipInfoRequest
     * @return DescribeWuyingServerEipInfoResponse
     */
    public DescribeWuyingServerEipInfoResponse describeWuyingServerEipInfo(DescribeWuyingServerEipInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWuyingServerEipInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified delivery group.</p>
     * 
     * @param request GetAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAppInstanceGroupResponse
     */
    public GetAppInstanceGroupResponse getAppInstanceGroupWithOptions(GetAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified delivery group.</p>
     * 
     * @param request GetAppInstanceGroupRequest
     * @return GetAppInstanceGroupResponse
     */
    public GetAppInstanceGroupResponse getAppInstanceGroup(GetAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the cloud browser group ID under the current account. Call <code>ListBrowserInstanceGroup</code> to retrieve the ID.</p>
     * <h2>Response</h2>
     * <p>The response includes the current configuration, status, and authorization statistics of the browser group. The details return up to 20 bookmarks and 20 website access entries. To retrieve the complete lists, call <code>ListBrowserBookmarks</code> and <code>ListBrowserRestrictedURLs</code>.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After you read the returned status, perform the connection or management operation that corresponds to the status.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> value in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual string returned by the operation. Sample resource IDs are masked. Use the actual query results when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration, status, and authorization statistics of a specified cloud browser group.</p>
     * 
     * @param request GetBrowserInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBrowserInstanceGroupResponse
     */
    public GetBrowserInstanceGroupResponse getBrowserInstanceGroupWithOptions(GetBrowserInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBrowserInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBrowserInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes the query usage for the monthly active user (MAU) billing scenario.</p>
     * <h2>Before you begin</h2>
     * <p>Obtain the cloud browser group ID under the current account. Call <code>ListBrowserInstanceGroup</code> to retrieve the ID.</p>
     * <h2>Response</h2>
     * <p>The response includes the current configuration, status, and authorization statistics of the browser group. The details return up to 20 bookmarks and 20 website access entries. To retrieve the complete lists, call <code>ListBrowserBookmarks</code> and <code>ListBrowserRestrictedURLs</code>.</p>
     * <h2>What to do next</h2>
     * <p>This operation only queries configurations and does not modify resources. After you read the returned status, perform the connection or management operation that corresponds to the status.</p>
     * <h2>Example description</h2>
     * <p>The <code>-</code> value in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual string returned by the operation. Sample resource IDs are masked. Use the actual query results when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration, status, and authorization statistics of a specified cloud browser group.</p>
     * 
     * @param request GetBrowserInstanceGroupRequest
     * @return GetBrowserInstanceGroupResponse
     */
    public GetBrowserInstanceGroupResponse getBrowserInstanceGroup(GetBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Call protocol description: operation_type: polling, required_steps: 1.
     * This operation may require multiple calls (at least one) to obtain the connection credential.
     * On the first call, an application instance is allocated to the specified convenience account and the application is started. If a Ticket is returned, the result is obtained synchronously. If a startup task ID (<code>TaskId</code>) is returned, subsequent calls are required.
     * On subsequent calls, include the <code>TaskId</code> request parameter to invoke the operation and query whether the node is complete. When the returned node status (<code>TaskStatus</code>) is completed (<code>Finished</code>), the connection credential (<code>Ticket</code>) is also returned.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before calling this operation, make sure that you have created a delivery group and authorized users for the delivery group:</li>
     * <li><ol>
     * <li>The API for creating a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup operation to query the list of delivery groups. If the corresponding delivery group is not found, verify that the delivery group has been created and that the authentication credentials belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API for authorizing users for a delivery group is AuthorizeInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credential for a cloud application.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicketWithOptions(GetConnectionTicketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessType)) {
            body.put("AccessType", request.accessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIdList)) {
            body.put("AppInstanceGroupIdList", request.appInstanceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appPolicyId)) {
            body.put("AppPolicyId", request.appPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appStartParam)) {
            body.put("AppStartParam", request.appStartParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersion)) {
            body.put("AppVersion", request.appVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.environmentConfig)) {
            body.put("EnvironmentConfig", request.environmentConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConnectionTicket"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConnectionTicketResponse());
    }

    /**
     * <b>description</b> :
     * <p>Call protocol description: operation_type: polling, required_steps: 1.
     * This operation may require multiple calls (at least one) to obtain the connection credential.
     * On the first call, an application instance is allocated to the specified convenience account and the application is started. If a Ticket is returned, the result is obtained synchronously. If a startup task ID (<code>TaskId</code>) is returned, subsequent calls are required.
     * On subsequent calls, include the <code>TaskId</code> request parameter to invoke the operation and query whether the node is complete. When the returned node status (<code>TaskStatus</code>) is completed (<code>Finished</code>), the connection credential (<code>Ticket</code>) is also returned.</p>
     * <blockquote>
     * <p>Prerequisites</p>
     * <ul>
     * <li>Before calling this operation, make sure that you have created a delivery group and authorized users for the delivery group:</li>
     * <li><ol>
     * <li>The API for creating a delivery group is CreateAppInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * <li><ol start="2">
     * <li>You can call the ListAppInstanceGroup operation to query the list of delivery groups. If the corresponding delivery group is not found, verify that the delivery group has been created and that the authentication credentials belong to the correct tenant.</li>
     * </ol>
     * </li>
     * <li><ol start="3">
     * <li>The API for authorizing users for a delivery group is AuthorizeInstanceGroup. For more information about the parameters, see the corresponding API documentation.</li>
     * </ol>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the connection credential for a cloud application.</p>
     * 
     * @param request GetConnectionTicketRequest
     * @return GetConnectionTicketResponse
     */
    public GetConnectionTicketResponse getConnectionTicket(GetConnectionTicketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConnectionTicketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about a debug application instance.</p>
     * 
     * @param request GetDebugAppInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDebugAppInstanceResponse
     */
    public GetDebugAppInstanceResponse getDebugAppInstanceWithOptions(GetDebugAppInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDebugAppInstance"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDebugAppInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves the information about a debug application instance.</p>
     * 
     * @param request GetDebugAppInstanceRequest
     * @return GetDebugAppInstanceResponse
     */
    public GetDebugAppInstanceResponse getDebugAppInstance(GetDebugAppInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDebugAppInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in on the lead capture page when visitors execute a cloud flow. Therefore, the usage mode of cloud applications does not generate visitor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves file upload information.</p>
     * 
     * @param request GetFileUploadInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFileUploadInfoResponse
     */
    public GetFileUploadInfoResponse getFileUploadInfoWithOptions(GetFileUploadInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileType)) {
            query.put("FileType", request.fileType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFileUploadInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFileUploadInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>Visitor information is filled in on the lead capture page when visitors execute a cloud flow. Therefore, the usage mode of cloud applications does not generate visitor information.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves file upload information.</p>
     * 
     * @param request GetFileUploadInfoRequest
     * @return GetFileUploadInfoResponse
     */
    public GetFileUploadInfoResponse getFileUploadInfo(GetFileUploadInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFileUploadInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the WUYING Agent Management Center, including the provider name, description, and connection configuration list.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a model provider template.</p>
     * 
     * @param request GetModelProviderTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetModelProviderTemplateResponse
     */
    public GetModelProviderTemplateResponse getModelProviderTemplateWithOptions(GetModelProviderTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            query.put("ProviderTemplateId", request.providerTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetModelProviderTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetModelProviderTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the details of a specified model provider template in the WUYING Agent Management Center, including the provider name, description, and connection configuration list.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a model provider template.</p>
     * 
     * @param request GetModelProviderTemplateRequest
     * @return GetModelProviderTemplateResponse
     */
    public GetModelProviderTemplateResponse getModelProviderTemplate(GetModelProviderTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getModelProviderTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an over-the-air update task, including the available version and release notes.</p>
     * 
     * @param request GetOtaTaskByTaskIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOtaTaskByTaskIdResponse
     */
    public GetOtaTaskByTaskIdResponse getOtaTaskByTaskIdWithOptions(GetOtaTaskByTaskIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOtaTaskByTaskId"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOtaTaskByTaskIdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an over-the-air update task, including the available version and release notes.</p>
     * 
     * @param request GetOtaTaskByTaskIdRequest
     * @return GetOtaTaskByTaskIdResponse
     */
    public GetOtaTaskByTaskIdResponse getOtaTaskByTaskId(GetOtaTaskByTaskIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOtaTaskByTaskIdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price information of a resource.</p>
     * 
     * @param request GetResourcePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourcePriceResponse
     */
    public GetResourcePriceResponse getResourcePriceWithOptions(GetResourcePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceType)) {
            query.put("AppInstanceType", request.appInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourcePrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourcePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price information of a resource.</p>
     * 
     * @param request GetResourcePriceRequest
     * @return GetResourcePriceResponse
     */
    public GetResourcePriceResponse getResourcePrice(GetResourcePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourcePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the renewal price of WUYING Cloud Application resources.</p>
     * 
     * @param request GetResourceRenewPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceRenewPriceResponse
     */
    public GetResourceRenewPriceResponse getResourceRenewPriceWithOptions(GetResourceRenewPriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceRenewPrice"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceRenewPriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the renewal price of WUYING Cloud Application resources.</p>
     * 
     * @param request GetResourceRenewPriceRequest
     * @return GetResourceRenewPriceResponse
     */
    public GetResourceRenewPriceResponse getResourceRenewPrice(GetResourceRenewPriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceRenewPriceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the third-party channel configuration status of Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the third-party channel configurations of an Agent runtime.</p>
     * 
     * @param request GetRuntimeChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuntimeChannelResponse
     */
    public GetRuntimeChannelResponse getRuntimeChannelWithOptions(GetRuntimeChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRiskInfo)) {
            query.put("IncludeRiskInfo", request.includeRiskInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("RuntimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            query.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuntimeChannel"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuntimeChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the third-party channel configuration status of Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the third-party channel configurations of an Agent runtime.</p>
     * 
     * @param request GetRuntimeChannelRequest
     * @return GetRuntimeChannelResponse
     */
    public GetRuntimeChannelResponse getRuntimeChannel(GetRuntimeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuntimeChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the model configuration details currently bound to a specified cloud computer in the Wuying Agent Management Center, including model groups, model provider lists, and associated model information. After you enable the risk information mode, you can also identify differences between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model configuration details of a cloud computer.</p>
     * 
     * @param request GetRuntimeModelConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuntimeModelConfigResponse
     */
    public GetRuntimeModelConfigResponse getRuntimeModelConfigWithOptions(GetRuntimeModelConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRiskInfo)) {
            query.put("IncludeRiskInfo", request.includeRiskInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeId)) {
            query.put("RuntimeId", request.runtimeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            query.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuntimeModelConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuntimeModelConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the model configuration details currently bound to a specified cloud computer in the Wuying Agent Management Center, including model groups, model provider lists, and associated model information. After you enable the risk information mode, you can also identify differences between the end user\&quot;s actual configuration and the configuration delivered by the administrator.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the model configuration details of a cloud computer.</p>
     * 
     * @param request GetRuntimeModelConfigRequest
     * @return GetRuntimeModelConfigResponse
     */
    public GetRuntimeModelConfigResponse getRuntimeModelConfig(GetRuntimeModelConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuntimeModelConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of multiple delivery groups. This operation queries all delivery groups that meet the specified conditions instead of a specific delivery group.</p>
     * 
     * @param request ListAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstanceGroupResponse
     */
    public ListAppInstanceGroupResponse listAppInstanceGroupWithOptions(ListAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            query.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludedUserGroupIds)) {
            body.put("ExcludedUserGroupIds", request.excludedUserGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            body.put("UserGroupIds", request.userGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstanceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of multiple delivery groups. This operation queries all delivery groups that meet the specified conditions instead of a specific delivery group.</p>
     * 
     * @param request ListAppInstanceGroupRequest
     * @return ListAppInstanceGroupResponse
     */
    public ListAppInstanceGroupResponse listAppInstanceGroup(ListAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of session instances in a delivery group, including instance IDs, instance statuses, creation time, update time, session statuses, and public IP addresses of primary network interface controllers (NICs).</p>
     * 
     * @param request ListAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstancesWithOptions(ListAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            query.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDeleted)) {
            query.put("IncludeDeleted", request.includeDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            query.put("UserIdList", request.userIdList);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceIdList)) {
            body.put("AppInstanceIdList", request.appInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppInstances"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of session instances in a delivery group, including instance IDs, instance statuses, creation time, update time, session statuses, and public IP addresses of primary network interface controllers (NICs).</p>
     * 
     * @param request ListAppInstancesRequest
     * @return ListAppInstancesResponse
     */
    public ListAppInstancesResponse listAppInstances(ListAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of deployed applications in the application image used by a specified delivery group, including the application ID, name, version, icon, and the number of users currently <strong>authorized by application</strong> for each application (AuthorizedUserCount).
     * The returned AppId is the input for per-application authorization: when you call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to add or remove authorized users for a specified application in a delivery group, pass in the AppId returned by this operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>ProductType matches the product type of the delivery group</strong>. If the delivery group does not exist or the product type does not match, the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>AppInstanceGroupId is required</strong>. This parameter is marked as optional in the parameter table, but the error code <code>InvalidParameter.AppInstanceGroupId</code> is returned if it is not specified.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned respectively.</li>
     * <li>If no applications are deployed in the delivery group image, the operation returns normally: Apps is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId).</li>
     * <li>Call this operation to obtain the list of deployed applications in the delivery group and the AppId of each application.</li>
     * <li>To authorize by application, call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation with the returned AppId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the deployed applications in the image used by a specified delivery group with paging and returns the number of users with per-application authorization for each application.</p>
     * 
     * @param request ListAppsByAppInstanceGroupIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAppsByAppInstanceGroupIdResponse
     */
    public ListAppsByAppInstanceGroupIdResponse listAppsByAppInstanceGroupIdWithOptions(ListAppsByAppInstanceGroupIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAppsByAppInstanceGroupId"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAppsByAppInstanceGroupIdResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of deployed applications in the application image used by a specified delivery group, including the application ID, name, version, icon, and the number of users currently <strong>authorized by application</strong> for each application (AuthorizedUserCount).
     * The returned AppId is the input for per-application authorization: when you call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to add or remove authorized users for a specified application in a delivery group, pass in the AppId returned by this operation.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The delivery group is created, and <strong>ProductType matches the product type of the delivery group</strong>. If the delivery group does not exist or the product type does not match, the error code <code>InvalidAppInstanceGroup.NotFound</code> is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>AppInstanceGroupId is required</strong>. This parameter is marked as optional in the parameter table, but the error code <code>InvalidParameter.AppInstanceGroupId</code> is returned if it is not specified.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100. If the values are invalid, the error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code> are returned respectively.</li>
     * <li>If no applications are deployed in the delivery group image, the operation returns normally: Apps is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId).</li>
     * <li>Call this operation to obtain the list of deployed applications in the delivery group and the AppId of each application.</li>
     * <li>To authorize by application, call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation with the returned AppId.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the deployed applications in the image used by a specified delivery group with paging and returns the number of users with per-application authorization for each application.</p>
     * 
     * @param request ListAppsByAppInstanceGroupIdRequest
     * @return ListAppsByAppInstanceGroupIdResponse
     */
    public ListAppsByAppInstanceGroupIdResponse listAppsByAppInstanceGroupId(ListAppsByAppInstanceGroupIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsByAppInstanceGroupIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the list of delivery groups for which a specified user (EndUserId) has been granted <strong>delivery group-level authorization</strong>. The response includes basic information about each delivery group (ID, name, status, region, creation time, expiration time, and more) and the list of applications deployed in the delivery group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only delivery groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized on a per-application basis through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only delivery groups whose product type matches the ProductType parameter and that have not been deleted are returned. A delivery group is not returned if its image contains no deployed applications.</li>
     * <li>Results are sorted in reverse chronological order by the update time of the authorization record. The most recently authorized or modified delivery groups appear first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId performs an <strong>exact match</strong> on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all perform <strong>fuzzy matching</strong> (a hit occurs if the value is contained). When multiple filter conditions are specified, all conditions must be met simultaneously.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>If the user has no authorized delivery groups that match the conditions, the operation returns normally: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * <li>Call this operation to query the delivery groups authorized to the user and the applications deployed in each delivery group.</li>
     * <li>To obtain an application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation with the AppInstanceGroupId and the AppId from the Apps list in the response.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery groups for which a specified user has obtained access permissions through delivery group-level authorization by paging, with support for fuzzy filtering by delivery group ID, delivery group name, application ID, or application name.</p>
     * 
     * @param request ListAuthorizedAppInstanceGroupByUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedAppInstanceGroupByUserResponse
     */
    public ListAuthorizedAppInstanceGroupByUserResponse listAuthorizedAppInstanceGroupByUserWithOptions(ListAuthorizedAppInstanceGroupByUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedAppInstanceGroupByUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedAppInstanceGroupByUserResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the list of delivery groups for which a specified user (EndUserId) has been granted <strong>delivery group-level authorization</strong>. The response includes basic information about each delivery group (ID, name, status, region, creation time, expiration time, and more) and the list of applications deployed in the delivery group.
     * Scope of returned results:</p>
     * <ul>
     * <li>Only delivery groups that are authorized to the user as a whole through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are returned. Records authorized on a per-application basis through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation are not included.</li>
     * <li>Only delivery groups whose product type matches the ProductType parameter and that have not been deleted are returned. A delivery group is not returned if its image contains no deployed applications.</li>
     * <li>Results are sorted in reverse chronological order by the update time of the authorization record. The most recently authorized or modified delivery groups appear first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType and EndUserId are required</strong>. If ProductType is not specified, the error code <code>InvalidParameter.ProductType</code> is returned. If EndUserId is not specified, the error code <code>InvalidParameter.UserId</code> is returned.</li>
     * <li>EndUserId performs an <strong>exact match</strong> on the username. AppInstanceGroupId, AppInstanceGroupName, AppId, and AppName all perform <strong>fuzzy matching</strong> (a hit occurs if the value is contained). When multiple filter conditions are specified, all conditions must be met simultaneously.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>If the user has no authorized delivery groups that match the conditions, the operation returns normally: AppInstanceGroupModels is an empty list and TotalCount is 0.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID, and then call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize the delivery group to the user.</li>
     * <li>Call this operation to query the delivery groups authorized to the user and the applications deployed in each delivery group.</li>
     * <li>To obtain an application connection ticket for the user, call the <a href="~~GetConnectionTicket~~">GetConnectionTicket</a> operation with the AppInstanceGroupId and the AppId from the Apps list in the response.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the delivery groups for which a specified user has obtained access permissions through delivery group-level authorization by paging, with support for fuzzy filtering by delivery group ID, delivery group name, application ID, or application name.</p>
     * 
     * @param request ListAuthorizedAppInstanceGroupByUserRequest
     * @return ListAuthorizedAppInstanceGroupByUserResponse
     */
    public ListAuthorizedAppInstanceGroupByUserResponse listAuthorizedAppInstanceGroupByUser(ListAuthorizedAppInstanceGroupByUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedAppInstanceGroupByUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the applications that a specified user is authorized to access at the application granularity. <strong>Only records authorized at the application level are returned</strong> (for example, authorizations completed through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorizations granted to an entire delivery group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are not included in the response.
     * The results are deduplicated by the combination of delivery group and application. Each record corresponds to one application within one delivery group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user must already exist under the current account. If the user does not exist, the error code <code>User.NotFound</code> is returned. Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The delivery group that contains the application must already be created, and the application must have been authorized to the user at the application level. If no per-application authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong><code>EndUserId</code> and <code>ProductType</code> are required.</strong> Set <code>ProductType</code> to <code>CloudApp</code>, which indicates WUYING Cloud Application.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppId</code>, <code>AppInstanceGroupName</code>, and <code>AppName</code> are optional filter conditions. All of them use fuzzy match and can be combined in any way. If all are omitted, all per-application authorization records for the user are returned.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> for paging. <code>PageNumber</code> starts from 1, and <code>PageSize</code> ranges from 1 to 100. Use the returned <code>TotalCount</code> to determine whether to continue querying.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications within the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the application to the target user.</li>
     * <li>Call this operation to query the applications that the user is authorized to access.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications for which a specified user has obtained access permissions through per-application authorization by paging. You can filter results by delivery group ID, delivery group name, application ID, or application name using fuzzy match.</p>
     * 
     * @param request ListAuthorizedAppsByUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedAppsByUserResponse
     */
    public ListAuthorizedAppsByUserResponse listAuthorizedAppsByUserWithOptions(ListAuthorizedAppsByUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedAppsByUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedAppsByUserResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the applications that a specified user is authorized to access at the application granularity. <strong>Only records authorized at the application level are returned</strong> (for example, authorizations completed through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation). Authorizations granted to an entire delivery group through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation are not included in the response.
     * The results are deduplicated by the combination of delivery group and application. Each record corresponds to one application within one delivery group.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The user must already exist under the current account. If the user does not exist, the error code <code>User.NotFound</code> is returned. Call the <a href="https://help.aliyun.com/document_detail/436936.html">DescribeUsers</a> operation to obtain the username.</li>
     * <li>The delivery group that contains the application must already be created, and the application must have been authorized to the user at the application level. If no per-application authorization has been performed, an empty application list is returned.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong><code>EndUserId</code> and <code>ProductType</code> are required.</strong> Set <code>ProductType</code> to <code>CloudApp</code>, which indicates WUYING Cloud Application.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppId</code>, <code>AppInstanceGroupName</code>, and <code>AppName</code> are optional filter conditions. All of them use fuzzy match and can be combined in any way. If all are omitted, all per-application authorization records for the user are returned.</li>
     * <li>Use <code>PageNumber</code> and <code>PageSize</code> for paging. <code>PageNumber</code> starts from 1, and <code>PageSize</code> ranges from 1 to 100. Use the returned <code>TotalCount</code> to determine whether to continue querying.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/428506.html">ListAppInstanceGroup</a> or <a href="https://help.aliyun.com/document_detail/600836.html">GetAppInstanceGroup</a> operation to obtain the delivery group ID (AppInstanceGroupId) and the application IDs of deployed applications within the delivery group (AppId in the Apps list).</li>
     * <li>Call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize the application to the target user.</li>
     * <li>Call this operation to query the applications that the user is authorized to access.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the applications for which a specified user has obtained access permissions through per-application authorization by paging. You can filter results by delivery group ID, delivery group name, application ID, or application name using fuzzy match.</p>
     * 
     * @param request ListAuthorizedAppsByUserRequest
     * @return ListAuthorizedAppsByUserResponse
     */
    public ListAuthorizedAppsByUserResponse listAuthorizedAppsByUser(ListAuthorizedAppsByUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedAppsByUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user groups authorized by a specified delivery group.</p>
     * 
     * @param request ListAuthorizedUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedUserGroupsResponse
     */
    public ListAuthorizedUserGroupsResponse listAuthorizedUserGroupsWithOptions(ListAuthorizedUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            body.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            body.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedUserGroups"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedUserGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of user groups authorized by a specified delivery group.</p>
     * 
     * @param request ListAuthorizedUserGroupsRequest
     * @return ListAuthorizedUserGroupsResponse
     */
    public ListAuthorizedUserGroupsResponse listAuthorizedUserGroups(ListAuthorizedUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedUserGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the currently authorized users of a specified delivery group (AppInstanceGroupId) or delivery group set (AppInstanceGroupSetId). It returns each user\&quot;s username, account type, email address, phone number, and the authorization mode of the associated delivery group.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong> and does not indicate whether users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, a delivery group corresponds to a cloud browser group, and a delivery group ID corresponds to a browser group ID.
     * The scope of results depends on the authorization mode of the delivery group (response parameter AuthMode):</li>
     * <li>When the authorization mode is <code>App</code> (application-level authorization) or <code>AppInstanceGroup</code> (delivery group-level authorization): Returns users authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation at the delivery group level, as well as users authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation at the application level. If AppId is specified, only users <strong>authorized for that specific application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session-level authorization): Returns users who have been granted persistent sessions. The AppInstancePersistentIds field lists all persistent session IDs granted to each user. If AppInstancePersistentId is specified, only users granted that session are returned.</li>
     * <li>When querying by delivery group set: Returns users authorized for the set. The response parameter AppInstanceGroupId is the primary delivery group ID of the set, and AppInstanceGroupSetId is the queried set ID.
     * When querying by delivery group, results are sorted in descending order by authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target delivery group or delivery group set must be created, belong to the current account, and match the specified ProductType. Otherwise, a resource-not-found error code is returned.</li>
     * <li>Users must have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns normally with an empty Users list and TotalCount of 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If ProductType has an invalid value, the error code <code>ProductTypeInvalid</code> is returned.</li>
     * <li><strong>Exactly one of AppInstanceGroupId and AppInstanceGroupSetId must be specified</strong>. If both or neither are specified, the error code <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by delivery group set</strong>. If specified, the error codes <code>InvalidParameter.AppId</code> and <code>InvalidParameter.AppInstancePersistentId</code> are returned respectively.</li>
     * <li>EndUserId performs <strong>exact matching</strong> by username. UserIdFuzzy performs <strong>fuzzy matching</strong> by username (a hit occurs if the username contains the keyword). Both can be specified simultaneously, in which case both conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the number of <strong>authorization records</strong> that match the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the records are merged into a single user entry in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the deduplicated user count.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize at the delivery group level, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize at the application level.</li>
     * <li>Call this operation to query authorized users. To remove authorization, pass the returned EndUserId values to the UnAuthorizeUserIds parameter of the authorization operations mentioned above.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by delivery group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by delivery group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The delivery group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The delivery group set does not exist, does not belong to the current account, the product type does not match, or the set does not have an available primary delivery group.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The delivery group set is not in an available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of authorized users for a specified delivery group or delivery group set by using paging. Supports exact or fuzzy filtering by username.</p>
     * 
     * @param request ListAuthorizedUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizedUsersResponse
     */
    public ListAuthorizedUsersResponse listAuthorizedUsersWithOptions(ListAuthorizedUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            query.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdFuzzy)) {
            query.put("UserIdFuzzy", request.userIdFuzzy);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            body.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizedUsers"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizedUsersResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation queries the currently authorized users of a specified delivery group (AppInstanceGroupId) or delivery group set (AppInstanceGroupSetId). It returns each user\&quot;s username, account type, email address, phone number, and the authorization mode of the associated delivery group.</p>
     * <ul>
     * <li>This operation returns <strong>authorization relationships</strong> and does not indicate whether users are currently online or have established connections.</li>
     * <li>In the Cloud Browser product, a delivery group corresponds to a cloud browser group, and a delivery group ID corresponds to a browser group ID.
     * The scope of results depends on the authorization mode of the delivery group (response parameter AuthMode):</li>
     * <li>When the authorization mode is <code>App</code> (application-level authorization) or <code>AppInstanceGroup</code> (delivery group-level authorization): Returns users authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation at the delivery group level, as well as users authorized through the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation at the application level. If AppId is specified, only users <strong>authorized for that specific application</strong> are returned.</li>
     * <li>When the authorization mode is <code>Session</code> (session-level authorization): Returns users who have been granted persistent sessions. The AppInstancePersistentIds field lists all persistent session IDs granted to each user. If AppInstancePersistentId is specified, only users granted that session are returned.</li>
     * <li>When querying by delivery group set: Returns users authorized for the set. The response parameter AppInstanceGroupId is the primary delivery group ID of the set, and AppInstanceGroupSetId is the queried set ID.
     * When querying by delivery group, results are sorted in descending order by authorization time, with the most recently authorized users listed first.</li>
     * </ul>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>The target delivery group or delivery group set must be created, belong to the current account, and match the specified ProductType. Otherwise, a resource-not-found error code is returned.</li>
     * <li>Users must have been authorized through the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> or <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation. If no users have been authorized, the operation returns normally with an empty Users list and TotalCount of 0.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ProductType, PageNumber, and PageSize are required</strong>. If ProductType has an invalid value, the error code <code>ProductTypeInvalid</code> is returned.</li>
     * <li><strong>Exactly one of AppInstanceGroupId and AppInstanceGroupSetId must be specified</strong>. If both or neither are specified, the error code <code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code> is returned.</li>
     * <li><strong>AppId and AppInstancePersistentId are not supported when querying by delivery group set</strong>. If specified, the error codes <code>InvalidParameter.AppId</code> and <code>InvalidParameter.AppInstancePersistentId</code> are returned respectively.</li>
     * <li>EndUserId performs <strong>exact matching</strong> by username. UserIdFuzzy performs <strong>fuzzy matching</strong> by username (a hit occurs if the username contains the keyword). Both can be specified simultaneously, in which case both conditions must be met.</li>
     * <li>PageNumber starts from 1. Valid values of PageSize: 1 to 100.</li>
     * <li>When the authorization mode is <code>App</code> or <code>AppInstanceGroup</code>, TotalCount is the number of <strong>authorization records</strong> that match the conditions. If the same user has multiple authorization records (for example, authorized for multiple applications), the records are merged into a single user entry in Users. Therefore, the number of users returned on the current page may be less than PageSize. Use TotalCount to determine whether to continue paging. When the authorization mode is <code>Session</code>, TotalCount is the deduplicated user count.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call the <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> operation to obtain the delivery group ID. For cloud browser groups, call the <a href="~~ListBrowserInstanceGroup~~">ListBrowserInstanceGroup</a> operation.</li>
     * <li>Call the <a href="~~AuthorizeInstanceGroup~~">AuthorizeInstanceGroup</a> operation to authorize at the delivery group level, or call the <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a> operation to authorize at the application level.</li>
     * <li>Call this operation to query authorized users. To remove authorization, pass the returned EndUserId values to the UnAuthorizeUserIds parameter of the authorization operations mentioned above.</li>
     * </ol>
     * <h2>Error codes</h2>
     * <ul>
     * <li><code>ProductTypeInvalid</code>: The value of ProductType is invalid.</li>
     * <li><code>InvalidParameter.AppInstanceGroupId/AppInstanceGroupSetId</code>: Both AppInstanceGroupId and AppInstanceGroupSetId are specified, or neither is specified.</li>
     * <li><code>InvalidParameter.AppId</code>: AppId is specified when querying by delivery group set.</li>
     * <li><code>InvalidParameter.AppInstancePersistentId</code>: AppInstancePersistentId is specified when querying by delivery group set.</li>
     * <li><code>InvalidAppInstanceGroupSpecItem.NotFound</code>: The delivery group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidBrowserInstanceGroup.NotFound</code>: When ProductType is <code>CloudBrowser</code>, the cloud browser group does not exist, does not belong to the current account, or the product type does not match.</li>
     * <li><code>InvalidAppInstanceGroupSet.NotFound</code>: The delivery group set does not exist, does not belong to the current account, the product type does not match, or the set does not have an available primary delivery group.</li>
     * <li><code>InvalidAppInstanceGroupSet.ActivationFailed</code>: The delivery group set is not in an available state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of authorized users for a specified delivery group or delivery group set by using paging. Supports exact or fuzzy filtering by username.</p>
     * 
     * @param request ListAuthorizedUsersRequest
     * @return ListAuthorizedUsersResponse
     */
    public ListAuthorizedUsersResponse listAuthorizedUsers(ListAuthorizedUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizedUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bindng information between users and resources.</p>
     * 
     * @param request ListBindInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBindInfoResponse
     */
    public ListBindInfoResponse listBindInfoWithOptions(ListBindInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appIdList)) {
            body.put("AppIdList", request.appIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupIdList)) {
            body.put("AppInstanceGroupIdList", request.appInstanceGroupIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceIdList)) {
            body.put("AppInstanceIdList", request.appInstanceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIdList)) {
            body.put("UserIdList", request.userIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wyIdList)) {
            body.put("WyIdList", request.wyIdList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBindInfo"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBindInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bindng information between users and resources.</p>
     * 
     * @param request ListBindInfoRequest
     * @return ListBindInfoResponse
     */
    public ListBindInfoResponse listBindInfo(ListBindInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBindInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to use this operation in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. Only one status value can be specified at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> for paging. Use the returned <code>TotalCount</code> to determine whether to continue querying the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> with the returned identity.</p>
     * <h2>Example notes</h2>
     * <p>The <code>-</code> in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual character string returned by the operation. Resource identities in the examples are masked. Use the actual query results in your environment.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud browser groups and their current status by paging.</p>
     * 
     * @param request ListBrowserInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBrowserInstanceGroupResponse
     */
    public ListBrowserInstanceGroupResponse listBrowserInstanceGroupWithOptions(ListBrowserInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupSetId)) {
            query.put("AppInstanceGroupSetId", request.appInstanceGroupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupId)) {
            query.put("BrowserInstanceGroupId", request.browserInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupName)) {
            query.put("BrowserInstanceGroupName", request.browserInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudBrowserName)) {
            query.put("CloudBrowserName", request.cloudBrowserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tier)) {
            query.put("Tier", request.tier);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludedUserGroupIds)) {
            body.put("ExcludedUserGroupIds", request.excludedUserGroupIds);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            bodyFlat.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userGroupIds)) {
            body.put("UserGroupIds", request.userGroupIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBrowserInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBrowserInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to use this operation in the monthly active user (MAU) billing scenario.</p>
     * <h2>Query conditions</h2>
     * <p>You can filter by browser group identity, name, business region, office network, set, authorized user group, and status. Only one status value can be specified at a time.</p>
     * <h2>Paging</h2>
     * <p>Use <code>PageNumber</code> and <code>PageSize</code> for paging. Use the returned <code>TotalCount</code> to determine whether to continue querying the next page.</p>
     * <h2>What to do next</h2>
     * <p>To view the detailed configuration of a single browser group, invoke <code>GetBrowserInstanceGroup</code> with the returned identity.</p>
     * <h2>Example notes</h2>
     * <p>The <code>-</code> in the examples indicates that the field is not applicable or not returned in the current scenario. It is not an actual character string returned by the operation. Resource identities in the examples are masked. Use the actual query results in your environment.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries cloud browser groups and their current status by paging.</p>
     * 
     * @param request ListBrowserInstanceGroupRequest
     * @return ListBrowserInstanceGroupResponse
     */
    public ListBrowserInstanceGroupResponse listBrowserInstanceGroup(ListBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of desktop agent runtimes.</p>
     * 
     * @param request ListDesktopAgentRuntimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDesktopAgentRuntimeResponse
     */
    public ListDesktopAgentRuntimeResponse listDesktopAgentRuntimeWithOptions(ListDesktopAgentRuntimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentImOnlineStatus)) {
            query.put("AgentImOnlineStatus", request.agentImOnlineStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentInstanceStatuses)) {
            query.put("AgentInstanceStatuses", request.agentInstanceStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentInstanceVersions)) {
            query.put("AgentInstanceVersions", request.agentInstanceVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatformList)) {
            query.put("AgentPlatformList", request.agentPlatformList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProviderList)) {
            query.put("AgentProviderList", request.agentProviderList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentTemplateIds)) {
            query.put("AgentTemplateIds", request.agentTemplateIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.authUsers)) {
            query.put("AuthUsers", request.authUsers);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.channelConfigure)) {
            query.put("ChannelConfigure", request.channelConfigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSource)) {
            query.put("DeploymentSource", request.deploymentSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopIds)) {
            query.put("DesktopIds", request.desktopIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopNames)) {
            query.put("DesktopNames", request.desktopNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.desktopStatuses)) {
            query.put("DesktopStatuses", request.desktopStatuses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasAuthUser)) {
            query.put("HasAuthUser", request.hasAuthUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasRisk)) {
            query.put("HasRisk", request.hasRisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeRiskInfo)) {
            query.put("IncludeRiskInfo", request.includeRiskInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managementStatus)) {
            query.put("ManagementStatus", request.managementStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelConfigure)) {
            query.put("ModelConfigure", request.modelConfigure);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            query.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDesktopAgentRuntime"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDesktopAgentRuntimeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of desktop agent runtimes.</p>
     * 
     * @param request ListDesktopAgentRuntimeRequest
     * @return ListDesktopAgentRuntimeResponse
     */
    public ListDesktopAgentRuntimeResponse listDesktopAgentRuntime(ListDesktopAgentRuntimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDesktopAgentRuntimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image information.</p>
     * 
     * @param request ListImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImageResponse
     */
    public ListImageResponse listImageWithOptions(ListImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.distro)) {
            query.put("Distro", request.distro);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagList)) {
            query.put("TagList", request.tagList);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionIdList)) {
            body.put("BizRegionIdList", request.bizRegionIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizTypeList)) {
            body.put("BizTypeList", request.bizTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureList)) {
            body.put("FeatureList", request.featureList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fotaVersion)) {
            body.put("FotaVersion", request.fotaVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            body.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            body.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.languageType)) {
            body.put("LanguageType", request.languageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            body.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.packageType)) {
            body.put("PackageType", request.packageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformName)) {
            body.put("PlatformName", request.platformName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platformNameList)) {
            body.put("PlatformNameList", request.platformNameList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productTypeList)) {
            body.put("ProductTypeList", request.productTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocolType)) {
            body.put("ProtocolType", request.protocolType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceInstanceType)) {
            body.put("ResourceInstanceType", request.resourceInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries image information.</p>
     * 
     * @param request ListImageRequest
     * @return ListImageResponse
     */
    public ListImageResponse listImage(ListImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query the list of model templates under a model provider template in the WUYING Agent Management Center with paging. Filtering by model group ID, model provider template ID, model template ID, and model encoding is supported. When querying by model group dimension, the default model is automatically pinned to the top.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of LLM templates.</p>
     * 
     * @param tmpReq ListLlmTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLlmTemplatesResponse
     */
    public ListLlmTemplatesResponse listLlmTemplatesWithOptions(ListLlmTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListLlmTemplatesShrinkRequest request = new ListLlmTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.llmTemplateIds)) {
            request.llmTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.llmTemplateIds, "LlmTemplateIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmCode)) {
            query.put("LlmCode", request.llmCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.llmTemplateIdsShrink)) {
            query.put("LlmTemplateIds", request.llmTemplateIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            query.put("ProviderTemplateId", request.providerTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.smartModel)) {
            query.put("SmartModel", request.smartModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLlmTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLlmTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can query the list of model templates under a model provider template in the WUYING Agent Management Center with paging. Filtering by model group ID, model provider template ID, model template ID, and model encoding is supported. When querying by model group dimension, the default model is automatically pinned to the top.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of LLM templates.</p>
     * 
     * @param request ListLlmTemplatesRequest
     * @return ListLlmTemplatesResponse
     */
    public ListLlmTemplatesResponse listLlmTemplates(ListLlmTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLlmTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of model provider endpoints.</p>
     * 
     * @param request ListModelProviderEndpointsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProviderEndpointsResponse
     */
    public ListModelProviderEndpointsResponse listModelProviderEndpointsWithOptions(ListModelProviderEndpointsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            query.put("ProviderName", request.providerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProviderEndpoints"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProviderEndpointsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of model provider endpoints.</p>
     * 
     * @param request ListModelProviderEndpointsRequest
     * @return ListModelProviderEndpointsResponse
     */
    public ListModelProviderEndpointsResponse listModelProviderEndpoints(ListModelProviderEndpointsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelProviderEndpointsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can perform a paged query to retrieve the list of model provider templates under a specified model group in the WUYING Agent Management Center. You can filter results by provider name, model group ID, and provider template ID. Paging is supported.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of model provider templates.</p>
     * 
     * @param tmpReq ListModelProviderTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelProviderTemplatesResponse
     */
    public ListModelProviderTemplatesResponse listModelProviderTemplatesWithOptions(ListModelProviderTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModelProviderTemplatesShrinkRequest request = new ListModelProviderTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.providerTemplateIds)) {
            request.providerTemplateIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.providerTemplateIds, "ProviderTemplateIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerName)) {
            query.put("ProviderName", request.providerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateIdsShrink)) {
            query.put("ProviderTemplateIds", request.providerTemplateIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelProviderTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelProviderTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can perform a paged query to retrieve the list of model provider templates under a specified model group in the WUYING Agent Management Center. You can filter results by provider name, model group ID, and provider template ID. Paging is supported.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of model provider templates.</p>
     * 
     * @param request ListModelProviderTemplatesRequest
     * @return ListModelProviderTemplatesResponse
     */
    public ListModelProviderTemplatesResponse listModelProviderTemplates(ListModelProviderTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelProviderTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the list of resource groups authorized by a model group in the WUYING Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource groups associated with a model group.</p>
     * 
     * @param request ListModelTemplateResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelTemplateResourceGroupResponse
     */
    public ListModelTemplateResourceGroupResponse listModelTemplateResourceGroupWithOptions(ListModelTemplateResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelTemplateResourceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelTemplateResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the list of resource groups authorized by a model group in the WUYING Agent Management Center.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of resource groups associated with a model group.</p>
     * 
     * @param request ListModelTemplateResourceGroupRequest
     * @return ListModelTemplateResourceGroupResponse
     */
    public ListModelTemplateResourceGroupResponse listModelTemplateResourceGroup(ListModelTemplateResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelTemplateResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can use paged query to retrieve the list of model groups created in the Wuying Agent Management Center. You can filter results by Agent provider, Agent platform, template group ID, and whether models have been configured. Paging is supported.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of model templates.</p>
     * 
     * @param tmpReq ListModelTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListModelTemplatesResponse
     */
    public ListModelTemplatesResponse listModelTemplatesWithOptions(ListModelTemplatesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListModelTemplatesShrinkRequest request = new ListModelTemplatesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.modelTemplateIdList)) {
            request.modelTemplateIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.modelTemplateIdList, "ModelTemplateIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            query.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatformList)) {
            query.put("AgentPlatformList", request.agentPlatformList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            query.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProviderList)) {
            query.put("AgentProviderList", request.agentProviderList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            query.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hasModel)) {
            query.put("HasModel", request.hasModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateIdListShrink)) {
            query.put("ModelTemplateIdList", request.modelTemplateIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refScope)) {
            query.put("RefScope", request.refScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListModelTemplates"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListModelTemplatesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can use paged query to retrieve the list of model groups created in the Wuying Agent Management Center. You can filter results by Agent provider, Agent platform, template group ID, and whether models have been configured. Paging is supported.
     * Before using this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of model templates.</p>
     * 
     * @param request ListModelTemplatesRequest
     * @return ListModelTemplatesResponse
     */
    public ListModelTemplatesResponse listModelTemplates(ListModelTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listModelTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource specifications available for selection when creating a delivery group.</p>
     * 
     * @param request ListNodeInstanceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeInstanceTypeResponse
     */
    public ListNodeInstanceTypeResponse listNodeInstanceTypeWithOptions(ListNodeInstanceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpu)) {
            query.put("Gpu", request.gpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuMemory)) {
            query.put("GpuMemory", request.gpuMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeForModify)) {
            query.put("InstanceTypeForModify", request.instanceTypeForModify);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceType)) {
            query.put("NodeInstanceType", request.nodeInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeInstanceTypeFamily)) {
            query.put("NodeInstanceTypeFamily", request.nodeInstanceTypeFamily);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeInstanceType"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeInstanceTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource specifications available for selection when creating a delivery group.</p>
     * 
     * @param request ListNodeInstanceTypeRequest
     * @return ListNodeInstanceTypeResponse
     */
    public ListNodeInstanceTypeResponse listNodeInstanceType(ListNodeInstanceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInstanceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource nodes.</p>
     * 
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of resource nodes.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the history of over-the-air updates.</p>
     * 
     * @param request ListOtaTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOtaTaskResponse
     */
    public ListOtaTaskResponse listOtaTaskWithOptions(ListOtaTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.otaType)) {
            body.put("OtaType", request.otaType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOtaTask"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOtaTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the history of over-the-air updates.</p>
     * 
     * @param request ListOtaTaskRequest
     * @return ListOtaTaskResponse
     */
    public ListOtaTaskResponse listOtaTask(ListOtaTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOtaTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of persistent session application instances in a delivery group.</p>
     * 
     * @param request ListPersistentAppInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPersistentAppInstancesResponse
     */
    public ListPersistentAppInstancesResponse listPersistentAppInstancesWithOptions(ListPersistentAppInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentIds)) {
            query.put("AppInstancePersistentIds", request.appInstancePersistentIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPersistentAppInstances"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPersistentAppInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of persistent session application instances in a delivery group.</p>
     * 
     * @param request ListPersistentAppInstancesRequest
     * @return ListPersistentAppInstancesResponse
     */
    public ListPersistentAppInstancesResponse listPersistentAppInstances(ListPersistentAppInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPersistentAppInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListPublishedAppInstanceGroup</code> permission is required.
     * A delivery group must be in the published state and have deployed applications in its image to appear in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly pass in <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can pass them individually or in combination. When multiple conditions are specified, all conditions must be met simultaneously. When both <code>AppId</code> and <code>AppName</code> are specified, the same application must satisfy both conditions.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, that condition is not applied. Query results are sorted by delivery group creation time from newest to oldest. A delivery group is not returned multiple times even if it contains multiple matching applications.</li>
     * <li><code>ExcludeUserId</code> excludes delivery groups in which all applications have been directly authorized to the specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li><code>AppId</code> and <code>AppName</code> only filter delivery groups. <strong>They do not restrict the returned <code>Apps</code> list to only the matched applications.</strong></li>
     * </ul>
     * <h2>Invoke sequence</h2>
     * <ol>
     * <li>Invoke a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>AppInstanceGroupModels</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no delivery groups match, the total count is <code>0</code> and the list is empty. If the page number exceeds the result range, the list may also be empty, but the total count still represents the total number of matching delivery groups.</li>
     * <li>To retrieve details of a single delivery group, pass the full <code>AppInstanceGroupId</code> from the response and the same <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identifiers in the examples are for format demonstration purposes. Replace them with your actual identifiers when invoking the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries published delivery groups and their application information for a specified product type under the current Alibaba Cloud account by using paging. Supports filtering by delivery group, application, and user authorization status.</p>
     * 
     * @param request ListPublishedAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedAppInstanceGroupResponse
     */
    public ListPublishedAppInstanceGroupResponse listPublishedAppInstanceGroupWithOptions(ListPublishedAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeUserId)) {
            query.put("ExcludeUserId", request.excludeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedAppInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListPublishedAppInstanceGroup</code> permission is required.
     * A delivery group must be in the published state and have deployed applications in its image to appear in the query results. This operation only queries information. It does not create delivery groups, assign users, or grant application access permissions.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly pass in <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can pass them individually or in combination. When multiple conditions are specified, all conditions must be met simultaneously. When both <code>AppId</code> and <code>AppName</code> are specified, the same application must satisfy both conditions.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, that condition is not applied. Query results are sorted by delivery group creation time from newest to oldest. A delivery group is not returned multiple times even if it contains multiple matching applications.</li>
     * <li><code>ExcludeUserId</code> excludes delivery groups in which all applications have been directly authorized to the specified user. It cannot be used to determine whether the user has no access permissions at all.</li>
     * <li><code>AppId</code> and <code>AppName</code> only filter delivery groups. <strong>They do not restrict the returned <code>Apps</code> list to only the matched applications.</strong></li>
     * </ul>
     * <h2>Invoke sequence</h2>
     * <ol>
     * <li>Invoke a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>AppInstanceGroupModels</code>. To retrieve the next page, keep the product type and filter conditions unchanged and increment <code>PageNumber</code>. If no delivery groups match, the total count is <code>0</code> and the list is empty. If the page number exceeds the result range, the list may also be empty, but the total count still represents the total number of matching delivery groups.</li>
     * <li>To retrieve details of a single delivery group, pass the full <code>AppInstanceGroupId</code> from the response and the same <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identifiers in the examples are for format demonstration purposes. Replace them with your actual identifiers when invoking the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries published delivery groups and their application information for a specified product type under the current Alibaba Cloud account by using paging. Supports filtering by delivery group, application, and user authorization status.</p>
     * 
     * @param request ListPublishedAppInstanceGroupRequest
     * @return ListPublishedAppInstanceGroupResponse
     */
    public ListPublishedAppInstanceGroupResponse listPublishedAppInstanceGroup(ListPublishedAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you call this operation by using a RAM user or Security Token Service (STS) credential, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only delivery groups in the published state whose images contain deployed applications are included in the query results. This operation only queries information. It does not create delivery groups or grant or revoke application access permissions.</p>
     * <h2>Response granularity</h2>
     * <p>Results are returned on a per-delivery-group-plus-application basis. If the same application is deployed in multiple published delivery groups, a separate record is returned for each combination. <code>TotalCount</code> also reflects the number of such combinations. The list is sorted by the creation time of the delivery group in descending order.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>. Invalid values return error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code>, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. When multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, filtering is not applied for that condition.</li>
     * <li><code>ExcludeUserId</code> excludes applications that have been authorized to the specified user by application, which helps you find applications that can still be authorized to that user. <strong>Access permissions granted through delivery-group-level authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, increment <code>PageNumber</code> while keeping the product type and filter conditions unchanged. If no results match, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>To authorize users for a specific application by application, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identities in the examples are for format demonstration purposes. Replace them with your actual identities when you invoke the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries deployed applications in published delivery groups under the current Alibaba Cloud account for a specified product type by paging, and returns each application along with its delivery group and the number of authorized users by application. Supports filtering by delivery group, application, and user authorization status.</p>
     * 
     * @param request ListPublishedAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPublishedAppsResponse
     */
    public ListPublishedAppsResponse listPublishedAppsWithOptions(ListPublishedAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            query.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeUserId)) {
            query.put("ExcludeUserId", request.excludeUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPublishedApps"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPublishedAppsResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you call this operation by using a RAM user or Security Token Service (STS) credential, you must have the <code>appstreaming:ListPublishedApps</code> permission.
     * Only delivery groups in the published state whose images contain deployed applications are included in the query results. This operation only queries information. It does not create delivery groups or grant or revoke application access permissions.</p>
     * <h2>Response granularity</h2>
     * <p>Results are returned on a per-delivery-group-plus-application basis. If the same application is deployed in multiple published delivery groups, a separate record is returned for each combination. <code>TotalCount</code> also reflects the number of such combinations. The list is sorted by the creation time of the delivery group in descending order.</p>
     * <h2>Query and pagination</h2>
     * <ul>
     * <li><strong>You must explicitly specify <code>ProductType</code>, <code>PageNumber</code>, and <code>PageSize</code>.</strong> Page numbers start from <code>1</code>, and the page size ranges from <code>1</code> to <code>100</code>. Invalid values return error codes <code>InvalidParameter.PageNumber</code> and <code>InvalidParameter.PageSize</code>, respectively.</li>
     * <li><code>AppInstanceGroupId</code>, <code>AppInstanceGroupName</code>, <code>AppId</code>, and <code>AppName</code> all support substring matching. You can specify them individually or in combination. When multiple conditions are specified, all conditions must be met.</li>
     * <li>If an optional filter parameter is not specified or is set to an empty string, filtering is not applied for that condition.</li>
     * <li><code>ExcludeUserId</code> excludes applications that have been authorized to the specified user by application, which helps you find applications that can still be authorized to that user. <strong>Access permissions granted through delivery-group-level authorization or user groups are not evaluated by this condition.</strong></li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Initiate a query with <code>PageNumber=1</code> and the desired <code>PageSize</code>. For WUYING Cloud Application common scenarios, use <code>ProductType=CloudApp</code>.</li>
     * <li>Read <code>Apps</code>. To retrieve the next page, increment <code>PageNumber</code> while keeping the product type and filter conditions unchanged. If no results match, <code>TotalCount</code> is <code>0</code> and <code>Apps</code> is an empty list. If the page number exceeds the result range, <code>Apps</code> may also be empty, but <code>TotalCount</code> still indicates the total number of matching records.</li>
     * <li>To authorize users for a specific application by application, pass the returned <code>AppInstanceGroupId</code>, <code>AppId</code>, and the same <code>ProductType</code> to <a href="~~AuthorizeUsersForApp~~">AuthorizeUsersForApp</a>. To view delivery group details, pass <code>AppInstanceGroupId</code> and <code>ProductType</code> to <a href="~~GetAppInstanceGroup~~">GetAppInstanceGroup</a>.
     * The masked identities in the examples are for format demonstration purposes. Replace them with your actual identities when you invoke the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries deployed applications in published delivery groups under the current Alibaba Cloud account for a specified product type by paging, and returns each application along with its delivery group and the number of authorized users by application. Supports filtering by delivery group, application, and user authorization status.</p>
     * 
     * @param request ListPublishedAppsRequest
     * @return ListPublishedAppsResponse
     */
    public ListPublishedAppsResponse listPublishedApps(ListPublishedAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPublishedAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>The regions returned by this operation are not all available regions. For information about available regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions supported by WUYING Cloud Application.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizSource)) {
            query.put("BizSource", request.bizSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2021-09-01"),
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
     * <b>description</b> :
     * <blockquote>
     * <p>The regions returned by this operation are not all available regions. For information about available regions, see <a href="https://help.aliyun.com/document_detail/426036.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the regions supported by WUYING Cloud Application.</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of one or more specified cloud resources.</p>
     * 
     * @param request ListTagCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagCloudResourcesResponse
     */
    public ListTagCloudResourcesResponse listTagCloudResourcesWithOptions(ListTagCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scope)) {
            body.put("Scope", request.scope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagCloudResources"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags of one or more specified cloud resources.</p>
     * 
     * @param request ListTagCloudResourcesRequest
     * @return ListTagCloudResourcesResponse
     */
    public ListTagCloudResourcesResponse listTagCloudResources(ListTagCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation complies with the Alibaba Cloud tagging standard and is used to query tags bound to Elastic Cloud Application (China) delivery groups. You can query tags bound to resources by resource ID, or filter resources that have specific tags bound by tag key-value pairs.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can call the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or by using the console or the Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>Specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags attached to the specified resources are returned.</li>
     * <li>If only Tag.N is specified: all resources that have the specified tags attached and their matching tags are returned.</li>
     * <li>If both are specified: only records of the specified resources that have the specified tags attached are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value of the tag key is not restricted, which means any tag value under the key is matched.</li>
     * <li>Multiple Tag.N conditions have an AND relationship. A resource is returned only if it has all specified tags attached.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>Each record in the response corresponds to a resource-tag key-value pair. If a resource has multiple tags bound, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned.</li>
     * <li>This operation returns all matching results at a time. An empty NextToken value indicates that no more data is available.</li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Invoke the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Invoke the TagResources operation to attach tags to the delivery group.</li>
     * <li>Invoke this operation to query tag bindings by resource ID or tag conditions.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries tags bound to one or more delivery groups, or filters delivery groups that have specific tags bound by tag key-value pairs.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-09-01"),
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
     * <p>This operation complies with the Alibaba Cloud tagging standard and is used to query tags bound to Elastic Cloud Application (China) delivery groups. You can query tags bound to resources by resource ID, or filter resources that have specific tags bound by tag key-value pairs.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>A delivery group is created. You can call the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Tags are bound to the delivery group. You can bind tags by calling the TagResources operation, or by using the console or the Tag service.</li>
     * </ul>
     * <h2>Parameter description</h2>
     * <ul>
     * <li><strong>ResourceType is required</strong>. Only <code>APPINSTANCEGROUP</code> (delivery group) is supported. If you specify other values, the error code <code>InvalidResourceType.Invalid</code> is returned.</li>
     * <li><strong>Specify at least one of ResourceId.N and Tag.N</strong>. If neither is specified, the error code <code>MissingParameter.ResourceIdsOrTags</code> is returned.<ul>
     * <li>If only ResourceId.N is specified: all tags attached to the specified resources are returned.</li>
     * <li>If only Tag.N is specified: all resources that have the specified tags attached and their matching tags are returned.</li>
     * <li>If both are specified: only records of the specified resources that have the specified tags attached are returned.</li>
     * </ul>
     * </li>
     * <li>Tag.N.Key is required. If it is empty, the error code <code>InvalidTagPolicy.KeyInvalid</code> is returned. Tag.N.Value is optional. If it is not specified, the value of the tag key is not restricted, which means any tag value under the key is matched.</li>
     * <li>Multiple Tag.N conditions have an AND relationship. A resource is returned only if it has all specified tags attached.</li>
     * </ul>
     * <h2>Response description</h2>
     * <ul>
     * <li>Each record in the response corresponds to a resource-tag key-value pair. If a resource has multiple tags bound, multiple records are returned.</li>
     * <li>TotalCount indicates the number of records returned.</li>
     * <li>This operation returns all matching results at a time. An empty NextToken value indicates that no more data is available.</li>
     * </ul>
     * <h2>Invocation sequence</h2>
     * <ol>
     * <li>Invoke the ListAppInstanceGroup operation to obtain the delivery group ID.</li>
     * <li>Invoke the TagResources operation to attach tags to the delivery group.</li>
     * <li>Invoke this operation to query tag bindings by resource ID or tag conditions.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries tags bound to one or more delivery groups, or filters delivery groups that have specific tags bound by tag key-value pairs.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information of an administrator account, such as whether resource expiration reminders are enabled.</p>
     * 
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTenantConfigResponse
     */
    public ListTenantConfigResponse listTenantConfigWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTenantConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTenantConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configuration information of an administrator account, such as whether resource expiration reminders are enabled.</p>
     * @return ListTenantConfigResponse
     */
    public ListTenantConfigResponse listTenantConfig() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTenantConfigWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of WUYING workstations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workstations.</p>
     * 
     * @param request ListWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWuyingServerResponse
     */
    public ListWuyingServerResponse listWuyingServerWithOptions(ListWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addVirtualNodePoolStatusList)) {
            bodyFlat.put("AddVirtualNodePoolStatusList", request.addVirtualNodePoolStatusList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizType)) {
            body.put("BizType", request.bizType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            body.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTimeEnd)) {
            body.put("ExpiredTimeEnd", request.expiredTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTimeStart)) {
            body.put("ExpiredTimeStart", request.expiredTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceIp)) {
            body.put("NetworkInterfaceIp", request.networkInterfaceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.officeSiteId)) {
            body.put("OfficeSiteId", request.officeSiteId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverInstanceType)) {
            body.put("ServerInstanceType", request.serverInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            bodyFlat.put("Users", request.users);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.virtualNodePoolId)) {
            body.put("VirtualNodePoolId", request.virtualNodePoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerIdList)) {
            bodyFlat.put("WuyingServerIdList", request.wuyingServerIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerNameOrId)) {
            body.put("WuyingServerNameOrId", request.wuyingServerNameOrId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWuyingServerResponse());
    }

    /**
     * <b>description</b> :
     * <p>Retrieves a list of WUYING workstations.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of workstations.</p>
     * 
     * @param request ListWuyingServerRequest
     * @return ListWuyingServerResponse
     */
    public ListWuyingServerResponse listWuyingServer(ListWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of available zone IDs for the current Alibaba Cloud account based on the specified region, product type, and operating system type. A typical use case is to check which zones are available before creating a resource that requires a vSwitch, and then select a vSwitch in one of those zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListAppInstanceType</code> permission is required. If the permission is insufficient, the error code <code>Forbidden.NoPermission</code> is returned.</li>
     * <li><strong><code>ProductType</code>, <code>BizRegionId</code>, and <code>OsType</code> are all required.</strong> If any of these parameters is missing, empty, or set to an unrecognized value, the error code <code>InvalidParameter.ValueInvalid</code> is returned.</li>
     * <li><code>BizRegionId</code> must be a region ID supported by WUYING Cloud Application. Call <a href="~~ListRegions~~">ListRegions</a> first to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation with the region ID, target product type, and operating system type, and read the returned <code>ListZonesModel.Zones</code>.</li>
     * <li>When creating a resource that requires a vSwitch, select a vSwitch in one of the returned zones. For example, pass the corresponding vSwitch ID when calling <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned zone list is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching it for extended periods.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available zone IDs for a specified region, product type, and operating system type.</p>
     * 
     * @param request ListZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListZonesResponse
     */
    public ListZonesResponse listZonesWithOptions(ListZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZones"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZonesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Operation description</h2>
     * <p>This operation returns the list of available zone IDs for the current Alibaba Cloud account based on the specified region, product type, and operating system type. A typical use case is to check which zones are available before creating a resource that requires a vSwitch, and then select a vSwitch in one of those zones.
     * This operation only queries information. It does not create resources or incur fees.</p>
     * <h2>Before you begin</h2>
     * <ul>
     * <li>When calling this operation with a RAM user or STS credential, the <code>appstreaming:ListAppInstanceType</code> permission is required. If the permission is insufficient, the error code <code>Forbidden.NoPermission</code> is returned.</li>
     * <li><strong><code>ProductType</code>, <code>BizRegionId</code>, and <code>OsType</code> are all required.</strong> If any of these parameters is missing, empty, or set to an unrecognized value, the error code <code>InvalidParameter.ValueInvalid</code> is returned.</li>
     * <li><code>BizRegionId</code> must be a region ID supported by WUYING Cloud Application. Call <a href="~~ListRegions~~">ListRegions</a> first to obtain the supported region IDs.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListRegions~~">ListRegions</a> to obtain the supported region IDs.</li>
     * <li>Call this operation with the region ID, target product type, and operating system type, and read the returned <code>ListZonesModel.Zones</code>.</li>
     * <li>When creating a resource that requires a vSwitch, select a vSwitch in one of the returned zones. For example, pass the corresponding vSwitch ID when calling <a href="~~CreateAppInstanceGroup~~">CreateAppInstanceGroup</a> or <a href="~~CreateWuyingServer~~">CreateWuyingServer</a>.
     * The returned zone list is determined by the available resources in the current region and may change over time. Query the list in real time before creating resources instead of caching it for extended periods.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Queries the list of available zone IDs for a specified region, product type, and operating system type.</p>
     * 
     * @param request ListZonesRequest
     * @return ListZonesResponse
     */
    public ListZonesResponse listZones(ListZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have scheduled auto scaling enabled. The operation can be called only outside the scaling time periods specified in the scheduled auto scaling policy.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Logs off all sessions in a pay-as-you-go delivery group that has scheduled auto scaling enabled.</p>
     * 
     * @param request LogOffAllSessionsInAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    public LogOffAllSessionsInAppInstanceGroupResponse logOffAllSessionsInAppInstanceGroupWithOptions(LogOffAllSessionsInAppInstanceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LogOffAllSessionsInAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LogOffAllSessionsInAppInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation applies only to pay-as-you-go resource delivery groups that have scheduled auto scaling enabled. The operation can be called only outside the scaling time periods specified in the scheduled auto scaling policy.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Logs off all sessions in a pay-as-you-go delivery group that has scheduled auto scaling enabled.</p>
     * 
     * @param request LogOffAllSessionsInAppInstanceGroupRequest
     * @return LogOffAllSessionsInAppInstanceGroupResponse
     */
    public LogOffAllSessionsInAppInstanceGroupResponse logOffAllSessionsInAppInstanceGroup(LogOffAllSessionsInAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.logOffAllSessionsInAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the General Policy of a delivery group, including the number of concurrent sessions and the session retention duration after disconnection.</p>
     * 
     * @param tmpReq ModifyAppInstanceGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    public ModifyAppInstanceGroupAttributeResponse modifyAppInstanceGroupAttributeWithOptions(ModifyAppInstanceGroupAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppInstanceGroupAttributeShrinkRequest request = new ModifyAppInstanceGroupAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.securityPolicy)) {
            request.securityPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.securityPolicy, "SecurityPolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupName)) {
            query.put("AppInstanceGroupName", request.appInstanceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            query.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionTimeout)) {
            query.put("SessionTimeout", request.sessionTimeout);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.perSessionPerApp)) {
            body.put("PerSessionPerApp", request.perSessionPerApp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenAppId)) {
            body.put("PreOpenAppId", request.preOpenAppId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preOpenMode)) {
            body.put("PreOpenMode", request.preOpenMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityPolicyShrink)) {
            body.put("SecurityPolicy", request.securityPolicyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppInstanceGroupAttribute"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppInstanceGroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the General Policy of a delivery group, including the number of concurrent sessions and the session retention duration after disconnection.</p>
     * 
     * @param request ModifyAppInstanceGroupAttributeRequest
     * @return ModifyAppInstanceGroupAttributeResponse
     */
    public ModifyAppInstanceGroupAttributeResponse modifyAppInstanceGroupAttribute(ModifyAppInstanceGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppInstanceGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the display policy of a delivery group, including settings such as frame rate, resolution, and protocol type.</p>
     * 
     * @param tmpReq ModifyAppPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAppPolicyResponse
     */
    public ModifyAppPolicyResponse modifyAppPolicyWithOptions(ModifyAppPolicyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAppPolicyShrinkRequest request = new ModifyAppPolicyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.videoPolicy)) {
            request.videoPolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.videoPolicy, "VideoPolicy", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appPolicyId)) {
            query.put("AppPolicyId", request.appPolicyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.videoPolicyShrink)) {
            query.put("VideoPolicy", request.videoPolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAppPolicy"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAppPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the display policy of a delivery group, including settings such as frame rate, resolution, and protocol type.</p>
     * 
     * @param request ModifyAppPolicyRequest
     * @return ModifyAppPolicyResponse
     */
    public ModifyAppPolicyResponse modifyAppPolicy(ModifyAppPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAppPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * @param tmpReq ModifyBrowserInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBrowserInstanceGroupResponse
     */
    public ModifyBrowserInstanceGroupResponse modifyBrowserInstanceGroupWithOptions(ModifyBrowserInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyBrowserInstanceGroupShrinkRequest request = new ModifyBrowserInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.browserConfig)) {
            request.browserConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.browserConfig, "BrowserConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.network)) {
            request.networkShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.network, "Network", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.policy)) {
            request.policyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.policy, "Policy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.storagePolicy)) {
            request.storagePolicyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.storagePolicy, "StoragePolicy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.timers)) {
            request.timersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.timers, "Timers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.browserConfigShrink)) {
            query.put("BrowserConfig", request.browserConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.browserInstanceGroupId)) {
            query.put("BrowserInstanceGroupId", request.browserInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyShrink)) {
            query.put("Policy", request.policyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timersShrink)) {
            query.put("Timers", request.timersShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authNotificationEnabled)) {
            body.put("AuthNotificationEnabled", request.authNotificationEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudBrowserName)) {
            body.put("CloudBrowserName", request.cloudBrowserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxAmount)) {
            body.put("MaxAmount", request.maxAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkShrink)) {
            body.put("Network", request.networkShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storagePolicyShrink)) {
            body.put("StoragePolicy", request.storagePolicyShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBrowserInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBrowserInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the attributes of a Wuying Cloud Browser.</p>
     * 
     * @param request ModifyBrowserInstanceGroupRequest
     * @return ModifyBrowserInstanceGroupResponse
     */
    public ModifyBrowserInstanceGroupResponse modifyBrowserInstanceGroup(ModifyBrowserInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBrowserInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the number of nodes in a subscription delivery group.</p>
     * 
     * @param tmpReq ModifyNodePoolAmountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodePoolAmountResponse
     */
    public ModifyNodePoolAmountResponse modifyNodePoolAmountWithOptions(ModifyNodePoolAmountRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyNodePoolAmountShrinkRequest request = new ModifyNodePoolAmountShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePool)) {
            request.nodePoolShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePool, "NodePool", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolShrink)) {
            body.put("NodePool", request.nodePoolShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodePoolAmount"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodePoolAmountResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the number of nodes in a subscription delivery group.</p>
     * 
     * @param request ModifyNodePoolAmountRequest
     * @return ModifyNodePoolAmountResponse
     */
    public ModifyNodePoolAmountResponse modifyNodePoolAmount(ModifyNodePoolAmountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNodePoolAmountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can configure the elastic pattern for WUYING Cloud Application resources in Settings:</p>
     * <ul>
     * <li>Fixed quantity: Elastic scaling is not used.</li>
     * <li>Automatic scaling: Automatically scales resources based on the number of connected sessions and the duration without session connections.</li>
     * <li>Scheduled scaling: Executes resource scaling during specified time periods on specified dates.
     * Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing method and pricing</a> of WUYING Cloud Application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the elastic mode of a delivery group, including fixed quantity (no elastic scaling), scheduled scaling, and automatic scaling.</p>
     * 
     * @param tmpReq ModifyNodePoolAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNodePoolAttributeResponse
     */
    public ModifyNodePoolAttributeResponse modifyNodePoolAttributeWithOptions(ModifyNodePoolAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyNodePoolAttributeShrinkRequest request = new ModifyNodePoolAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.nodePoolStrategy)) {
            request.nodePoolStrategyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.nodePoolStrategy, "NodePoolStrategy", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            body.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeCapacity)) {
            body.put("NodeCapacity", request.nodeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodePoolStrategyShrink)) {
            body.put("NodePoolStrategy", request.nodePoolStrategyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.poolId)) {
            body.put("PoolId", request.poolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNodePoolAttribute"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNodePoolAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can configure the elastic pattern for WUYING Cloud Application resources in Settings:</p>
     * <ul>
     * <li>Fixed quantity: Elastic scaling is not used.</li>
     * <li>Automatic scaling: Automatically scales resources based on the number of connected sessions and the duration without session connections.</li>
     * <li>Scheduled scaling: Executes resource scaling during specified time periods on specified dates.
     * Before using this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing method and pricing</a> of WUYING Cloud Application.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the elastic mode of a delivery group, including fixed quantity (no elastic scaling), scheduled scaling, and automatic scaling.</p>
     * 
     * @param request ModifyNodePoolAttributeRequest
     * @return ModifyNodePoolAttributeResponse
     */
    public ModifyNodePoolAttributeResponse modifyNodePoolAttribute(ModifyNodePoolAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNodePoolAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the administrator account configuration, such as whether to enable resource expiration reminders.</p>
     * 
     * @param request ModifyTenantConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyTenantConfigResponse
     */
    public ModifyTenantConfigResponse modifyTenantConfigWithOptions(ModifyTenantConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupExpireRemind)) {
            body.put("AppInstanceGroupExpireRemind", request.appInstanceGroupExpireRemind);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyTenantConfig"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyTenantConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the administrator account configuration, such as whether to enable resource expiration reminders.</p>
     * 
     * @param request ModifyTenantConfigRequest
     * @return ModifyTenantConfigResponse
     */
    public ModifyTenantConfigResponse modifyTenantConfig(ModifyTenantConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyTenantConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the properties of a workstation.</p>
     * 
     * @param request ModifyWuyingServerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWuyingServerAttributeResponse
     */
    public ModifyWuyingServerAttributeResponse modifyWuyingServerAttributeWithOptions(ModifyWuyingServerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erdmaEnabled)) {
            body.put("ErdmaEnabled", request.erdmaEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerName)) {
            body.put("WuyingServerName", request.wuyingServerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWuyingServerAttribute"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWuyingServerAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the properties of a workstation.</p>
     * 
     * @param request ModifyWuyingServerAttributeRequest
     * @return ModifyWuyingServerAttributeResponse
     */
    public ModifyWuyingServerAttributeResponse modifyWuyingServerAttribute(ModifyWuyingServerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWuyingServerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the allocated users added to a delivery group by paging.</p>
     * 
     * @param request PageListAppInstanceGroupUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PageListAppInstanceGroupUserResponse
     */
    public PageListAppInstanceGroupUserResponse pageListAppInstanceGroupUserWithOptions(PageListAppInstanceGroupUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PageListAppInstanceGroupUser"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PageListAppInstanceGroupUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the allocated users added to a delivery group by paging.</p>
     * 
     * @param request PageListAppInstanceGroupUserRequest
     * @return PageListAppInstanceGroupUserResponse
     */
    public PageListAppInstanceGroupUserResponse pageListAppInstanceGroupUser(PageListAppInstanceGroupUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pageListAppInstanceGroupUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for resources that belong to Agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. These model groups serve as inference engines for Agents to execute tasks within the resource group.
     * When an Agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the Agent runtime setting.
     * When you remove the model group from the resource group to which an Agent runtime belongs, the model group configured on the Agent runtime itself automatically takes effect.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes model groups from a resource group.</p>
     * 
     * @param request RemoveResourceGroupModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveResourceGroupModelTemplateResponse
     */
    public RemoveResourceGroupModelTemplateResponse removeResourceGroupModelTemplateWithOptions(RemoveResourceGroupModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            body.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            body.put("ResourceGroupIds", request.resourceGroupIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveResourceGroupModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveResourceGroupModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can authorize model groups for resources that belong to Agent runtimes such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. These model groups serve as inference engines for Agents to execute tasks within the resource group.
     * When an Agent runtime has its own model group configured and the resource group it belongs to also has a model group configured, the model group bound to the resource group takes effect. The resource group setting has a higher priority than the Agent runtime setting.
     * When you remove the model group from the resource group to which an Agent runtime belongs, the model group configured on the Agent runtime itself automatically takes effect.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes model groups from a resource group.</p>
     * 
     * @param request RemoveResourceGroupModelTemplateRequest
     * @return RemoveResourceGroupModelTemplateResponse
     */
    public RemoveResourceGroupModelTemplateResponse removeResourceGroupModelTemplate(RemoveResourceGroupModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeResourceGroupModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove a specific third-party channel configuration from Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. After the removal, the Agent cannot use the third-party channel for conversations.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a third-party channel configuration from the Agent runtime.</p>
     * 
     * @param request RemoveRuntimeChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRuntimeChannelResponse
     */
    public RemoveRuntimeChannelResponse removeRuntimeChannelWithOptions(RemoveRuntimeChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentPlatform)) {
            body.put("AgentPlatform", request.agentPlatform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentProvider)) {
            body.put("AgentProvider", request.agentProvider);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeIds)) {
            body.put("RuntimeIds", request.runtimeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRuntimeChannel"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRuntimeChannelResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to remove a specific third-party channel configuration from Agents such as JVS Computer, OpenClaw, and Hermes Agent in the Wuying Agent Management Center. After the removal, the Agent cannot use the third-party channel for conversations.
     * Before calling this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a third-party channel configuration from the Agent runtime.</p>
     * 
     * @param request RemoveRuntimeChannelRequest
     * @return RemoveRuntimeChannelResponse
     */
    public RemoveRuntimeChannelResponse removeRuntimeChannel(RemoveRuntimeChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRuntimeChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can remove model groups from Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. When an Agent runtime resource needs to switch to a different model group, call this operation first to remove the authorization relationship between the Agent runtime resource and the existing model group.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a model group from an Agent runtime resource.</p>
     * 
     * @param request RemoveRuntimeModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveRuntimeModelTemplateResponse
     */
    public RemoveRuntimeModelTemplateResponse removeRuntimeModelTemplateWithOptions(RemoveRuntimeModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            body.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeIds)) {
            body.put("RuntimeIds", request.runtimeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeType)) {
            body.put("RuntimeType", request.runtimeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveRuntimeModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveRuntimeModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can remove model groups from Agent runtime resources such as JVS Computer, OpenClaw, and Hermes Agent in the WUYING Agent Management Center. When an Agent runtime resource needs to switch to a different model group, call this operation first to remove the authorization relationship between the Agent runtime resource and the existing model group.
     * Make sure that you are familiar with the operations and usage of the WUYING Agent Management Center before calling this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes a model group from an Agent runtime resource.</p>
     * 
     * @param request RemoveRuntimeModelTemplateRequest
     * @return RemoveRuntimeModelTemplateResponse
     */
    public RemoveRuntimeModelTemplateResponse removeRuntimeModelTemplate(RemoveRuntimeModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRuntimeModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING Workspace.</p>
     * <blockquote>
     * <p>Prerequisites:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state, and ChargeType must be set to PrePaid.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Renews a delivery group.</p>
     * 
     * @param tmpReq RenewAppInstanceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewAppInstanceGroupResponse
     */
    public RenewAppInstanceGroupResponse renewAppInstanceGroupWithOptions(RenewAppInstanceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RenewAppInstanceGroupShrinkRequest request = new RenewAppInstanceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.renewNodes)) {
            request.renewNodesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.renewNodes, "RenewNodes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            query.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewAmount)) {
            query.put("RenewAmount", request.renewAmount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewMode)) {
            query.put("RenewMode", request.renewMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewNodesShrink)) {
            query.put("RenewNodes", request.renewNodesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewAppInstanceGroup"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewAppInstanceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the <a href="https://help.aliyun.com/document_detail/426039.html">billing and pricing</a> of WUYING Workspace.</p>
     * <blockquote>
     * <p>Prerequisites:</p>
     * <ul>
     * <li>The delivery group must be in the PUBLISHED state, and ChargeType must be set to PrePaid.</li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Renews a delivery group.</p>
     * 
     * @param request RenewAppInstanceGroupRequest
     * @return RenewAppInstanceGroupResponse
     */
    public RenewAppInstanceGroupResponse renewAppInstanceGroup(RenewAppInstanceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewAppInstanceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a workstation.</p>
     * 
     * @param request RenewWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewWuyingServerResponse
     */
    public RenewWuyingServerResponse renewWuyingServerWithOptions(RenewWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            body.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            body.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            body.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.promotionId)) {
            body.put("PromotionId", request.promotionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewWuyingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a workstation.</p>
     * 
     * @param request RenewWuyingServerRequest
     * @return RenewWuyingServerResponse
     */
    public RenewWuyingServerResponse renewWuyingServer(RenewWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a workstation.</p>
     * 
     * @param request RestartWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartWuyingServerResponse
     */
    public RestartWuyingServerResponse restartWuyingServerWithOptions(RestartWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerIdList)) {
            bodyFlat.put("WuyingServerIdList", request.wuyingServerIdList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartWuyingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts a workstation.</p>
     * 
     * @param request RestartWuyingServerRequest
     * @return RestartWuyingServerResponse
     */
    public RestartWuyingServerResponse restartWuyingServer(RestartWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a task to copy an image to other regions.</p>
     * 
     * @param request StartTaskForDistributeImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartTaskForDistributeImageResponse
     */
    public StartTaskForDistributeImageResponse startTaskForDistributeImageWithOptions(StartTaskForDistributeImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionList)) {
            body.put("DestinationRegionList", request.destinationRegionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryType)) {
            body.put("RetryType", request.retryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegion)) {
            body.put("SourceRegion", request.sourceRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            body.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartTaskForDistributeImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartTaskForDistributeImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initiates a task to copy an image to other regions.</p>
     * 
     * @param request StartTaskForDistributeImageRequest
     * @return StartTaskForDistributeImageResponse
     */
    public StartTaskForDistributeImageResponse startTaskForDistributeImage(StartTaskForDistributeImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startTaskForDistributeImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a workstation.</p>
     * 
     * @param request StartWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartWuyingServerResponse
     */
    public StartWuyingServerResponse startWuyingServerWithOptions(StartWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerIdList)) {
            bodyFlat.put("WuyingServerIdList", request.wuyingServerIdList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartWuyingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a workstation.</p>
     * 
     * @param request StartWuyingServerRequest
     * @return StartWuyingServerResponse
     */
    public StartWuyingServerResponse startWuyingServer(StartWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a workstation.</p>
     * 
     * @param request StopWuyingServerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopWuyingServerResponse
     */
    public StopWuyingServerResponse stopWuyingServerWithOptions(StopWuyingServerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.force)) {
            body.put("Force", request.force);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerIdList)) {
            bodyFlat.put("WuyingServerIdList", request.wuyingServerIdList);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopWuyingServer"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopWuyingServerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops a workstation.</p>
     * 
     * @param request StopWuyingServerRequest
     * @return StopWuyingServerResponse
     */
    public StopWuyingServerResponse stopWuyingServer(StopWuyingServerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopWuyingServerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to cloud resources. For resources that already have the specified tags, updates the tag values.</p>
     * 
     * @param request TagCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagCloudResourcesResponse
     */
    public TagCloudResourcesResponse tagCloudResourcesWithOptions(TagCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagCloudResources"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and attaches tags to cloud resources. For resources that already have the specified tags, updates the tag values.</p>
     * 
     * @param request TagCloudResourcesRequest
     * @return TagCloudResourcesResponse
     */
    public TagCloudResourcesResponse tagCloudResources(TagCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you use a RAM user or Security Token Service (STS) credential to call this operation, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>In a single request, you can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length. A tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request must be unique. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>Each tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A maximum of 20 custom tags can be bound to a single resource. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails.</strong> The error code <code>InvalidAppInstanceGroup.NotFound</code> is returned, and no tags are bound to any resource.</li>
     * <li>If the binding succeeds, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>If multiple resources are specified and only some of them fail to be bound, the operation still returns a success response without failure details. Call <code>ListTagResources</code> to verify the binding results. If only one resource is specified and the binding fails, the operation returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the delivery groups to which you want to add tags.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code>, <code>ResourceId.N</code>, and <code>Tag.N.Key</code>/<code>Tag.N.Value</code>.</li>
     * <li>To view the tags bound to resources, call <code>ListTagResources</code>. To unbind tags, call <code>UntagResources</code>.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates and binds tags to specified China Office (Chinese: Wuying) delivery groups in compliance with Alibaba Cloud tag specifications. If a tag key already exists on a resource, the tag value is updated to the value specified in the current request. Currently, only delivery group (<code>APPINSTANCEGROUP</code>) resource types are supported.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2021-09-01"),
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
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When you use a RAM user or Security Token Service (STS) credential to call this operation, you must have the <code>appstreaming:TagResources</code> permission.
     * The resources to which you want to bind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs.</p>
     * <h2>Tag rules</h2>
     * <ul>
     * <li>In a single request, you can bind up to <strong>20 tags</strong> to up to <strong>50 resources</strong>. Duplicate resource IDs are automatically deduplicated.</li>
     * <li>A tag key must be 1 to 128 characters in length. A tag value must be 0 to 256 characters in length. Both are case-sensitive.</li>
     * <li>A tag key cannot start with <code>aliyun</code> or <code>acs:</code> (case-insensitive). Neither tag keys nor tag values can contain <code>http://</code> or <code>https://</code>.</li>
     * <li>Tag keys in the same request must be unique. Otherwise, the error code <code>InvalidTag.Duplicated</code> is returned.</li>
     * <li>Each tag key on a resource can correspond to only one tag value. If the tag key already exists on the resource, the tag value is updated to the new value.</li>
     * <li>A maximum of 20 custom tags can be bound to a single resource. If this limit is exceeded, the error code <code>ResourceTag.CustomTagCountExceed</code> is returned.</li>
     * </ul>
     * <h2>Results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails.</strong> The error code <code>InvalidAppInstanceGroup.NotFound</code> is returned, and no tags are bound to any resource.</li>
     * <li>If the binding succeeds, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>If multiple resources are specified and only some of them fail to be bound, the operation still returns a success response without failure details. Call <code>ListTagResources</code> to verify the binding results. If only one resource is specified and the binding fails, the operation returns the corresponding error code.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain the IDs of the delivery groups to which you want to add tags.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code>, <code>ResourceId.N</code>, and <code>Tag.N.Key</code>/<code>Tag.N.Value</code>.</li>
     * <li>To view the tags bound to resources, call <code>ListTagResources</code>. To unbind tags, call <code>UntagResources</code>.
     * The masked identifiers in the examples are used to demonstrate the format. Replace them with your actual identifiers when you call the operation.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Creates and binds tags to specified China Office (Chinese: Wuying) delivery groups in compliance with Alibaba Cloud tag specifications. If a tag key already exists on a resource, the tag value is updated to the value specified in the current request. Currently, only delivery group (<code>APPINSTANCEGROUP</code>) resource types are supported.</p>
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
     * <p>Unbinds secondary private IP addresses from a development host.</p>
     * 
     * @param request UnassignWuyingServerPrivateAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassignWuyingServerPrivateAddressesResponse
     */
    public UnassignWuyingServerPrivateAddressesResponse unassignWuyingServerPrivateAddressesWithOptions(UnassignWuyingServerPrivateAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddresses)) {
            body.put("PrivateIpAddresses", request.privateIpAddresses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignWuyingServerPrivateAddresses"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignWuyingServerPrivateAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds secondary private IP addresses from a development host.</p>
     * 
     * @param request UnassignWuyingServerPrivateAddressesRequest
     * @return UnassignWuyingServerPrivateAddressesResponse
     */
    public UnassignWuyingServerPrivateAddressesResponse unassignWuyingServerPrivateAddresses(UnassignWuyingServerPrivateAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignWuyingServerPrivateAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a user from a session.</p>
     * 
     * @param request UnbindRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindResponse
     */
    public UnbindResponse unbindWithOptions(UnbindRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            body.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceId)) {
            body.put("AppInstanceId", request.appInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstancePersistentId)) {
            body.put("AppInstancePersistentId", request.appInstancePersistentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endUserId)) {
            body.put("EndUserId", request.endUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Unbind"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds a user from a session.</p>
     * 
     * @param request UnbindRequest
     * @return UnbindResponse
     */
    public UnbindResponse unbind(UnbindRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds tags from cloud resources in a unified manner.</p>
     * 
     * @param request UntagCloudResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagCloudResourcesResponse
     */
    public UntagCloudResourcesResponse untagCloudResourcesWithOptions(UntagCloudResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            body.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeys)) {
            body.put("TagKeys", request.tagKeys);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagCloudResources"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagCloudResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds tags from cloud resources in a unified manner.</p>
     * 
     * @param request UntagCloudResourcesRequest
     * @return UntagCloudResourcesResponse
     */
    public UntagCloudResourcesResponse untagCloudResources(UntagCloudResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagCloudResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:UntagResources</code> permission is required.
     * The resources from which you want to unbind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can obtain delivery group IDs by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>, and query tags that are bound to a resource by calling <a href="~~ListTagResources~~">ListTagResources</a>.</p>
     * <h2>Parameter description</h2>
     * <ul>
     * <li>You can unbind tags from up to <strong>50 resources</strong> in a single request. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>Specify at least one of <code>TagKey.N</code> and <code>All</code>.</strong> If neither is specified, or if <code>TagKey.N</code> is not specified and <code>All</code> is set to <code>false</code>, the error code <code>InvalidParameter.TagKeyListOrAll</code> is returned.<ul>
     * <li>If <code>TagKey.N</code> is specified: only the tags that correspond to the specified tag keys are unbound. You can specify up to 20 tag keys at a time. The <code>All</code> parameter is ignored.</li>
     * <li>If <code>TagKey.N</code> is not specified and <code>All=true</code>: all custom tags on the resource are unbound, including Wuying system tags that start with <code>System/</code> and were attached by calling <a href="~~TagResources~~">TagResources</a>.</li>
     * </ul>
     * </li>
     * <li>If a specified tag key does not exist on the resource, the tag key is skipped and no error is returned.</li>
     * <li>Tag keys that start with <code>System/</code> are Wuying system tags. Only <code>System/Scheduler/GRAYSCALE</code> and <code>System/Scheduler/STOP_NEW_USER_CONNECTION</code> are supported. If you specify other tag keys that start with <code>System/</code>, the error code <code>InvalidTagPolicy.KeyInvalid</code> or <code>InvalidTag.SystemKeyNotAllow</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails</strong> with the error code <code>InvalidAppInstanceGroup.NotFound</code>, and no tags are unbound from any resource.</li>
     * <li>On success, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>When multiple resources are specified and only some fail to have tags unbound, the operation still returns success and the response does not contain failure details. Call <a href="~~ListTagResources~~">ListTagResources</a> to verify the unbinding results. When only one resource is specified and the unbinding fails, the operation returns the corresponding error code directly.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs. To check which tag keys are bound to a resource, call <a href="~~ListTagResources~~">ListTagResources</a>.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code> and <code>ResourceId.N</code>, and specify <code>TagKey.N</code> or <code>All=true</code> to indicate the tags to unbind.</li>
     * <li>To rebind tags, call <a href="~~TagResources~~">TagResources</a>.
     * The masked identifiers in the examples are for format demonstration purposes only. Replace them with your actual identifiers when making calls.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Unbinds tags from specified Wuying delivery groups in compliance with Alibaba Cloud tagging standards. You can unbind specific tags by tag key or unbind all custom tags from a resource at once by setting <code>All=true</code> without specifying tag keys. Currently, only the delivery group (<code>APPINSTANCEGROUP</code>) resource type is supported.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            body.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2021-09-01"),
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
     * <b>description</b> :
     * <h2>Before you begin</h2>
     * <p>When calling this operation with a RAM user or STS credential, the <code>appstreaming:UntagResources</code> permission is required.
     * The resources from which you want to unbind tags must belong to the current Alibaba Cloud account. <strong>This operation currently supports only delivery group resources.</strong> You can set <code>ResourceType</code> only to <code>APPINSTANCEGROUP</code>. You can obtain delivery group IDs by calling <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a>, and query tags that are bound to a resource by calling <a href="~~ListTagResources~~">ListTagResources</a>.</p>
     * <h2>Parameter description</h2>
     * <ul>
     * <li>You can unbind tags from up to <strong>50 resources</strong> in a single request. Duplicate resource IDs are automatically deduplicated.</li>
     * <li><strong>Specify at least one of <code>TagKey.N</code> and <code>All</code>.</strong> If neither is specified, or if <code>TagKey.N</code> is not specified and <code>All</code> is set to <code>false</code>, the error code <code>InvalidParameter.TagKeyListOrAll</code> is returned.<ul>
     * <li>If <code>TagKey.N</code> is specified: only the tags that correspond to the specified tag keys are unbound. You can specify up to 20 tag keys at a time. The <code>All</code> parameter is ignored.</li>
     * <li>If <code>TagKey.N</code> is not specified and <code>All=true</code>: all custom tags on the resource are unbound, including Wuying system tags that start with <code>System/</code> and were attached by calling <a href="~~TagResources~~">TagResources</a>.</li>
     * </ul>
     * </li>
     * <li>If a specified tag key does not exist on the resource, the tag key is skipped and no error is returned.</li>
     * <li>Tag keys that start with <code>System/</code> are Wuying system tags. Only <code>System/Scheduler/GRAYSCALE</code> and <code>System/Scheduler/STOP_NEW_USER_CONNECTION</code> are supported. If you specify other tag keys that start with <code>System/</code>, the error code <code>InvalidTagPolicy.KeyInvalid</code> or <code>InvalidTag.SystemKeyNotAllow</code> is returned.</li>
     * </ul>
     * <h2>Execution results</h2>
     * <ul>
     * <li><strong>If any specified delivery group does not exist or does not belong to the current account, the entire request fails</strong> with the error code <code>InvalidAppInstanceGroup.NotFound</code>, and no tags are unbound from any resource.</li>
     * <li>On success, the response contains only <code>RequestId</code> and does not return tag details.</li>
     * <li>When multiple resources are specified and only some fail to have tags unbound, the operation still returns success and the response does not contain failure details. Call <a href="~~ListTagResources~~">ListTagResources</a> to verify the unbinding results. When only one resource is specified and the unbinding fails, the operation returns the corresponding error code directly.</li>
     * </ul>
     * <h2>Call sequence</h2>
     * <ol>
     * <li>Call <a href="~~ListAppInstanceGroup~~">ListAppInstanceGroup</a> to obtain delivery group IDs. To check which tag keys are bound to a resource, call <a href="~~ListTagResources~~">ListTagResources</a>.</li>
     * <li>Call this operation with <code>ResourceType=APPINSTANCEGROUP</code> and <code>ResourceId.N</code>, and specify <code>TagKey.N</code> or <code>All=true</code> to indicate the tags to unbind.</li>
     * <li>To rebind tags, call <a href="~~TagResources~~">TagResources</a>.
     * The masked identifiers in the examples are for format demonstration purposes only. Replace them with your actual identifiers when making calls.</li>
     * </ol>
     * 
     * <b>summary</b> : 
     * <p>Unbinds tags from specified Wuying delivery groups in compliance with Alibaba Cloud tagging standards. You can unbind specific tags by tag key or unbind all custom tags from a resource at once by setting <code>All=true</code> without specifying tag keys. Currently, only the delivery group (<code>APPINSTANCEGROUP</code>) resource type is supported.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After the image update starts, sessions of end users who are accessing cloud applications will be disconnected. Proceed with caution to avoid data loss for end users.
     * Before calling this API, the delivery group must be in the PUBLISHED, DEPLOYED, or MAINTAIN_FAILED state. You can call GetAppInstanceGroup to query the current state of the delivery group.
     * After the update is published, you typically need to wait about 2 minutes for the changes to take effect on the client.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the image of a delivery group.</p>
     * 
     * @param request UpdateAppInstanceGroupImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAppInstanceGroupImageResponse
     */
    public UpdateAppInstanceGroupImageResponse updateAppInstanceGroupImageWithOptions(UpdateAppInstanceGroupImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appCenterImageId)) {
            query.put("AppCenterImageId", request.appCenterImageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appInstanceGroupId)) {
            query.put("AppInstanceGroupId", request.appInstanceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bizRegionId)) {
            query.put("BizRegionId", request.bizRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            query.put("ProductType", request.productType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAppInstanceGroupImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAppInstanceGroupImageResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Warning: After the image update starts, sessions of end users who are accessing cloud applications will be disconnected. Proceed with caution to avoid data loss for end users.
     * Before calling this API, the delivery group must be in the PUBLISHED, DEPLOYED, or MAINTAIN_FAILED state. You can call GetAppInstanceGroup to query the current state of the delivery group.
     * After the update is published, you typically need to wait about 2 minutes for the changes to take effect on the client.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Updates the image of a delivery group.</p>
     * 
     * @param request UpdateAppInstanceGroupImageRequest
     * @return UpdateAppInstanceGroupImageResponse
     */
    public UpdateAppInstanceGroupImageResponse updateAppInstanceGroupImage(UpdateAppInstanceGroupImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppInstanceGroupImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can update a model provider template that has been created in the WUYING Agent Management Center, including the template name, description, model service connection configuration, and WUYING security proxy switch. Partial field updates are supported. You only need to pass in the fields that you want to modify.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model provider template.</p>
     * 
     * @param tmpReq UpdateModelProviderTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelProviderTemplateResponse
     */
    public UpdateModelProviderTemplateResponse updateModelProviderTemplateWithOptions(UpdateModelProviderTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateModelProviderTemplateShrinkRequest request = new UpdateModelProviderTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configShrink)) {
            query.put("Config", request.configShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableWuyingProxy)) {
            body.put("EnableWuyingProxy", request.enableWuyingProxy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.providerTemplateId)) {
            body.put("ProviderTemplateId", request.providerTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelProviderTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelProviderTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can update a model provider template that has been created in the WUYING Agent Management Center, including the template name, description, model service connection configuration, and WUYING security proxy switch. Partial field updates are supported. You only need to pass in the fields that you want to modify.
     * Before using this operation, make sure that you are familiar with the operations and usage of the WUYING Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model provider template.</p>
     * 
     * @param request UpdateModelProviderTemplateRequest
     * @return UpdateModelProviderTemplateResponse
     */
    public UpdateModelProviderTemplateResponse updateModelProviderTemplate(UpdateModelProviderTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelProviderTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can update a model group that has been created in the Wuying Agent Management Center, including the group name, description, and model configuration information. You can modify the default model of a model group by updating the Config field. The updated configuration automatically takes effect on associated cloud desktops.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model template.</p>
     * 
     * @param request UpdateModelTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateModelTemplateResponse
     */
    public UpdateModelTemplateResponse updateModelTemplateWithOptions(UpdateModelTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modelTemplateId)) {
            query.put("ModelTemplateId", request.modelTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.refScope)) {
            query.put("RefScope", request.refScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateModelTemplate"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateModelTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can update a model group that has been created in the Wuying Agent Management Center, including the group name, description, and model configuration information. You can modify the default model of a model group by updating the Config field. The updated configuration automatically takes effect on associated cloud desktops.
     * Before you call this operation, make sure that you are familiar with the operations and usage of the Wuying Agent Management Center.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a model template.</p>
     * 
     * @param request UpdateModelTemplateRequest
     * @return UpdateModelTemplateResponse
     */
    public UpdateModelTemplateResponse updateModelTemplate(UpdateModelTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateModelTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workstation image.</p>
     * 
     * @param request UpdateWuyingServerImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWuyingServerImageResponse
     */
    public UpdateWuyingServerImageResponse updateWuyingServerImageWithOptions(UpdateWuyingServerImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productType)) {
            body.put("ProductType", request.productType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wuyingServerId)) {
            body.put("WuyingServerId", request.wuyingServerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWuyingServerImage"),
            new TeaPair("version", "2021-09-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWuyingServerImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a workstation image.</p>
     * 
     * @param request UpdateWuyingServerImageRequest
     * @return UpdateWuyingServerImageResponse
     */
    public UpdateWuyingServerImageResponse updateWuyingServerImage(UpdateWuyingServerImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWuyingServerImageWithOptions(request, runtime);
    }
}
